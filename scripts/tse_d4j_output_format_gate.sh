#!/usr/bin/env bash
set -euo pipefail

usage() {
  cat >&2 <<'USAGE'
Usage:
  scripts/tse_d4j_output_format_gate.sh <result-tag> [results-root]

Checks an already-generated Defects4J fixed0 directory before expensive
validation. Use after a 10-20 bug smoke generation and before full D4J testing.

Environment overrides:
  MIN_FILES              default: 10
  MIN_JAVA_LIKE_PCT      default: 70
  MAX_PROSE_LIKE_PCT     default: 5
  OUT_CSV                default: analysis_outputs/<tag>_output_format_gate.csv

Example:
  MIN_FILES=20 scripts/tse_d4j_output_format_gate.sh tse_ms_dscoder67b_paft_w2_s101_20260621
USAGE
}

if [[ "${1:-}" == "-h" || "${1:-}" == "--help" || $# -lt 1 ]]; then
  usage
  exit 0
fi

tag="$1"
results_root="${2:-/home/barty/research/prorepair/defects4j/results}"
repo_root="$(cd "$(dirname "$0")/.." && pwd)"

min_files="${MIN_FILES:-10}"
min_java_like_pct="${MIN_JAVA_LIKE_PCT:-70}"
max_prose_like_pct="${MAX_PROSE_LIKE_PCT:-5}"
out_csv="${OUT_CSV:-${repo_root}/analysis_outputs/${tag}_output_format_gate.csv}"

python3 "${repo_root}/scripts/check_d4j_output_format.py" \
  --root "${results_root}" \
  --fixed fixed0 \
  --models "${tag}" \
  --csv "${out_csv}" \
  --min-files "${min_files}" \
  --min-java-like-pct "${min_java_like_pct}" \
  --max-prose-like-pct "${max_prose_like_pct}"

echo "output-format gate passed for ${tag}; csv=${out_csv}"
