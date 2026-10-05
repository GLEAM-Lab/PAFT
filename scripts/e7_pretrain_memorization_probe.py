#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""E7 (TSE major revision): backbone pretraining-memorisation probe.

Reviewer 1, comment 6: the manuscript's leakage analysis only checks the
overlap between TutorLLMCode and the evaluation sets; it does not address
whether the *backbone* saw Defects4J developer fixes during pretraining.

This script probes that question behaviourally with the *base* backbone (no
fine-tuning, no adapter).  Two probes are run, each on the canonical text and
on a renamed counterfactual in which every user-defined identifier is
consistently renamed (the same mapping is applied to the buggy and the fixed
text, so the edit structure is unchanged):

  repair : the paper's repair prompt (buggy function only).  The model has to
           produce the fix itself; we then measure how much of its output is
           verbatim identical to the developer fix.
  prefix : the first half of the developer-fixed function is given as a code
           prefix; we measure how much of the held-out second half the model
           reproduces verbatim.

If the base model memorised the dataset, the canonical condition should
reproduce the held-out text much more often than the renamed one.  If it is
merely a strong code model, the two conditions should be close.

Outputs
  <out>.jsonl : one record per (fault, probe, condition)
  <out>.md    : aggregate table + fault-level paired bootstrap

Usage
  python scripts/e7_pretrain_memorization_probe.py \
      --model models/deepseek-coder-6.7b-instruct \
      --dataset defects4j/dataset \
      --out analysis_outputs/tse_revision_e7_leak_dscoder67b.md \
      --limit 100 --probe both --condition both

Notes
  * Greedy decoding (temperature 0) keeps the probe deterministic.
  * The renaming is a heuristic: Java keywords and a small JDK allow-list are
    kept so that the counterfactual stays compilable-looking, everything else
    is renamed consistently.  This is documented in the output report.
  * The mismatch between canonical and renamed is the leakage signal; the
    absolute verbatim rate alone is not, because template code can be
    reproduced from ordinary language modelling.
