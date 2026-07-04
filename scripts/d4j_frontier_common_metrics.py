#!/usr/bin/env python3
"""Compare a local Defects4J model with frontier per-bug diff-stat summaries."""

from __future__ import annotations

import argparse
import csv
import difflib
import json
import re
import statistics
from pathlib import Path
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
    return sum(values) / len(values) if values else 0.0


def median(values: list[float]) -> float:
    return float(statistics.median(values)) if values else 0.0


def read_json(path: Path) -> Any:
    with path.open("r", encoding="utf-8") as handle:
        return json.load(handle)


def local_plausible_stats(root: Path, model: str, bug_ids: list[str]) -> tuple[list[float], list[float]]:
    dataset_dir = root / "defects4j" / "dataset"
    result_dir = root / "defects4j" / "results" / model / "fixed0"
    aeds: list[float] = []
    ccrs: list[float] = []
    for bug_id in bug_ids:
        result_file = result_dir / f"{bug_id}.json.result"
        if not result_file.exists():
            continue
        patches = read_json(result_file)
        if not isinstance(patches, list) or not patches:
            continue
        patch = patches[0]
        if patch.get("patch_status") != "PLAUSIBLE":
            continue
        buggy = read_json(dataset_dir / f"{bug_id}.json").get("buggy", "")
        code = patch.get("patch_code", "")
        aeds.append(float(edit_distance(buggy, code)))
        ccrs.append(float(ccr_percent(buggy, code)))
    return aeds, ccrs


def frontier_stats(frontier_bugs: dict[str, Any], bug_ids: list[str]) -> tuple[list[float], list[float]]:
    aeds: list[float] = []
    ccrs: list[float] = []
    for bug_id in bug_ids:
        stats = frontier_bugs[bug_id]
        aeds.append(float(stats.get("edit_distance", 0.0)))
        ccrs.append(float(stats.get("preserved_ratio", 0.0)))
    return aeds, ccrs


def summarize(scope: str, model: str, bug_ids: list[str], aeds: list[float], ccrs: list[float]) -> dict[str, Any]:
    return {
        "scope": scope,
        "model": model,
        "common_bugs": len(bug_ids),
        "avg_aed": mean(aeds),
        "med_aed": median(aeds),
        "avg_ccr": mean(ccrs),
        "med_ccr": median(ccrs),
        "bug_ids": ",".join(bug_ids),
    }


def write_csv(rows: list[dict[str, Any]], path: Path) -> None:
    path.parent.mkdir(parents=True, exist_ok=True)
    with path.open("w", encoding="utf-8", newline="") as handle:
        writer = csv.DictWriter(handle, fieldnames=list(rows[0].keys()))
        writer.writeheader()
        writer.writerows(rows)


def write_markdown(rows: list[dict[str, Any]], path: Path) -> None:
    path.parent.mkdir(parents=True, exist_ok=True)
    headers = ["scope", "model", "common_bugs", "avg_aed", "med_aed", "avg_ccr", "med_ccr"]
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
    parser.add_argument("--local-model", required=True)
    parser.add_argument("--local-label", default="local")
    parser.add_argument("--frontier-json", default="analysis_outputs/frontier_minimal_recomputed.json")
    parser.add_argument("--frontier-key", required=True)
    parser.add_argument("--frontier-label")
    parser.add_argument("--csv")
    parser.add_argument("--md")
    args = parser.parse_args()

    root = Path(args.root)
    frontier = read_json(Path(args.frontier_json))[args.frontier_key]
    frontier_bugs = frontier["bugs"]
    local_result_dir = root / "defects4j" / "results" / args.local_model / "fixed0"
    local_plausible = set()
    for path in local_result_dir.glob("*.json.result"):
        patches = read_json(path)
        if isinstance(patches, list) and patches and patches[0].get("patch_status") == "PLAUSIBLE":
            local_plausible.add(path.name.removesuffix(".json.result"))

    common = sorted(local_plausible & set(frontier_bugs))
    scope = f"common_plausible:{args.local_label}+{args.frontier_label or args.frontier_key}"
    local_aeds, local_ccrs = local_plausible_stats(root, args.local_model, common)
    frontier_aeds, frontier_ccrs = frontier_stats(frontier_bugs, common)

    rows = [
        summarize(scope, args.local_label, common, local_aeds, local_ccrs),
        summarize(scope, args.frontier_label or args.frontier_key, common, frontier_aeds, frontier_ccrs),
    ]
    for row in rows:
        print(
            f"{row['scope']} {row['model']}: n={row['common_bugs']}, "
            f"AED={row['avg_aed']:.2f}/{row['med_aed']:.2f}, "
            f"CCR={row['avg_ccr']:.2f}/{row['med_ccr']:.2f}"
        )
    if args.csv:
        write_csv(rows, Path(args.csv))
    if args.md:
        write_markdown(rows, Path(args.md))


if __name__ == "__main__":
    main()
