#!/usr/bin/env bash
set -euo pipefail

ROOT="/home/barty/GLEAM-Lab/PAFT"
cd "$ROOT"

export PATH="/home/barty/research/defects4j/framework/bin:${PATH}"
export PERL5LIB="/home/barty/perl5/lib/perl5${PERL5LIB:+:${PERL5LIB}}"
export PERL_LOCAL_LIB_ROOT="/home/barty/perl5${PERL_LOCAL_LIB_ROOT:+:${PERL_LOCAL_LIB_ROOT}}"
export PERL_MB_OPT='--install_base "/home/barty/perl5"'
export PERL_MM_OPT="INSTALL_BASE=/home/barty/perl5"

model="qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620-d4j-n10-s7401"

echo "== $(date '+%F %T') validate ${model} =="
D4J_VALIDATION_WORKERS="${D4J_VALIDATION_WORKERS:-6}" \
D4J_VALIDATION_NAMESPACE="qwen14_n10_${model}" \
python3 test_d4j.py -m "$model" -n 10
echo "== $(date '+%F %T') done =="
