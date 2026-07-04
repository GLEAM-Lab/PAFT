#!/usr/bin/env python3
"""Analyze HumanEval-Java correctness/locality trade-offs by solved bug."""

from __future__ import annotations

import argparse
import json
from pathlib import Path
import statistics
from typing import Any

from recompute_humaneval_java_metrics import calc_metrics, read_result


def median(values: list[float]) -> float:
    return float(statistics.median(values)) if values else 0.0


def mean(values: list[float]) -> float:
    return sum(values) / len(values) if values else 0.0


def collect(root: Path, model: str) -> dict[str, list[dict[str, Any]]]:
    result_base = root / "evalrepair-java-res" / model
    origin_base = root / "evalrepair-java" / "origin"
    solved: dict[str, list[dict[str, Any]]] = {}
    for fixed_dir in sorted(result_base.glob("fixed*")):
        if not fixed_dir.is_dir():
            continue
        fixed_id = fixed_dir.name
        for java_file in sorted(fixed_dir.glob("*.java")):
            ret = read_result(Path(str(java_file) + ".result"))
            if ret != 0:
                continue
            origin_file = origin_base / java_file.name
            if not origin_file.exists():
                continue
            metrics = calc_metrics(
                origin_file.read_text(encoding="utf-8"),
                java_file.read_text(encoding="utf-8"),
            )
            solved.setdefault(java_file.stem, []).append(
                {
                    "fixed_id": fixed_id,
                    "aed": metrics["aed"],
                    "ccr": metrics["ccr"],
                    "path": str(java_file.relative_to(root)),
                }
            )
    return solved


def best_by_bug(solved: dict[str, list[dict[str, Any]]]) -> dict[str, dict[str, Any]]:
    return {bug: min(items, key=lambda item: (item["aed"], -item["ccr"])) for bug, items in solved.items()}


def summarize(model: str, solved: dict[str, list[dict[str, Any]]]) -> dict[str, Any]:
    best = best_by_bug(solved)
    patch_aeds = [item["aed"] for items in solved.values() for item in items]
    best_aeds = [item["aed"] for item in best.values()]
    patch_ccrs = [item["ccr"] for items in solved.values() for item in items]
    best_ccrs = [item["ccr"] for item in best.values()]
    return {
        "model": model,
        "solved_bugs": len(solved),
        "plausible_patches": len(patch_aeds),
        "patch_avg_aed": mean(patch_aeds),
        "patch_med_aed": median(patch_aeds),
        "bugbest_avg_aed": mean(best_aeds),
        "bugbest_med_aed": median(best_aeds),
        "patch_avg_ccr": mean(patch_ccrs),
        "patch_med_ccr": median(patch_ccrs),
        "bugbest_avg_ccr": mean(best_ccrs),
        "bugbest_med_ccr": median(best_ccrs),
    }


def fmt(value: Any) -> str:
    return f"{value:.2f}" if isinstance(value, float) else str(value)


def write_markdown(rows: list[dict[str, Any]], path: Path) -> None:
    headers = [
        "model",
        "solved_bugs",
        "plausible_patches",
        "patch_avg_aed",
        "patch_med_aed",
        "bugbest_avg_aed",
        "bugbest_med_aed",
        "patch_avg_ccr",
        "patch_med_ccr",
        "bugbest_avg_ccr",
        "bugbest_med_ccr",
    ]
    path.parent.mkdir(parents=True, exist_ok=True)
    with path.open("w", encoding="utf-8") as handle:
        handle.write("| " + " | ".join(headers) + " |\n")
        handle.write("|" + "|".join(["---"] + ["---:"] * (len(headers) - 1)) + "|\n")
        for row in rows:
            handle.write("| " + " | ".join(fmt(row[header]) for header in headers) + " |\n")


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("--root", default="/home/barty/GLEAM-Lab/PAFT")
    parser.add_argument("--models", nargs="+", required=True)
    parser.add_argument("--reference", default="qwen2.5coder7b-sft-assistonly-tse-20260619")
    parser.add_argument("--target", default="qwen2.5coder7b-paft")
    parser.add_argument("--md")
    parser.add_argument("--json")
    args = parser.parse_args()

    root = Path(args.root)
    solved_by_model = {model: collect(root, model) for model in args.models}
    rows = [summarize(model, solved_by_model[model]) for model in args.models]

    ref_best = best_by_bug(solved_by_model[args.reference])
    target_best = best_by_bug(solved_by_model[args.target])
    ref_set = set(ref_best)
    target_set = set(target_best)
    common = sorted(ref_set & target_set)
    target_only = sorted(target_set - ref_set)
    ref_only = sorted(ref_set - target_set)
    common_rows = [
        {
            "bug": bug,
            "target_aed": target_best[bug]["aed"],
            "target_ccr": target_best[bug]["ccr"],
            "reference_aed": ref_best[bug]["aed"],
            "reference_ccr": ref_best[bug]["ccr"],
        }
        for bug in common
    ]
    report = {
        "summary": rows,
        "reference": args.reference,
        "target": args.target,
        "common_bugs": common_rows,
        "target_only": {bug: target_best[bug] for bug in target_only},
        "reference_only": {bug: ref_best[bug] for bug in ref_only},
    }

    if args.md:
        write_markdown(rows, Path(args.md))
        with Path(args.md).open("a", encoding="utf-8") as handle:
            handle.write("\n")
            handle.write(f"Reference: `{args.reference}`; target: `{args.target}`.\n\n")
            handle.write(f"- Common solved bugs: {len(common)}\n")
            handle.write(f"- Target-only solved bugs: {len(target_only)} ({', '.join(target_only)})\n")
            handle.write(f"- Reference-only solved bugs: {len(ref_only)} ({', '.join(ref_only)})\n\n")
            if common_rows:
                target_aeds = [row["target_aed"] for row in common_rows]
                ref_aeds = [row["reference_aed"] for row in common_rows]
                target_ccrs = [row["target_ccr"] for row in common_rows]
                ref_ccrs = [row["reference_ccr"] for row in common_rows]
                handle.write(
                    "- Common subset best-AED avg/med: "
                    f"target {mean(target_aeds):.2f}/{median(target_aeds):.2f}, "
                    f"reference {mean(ref_aeds):.2f}/{median(ref_aeds):.2f}.\n"
                )
                handle.write(
                    "- Common subset best-CCR avg/med: "
                    f"target {mean(target_ccrs):.2f}/{median(target_ccrs):.2f}, "
                    f"reference {mean(ref_ccrs):.2f}/{median(ref_ccrs):.2f}.\n"
                )
    if args.json:
        Path(args.json).parent.mkdir(parents=True, exist_ok=True)
        Path(args.json).write_text(json.dumps(report, indent=2), encoding="utf-8")

    for row in rows:
        print(
            f"{row['model']}: solved_bugs={row['solved_bugs']} patches={row['plausible_patches']} "
            f"bug-best AED={row['bugbest_avg_aed']:.2f}/{row['bugbest_med_aed']:.2f} "
            f"patch AED={row['patch_avg_aed']:.2f}/{row['patch_med_aed']:.2f}"
        )
    print(f"common={len(common)} target_only={target_only} reference_only={ref_only}")


if __name__ == "__main__":
    main()
