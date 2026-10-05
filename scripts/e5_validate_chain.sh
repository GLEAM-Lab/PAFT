#!/usr/bin/env bash
set -u
cd /root/autodl-tmp/PAFT
export PATH="$PWD/defects4j-framework/framework/bin:$PATH"
export JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64

log() { echo "[chain] $* $(date -Is)"; }

log "chain started; waiting for plain/minimal validators"
while true; do
  if grep -q "\[validate\] done plain" logs/validate_plain.log 2>/dev/null && \
     grep -q "\[validate\] done minimal" logs/validate_minimal.log 2>/dev/null; then
    break
  fi
  sleep 120
done

log "plain+minimal finished; launching emphatic and fewshot"

D4J_VALIDATION_WORKERS=8 D4J_VALIDATION_NAMESPACE=e5_emphatic \
  /root/miniconda3/envs/paft/bin/python test_d4j.py -m prompting-emphatic-rerun -n 10 \
  > logs/validate_emphatic2.log 2>&1 &
EPID=$!

D4J_VALIDATION_WORKERS=8 D4J_VALIDATION_NAMESPACE=e5_fewshot \
  /root/miniconda3/envs/paft/bin/python test_d4j.py -m prompting-fewshot -n 10 \
  > logs/validate_fewshot2.log 2>&1 &
FPID=$!

wait "$EPID"; log "emphatic finished"
wait "$FPID"; log "fewshot finished"
log "all E5 validation finished"
