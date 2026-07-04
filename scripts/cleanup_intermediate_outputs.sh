#!/usr/bin/env bash
set -euo pipefail

allowed_roots=(
  /home/barty/research/morepair
  /home/barty/research/prorepair
  /home/barty/GLEAM-Lab/PAFT
)

targets=(
  /home/barty/research/morepair/.git/lfs/tmp
  /home/barty/research/morepair/.git/lfs/cache
  /home/barty/research/morepair/__pycache__
  /home/barty/research/morepair/evalrepair-java/__pycache__
  /home/barty/research/prorepair/__pycache__
  /home/barty/GLEAM-Lab/PAFT/tmp
  /home/barty/GLEAM-Lab/PAFT/__pycache__
  /home/barty/GLEAM-Lab/PAFT/scripts/__pycache__
  /home/barty/GLEAM-Lab/PAFT/data/QuixBugs/python_testcases/__pycache__
  /home/barty/GLEAM-Lab/PAFT/data/QuixBugs/correct_python_programs/__pycache__
  /home/barty/GLEAM-Lab/PAFT/data/QuixBugs/.pytest_cache
)

safe_to_delete() {
  local target="$1"
  local resolved root resolved_root
  resolved="$(realpath -m "$target")"
  for root in "${allowed_roots[@]}"; do
    resolved_root="$(realpath -m "$root")"
    case "$resolved" in
      "$resolved_root"/*) return 0 ;;
    esac
  done
  return 1
}

for target in "${targets[@]}"; do
  [[ -e "$target" ]] || continue
  if ! safe_to_delete "$target"; then
    echo "SKIP outside allowed roots: $target" >&2
    continue
  fi
  size="$(du -sh "$target" 2>/dev/null | cut -f1 || true)"
  rm -rf -- "$target"
  echo "removed ${size:-unknown} $target"
done

echo "remaining checkpoint directories:"
find /home/barty/research/morepair /home/barty/research/prorepair /home/barty/GLEAM-Lab/PAFT \
  -type d -name 'checkpoint-*' -print 2>/dev/null | head -20

df -h /home
