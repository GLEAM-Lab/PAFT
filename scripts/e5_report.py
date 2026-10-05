#!/usr/bin/env python3
"""E5 report: pass@1 / AED / CCR / over-editing ratio for prompt-variant runs.

Standalone script for the E5 experiment. It reads the Defects4J results directories
produced by test_d4j.py (fixed0/<bug>.json.result plus fixed0/<bug>.json) and the
developer references from defects4j/dataset/*.json, and prints a markdown table.

Metric definitions follow the repository's own scripts:
  AED = character Levenshtein distance between stripped buggy and candidate code
  CCR = fraction of candidate lines that match the buggy lines (SequenceMatcher)
  over-editing ratio = Levenshtein(buggy, candidate) / Levenshtein(buggy, developer fix)
  pass@1 = mean over faults of (plausible candidates / stored candidates)
"""

from __future__ import annotations

import argparse
import difflib
import glob
import json
import os
import statistics as st

try:
    from rapidfuzz.distance import Levenshtein as _RFLevenshtein
except Exception:  # pragma: no cover
    _RFLevenshtein = None


def edit_distance(a: str, b: str) -> int:
    a = (a or "").strip()
    b = (b or "").strip()
    if not a or not b:
        return 0
    if _RFLevenshtein is not None:
        return int(_RFLevenshtein.distance(a, b))
    if len(a) < len(b):
        a, b = b, a
    prev = list(range(len(b) + 1))
    for i, ca in enumerate(a, 1):
        curr = [i]
        for j, cb in enumerate(b, 1):
            curr.append(min(prev[j] + 1, curr[j - 1] + 1, prev[j - 1] + (ca != cb)))
        prev = curr
    return prev[-1]


def ccr_percent(buggy: str, patch: str) -> float:
    bl = (buggy or "").strip().splitlines()
    pl = (patch or "").strip().splitlines()
    if not pl:
        return 0.0
    m = difflib.SequenceMatcher(None, bl, pl)
    pres = sum(b.size for b in m.get_matching_blocks()[:-1])
    return pres / len(pl) * 100


def load_reference(dataset_dir: str):
    ref = {}
    for f in glob.glob(os.path.join(dataset_dir, "*.json")):
        j = json.loads(open(f, encoding="utf-8", errors="replace").read())
        bug = os.path.basename(f)[:-5]
        bl = [l.strip() for l in j["buggy"].splitlines()]
        xl = [l.strip() for l in j["fix"].splitlines()]
        d = list(difflib.unified_diff(bl, xl, n=0, lineterm=""))
        lines = sum(1 for l in d if l[:1] in "+-" and not l.startswith(("+++", "---")))
        regions = sum(1 for l in d if l.startswith("@@"))
        ref[bug] = {
            "ref_edit": edit_distance(j["buggy"], j["fix"]),
            "lines": lines,
            "regions": regions,
        }
    return ref


def analyse(results_dir: str, ref: dict):
    aeds, ccrs, ratios, noop = [], [], [], 0
    total_plausible = total_candidates = 0
    cand_edit_sum = ref_edit_sum = 0
    pass1_sum = 0.0
    bugs = 0
    for rp in sorted(glob.glob(os.path.join(results_dir, "fixed0", "*.json.result"))):
        bug = os.path.basename(rp)[: -len(".json.result")]
        if bug not in ref:
            continue
        try:
            rows = json.loads(open(rp, encoding="utf-8", errors="replace").read())
        except Exception:
            continue
        if not isinstance(rows, list) or not rows:
            continue
        buggy = json.loads(
            open(rp[: -len(".result")], encoding="utf-8", errors="replace").read()
        )["buggy"]
        bugs += 1
        plausible = 0
        for row in rows:
            code = (row.get("patch_code") or "").strip()
            if not code:
                continue
            if row.get("patch_status") == "PLAUSIBLE":
                plausible += 1
                aeds.append(edit_distance(buggy, code))
                ccrs.append(ccr_percent(buggy, code))
                denom = ref[bug]["ref_edit"]
                if denom > 0:
                    d_edit = edit_distance(buggy, code)
                    ratios.append(d_edit / denom)
                    cand_edit_sum += d_edit
                    ref_edit_sum += denom
                if code == (buggy or "").strip():
                    noop += 1
        total_plausible += plausible
        total_candidates += len(rows)
        pass1_sum += plausible / len(rows)
    ratios.sort()
    return {
        "bugs": bugs,
        "pass1": (pass1_sum / bugs * 100) if bugs else 0.0,
        "plausible": total_plausible,
        "candidates": total_candidates,
        "aed_mean": st.mean(aeds) if aeds else 0.0,
        "aed_median": st.median(aeds) if aeds else 0.0,
        "ccr_mean": st.mean(ccrs) if ccrs else 0.0,
        "ccr_median": st.median(ccrs) if ccrs else 0.0,
        "ratio_median": ratios[len(ratios) // 2] if ratios else 0.0,
        "ratio_sums": (cand_edit_sum / ref_edit_sum) if ref_edit_sum else 0.0,
        "ratio_le1": (sum(r <= 1 for r in ratios) / len(ratios) * 100) if ratios else 0.0,
        "ratio_gt10": (sum(r > 10 for r in ratios) / len(ratios) * 100) if ratios else 0.0,
        "noop": noop,
    }


def main() -> None:
    ap = argparse.ArgumentParser()
    ap.add_argument("--root", default=".")
    ap.add_argument("--dataset", default=None)
    ap.add_argument("--set", action="append", default=[], help="LABEL=results_dir")
    args = ap.parse_args()

    root = os.path.abspath(args.root)
    dataset = args.dataset or os.path.join(root, "defects4j", "dataset")
    ref = load_reference(dataset)
    print(f"reference faults: {len(ref)}")
    print()
    print("| setting | faults | pass@1 (%) | plausible | Avg AED | Med AED | Avg CCR | Med CCR | ratio med | ratio sums | share <=1 | share >10 | no-op |")
    print("|---|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|")
    for spec in args.set:
        label, rel = spec.split("=", 1)
        d = rel if os.path.isabs(rel) else os.path.join(root, rel)
        m = analyse(d, ref)
        print(
            f"| {label} | {m['bugs']} | {m['pass1']:.2f} | {m['plausible']} | "
            f"{m['aed_mean']:.2f} | {m['aed_median']:.1f} | {m['ccr_mean']:.2f} | "
            f"{m['ccr_median']:.2f} | {m['ratio_median']:.2f} | {m['ratio_sums']:.2f} | "
            f"{m['ratio_le1']:.0f}% | {m['ratio_gt10']:.0f}% | {m['noop']} |"
        )


if __name__ == "__main__":
    main()
