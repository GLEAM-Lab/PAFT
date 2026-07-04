#!/usr/bin/env bash
set -euo pipefail

ROOT="/home/barty/GLEAM-Lab/PAFT"
cd "$ROOT"

export PATH="/home/barty/research/defects4j/framework/bin:${PATH}"
export PERL5LIB="/home/barty/perl5/lib/perl5${PERL5LIB:+:${PERL5LIB}}"
export PERL_LOCAL_LIB_ROOT="/home/barty/perl5${PERL_LOCAL_LIB_ROOT:+:${PERL_LOCAL_LIB_ROOT}}"
export PERL_MB_OPT='--install_base "/home/barty/perl5"'
export PERL_MM_OPT="INSTALL_BASE=/home/barty/perl5"

gen_screen="d4j_qwen14_w2_n5_gpu1"
expected=$((371 * 5))
w2_model="qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620-d4j-n5-s7401"
models=(
  "qwen2.5coder14b-d4j-n5-s7401"
  "qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620-d4j-n5-s7401"
  "qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620-d4j-n5-s7401"
  "$w2_model"
)

echo "== $(date '+%F %T') waiting for ${w2_model} outputs =="
while true; do
  count=$(find "defects4j/results/${w2_model}" -name "*.json" 2>/dev/null | wc -l || true)
  echo "${w2_model}: ${count}/${expected} json files"
  if [[ "$count" -ge "$expected" ]]; then
    break
  fi
  if ! screen -ls | grep -q "${gen_screen}"; then
    echo "[ERROR] generation screen exited before ${w2_model} completed" >&2
    exit 1
  fi
  sleep 120
done

result_count=$(find "defects4j/results/${w2_model}/fixed0" -name "*.json.result" 2>/dev/null | wc -l)
if [[ "$result_count" -ge 371 ]]; then
  echo "== $(date '+%F %T') validation already complete for ${w2_model}; skipping =="
else
  echo "== $(date '+%F %T') validate ${w2_model} =="
  D4J_VALIDATION_WORKERS="${D4J_VALIDATION_WORKERS:-4}" \
  D4J_VALIDATION_NAMESPACE="qwen14_n5_${w2_model}" \
  python3 test_d4j.py -m "$w2_model" -n 5
fi

echo "== $(date '+%F %T') recompute four-row Qwen14 n=5 metrics =="
python3 scripts/recompute_d4j_metrics.py \
  --root "$ROOT" \
  --expected-patch-count 5 \
  --models "${models[@]}" \
  --csv analysis_outputs/d4j_qwen14_oldrecipe_n5_w2_s7401_metrics_20260703.csv \
  --md analysis_outputs/d4j_qwen14_oldrecipe_n5_w2_s7401_metrics_20260703.md

echo "== $(date '+%F %T') done =="
