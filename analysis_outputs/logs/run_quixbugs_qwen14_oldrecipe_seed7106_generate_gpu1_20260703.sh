#!/usr/bin/env bash
set -euo pipefail

ROOT="/home/barty/GLEAM-Lab/PAFT"
cd "$ROOT"

export CUDA_VISIBLE_DEVICES=1
export HF_HUB_OFFLINE=1
export TRANSFORMERS_OFFLINE=1
export HF_DATASETS_OFFLINE=1

seed=7106
n=5
out_dir="analysis_outputs/quixbugs_python_qwen14_oldrecipe_20260703_seed${seed}"

models=(
  "qwen2.5coder14b"
  "qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620"
  "qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620"
)

for model in "${models[@]}"; do
  echo "== $(date '+%F %T') generate ${model} seed=${seed} n=${n} =="
  python3 scripts/run_quixbugs_python.py \
    --model-id "$model" \
    --mode generate \
    --out-dir "$out_dir" \
    --gpu 1 \
    --n-samples "$n" \
    --seed "$seed" \
    --batch-size 2
done

echo "== $(date '+%F %T') generation done; run evaluation separately =="
