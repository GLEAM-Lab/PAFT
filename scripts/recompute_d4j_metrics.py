#!/usr/bin/env python3
"""Recompute Defects4J pass@k and edit metrics from cached patch results.

This script intentionally ignores cached ``diff_stats`` when producing AED/CCR.
It reads the stored ``patch_code`` for each validated patch and recomputes edit
statistics against the benchmark buggy snippet. Use it to audit stale metric
caches before building paper tables.
"""

from __future__ import annotations

import argparse
import csv
import difflib
import json
import math
import os
from pathlib import Path
import re
import statistics
from typing import Any

try:
    from Levenshtein import distance as levenshtein_distance
except Exception:  # pragma: no cover - fallback for minimal environments
    levenshtein_distance = None


EXPECTED_PATCH_COUNT = 10


def norm_exact(text: str) -> str:
    return re.sub(r"\s+", "", text or "")


def edit_distance(a: str, b: str) -> int:
    a = (a or "").strip()
    b = (b or "").strip()
    if not a or not b:
        return 0
    if levenshtein_distance is not None:
        return int(levenshtein_distance(a, b))

    # Memory-efficient fallback.
    if len(a) < len(b):
        a, b = b, a
    prev = list(range(len(b) + 1))
    for i, ca in enumerate(a, 1):
        curr = [i]
        for j, cb in enumerate(b, 1):
            curr.append(
                min(
                    prev[j] + 1,
                    curr[j - 1] + 1,
                    prev[j - 1] + (ca != cb),
                )
            )
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


def calc_pass_at_k(n: int, c: int, k: int) -> float:
    if c <= 0:
        return 0.0
    if n - c < k:
        return 1.0
    return 1.0 - math.comb(n - c, k) / math.comb(n, k)


def read_json(path: Path) -> Any:
    with path.open("r", encoding="utf-8") as handle:
        return json.load(handle)


def median(values: list[float]) -> float:
    return float(statistics.median(values)) if values else 0.0


def mean(values: list[float]) -> float:
    return float(sum(values) / len(values)) if values else 0.0


def summarize_model(root: Path, model: str) -> dict[str, Any]:
    result_dir = root / "defects4j" / "results" / model / "fixed0"
    dataset_dir = root / "defects4j" / "dataset"
    result_files = sorted(result_dir.glob("*.json.result"))

    pass1_sum = pass5_sum = pass10_sum = 0.0
    valid_bugs = 0
    normalized_bugs = 0
    padded_bugs = 0
    truncated_bugs = 0
    plausible_bugs = 0
    plausible_patches = 0
    missing_dataset = 0

    aeds: list[float] = []
    ccrs: list[float] = []
    cached_aeds: list[float] = []
    cached_ccrs: list[float] = []
    no_op_all = 0
    no_op_plausible = 0
    all_patch_count = 0
    stale_aed_count = 0
    stale_ccr_count = 0

    for result_file in result_files:
        bug_id = result_file.name.removesuffix(".json.result")
        dataset_file = dataset_dir / f"{bug_id}.json"
        if not dataset_file.exists():
            missing_dataset += 1
            continue

        buggy = read_json(dataset_file).get("buggy", "")
        patches = read_json(result_file)
        if not isinstance(patches, list):
            continue

        if len(patches) < EXPECTED_PATCH_COUNT:
            padded_bugs += 1
            patches = list(patches) + [
                {"patch_status": "MISSING_PATCH", "patch_code": "", "diff_stats": None}
                for _ in range(EXPECTED_PATCH_COUNT - len(patches))
            ]
        elif len(patches) > EXPECTED_PATCH_COUNT:
            truncated_bugs += 1
            patches = patches[:EXPECTED_PATCH_COUNT]

        normalized_bugs += 1
        c = sum(1 for patch in patches if patch.get("patch_status") == "PLAUSIBLE")
        pass1_sum += calc_pass_at_k(EXPECTED_PATCH_COUNT, c, 1)
        pass5_sum += calc_pass_at_k(EXPECTED_PATCH_COUNT, c, 5)
        pass10_sum += calc_pass_at_k(EXPECTED_PATCH_COUNT, c, 10)
        valid_bugs += 1
        if c:
            plausible_bugs += 1

        for patch in patches:
            patch_code = patch.get("patch_code", "")
            all_patch_count += 1
            if norm_exact(buggy) == norm_exact(patch_code):
                no_op_all += 1

            if patch.get("patch_status") != "PLAUSIBLE":
                continue

            plausible_patches += 1
            if norm_exact(buggy) == norm_exact(patch_code):
                no_op_plausible += 1

            recomputed_aed = float(edit_distance(buggy, patch_code))
            recomputed_ccr = float(ccr_percent(buggy, patch_code))
            aeds.append(recomputed_aed)
            ccrs.append(recomputed_ccr)

            cached_stats = patch.get("diff_stats") or {}
            if cached_stats:
                cached_aed = float(cached_stats.get("edit_distance", 0))
                cached_ccr = float(cached_stats.get("preserved_ratio", 0))
                cached_aeds.append(cached_aed)
                cached_ccrs.append(cached_ccr)
                if abs(cached_aed - recomputed_aed) > 0.5:
                    stale_aed_count += 1
                if abs(cached_ccr - recomputed_ccr) > 0.01:
                    stale_ccr_count += 1

    return {
        "model": model,
        "result_files": len(result_files),
        "normalized_bugs": normalized_bugs,
        "padded_bugs": padded_bugs,
        "truncated_bugs": truncated_bugs,
        "missing_dataset": missing_dataset,
        "pass@1": pass1_sum / valid_bugs * 100 if valid_bugs else 0.0,
        "pass@5": pass5_sum / valid_bugs * 100 if valid_bugs else 0.0,
        "pass@10": pass10_sum / valid_bugs * 100 if valid_bugs else 0.0,
        "plausible_bugs": plausible_bugs,
        "plausible_patches": plausible_patches,
        "avg_aed": mean(aeds),
        "med_aed": median(aeds),
        "avg_ccr": mean(ccrs),
        "med_ccr": median(ccrs),
        "cached_avg_aed": mean(cached_aeds),
        "cached_med_aed": median(cached_aeds),
        "cached_avg_ccr": mean(cached_ccrs),
        "cached_med_ccr": median(cached_ccrs),
        "stale_aed_count": stale_aed_count,
        "stale_ccr_count": stale_ccr_count,
        "no_op_all": no_op_all,
        "no_op_all_pct": no_op_all / all_patch_count * 100 if all_patch_count else 0.0,
        "no_op_plausible": no_op_plausible,
    }


