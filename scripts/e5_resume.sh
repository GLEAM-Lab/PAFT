#!/usr/bin/env bash
# Idempotent E5 resume hook: starts the validation supervisor and the report finisher
# if they are not already running and the validation is not finished.
# Safe to call repeatedly (e.g. from ~/.bashrc after a container restart).
set -u
ROOT=/root/autodl-tmp/PAFT
cd "$ROOT" || exit 0
mkdir -p logs

# Returns 0 when the pid in $1 is alive AND its command line mentions $2.
alive() {
  local pidfile="$1" needle="$2"
  [ -f "$pidfile" ] || return 1
  local pid
  pid=$(cat "$pidfile" 2>/dev/null) || return 1
  [ -n "$pid" ] || return 1
  kill -0 "$pid" 2>/dev/null || return 1
  tr '\0' ' ' < "/proc/$pid/cmdline" 2>/dev/null | grep -q "$needle" || return 1
  return 0
}

if grep -q "all validators finished" logs/e5_supervisor.log 2>/dev/null; then
  exit 0
fi

if ! alive logs/e5_supervisor.pid e5_supervisor; then
  setsid nohup bash scripts/e5_supervisor.sh >> logs/e5_supervisor.log 2>&1 &
  echo $! > logs/e5_supervisor.pid
  sleep 3
fi

if ! alive logs/e5_finisher.pid e5_finisher; then
  setsid nohup bash scripts/e5_finisher.sh >> logs/e5_finisher_driver.log 2>&1 &
  echo $! > logs/e5_finisher.pid
fi
exit 0
