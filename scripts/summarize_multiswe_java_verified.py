#!/usr/bin/env python3
"""Summarize local Multi-SWE-bench Java Verified assets.

This script is intentionally descriptive. It records whether the local cache has
gold patches, regression tests, and multi-file repairs so the paper can plan a
system-level generator-swap experiment without claiming it has already been run.
"""

from __future__ import annotations

import argparse
import json
import re
from collections import Counter
from pathlib import Path
from typing import Any

from datasets import Dataset


DEFAULT_ARROW = Path(
    "/home/barty/.cache/huggingface/datasets/"
    "Daoguang___multi-swe-bench/default/0.0.0/"
    "8bd202138a4ab9987daa77111c76a3e66af9f1c9/"
    "multi-swe-bench-java_verified.arrow"
)


def changed_files_from_patch(patch: str) -> list[str]:
    return [
        match.group(2)
        for match in re.finditer(
            r"^diff --git a/(.*?) b/(.*?)$", patch or "", flags=re.MULTILINE
        )
    ]


def parse_json_list(value: Any) -> list[Any]:
    if isinstance(value, list):
        return value
    if isinstance(value, str):
        try:
            parsed = json.loads(value)
        except Exception:
            return []
        return parsed if isinstance(parsed, list) else []
    return []


def summarize(path: Path) -> tuple[dict[str, Any], list[dict[str, Any]]]:
    ds = Dataset.from_file(str(path))
    rows: list[dict[str, Any]] = []
    repo_counter: Counter[str] = Counter()
    patch_file_counter: Counter[int] = Counter()
    test_file_counter: Counter[int] = Counter()
    fail_to_pass_counter: Counter[int] = Counter()
    pass_to_pass_counter: Counter[int] = Counter()

    for raw in ds:
        row = dict(raw)
        patch_files = changed_files_from_patch(row.get("patch", "") or "")
        test_files = changed_files_from_patch(row.get("test_patch", "") or "")
        fail_to_pass = parse_json_list(row.get("FAIL_TO_PASS"))
        pass_to_pass = parse_json_list(row.get("PASS_TO_PASS"))
        repo = str(row.get("repo", ""))
        repo_counter[repo] += 1
        patch_file_counter[len(patch_files)] += 1
        test_file_counter[len(test_files)] += 1
        fail_to_pass_counter[len(fail_to_pass)] += 1
        pass_to_pass_counter[len(pass_to_pass)] += 1
        rows.append(
            {
                "instance_id": row.get("instance_id"),
                "repo": repo,
                "base_commit": row.get("base_commit"),
                "patch_file_count": len(patch_files),
                "patch_files": patch_files,
                "test_patch_file_count": len(test_files),
                "test_patch_files": test_files,
                "fail_to_pass_count": len(fail_to_pass),
                "pass_to_pass_count": len(pass_to_pass),
            }
        )

    multi_file = sum(1 for row in rows if row["patch_file_count"] > 1)
    summary = {
        "arrow": str(path),
        "rows": len(rows),
        "repo_top10": dict(repo_counter.most_common(10)),
        "patch_file_count_distribution": dict(sorted(patch_file_counter.items())),
        "test_patch_file_count_distribution": dict(sorted(test_file_counter.items())),
        "fail_to_pass_count_distribution": dict(sorted(fail_to_pass_counter.items())),
        "pass_to_pass_count_distribution": dict(sorted(pass_to_pass_counter.items())),
        "multi_file_rows": multi_file,
        "multi_file_pct": multi_file / len(rows) * 100 if rows else 0.0,
        "rows_with_gold_patch": sum(bool(row["patch_files"]) for row in rows),
        "rows_with_test_patch": sum(bool(row["test_patch_files"]) for row in rows),
    }
    return summary, rows


