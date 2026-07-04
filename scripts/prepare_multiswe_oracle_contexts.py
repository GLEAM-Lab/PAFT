#!/usr/bin/env python3
"""Prepare oracle-file Multi-SWE Java contexts for generator-swap experiments.

The output is a JSONL file that contains the problem statement, gold changed
file paths, and buggy file contents read from local Git object databases at the
benchmark base commit. It does not expose the gold patch to the model prompt.
"""

from __future__ import annotations

import argparse
import json
import re
import subprocess
from pathlib import Path
from typing import Any

from datasets import Dataset


DEFAULT_ARROW = Path(
    "/home/barty/.cache/huggingface/datasets/"
    "Daoguang___multi-swe-bench/default/0.0.0/"
    "8bd202138a4ab9987daa77111c76a3e66af9f1c9/"
    "multi-swe-bench-java_verified.arrow"
)

REPO_CANDIDATES = {
    "apache/dubbo": [
        Path("/home/barty/research/dubbo"),
        Path("/home/barty/GLEAM-Lab/KGCompass/apache/dubbo"),
    ],
    "google/gson": [
        Path("/home/barty/research/gson"),
        Path("/home/barty/GLEAM-Lab/KGCompass/google/gson"),
    ],
    "googlecontainertools/jib": [
        Path("/home/barty/research/jib"),
        Path("/home/barty/GLEAM-Lab/KGCompass/googlecontainertools/jib"),
    ],
    "fasterxml/jackson-core": [
        Path("/home/barty/research/jackson-core"),
        Path("/home/barty/GLEAM-Lab/KGCompass/fasterxml/jackson-core"),
    ],
    "fasterxml/jackson-databind": [
        Path("/home/barty/research/jackson-databind"),
        Path("/home/barty/GLEAM-Lab/KGCompass/fasterxml/jackson-databind"),
    ],
    "fasterxml/jackson-dataformat-xml": [
        Path("/home/barty/research/jackson-dataformat-xml"),
        Path("/home/barty/GLEAM-Lab/KGCompass/fasterxml/jackson-dataformat-xml"),
    ],
}


def changed_files_from_patch(patch: str) -> list[str]:
    files: list[str] = []
    for match in re.finditer(r"^diff --git a/(.*?) b/(.*?)$", patch or "", flags=re.MULTILINE):
        files.append(match.group(2))
    return files


def hunk_ranges_by_file(patch: str) -> dict[str, list[tuple[int, int]]]:
    ranges: dict[str, list[tuple[int, int]]] = {}
    current_file = ""
    for line in (patch or "").splitlines():
        file_match = re.match(r"^diff --git a/(.*?) b/(.*?)$", line)
        if file_match:
            current_file = file_match.group(2)
            ranges.setdefault(current_file, [])
            continue
        hunk_match = re.match(r"^@@ -(\d+)(?:,(\d+))? \+\d+(?:,\d+)? @@", line)
        if hunk_match and current_file:
            start = int(hunk_match.group(1))
            count = int(hunk_match.group(2) or "1")
            end = start + max(count, 1) - 1
            ranges[current_file].append((start, end))
    return ranges


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


def git_ok(repo: Path, spec: str) -> bool:
    return (
        subprocess.run(
            ["git", "-C", str(repo), "cat-file", "-e", spec],
            stdout=subprocess.DEVNULL,
            stderr=subprocess.DEVNULL,
            check=False,
        ).returncode
        == 0
    )


def git_show(repo: Path, spec: str) -> str | None:
    proc = subprocess.run(
        ["git", "-C", str(repo), "show", spec],
        stdout=subprocess.PIPE,
        stderr=subprocess.DEVNULL,
        text=True,
        encoding="utf-8",
        errors="replace",
        check=False,
    )
    return proc.stdout if proc.returncode == 0 else None


def merge_windows(ranges: list[tuple[int, int]], total_lines: int, context_lines: int) -> list[tuple[int, int]]:
    windows: list[tuple[int, int]] = []
    for start, end in ranges:
        left = max(1, start - context_lines)
        right = min(total_lines, end + context_lines)
        if not windows or left > windows[-1][1] + 1:
            windows.append((left, right))
        else:
            windows[-1] = (windows[-1][0], max(windows[-1][1], right))
    return windows


