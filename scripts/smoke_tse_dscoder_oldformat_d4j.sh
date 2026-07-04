#!/usr/bin/env bash
set -euo pipefail

usage() {
  cat >&2 <<'USAGE'
Usage:
  scripts/smoke_tse_dscoder_oldformat_d4j.sh <morepair_model_name> <gpu> [max_files]

Generates a small Defects4J fixed0 smoke set from a morepair LoRA adapter and
runs the output-format gate before expensive validation.

Example:
  scripts/smoke_tse_dscoder_oldformat_d4j.sh tse_oldfmt_dscoder67b_paft_w2p0_s101_20260621 0 20
USAGE
}

if [[ "${1:-}" == "-h" || "${1:-}" == "--help" || $# -lt 2 ]]; then
  usage
  exit 0
fi

model_name="$1"
gpu="$2"
max_files="${3:-20}"

repo_root="$(cd "$(dirname "$0")/.." && pwd)"
morepair_dir="/home/barty/research/morepair"
base_model="/home/barty/.cache/huggingface/hub/models--deepseek-ai--deepseek-coder-6.7b-instruct/snapshots/e5d64addd26a6a1db0f9b863abf6ee3141936807"
dataset="/home/barty/research/prorepair/defects4j/dataset"
results_root="/home/barty/research/prorepair/defects4j/results"
adapter_root="${morepair_dir}/models/${model_name}"
result_tag="${RESULT_TAG:-${model_name}_smoke${max_files}}"
log_dir="${repo_root}/analysis_outputs/logs"
log_path="${log_dir}/generate_${result_tag}.log"

mkdir -p "${log_dir}"

if [[ -f "${adapter_root}/final_checkpoint/adapter_config.json" ]]; then
  adapter_path="${adapter_root}/final_checkpoint"
elif [[ -f "${adapter_root}/adapter_config.json" ]]; then
  adapter_path="${adapter_root}"
else
  echo "missing LoRA adapter under ${adapter_root}" >&2
  exit 2
fi

echo "smoke generation: model=${model_name}, adapter=${adapter_path}, tag=${result_tag}, max_files=${max_files}"
echo "log=${log_path}"

cd "${repo_root}"
export CUDA_VISIBLE_DEVICES="${gpu}"
export HF_HUB_OFFLINE=1
export TRANSFORMERS_OFFLINE=1
export HF_DATASETS_OFFLINE=1
export DEEPSEEK_TOKENIZER_PATH="${base_model}"

python3 scripts/remote_generate_d4j_transformers.py \
  --model-path "${base_model}" \
  --adapter-path "${adapter_path}" \
  --result-tag "${result_tag}" \
  --dataset "${dataset}" \
  --output-root "${results_root}" \
  --num-processes 1 \
  --process-id 0 \
  --num-generations 1 \
  --prompt-style plain \
  --max-files "${max_files}" \
  >"${log_path}" 2>&1

MIN_FILES="${max_files}" \
MIN_JAVA_LIKE_PCT="${MIN_JAVA_LIKE_PCT:-70}" \
MAX_PROSE_LIKE_PCT="${MAX_PROSE_LIKE_PCT:-5}" \
  scripts/tse_d4j_output_format_gate.sh "${result_tag}" "${results_root}"

echo "smoke passed: ${result_tag}"

