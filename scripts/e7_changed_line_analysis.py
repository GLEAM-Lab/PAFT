#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""E7 add-on: restrict the prefix probe to the developer-changed lines.

The prefix probe in e7_pretrain_memorization_probe.py rewards any faithful
continuation of the code, including the lines that are *unchanged* between the
buggy and the fixed function (which a code model reproduces naturally).  The
cleaner leakage question is: of the lines the developer actually changed, and
which fall in the held-out (second) half, how many does the model reproduce
verbatim?

This script re-derives the split deterministically from the dataset (the same
split / renaming functions as the probe) and re-scores the generations that
were already written to the probe's .jsonl file.  CPU only.

Usage
  python scripts/e7_changed_line_analysis.py \
      --jsonl analysis_outputs/tse_revision_e7_leak_dscoder67b.jsonl \
      --dataset defects4j/dataset \
      --out analysis_outputs/tse_revision_e7_leak_dscoder67b_changed_lines.md
"""

from __future__ import annotations

import argparse
import difflib
import json
import random
import re
import statistics as st
import sys
from pathlib import Path

sys.path.insert(0, str(Path(__file__).resolve().parent))
from e7_pretrain_memorization_probe import (  # noqa: E402
    clean_lines,
    load_tasks,
    renamed_pair,
    split_prefix_suffix,
)


def changed_fix_lines(buggy: str, fix: str):
    """Indices (0-based, into fix.splitlines()) of lines the developer changed."""
    bl = [l.strip() for l in buggy.splitlines()]
    fl = [l.strip() for l in fix.splitlines()]
    sm = difflib.SequenceMatcher(None, bl, fl, autojunk=False)
    idx = set()
    for tag, i1, i2, j1, j2 in sm.get_opcodes():
        if tag in ("replace", "insert"):
            idx.update(range(j1, j2))
    return idx, fl


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--jsonl", required=True)
    ap.add_argument("--dataset", default="defects4j/dataset")
    ap.add_argument("--out", required=True)
    ap.add_argument("--prefix-frac", type=float, default=0.5)
    ap.add_argument("--iters", type=int, default=10000)
    args = ap.parse_args()

    tasks = {t["id"]: t for t in load_tasks(Path(args.dataset))}
    gens = {}
    for line in Path(args.jsonl).read_text(encoding="utf-8").splitlines():
        r = json.loads(line)
        if r["probe"] == "prefix":
            gens[(r["id"], r["condition"])] = r["generation"]

    per = {"canonical": {}, "renamed": {}}
    for tid, t in tasks.items():
        buggy_r, fix_r, _ = renamed_pair(t["buggy"], t["fix"])
        variants = {"canonical": (t["buggy"], t["fix"]), "renamed": (buggy_r, fix_r)}
        for cond, (buggy, fix) in variants.items():
            gen = gens.get((tid, cond))
            if gen is None:
                continue
            split = split_prefix_suffix(fix, args.prefix_frac)
            if split is None:
                continue
            prefix, _suffix = split
            n_prefix = len(prefix.splitlines())
            changed_idx, fl = changed_fix_lines(buggy, fix)
            held = sorted(i for i in changed_idx if i >= n_prefix)
            if not held:
                continue
            gen_lines = set(clean_lines(gen))
            hits = sum(1 for i in held if i < len(fl) and fl[i] in gen_lines)
            per[cond][tid] = {
                "n_changed_held": len(held),
                "n_reproduced": hits,
                "frac_reproduced": hits / len(held),
                "any": int(hits > 0),
                "all": int(hits == len(held)),
            }

    keys = sorted(set(per["canonical"]) & set(per["renamed"]))

    def summarize(name):
        rows = [per[name][k] for k in keys]
        if not rows:
            return (0, 0.0, 0.0, 0.0, 0.0)
        return (
            len(rows),
            st.mean(r["frac_reproduced"] for r in rows),
            st.mean(r["any"] for r in rows),
            st.mean(r["all"] for r in rows),
            sum(r["n_changed_held"] for r in rows),
        )

    def boot(metric):
        d = [per["canonical"][k][metric] - per["renamed"][k][metric] for k in keys]
        n = len(d)
        if n == 0:
            return 0.0, 0.0, 0.0, 1.0
        rng = random.Random(7)
        ms = sorted(sum(d[rng.randrange(n)] for _ in range(n)) / n for _ in range(args.iters))
        p = min(1.0, 2 * min(sum(m <= 0 for m in ms), sum(m >= 0 for m in ms)) / args.iters)
        return sum(d) / n, ms[int(0.025 * args.iters)], ms[int(0.975 * args.iters)], p

    lines = []
    lines.append("# E7 add-on: reproduction of the developer-changed, held-out lines")
    lines.append("")
    lines.append(
        "For each fault we take the prefix probe's held-out second half, keep only the "
        "lines the developer actually changed (replace/insert opcodes of a stripped-line "
        "diff), and count how many of them appear verbatim in the model's continuation."
    )
    lines.append("")
    lines.append("| condition | faults | mean changed-line recall | >=1 changed line | all changed lines | changed lines scored |")
    lines.append("|---|---:|---:|---:|---:|---:|")
    for cond in ("canonical", "renamed"):
        n, frac, any_r, all_r, total = summarize(cond)
        lines.append(f"| {cond} | {n} | {frac:.3f} | {any_r:.1%} | {all_r:.1%} | {total} |")
    lines.append("")
    lines.append("| metric | n | canonical - renamed [95% CI] | p |")
    lines.append("|---|---:|---|---:|")
    for metric, name in (
        ("frac_reproduced", "changed-line recall"),
        ("any", ">=1 changed line reproduced"),
        ("all", "all changed lines reproduced"),
    ):
        m, lo, hi, p = boot(metric)
        lines.append(f"| {name} | {len(keys)} | {m:+.3f} [{lo:+.3f}, {hi:+.3f}] | {p:.3f} |")
    lines.append("")
    lines.append(
        "Reading: a leakage claim would require the canonical condition to reproduce the "
        "developer's *edited* lines, which were never shown to the model, at a clearly "
        "higher rate than the renamed control.  Low absolute recall is the no-leakage "
        "outcome; the renamed control is an upper bound on the OOD penalty of renaming."
    )
    lines.append("")

    out = Path(args.out)
    out.parent.mkdir(parents=True, exist_ok=True)
    out.write_text("\n".join(lines), encoding="utf-8")
    print("\n".join(lines))
    print(f"[e7-addon] wrote {out}")


if __name__ == "__main__":
    main()