def build_snippets(content: str | None, ranges: list[tuple[int, int]], context_lines: int) -> list[dict[str, Any]]:
    if content is None:
        return []
    lines = content.splitlines()
    if not ranges:
        return [{"start_line": 1, "end_line": len(lines), "text": content}]
    snippets = []
    for start, end in merge_windows(ranges, len(lines), context_lines):
        numbered = [
            f"{lineno}: {lines[lineno - 1]}"
            for lineno in range(start, end + 1)
            if 1 <= lineno <= len(lines)
        ]
        snippets.append({"start_line": start, "end_line": end, "text": "\n".join(numbered)})
    return snippets


def find_repo(repo_name: str, base_commit: str) -> Path | None:
    for repo in REPO_CANDIDATES.get(repo_name, []):
        if repo.exists() and git_ok(repo, f"{base_commit}^{{commit}}"):
            return repo
    return None


def build_prompt(row: dict[str, Any], files: list[dict[str, Any]]) -> str:
    chunks = [
        "You are a software engineer. Fix the Java issue.",
        "",
        "# Issue",
        str(row.get("problem_statement", "") or "").strip(),
        "",
        "# Buggy files",
    ]
    for file_record in files:
        path = file_record["path"]
        snippets = file_record.get("snippets") or []
        chunks.append(f"\n## {path}")
        if not file_record.get("exists_at_base"):
            chunks.append("(This file does not exist at the base commit; create it only if needed.)")
        elif snippets:
            for snippet in snippets:
                chunks.append(f"Lines {snippet['start_line']}-{snippet['end_line']}:")
                chunks.append("```java")
                chunks.append(str(snippet["text"]).rstrip())
                chunks.append("```")
        else:
            chunks.append("```java")
            chunks.append(str(file_record.get("buggy_content") or "").rstrip())
            chunks.append("```")
    chunks.extend(
        [
            "",
            "Return a unified diff patch.",
        ]
    )
    return "\n".join(chunks)


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("--arrow", default=str(DEFAULT_ARROW))
    parser.add_argument(
        "--manifest",
        default="analysis_outputs/multiswe_java_verified_stratified_smoke12_20260703.jsonl",
    )
    parser.add_argument(
        "--jsonl",
        default="analysis_outputs/multiswe_java_verified_stratified_smoke12_contexts_20260704.jsonl",
    )
    parser.add_argument(
        "--md",
        default="analysis_outputs/multiswe_java_verified_stratified_smoke12_contexts_20260704.md",
    )
    parser.add_argument("--context-lines", type=int, default=80)
    parser.add_argument("--runnable-jsonl", default="")
    parser.add_argument("--runnable-md", default="")
    parser.add_argument("--max-prompt-chars", type=int, default=0)
    args = parser.parse_args()

    ds = Dataset.from_file(str(Path(args.arrow)))
    by_id = {str(row["instance_id"]): dict(row) for row in ds}
    manifest_rows = [
        json.loads(line)
        for line in Path(args.manifest).read_text(encoding="utf-8").splitlines()
        if line.strip()
    ]

    records: list[dict[str, Any]] = []
    for manifest in manifest_rows:
        instance_id = str(manifest["instance_id"])
        row = by_id[instance_id]
        repo_name = str(row["repo"])
        base_commit = str(row["base_commit"])
        repo_dir = find_repo(repo_name, base_commit)
        patch_files = changed_files_from_patch(row.get("patch", "") or "")
        hunk_ranges = hunk_ranges_by_file(row.get("patch", "") or "")
        file_records: list[dict[str, Any]] = []
        for path in patch_files:
            content = None
            exists_at_base = False
            if repo_dir is not None:
                content = git_show(repo_dir, f"{base_commit}:{path}")
                exists_at_base = content is not None
            snippets = build_snippets(content, hunk_ranges.get(path, []), args.context_lines)
            file_records.append(
                {
                    "path": path,
                    "exists_at_base": exists_at_base,
                    "buggy_content": content,
                    "buggy_chars": len(content or ""),
                    "hunk_ranges": hunk_ranges.get(path, []),
                    "snippets": snippets,
                    "snippet_chars": sum(len(snippet["text"]) for snippet in snippets),
                }
            )

        records.append(
            {
                "instance_id": instance_id,
                "repo": repo_name,
                "pull_number": row.get("pull_number"),
                "repo_dir": str(repo_dir) if repo_dir else None,
                "base_commit": base_commit,
                "bucket": manifest.get("bucket"),
                "problem_statement": row.get("problem_statement", ""),
                "hints_text": row.get("hints_text", ""),
                "fail_to_pass": parse_json_list(row.get("FAIL_TO_PASS")),
                "pass_to_pass": parse_json_list(row.get("PASS_TO_PASS")),
                "patch_file_count": len(patch_files),
                "patch_files": patch_files,
                "files": file_records,
                "missing_base_files": [item["path"] for item in file_records if not item["exists_at_base"]],
                "test_patch": row.get("test_patch", ""),
                "gold_patch": row.get("patch", ""),
                "prompt": build_prompt(row, file_records),
            }
        )

    output = Path(args.jsonl)
    output.parent.mkdir(parents=True, exist_ok=True)
    with output.open("w", encoding="utf-8") as handle:
        for record in records:
            handle.write(json.dumps(record, ensure_ascii=False) + "\n")

    total_files = sum(len(record["files"]) for record in records)
    missing = sum(len(record["missing_base_files"]) for record in records)
    total_prompt_chars = sum(len(record["prompt"]) for record in records)
    lines = [
        "# Multi-SWE Java Oracle-File Contexts",
        "",
        "This is a generated input artifact for a fixed generator-swap smoke test. Gold patches are retained for later metrics only; prompts include issue text and buggy oracle files, not the gold patch.",
        "",
        f"- Source manifest: `{args.manifest}`",
        f"- Output JSONL: `{args.jsonl}`",
        f"- Instances: {len(records)}",
        f"- Gold changed files: {total_files}",
        f"- Missing-at-base files: {missing}",
        f"- Context window: +/-{args.context_lines} lines around gold hunks",
        f"- Average prompt chars: {total_prompt_chars / len(records):.1f}",
        "",
        "| Instance | Bucket | Repo | Files | Missing at base | Prompt chars | Repo cache |",
        "|---|---|---|---:|---:|---:|---|",
    ]
    for record in records:
        lines.append(
            f"| `{record['instance_id']}` | `{record['bucket']}` | `{record['repo']}` | "
            f"{record['patch_file_count']} | {len(record['missing_base_files'])} | "
            f"{len(record['prompt'])} | "
            f"`{record['repo_dir'] or '-'}` |"
        )
    Path(args.md).write_text("\n".join(lines) + "\n", encoding="utf-8")
    if args.runnable_jsonl and args.max_prompt_chars > 0:
        runnable = [record for record in records if len(record["prompt"]) <= args.max_prompt_chars]
        runnable_jsonl = Path(args.runnable_jsonl)
        runnable_jsonl.parent.mkdir(parents=True, exist_ok=True)
        with runnable_jsonl.open("w", encoding="utf-8") as handle:
            for record in runnable:
                handle.write(json.dumps(record, ensure_ascii=False) + "\n")
        if args.runnable_md:
            runnable_lines = [
                "# Runnable Multi-SWE Java Oracle-File Smoke Subset",
                "",
                f"- Source contexts: `{args.jsonl}`",
                f"- Output JSONL: `{args.runnable_jsonl}`",
                f"- Max prompt chars: {args.max_prompt_chars}",
                f"- Instances retained: {len(runnable)}/{len(records)}",
                "",
                "| Instance | Bucket | Repo | Files | Prompt chars |",
                "|---|---|---|---:|---:|",
            ]
            for record in runnable:
                runnable_lines.append(
                    f"| `{record['instance_id']}` | `{record['bucket']}` | `{record['repo']}` | "
                    f"{record['patch_file_count']} | {len(record['prompt'])} |"
                )
            Path(args.runnable_md).write_text("\n".join(runnable_lines) + "\n", encoding="utf-8")
    print(f"wrote {args.jsonl}")
    print(f"wrote {args.md}")
    if args.runnable_jsonl and args.max_prompt_chars > 0:
        print(f"wrote {args.runnable_jsonl}")
        if args.runnable_md:
            print(f"wrote {args.runnable_md}")
    print(f"instances={len(records)} files={total_files} missing_at_base={missing}")


if __name__ == "__main__":
    main()
