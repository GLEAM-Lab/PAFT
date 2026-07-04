#!/usr/bin/env python3
"""Compute Defects4J pass@1-oriented edit metrics.

The existing summary reports edit quality over all plausible samples. This
script adds first-candidate metrics so a pass@1-only paper table can use a
matching edit-quality denominator.
"""

from __future__ import annotations

import argparse
import csv
import difflib
import json
import math
from pathlib import Path
import re
import statistics
from typing import Any

try:
    from Levenshtein import distance as levenshtein_distance
except Exception:
    levenshtein_distance = None


def norm_exact(text: str) -> str:
    return re.sub(r"\s+", "", text or "")


def edit_distance(a: str, b: str) -> int:
    a = (a or "").strip()
    b = (b or "").strip()
    if not a or not b:
        return 0
    if levenshtein_distance is not None:
        return int(levenshtein_distance(a, b))
    if len(a) < len(b):
        a, b = b, a
    prev = list(range(len(b) + 1))
    for i, ca in enumerate(a, 1):
        curr = [i]
        for j, cb in enumerate(b, 1):
            curr.append(min(prev[j] + 1, curr[j - 1] + 1, prev[j - 1] + (ca != cb)))
        prev = curr
    return prev[-1]


def ccr_percent(buggy: str, patch: str) -> float:
    buggy_lines = (buggy or "").strip().splitlines()
    patch_lines = (patch or "").strip().splitlines()
    if not patch_lines:
        return 0.0
    matcher = difflib.SequenceMatcher(None, buggy_lines, patch_lines)
    preserved = sum(block.size for block in matcher.get_matching_blocks()[:-1])
    return preserved / len(patch_lines) * 100


def mean(values: list[float]) -> float:
    return float(sum(values) / len(values)) if values else 0.0


def median(values: list[float]) -> float:
    return float(statistics.median(values)) if values else 0.0


def read_json(path: Path) -> Any:
    with path.open("r", encoding="utf-8") as handle:
        return json.load(handle)


def summarize_model(root: Path, model: str, expected_patch_count: int) -> dict[str, Any]:
    dataset_dir = root / "defects4j" / "dataset"
    result_dir = root / "defects4j" / "results" / model / "fixed0"
    bug_ids = sorted(path.stem for path in dataset_dir.glob("*.json"))

    pass1_est_sum = 0.0
    fixed0_success = 0
    fixed0_aeds: list[float] = []
    fixed0_ccrs: list[float] = []
    all_plausible_aeds: list[float] = []
    all_plausible_ccrs: list[float] = []
    result_files = 0
    padded_bugs = 0
    truncated_bugs = 0
    no_op_fixed0 = 0
    no_op_all = 0
    no_op_plausible = 0
    plausible_patches = 0

    for bug_id in bug_ids:
        dataset_file = dataset_dir / f"{bug_id}.json"
        buggy = read_json(dataset_file).get("buggy", "")
        result_file = result_dir / f"{bug_id}.json.result"
        if not result_file.exists():
            continue
        result_files += 1
        patches = read_json(result_file)
        if not isinstance(patches, list):
            continue
        if len(patches) < expected_patch_count:
            padded_bugs += 1
            patches = list(patches) + [
                {"patch_status": "MISSING_PATCH", "patch_code": "", "diff_stats": None}
                for _ in range(expected_patch_count - len(patches))
            ]
        elif len(patches) > expected_patch_count:
            truncated_bugs += 1
            patches = patches[:expected_patch_count]

        plausible_count = sum(1 for patch in patches if patch.get("patch_status") == "PLAUSIBLE")
        pass1_est_sum += plausible_count / expected_patch_count

        first_patch = patches[0] if patches else {"patch_status": "MISSING_PATCH", "patch_code": ""}
        first_code = first_patch.get("patch_code", "")
        if norm_exact(buggy) == norm_exact(first_code):
            no_op_fixed0 += 1
        if first_patch.get("patch_status") == "PLAUSIBLE":
            fixed0_success += 1
            fixed0_aeds.append(float(edit_distance(buggy, first_code)))
            fixed0_ccrs.append(float(ccr_percent(buggy, first_code)))

        for patch in patches:
            patch_code = patch.get("patch_code", "")
            if norm_exact(buggy) == norm_exact(patch_code):
                no_op_all += 1
            if patch.get("patch_status") != "PLAUSIBLE":
                continue
            plausible_patches += 1
            if norm_exact(buggy) == norm_exact(patch_code):
                no_op_plausible += 1
            all_plausible_aeds.append(float(edit_distance(buggy, patch_code)))
            all_plausible_ccrs.append(float(ccr_percent(buggy, patch_code)))

    denom = len(bug_ids)
    return {
        "model": model,
        "bugs": denom,
        "result_files": result_files,
        "expected_patch_count": expected_patch_count,
        "missing_results": denom - result_files,
        "padded_bugs": padded_bugs,
        "truncated_bugs": truncated_bugs,
        "pass1_est": pass1_est_sum / denom * 100 if denom else 0.0,
        "fixed0_pass": fixed0_success / denom * 100 if denom else 0.0,
        "fixed0_plausible": fixed0_success,
        "fixed0_avg_aed": mean(fixed0_aeds),
        "fixed0_med_aed": median(fixed0_aeds),
        "fixed0_avg_ccr": mean(fixed0_ccrs),
        "fixed0_med_ccr": median(fixed0_ccrs),
        "all_plausible_patches": plausible_patches,
        "all_avg_aed": mean(all_plausible_aeds),
        "all_med_aed": median(all_plausible_aeds),
        "all_avg_ccr": mean(all_plausible_ccrs),
        "all_med_ccr": median(all_plausible_ccrs),
        "no_op_fixed0": no_op_fixed0,
        "no_op_fixed0_pct": no_op_fixed0 / denom * 100 if denom else 0.0,
        "no_op_all": no_op_all,
        "no_op_plausible": no_op_plausible,
    }


