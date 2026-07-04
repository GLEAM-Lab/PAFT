#!/usr/bin/env bash
set -euo pipefail

cd /home/barty/GLEAM-Lab/PAFT

export HF_HUB_OFFLINE=1
export TRANSFORMERS_OFFLINE=1
export HF_DATASETS_OFFLINE=1
export VLLM_USE_V1=0
export VLLM_ALLOW_LONG_MAX_MODEL_LEN=1
export VLLM_DO_NOT_TRACK=1
export CUDA_VISIBLE_DEVICES="${CUDA_VISIBLE_DEVICES:-0}"

seed=7302
n=10

models=(
  "qwen2.5coder14b qwen2.5coder14b-hejava-n5-s7302 qwen2.5coder14b-hejava-n10-s7302"
  "qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620 qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620-hejava-n5-s7302 qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620-hejava-n10-s7302"
  "qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620 qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620-hejava-n5-s7302 qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620-hejava-n10-s7302"
  "qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620 qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620-hejava-n5-s7302 qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620-hejava-n10-s7302"
)

copy_prefix() {
  local src="$1"
  local dst="$2"
  for fixed_id in 0 1 2 3 4; do
    mkdir -p "evalrepair-java-res/${dst}/fixed${fixed_id}"
    if [ -d "evalrepair-java-res/${src}/fixed${fixed_id}" ]; then
      cp -an "evalrepair-java-res/${src}/fixed${fixed_id}/." "evalrepair-java-res/${dst}/fixed${fixed_id}/"
      find "evalrepair-java-res/${dst}/fixed${fixed_id}" -maxdepth 1 -name "*.result" -delete
    fi
  done
}

for row in "${models[@]}"; do
  read -r model src dst <<<"${row}"
  echo "== $(date '+%F %T') prepare ${dst} from ${src} =="
  copy_prefix "${src}" "${dst}"
  echo "== $(date '+%F %T') generate missing HumanEval-Java n=${n}: ${model} -> ${dst} on GPU ${CUDA_VISIBLE_DEVICES} =="
  python3 scripts/fast_humaneval_java_generate_vllm.py \
    --model "${model}" \
    --output-key "${dst}" \
    --n "${n}" \
    --batch-size 8 \
    --gpu-memory-utilization 0.86 \
    --seed "${seed}"
done

echo "== $(date '+%F %T') generation complete =="
