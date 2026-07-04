#!/usr/bin/env bash
set -euo pipefail

ROOT="/home/barty/GLEAM-Lab/PAFT"
cd "$ROOT"

export PATH="/home/barty/research/defects4j/framework/bin:${PATH}"
export PERL5LIB="/home/barty/perl5/lib/perl5${PERL5LIB:+:${PERL5LIB}}"
export PERL_LOCAL_LIB_ROOT="/home/barty/perl5${PERL_LOCAL_LIB_ROOT:+:${PERL_LOCAL_LIB_ROOT}}"
export PERL_MB_OPT='--install_base "/home/barty/perl5"'
export PERL_MM_OPT="INSTALL_BASE=/home/barty/perl5"

gen_screen="d4j_qwen14_w2_n10_gpu1"
model="qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620-d4j-n10-s7401"
expected=$((371 * 10))

echo "== $(date '+%F %T') waiting for ${model} outputs =="
while true; do
  count=$(find "defects4j/results/${model}" -name "*.json" 2>/dev/null | wc -l || true)
  echo "${model}: ${count}/${expected} json files"
  if [[ "$count" -ge "$expected" ]]; then
    break
  fi
  if ! screen -ls | grep -q "${gen_screen}"; then
    echo "[ERROR] generation screen exited before ${model} completed" >&2
    exit 1
  fi
  sleep 120
done

echo "== $(date '+%F %T') validate ${model} =="
D4J_VALIDATION_WORKERS="${D4J_VALIDATION_WORKERS:-4}" \
D4J_VALIDATION_NAMESPACE="qwen14_n10_${model}" \
python3 test_d4j.py -m "$model" -n 10

echo "== $(date '+%F %T') recompute n=10 metrics =="
python3 scripts/recompute_d4j_metrics.py \
  --root "$ROOT" \
  --expected-patch-count 10 \
  --models "$model" \
  --csv analysis_outputs/d4j_qwen14_oldrecipe_n10_w2_s7401_metrics_20260703.csv \
  --md analysis_outputs/d4j_qwen14_oldrecipe_n10_w2_s7401_metrics_20260703.md

echo "== $(date '+%F %T') done =="
