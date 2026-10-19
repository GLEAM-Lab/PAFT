#!/usr/bin/env python3
"""Summarize QuixBugs-Python eval_n*.json files into CSV/Markdown tables."""

from __future__ import annotations

import argparse
import csv
import json
from pathlib import Path
from typing import Any


HEADERS = [
    "model_id",
    "tasks",
    "n_samples",
    "pass@1",
    "pass@5",
    "resolved_tasks",
    "plausible_candidates",
    "aed_avg",
    "aed_median",
    "ccr_avg",
    "ccr_median",
    "noop_first",
    "noop_all",
]


def read_summary(path: Path) -> dict[str, Any]:
    data = json.loads(path.read_text(encoding="utf-8"))
    summary = data.get("summary", {})
    if not isinstance(summary, dict):
        raise ValueError(f"missing summary object in {path}")
    return summary


def fmt(value: Any) -> str:
    if value is None:
        return ""
    if isinstance(value, float):
        return f"{value:.2f}"
    return str(value)


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("--out-dir", required=True, help="Directory containing per-model QuixBugs outputs.")
    parser.add_argument("--models", nargs="*", help="Model ids to include. Defaults to all eval files under out-dir.")
    parser.add_argument("--n-samples", type=int, default=5)
    parser.add_argument("--csv", required=True)
    parser.add_argument("--md", required=True)
    args = parser.parse_args()

    root = Path(args.out_dir)
    if args.models:
        eval_paths = [root / model / f"eval_n{args.n_samples}.json" for model in args.models]
    else:
        eval_paths = sorted(root.glob(f"*/eval_n{args.n_samples}.json"))
    rows = [read_summary(path) for path in eval_paths if path.exists()]
    if not rows:
        raise FileNotFoundError(f"no eval_n{args.n_samples}.json files found under {root}")

    csv_path = Path(args.csv)
    csv_path.parent.mkdir(parents=True, exist_ok=True)
    with csv_path.open("w", encoding="utf-8", newline="") as fh:
        writer = csv.DictWriter(fh, fieldnames=HEADERS)
        writer.writeheader()
        writer.writerows({key: row.get(key) for key in HEADERS} for row in rows)

    md_path = Path(args.md)
    md_path.parent.mkdir(parents=True, exist_ok=True)
    with md_path.open("w", encoding="utf-8") as fh:
        fh.write("| " + " | ".join(HEADERS) + " |\n")
        fh.write("|" + "|".join(["---"] + ["---:"] * (len(HEADERS) - 1)) + "|\n")
        for row in rows:
            fh.write("| " + " | ".join(fmt(row.get(header)) for header in HEADERS) + " |\n")

    print(f"wrote {csv_path} and {md_path}")


if __name__ == "__main__":
    main()
