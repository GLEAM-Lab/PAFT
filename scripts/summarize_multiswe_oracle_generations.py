#!/usr/bin/env python3
"""Summarize Multi-SWE oracle-context generator outputs.

This is a lightweight generator-level summary. It does not replace the official
Multi-SWE Docker harness; it audits patch-format, touched files, and textual
locality against gold patches for the fixed smoke subset.
"""

from __future__ import annotations

import argparse
import csv
import json
import re
from pathlib import Path
from statistics import mean, median
from typing import Any


def changed_files_from_patch(patch: str) -> list[str]:
    return [
        match.group(2)
        for match in re.finditer(r"^diff --git a/(.*?) b/(.*?)$", patch or "", flags=re.MULTILINE)
    ]


def levenshtein(a: str, b: str, max_cells: int) -> int | None:
    if len(a) * len(b) > max_cells:
        return None
    if len(a) < len(b):
        a, b = b, a
    previous = list(range(len(b) + 1))
    for i, ca in enumerate(a, start=1):
        current = [i]
        for j, cb in enumerate(b, start=1):
            current.append(
                min(
                    previous[j] + 1,
                    current[j - 1] + 1,
                    previous[j - 1] + (0 if ca == cb else 1),
                )
            )
        previous = current
    return previous[-1]


def load_contexts(path: Path) -> dict[str, dict[str, Any]]:
    return {
        row["instance_id"]: row
        for row in (json.loads(line) for line in path.read_text(encoding="utf-8").splitlines() if line.strip())
    }


def summarize_model(
    contexts: dict[str, dict[str, Any]], tag: str, output_root: Path, max_aed_cells: int
) -> dict[str, Any]:
    pred_path = output_root / tag / "predictions.jsonl"
    rows = []
    if pred_path.exists():
        rows = [json.loads(line) for line in pred_path.read_text(encoding="utf-8").splitlines() if line.strip()]
    by_id = {row["instance_id"]: row for row in rows}
    records = []
    for instance_id, context in contexts.items():
        pred = by_id.get(instance_id, {})
        patch = pred.get("fix_patch", "") or ""
        gold = context.get("gold_patch", "") or ""
        gen_files = set(changed_files_from_patch(patch))
        gold_files = set(context.get("patch_files", []))
        intersect = gen_files & gold_files
        precision = len(intersect) / len(gen_files) if gen_files else 0.0
        recall = len(intersect) / len(gold_files) if gold_files else 0.0
        records.append(
            {
                "bucket": context.get("bucket", ""),
                "repo": context.get("repo", ""),
                "instance_id": instance_id,
                "nonempty_patch": bool(patch.strip()),
                "patch_chars": len(patch),
                "gold_patch_chars": len(gold),
                "patch_text_aed": levenshtein(patch, gold, max_aed_cells) if patch.strip() and gold else None,
                "generated_file_count": len(gen_files),
                "gold_file_count": len(gold_files),
                "prompt_chars": len(context.get("prompt", "") or ""),
                "file_precision": precision,
                "file_recall": recall,
                "extra_file_count": len(gen_files - gold_files),
                "missing_file_count": len(gold_files - gen_files),
                "generated_files": json.dumps(sorted(gen_files), ensure_ascii=False),
                "gold_files": json.dumps(sorted(gold_files), ensure_ascii=False),
            }
        )
    nonempty = [record for record in records if record["nonempty_patch"]]
    aeds = [record["patch_text_aed"] for record in nonempty if record["patch_text_aed"] is not None]
    return {
        "model": tag,
        "predictions_path": str(pred_path),
        "instances": len(contexts),
        "predictions": len(rows),
        "nonempty": len(nonempty),
        "nonempty_pct": len(nonempty) / len(contexts) * 100 if contexts else 0.0,
        "avg_patch_chars": mean([record["patch_chars"] for record in nonempty]) if nonempty else 0.0,
        "med_patch_chars": median([record["patch_chars"] for record in nonempty]) if nonempty else 0.0,
        "avg_patch_text_aed": mean(aeds) if aeds else 0.0,
        "med_patch_text_aed": median(aeds) if aeds else 0.0,
        "patch_text_aed_n": len(aeds),
        "avg_file_precision": mean([record["file_precision"] for record in nonempty]) if nonempty else 0.0,
        "avg_file_recall": mean([record["file_recall"] for record in nonempty]) if nonempty else 0.0,
        "avg_extra_file_count": mean([record["extra_file_count"] for record in nonempty]) if nonempty else 0.0,
        "avg_missing_file_count": mean([record["missing_file_count"] for record in nonempty]) if nonempty else 0.0,
        "records": records,
    }


def bucket_summary(summary: dict[str, Any]) -> list[dict[str, Any]]:
    rows: list[dict[str, Any]] = []
    buckets = sorted({str(record.get("bucket", "")) for record in summary["records"]})
    for bucket in buckets:
        records = [
            record
            for record in summary["records"]
            if str(record.get("bucket", "")) == bucket and record["nonempty_patch"]
        ]
        if not records:
            continue
        aeds = [record["patch_text_aed"] for record in records if record["patch_text_aed"] is not None]
        rows.append(
            {
                "model": summary["model"],
                "bucket": bucket,
                "instances": len(records),
                "avg_patch_chars": mean([record["patch_chars"] for record in records]),
                "med_patch_chars": median([record["patch_chars"] for record in records]),
                "avg_patch_text_aed": mean(aeds) if aeds else 0.0,
                "med_patch_text_aed": median(aeds) if aeds else 0.0,
                "patch_text_aed_n": len(aeds),
                "avg_file_precision": mean([record["file_precision"] for record in records]),
                "avg_file_recall": mean([record["file_recall"] for record in records]),
                "avg_missing_file_count": mean([record["missing_file_count"] for record in records]),
            }
        )
    return rows


