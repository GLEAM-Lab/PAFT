#!/usr/bin/env bash
set -euo pipefail

ROOT="/home/barty/GLEAM-Lab/PAFT"
cd "$ROOT"

hejava_metrics="analysis_outputs/humaneval_java_qwen14_oldrecipe_pkgfix_n5_s7301_20260703.md"
out_dir="analysis_outputs/quixbugs_python_qwen14_oldrecipe_20260703_seed7106"
n=5

models=(
  "qwen2.5coder14b"
  "qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620"
  "qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620"
)

echo "== $(date '+%F %T') waiting for HumanEval-Java seed7301 metrics before QuixBugs evaluation =="
while [[ ! -s "$hejava_metrics" ]]; do
  sleep 180
done

for model in "${models[@]}"; do
  echo "== $(date '+%F %T') evaluate ${model} =="
  python3 scripts/run_quixbugs_python.py \
    --model-id "$model" \
    --mode evaluate \
    --out-dir "$out_dir" \
    --n-samples "$n" \
    --seed 7106
done

python3 - <<'PY'
from __future__ import annotations

import csv
import json
from pathlib import Path

root = Path("analysis_outputs/quixbugs_python_qwen14_oldrecipe_20260703_seed7106")
models = [
    "qwen2.5coder14b",
    "qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620",
    "qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620",
]
rows = []
for model in models:
    data = json.loads((root / model / "eval_n5.json").read_text(encoding="utf-8"))
    row = data["summary"]
    rows.append(row)

csv_path = Path("analysis_outputs/quixbugs_python_qwen14_oldrecipe_seed7106_summary_20260703.csv")
md_path = Path("analysis_outputs/quixbugs_python_qwen14_oldrecipe_seed7106_summary_20260703.md")
headers = [
    "model_id",
    "tasks",
    "n_samples",
    "pass@1",
    "pass@5",
    "resolved_tasks",
    "plausible_candidates",
    "aed_avg",
    "aed_median",
    "ccr_avg",
    "ccr_median",
    "noop_first",
    "noop_all",
]
with csv_path.open("w", encoding="utf-8", newline="") as fh:
    writer = csv.DictWriter(fh, fieldnames=headers)
    writer.writeheader()
    writer.writerows({key: row.get(key) for key in headers} for row in rows)

with md_path.open("w", encoding="utf-8") as fh:
    fh.write("| " + " | ".join(headers) + " |\n")
    fh.write("|" + "|".join(["---"] + ["---:"] * (len(headers) - 1)) + "|\n")
    for row in rows:
        values = []
        for header in headers:
            value = row.get(header)
            if isinstance(value, float):
                values.append(f"{value:.2f}")
            else:
                values.append("" if value is None else str(value))
        fh.write("| " + " | ".join(values) + " |\n")

print(f"wrote {csv_path} and {md_path}")
PY

echo "== $(date '+%F %T') done =="