"""

from __future__ import annotations

import argparse
import difflib
import json
import random
import re
import statistics as st
from pathlib import Path

try:
    from rapidfuzz.distance import Levenshtein

    def lev(a: str, b: str) -> int:
        return Levenshtein.distance(a, b)
except Exception:  # pragma: no cover - fallback for machines without rapidfuzz

    def lev(a: str, b: str) -> int:
        if a == b:
            return 0
        prev = list(range(len(b) + 1))
        for i, ca in enumerate(a, 1):
            cur = [i]
            for j, cb in enumerate(b, 1):
                cur.append(min(prev[j] + 1, cur[j - 1] + 1, prev[j - 1] + (ca != cb)))
            prev = cur
        return prev[-1]


# --------------------------------------------------------------------------- #
# prompt scaffolding (matches prorepair/defects4j.py + fast_d4j_generate_vllm)
# --------------------------------------------------------------------------- #

PROMPT_BOF = (
    "You are an AI programming assistant, utilizing the DeepSeek Coder model, "
    "developed by DeepSeek Company, and you only answer questions related to "
    "computer science. For politically sensitive questions, security and "
    "privacy issues, and other non-computer science questions, you will refuse "
    "to answer.\n### Instruction:\n"
)
PROMPT_EOF = "\n### Response:\n"


def repair_prompt(t: dict) -> str:
    return (
        PROMPT_BOF
        + "\n# "
        + (t.get("issue_title") or "")
        + "\n"
        + (t.get("issue_description") or "")
        + "\nThis is an incorrect Java code ("
        + (t.get("loc") or "")
        + "):\n```java\n"
        + t["buggy"]
        + "\n```\nYou are a software engineer. Can you repair the incorrect Java code?\n"
        + PROMPT_EOF
        + "\n```java\n"
    )


def prefix_prompt(t: dict, prefix: str) -> str:
    return (
        PROMPT_BOF
        + "\n# "
        + (t.get("issue_title") or "")
        + "\n"
        + (t.get("issue_description") or "")
        + "\nThis is the corrected Java code ("
        + (t.get("loc") or "")
        + "). Continue it from where it stops; output only the remaining code.\n"
        + PROMPT_EOF
        + "\n```java\n"
        + prefix
        + "\n"
    )


# --------------------------------------------------------------------------- #
# renamed counterfactual
# --------------------------------------------------------------------------- #

JAVA_KEYWORDS = set(
    """abstract assert boolean break byte case catch char class const continue
    default do double else enum extends final finally float for goto if
    implements import instanceof int interface long native new package private
    protected public return short static strictfp super switch synchronized
    this throw throws transient try void volatile while var record yield sealed
    permits true false null""".split()
)

JDK_KEEP = set(
    """String StringBuilder StringBuffer Object Integer Long Double Float
    Boolean Character Byte Short Number Math System Arrays Collections List
    ArrayList LinkedList Map HashMap LinkedHashMap TreeMap Set HashSet
    LinkedHashSet Iterator Iterable Optional Stream Comparator Comparable
    Runnable Thread Exception RuntimeException IllegalArgumentException
    IllegalStateException NullPointerException UnsupportedOperationException
    IndexOutOfBoundsException NumberFormatException IOException File FileReader
    FileWriter BufferedReader BufferedWriter PrintWriter Scanner Random Date
    Calendar SimpleDateFormat Objects Class Method Field LocalDate LocalDateTime
    Instant Duration Period BigDecimal BigInteger Override Deprecated""".split()
)

TOKEN_RE = re.compile(
    r"(?P<keep>//[^\n]*|/\*.*?\*/|\"(?:\\.|[^\"\\])*\"|'(?:\\.|[^'\\])*')"
    r"|(?P<ident>[A-Za-z_$][A-Za-z0-9_$]*)",
    re.DOTALL,
)


def build_rename_map(text: str) -> dict:
    """Consistent mapping for every user-defined identifier in *text*."""
    mapping: dict = {}
    used = set(re.findall(r"[A-Za-z_$][A-Za-z0-9_$]*", text))
    counter = 0
    for m in TOKEN_RE.finditer(text):
        if m.lastgroup != "ident":
            continue
        tok = m.group(0)
        if tok in JAVA_KEYWORDS or tok in JDK_KEEP or len(tok) < 2:
            continue
        if re.fullmatch(r"q\d+", tok):
            continue
        if tok not in mapping:
            counter += 1
            name = f"q{counter}"
            while name in used:
                counter += 1
                name = f"q{counter}"
            mapping[tok] = name
    return mapping


def apply_rename(text: str, mapping: dict) -> str:
    def repl(m):
        if m.lastgroup != "ident":
            return m.group(0)
        return mapping.get(m.group(0), m.group(0))

    return TOKEN_RE.sub(repl, text)


def renamed_pair(buggy: str, fix: str):
    mapping = build_rename_map(buggy + "\n" + fix)
    return apply_rename(buggy, mapping), apply_rename(fix, mapping), mapping


# --------------------------------------------------------------------------- #
# metrics
# --------------------------------------------------------------------------- #

def normalize_ws(s: str) -> str:
    return re.sub(r"\s+", " ", s).strip()


def tokenize(code: str):
    return re.findall(r"[A-Za-z_$][A-Za-z0-9_$]*|\d+|[^\sA-Za-z0-9_$]", code)


def lcp_len(a, b) -> int:
    n = 0
    for x, y in zip(a, b):
        if x != y:
            break
        n += 1
    return n


def clean_lines(s: str):
    return [l.strip() for l in s.splitlines() if l.strip()]


def strip_code_fence(text: str) -> str:
    t = text.strip()
    t = re.sub(r"^```[A-Za-z0-9_+-]*\s*\n?", "", t)
    t = re.sub(r"\n?```\s*$", "", t)
    return t.strip("\n")


def line_overlap(ref_text: str, gen_text: str):
    rl, gl = clean_lines(ref_text), clean_lines(gen_text)
    if not rl:
        return 0.0, 0
    sm = difflib.SequenceMatcher(None, rl, gl, autojunk=False)
    matched = 0
    longest = 0
    for b in sm.get_matching_blocks():
        matched += b.size
        longest = max(longest, b.size)
    return matched / len(rl), longest


def compute_metrics(ref_text: str, gen_text: str) -> dict:
    ref_t, gen_t = tokenize(ref_text), tokenize(gen_text)
    lcp = lcp_len(ref_t, gen_t)
    matched_frac, longest_run = line_overlap(ref_text, gen_text)
    return {
        "ref_tokens": len(ref_t),
        "gen_tokens": len(gen_t),
        "lcp_tokens": lcp,
        "lcp_frac": (lcp / len(ref_t)) if ref_t else 0.0,
        "matched_line_frac": matched_frac,
        "longest_line_run": longest_run,
        "edit_sim": 1.0 - lev(ref_text, gen_text) / max(len(ref_text), len(gen_text), 1),
        "exact_match": int(normalize_ws(ref_text) == normalize_ws(gen_text)),
    }


# --------------------------------------------------------------------------- #
# task loading / sampling
# --------------------------------------------------------------------------- #

def load_tasks(dataset_dir: Path):
    tasks = []
    for f in sorted(dataset_dir.glob("*.json")):
        try:
            d = json.loads(f.read_text(encoding="utf-8", errors="replace"))
        except Exception:
            continue
        if not d.get("buggy") or not d.get("fix"):
            continue
        tasks.append(
            {
                "id": f.stem,
                "project": f.stem.split("-")[0],
                "buggy": d["buggy"],
                "fix": d["fix"],
                "issue_title": d.get("issue_title", ""),
                "issue_description": d.get("issue_description", ""),
                "loc": d.get("loc", ""),
            }
        )
    return tasks


def stratified_sample(tasks, limit: int, seed: int):
    if limit <= 0 or limit >= len(tasks):
        return list(tasks)
    rng = random.Random(seed)
    by_proj: dict = {}
    for t in tasks:
        by_proj.setdefault(t["project"], []).append(t)
    for v in by_proj.values():
        rng.shuffle(v)
    names = sorted(by_proj)
    out, i = [], 0
    while len(out) < limit:
        added = False
        for name in names:
            if i < len(by_proj[name]):
                out.append(by_proj[name][i])
                added = True
                if len(out) >= limit:
                    break
        if not added:
            break
        i += 1
    return out


def split_prefix_suffix(fix: str, frac: float):
    lines = fix.splitlines()
    if len(lines) < 6:
        return None
    k = int(round(len(lines) * frac))
    k = max(2, min(len(lines) - 2, k))
    return "\n".join(lines[:k]), "\n".join(lines[k:])


# --------------------------------------------------------------------------- #
# statistics
# --------------------------------------------------------------------------- #

def paired_bootstrap(a: dict, b: dict, keys, iters: int = 10000, seed: int = 7):
    """Paired bootstrap of mean(a[k] - b[k]) over the shared keys."""
    deltas = [a[k] - b[k] for k in keys]
    n = len(deltas)
    if n == 0:
        return 0.0, 0.0, 0.0, 1.0
    rng = random.Random(seed)
    means = sorted(sum(deltas[rng.randrange(n)] for _ in range(n)) / n for _ in range(iters))
    p = min(1.0, 2 * min(sum(m <= 0 for m in means), sum(m >= 0 for m in means)) / iters)
    return sum(deltas) / n, means[int(0.025 * iters)], means[int(0.975 * iters)], p


# --------------------------------------------------------------------------- #
# main
# --------------------------------------------------------------------------- #

def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--model", required=True, help="path to the *base* backbone")
    ap.add_argument("--model-label", default="", help="label used in the report")
    ap.add_argument("--dataset", default="defects4j/dataset")
    ap.add_argument("--out", default="analysis_outputs/tse_revision_e7_leak.md")
    ap.add_argument("--probe", choices=["repair", "prefix", "both"], default="both")
    ap.add_argument("--condition", choices=["canonical", "renamed", "both"], default="both")
    ap.add_argument("--limit", type=int, default=100, help="0 = all faults")
    ap.add_argument("--seed", type=int, default=20261004)
    ap.add_argument("--prefix-frac", type=float, default=0.5)
    ap.add_argument("--max-tokens", type=int, default=512)
    ap.add_argument("--gpu-memory-utilization", type=float, default=0.85)
    ap.add_argument("--tensor-parallel-size", type=int, default=1)
    ap.add_argument("--batch-size", type=int, default=64)
    ap.add_argument("--iters", type=int, default=10000)
    args = ap.parse_args()

    import os

    os.environ.setdefault("VLLM_USE_V1", "0")
    from vllm import LLM, SamplingParams

    dataset_dir = Path(args.dataset)
    tasks = stratified_sample(load_tasks(dataset_dir), args.limit, args.seed)
    if not tasks:
        raise SystemExit(f"no tasks found under {dataset_dir}")

    probes = ["repair", "prefix"] if args.probe == "both" else [args.probe]
    conditions = ["canonical", "renamed"] if args.condition == "both" else [args.condition]

    jobs = []  # (task_id, probe, condition, prompt, ref_text)
    skipped = 0
    for t in tasks:
        canon = {"buggy": t["buggy"], "fix": t["fix"], **t}
        buggy_r, fix_r, _ = renamed_pair(t["buggy"], t["fix"])
        rena = {**canon, "buggy": buggy_r, "fix": fix_r}
        for cond, variant in (("canonical", canon), ("renamed", rena)):
            if cond not in conditions:
                continue
            for probe in probes:
                if probe == "repair":
                    jobs.append((t["id"], probe, cond, repair_prompt(variant), variant["fix"]))
                else:
                    split = split_prefix_suffix(variant["fix"], args.prefix_frac)
                    if split is None:
                        skipped += 1
                        continue
                    prefix, suffix = split
                    jobs.append((t["id"], probe, cond, prefix_prompt(variant, prefix), suffix))

    print(f"[e7] tasks={len(tasks)} jobs={len(jobs)} skipped_prefix={skipped}")

    llm = LLM(
        model=args.model,
        dtype="bfloat16",
        max_model_len=4096,
        gpu_memory_utilization=args.gpu_memory_utilization,
        tensor_parallel_size=args.tensor_parallel_size,
        trust_remote_code=True,
        enforce_eager=True,
    )
    sp = SamplingParams(temperature=0.0, top_p=1.0, max_tokens=args.max_tokens, n=1)

    records = []
    for start in range(0, len(jobs), args.batch_size):
        chunk = jobs[start : start + args.batch_size]
        outs = llm.generate([j[3] for j in chunk], sp)
        for (tid, probe, cond, _prompt, ref_text), out in zip(chunk, outs):
            raw = out.outputs[0].text
            gen = strip_code_fence(raw)
            m = compute_metrics(ref_text, gen)
            records.append(
                {
                    "id": tid,
                    "probe": probe,
                    "condition": cond,
                    "ref_text": ref_text,
                    "generation": gen,
                    "raw_generation": raw,
                    **m,
                }
            )
        print(f"[e7] generated {min(start + args.batch_size, len(jobs))}/{len(jobs)}")

    out_path = Path(args.out)
    out_path.parent.mkdir(parents=True, exist_ok=True)
    jsonl_path = out_path.with_suffix(".jsonl")
    with jsonl_path.open("w", encoding="utf-8") as fh:
        for r in records:
            fh.write(json.dumps(r, ensure_ascii=False) + "\n")

    label = args.model_label or Path(args.model).name
    lines = []
    lines.append("# E7: backbone pretraining-memorisation probe")
    lines.append("")
    lines.append(f"**Base model**: `{args.model}` ({label})")
    lines.append(
        f"**Faults**: {len(tasks)} "
        f"({'all' if args.limit <= 0 else f'stratified sample of {args.limit}'}, seed {args.seed})"
    )
    lines.append(
        "**Probes**: repair = paper repair prompt over the buggy function; "
        f"prefix = first {args.prefix_frac:.0%} of the developer fix given as a code prefix."
    )
    lines.append(
        "**Control**: every user-defined identifier is consistently renamed "
        "(Java keywords and a small JDK allow-list are kept) in both the buggy and the fixed text."
    )
    lines.append("")
    lines.append("> Leakage signal = canonical reproduces the held-out text much better than the renamed control.")
    lines.append("")
    lines.append("## Aggregate metrics")
    lines.append("")
    lines.append(
        "| probe | condition | n | mean LCP frac | exact match | mean matched-line frac | "
        "longest run >= 5 lines | mean edit sim |"
    )
    lines.append("|---|---|---:|---:|---:|---:|---:|---:|")

    per = {}
    for probe in probes:
        for cond in conditions:
            rs = [r for r in records if r["probe"] == probe and r["condition"] == cond]
            per[(probe, cond)] = {r["id"]: r for r in rs}
            if not rs:
                continue
            mean_lcp = st.mean(r["lcp_frac"] for r in rs)
            exact = st.mean(r["exact_match"] for r in rs)
            matched = st.mean(r["matched_line_frac"] for r in rs)
            longrun = st.mean(1 if r["longest_line_run"] >= 5 else 0 for r in rs)
            edit = st.mean(r["edit_sim"] for r in rs)
            lines.append(
                f"| {probe} | {cond} | {len(rs)} | {mean_lcp:.3f} | {exact:.1%} | "
                f"{matched:.3f} | {longrun:.1%} | {edit:.3f} |"
            )

    lines.append("")
    lines.append("## Paired bootstrap, canonical - renamed (fault-level, 10k resamples)")
    lines.append("")
    lines.append("| probe | metric | n | delta [95% CI] | p |")
    lines.append("|---|---|---:|---|---:|")
    for probe in probes:
        if "canonical" not in conditions or "renamed" not in conditions:
            continue
        a, b = per.get((probe, "canonical"), {}), per.get((probe, "renamed"), {})
        keys = sorted(set(a) & set(b))
        for metric, name in (("lcp_frac", "LCP frac"), ("matched_line_frac", "matched-line frac")):
            av = {k: a[k][metric] for k in keys}
            bv = {k: b[k][metric] for k in keys}
            m, lo, hi, p = paired_bootstrap(av, bv, keys, args.iters)
            lines.append(f"| {probe} | {name} | {len(keys)} | {m:+.3f} [{lo:+.3f}, {hi:+.3f}] | {p:.3f} |")

    lines.append("")
    lines.append("## Reading")
    lines.append("")
    lines.append(
        "* A large, significant canonical-minus-renamed gap on `prefix` is the "
        "strongest evidence of exact memorisation; a near-zero gap means the "
        "backbone is behaving like a general code model rather than a lookup table."
    )
    lines.append(
        "* `repair` is reported for completeness but is the weaker probe: its "
        "canonical-minus-renamed gap also absorbs the fact that renamed code is "
        "simply harder to model, so only the `prefix` probe should be used to "
        "argue about leakage."
    )
    lines.append(
        "* The absolute verbatim rate alone is not a leakage signal: boilerplate "
        "and library calls can be reproduced from ordinary language modelling, "
        "which is exactly what the renamed control absorbs."
    )
    lines.append(
        "* Because PAFT and SFT share the same base backbone, any residual "
        "familiarity of the base model with Defects4J affects both fine-tuned "
        "settings equally and cannot explain PAFT's gains over SFT."
    )
    lines.append("")
    lines.append(f"Per-fault generations: `{jsonl_path}`")
    lines.append("")

    out_path.write_text("\n".join(lines), encoding="utf-8")
    print(f"[e7] wrote {out_path}")
    print(f"[e7] wrote {jsonl_path}")


if __name__ == "__main__":
    main()
