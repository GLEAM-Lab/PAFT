#!/usr/bin/env bash
set -euo pipefail

cd /home/barty/GLEAM-Lab/PAFT

export CUDA_VISIBLE_DEVICES="${CUDA_VISIBLE_DEVICES:-0}"
export HF_HUB_OFFLINE=1
export TRANSFORMERS_OFFLINE=1
export HF_DATASETS_OFFLINE=1

seed=7106
out_dir="analysis_outputs/quixbugs_python_qwen14_oldrecipe_20260703_seed${seed}"

python3 scripts/run_quixbugs_python.py \
  --model-id qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620 \
  --mode all \
  --out-dir "$out_dir" \
  --gpu "${CUDA_VISIBLE_DEVICES}" \
  --n-samples 5 \
  --seed "$seed" \
  --batch-size 2

python3 scripts/summarize_quixbugs_python.py \
  --out-dir "$out_dir" \
  --csv analysis_outputs/quixbugs_python_qwen14_oldrecipe_seed7106_summary_with_w2_20260704.csv \
  --md analysis_outputs/quixbugs_python_qwen14_oldrecipe_seed7106_summary_with_w2_20260704.md
