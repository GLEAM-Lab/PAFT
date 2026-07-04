#!/usr/bin/env python3
"""Compare Defects4J edit metrics on common-plausible bug subsets."""

from __future__ import annotations

import argparse
import csv
import difflib
import itertools
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


def load_first_patches(root: Path, model: str) -> dict[str, dict[str, Any]]:
    result_dir = root / "defects4j" / "results" / model / "fixed0"
    rows: dict[str, dict[str, Any]] = {}
    for path in sorted(result_dir.glob("*.json.result")):
        bug_id = path.name.removesuffix(".json.result")
        patches = read_json(path)
        if not isinstance(patches, list) or not patches:
            continue
        rows[bug_id] = patches[0]
    return rows


def compute_row(
    *,
    scope: str,
    model: str,
    bug_ids: list[str],
    buggy_by_id: dict[str, str],
    patches_by_id: dict[str, dict[str, Any]],
    denom: int,
) -> dict[str, Any]:
    plausible = []
    aeds = []
    ccrs = []
    no_op = 0
    for bug_id in bug_ids:
        patch = patches_by_id.get(bug_id, {})
        code = patch.get("patch_code", "")
        if norm_exact(buggy_by_id.get(bug_id, "")) == norm_exact(code):
            no_op += 1
        if patch.get("patch_status") != "PLAUSIBLE":
            continue
        plausible.append(bug_id)
        aeds.append(float(edit_distance(buggy_by_id.get(bug_id, ""), code)))
        ccrs.append(float(ccr_percent(buggy_by_id.get(bug_id, ""), code)))
    return {
        "scope": scope,
        "model": model,
        "denom_bugs": denom,
        "scored_bugs": len(bug_ids),
        "plausible_bugs": len(plausible),
        "pass_pct_of_dataset": len(plausible) / denom * 100 if denom else 0.0,
        "avg_aed": mean(aeds),
        "med_aed": median(aeds),
        "avg_ccr": mean(ccrs),
        "med_ccr": median(ccrs),
        "no_op_count": no_op,
        "bug_ids": ",".join(plausible),
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
        "scope",
        "model",
        "denom_bugs",
        "scored_bugs",
        "plausible_bugs",
        "pass_pct_of_dataset",
        "avg_aed",
        "med_aed",
        "avg_ccr",
        "med_ccr",
        "no_op_count",
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
    parser.add_argument("--labels", nargs="+")
    parser.add_argument("--csv")
    parser.add_argument("--md")
    args = parser.parse_args()

    root = Path(args.root)
    dataset_dir = root / "defects4j" / "dataset"
    dataset_files = sorted(dataset_dir.glob("*.json"))
    bug_ids = [path.stem for path in dataset_files]
    buggy_by_id = {path.stem: read_json(path).get("buggy", "") for path in dataset_files}
    labels = args.labels or args.models
    if len(labels) != len(args.models):
        raise ValueError("--labels must have the same length as --models")

    patches = {label: load_first_patches(root, model) for label, model in zip(labels, args.models)}
    plausible_sets = {
        label: {bug_id for bug_id, patch in model_patches.items() if patch.get("patch_status") == "PLAUSIBLE"}
        for label, model_patches in patches.items()
    }

    rows: list[dict[str, Any]] = []
    for label in labels:
        rows.append(
            compute_row(
                scope="all_fixed0",
                model=label,
                bug_ids=bug_ids,
                buggy_by_id=buggy_by_id,
                patches_by_id=patches[label],
                denom=len(bug_ids),
            )
        )

    for size in range(2, len(labels) + 1):
        for combo in itertools.combinations(labels, size):
            common = sorted(set.intersection(*(plausible_sets[label] for label in combo)))
            scope = "common_plausible:" + "+".join(combo)
            for label in combo:
                rows.append(
                    compute_row(
                        scope=scope,
                        model=label,
                        bug_ids=common,
                        buggy_by_id=buggy_by_id,
                        patches_by_id=patches[label],
                        denom=len(bug_ids),
                    )
                )

    for row in rows:
        print(
            f"{row['scope']} {row['model']}: n={row['plausible_bugs']}, "
            f"AED={row['avg_aed']:.2f}/{row['med_aed']:.2f}, "
            f"CCR={row['avg_ccr']:.2f}/{row['med_ccr']:.2f}"
        )
    if args.csv:
        write_csv(rows, Path(args.csv))
    if args.md:
        write_markdown(rows, Path(args.md))


if __name__ == "__main__":
    main()
