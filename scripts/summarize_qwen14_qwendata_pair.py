#!/usr/bin/env python3
"""Summarize the two Qwen14 qwendata PAFT rerun seeds."""

from __future__ import annotations

import argparse
import csv
import statistics
from pathlib import Path


NUMERIC_FIELDS = [
    "pass1_est",
    "fixed0_plausible",
    "fixed0_avg_aed",
    "fixed0_med_aed",
    "fixed0_avg_ccr",
    "fixed0_med_ccr",
    "no_op_fixed0",
    "no_op_fixed0_pct",
]


def read_one(path: Path) -> dict[str, str]:
    with path.open(newline="", encoding="utf-8") as f:
        rows = list(csv.DictReader(f))
    if len(rows) != 1:
        raise ValueError(f"expected one row in {path}, found {len(rows)}")
    row = rows[0]
    row["source_csv"] = str(path)
    return row


def mean_std(rows: list[dict[str, str]], field: str) -> tuple[float, float]:
    values = [float(row[field]) for row in rows]
    std = statistics.stdev(values) if len(values) > 1 else 0.0
    return statistics.mean(values), std


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("--inputs", nargs="+", required=True)
    parser.add_argument("--csv", required=True)
    parser.add_argument("--md", required=True)
    args = parser.parse_args()

    rows = [read_one(Path(path)) for path in args.inputs]
    summary: dict[str, str] = {
        "model": "qwen14_qwendata_w15_s401_s402_mean",
        "source_csv": ";".join(row["source_csv"] for row in rows),
    }
    for field in NUMERIC_FIELDS:
        avg, std = mean_std(rows, field)
        summary[f"{field}_mean"] = f"{avg:.6f}"
        summary[f"{field}_std"] = f"{std:.6f}"

    csv_path = Path(args.csv)
    csv_path.parent.mkdir(parents=True, exist_ok=True)
    fieldnames = sorted({key for row in rows + [summary] for key in row})
    with csv_path.open("w", newline="", encoding="utf-8") as f:
        writer = csv.DictWriter(f, fieldnames=fieldnames)
        writer.writeheader()
        for row in rows:
            writer.writerow(row)
        writer.writerow(summary)

    md = [
        "# Qwen14 qwendata PAFT w=1.5 Rerun Summary\n\n",
        "| Row | pass@1 | plausible | Avg./Med. AED | Avg./Med. CCR | no-op |\n",
        "|---|---:|---:|---:|---:|---:|\n",
    ]
    for row in rows:
        md.append(
            f"| {row['model']} | {float(row['pass1_est']):.2f} | {int(float(row['fixed0_plausible']))} | "
            f"{float(row['fixed0_avg_aed']):.2f}/{float(row['fixed0_med_aed']):.2f} | "
            f"{float(row['fixed0_avg_ccr']):.2f}/{float(row['fixed0_med_ccr']):.2f} | "
            f"{int(float(row['no_op_fixed0']))} ({float(row['no_op_fixed0_pct']):.2f}%) |\n"
        )
    md.append(
        f"| mean +/- std | {summary['pass1_est_mean']} +/- {summary['pass1_est_std']} | "
        f"{summary['fixed0_plausible_mean']} +/- {summary['fixed0_plausible_std']} | "
        f"{summary['fixed0_avg_aed_mean']} +/- {summary['fixed0_avg_aed_std']} / "
        f"{summary['fixed0_med_aed_mean']} +/- {summary['fixed0_med_aed_std']} | "
        f"{summary['fixed0_avg_ccr_mean']} +/- {summary['fixed0_avg_ccr_std']} / "
        f"{summary['fixed0_med_ccr_mean']} +/- {summary['fixed0_med_ccr_std']} | "
        f"{summary['no_op_fixed0_mean']} +/- {summary['no_op_fixed0_std']} |\n"
    )
    Path(args.md).write_text("".join(md), encoding="utf-8")


if __name__ == "__main__":
    main()
