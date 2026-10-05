#!/usr/bin/env bash
# E7 robustness check: rerun the E3/E4 analyses with the faults that the base
# model reproduced near-verbatim (E7 prefix probe, LCP >= 0.9) removed.
#
# Produces, for every backbone and for the E1 A/C/D batch, a *_full.txt and a
# *_excl.txt under analysis_outputs/e7_robustness/.
set -u
cd /root/autodl-tmp/PAFT

EX=analysis_outputs/tse_revision_e7_leak_memorized_faults.txt
OUT=analysis_outputs/e7_robustness
PY=${PY:-python}
TMP=${TMP:-/tmp/paft-e7}

mkdir -p "$OUT"

# --- paper-facing open-backbone bundles, extracted into a clean tree --------
if [ ! -d "$TMP" ]; then
  mkdir -p "$TMP"
  tar --zstd -xf analysis_outputs/d4j_qwen25_7b_paper_results_20260710.tar.zst -C "$TMP"
  tar --zstd -xf analysis_outputs/d4j_qwen25_14b_paper_results_20260710.tar.zst -C "$TMP"
  tar --zstd -xf analysis_outputs/d4j_qwen3_8b_paper_results_20260710.tar.zst -C "$TMP"
fi

find_dir () {
  local n
  n=$(find "$TMP" -maxdepth 3 -type d -name "$1" | head -1)
  if [ -z "$n" ]; then echo "MISSING_DIR $1" >&2; exit 1; fi
  echo "$n"
}

Q3=$(find_dir qwen3-8b)
Q3S=$(find_dir qwen8b-sft)
Q3P=$(find_dir qwen8b-paft)
Q7=$(find_dir qwen2.5coder7b)
Q7S=$(find_dir qwen2.5coder7b-sft-tse-20260619)
Q7P=$(find_dir qwen2.5coder7b-paft)
Q14=$(find_dir qwen2.5coder14b-d4j-n10-s7401)
Q14S=$(find_dir qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620-d4j-n10-s7401)
Q14P=$(find_dir qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620-d4j-n10-s7401)
echo "resolved bundles under $TMP"

run () {
  local label="$1"; shift
  echo "=== $label full ==="
  $PY scripts/tse_rev_overedit_and_strata.py --dataset defects4j/dataset "$@" \
    > "$OUT/${label}_full.txt" 2>&1
  echo "=== $label excl ==="
  $PY scripts/tse_rev_overedit_and_strata.py --dataset defects4j/dataset \
    --exclude-faults "$EX" "$@" > "$OUT/${label}_excl.txt" 2>&1
}

run dscoder \
  --trio "DS-Coder-6.7B=defects4j/results/deepseek-6.7b,defects4j/results/deepseek-6.7b-promptloss,defects4j/results/deepseek-6.7b-paft" \
  --set "Base=defects4j/results/deepseek-6.7b" \
  --set "SFT=defects4j/results/deepseek-6.7b-promptloss" \
  --set "PAFT=defects4j/results/deepseek-6.7b-paft"

run opencoder \
  --trio "OpenCoder-8B=defects4j/results/opencoder8b,defects4j/results/opencoder8b-sft,defects4j/results/opencoder8b-paft"

run qwen3 \
  --trio "Qwen3-8B=$Q3,$Q3S,$Q3P"

run qwen7 \
  --trio "Qwen2.5-Coder-7B=$Q7,$Q7S,$Q7P"

run qwen14 \
  --trio "Qwen2.5-Coder-14B=$Q14,$Q14S,$Q14P"

run e1cad \
  --trio "E1-CAD=defects4j/results/deepseek-6.7b-sft-plain-fixed,defects4j/results/deepseek-6.7b-a-plain-fixed,defects4j/results/deepseek-6.7b-paft-plain-fixed" \
  --set "C SFT=defects4j/results/deepseek-6.7b-sft-plain-fixed" \
  --set "A=defects4j/results/deepseek-6.7b-a-plain-fixed" \
  --set "D PAFT=defects4j/results/deepseek-6.7b-paft-plain-fixed"

echo "ALL DONE"
ls -la "$OUT"
