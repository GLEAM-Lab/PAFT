#!/usr/bin/env bash
set -euo pipefail

ROOT="/home/barty/GLEAM-Lab/PAFT"
cd "$ROOT"

export CUDA_VISIBLE_DEVICES=1
export HF_HUB_OFFLINE=1
export TRANSFORMERS_OFFLINE=1
export HF_DATASETS_OFFLINE=1
export VLLM_USE_V1=0
export VLLM_ALLOW_LONG_MAX_MODEL_LEN=1
export VLLM_DO_NOT_TRACK=1

seed=7301
n=5

models=(
  "qwen2.5coder14b"
  "qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620"
  "qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620"
)

outputs=(
  "qwen2.5coder14b-hejava-n5-s7301"
  "qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620-hejava-n5-s7301"
  "qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620-hejava-n5-s7301"
)

for i in "${!models[@]}"; do
  model="${models[$i]}"
  output="${outputs[$i]}"
  echo "== $(date '+%F %T') generate ${model} -> ${output} n=${n} seed=${seed} =="
  python3 scripts/fast_humaneval_java_generate_vllm.py \
    --model "$model" \
    --output-key "$output" \
    --n "$n" \
    --batch-size 8 \
    --gpu-memory-utilization 0.82 \
    --seed "$seed"
done

echo "== $(date '+%F %T') generation done; run package normalization and rejudge separately =="
