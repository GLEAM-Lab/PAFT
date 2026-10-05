#!/usr/bin/env bash
# E5 validation supervisor.
#
# Keeps at most two validators running and restarts any that died before finishing.
# Completion is decided by counting the validated faults against the number of faults
# that actually have 10 non-empty candidates, not by a log marker (the marker is not
# written when test_d4j.py is launched directly). test_d4j.py resumes from the .result
# files that are already on disk.
set -u
cd /root/autodl-tmp/PAFT
export PATH="$PWD/defects4j-framework/framework/bin:$PATH"
export JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64
PY=/root/miniconda3/envs/paft/bin/python

TAGS=(
  "prompting-plain-rerun:e5_plain"
  "prompting-minimal:e5_minimal"
  "prompting-emphatic-rerun:e5_emphatic"
  "prompting-fewshot:e5_fewshot"
)

log() { echo "[sup] $* $(date -Is)"; }

expected_for() {
  "$PY" - "$1" <<'PY'
import glob, json, os, sys
tag = sys.argv[1]
root = os.path.join("defects4j", "results", tag)
n = 0
for j in sorted(glob.glob(os.path.join(root, "fixed0", "*.json"))):
    bug = os.path.basename(j)
    if bug.endswith(".log") or bug.endswith(".result"):
        continue
    stem = bug[:-5]
    ok = True
    for k in range(10):
        p = os.path.join(root, f"fixed{k}", f"{stem}.json")
        if not os.path.exists(p):
            ok = False
            break
        try:
            if not (json.load(open(p, encoding="utf-8", errors="replace")).get("fix") or "").strip():
                ok = False
                break
        except Exception:
            ok = False
            break
    if ok:
        n += 1
print(n)
PY
}

judged_for() {
  ls "defects4j/results/$1/fixed0"/*.json.result 2>/dev/null | wc -l
}

declare -A EXPECTED
declare -A ATTEMPTS
declare -A LASTJUDGED
declare -A GAVEUP
for entry in "${TAGS[@]}"; do
  tag="${entry%%:*}"
  EXPECTED[$tag]=$(expected_for "$tag")
  ATTEMPTS[$tag]=0
  LASTJUDGED[$tag]=-1
  GAVEUP[$tag]=0
  log "expected validated faults for $tag: ${EXPECTED[$tag]}"
done

while true; do
  running=$(ps -eo args | grep -c "[t]est_d4j.py -m prompting-")
  all_done=1
  for entry in "${TAGS[@]}"; do
    tag="${entry%%:*}"
    ns="${entry##*:}"
    judged=$(judged_for "$tag")
    if [ "$judged" -ge "${EXPECTED[$tag]}" ] || [ "${GAVEUP[$tag]}" -eq 1 ]; then
      continue
    fi
    all_done=0
    if ps -eo args | grep -q "[t]est_d4j.py -m ${tag} "; then
      continue
    fi
    if [ "${ATTEMPTS[$tag]}" -ge 3 ] && [ "$judged" -le "${LASTJUDGED[$tag]}" ]; then
      GAVEUP[$tag]=1
      log "giving up on $tag after 3 stalled attempts ($judged/${EXPECTED[$tag]});"
      log "unvalidated faults for $tag stay missing in the report"
      continue
    fi
    if [ "$running" -ge 2 ]; then
      break
    fi
    log "starting $tag ($judged/${EXPECTED[$tag]})"
    ATTEMPTS[$tag]=$(( ATTEMPTS[$tag] + 1 ))
    LASTJUDGED[$tag]="$judged"
    setsid nohup env \
        PATH="$PATH" \
        JAVA_HOME="$JAVA_HOME" \
        D4J_VALIDATION_WORKERS=6 \
        D4J_VALIDATION_NAMESPACE="$ns" \
        "$PY" test_d4j.py -m "$tag" -n 10 \
        >> "logs/validate_$tag.log" 2>&1 &
    running=$((running + 1))
  done
  if [ "$all_done" -eq 1 ]; then
    log "all validators finished"
    break
  fi
  sleep 120
done
