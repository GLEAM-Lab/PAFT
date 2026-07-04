#!/usr/bin/env python3
"""Parallel HumanEval-Java rejudging with isolated Maven worktrees."""

from __future__ import annotations

import argparse
import json
import os
from pathlib import Path
import queue
import shutil
import subprocess
import threading
from typing import Iterable


def iter_jobs(root: Path, model: str, skip_existing: bool) -> Iterable[tuple[int, str, Path]]:
    result_base = root / "evalrepair-java-res" / model
    for fixed_id in range(10):
        fixed_dir = result_base / f"fixed{fixed_id}"
        if not fixed_dir.exists():
            continue
        for java_file in sorted(fixed_dir.glob("*.java")):
            result_file = Path(str(java_file) + ".result")
            if skip_existing and result_file.exists():
                continue
            yield fixed_id, java_file.stem, java_file


def prepare_worker(root: Path, worker_root: Path, worker_id: int) -> Path:
    src = root / "evalrepair-java"
    dst = worker_root / f"evalrepair-java-w{worker_id}"
    if dst.exists():
        shutil.rmtree(dst)
    ignore = shutil.ignore_patterns(".git", "target")
    shutil.copytree(src, dst, ignore=ignore)
    return dst


def reset_origin(worker_dir: Path) -> None:
    origin_dir = worker_dir / "origin"
    buggy_dir = worker_dir / "src" / "main" / "java" / "humaneval" / "buggy"
    buggy_dir.mkdir(parents=True, exist_ok=True)
    for origin_file in origin_dir.glob("*.java"):
        shutil.copy2(origin_file, buggy_dir / origin_file.name)


def run_one(
    worker_dir: Path,
    java_file: Path,
    bug_name: str,
    env: dict[str, str],
    offline: bool,
    test_timeout: int,
) -> int:
    reset_origin(worker_dir)
    target = worker_dir / "src" / "main" / "java" / "humaneval" / "buggy" / java_file.name
    shutil.copy2(java_file, target)
    cmd = ["timeout", f"{test_timeout}s", "mvn"]
    if offline:
        cmd.append("-o")
    cmd.extend(["-q", "test", f"-Dtest=TEST_{bug_name}"])
    proc = subprocess.run(
        cmd,
        cwd=worker_dir,
        env=env,
        stdout=subprocess.DEVNULL,
        stderr=subprocess.DEVNULL,
        timeout=test_timeout + 20,
        check=False,
    )
    return int(proc.returncode)


def prebuild_worker(worker_dir: Path, env: dict[str, str], offline: bool) -> None:
    reset_origin(worker_dir)
    cmd = ["timeout", "5m", "mvn"]
    if offline:
        cmd.append("-o")
    cmd.extend(["-q", "-DskipTests", "test"])
    proc = subprocess.run(
        cmd,
        cwd=worker_dir,
        env=env,
        stdout=subprocess.DEVNULL,
        stderr=subprocess.DEVNULL,
        timeout=320,
        check=False,
    )
    if proc.returncode != 0:
        raise RuntimeError(f"worker prebuild failed in {worker_dir} with rc={proc.returncode}")


def worker_loop(
    worker_id: int,
    worker_dir: Path,
    jobs: "queue.Queue[tuple[int, str, Path] | None]",
    env: dict[str, str],
    offline: bool,
    test_timeout: int,
    lock: threading.Lock,
    counts: dict[str, int],
) -> None:
    while True:
        job = jobs.get()
        if job is None:
            jobs.task_done()
            return
        fixed_id, bug_name, java_file = job
        try:
            ret = run_one(worker_dir, java_file, bug_name, env, offline, test_timeout)
        except Exception:
            ret = 125
        result_file = Path(str(java_file) + ".result")
        result_file.write_text(json.dumps({"return_code": ret}), encoding="utf-8")
        with lock:
            counts["done"] += 1
            if ret == 0:
                counts["pass"] += 1
            done = counts["done"]
            total = counts["total"]
            if done % 50 == 0 or done == total:
                print(f"[progress] {done}/{total} done, plausible_patches={counts['pass']}", flush=True)
        jobs.task_done()


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("--root", default="/home/barty/GLEAM-Lab/PAFT")
    parser.add_argument("--models", nargs="+", required=True)
    parser.add_argument("--workers", type=int, default=8)
    parser.add_argument("--skip-existing", action="store_true")
    parser.add_argument("--offline", action="store_true")
    parser.add_argument("--test-timeout", type=int, default=60)
    parser.add_argument("--maven-home", default="/home/barty/tools/apache-maven-3.9.9")
    parser.add_argument("--maven-repo", default="/home/barty/.m2-paftp/repository")
    args = parser.parse_args()

    root = Path(args.root)
    env = os.environ.copy()
    env["PATH"] = f"{args.maven_home}/bin:" + env.get("PATH", "")
    env["MAVEN_OPTS"] = f"-Dmaven.repo.local={args.maven_repo}"
    env["TMPDIR"] = str(root / "tmp")

    for model in args.models:
        all_jobs = list(iter_jobs(root, model, args.skip_existing))
        print(f"[model] {model}: jobs={len(all_jobs)} workers={args.workers}", flush=True)
        if not all_jobs:
            continue
        worker_root = root / "tmp" / "humaneval-java-workers" / model
        worker_root.mkdir(parents=True, exist_ok=True)
        q: "queue.Queue[tuple[int, str, Path] | None]" = queue.Queue()
        counts = {"done": 0, "pass": 0, "total": len(all_jobs)}
        lock = threading.Lock()
        threads = []
        for worker_id in range(args.workers):
            worker_dir = prepare_worker(root, worker_root, worker_id)
            prebuild_worker(worker_dir, env, args.offline)
            thread = threading.Thread(
                target=worker_loop,
                args=(worker_id, worker_dir, q, env, args.offline, args.test_timeout, lock, counts),
                daemon=True,
            )
            thread.start()
            threads.append(thread)
        for job in all_jobs:
            q.put(job)
        for _ in threads:
            q.put(None)
        q.join()
        for thread in threads:
            thread.join()
        print(f"[model] {model}: done={counts['done']} plausible_patches={counts['pass']}", flush=True)


if __name__ == "__main__":
    main()
