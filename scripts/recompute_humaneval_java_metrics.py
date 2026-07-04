#!/usr/bin/env python3
"""Recompute HumanEval-Java pass@k and edit metrics from generated Java files."""

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
except Exception:  # pragma: no cover
    levenshtein_distance = None


EXPECTED_PATCH_COUNT = 10


def remove_java_comments(code: str) -> str:
    code = re.sub(r"/\*.*?\*/", "", code or "", flags=re.DOTALL)
    return "\n".join(line.rstrip() for line in code.splitlines() if line.strip())


def extract_from_public_class(code: str) -> str:
    match = re.search(r"public\s+class\s+", code or "", re.IGNORECASE)
    return code[match.start() :] if match else (code or "")


def normalized_code(code: str) -> str:
    return re.sub(r"\s+", "", code or "")


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


def calc_metrics(buggy: str, fixed: str) -> dict[str, float]:
    buggy_from_class = extract_from_public_class(buggy)
    fixed_from_class = extract_from_public_class(fixed)
    buggy_clean = remove_java_comments(buggy_from_class)
    fixed_clean = remove_java_comments(fixed_from_class)
    buggy_lines = buggy_clean.strip().splitlines()
    fixed_lines = fixed_clean.strip().splitlines()

    matcher = difflib.SequenceMatcher(None, buggy_lines, fixed_lines)
    preserved = sum(block.size for block in matcher.get_matching_blocks()[:-1])
    ccr = preserved / len(fixed_lines) * 100 if fixed_lines else 0.0

    return {
        "aed": float(edit_distance(buggy_from_class, fixed_from_class)),
        "ccr": float(ccr),
    }


def calc_pass_at_k(n: int, c: int, k: int) -> float:
    if c <= 0:
        return 0.0
    if n - c < k:
        return 1.0
    return 1.0 - math.comb(n - c, k) / math.comb(n, k)


def read_result(path: Path) -> int | None:
    if not path.exists():
        return None
    content = path.read_text(encoding="utf-8").strip()
    if not content:
        return None
    try:
        data = json.loads(content)
        return int(data.get("return_code", 1))
    except Exception:
        try:
            return int(content)
        except ValueError:
            return None


def mean(values: list[float]) -> float:
    return sum(values) / len(values) if values else 0.0


def median(values: list[float]) -> float:
    return float(statistics.median(values)) if values else 0.0


def summarize_model(root: Path, model: str, expected_patch_count: int) -> dict[str, Any]:
    result_base = root / "evalrepair-java-res" / model
    origin_base = root / "evalrepair-java" / "origin"

    bug_names = {path.stem for path in origin_base.glob("*.java")}
    for fixed_id in range(expected_patch_count):
        bug_names.update(path.stem for path in (result_base / f"fixed{fixed_id}").glob("*.java"))

    pass1_sum = pass5_sum = pass10_sum = 0.0
    normalized_bugs = 0
    padded_bugs = 0
    plausible_bugs = 0
    plausible_patches = 0
    aeds: list[float] = []
    ccrs: list[float] = []
    no_op_all = 0
    no_op_plausible = 0
    actual_patches = 0

    for bug_name in sorted(bug_names):
        results: list[int] = []
        patches: list[tuple[int, Path]] = []
        for fixed_id in range(expected_patch_count):
            java_file = result_base / f"fixed{fixed_id}" / f"{bug_name}.java"
            if not java_file.exists():
                continue
            actual_patches += 1
            ret = read_result(Path(str(java_file) + ".result"))
            results.append(1 if ret is None else ret)
            patches.append((1 if ret is None else ret, java_file))

        if len(results) < expected_patch_count:
            padded_bugs += 1
            results.extend([1] * (expected_patch_count - len(results)))

        normalized_bugs += 1
        c = sum(1 for ret in results[:expected_patch_count] if ret == 0)
        pass1_sum += calc_pass_at_k(expected_patch_count, c, 1)
        pass5_sum += calc_pass_at_k(expected_patch_count, c, min(5, expected_patch_count))
        pass10_sum += calc_pass_at_k(expected_patch_count, c, min(10, expected_patch_count))
        if c:
            plausible_bugs += 1

        buggy_file = origin_base / f"{bug_name}.java"
        if not buggy_file.exists():
            continue
        buggy_code = buggy_file.read_text(encoding="utf-8")

        for ret, java_file in patches:
            fixed_code = java_file.read_text(encoding="utf-8")
            if normalized_code(buggy_code) == normalized_code(fixed_code):
                no_op_all += 1
            if ret != 0:
                continue
            plausible_patches += 1
            if normalized_code(buggy_code) == normalized_code(fixed_code):
                no_op_plausible += 1
            metrics = calc_metrics(buggy_code, fixed_code)
            aeds.append(metrics["aed"])
            ccrs.append(metrics["ccr"])

    return {
        "model": model,
        "normalized_bugs": normalized_bugs,
        "padded_bugs": padded_bugs,
        "actual_patches": actual_patches,
        "pass@1": pass1_sum / normalized_bugs * 100 if normalized_bugs else 0.0,
        "pass@5": pass5_sum / normalized_bugs * 100 if normalized_bugs else 0.0,
        "pass@10": pass10_sum / normalized_bugs * 100 if normalized_bugs else 0.0,
        "plausible_bugs": plausible_bugs,
        "plausible_patches": plausible_patches,
        "avg_aed": mean(aeds),
        "med_aed": median(aeds),
        "avg_ccr": mean(ccrs),
        "med_ccr": median(ccrs),
        "no_op_all_pct": no_op_all / actual_patches * 100 if actual_patches else 0.0,
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
        "normalized_bugs",
        "padded_bugs",
        "pass@1",
        "pass@5",
        "pass@10",
        "plausible_patches",
        "avg_aed",
        "med_aed",
        "avg_ccr",
        "med_ccr",
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
                values.append(f"{value:.2f}" if isinstance(value, float) else str(value))
            handle.write("| " + " | ".join(values) + " |\n")


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("--root", default="/home/barty/GLEAM-Lab/PAFT")
    parser.add_argument("--models", nargs="+", required=True)
    parser.add_argument("--expected-count", type=int, default=EXPECTED_PATCH_COUNT)
    parser.add_argument("--csv")
    parser.add_argument("--md")
    args = parser.parse_args()

    rows = [summarize_model(Path(args.root), model, args.expected_count) for model in args.models]
    if args.csv:
        write_csv(rows, Path(args.csv))
    if args.md:
        write_markdown(rows, Path(args.md))
    for row in rows:
        print(
            f"{row['model']}: pass@1/5/10={row['pass@1']:.2f}/"
            f"{row['pass@5']:.2f}/{row['pass@10']:.2f}, "
            f"AED={row['avg_aed']:.2f}/{row['med_aed']:.2f}, "
            f"CCR={row['avg_ccr']:.2f}/{row['med_ccr']:.2f}"
        )


if __name__ == "__main__":
    main()
