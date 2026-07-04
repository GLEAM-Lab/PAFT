#!/usr/bin/env python3
"""Audit local system-level APR assets for a PAFT generator-swap study."""

from __future__ import annotations

import argparse
import json
import re
from collections import Counter
from pathlib import Path
from typing import Any

from datasets import Dataset


DEFAULT_CACHE_ROOT = Path("/home/barty/.cache/huggingface/datasets")
DEFAULT_AGENTLESS = Path("/home/barty/research/Agentless")
DEFAULT_KGCOMPASS = Path("/home/barty/GLEAM-Lab/KGCompass")


def safe_json(path: Path) -> Any:
    try:
        return json.loads(path.read_text(encoding="utf-8"))
    except Exception:
        return None


def summarize_arrow(path: Path) -> dict[str, Any]:
    ds = Dataset.from_file(str(path))
    columns = list(ds.column_names)
    rows = len(ds)
    sample = ds[0] if rows else {}
    language_counts: dict[str, int] = {}
    if "language" in columns:
        language_counts = dict(Counter(str(x) for x in ds["language"]))
    elif "java" in path.name.lower():
        language_counts = {"java": rows}

    repo_counts = {}
    if "repo" in columns:
        repo_counts = dict(Counter(str(x) for x in ds["repo"]).most_common(10))

    patch_like = [name for name in columns if "patch" in name.lower()]
    test_like = [name for name in columns if "test" in name.lower()]
    id_value = sample.get("instance_id") or sample.get("id") or sample.get("task_id")
    return {
        "path": str(path),
        "rows": rows,
        "columns": columns,
        "patch_like_columns": patch_like,
        "test_like_columns": test_like,
        "language_counts": language_counts,
        "repo_top10": repo_counts,
        "sample_id": id_value,
        "has_gold_patch": any(name in columns for name in ("patch", "gold_patch")),
        "has_test_patch": "test_patch" in columns,
        "has_problem_statement": "problem_statement" in columns,
    }


def audit_datasets(cache_root: Path) -> list[dict[str, Any]]:
    arrows = sorted(
        path
        for path in cache_root.rglob("*.arrow")
        if "swe" in str(path).lower()
        and not path.name.startswith("cache-")
    )
    summaries = []
    for path in arrows:
        try:
            summaries.append(summarize_arrow(path))
        except Exception as exc:
            summaries.append({"path": str(path), "error": str(exc)})
    return summaries


def audit_agentless(path: Path) -> dict[str, Any]:
    readme = path / "README_swebench.md"
    text = readme.read_text(encoding="utf-8", errors="replace") if readme.exists() else ""
    markers = {
        "supports_lite_verified": "SWE-Bench Lite" in text and "SWE-Bench Verified" in text,
        "uses_openai_api": "OPENAI_API_KEY" in text or "OpenAI" in text,
        "has_localization": "Localization" in text and "localize.py" in text,
        "has_retrieval": "retrieve.py" in text or "embedding" in text,
        "has_repair_samples": "--max_samples 10" in text,
        "has_patch_selection": "rerank.py" in text and "Patch Validation" in text,
    }
    files = [
        "agentless/fl/localize.py",
        "agentless/fl/retrieve.py",
        "agentless/repair/repair.py",
        "agentless/repair/rerank.py",
        "agentless/test/run_tests.py",
    ]
    return {
        "path": str(path),
        "exists": path.exists(),
        "readme": str(readme) if readme.exists() else "",
        "markers": markers,
        "key_files": {name: (path / name).exists() for name in files},
    }


def audit_kgcompass(path: Path) -> dict[str, Any]:
    summary_files = sorted(path.glob("**/summary.json"))
    compact = []
    for file_path in summary_files[:30]:
        data = safe_json(file_path)
        if isinstance(data, dict):
            compact.append(
                {
                    "path": str(file_path),
                    "evaluated": data.get("evaluated"),
                    "passed_regression": data.get("passed_regression"),
                    "round_tag": data.get("round_tag"),
                }
            )
    project_structures = sorted(path.glob("temp_run/agentless_project_structures*/*.json"))
    patch_outputs = sorted(path.glob("**/predictions.jsonl")) + sorted(path.glob("**/passing_patches.jsonl"))
    return {
        "path": str(path),
        "exists": path.exists(),
        "summary_files_count": len(summary_files),
        "summaries_sample": compact,
        "agentless_project_structure_count": len(project_structures),
        "patch_output_count": len(patch_outputs),
        "patch_outputs_sample": [str(p) for p in patch_outputs[:20]],
    }


