# -*- coding: utf-8 -*-
"""E1 (TSE revision): gradient-clipping activation rate of a training run.

Reads the `grad_norm` entries that the HF Trainer writes to trainer_state.json at every
logging step (train with LOGGING_STEPS=1 so every optimizer step is recorded). `grad_norm`
is the total norm BEFORE clipping, so a step is clipped iff grad_norm > max_grad_norm (0.3).

Usage:
  python scripts/e1_clipping_rate.py models/deepseek-6.7b-sft-logged [models/deepseek-6.7b-paft-logged ...]
Each argument is a run directory; the newest checkpoint-*/trainer_state.json (or a
trainer_state.json directly under the directory) is used.
"""
import glob
import json
import os
import statistics as st
import sys

MAX_GRAD_NORM = 0.3


def find_state(run_dir):
    direct = os.path.join(run_dir, "trainer_state.json")
    if os.path.exists(direct):
        return direct
    cands = glob.glob(os.path.join(run_dir, "checkpoint-*", "trainer_state.json"))
    if not cands:
        raise SystemExit(f"no trainer_state.json under {run_dir}")
    return max(cands, key=lambda p: int(p.split("checkpoint-")[-1].split(os.sep)[0]))


def main():
    print(f"{'run':40} {'steps':>6} {'clipped':>8} {'rate':>7} {'mean|g|':>8} {'median|g|':>10} {'p90|g|':>8} {'max|g|':>8}")
    for run_dir in sys.argv[1:]:
        state = json.load(open(find_state(run_dir), encoding="utf-8"))
        norms = [e["grad_norm"] for e in state["log_history"] if "grad_norm" in e and e["grad_norm"] is not None]
        if not norms:
            print(f"{run_dir:40} no grad_norm entries (train with LOGGING_STEPS=1)")
            continue
        norms_sorted = sorted(norms)
        clipped = sum(1 for g in norms if g > MAX_GRAD_NORM)
        print(f"{os.path.basename(run_dir.rstrip('/')):40} {len(norms):>6} {clipped:>8} {clipped/len(norms)*100:6.1f}% "
              f"{st.mean(norms):8.3f} {st.median(norms):10.3f} {norms_sorted[int(0.9*len(norms))]:8.3f} {norms_sorted[-1]:8.3f}")


if __name__ == "__main__":
    main()
