#!/usr/bin/env python3
"""E2 (TSE major revision, Reviewer 1 comment 2): QuixBugs-Python at n = 10.

Reviewer 1 asks for the QuixBugs-Python transfer result to be re-run with
``n = 10`` (it was ``n = 5``) and reported with paired bootstrap confidence
intervals. This script consumes the artifacts that
``scripts/run_quixbugs_python.py`` already writes, so it needs no GPU:

  <out-dir>/<model>/eval_n10.json           per-task, per-candidate pass flags
  <out-dir>/<model>/generations_n10.jsonl   candidate code
  <bench-dir>/python_programs/*.py          buggy programs
  <bench-dir>/correct_python_programs/*.py  developer fixes (reference repairs)

It reports, for each requested pair (PAFT vs SFT, PAFT vs BASE):

  * pass@1 (mean over the 40 tasks of passing candidates / n) and the
    task-level paired bootstrap CI of the difference (10,000 resamples);
    pass@5 and pass@10 are reported the same way when n allows
  * exact McNemar test on solved / not-solved tasks
  * common-solved-subset AED and CCR (first passing candidate per task)
  * over-editing ratio = Levenshtein(buggy, candidate) / Levenshtein(buggy, developer fix)
    over all passing candidates: median, ratio of sums, share <= 1, share > 10.
    This is the same dimensionless metric used for Defects4J in
    ``scripts/tse_rev_overedit_and_strata.py`` and gives the cross-benchmark
    comparison Reviewer 1 asks for.

Usage
-----
  pip install rapidfuzz            # optional; a pure-Python fallback is built in
  python scripts/e2_quixbugs_paired_ci.py \\
      --out-dir analysis_outputs/quixbugs_python_ds67_n10 \\
      --bench-dir data/QuixBugs \\
      --base deepseek-6.7b --sft deepseek-6.7b-trained-noprompt \\
      --paft deepseek-6.7b-trained-prorepair \\
      --md analysis_outputs/tse_revision_e2_quixbugs_n10.md
"""

from __future__ import annotations

import argparse
import difflib
import json
import math
import random
import statistics as st
from pathlib import Path

try:  # fast path
    from rapidfuzz.distance import Levenshtein as _RF

    def lev(a: str, b: str) -> int:
        return int(_RF.distance(a, b))

except Exception:  # pure-Python fallback, fine for 40 short programs

    def lev(a: str, b: str) -> int:
        if a == b:
            return 0
        if len(a) < len(b):
            a, b = b, a
        prev = list(range(len(b) + 1))
        for i, ca in enumerate(a, 1):
            cur = [i]
            for j, cb in enumerate(b, 1):
                cur.append(min(prev[j] + 1, cur[j - 1] + 1, prev[j - 1] + (ca != cb)))
            prev = cur
        return prev[-1]


def ccr(a: str, b: str) -> float:
    """Same definition as scripts/run_quixbugs_python.py: matching lines / patch lines."""
    a_lines, b_lines = a.strip().splitlines(), b.strip().splitlines()
    if not b_lines:
        return 0.0
    matcher = difflib.SequenceMatcher(None, a_lines, b_lines)
    preserved = sum(block.size for block in matcher.get_matching_blocks()[:-1])
    return preserved / len(b_lines) * 100


def load_reference(bench_dir: Path) -> dict[str, dict[str, str]]:
    ref: dict[str, dict[str, str]] = {}
    for buggy_path in sorted((bench_dir / "python_programs").glob("*.py")):
        if buggy_path.name == "node.py" or buggy_path.name.endswith("_test.py"):
            continue
        fixed_path = bench_dir / "correct_python_programs" / buggy_path.name
        test_path = bench_dir / "python_testcases" / f"test_{buggy_path.name}"
        if not (fixed_path.exists() and test_path.exists()):
            continue
        ref[buggy_path.stem] = {
            "buggy": buggy_path.read_text(encoding="utf-8"),
            "fixed": fixed_path.read_text(encoding="utf-8"),
        }
    return ref


def load_model(out_dir: Path, model: str, n: int) -> dict[str, dict]:
    eval_path = out_dir / model / f"eval_n{n}.json"
    gen_path = out_dir / model / f"generations_n{n}.jsonl"
    if not eval_path.exists():
        raise FileNotFoundError(f"missing {eval_path} (run the harness with --n-samples {n} first)")
    blob = json.loads(eval_path.read_text(encoding="utf-8"))
    summary = blob.get("summary", {})

    candidates: dict[str, list[str]] = {}
    if gen_path.exists():
        with gen_path.open("r", encoding="utf-8") as fh:
            for line in fh:
                if line.strip():
                    rec = json.loads(line)
                    candidates[rec["task_id"]] = [
                        item.get("candidate", "") for item in rec.get("candidates", [])
                    ]

    tasks: dict[str, dict] = {}
    for row in blob.get("details", []):
        tid = row["task_id"]
        results = row.get("results", [])
        n_used = len(results) if results else n
        passed_idx = [r["index"] for r in results if r.get("passed")]
        tasks[tid] = {
            "correct": row.get("correct", len(passed_idx)),
            "n_used": n_used,
            "passed_idx": passed_idx,
            "cands": candidates.get(tid, []),
        }
    return {"summary": summary, "tasks": tasks}


