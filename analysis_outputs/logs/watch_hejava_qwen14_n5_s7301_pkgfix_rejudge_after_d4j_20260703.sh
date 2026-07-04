#!/usr/bin/env bash
set -euo pipefail

ROOT="/home/barty/GLEAM-Lab/PAFT"
cd "$ROOT"

d4j_metrics="analysis_outputs/d4j_qwen14_oldrecipe_n5_s7401_metrics_20260703.md"
workers="${HEJAVA_REJUDGE_WORKERS:-16}"
n=5

models=(
  "qwen2.5coder14b-hejava-n5-s7301-pkgfix"
  "qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620-hejava-n5-s7301-pkgfix"
  "qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620-hejava-n5-s7301-pkgfix"
)

echo "== $(date '+%F %T') waiting for D4J metrics before HumanEval-Java rejudge =="
while [[ ! -s "$d4j_metrics" ]]; do
  if ! screen -ls | grep -q "watch_d4j_qwen14_n5_validate"; then
    echo "[WARN] D4J watcher screen is not present yet metrics file is missing: ${d4j_metrics}" >&2
  fi
  sleep 180
done

echo "== $(date '+%F %T') rejudge HumanEval-Java seed7301 pkgfix =="
python3 scripts/parallel_humaneval_java_rejudge.py \
  --models "${models[@]}" \
  --workers "$workers" \
  --offline \
  --skip-existing

echo "== $(date '+%F %T') metrics =="
python3 scripts/recompute_humaneval_java_metrics.py \
  --models "${models[@]}" \
  --expected-count "$n" \
  --csv analysis_outputs/humaneval_java_qwen14_oldrecipe_pkgfix_n5_s7301_20260703.csv \
  --md analysis_outputs/humaneval_java_qwen14_oldrecipe_pkgfix_n5_s7301_20260703.md

echo "== $(date '+%F %T') done =="