def write_csv(rows: list[dict[str, Any]], path: Path) -> None:
    path.parent.mkdir(parents=True, exist_ok=True)
    fieldnames = list(rows[0].keys()) if rows else []
    with path.open("w", encoding="utf-8", newline="") as handle:
        writer = csv.DictWriter(handle, fieldnames=fieldnames)
        writer.writeheader()
        writer.writerows(rows)


def write_markdown(rows: list[dict[str, Any]], path: Path) -> None:
    path.parent.mkdir(parents=True, exist_ok=True)
    headers = [
        "model",
        "normalized_bugs",
        "padded_bugs",
        "truncated_bugs",
        "pass@1",
        "pass@5",
        "pass@10",
        "plausible_patches",
        "avg_aed",
        "med_aed",
        "avg_ccr",
        "med_ccr",
        "stale_aed_count",
        "stale_ccr_count",
        "no_op_all_pct",
        "no_op_plausible",
    ]
    with path.open("w", encoding="utf-8") as handle:
        handle.write("| " + " | ".join(headers) + " |\n")
        handle.write("|" + "|".join(["---"] + ["---:"] * (len(headers) - 1)) + "|\n")
        for row in rows:
            values = []
            for header in headers:
                value = row[header]
                if isinstance(value, float):
                    values.append(f"{value:.2f}")
                else:
                    values.append(str(value))
            handle.write("| " + " | ".join(values) + " |\n")


def main() -> None:
    global EXPECTED_PATCH_COUNT

    parser = argparse.ArgumentParser()
    parser.add_argument(
        "--root",
        default="/home/barty/research/prorepair",
        help="Path to the prorepair checkout containing defects4j/results and defects4j/dataset.",
    )
    parser.add_argument("--models", nargs="+", required=True)
    parser.add_argument("--csv", default=None)
    parser.add_argument("--md", default=None)
    parser.add_argument("--expected-patch-count", type=int, default=EXPECTED_PATCH_COUNT)
    args = parser.parse_args()

    EXPECTED_PATCH_COUNT = args.expected_patch_count

    root = Path(args.root)
    rows = [summarize_model(root, model) for model in args.models]

    if args.csv:
        write_csv(rows, Path(args.csv))
    if args.md:
        write_markdown(rows, Path(args.md))

    for row in rows:
        print(
            f"{row['model']}: pass@1/5/10={row['pass@1']:.2f}/"
            f"{row['pass@5']:.2f}/{row['pass@10']:.2f}, "
            f"AED={row['avg_aed']:.2f}/{row['med_aed']:.2f}, "
            f"CCR={row['avg_ccr']:.2f}/{row['med_ccr']:.2f}, "
            f"stale_aed={row['stale_aed_count']}, "
            f"stale_ccr={row['stale_ccr_count']}"
        )


if __name__ == "__main__":
    main()
