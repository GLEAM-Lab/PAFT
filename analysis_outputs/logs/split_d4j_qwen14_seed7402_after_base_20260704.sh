#!/usr/bin/env bash
set -euo pipefail

ROOT="/home/barty/GLEAM-Lab/PAFT"
cd "$ROOT"

base_tag="qwen2.5coder14b-d4j-n10-s7402"
base_screen="d4j_qwen14_n10_s7402_gpu1"
expected=$((371 * 10))

echo "== $(date '+%F %T') waiting for ${base_tag} to complete before splitting queue =="
while true; do
  count=$(find "defects4j/results/${base_tag}" -name "*.json" 2>/dev/null | wc -l || true)
  echo "${base_tag}: ${count}/${expected} json files"
  if [[ "$count" -ge "$expected" ]]; then
    break
  fi
  if ! screen -ls | grep -q "$base_screen"; then
    echo "[ERROR] ${base_screen} exited before ${base_tag} completed" >&2
    exit 1
  fi
  sleep 60
done

sleep 10
if screen -ls | grep -q "$base_screen"; then
  echo "== $(date '+%F %T') stopping original serial queue after Base completion =="
  screen -S "$base_screen" -X quit || true
fi

if ! screen -ls | grep -q "d4j_qwen14_sft_n10_s7402_gpu1"; then
  echo "== $(date '+%F %T') launching SFT-only continuation on GPU1 =="
  screen -dmS d4j_qwen14_sft_n10_s7402_gpu1 bash -lc \
    "cd /home/barty/GLEAM-Lab/PAFT && ./analysis_outputs/logs/run_d4j_qwen14_oldrecipe_sft_n10_seed7402_gpu1_20260704.sh > analysis_outputs/logs/run_d4j_qwen14_oldrecipe_sft_n10_seed7402_gpu1_20260704.log 2>&1"
fi

echo "== $(date '+%F %T') split supervisor done =="