def rate(model: dict, tid: str) -> float:
    t = model["tasks"][tid]
    return t["correct"] / t["n_used"] if t["n_used"] else 0.0


def pass_at_k(n_used: int, correct: int, k: int) -> float:
    """Unbiased pass@k estimator over one task's k stored candidates."""
    if n_used <= 0:
        return 0.0
    k = min(k, n_used)
    if n_used - correct < k:
        return 1.0
    return 1.0 - math.comb(n_used - correct, k) / math.comb(n_used, k)


def rate_k(model: dict, tid: str, k: int = 1) -> float:
    """Per-task pass@k; k = 1 reproduces the harness's pass@1 estimate."""
    t = model["tasks"][tid]
    return pass_at_k(t["n_used"], t["correct"], k)


def boot_paired(a: dict, b: dict, tasks: list[str], iters: int, seed: int, k: int = 1) -> tuple[float, float, float, float]:
    """Paired task-level bootstrap of mean(rate_a - rate_b), plus two-sided p."""
    rng = random.Random(seed)
    deltas = [(rate_k(a, t, k) - rate_k(b, t, k)) * 100 for t in tasks]
    n = len(deltas)
    means = sorted(sum(deltas[rng.randrange(n)] for _ in range(n)) / n for _ in range(iters))
    p = min(1.0, 2 * min(sum(m <= 0 for m in means), sum(m >= 0 for m in means)) / iters)
    return sum(deltas) / n, means[int(0.025 * iters)], means[int(0.975 * iters)], p


def mcnemar_exact(a: dict, b: dict, tasks: list[str]) -> tuple[int, int, float]:
    """Exact two-sided McNemar on solved / not-solved (no scipy dependency)."""
    b_only = sum(1 for t in tasks if rate(a, t) > 0 and rate(b, t) == 0)
    a_only = sum(1 for t in tasks if rate(b, t) > 0 and rate(a, t) == 0)
    m = a_only + b_only
    if m == 0:
        return a_only, b_only, 1.0
    tail = sum(math.comb(m, k) for k in range(min(a_only, b_only) + 1)) / (2 ** m)
    return a_only, b_only, min(1.0, 2 * tail)


def first_passing_code(model: dict, tid: str) -> str | None:
    t = model["tasks"][tid]
    if not t["passed_idx"]:
        return None
    idx = min(t["passed_idx"])
    return t["cands"][idx] if idx < len(t["cands"]) else None


def edit_stats(model: dict, ref: dict, tasks: list[str]) -> dict | None:
    aeds, ccrs = [], []
    for tid in tasks:
        code = first_passing_code(model, tid)
        if code is None or tid not in ref:
            continue
        aeds.append(lev(ref[tid]["buggy"].strip(), code.strip()))
        ccrs.append(ccr(ref[tid]["buggy"], code))
    if not aeds:
        return None
    return {
        "n": len(aeds),
        "aed_mean": st.mean(aeds),
        "aed_median": st.median(aeds),
        "ccr_mean": st.mean(ccrs),
        "ccr_median": st.median(ccrs),
    }


