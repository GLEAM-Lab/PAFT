#!/usr/bin/env python3
"""Copy HumanEval-Java generations and normalize package declarations.

The benchmark tests call classes under humaneval.buggy. Some generators emit
package names such as humaneval.fixed or humaneval.fix; those are format errors
for this harness rather than semantic repair decisions. This script keeps raw
outputs intact and writes a separate normalized result tree for rejudging.
"""

from __future__ import annotations

import argparse
import json
from pathlib import Path
import re
import shutil


PACKAGE_RE = re.compile(r"(?m)^\s*package\s+[\w.]+\s*;\s*")
TARGET_PACKAGE = "package humaneval.buggy;\n"


def normalize_java(text: str) -> tuple[str, str]:
    match = PACKAGE_RE.search(text)
    if match:
        before = match.group(0).strip()
        return PACKAGE_RE.sub(TARGET_PACKAGE, text, count=1), before
    return TARGET_PACKAGE + "\n" + text, "<none>"


def copy_model(root: Path, source_key: str, dest_key: str, overwrite: bool) -> dict[str, object]:
    source = root / "evalrepair-java-res" / source_key
    dest = root / "evalrepair-java-res" / dest_key
    if not source.exists():
        raise FileNotFoundError(source)
    if dest.exists() and overwrite:
        shutil.rmtree(dest)
    dest.mkdir(parents=True, exist_ok=True)

    package_counts: dict[str, int] = {}
    java_count = 0
    copied_logs = 0
    for java_file in sorted(source.glob("fixed*/*.java")):
        rel = java_file.relative_to(source)
        out_java = dest / rel
        out_java.parent.mkdir(parents=True, exist_ok=True)
        normalized, original_package = normalize_java(java_file.read_text(encoding="utf-8", errors="ignore"))
        out_java.write_text(normalized, encoding="utf-8")
        package_counts[original_package] = package_counts.get(original_package, 0) + 1
        java_count += 1

        log_file = Path(str(java_file) + ".log")
        if log_file.exists():
            shutil.copy2(log_file, Path(str(out_java) + ".log"))
            copied_logs += 1

    manifest = {
        "source_key": source_key,
        "dest_key": dest_key,
        "java_count": java_count,
        "copied_logs": copied_logs,
        "target_package": TARGET_PACKAGE.strip(),
        "original_package_counts": dict(sorted(package_counts.items(), key=lambda kv: (-kv[1], kv[0]))),
    }
    (dest / "PACKAGE_NORMALIZATION.json").write_text(json.dumps(manifest, indent=2), encoding="utf-8")
    return manifest


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("--root", default="/home/barty/GLEAM-Lab/PAFT")
    parser.add_argument("--suffix", default="-pkgfix")
    parser.add_argument("--overwrite", action="store_true")
    parser.add_argument("models", nargs="+")
    args = parser.parse_args()

    root = Path(args.root)
    manifests = []
    for model in args.models:
        dest = f"{model}{args.suffix}"
        manifest = copy_model(root, model, dest, args.overwrite)
        manifests.append(manifest)
        print(json.dumps(manifest, ensure_ascii=False), flush=True)

    out_dir = root / "analysis_outputs"
    out_dir.mkdir(parents=True, exist_ok=True)
    summary = out_dir / "humaneval_java_package_normalization_20260703.json"
    existing = []
    if summary.exists():
        try:
            existing = json.loads(summary.read_text(encoding="utf-8"))
        except Exception:
            existing = []
    existing.extend(manifests)
    summary.write_text(json.dumps(existing, indent=2), encoding="utf-8")


if __name__ == "__main__":
    main()
