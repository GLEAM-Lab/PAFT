#!/usr/bin/env bash
set -euo pipefail

ROOT="/home/barty/GLEAM-Lab/PAFT"
cd "$ROOT"

export PATH="/home/barty/research/defects4j/framework/bin:${PATH}"
export PERL5LIB="/home/barty/perl5/lib/perl5${PERL5LIB:+:${PERL5LIB}}"
export PERL_LOCAL_LIB_ROOT="/home/barty/perl5${PERL_LOCAL_LIB_ROOT:+:${PERL_LOCAL_LIB_ROOT}}"
export PERL_MB_OPT='--install_base "/home/barty/perl5"'
export PERL_MM_OPT="INSTALL_BASE=/home/barty/perl5"

model="qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620-d4j-n10-s7402"

python3 scripts/fill_d4j_missing_json_from_logs.py --model "$model"

D4J_VALIDATION_WORKERS="${D4J_VALIDATION_WORKERS:-6}" \
D4J_VALIDATION_NAMESPACE="qwen14_n10_s7402_${model}_early" \
python3 test_d4j.py -m "$model" -n 10

python3 scripts/recompute_d4j_metrics.py \
  --root "$ROOT" \
  --expected-patch-count 10 \
  --models "$model" \
  --csv analysis_outputs/d4j_qwen14_oldrecipe_n10_s7402_w2_only_20260704.csv \
  --md analysis_outputs/d4j_qwen14_oldrecipe_n10_s7402_w2_only_20260704.md
