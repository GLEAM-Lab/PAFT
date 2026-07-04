#!/usr/bin/env python3
"""Summarize HumanEvalPack-Python generation/evaluation outputs."""

from __future__ import annotations

import argparse
import csv
import json
from pathlib import Path

from run_humanevalpack_python import (
    ccr,
    full_buggy,
    levenshtein_distance,
    load_dataset_rows,
    normalize_candidate,
)


DEFAULT_MODELS = [
    ("Base", "deepseek-6.7b"),
    ("PAFT", "deepseek-6.7b-trained-prorepair"),
    ("SFT", "deepseek-6.7b-trained-noprompt"),
]


def read_summary(out_dir: Path, model_id: str, n_samples: int) -> dict:
    return json.loads((out_dir / model_id / f"eval_n{n_samples}.json").read_text(encoding="utf-8"))["summary"]


def first_plausible_metrics(
    out_dir: Path,
    label: str,
    model_id: str,
    rows_by_id: dict[str, dict],
    n_samples: int,
) -> dict[str, dict]:
    eval_data = json.loads((out_dir / model_id / f"eval_n{n_samples}.json").read_text(encoding="utf-8"))
    details_by_id = {item["task_id"]: item for item in eval_data["details"]}
    metrics = {}
    gen_path = out_dir / model_id / f"generations_n{n_samples}.jsonl"
    with gen_path.open("r", encoding="utf-8") as fh:
        for line in fh:
            if not line.strip():
                continue
            record = json.loads(line)
            task_id = record["task_id"]
            row = rows_by_id[task_id]
            detail = details_by_id[task_id]
            for result in detail["results"][:n_samples]:
                if not result["passed"]:
                    continue
                idx = result["index"]
                item = record["candidates"][idx]
                candidate = normalize_candidate(row, item.get("raw", "")) if item.get("raw") else item.get("candidate", "")
                buggy = full_buggy(row)
                metrics[task_id] = {
                    "label": label,
                    "model_id": model_id,
                    "candidate_index": idx,
                    "aed": levenshtein_distance(buggy.strip(), candidate.strip()),
                    "ccr": ccr(buggy, candidate),
                }
                break
    return metrics


def summarize(values: list[float]) -> tuple[float, float]:
    values = sorted(values)
    if not values:
        return 0.0, 0.0
    avg = sum(values) / len(values)
    mid = len(values) // 2
    if len(values) % 2:
        med = values[mid]
    else:
        med = (values[mid - 1] + values[mid]) / 2
    return avg, med


def parse_models(items: list[str]) -> list[tuple[str, str]]:
    if not items:
        return DEFAULT_MODELS
    parsed = []
    for item in items:
        if "=" not in item:
            raise ValueError(f"model mapping must be Label=model_id: {item}")
        label, model_id = item.split("=", 1)
        parsed.append((label, model_id))
    return parsed


def write_summary(
    out_dir: Path,
    models: list[tuple[str, str]],
    n_samples: int,
    tag: str,
    max_tokens: int | None,
    backend: str,
) -> None:
    rows = []
    for label, model_id in models:
        data = read_summary(out_dir, model_id, n_samples)
        rows.append({
            "label": label,
            "model_id": model_id,
            "pass@1": data["pass@1"],
            f"pass@{min(5, n_samples)}": data["pass@5"],
            "avg_aed": data["aed_avg"],
            "med_aed": data["aed_median"],
            "avg_ccr": data["ccr_avg"],
            "med_ccr": data["ccr_median"],
            "noop_first": data["noop_first"],
            "noop_all": data["noop_all"],
            "plausible_candidates": data["plausible_candidates"],
            "resolved_tasks": data["resolved_tasks"],
        })

    csv_path = out_dir / f"summary_{tag}.csv"
    with csv_path.open("w", newline="", encoding="utf-8") as fh:
        writer = csv.DictWriter(fh, fieldnames=list(rows[0]))
        writer.writeheader()
        writer.writerows(rows)

    md_path = out_dir / f"summary_{tag}.md"
    with md_path.open("w", encoding="utf-8") as fh:
        fh.write("# HumanEvalPack-Python Summary\n\n")
        fh.write(f"- n_samples: {n_samples}\n")
        if max_tokens is not None:
            fh.write(f"- max_tokens: {max_tokens}\n")
        fh.write(f"- Backend: {backend}\n")
        fh.write("- Prompt: standard PAFT repair prompt, no minimal-change phrase\n\n")
        fh.write("| Model | pass@1 | pass@5 | Avg AED | Med AED | Avg CCR | Med CCR | no-op first/all | plausible candidates |\n")
        fh.write("|---|---:|---:|---:|---:|---:|---:|---:|---:|\n")
        for row in rows:
            fh.write(
                f"| {row['label']} | {row['pass@1']:.2f} | {row[f'pass@{min(5, n_samples)}']:.2f} | "
                f"{row['avg_aed']:.2f} | {row['med_aed']:.2f} | "
                f"{row['avg_ccr']:.2f} | {row['med_ccr']:.2f} | "
                f"{row['noop_first']}/{row['noop_all']} | {row['plausible_candidates']} |\n"
            )
    print(md_path)
    print(csv_path)


