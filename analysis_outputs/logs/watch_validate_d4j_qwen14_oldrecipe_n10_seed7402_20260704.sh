#!/usr/bin/env bash
set -euo pipefail

ROOT="/home/barty/GLEAM-Lab/PAFT"
cd "$ROOT"

export PATH="/home/barty/research/defects4j/framework/bin:${PATH}"
export PERL5LIB="/home/barty/perl5/lib/perl5${PERL5LIB:+:${PERL5LIB}}"
export PERL_LOCAL_LIB_ROOT="/home/barty/perl5${PERL_LOCAL_LIB_ROOT:+:${PERL_LOCAL_LIB_ROOT}}"
export PERL_MB_OPT='--install_base "/home/barty/perl5"'
export PERL_MM_OPT="INSTALL_BASE=/home/barty/perl5"

gen_screen="d4j_qwen14_n10_s7402_gpu1"
models=(
  "qwen2.5coder14b-d4j-n10-s7402"
  "qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620-d4j-n10-s7402"
  "qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620-d4j-n10-s7402"
  "qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620-d4j-n10-s7402"
)
expected=$((371 * 10))

screen_alive() {
  screen -ls | grep -q "$gen_screen"
}

for model in "${models[@]}"; do
  echo "== $(date '+%F %T') waiting for ${model} outputs =="
  while true; do
    count=$(find "defects4j/results/${model}" -name "*.json" 2>/dev/null | wc -l || true)
    echo "${model}: ${count}/${expected} json files"
    if [[ "$count" -ge "$expected" ]]; then
      break
    fi
    if ! screen_alive; then
      echo "[ERROR] generation screen exited before ${model} completed" >&2
      exit 1
    fi
    sleep 120
  done

  result_count=$(find "defects4j/results/${model}/fixed0" -name "*.json.result" 2>/dev/null | wc -l)
  if [[ "$result_count" -ge 371 ]]; then
    echo "== $(date '+%F %T') validation already complete for ${model}; skipping =="
    continue
  fi

  echo "== $(date '+%F %T') validate ${model} =="
  D4J_VALIDATION_WORKERS="${D4J_VALIDATION_WORKERS:-6}" \
  D4J_VALIDATION_NAMESPACE="qwen14_n10_s7402_${model}" \
  python3 test_d4j.py -m "$model" -n 10
done

echo "== $(date '+%F %T') recompute four-row Qwen14 n=10 seed7402 metrics =="
python3 scripts/recompute_d4j_metrics.py \
  --root "$ROOT" \
  --expected-patch-count 10 \
  --models "${models[@]}" \
  --csv analysis_outputs/d4j_qwen14_oldrecipe_n10_s7402_metrics_20260704.csv \
  --md analysis_outputs/d4j_qwen14_oldrecipe_n10_s7402_metrics_20260704.md

echo "== $(date '+%F %T') done =="