def write_csv(rows: list[dict[str, Any]], path: Path) -> None:
    path.parent.mkdir(parents=True, exist_ok=True)
    with path.open("w", encoding="utf-8", newline="") as handle:
        writer = csv.DictWriter(handle, fieldnames=list(rows[0].keys()))
        writer.writeheader()
        writer.writerows(rows)


def write_markdown(rows: list[dict[str, Any]], path: Path) -> None:
    path.parent.mkdir(parents=True, exist_ok=True)
    headers = [
        "model",
        "bugs",
        "result_files",
        "missing_results",
        "expected_patch_count",
        "pass1_est",
        "fixed0_pass",
        "fixed0_avg_aed",
        "fixed0_med_aed",
        "fixed0_avg_ccr",
        "fixed0_med_ccr",
        "all_avg_aed",
        "all_med_aed",
        "all_avg_ccr",
        "all_med_ccr",
        "no_op_fixed0_pct",
        "no_op_plausible",
    ]
    with path.open("w", encoding="utf-8") as handle:
        handle.write("| " + " | ".join(headers) + " |\n")
        handle.write("|" + "|".join(["---"] + ["---:"] * (len(headers) - 1)) + "|\n")
        for row in rows:
            values = []
            for header in headers:
                value = row[header]
                values.append(f"{value:.2f}" if isinstance(value, float) else str(value))
            handle.write("| " + " | ".join(values) + " |\n")


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("--root", default="/home/barty/research/prorepair")
    parser.add_argument("--models", nargs="+", required=True)
    parser.add_argument("--expected-patch-count", type=int, default=10)
    parser.add_argument("--csv")
    parser.add_argument("--md")
    args = parser.parse_args()

    if args.expected_patch_count < 1:
        raise ValueError("--expected-patch-count must be >= 1")
    rows = [
        summarize_model(Path(args.root), model, args.expected_patch_count)
        for model in args.models
    ]
    for row in rows:
        print(
            f"{row['model']}: pass1_est={row['pass1_est']:.2f}, "
            f"fixed0_pass={row['fixed0_pass']:.2f}, "
            f"fixed0 AED={row['fixed0_avg_aed']:.2f}/{row['fixed0_med_aed']:.2f}, "
            f"fixed0 CCR={row['fixed0_avg_ccr']:.2f}/{row['fixed0_med_ccr']:.2f}, "
            f"missing={row['missing_results']}"
        )
    if args.csv:
        write_csv(rows, Path(args.csv))
    if args.md:
        write_markdown(rows, Path(args.md))


if __name__ == "__main__":
    main()
