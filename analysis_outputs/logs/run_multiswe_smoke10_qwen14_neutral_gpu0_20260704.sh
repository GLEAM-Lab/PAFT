#!/usr/bin/env bash
set -euo pipefail

ROOT="/home/barty/GLEAM-Lab/PAFT"
cd "$ROOT"

export CUDA_VISIBLE_DEVICES=0
export HF_HUB_OFFLINE=1
export TRANSFORMERS_OFFLINE=1
export HF_DATASETS_OFFLINE=1
export VLLM_USE_V1=0
export VLLM_WORKER_MULTIPROC_METHOD=spawn
export VLLM_ALLOW_LONG_MAX_MODEL_LEN=1
export VLLM_DO_NOT_TRACK=1

base_model="/home/barty/.cache/huggingface/hub/models--Qwen--Qwen2.5-Coder-14B-Instruct/snapshots/aedcc2d42b622764e023cf882b6652e646b95671"
contexts="analysis_outputs/multiswe_java_verified_runnable_smoke10_ctx5_max20k_neutral_20260704.jsonl"
output_root="analysis_outputs/multiswe_java_smoke10_generations_neutral"
seed=7401

run_model() {
  local tag="$1"
  local adapter="$2"
  echo "== $(date '+%F %T') Multi-SWE neutral smoke10 generate ${tag} =="
  args=(
    --contexts "$contexts"
    --model-path "$base_model"
    --result-tag "$tag"
    --output-root "$output_root"
    --model-family qwen
    --num-generations 1
    --batch-size 1
    --max-model-len 8192
    --max-num-seqs 1
    --max-num-batched-tokens 8192
    --gpu-memory-utilization 0.82
    --max-tokens 2048
    --temperature 0.2
    --top-p 0.95
    --seed "$seed"
  )
  if [[ -n "$adapter" ]]; then
    args+=(--adapter-path "$adapter")
  fi
  python3 scripts/generate_multiswe_oracle_vllm.py "${args[@]}"
}

run_model "qwen2.5coder14b-multiswe-smoke10-neutral-s7401" ""
run_model "qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620-multiswe-smoke10-neutral-s7401" \
  "/home/barty/research/morepair/models/qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620"
run_model "qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620-multiswe-smoke10-neutral-s7401" \
  "/home/barty/research/morepair/models/qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620"
run_model "qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620-multiswe-smoke10-neutral-s7401" \
  "/home/barty/research/morepair/models/qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620"

args=(
  --contexts "$contexts"
  --output-root "$output_root"
  --csv analysis_outputs/multiswe_java_smoke10_neutral_generator_summary_20260704.csv
  --md analysis_outputs/multiswe_java_smoke10_neutral_generator_summary_20260704.md
)
for model in \
  "qwen2.5coder14b-multiswe-smoke10-neutral-s7401" \
  "qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620-multiswe-smoke10-neutral-s7401" \
  "qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620-multiswe-smoke10-neutral-s7401" \
  "qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620-multiswe-smoke10-neutral-s7401"; do
  args+=(--model "$model")
done
python3 scripts/summarize_multiswe_oracle_generations.py "${args[@]}"
cat analysis_outputs/multiswe_java_smoke10_neutral_generator_summary_20260704.md

echo "== $(date '+%F %T') Multi-SWE neutral smoke10 generation finished =="
