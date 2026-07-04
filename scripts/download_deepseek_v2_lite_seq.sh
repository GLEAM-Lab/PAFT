#!/usr/bin/env bash
set -euo pipefail

MODEL_ID="deepseek-ai/DeepSeek-Coder-V2-Lite-Instruct"
OUT_DIR="/home/barty/modelscope_models/DeepSeek-Coder-V2-Lite-Instruct"

mkdir -p "${OUT_DIR}"

files=(
  "model-00002-of-000004.safetensors"
  "model-00003-of-000004.safetensors"
  "model-00004-of-000004.safetensors"
)

for file in "${files[@]}"; do
  echo "START ${file}"
  modelscope download \
    --model "${MODEL_ID}" \
    --local_dir "${OUT_DIR}" \
    "${file}"
  echo "DONE ${file}"
done
