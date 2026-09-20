# -*- coding: utf-8 -*-
"""E3 + E4 (TSE revision): over-editing ratio and complexity-stratified pass@1 with paired CIs.

Definitions
  reference edit  = char Levenshtein(buggy.strip(), developer_fix.strip()) from the MORepair
                    `defects4j/dataset/<bug>.json` files (the `fix` field of result copies is
                    overwritten by the generation script, so the dataset copy is required)
  over-editing ratio (per plausible candidate) = Levenshtein(buggy, candidate) / reference edit
                    reported as median and ratio-of-sums; the mean is unusable because 13.5% of
                    faults have a reference edit of <=10 characters
  strata          = reference diff lines (strip-normalized unified diff, n=0) binned 1-2 / 3-5 /
                    6-10 / >10, and single- vs multi-region (number of @@ hunks)
  pass@1          = plausible candidates / stored candidates per fault, averaged over 371 faults
  CI              = fault-level paired bootstrap (10,000 resamples) of the pass@1 difference,
                    two-sided bootstrap p

Usage:
  pip install rapidfuzz
  python scripts/tse_rev_overedit_and_strata.py --dataset <MORepair>/defects4j/dataset \
      --trio "DS-Coder-6.7B=<base_dir>,<sft_dir>,<paft_dir>" [--trio ...] \
      --set "Base=<dir>" --set "SFT=<dir>" [--set ...]
Each <dir> is a Defects4J results directory containing fixed0/*.json.result.
"""
import argparse
import difflib
import glob
import json
import os
import random
import statistics as st

from rapidfuzz.distance import Levenshtein

BINS = ["1-2", "3-5", "6-10", ">10"]


def line_bin(n):
    return "1-2" if n <= 2 else "3-5" if n <= 5 else "6-10" if n <= 10 else ">10"


def load_reference(dataset_dir):
    ref = {}
    for f in glob.glob(os.path.join(dataset_dir, "*.json")):
        j = json.loads(open(f, encoding="utf-8", errors="replace").read())
        b = os.path.basename(f)[:-5]
        bl = [l.strip() for l in j["buggy"].splitlines()]
        xl = [l.strip() for l in j["fix"].splitlines()]
        d = list(difflib.unified_diff(bl, xl, n=0, lineterm=""))
        lines = sum(1 for l in d if l[:1] in "+-" and not l.startswith(("+++", "---")))
        regions = sum(1 for l in d if l.startswith("@@"))
        ref[b] = (lines, regions, Levenshtein.distance(j["buggy"].strip(), j["fix"].strip()))
    return ref


def load_results(d, ref):
    per = {}
    for rp in glob.glob(os.path.join(d, "fixed0", "*.json.result")):
        bug = os.path.basename(rp)[:-len(".json.result")]
        if bug not in ref:
            continue
        try:
            rows = json.loads(open(rp, encoding="utf-8", errors="replace").read())
        except Exception:
            continue
        if not isinstance(rows, list) or not rows:
            continue
        buggy = json.loads(open(rp[:-len(".result")], encoding="utf-8", errors="replace").read())["buggy"].strip()
        pl = [q for q in rows if q.get("patch_status") == "PLAUSIBLE"]
        nums = [Levenshtein.distance(buggy, (q.get("patch_code") or "").strip()) for q in pl]
        per[bug] = (len(pl) / len(rows), nums)
    return per


def boot(a, b, bugs, iters=10000, seed=7):
    rng = random.Random(seed)
    deltas = [(a.get(x, (0, []))[0] - b.get(x, (0, []))[0]) * 100 for x in bugs]
    n = len(deltas)
    means = sorted(sum(deltas[rng.randrange(n)] for _ in range(n)) / n for _ in range(iters))
    p = min(1.0, 2 * min(sum(m <= 0 for m in means), sum(m >= 0 for m in means)) / iters)
    return sum(deltas) / n, means[int(0.025 * iters)], means[int(0.975 * iters)], p


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--dataset", required=True)
    ap.add_argument("--trio", action="append", default=[], help="NAME=base_dir,sft_dir,paft_dir")
    ap.add_argument("--set", action="append", default=[], help="LABEL=dir (for the over-editing table)")
    a = ap.parse_args()
    ref = load_reference(a.dataset)
    strata = {k: [b for b, v in ref.items() if line_bin(v[0]) == k] for k in BINS}
    strata["single"] = [b for b, v in ref.items() if v[1] == 1]
    strata["multi"] = [b for b, v in ref.items() if v[1] >= 2]
    strata["<=5 lines"] = [b for b, v in ref.items() if v[0] <= 5]
    strata["all"] = list(ref)
    print("fault counts:", {k: len(v) for k, v in strata.items()})

    for spec in a.trio:
        name, dirs = spec.split("=", 1)
        bd, sd, pd = dirs.split(",")
        data = {"Base": load_results(bd, ref), "SFT": load_results(sd, ref), "PAFT": load_results(pd, ref)}
        print(f"\n=== {name}: pass@1 (%) / median over-editing ratio per stratum ===")
        print("| stratum | n | Base | SFT | PAFT |\n|---|---:|---:|---:|---:|")
        for lab in BINS + ["single", "multi", "all"]:
            bugs = strata[lab]
            cells = []
            for k in ("Base", "SFT", "PAFT"):
                per = data[k]
                p1 = sum(per[b][0] for b in bugs if b in per) / len(bugs) * 100
                rs = [n / ref[b][2] for b in bugs if b in per for n in per[b][1]]
                cells.append(f"{p1:.2f} / {st.median(rs):.2f}" if rs else f"{p1:.2f} / -")
            print(f"| {lab} | {len(bugs)} | " + " | ".join(cells) + " |")
        print(f"\n{name}: paired bootstrap of pass@1 deltas (pp), 10k resamples")
        print("| stratum | n | PAFT-SFT [95% CI] p | PAFT-Base [95% CI] p |\n|---|---:|---|---|")
        for lab in ("multi", "<=5 lines", ">10", "all"):
            bugs = strata[lab]
            m1, lo1, hi1, p1 = boot(data["PAFT"], data["SFT"], bugs)
            m2, lo2, hi2, p2 = boot(data["PAFT"], data["Base"], bugs)
            print(f"| {lab} | {len(bugs)} | {m1:+.2f} [{lo1:+.2f}, {hi1:+.2f}] p={p1:.3f} | "
                  f"{m2:+.2f} [{lo2:+.2f}, {hi2:+.2f}] p={p2:.3f} |")

    if a.set:
        print("\n=== over-editing ratio over plausible candidates ===")
        print("| setting | plausible | median | ratio of sums | share <=1 | share >10 |\n|---|---:|---:|---:|---:|---:|")
        for spec in a.set:
            lab, d = spec.rsplit("=", 1)
            per = load_results(d, ref)
            rs = sorted(n / ref[b][2] for b, (_, nums) in per.items() for n in nums)
            if not rs:
                print(f"| {lab} | 0 | - | - | - | - |")
                continue
            sn = sum(n for _, (_, nums) in per.items() for n in nums)
            sd = sum(ref[b][2] for b, (_, nums) in per.items() for _ in nums)
            k = len(rs)
            print(f"| {lab} | {k} | {rs[k // 2]:.2f} | {sn / sd:.2f} | {sum(r <= 1 for r in rs) / k * 100:.0f}% | "
                  f"{sum(r > 10 for r in rs) / k * 100:.0f}% |")


if __name__ == "__main__":
    main()
