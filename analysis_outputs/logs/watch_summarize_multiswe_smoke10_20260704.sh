#!/usr/bin/env bash
set -euo pipefail

ROOT="/home/barty/GLEAM-Lab/PAFT"
cd "$ROOT"

models=(
  "qwen2.5coder14b-multiswe-smoke10-s7401"
  "qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620-multiswe-smoke10-s7401"
  "qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620-multiswe-smoke10-s7401"
  "qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620-multiswe-smoke10-s7401"
)
output_root="analysis_outputs/multiswe_java_smoke10_generations"

while true; do
  ready=0
  for model in "${models[@]}"; do
    path="${output_root}/${model}/predictions.jsonl"
    count=0
    if [[ -s "$path" ]]; then
      count=$(wc -l < "$path")
    fi
    echo "$(date '+%F %T') ${model}: ${count}/10 predictions"
    if [[ "$count" -ge 10 ]]; then
      ready=$((ready + 1))
    fi
  done
  if [[ "$ready" -eq "${#models[@]}" ]]; then
    break
  fi
  sleep 180
done

args=()
for model in "${models[@]}"; do
  args+=(--model "$model")
done
python3 scripts/summarize_multiswe_oracle_generations.py "${args[@]}"
cat analysis_outputs/multiswe_java_smoke10_generator_summary_20260704.md
