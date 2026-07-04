#!/usr/bin/env python3
"""Audit Defects4J generated patch files for output-format failures.

This is a cheap preflight before expensive Defects4J validation. It checks
whether generated `fix` fields look like Java method/body code rather than
repair explanations.
"""

from __future__ import annotations

import argparse
import csv
import json
from pathlib import Path
import re
import statistics
import sys
from typing import Any


JAVA_LIKE_START_RE = re.compile(
    r"^\s*(?:@[\w.]+(?:\([^)]*\))?\s*)*"
    r"(?:public|protected|private|static|final|synchronized|abstract|"
    r"if|for|while|switch|try|catch|return|throw|this\.|super\.|new\b|"
    r"[A-Za-z_$][\w$<>.,\[\] ?]*\s+[A-Za-z_$][\w$]*\s*(?:=|\(|;|\+\+|--)|"
    r"[A-Za-z_$][\w$]*\s*(?:=|\.|\(|\+\+|--|;))",
    re.DOTALL,
)
PROSE_MARKERS = (
    "Tobefixed",
    "ApplyTheseChanges",
    "Apply these changes",
    "The fix is",
    "Here is",
    "This patch",
    "To fix",
)
DIFF_LIKE_RE = re.compile(r"^\s*[-+]\s*\S", re.MULTILINE)


def norm_no_space(text: str) -> str:
    return "".join(str(text or "").split())


def read_json(path: Path) -> Any:
    with path.open("r", encoding="utf-8") as handle:
        return json.load(handle)


def is_prose_like(text: str) -> bool:
    if is_diff_like(text):
        return False
    head = text[:800]
    if any(marker in head for marker in PROSE_MARKERS):
        return True
    stripped = text.lstrip()
    if stripped.startswith(("#", "- ", "* ")):
        return True
    if re.match(r"^(To fix|The issue|This code|We need|You should)\b", stripped):
        return True
    return False


def is_diff_like(text: str) -> bool:
    return bool(DIFF_LIKE_RE.search(text))


def is_java_like(text: str) -> bool:
    stripped = text.strip()
    if not stripped or is_prose_like(stripped):
        return False
    if not JAVA_LIKE_START_RE.search(stripped):
        return False
    return any(token in stripped for token in (";", "{", "}", "return", "if", "for", "while"))


def audit_model(root: Path, model: str, fixed: str) -> dict[str, Any]:
    files = sorted((root / model / fixed).glob("*.json"))
    java_like = 0
    prose_like = 0
    diff_like = 0
    empty = 0
    no_op = 0
    lengths: list[int] = []
    examples: list[str] = []

    for path in files:
        data = read_json(path)
        fix = str(data.get("fix") or "").strip()
        buggy = str(data.get("buggy") or "").strip()
        lengths.append(len(fix))
        if not fix:
            empty += 1
        if norm_no_space(fix) == norm_no_space(buggy):
            no_op += 1
        if is_java_like(fix):
            java_like += 1
        if is_diff_like(fix):
            diff_like += 1
        if is_prose_like(fix):
            prose_like += 1
            if len(examples) < 3:
                examples.append(f"{path.name}: {fix[:180].replace(chr(10), ' ')}")

    total = len(files)
    return {
        "model": model,
        "fixed": fixed,
        "files": total,
        "java_like": java_like,
        "java_like_pct": java_like / total * 100 if total else 0.0,
        "prose_like": prose_like,
        "prose_like_pct": prose_like / total * 100 if total else 0.0,
        "diff_like": diff_like,
        "diff_like_pct": diff_like / total * 100 if total else 0.0,
        "empty": empty,
        "no_op": no_op,
        "median_fix_len": statistics.median(lengths) if lengths else 0,
        "examples": examples,
    }


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument(
        "--root",
        default="/home/barty/research/prorepair/defects4j/results",
        help="Defects4J results root containing model/fixedN directories.",
    )
    parser.add_argument("--fixed", default="fixed0")
    parser.add_argument("--models", nargs="+", required=True)
    parser.add_argument("--csv")
    parser.add_argument(
        "--min-files",
        type=int,
        default=0,
        help="Fail if any model has fewer generated JSON files than this.",
    )
    parser.add_argument(
        "--min-java-like-pct",
        type=float,
        default=0.0,
        help="Fail if any model has a lower Java-like percentage.",
    )
    parser.add_argument(
        "--max-prose-like-pct",
        type=float,
        default=100.0,
        help="Fail if any model has a higher prose-like percentage.",
    )
    args = parser.parse_args()

    rows = [audit_model(Path(args.root), model, args.fixed) for model in args.models]
    failures: list[str] = []
    for row in rows:
        print(
            f"{row['model']}/{row['fixed']}: files={row['files']}, "
            f"java_like={row['java_like_pct']:.1f}%, "
            f"prose_like={row['prose_like_pct']:.1f}%, "
            f"diff_like={row['diff_like_pct']:.1f}%, "
            f"empty={row['empty']}, no_op={row['no_op']}, "
            f"median_fix_len={row['median_fix_len']:.0f}"
        )
        for example in row["examples"]:
            print(f"  prose_sample: {example}")
        if row["files"] < args.min_files:
            failures.append(
                f"{row['model']}/{row['fixed']} has {row['files']} files; expected >= {args.min_files}"
            )
        if row["java_like_pct"] < args.min_java_like_pct:
            failures.append(
                f"{row['model']}/{row['fixed']} java_like={row['java_like_pct']:.1f}%; "
                f"expected >= {args.min_java_like_pct:.1f}%"
            )
        if row["prose_like_pct"] > args.max_prose_like_pct:
            failures.append(
                f"{row['model']}/{row['fixed']} prose_like={row['prose_like_pct']:.1f}%; "
                f"expected <= {args.max_prose_like_pct:.1f}%"
            )

    if args.csv:
        out = Path(args.csv)
        out.parent.mkdir(parents=True, exist_ok=True)
        fieldnames = [
            "model",
            "fixed",
            "files",
            "java_like",
            "java_like_pct",
            "prose_like",
            "prose_like_pct",
            "diff_like",
            "diff_like_pct",
            "empty",
            "no_op",
            "median_fix_len",
        ]
        with out.open("w", encoding="utf-8", newline="") as handle:
            writer = csv.DictWriter(handle, fieldnames=fieldnames)
            writer.writeheader()
            for row in rows:
                writer.writerow({key: row[key] for key in fieldnames})

    if failures:
        print("D4J output-format check failed:", file=sys.stderr)
        for failure in failures:
            print(f"- {failure}", file=sys.stderr)
        sys.exit(1)


if __name__ == "__main__":
    main()
