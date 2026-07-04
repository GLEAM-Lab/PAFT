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

base_model="/home/barty/.cache/huggingface/hub/models--Qwen--Qwen2.5-Coder-14B-Instruct/snapshots/aedcc2d42b622764e023cf882b6652e646b95671"
seed=7401
n=5

run_model() {
  local tag="$1"
  local adapter="$2"

  echo "== $(date '+%F %T') generate ${tag} n=${n} seed=${seed} =="
  local adapter_args=()
  if [[ -n "$adapter" ]]; then
    adapter_args=(--adapter-path "$adapter")
  fi

  python3 scripts/remote_generate_d4j_vllm.py \
    --model-path "$base_model" \
    "${adapter_args[@]}" \
    --result-tag "$tag" \
    --dataset defects4j/dataset \
    --output-root defects4j/results \
    --model-family qwen \
    --prompt-style java_plain \
    --extract-profile historical_strict \
    --num-generations "$n" \
    --batch-size 8 \
    --gpu-memory-utilization 0.82 \
    --max-num-seqs 8 \
    --max-num-batched-tokens 8192 \
    --seed "$seed"
}

run_model "qwen2.5coder14b-d4j-n5-s7401" ""
run_model "qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620-d4j-n5-s7401" \
  "/home/barty/research/morepair/models/qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620"
run_model "qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620-d4j-n5-s7401" \
  "/home/barty/research/morepair/models/qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620"

echo "== $(date '+%F %T') generation queue finished; run validation separately =="
