#!/usr/bin/env bash
set -euo pipefail

ROOT="${PAFT_ROOT:-$(cd "$(dirname "${BASH_SOURCE[0]}")/../.." && pwd)}"
cd "$ROOT"

export CUDA_VISIBLE_DEVICES="${CUDA_VISIBLE_DEVICES:-1}"
export HF_HUB_OFFLINE="${HF_HUB_OFFLINE:-1}"
export TRANSFORMERS_OFFLINE="${TRANSFORMERS_OFFLINE:-1}"
export HF_DATASETS_OFFLINE="${HF_DATASETS_OFFLINE:-1}"
export VLLM_USE_V1="${VLLM_USE_V1:-0}"
export VLLM_WORKER_MULTIPROC_METHOD="${VLLM_WORKER_MULTIPROC_METHOD:-spawn}"
export VLLM_ALLOW_LONG_MAX_MODEL_LEN="${VLLM_ALLOW_LONG_MAX_MODEL_LEN:-1}"
export VLLM_DO_NOT_TRACK="${VLLM_DO_NOT_TRACK:-1}"

seed=7202
n=5
out_dir="analysis_outputs/humanevalpack_python_qwen14_oldrecipe_20260703_seed${seed}"

models=(
  "qwen2.5coder14b"
  "qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620"
  "qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620"
)

for model in "${models[@]}"; do
  echo "== $(date '+%F %T') ${model} =="
  python3 scripts/run_humanevalpack_python.py \
    --model-id "$model" \
    --mode all \
    --out-dir "$out_dir" \
    --gpu 0 \
    --backend vllm \
    --n-samples "$n" \
    --max-tokens 1024 \
    --gpu-memory-utilization 0.82 \
    --seed "$seed"
done

echo "== $(date '+%F %T') summarize =="
python3 scripts/summarize_humanevalpack_python_results.py \
  --out-dir "$out_dir" \
  --n-samples "$n" \
  --tag 20260703 \
  --max-tokens 1024 \
  --backend vllm \
  --model Base=qwen2.5coder14b \
  --model SFT=qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620 \
  --model PAFT=qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620

echo "== $(date '+%F %T') done =="