def overedit_ratio_faithful(model: dict, ref: dict) -> dict | None:
    """Ratio of sums computed on raw distances (not on per-candidate ratios)."""
    num = den = 0
    ratios: list[float] = []
    for tid, t in model["tasks"].items():
        if tid not in ref:
            continue
        d = lev(ref[tid]["buggy"].strip(), ref[tid]["fixed"].strip())
        if d <= 0:
            continue
        for idx in t["passed_idx"]:
            if idx >= len(t["cands"]) or not t["cands"][idx].strip():
                continue
            v = lev(ref[tid]["buggy"].strip(), t["cands"][idx].strip())
            num += v
            den += d
            ratios.append(v / d)
    if not ratios:
        return None
    ratios.sort()
    k = len(ratios)
    return {
        "n": k,
        "median": ratios[k // 2],
        "ratio_of_sums": num / den,
        "share_le_1": sum(r <= 1 for r in ratios) / k * 100,
        "share_gt_10": sum(r > 10 for r in ratios) / k * 100,
    }


def main() -> None:
    ap = argparse.ArgumentParser(description=__doc__, formatter_class=argparse.RawDescriptionHelpFormatter)
    ap.add_argument("--out-dir", required=True, type=Path)
    ap.add_argument("--bench-dir", default=Path("data/QuixBugs"), type=Path)
    ap.add_argument("--base", required=True)
    ap.add_argument("--sft", default=None,
                    help="optional; omit to compare PAFT against BASE only "
                         "(used when the original SFT checkpoint is unavailable)")
    ap.add_argument("--paft", required=True)
    ap.add_argument("--n", type=int, default=10)
    ap.add_argument("--iters", type=int, default=10000)
    ap.add_argument("--seed", type=int, default=7106)
    ap.add_argument("--md", type=Path, default=None)
    args = ap.parse_args()

    ref = load_reference(args.bench_dir)
    models = {"Base": load_model(args.out_dir, args.base, args.n)}
    if args.sft:
        models["SFT"] = load_model(args.out_dir, args.sft, args.n)
    models["PAFT"] = load_model(args.out_dir, args.paft, args.n)
    comparisons = [("PAFT", "Base")]
    if args.sft:
        comparisons = [("PAFT", "SFT"), ("PAFT", "Base"), ("SFT", "Base")]
    tasks = sorted(ref)
    missing = [t for t in tasks if any(t not in m["tasks"] for m in models.values())]
    tasks = [t for t in tasks if t not in missing]

    lines: list[str] = []

    def emit(text: str = "") -> None:
        print(text)
        lines.append(text)

    emit(f"# QuixBugs-Python, n = {args.n} (tasks = {len(tasks)}"
         + (f", {len(missing)} skipped: no results)" if missing else ")"))
    emit()
    emit("## pass@1 (%)")
    emit()
    emit("| setting | pass@1 | resolved tasks | plausible candidates |")
    emit("|---|---:|---:|---:|")
    for name, m in models.items():
        s = m["summary"]
        emit(f"| {name} | {st.mean(rate(m, t) * 100 for t in tasks):.2f} | "
             f"{s.get('resolved_tasks', '-')} | {s.get('plausible_candidates', '-')} |")
    emit()
    emit("## Paired task-level bootstrap (10,000 resamples) of the pass@1 difference")
    emit()
    emit("| comparison | delta (pp) | 95% CI | p |")
    emit("|---|---:|---|---:|")
    for a, b in comparisons:
        mean, lo, hi, p = boot_paired(models[a], models[b], tasks, args.iters, args.seed)
        emit(f"| {a} - {b} | {mean:+.2f} | [{lo:+.2f}, {hi:+.2f}] | {p:.4f} |")
    emit()
    for k in (5, 10):
        if k > args.n:
            continue
        emit(f"## pass@{k} (%) and paired task-level bootstrap of the difference")
        emit()
        emit(f"| setting | pass@{k} |")
        emit("|---|---:|")
        for name, m in models.items():
            emit(f"| {name} | {st.mean(rate_k(m, t, k) * 100 for t in tasks):.2f} |")
        emit()
        emit("| comparison | delta (pp) | 95% CI | p |")
        emit("|---|---:|---|---:|")
        for a, b in comparisons:
            mean, lo, hi, p = boot_paired(models[a], models[b], tasks, args.iters, args.seed, k)
            emit(f"| {a} - {b} | {mean:+.2f} | [{lo:+.2f}, {hi:+.2f}] | {p:.4f} |")
        emit()
    emit("## Exact McNemar on solved / not-solved tasks")
    emit()
    emit("| comparison | solved only by first | solved only by second | p |")
    emit("|---|---:|---:|---:|")
    for a, b in comparisons:
        only_a, only_b, p = mcnemar_exact(models[a], models[b], tasks)
        emit(f"| {a} vs {b} | {only_a} | {only_b} | {p:.4f} |")
    emit()
    emit("## Common-solved-subset AED / CCR (first passing candidate per task)")
    emit()
    for a, b in [c for c in comparisons if "PAFT" in c]:
        common = [t for t in tasks if rate(models[a], t) > 0 and rate(models[b], t) > 0]
        emit(f"**{a}+{b}** ({len(common)} common tasks)")
        emit()
        emit("| setting | AED mean | AED median | CCR mean | CCR median |")
        emit("|---|---:|---:|---:|---:|")
        for name in (a, b):
            s = edit_stats(models[name], ref, common)
            emit(f"| {name} | {s['aed_mean']:.2f} | {s['aed_median']:.2f} | "
                 f"{s['ccr_mean']:.2f} | {s['ccr_median']:.2f} |" if s else f"| {name} | - | - | - | - |")
        emit()
    emit("## Over-editing ratio vs the developer fix (all passing candidates)")
    emit()
    emit("| setting | plausible | median | ratio of sums | share <= 1 | share > 10 |")
    emit("|---|---:|---:|---:|---:|---:|")
    for name, m in models.items():
        r = overedit_ratio_faithful(m, ref)
        if not r:
            emit(f"| {name} | 0 | - | - | - | - |")
            continue
        emit(f"| {name} | {r['n']} | {r['median']:.2f} | {r['ratio_of_sums']:.2f} | "
             f"{r['share_le_1']:.0f}% | {r['share_gt_10']:.0f}% |")

    if args.md:
        args.md.parent.mkdir(parents=True, exist_ok=True)
        args.md.write_text("\n".join(lines) + "\n", encoding="utf-8")
        print(f"\nwrote {args.md}")


if __name__ == "__main__":
    main()