def write_stratified_manifest(source: Path, output: Path, per_bucket: int) -> None:
    ds = Dataset.from_file(str(source))
    buckets: dict[str, list[dict[str, Any]]] = {
        "single_file": [],
        "two_file": [],
        "three_plus_file": [],
    }
    for raw in ds:
        row = dict(raw)
        patch_files = changed_files_from_patch(row.get("patch", "") or "")
        test_files = changed_files_from_patch(row.get("test_patch", "") or "")
        fail_to_pass = parse_json_list(row.get("FAIL_TO_PASS"))
        pass_to_pass = parse_json_list(row.get("PASS_TO_PASS"))
        record = {
            "instance_id": row.get("instance_id"),
            "repo": row.get("repo"),
            "base_commit": row.get("base_commit"),
            "problem_statement_chars": len(str(row.get("problem_statement", "") or "")),
            "patch_file_count": len(patch_files),
            "patch_files": patch_files,
            "test_patch_file_count": len(test_files),
            "test_patch_files": test_files,
            "fail_to_pass": fail_to_pass,
            "pass_to_pass": pass_to_pass,
        }
        if len(patch_files) == 1:
            buckets["single_file"].append(record)
        elif len(patch_files) == 2:
            buckets["two_file"].append(record)
        elif len(patch_files) >= 3:
            buckets["three_plus_file"].append(record)

    selected: list[dict[str, Any]] = []
    for bucket_name in ["single_file", "two_file", "three_plus_file"]:
        rows = sorted(
            buckets[bucket_name],
            key=lambda item: (
                -int(item["patch_file_count"]) if bucket_name == "three_plus_file" else int(item["patch_file_count"]),
                str(item["repo"]),
                str(item["instance_id"]),
            ),
        )[:per_bucket]
        for item in rows:
            selected.append({"bucket": bucket_name, **item})

    output.parent.mkdir(parents=True, exist_ok=True)
    with output.open("w", encoding="utf-8") as handle:
        for item in selected:
            handle.write(json.dumps(item, ensure_ascii=False) + "\n")


def write_markdown(summary: dict[str, Any], rows: list[dict[str, Any]], path: Path) -> None:
    path.parent.mkdir(parents=True, exist_ok=True)
    lines = [
        "# Multi-SWE-bench Java Verified Asset Summary",
        "",
        "This is an asset audit, not a PAFT result. It identifies a local benchmark target for a future system-level generator-swap study.",
        "",
        "## Aggregate",
        "",
        f"- Arrow cache: `{summary['arrow']}`",
        f"- Rows: {summary['rows']}",
        f"- Rows with gold patches: {summary['rows_with_gold_patch']}",
        f"- Rows with test patches: {summary['rows_with_test_patch']}",
        f"- Multi-file gold patches: {summary['multi_file_rows']} ({summary['multi_file_pct']:.1f}%)",
        f"- Patch-file count distribution: `{summary['patch_file_count_distribution']}`",
        f"- Test-patch file count distribution: `{summary['test_patch_file_count_distribution']}`",
        "",
        "## Top Repositories",
        "",
        "| Repo | Rows |",
        "|---|---:|",
    ]
    for repo, count in summary["repo_top10"].items():
        lines.append(f"| `{repo}` | {count} |")
    lines.extend(
        [
            "",
            "## Smoke Instances",
            "",
            "| Instance | Repo | Gold files | Test files | F2P tests | P2P tests |",
            "|---|---|---:|---:|---:|---:|",
        ]
    )
    for row in sorted(rows, key=lambda item: (-item["patch_file_count"], str(item["instance_id"])))[:20]:
        lines.append(
            f"| `{row['instance_id']}` | `{row['repo']}` | "
            f"{row['patch_file_count']} | {row['test_patch_file_count']} | "
            f"{row['fail_to_pass_count']} | {row['pass_to_pass_count']} |"
        )
    lines.extend(
        [
            "",
            "## Suggested Generator-Swap Protocol",
            "",
            "- Fix the instance subset, localization/context provider, candidate count, test protocol, and reranker.",
            "- Swap only the generator among Base, SFT, and PAFT.",
            "- Report end-to-end plausible rate plus AED/CCR against gold patches for generated plausible patches.",
            "- Keep this separate from generator-level Defects4J tables because the pipeline includes localization, retrieval, validation, and selection.",
        ]
    )
    path.write_text("\n".join(lines) + "\n", encoding="utf-8")


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("--arrow", default=str(DEFAULT_ARROW))
    parser.add_argument("--json", default="analysis_outputs/multiswe_java_verified_summary_20260703.json")
    parser.add_argument("--md", default="analysis_outputs/multiswe_java_verified_summary_20260703.md")
    parser.add_argument(
        "--stratified-jsonl",
        default="analysis_outputs/multiswe_java_verified_stratified_smoke12_20260703.jsonl",
    )
    parser.add_argument("--per-bucket", type=int, default=4)
    args = parser.parse_args()

    arrow = Path(args.arrow)
    summary, rows = summarize(arrow)
    Path(args.json).parent.mkdir(parents=True, exist_ok=True)
    Path(args.json).write_text(
        json.dumps({"summary": summary, "rows": rows}, indent=2, ensure_ascii=False) + "\n",
        encoding="utf-8",
    )
    write_markdown(summary, rows, Path(args.md))
    write_stratified_manifest(arrow, Path(args.stratified_jsonl), args.per_bucket)
    print(
        f"rows={summary['rows']} multi_file={summary['multi_file_rows']} "
        f"({summary['multi_file_pct']:.1f}%)"
    )
    print(f"wrote {args.stratified_jsonl}")


if __name__ == "__main__":
    main()
