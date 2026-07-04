#!/usr/bin/env bash
set -euo pipefail

ROOT="/home/barty/GLEAM-Lab/PAFT"
cd "$ROOT"

wait_screen="d4j_qwen14_w2_n10_s7402_gpu0"
echo "== $(date '+%F %T') waiting for ${wait_screen} to finish before PAFT-w1.5 =="
while screen -ls | grep -q "$wait_screen"; do
  sleep 120
done

export CUDA_VISIBLE_DEVICES=0
export HF_HUB_OFFLINE=1
export TRANSFORMERS_OFFLINE=1
export HF_DATASETS_OFFLINE=1
export VLLM_USE_V1=0
export VLLM_ALLOW_LONG_MAX_MODEL_LEN=1
export VLLM_DO_NOT_TRACK=1

base_model="/home/barty/.cache/huggingface/hub/models--Qwen--Qwen2.5-Coder-14B-Instruct/snapshots/aedcc2d42b622764e023cf882b6652e646b95671"
adapter="/home/barty/research/morepair/models/qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620"
tag="qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620-d4j-n10-s7402"
seed=7402
n=10

echo "== $(date '+%F %T') generate ${tag} n=${n} seed=${seed} on GPU0 =="
python3 scripts/remote_generate_d4j_vllm.py \
  --model-path "$base_model" \
  --adapter-path "$adapter" \
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

echo "== $(date '+%F %T') PAFT-w1.5 seed7402 generation finished; validation watcher handles testing =="