def changed_files_from_patch(patch: str) -> list[str]:
    files = []
    for match in re.finditer(r"^diff --git a/(.*?) b/(.*?)$", patch or "", flags=re.MULTILINE):
        files.append(match.group(2))
    return files


def summarize_multiswe_java_verified(cache_root: Path) -> dict[str, Any]:
    java_arrows = sorted(cache_root.rglob("multi-swe-bench-java_verified.arrow"))
    if not java_arrows:
        return {}
    arrow = java_arrows[0]
    ds = Dataset.from_file(str(arrow))
    patch_file_counts: Counter[int] = Counter()
    test_patch_file_counts: Counter[int] = Counter()
    rows_with_gold_patch = 0
    rows_with_test_patch = 0
    multi_file_rows = 0
    repo_counts: Counter[str] = Counter()
    for raw in ds:
        row = dict(raw)
        patch_files = changed_files_from_patch(row.get("patch", "") or "")
        test_files = changed_files_from_patch(row.get("test_patch", "") or "")
        repo_counts[str(row.get("repo", ""))] += 1
        patch_file_counts[len(patch_files)] += 1
        test_patch_file_counts[len(test_files)] += 1
        rows_with_gold_patch += int(bool(patch_files))
        rows_with_test_patch += int(bool(test_files))
        multi_file_rows += int(len(patch_files) > 1)
    rows = len(ds)
    return {
        "path": str(arrow),
        "rows": rows,
        "rows_with_gold_patch": rows_with_gold_patch,
        "rows_with_test_patch": rows_with_test_patch,
        "multi_file_rows": multi_file_rows,
        "multi_file_pct": multi_file_rows / rows * 100 if rows else 0.0,
        "patch_file_count_distribution": dict(sorted(patch_file_counts.items())),
        "test_patch_file_count_distribution": dict(sorted(test_patch_file_counts.items())),
        "repo_top10": dict(repo_counts.most_common(10)),
    }


def write_markdown(data: dict[str, Any], output: Path) -> None:
    output.parent.mkdir(parents=True, exist_ok=True)
    lines: list[str] = []
    lines.append("# System-Level APR Generator-Swap Feasibility Audit")
    lines.append("")
    lines.append("This note records local evidence for responding to Agentless/AutoCodeRover-style baseline concerns. It does not claim a completed system-level comparison.")
    lines.append("")
    lines.append("## Dataset Caches")
    lines.append("")
    lines.append("| Arrow file | Rows | Gold patch | Test patch | Languages | Sample id |")
    lines.append("|---|---:|---:|---:|---|---|")
    for item in data["datasets"]:
        if "error" in item:
            lines.append(f"| `{item['path']}` | error | - | - | {item['error']} | - |")
            continue
        languages = ", ".join(f"{k}:{v}" for k, v in item["language_counts"].items()) or "-"
        lines.append(
            f"| `{item['path']}` | {item['rows']} | {item['has_gold_patch']} | "
            f"{item['has_test_patch']} | {languages} | `{item['sample_id']}` |"
        )
    lines.append("")
    lines.append("## Agentless Assets")
    lines.append("")
    agentless = data["agentless"]
    lines.append(f"- Repository: `{agentless['path']}`; exists={agentless['exists']}.")
    for key, value in agentless["markers"].items():
        lines.append(f"- {key}: {value}")
    lines.append("- Key files:")
    for key, value in agentless["key_files"].items():
        lines.append(f"  - `{key}`: {value}")
    lines.append("")
    lines.append("## Existing System-Level Outputs")
    lines.append("")
    kg = data["kgcompass"]
    lines.append(f"- KGCompass root: `{kg['path']}`; exists={kg['exists']}.")
    lines.append(f"- Summary files: {kg['summary_files_count']}; Agentless project structures: {kg['agentless_project_structure_count']}; patch output files: {kg['patch_output_count']}.")
    for summary in kg["summaries_sample"][:8]:
        lines.append(
            f"- `{summary['path']}`: evaluated={summary['evaluated']}, "
            f"passed_regression={summary['passed_regression']}, round={summary['round_tag']}"
        )
    lines.append("")
    if data.get("multiswe_java"):
        multiswe = data["multiswe_java"]
        lines.append("## Multi-SWE-bench Java Verified")
        lines.append("")
        lines.append(f"- Arrow cache: `{multiswe['path']}`")
        lines.append(f"- Rows: {multiswe['rows']}")
        lines.append(f"- Rows with gold patches: {multiswe['rows_with_gold_patch']}")
        lines.append(f"- Rows with test patches: {multiswe['rows_with_test_patch']}")
        lines.append(
            f"- Multi-file gold patches: {multiswe['multi_file_rows']} "
            f"({multiswe['multi_file_pct']:.1f}%)"
        )
        lines.append(f"- Patch-file count distribution: `{multiswe['patch_file_count_distribution']}`")
        lines.append(f"- Test-patch file count distribution: `{multiswe['test_patch_file_count_distribution']}`")
        lines.append("")
    lines.append("## Feasibility Conclusion")
    lines.append("")
    if data.get("multiswe_java"):
        multiswe = data["multiswe_java"]
        lines.append(
            f"- A local Multi-SWE-bench Java Verified cache is available with {multiswe['rows']} Java tasks, "
            f"gold patches, and test patches. {multiswe['multi_file_rows']}/{multiswe['rows']} tasks "
            f"({multiswe['multi_file_pct']:.1f}%) require multi-file gold patches, so this is a suitable target "
            "for the reviewer-requested complex/multi-file follow-up."
        )
    lines.append("- Local assets are sufficient to design a small generator-swap smoke test: fix dataset instances, localized files/edit locations, context window, candidate budget, and selection policy, then replace only the patch generator with Base/SFT/PAFT.")
    lines.append("- Agentless is not a same-class baseline for PAFT's main tables because it adds localization, retrieval, multiple repair samples, regression/reproduction tests, and reranking.")
    lines.append("- SWE-bench-style datasets include gold patch/test metadata, but full system-level evaluation is slower and should be treated as a separate appendix or major-revision experiment rather than folded into the controlled generator-level benchmark.")
    output.write_text("\n".join(lines) + "\n", encoding="utf-8")