def write_common(out_dir: Path, models: list[tuple[str, str]], n_samples: int, tag: str, max_tokens: int | None) -> None:
    rows_by_id = {row["task_id"]: row for row in load_dataset_rows()}
    metrics_by_model = {
        label: first_plausible_metrics(out_dir, label, model_id, rows_by_id, n_samples)
        for label, model_id in models
    }
    label_order = [label for label, _ in models]
    scopes = [("+".join(label_order), label_order)]
    if "SFT" in metrics_by_model and "PAFT" in metrics_by_model:
        scopes.append(("SFT+PAFT", ["SFT", "PAFT"]))
    if "Base" in metrics_by_model and "PAFT" in metrics_by_model:
        scopes.append(("Base+PAFT", ["Base", "PAFT"]))

    rows = []
    for scope, labels in scopes:
        common = set.intersection(*(set(metrics_by_model[label]) for label in labels))
        for label in labels:
            items = [metrics_by_model[label][task_id] for task_id in common]
            aed_avg, aed_med = summarize([item["aed"] for item in items])
            ccr_avg, ccr_med = summarize([item["ccr"] for item in items])
            rows.append({
                "scope": scope,
                "model": label,
                "common_tasks": len(common),
                "avg_aed": aed_avg,
                "med_aed": aed_med,
                "avg_ccr": ccr_avg,
                "med_ccr": ccr_med,
            })

    csv_path = out_dir / f"common_plausible_{tag}.csv"
    with csv_path.open("w", newline="", encoding="utf-8") as fh:
        writer = csv.DictWriter(fh, fieldnames=list(rows[0]))
        writer.writeheader()
        writer.writerows(rows)

    md_path = out_dir / f"common_plausible_{tag}.md"
    with md_path.open("w", encoding="utf-8") as fh:
        fh.write("# HumanEvalPack-Python Common-Plausible Audit\n\n")
        fh.write(f"- n_samples: {n_samples}\n")
        if max_tokens is not None:
            fh.write(f"- max_tokens: {max_tokens}\n")
        fh.write("- Metric scope: first plausible candidate per commonly solved task\n\n")
        fh.write("| Scope | Model | Common tasks | Avg AED | Med AED | Avg CCR | Med CCR |\n")
        fh.write("|---|---|---:|---:|---:|---:|---:|\n")
        for row in rows:
            fh.write(
                f"| {row['scope']} | {row['model']} | {row['common_tasks']} | "
                f"{row['avg_aed']:.2f} | {row['med_aed']:.2f} | "
                f"{row['avg_ccr']:.2f} | {row['med_ccr']:.2f} |\n"
            )
    print(md_path)
    print(csv_path)


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("--out-dir", required=True)
    parser.add_argument("--n-samples", type=int, default=5)
    parser.add_argument("--tag", default="summary")
    parser.add_argument("--max-tokens", type=int, default=None)
    parser.add_argument("--backend", default="transformers")
    parser.add_argument("--model", action="append", default=[], help="Label=model_id")
    args = parser.parse_args()

    out_dir = Path(args.out_dir)
    models = parse_models(args.model)
    write_summary(out_dir, models, args.n_samples, args.tag, args.max_tokens, args.backend)
    write_common(out_dir, models, args.n_samples, args.tag, args.max_tokens)


if __name__ == "__main__":
    main()