def write_outputs(
    summaries: list[dict[str, Any]], csv_path: Path, md_path: Path, details_csv_path: Path | None
) -> None:
    csv_path.parent.mkdir(parents=True, exist_ok=True)
    fields = [
        "model",
        "instances",
        "predictions",
        "nonempty",
        "nonempty_pct",
        "avg_patch_chars",
        "med_patch_chars",
        "avg_patch_text_aed",
        "med_patch_text_aed",
        "avg_file_precision",
        "avg_file_recall",
        "avg_extra_file_count",
        "avg_missing_file_count",
        "predictions_path",
        "patch_text_aed_n",
    ]
    with csv_path.open("w", encoding="utf-8", newline="") as handle:
        writer = csv.DictWriter(handle, fieldnames=fields)
        writer.writeheader()
        for summary in summaries:
            writer.writerow({key: summary[key] for key in fields})
    lines = [
        "# Multi-SWE Java Smoke10 Generator-Level Summary",
        "",
        "This summarizes generated unified diffs against gold patch metadata. It is not an official Multi-SWE harness pass/fail result.",
        "",
        "| Model | Predictions | Nonempty | Avg/Med patch chars | Avg/Med patch-text AED (n) | File P/R | Extra/Missing files |",
        "|---|---:|---:|---:|---:|---:|---:|",
    ]
    for summary in summaries:
        lines.append(
            f"| `{summary['model']}` | {summary['predictions']}/{summary['instances']} | "
            f"{summary['nonempty']} ({summary['nonempty_pct']:.1f}%) | "
            f"{summary['avg_patch_chars']:.1f}/{summary['med_patch_chars']:.1f} | "
            f"{summary['avg_patch_text_aed']:.1f}/{summary['med_patch_text_aed']:.1f} ({summary['patch_text_aed_n']}) | "
            f"{summary['avg_file_precision']:.2f}/{summary['avg_file_recall']:.2f} | "
            f"{summary['avg_extra_file_count']:.2f}/{summary['avg_missing_file_count']:.2f} |"
        )
    bucket_rows = [row for summary in summaries for row in bucket_summary(summary)]
    if bucket_rows:
        lines += [
            "",
            "## By Complexity Bucket",
            "",
            "Buckets are inherited from the deterministic smoke manifest: single-file, two-file, and three-plus-file gold patches.",
            "",
            "| Model | Bucket | Instances | Avg/Med patch chars | Avg/Med patch-text AED (n) | File P/R | Missing files |",
            "|---|---|---:|---:|---:|---:|---:|",
        ]
        for row in bucket_rows:
            if row["patch_text_aed_n"]:
                aed_text = f"{row['avg_patch_text_aed']:.1f}/{row['med_patch_text_aed']:.1f} ({row['patch_text_aed_n']})"
            else:
                aed_text = "-/- (0)"
            lines.append(
                f"| `{row['model']}` | {row['bucket']} | {row['instances']} | "
                f"{row['avg_patch_chars']:.1f}/{row['med_patch_chars']:.1f} | "
                f"{aed_text} | "
                f"{row['avg_file_precision']:.2f}/{row['avg_file_recall']:.2f} | "
                f"{row['avg_missing_file_count']:.2f} |"
            )
    md_path.write_text("\n".join(lines) + "\n", encoding="utf-8")

    if details_csv_path is not None:
        details_csv_path.parent.mkdir(parents=True, exist_ok=True)
        detail_fields = [
            "model",
            "bucket",
            "repo",
            "instance_id",
            "nonempty_patch",
            "patch_chars",
            "gold_patch_chars",
            "patch_text_aed",
            "generated_file_count",
            "gold_file_count",
            "prompt_chars",
            "file_precision",
            "file_recall",
            "extra_file_count",
            "missing_file_count",
            "generated_files",
            "gold_files",
        ]
        with details_csv_path.open("w", encoding="utf-8", newline="") as handle:
            writer = csv.DictWriter(handle, fieldnames=detail_fields)
            writer.writeheader()
            for summary in summaries:
                for record in summary["records"]:
                    writer.writerow({"model": summary["model"], **record})


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument(
        "--contexts",
        default="analysis_outputs/multiswe_java_verified_runnable_smoke10_ctx5_max20k_20260704.jsonl",
    )
    parser.add_argument("--output-root", default="analysis_outputs/multiswe_java_smoke10_generations")
    parser.add_argument("--csv", default="analysis_outputs/multiswe_java_smoke10_generator_summary_20260704.csv")
    parser.add_argument("--md", default="analysis_outputs/multiswe_java_smoke10_generator_summary_20260704.md")
    parser.add_argument(
        "--details-csv",
        default=None,
        help="Optional per-model, per-instance detail CSV. Defaults to <csv stem>_details.csv.",
    )
    parser.add_argument("--model", action="append", required=True)
    parser.add_argument("--max-aed-cells", type=int, default=5_000_000)
    args = parser.parse_args()

    contexts = load_contexts(Path(args.contexts))
    summaries = [
        summarize_model(contexts, model, Path(args.output_root), args.max_aed_cells)
        for model in args.model
    ]
    details_csv = Path(args.details_csv) if args.details_csv else Path(args.csv).with_name(Path(args.csv).stem + "_details.csv")
    write_outputs(summaries, Path(args.csv), Path(args.md), details_csv)
    print(args.csv)
    print(args.md)
    print(details_csv)


if __name__ == "__main__":
    main()