def parse_json_list(value: Any) -> list[Any]:
    if isinstance(value, list):
        return value
    if isinstance(value, str):
        try:
            parsed = json.loads(value)
            return parsed if isinstance(parsed, list) else []
        except Exception:
            return []
    return []


def write_java_smoke_manifest(cache_root: Path, output: Path, limit: int) -> None:
    java_arrows = sorted(cache_root.rglob("multi-swe-bench-java_verified.arrow"))
    if not java_arrows:
        return
    ds = Dataset.from_file(str(java_arrows[0]))
    rows = sorted((dict(row) for row in ds), key=lambda row: str(row.get("instance_id", "")))[:limit]
    output.parent.mkdir(parents=True, exist_ok=True)
    with output.open("w", encoding="utf-8") as handle:
        for row in rows:
            patch = row.get("patch", "") or ""
            test_patch = row.get("test_patch", "") or ""
            patch_files = changed_files_from_patch(patch)
            test_files = changed_files_from_patch(test_patch)
            handle.write(
                json.dumps(
                    {
                        "instance_id": row.get("instance_id"),
                        "repo": row.get("repo"),
                        "base_commit": row.get("base_commit"),
                        "fail_to_pass": parse_json_list(row.get("FAIL_TO_PASS")),
                        "pass_to_pass": parse_json_list(row.get("PASS_TO_PASS")),
                        "patch_file_count": len(patch_files),
                        "patch_files": patch_files,
                        "test_patch_file_count": len(test_files),
                        "test_patch_files": test_files,
                    },
                    ensure_ascii=False,
                )
                + "\n"
            )


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("--cache-root", default=str(DEFAULT_CACHE_ROOT))
    parser.add_argument("--agentless", default=str(DEFAULT_AGENTLESS))
    parser.add_argument("--kgcompass", default=str(DEFAULT_KGCOMPASS))
    parser.add_argument("--json", default="analysis_outputs/system_level_swap_feasibility_20260703.json")
    parser.add_argument("--md", default="analysis_outputs/system_level_swap_feasibility_20260703.md")
    parser.add_argument("--java-smoke-jsonl", default="analysis_outputs/multiswe_java_verified_smoke10_20260703.jsonl")
    parser.add_argument("--java-smoke-limit", type=int, default=10)
    args = parser.parse_args()

    data = {
        "datasets": audit_datasets(Path(args.cache_root)),
        "agentless": audit_agentless(Path(args.agentless)),
        "kgcompass": audit_kgcompass(Path(args.kgcompass)),
        "multiswe_java": summarize_multiswe_java_verified(Path(args.cache_root)),
    }
    json_path = Path(args.json)
    json_path.parent.mkdir(parents=True, exist_ok=True)
    json_path.write_text(json.dumps(data, indent=2, ensure_ascii=False), encoding="utf-8")
    write_markdown(data, Path(args.md))
    write_java_smoke_manifest(Path(args.cache_root), Path(args.java_smoke_jsonl), args.java_smoke_limit)
    print(f"wrote {json_path}")
    print(f"wrote {args.md}")
    print(f"wrote {args.java_smoke_jsonl}")


if __name__ == "__main__":
    main()
