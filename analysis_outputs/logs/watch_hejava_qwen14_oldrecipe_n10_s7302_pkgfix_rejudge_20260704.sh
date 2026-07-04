#!/usr/bin/env bash
set -euo pipefail

ROOT="/home/barty/GLEAM-Lab/PAFT"
cd "$ROOT"

export HF_HUB_OFFLINE=1
export TRANSFORMERS_OFFLINE=1
export HF_DATASETS_OFFLINE=1

n=10
tasks=$(find evalrepair-java/origin -maxdepth 1 -name "*.java" | wc -l)
expected=$((tasks * n))
workers="${HEJAVA_REJUDGE_WORKERS:-16}"

raw_models=(
  "qwen2.5coder14b-hejava-n10-s7302"
  "qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620-hejava-n10-s7302"
  "qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620-hejava-n10-s7302"
  "qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620-hejava-n10-s7302"
)

pkg_models=(
  "qwen2.5coder14b-hejava-n10-s7302-pkgfix"
  "qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620-hejava-n10-s7302-pkgfix"
  "qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620-hejava-n10-s7302-pkgfix"
  "qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620-hejava-n10-s7302-pkgfix"
)

echo "== $(date '+%F %T') wait for raw HumanEval-Java n=${n} generation (${expected} Java files per row) =="
while true; do
  all_ready=1
  for model in "${raw_models[@]}"; do
    count=$(find "evalrepair-java-res/${model}" -path "*/fixed*/*.java" 2>/dev/null | wc -l || true)
    echo "${model}: ${count}/${expected}"
    if [ "$count" -lt "$expected" ]; then
      all_ready=0
    fi
  done
  if [ "$all_ready" -eq 1 ]; then
    break
  fi
  sleep 180
done

echo "== $(date '+%F %T') normalize packages =="
python3 scripts/normalize_humaneval_java_packages.py --overwrite "${raw_models[@]}"

echo "== $(date '+%F %T') rejudge package-normalized rows =="
python3 scripts/parallel_humaneval_java_rejudge.py \
  --models "${pkg_models[@]}" \
  --workers "$workers" \
  --offline \
  --skip-existing

echo "== $(date '+%F %T') summarize package-normalized n=${n} =="
python3 scripts/recompute_humaneval_java_metrics.py \
  --models "${pkg_models[@]}" \
  --expected-count "$n" \
  --csv analysis_outputs/humaneval_java_qwen14_oldrecipe_pkgfix_n10_s7302_20260704.csv \
  --md analysis_outputs/humaneval_java_qwen14_oldrecipe_pkgfix_n10_s7302_20260704.md

echo "== $(date '+%F %T') done =="
