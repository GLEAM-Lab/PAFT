#!/usr/bin/env python3
"""Check train/eval lexical near-duplicate leakage with token n-gram Jaccard."""

from __future__ import annotations

import argparse
import csv
import json
import re
from dataclasses import dataclass
from pathlib import Path


CODE_FENCE_RE = re.compile(r"```[A-Za-z0-9_+#.-]*\s*\n(.*?)```", re.DOTALL)
TOKEN_RE = re.compile(r"[A-Za-z_][A-Za-z_0-9]*|\d+|==|!=|<=|>=|&&|\|\||[^\s]")
LINE_COMMENT_RE = re.compile(r"//.*?$", re.MULTILINE)
BLOCK_COMMENT_RE = re.compile(r"/\*.*?\*/", re.DOTALL)


@dataclass(frozen=True)
class Snippet:
    source: str
    side: str
    snippet_id: str
    text: str
    grams: frozenset[tuple[str, ...]]


def strip_comments(text: str) -> str:
    text = BLOCK_COMMENT_RE.sub(" ", text)
    text = LINE_COMMENT_RE.sub(" ", text)
    return text


def tokenize(text: str) -> list[str]:
    return TOKEN_RE.findall(strip_comments(text).lower())


def ngrams(tokens: list[str], n: int) -> frozenset[tuple[str, ...]]:
    if len(tokens) < n:
        return frozenset()
    return frozenset(tuple(tokens[i : i + n]) for i in range(len(tokens) - n + 1))


def make_snippet(source: str, side: str, snippet_id: str, text: str, n: int) -> Snippet | None:
    text = (text or "").strip()
    if not text:
        return None
    grams = ngrams(tokenize(text), n)
    if not grams:
        return None
    return Snippet(source=source, side=side, snippet_id=snippet_id, text=text, grams=grams)


def load_train_snippets(paths: list[Path], n: int) -> list[Snippet]:
    snippets: list[Snippet] = []
    seen: set[tuple[str, str]] = set()
    for path in paths:
        records = json.loads(path.read_text(encoding="utf-8"))
        if not isinstance(records, list):
            raise ValueError(f"Expected list in {path}")
        for idx, record in enumerate(records):
            text = record.get("text", "") if isinstance(record, dict) else ""
            blocks = CODE_FENCE_RE.findall(text)
            for block_idx, block in enumerate(blocks):
                side = "train_code"
                if block_idx == 0:
                    side = "train_buggy"
                elif block_idx == len(blocks) - 1:
                    side = "train_fixed"
                snip = make_snippet(str(path), side, f"{path.name}:{idx}:{block_idx}", block, n)
                if snip is None:
                    continue
                key = (side, " ".join(tokenize(block)))
                if key in seen:
                    continue
                seen.add(key)
                snippets.append(snip)
    return snippets


def load_eval_snippets(dataset_dir: Path, n: int) -> list[Snippet]:
    snippets: list[Snippet] = []
    for path in sorted(dataset_dir.glob("*.json")):
        obj = json.loads(path.read_text(encoding="utf-8"))
        bug_id = path.stem
        for side, key in [("eval_buggy", "buggy"), ("eval_fixed", "fix")]:
            snip = make_snippet(str(path), side, bug_id, obj.get(key, ""), n)
            if snip is not None:
                snippets.append(snip)
    return snippets


def jaccard(a: frozenset[tuple[str, ...]], b: frozenset[tuple[str, ...]]) -> float:
    if not a or not b:
        return 0.0
    inter = len(a & b)
    if inter == 0:
        return 0.0
    return inter / len(a | b)


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("--train", nargs="+", type=Path, required=True)
    parser.add_argument("--eval-dir", type=Path, required=True)
    parser.add_argument("--n", type=int, default=5)
    parser.add_argument("--top-k", type=int, default=50)
    parser.add_argument("--threshold", type=float, default=0.60)
    parser.add_argument("--out-csv", type=Path, required=True)
    parser.add_argument("--out-md", type=Path, required=True)
    args = parser.parse_args()

    train = load_train_snippets(args.train, args.n)
    evals = load_eval_snippets(args.eval_dir, args.n)

    top: list[tuple[float, Snippet, Snippet, int, int, int]] = []
    above_threshold = 0
    for e in evals:
        for t in train:
            score = jaccard(e.grams, t.grams)
            if score >= args.threshold:
                above_threshold += 1
            if len(top) < args.top_k or score > top[-1][0]:
                inter = len(e.grams & t.grams)
                union = len(e.grams | t.grams)
                top.append((score, e, t, inter, len(e.grams), len(t.grams)))
                top.sort(key=lambda row: row[0], reverse=True)
                top = top[: args.top_k]

    args.out_csv.parent.mkdir(parents=True, exist_ok=True)
    with args.out_csv.open("w", newline="", encoding="utf-8") as f:
        writer = csv.writer(f)
        writer.writerow(
            [
                "rank",
                "jaccard",
                "eval_id",
                "eval_side",
                "eval_source",
                "train_id",
                "train_side",
                "train_source",
                "intersection_ngrams",
                "eval_ngrams",
                "train_ngrams",
            ]
        )
        for rank, (score, e, t, inter, e_len, t_len) in enumerate(top, start=1):
            writer.writerow(
                [
                    rank,
                    f"{score:.6f}",
                    e.snippet_id,
                    e.side,
                    e.source,
                    t.snippet_id,
                    t.side,
                    t.source,
                    inter,
                    e_len,
                    t_len,
                ]
            )

    max_score = top[0][0] if top else 0.0
    lines = [
        "# Near-Duplicate Leakage Check\n\n",
        f"- Train snippets: {len(train)}\n",
        f"- Evaluation snippets: {len(evals)}\n",
        f"- Token n-gram size: {args.n}\n",
        f"- Max Jaccard: {max_score:.6f}\n",
        f"- Pairs above threshold {args.threshold:.2f}: {above_threshold}\n",
        f"- Top-k CSV: `{args.out_csv}`\n\n",
        "| rank | Jaccard | eval | eval side | train | train side |\n",
        "|---:|---:|---|---|---|---|\n",
    ]
    for rank, (score, e, t, *_rest) in enumerate(top[:10], start=1):
        lines.append(
            f"| {rank} | {score:.6f} | {e.snippet_id} | {e.side} | {t.snippet_id} | {t.side} |\n"
        )
    args.out_md.write_text("".join(lines), encoding="utf-8")
    print(args.out_md)
    print(args.out_csv)


if __name__ == "__main__":
    main()
