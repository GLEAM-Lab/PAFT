#!/usr/bin/env python3
"""Summarize current PAFT evidence candidates for the TSE revision."""

from __future__ import annotations

import csv
import json
import re
import statistics
import sys
from pathlib import Path

sys.path.insert(0, str(Path(__file__).resolve().parents[1]))

from scripts.run_quixbugs_python import ccr as quixbugs_ccr
from scripts.run_quixbugs_python import load_tasks as load_quixbugs_tasks


ROOT = Path("analysis_outputs")


def read_d4j_rows(path: Path) -> list[dict[str, object]]:
    if not path.exists():
        return []
    with path.open(newline="", encoding="utf-8") as f:
        return [{"benchmark": "Defects4J", **row} for row in csv.DictReader(f)]


def read_quixbugs_opencoder_rows() -> list[dict[str, object]]:
    rows: list[dict[str, object]] = []
    for model in ["opencoder8b", "opencoder8b-sft", "opencoder8b-paft"]:
        path = ROOT / "quixbugs_python_opencoder8b_pass1" / model / "eval_n1.json"
        if not path.exists():
            continue
        summary = json.loads(path.read_text(encoding="utf-8"))["summary"]
        rows.append(
            {
                "benchmark": "QuixBugs-Python",
                "model": model,
                "pass1_est": summary.get("pass@1"),
                "fixed0_avg_aed": summary.get("aed_avg"),
                "fixed0_med_aed": summary.get("aed_median"),
                "fixed0_avg_ccr": summary.get("ccr_avg"),
                "fixed0_med_ccr": summary.get("ccr_median"),
                "no_op_fixed0_pct": summary.get("noop_first_rate"),
                "no_op_plausible": "",
            }
        )
    return rows


def read_ds67_quixbugs_multirun() -> list[dict[str, object]]:
    seed_roots = [ROOT / "quixbugs_python_ds67_benchmark_prompt"]
    seed_roots += [ROOT / f"quixbugs_python_ds67_benchmark_prompt_rerun_seed{seed}" for seed in [101, 102, 103, 104]]
    models = [
        "deepseek-6.7b",
        "deepseek-6.7b-trained-noprompt",
        "deepseek-6.7b-trained-prorepair",
    ]
    summaries: dict[str, list[dict[str, object]]] = {model: [] for model in models}
    quixbugs_dir = Path("data/QuixBugs")
    tasks = {task["task_id"]: task for task in load_quixbugs_tasks(quixbugs_dir)} if quixbugs_dir.exists() else {}
    for root in seed_roots:
        for model in models:
            eval_path = root / model / "eval_n5.json"
            gen_path = root / model / "generations_n5.jsonl"
            if not eval_path.exists():
                continue
            eval_data = json.loads(eval_path.read_text(encoding="utf-8"))
            summary = dict(eval_data["summary"])
            if tasks and gen_path.exists():
                generations = {
                    json.loads(line)["task_id"]: json.loads(line)["candidates"]
                    for line in gen_path.open(encoding="utf-8")
                }
                ccr_values = []
                for detail in eval_data["details"]:
                    task_id = detail["task_id"]
                    if task_id not in tasks or task_id not in generations:
                        continue
                    for result in detail["results"]:
                        if result["passed"]:
                            candidate = generations[task_id][result["index"]]["candidate"]
                            ccr_values.append(quixbugs_ccr(tasks[task_id]["buggy"], candidate))
                if ccr_values:
                    summary["ccr_avg"] = statistics.mean(ccr_values)
                    summary["ccr_median"] = statistics.median(ccr_values)
            summaries[model].append(summary)

    def mean(values: list[dict[str, object]], key: str) -> float | None:
        xs = [float(v[key]) for v in values if v.get(key) is not None]
        return statistics.mean(xs) if xs else None

    def stdev(values: list[dict[str, object]], key: str) -> float:
        xs = [float(v[key]) for v in values if v.get(key) is not None]
        return statistics.stdev(xs) if len(xs) > 1 else 0.0

    rows: list[dict[str, object]] = []
    for model, values in summaries.items():
        if not values:
            continue
        rows.append(
            {
                "model": model,
                "runs": len(values),
                "pass1_mean": mean(values, "pass@1"),
                "pass1_std": stdev(values, "pass@1"),
                "pass5_mean": mean(values, "pass@5"),
                "pass5_std": stdev(values, "pass@5"),
                "aed_avg_mean": mean(values, "aed_avg"),
                "aed_median_mean": mean(values, "aed_median"),
                "ccr_avg_mean": mean(values, "ccr_avg"),
                "ccr_median_mean": mean(values, "ccr_median"),
                "noop_first_mean": mean(values, "noop_first_rate"),
            }
        )
    return rows


def read_frontier_rows(path: Path) -> list[dict[str, object]]:
    if not path.exists():
        return []
    with path.open(newline="", encoding="utf-8") as f:
        return list(csv.DictReader(f))


def read_csv_rows(path: Path) -> list[dict[str, str]]:
    if not path.exists():
        return []
    with path.open(newline="", encoding="utf-8") as f:
        return list(csv.DictReader(f))


def read_markdown_table_rows(path: Path, header_first_cell: str) -> list[dict[str, str]]:
    if not path.exists():
        return []
    rows: list[dict[str, str]] = []
    header: list[str] | None = None
    for line in path.read_text(encoding="utf-8").splitlines():
        stripped = line.strip()
        if not stripped.startswith("|") or "---" in stripped:
            continue
        cells = [cell.strip() for cell in stripped.strip("|").split("|")]
        if not cells:
            continue
        if cells[0] == header_first_cell:
            header = cells
            continue
        if header and len(cells) == len(header):
            rows.append(dict(zip(header, cells)))
    return rows


def read_leakage_summary(path: Path) -> dict[str, str]:
    if not path.exists():
        return {}
    text = path.read_text(encoding="utf-8")
    fields = {
        "train_snippets": r"Train snippets:\s*(\d+)",
        "eval_snippets": r"Evaluation snippets:\s*(\d+)",
        "ngram_size": r"Token n-gram size:\s*(\d+)",
        "max_jaccard": r"Max Jaccard:\s*([0-9.]+)",
        "above_threshold": r"Pairs above threshold 0\.60:\s*(\d+)",
    }
    out: dict[str, str] = {}
    for key, pattern in fields.items():
        match = re.search(pattern, text)
        if match:
            out[key] = match.group(1)
    return out


def read_first_existing_csv(paths: list[Path]) -> list[dict[str, str]]:
    for path in paths:
        rows = read_csv_rows(path)
        if rows:
            return rows
    return []


def read_json_obj(path: Path) -> dict[str, object]:
    if not path.exists():
        return {}
    try:
        data = json.loads(path.read_text(encoding="utf-8"))
    except Exception:
        return {}
    return data if isinstance(data, dict) else {}


def write_csv(path: Path, rows: list[dict[str, object]]) -> None:
    if not rows:
        return
    fieldnames = sorted({key for row in rows for key in row})
    with path.open("w", newline="", encoding="utf-8") as f:
        writer = csv.DictWriter(f, fieldnames=fieldnames)
        writer.writeheader()
        writer.writerows(rows)


def as_float(row: dict[str, object], key: str) -> float:
    return float(row[key])  # type: ignore[arg-type]


def fmt_metric(row: dict[str, object], avg_key: str = "avg_aed", med_key: str = "med_aed") -> str:
    return f"{float(row[avg_key]):.2f}/{float(row[med_key]):.2f}"


def aggregate_d4j_format_rows(rows: list[dict[str, object]]) -> list[dict[str, object]]:
    grouped: dict[str, dict[str, object]] = {}
    for row in rows:
        model = str(row.get("model", ""))
        if not model:
            continue
        agg = grouped.setdefault(
            model,
            {
                "model": model,
                "files": 0,
                "java_like": 0,
                "prose_like": 0,
                "diff_like": 0,
                "empty": 0,
                "no_op": 0,
            },
        )
        for key in ["files", "java_like", "prose_like", "diff_like", "empty", "no_op"]:
            agg[key] = int(agg[key]) + int(float(row.get(key, 0) or 0))
    out = list(grouped.values())
    for row in out:
        files = float(row["files"])
        row["java_like_pct"] = float(row["java_like"]) / files * 100 if files else 0.0
        row["prose_like_pct"] = float(row["prose_like"]) / files * 100 if files else 0.0
        row["diff_like_pct"] = float(row["diff_like"]) / files * 100 if files else 0.0
    return out


def main() -> None:
    all_rows: list[dict[str, object]] = []
    all_rows += read_d4j_rows(ROOT / "d4j_opencoder8b_all_pass1_metrics_20260620.csv")
    all_rows += read_d4j_rows(ROOT / "d4j_qwen25_14b_all_pass1_metrics.csv")
    all_rows += read_d4j_rows(ROOT / "d4j_qwen25_14b_weight_sweep_pass1_metrics_20260620.csv")
    all_rows += read_quixbugs_opencoder_rows()
    ds67_rows = read_ds67_quixbugs_multirun()
    fixed_quix_rows = read_csv_rows(ROOT / "tse_quixbugs_ds67_fixed_seed7106_summary.csv")
    frontier_rows = read_frontier_rows(ROOT / "d4j_frontier_api_pass1_metrics_20260621.csv")
    qwen_common_rows = read_csv_rows(ROOT / "qwen14_base_sft_paft_common_plausible_metrics.csv")
    qwen3_common_paft_rows = read_csv_rows(ROOT / "qwen3max_minimal_vs_qwen14_paft_common_plausible_metrics.csv")
    qwen3_common_sft_rows = read_csv_rows(ROOT / "qwen3max_minimal_vs_qwen14_sft_common_plausible_metrics.csv")
    qwen3_common_base_rows = read_csv_rows(ROOT / "qwen3max_minimal_vs_qwen14_base_common_plausible_metrics.csv")
    hepack_rows = read_csv_rows(
        ROOT / "humanevalpack_python_ds67_lora_tfm_20260701_seed7202" / "summary_20260703.csv"
    )
    hepack_common_rows = read_csv_rows(
        ROOT / "humanevalpack_python_ds67_lora_tfm_20260701_seed7202" / "common_plausible_20260703.csv"
    )
    hepack_qwen14_rows = read_first_existing_csv([
        ROOT / "humanevalpack_python_qwen14_oldrecipe_20260703_seed7202" / "summary_20260704_w2.csv",
        ROOT / "humanevalpack_python_qwen14_oldrecipe_20260703_seed7202" / "summary_20260703.csv",
    ])
    hepack_qwen14_common_rows = read_first_existing_csv([
        ROOT / "humanevalpack_python_qwen14_oldrecipe_20260703_seed7202" / "common_plausible_20260704_w2.csv",
        ROOT / "humanevalpack_python_qwen14_oldrecipe_20260703_seed7202" / "common_plausible_20260703.csv",
    ])
    hejava_qwen14_rows = read_csv_rows(ROOT / "humaneval_java_qwen14_oldrecipe_n1_s7301_20260703.csv")
    hejava_qwen14_pkgfix_n5_rows = read_csv_rows(
        ROOT / "humaneval_java_qwen14_oldrecipe_pkgfix_n5_all_s7302_20260703.csv"
    )
    d4j_qwen14_n5_rows = read_csv_rows(ROOT / "d4j_qwen14_oldrecipe_n5_w2_s7401_metrics_20260703.csv")
    if not d4j_qwen14_n5_rows:
        d4j_qwen14_n5_rows = read_csv_rows(ROOT / "d4j_qwen14_oldrecipe_n5_s7401_metrics_20260703.csv")
    d4j_qwen14_n10_partial_rows = read_csv_rows(ROOT / "d4j_qwen14_oldrecipe_n10_s7401_metrics_20260703.csv")
    if not d4j_qwen14_n10_partial_rows:
        d4j_qwen14_n10_partial_rows = read_csv_rows(
            ROOT / "d4j_qwen14_oldrecipe_n10_base_w15_w2_s7401_metrics_20260703.csv"
        )
    if not d4j_qwen14_n10_partial_rows:
        d4j_qwen14_n10_partial_rows = read_csv_rows(
        ROOT / "d4j_qwen14_oldrecipe_n10_base_w2_s7401_metrics_20260703.csv"
        )
    d4j_qwen14_seed7402_rows = read_csv_rows(
        ROOT / "d4j_qwen14_oldrecipe_n10_s7402_metrics_20260704.csv"
    )
    hejava_qwen14_pkgfix_n5_s7301_rows = read_csv_rows(
        ROOT / "humaneval_java_qwen14_oldrecipe_pkgfix_n5_s7301_20260703.csv"
    )
    hejava_qwen14_pkgfix_n10_rows = read_csv_rows(
        ROOT / "humaneval_java_qwen14_oldrecipe_pkgfix_n10_s7302_20260704.csv"
    )
    quixbugs_qwen14_rows = read_csv_rows(ROOT / "quixbugs_python_qwen14_oldrecipe_seed7106_summary_20260703.csv")
    multiswe_neutral_rows = read_csv_rows(
        ROOT / "multiswe_java_smoke10_neutral_generator_summary_20260704.csv"
    )
    stable_region_rows = read_markdown_table_rows(
        ROOT / "tse_existing_backbone_d4j_summary.md", "Model"
    )
    noop_audit_rows = read_csv_rows(
        ROOT / "d4j_deepseek67b_current_complete_371_pass10_noop_20260701.csv"
    )
    leakage_summary = read_leakage_summary(
        ROOT / "d4j_train_eval_5gram_jaccard_summary_20260621.md"
    )
    multiswe_java_summary = read_json_obj(ROOT / "multiswe_java_verified_summary_20260703.json").get("summary", {})
    if not isinstance(multiswe_java_summary, dict):
        multiswe_java_summary = {}

    write_csv(ROOT / "tse_current_candidate_metrics.csv", all_rows)
    write_csv(ROOT / "tse_quixbugs_ds67_multirun_summary.csv", ds67_rows)

    lines: list[str] = []
    lines.append("# TSE Current Evidence Summary\n\n")
    if (ROOT / "tse_fixed_seed_manifest.md").exists():
        lines.append(
            "- Fixed-seed provenance is recorded in `analysis_outputs/tse_fixed_seed_manifest.md`. "
            "Report these as fixed-seed diagnostics, not repeated-seed robustness claims.\n\n"
        )
    if (ROOT / "tse_evidence_artifact_check.md").exists():
        lines.append(
            "- Reviewer-facing evidence gates are audited in `analysis_outputs/tse_evidence_artifact_check.md` "
            "(larger backbone, frontier prompting/common-plausible caution, stable-region edits, no-op, leakage, Multi-SWE, system-level APR scope, attribution/curriculum scope, cross-language, and fixed-seed reproducibility).\n\n"
        )

    lines.append("## Reportable Main Evidence\n\n")
    lines.append(
        "- **Defects4J / OpenCoder-8B**: PAFT improves pass@1 over both Base and SFT while sharply reducing AED. "
        "This is the cleanest new cross-backbone result.\n\n"
    )
    lines.append("| Model | pass@1 | Avg./Med. AED | Avg./Med. CCR | no-op |\n")
    lines.append("|---|---:|---:|---:|---:|\n")
    for model in ["opencoder8b", "opencoder8b-sft", "opencoder8b-paft"]:
        row = next((item for item in all_rows if item.get("benchmark") == "Defects4J" and item.get("model") == model), None)
        if row:
            lines.append(
                f"| {model} | {as_float(row, 'pass1_est'):.2f} | "
                f"{as_float(row, 'fixed0_avg_aed'):.2f}/{as_float(row, 'fixed0_med_aed'):.2f} | "
                f"{as_float(row, 'fixed0_avg_ccr'):.2f}/{as_float(row, 'fixed0_med_ccr'):.2f} | "
                f"{as_float(row, 'no_op_fixed0_pct'):.2f} |\n"
            )

    lines.append(
        "\n- **Defects4J / Qwen2.5-Coder-14B historical fixed0 sweep**: this earlier single-candidate audit is kept as sensitivity/provenance evidence only. "
        "Use the fixed-seed `n=10` block below as the reportable larger-backbone result; the `n=5` block is retained only as provenance/sensitivity evidence under the same sampled protocol.\n\n"
    )
    lines.append("| Model | pass@1 | Avg./Med. AED | Avg./Med. CCR | Use |\n")
    lines.append("|---|---:|---:|---:|---|\n")
    qwen_models = [
        ("qwen2.5coder14b", "historical fixed0 reference"),
        ("qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620", "historical fixed0 SFT"),
        ("qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620", "historical fixed0 positive PAFT point"),
        ("qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620", "historical fixed0 locality point"),
        ("qwen2.5coder14b-paft-oldrecipe-w125-lr2e4-e3-20260620", "historical fixed0 sensitivity point"),
    ]
    for model, recommendation in qwen_models:
        row = next((item for item in all_rows if item.get("benchmark") == "Defects4J" and item.get("model") == model), None)
        if row:
            lines.append(
                f"| {model} | {as_float(row, 'pass1_est'):.2f} | "
                f"{as_float(row, 'fixed0_avg_aed'):.2f}/{as_float(row, 'fixed0_med_aed'):.2f} | "
                f"{as_float(row, 'fixed0_avg_ccr'):.2f}/{as_float(row, 'fixed0_med_ccr'):.2f} | "
                f"{recommendation} |\n"
            )

    if d4j_qwen14_n5_rows:
        lines.append(
            "\n- **Defects4J / Qwen2.5-Coder-14B fixed seed 7401 (`n=5`)**: "
            "this earlier five-sample block is retained as provenance and sensitivity evidence for the larger-backbone diagnostic. "
            "Under the same Qwen14 backbone, prompt, decoding protocol, and sample budget, "
            "PAFT improves both correctness and locality over Base and SFT; the completed `n=10` block below is the reportable larger-backbone table. "
            "The w=2.0 row gives the strongest pass@1/pass@5, while w=1.5 remains the strongest AED/CCR operating point.\n\n"
        )
        lines.append("| Model | pass@1 | pass@5 | plausible patches | Avg./Med. AED | Avg./Med. CCR | no-op all |\n")
        lines.append("|---|---:|---:|---:|---:|---:|---:|\n")
        for row in d4j_qwen14_n5_rows:
            lines.append(
                f"| {row['model']} | {float(row['pass@1']):.2f} | {float(row['pass@5']):.2f} | "
                f"{int(float(row['plausible_patches']))} | "
                f"{float(row['avg_aed']):.2f}/{float(row['med_aed']):.2f} | "
                f"{float(row['avg_ccr']):.2f}/{float(row['med_ccr']):.2f} | "
                f"{float(row['no_op_all_pct']):.2f} |\n"
            )

    if d4j_qwen14_n10_partial_rows:
        lines.append(
            "\n- **Defects4J / Qwen2.5-Coder-14B fixed seed 7401 (`n=10`)**: "
            "this completed four-row continuation confirms the larger-backbone trend at the usual ten-candidate budget. "
            "Both PAFT settings improve pass@1/pass@5/pass@10 over Base and SFT while reducing AED and improving CCR; "
            "w=2.0 gives the strongest correctness, while w=1.5 gives the strongest AED/CCR operating point.\n\n"
        )
        lines.append("| Model | pass@1 | pass@5 | pass@10 | plausible patches | Avg./Med. AED | Avg./Med. CCR | no-op all |\n")
        lines.append("|---|---:|---:|---:|---:|---:|---:|---:|\n")
        for row in d4j_qwen14_n10_partial_rows:
            lines.append(
                f"| {row['model']} | {float(row['pass@1']):.2f} | {float(row['pass@5']):.2f} | "
                f"{float(row['pass@10']):.2f} | {int(float(row['plausible_patches']))} | "
                f"{float(row['avg_aed']):.2f}/{float(row['med_aed']):.2f} | "
                f"{float(row['avg_ccr']):.2f}/{float(row['med_ccr']):.2f} | "
                f"{float(row['no_op_all_pct']):.2f} |\n"
            )

    if d4j_qwen14_seed7402_rows:
        lines.append(
            "\n- **Defects4J / Qwen2.5-Coder-14B fixed seed 7402 (`n=10`)**: "
            "this follow-up is an internal stress/sensitivity seed, not a replacement for seed7401. "
            "Base is unusually weak, so do not use this block as the main larger-backbone result. "
            "It is still useful for characterizing the PAFT operating points: w=1.5 improves correctness over SFT "
            "and lowers median AED, while w=2.0 gives the strongest locality but loses correctness.\n\n"
        )
        lines.append("| Model | pass@1 | pass@5 | pass@10 | plausible patches | Avg./Med. AED | Avg./Med. CCR | Use |\n")
        lines.append("|---|---:|---:|---:|---:|---:|---:|---|\n")
        for row in d4j_qwen14_seed7402_rows:
            model = row["model"]
            use = "internal stress seed"
            if "w15" in model:
                use = "correctness-positive vs SFT; median-AED positive"
            elif "w2" in model:
                use = "locality-positive, correctness-negative"
            elif "sft" in model:
                use = "same-seed SFT comparator"
            lines.append(
                f"| {model} | {float(row['pass@1']):.2f} | {float(row['pass@5']):.2f} | "
                f"{float(row['pass@10']):.2f} | {int(float(row['plausible_patches']))} | "
                f"{float(row['avg_aed']):.2f}/{float(row['med_aed']):.2f} | "
                f"{float(row['avg_ccr']):.2f}/{float(row['med_ccr']):.2f} | {use} |\n"
            )

    if qwen_common_rows:
        lines.append("\n### Qwen14 Common-Plausible Audit\n\n")
        lines.append(
            "- This audit controls for the solved-bug subset when comparing edit locality. "
            "It is stronger than comparing AED over each model's own plausible set, but should still be framed as a diagnostic, not a new main benchmark.\n\n"
        )
        lines.append("| Scope | Model | common bugs | Avg./Med. AED | Avg./Med. CCR |\n")
        lines.append("|---|---|---:|---:|---:|\n")
        preferred_scopes = {
            "common_plausible:Qwen14-SFT+Qwen14-PAFT",
            "common_plausible:Qwen14-Base+Qwen14-SFT+Qwen14-PAFT",
        }
        for row in qwen_common_rows:
            if row["scope"] not in preferred_scopes:
                continue
            lines.append(
                f"| {row['scope']} | {row['model']} | {int(float(row['scored_bugs']))} | "
                f"{fmt_metric(row)} | {fmt_metric(row, 'avg_ccr', 'med_ccr')} |\n"
            )

    if qwen3_common_base_rows or qwen3_common_sft_rows or qwen3_common_paft_rows:
        lines.append("\n### Frontier Common-Plausible Caution\n\n")
        lines.append(
            "- Qwen3-Max minimal is competitive on common solved bugs, so do **not** claim PAFT beats frontier APIs in edit locality. "
            "Safe wording: frontier APIs are out-of-class high-correctness references; minimal-change prompting does not remove edit overhead, and PAFT remains a controllable open/local generator-training method.\n\n"
        )
        lines.append("| Pair | Model | common bugs | Avg./Med. AED | Avg./Med. CCR |\n")
        lines.append("|---|---|---:|---:|---:|\n")
        for pair_name, rows in [
            ("Qwen14-Base vs Qwen3-Max-minimal", qwen3_common_base_rows),
            ("Qwen14-SFT vs Qwen3-Max-minimal", qwen3_common_sft_rows),
            ("Qwen14-PAFT vs Qwen3-Max-minimal", qwen3_common_paft_rows),
        ]:
            for row in rows:
                lines.append(
                    f"| {pair_name} | {row['model']} | {int(float(row['common_bugs']))} | "
                    f"{fmt_metric(row)} | {fmt_metric(row, 'avg_ccr', 'med_ccr')} |\n"
                )

    if stable_region_rows or noop_audit_rows or leakage_summary:
        lines.append("\n## Mechanism and Side-Effect Diagnostics\n\n")
        lines.append(
            "- These diagnostics target the ASE concern that PAFT is a black-box weighting trick or may collapse into copying. "
            "They should be framed as empirical mechanism/side-effect evidence, not a formal proof of fault localization.\n\n"
        )

    if stable_region_rows:
        lines.append(
            "- **Stable-region edit diagnostic**: for plausible Defects4J patches, `outside_ref` counts generated edited lines outside "
            "the reference-changed buggy-line region, and `missed_ref` counts reference-changed lines left untouched. "
            "Lower `outside_ref` with stable `missed_ref` supports a learned preservation/localization prior.\n\n"
        )
        lines.append("| Model | n plausible | outside_ref Avg./Med. | edited lines Avg./Med. | missed_ref Avg./Med. |\n")
        lines.append("|---|---:|---:|---:|---:|\n")
        for row in stable_region_rows:
            model = row.get("Model", "")
            if not model or "outside_ref avg" not in row:
                continue
            lines.append(
                f"| {model} | {int(float(row['n plausible']))} | "
                f"{float(row['outside_ref avg']):.2f}/{float(row['outside_ref med']):.2f} | "
                f"{float(row['edited lines avg']):.2f}/{float(row['edited lines med']):.2f} | "
                f"{float(row['missed_ref avg']):.2f}/{float(row['missed_ref med']):.2f} |\n"
            )
        lines.append("\n")

    if noop_audit_rows:
        lines.append(
            "- **Copy-collapse audit**: normalized-exact no-op outputs are counted under the same Defects4J validation protocol. "
            "PAFT has lower no-op rates than Base/SFT, and no PAFT no-op output is plausible.\n\n"
        )
        lines.append("| Model | pass@1 | fixed0 no-op | all no-op | plausible no-op | Avg./Med. AED |\n")
        lines.append("|---|---:|---:|---:|---:|---:|\n")
        for row in noop_audit_rows:
            all_candidates = int(float(row["bugs"])) * int(float(row["expected_patch_count"]))
            lines.append(
                f"| {row['model']} | {float(row['pass1_est']):.2f} | "
                f"{int(float(row['no_op_fixed0']))}/{int(float(row['bugs']))} ({float(row['no_op_fixed0_pct']):.2f}%) | "
                f"{int(float(row['no_op_all']))}/{all_candidates} | "
                f"{int(float(row['no_op_plausible']))} | "
                f"{float(row['all_avg_aed']):.2f}/{float(row['all_med_aed']):.2f} |\n"
            )
        lines.append("\n")

    if leakage_summary:
        lines.append(
            "- **Near-duplicate leakage audit**: normalized token 5-gram Jaccard over train/evaluation buggy and fixed snippets "
            f"uses {leakage_summary.get('train_snippets', '?')} training snippets and "
            f"{leakage_summary.get('eval_snippets', '?')} evaluation snippets. "
            f"Max Jaccard is {float(leakage_summary.get('max_jaccard', '0')):.3f}, with "
            f"{int(float(leakage_summary.get('above_threshold', '0')))} pairs above 0.60. "
            "This rules out exact/high lexical near duplicates under the stated normalization, not semantic/template contamination.\n"
        )

    lines.append("\n## Frontier API Diagnostics\n\n")
    lines.append(
        "- **Do not use these as PAFT baselines.** They are out-of-class high-correctness references for the reviewer concern "
        "that scale plus a minimal-change prompt might eliminate edit overhead. The complete DeepSeek-V3 row is "
        "`dashscope-deepseek-v3-minimal-v3`; the direct `deepseek-v3` row is incomplete and should not be used as the main reference.\n\n"
    )
    lines.append("| Model | result files | pass@1 | Avg./Med. AED | Avg./Med. CCR | Use |\n")
    lines.append("|---|---:|---:|---:|---:|---|\n")
    frontier_use = {
        "qwen3-max": "incomplete diagnostic",
        "qwen3-max-minimal": "complete frontier diagnostic",
        "deepseek-v3": "incomplete; do not use main",
        "dashscope-deepseek-v3-minimal": "incomplete; do not use main",
        "dashscope-deepseek-v3-minimal-v3": "complete DeepSeek-V3 minimal diagnostic",
    }
    for row in frontier_rows:
        model = str(row["model"])
        if model not in frontier_use:
            continue
        lines.append(
            f"| {model} | {int(float(row['result_files']))}/{int(float(row['bugs']))} | "
            f"{float(row['pass1_est']):.2f} | "
            f"{float(row['fixed0_avg_aed']):.2f}/{float(row['fixed0_med_aed']):.2f} | "
            f"{float(row['fixed0_avg_ccr']):.2f}/{float(row['fixed0_med_ccr']):.2f} | "
            f"{frontier_use[model]} |\n"
        )

    lines.append("\n## Cross-Language Evidence\n\n")
    lines.append(
        "- **QuixBugs-Python / DS-6.7B adapter-direct fixed seed 7106**: PAFT improves pass@1 over Base and SFT-noprompt, "
        "and also improves AED/CCR under the fixed-seed protocol. "
        "This is usable as a cross-language sanity check, but not as larger-backbone evidence. "
        "For the new paper, pass@1 is the primary reported correctness metric.\n\n"
    )
    lines.append("| Model | seed | pass@1 | Avg./Med. AED | Avg./Med. CCR | No-op first/all |\n")
    lines.append("|---|---:|---:|---:|---:|---:|\n")
    for row in fixed_quix_rows:
        lines.append(
            f"| {row['model']} | {int(float(row['seed']))} | "
            f"{float(row['pass@1']):.2f} | "
            f"{float(row['aed_avg']):.2f}/{float(row['aed_median']):.2f} | "
            f"{float(row['ccr_avg']):.2f}/{float(row['ccr_median']):.2f} | "
            f"{int(float(row['noop_first']))}/{int(float(row['noop_all']))} |\n"
        )

    if quixbugs_qwen14_rows:
        lines.append(
            "\n- **QuixBugs-Python / Qwen2.5-Coder-14B fixed seed 7106 (`n=5`)**: "
            "PAFT improves over SFT in pass@1, pass@5, resolved tasks, and CCR, while Base remains strongest in raw correctness. "
            "Use this as a larger-backbone cross-language sanity check and phrase the result as PAFT-vs-SFT/locality, "
            "not as a PAFT-over-Base correctness claim.\n\n"
        )
        lines.append("| Model | seed | pass@1 | pass@5 | resolved | plausible candidates | Avg./Med. AED | Avg./Med. CCR | No-op first/all |\n")
        lines.append("|---|---:|---:|---:|---:|---:|---:|---:|---:|\n")
        for row in quixbugs_qwen14_rows:
            lines.append(
                f"| {row['model_id']} | 7106 | "
                f"{float(row['pass@1']):.2f} | {float(row['pass@5']):.2f} | "
                f"{int(float(row['resolved_tasks']))} | {int(float(row['plausible_candidates']))} | "
                f"{float(row['aed_avg']):.2f}/{float(row['aed_median']):.2f} | "
                f"{float(row['ccr_avg']):.2f}/{float(row['ccr_median']):.2f} | "
                f"{int(float(row['noop_first']))}/{int(float(row['noop_all']))} |\n"
            )

    if hepack_rows:
        lines.append(
            "\n- **HumanEvalPack-Python / DS-6.7B fixed seed 7202, 1024-token diagnostic**: "
            "PAFT improves over SFT in pass@1 and edit locality, but Base remains stronger in raw pass@1. "
            "Use this only as supplementary cross-language evidence for the preservation-aware training objective, "
            "not as a PAFT-over-Base claim.\n\n"
        )
        lines.append("| Model | seed | max tokens | pass@1 | pass@5 | Avg./Med. AED | Avg./Med. CCR | No-op first/all |\n")
        lines.append("|---|---:|---:|---:|---:|---:|---:|---:|\n")
        for row in hepack_rows:
            lines.append(
                f"| {row['model_id']} | 7202 | 1024 | "
                f"{float(row['pass@1']):.2f} | {float(row['pass@5']):.2f} | "
                f"{float(row['avg_aed']):.2f}/{float(row['med_aed']):.2f} | "
                f"{float(row['avg_ccr']):.2f}/{float(row['med_ccr']):.2f} | "
                f"{int(float(row['noop_first']))}/{int(float(row['noop_all']))} |\n"
            )

    if hepack_common_rows:
        lines.append(
            "\n  Common-plausible audit: among the 118 tasks solved by all three settings, PAFT has lower "
            "first-plausible AED and higher CCR than both Base and SFT. This is the safer locality comparison "
            "because it controls for solved-task subset differences.\n\n"
        )
        lines.append("| Scope | Model | common tasks | Avg./Med. AED | Avg./Med. CCR |\n")
        lines.append("|---|---|---:|---:|---:|\n")
        for row in hepack_common_rows:
            if row["scope"] != "Base+PAFT+SFT":
                continue
            lines.append(
                f"| {row['scope']} | {row['model']} | {int(float(row['common_tasks']))} | "
                f"{float(row['avg_aed']):.2f}/{float(row['med_aed']):.2f} | "
                f"{float(row['avg_ccr']):.2f}/{float(row['med_ccr']):.2f} |\n"
            )

    if hepack_qwen14_rows:
        lines.append(
            "\n- **HumanEvalPack-Python / Qwen2.5-Coder-14B old-recipe fixed seed 7202, 1024-token diagnostic**: "
            "Base is strongest in raw pass@1 on this easy function-level Python benchmark. PAFT-w1.5 preserves most "
            "of the Base correctness and substantially improves edit locality over both Base and SFT; PAFT-w2 is weaker "
            "than w1.5 on pass@1 and median AED, so w1.5 remains the preferred Python operating point. "
            "Use this as a larger-backbone locality diagnostic, not as a PAFT-over-Base correctness claim.\n\n"
        )
        lines.append("| Model | seed | max tokens | pass@1 | pass@5 | Avg./Med. AED | Avg./Med. CCR | No-op first/all |\n")
        lines.append("|---|---:|---:|---:|---:|---:|---:|---:|\n")
        for row in hepack_qwen14_rows:
            lines.append(
                f"| {row['model_id']} | 7202 | 1024 | "
                f"{float(row['pass@1']):.2f} | {float(row['pass@5']):.2f} | "
                f"{float(row['avg_aed']):.2f}/{float(row['med_aed']):.2f} | "
                f"{float(row['avg_ccr']):.2f}/{float(row['med_ccr']):.2f} | "
                f"{int(float(row['noop_first']))}/{int(float(row['noop_all']))} |\n"
            )

    if hepack_qwen14_common_rows:
        lines.append(
            "\n  Qwen14 common-plausible audit: on commonly solved tasks, PAFT variants have much lower "
            "first-plausible AED and higher CCR than Base/SFT, which isolates edit locality from solved-task subset differences.\n\n"
        )
        lines.append("| Scope | Model | common tasks | Avg./Med. AED | Avg./Med. CCR |\n")
        lines.append("|---|---|---:|---:|---:|\n")
        for row in hepack_qwen14_common_rows:
            scope = row["scope"]
            if not ("Base" in scope and "PAFT" in scope):
                continue
            lines.append(
                f"| {scope} | {row['model']} | {int(float(row['common_tasks']))} | "
                f"{float(row['avg_aed']):.2f}/{float(row['med_aed']):.2f} | "
                f"{float(row['avg_ccr']):.2f}/{float(row['med_ccr']):.2f} |\n"
            )

    if hejava_qwen14_rows:
        lines.append(
            "\n- **HumanEval-Java / Qwen2.5-Coder-14B old-recipe fixed seed 7301**: "
            "PAFT improves over the same old-recipe SFT baseline in pass@1, plausible patch count, AED, and CCR. "
            "Against Base, PAFT also improves pass@1 while greatly improving locality. "
            "This diagnostic generated one candidate per task (`n=1`), so only pass@1 is reported. "
            "Use as a supplementary larger-backbone diagnostic, not as a main HumanEval-Java claim.\n\n"
        )
        lines.append("| Model | seed | pass@1 | plausible patches | Avg./Med. AED | Avg./Med. CCR | No-op all |\n")
        lines.append("|---|---:|---:|---:|---:|---:|---:|\n")
        for row in hejava_qwen14_rows:
            lines.append(
                f"| {row['model']} | 7301 | "
                f"{float(row['pass@1']):.2f} | {int(float(row['plausible_patches']))} | "
                f"{float(row['avg_aed']):.2f}/{float(row['med_aed']):.2f} | "
                f"{float(row['avg_ccr']):.2f}/{float(row['med_ccr']):.2f} | "
                f"{float(row['no_op_all_pct']):.2f} |\n"
            )

    if hejava_qwen14_pkgfix_n5_rows:
        lines.append(
            "\n- **HumanEval-Java / Qwen2.5-Coder-14B package-normalized fixed seed 7302 (`n=5`)**: "
            "This rerun supersedes the unnormalized `n=5` artifacts because HumanEval-Java tests call "
            "`humaneval.buggy.*`, while raw generations often declared `humaneval.fixed`, `humaneval.fix`, "
            "`humaneval`, or no package. The `*-pkgfix` directories preserve raw outputs and normalize only the "
            "package declaration for fair compilation. PAFT-w1.5 improves pass@5 and average locality over SFT, "
            "but not pass@1 or median AED; PAFT-w2 is negative. Use this as a supplementary trade-off diagnostic, "
            "not as a main HumanEval-Java claim.\n\n"
        )
        lines.append("| Model | seed | pass@1 | pass@5 | plausible patches | Avg./Med. AED | Avg./Med. CCR | No-op all |\n")
        lines.append("|---|---:|---:|---:|---:|---:|---:|---:|\n")
        for row in hejava_qwen14_pkgfix_n5_rows:
            lines.append(
                f"| {row['model']} | 7302 | "
                f"{float(row['pass@1']):.2f} | {float(row['pass@5']):.2f} | "
                f"{int(float(row['plausible_patches']))} | "
                f"{float(row['avg_aed']):.2f}/{float(row['med_aed']):.2f} | "
                f"{float(row['avg_ccr']):.2f}/{float(row['med_ccr']):.2f} | "
                f"{float(row['no_op_all_pct']):.2f} |\n"
            )

    if hejava_qwen14_pkgfix_n5_s7301_rows:
        lines.append(
            "\n- **HumanEval-Java / Qwen2.5-Coder-14B package-normalized fixed seed 7301 (`n=5`)**: "
            "this follow-up preserves the positive n=1 seed but remains correctness-neutral at `n=5`: "
            "all three settings solve the same number of patches. PAFT is useful only as a locality diagnostic here, "
            "with much lower AED and higher CCR on plausible patches. Do not use as a correctness claim.\n\n"
        )
        lines.append("| Model | seed | pass@1 | pass@5 | plausible patches | Avg./Med. AED | Avg./Med. CCR | No-op all |\n")
        lines.append("|---|---:|---:|---:|---:|---:|---:|---:|\n")
        for row in hejava_qwen14_pkgfix_n5_s7301_rows:
            lines.append(
                f"| {row['model']} | 7301 | "
                f"{float(row['pass@1']):.2f} | {float(row['pass@5']):.2f} | "
                f"{int(float(row['plausible_patches']))} | "
                f"{float(row['avg_aed']):.2f}/{float(row['med_aed']):.2f} | "
                f"{float(row['avg_ccr']):.2f}/{float(row['med_ccr']):.2f} | "
                f"{float(row['no_op_all_pct']):.2f} |\n"
            )

    if hejava_qwen14_pkgfix_n10_rows:
        lines.append(
            "\n- **HumanEval-Java / Qwen2.5-Coder-14B package-normalized fixed seed 7302 (`n=10`)**: "
            "this completed ten-candidate continuation is correctness-neutral: all four rows solve only `SPLIT_WORDS` "
            "in all ten samples. It should not be used as a correctness-improvement result. "
            "It is useful only as a locality appendix point because PAFT reduces AED and improves CCR under equal correctness.\n\n"
        )
        lines.append("| Model | seed | pass@1 | pass@5 | pass@10 | plausible patches | Avg./Med. AED | Avg./Med. CCR | No-op all |\n")
        lines.append("|---|---:|---:|---:|---:|---:|---:|---:|---:|\n")
        for row in hejava_qwen14_pkgfix_n10_rows:
            lines.append(
                f"| {row['model']} | 7302 | "
                f"{float(row['pass@1']):.2f} | {float(row['pass@5']):.2f} | "
                f"{float(row['pass@10']):.2f} | {int(float(row['plausible_patches']))} | "
                f"{float(row['avg_aed']):.2f}/{float(row['med_aed']):.2f} | "
                f"{float(row['avg_ccr']):.2f}/{float(row['med_ccr']):.2f} | "
                f"{float(row['no_op_all_pct']):.2f} |\n"
            )

    lines.append("\n## Negative / Do-Not-Use Evidence\n\n")
    lines.append("- **QuixBugs-Python / OpenCoder-8B pass@1**: Base=27.50, SFT=20.00, PAFT=20.00. Do not use as positive cross-language evidence.\n")
    lines.append("- **HumanEvalPack-Python / DS-6.7B**: PAFT does not improve pass@1 over Base. The fixed-seed 1024-token diagnostic above is usable only for PAFT-vs-SFT and locality framing, not as a main pass@1-over-Base result.\n")
    lines.append("- **HumanEvalPack-Python / Qwen2.5-Coder-14B**: PAFT does not improve pass@1 over Base. Use only for larger-backbone locality/common-plausible framing.\n")
    lines.append("- **HumanEval-Java / Qwen2.5-Coder-14B package-normalized n=5**: PAFT-w1.5 improves pass@5 and average AED/CCR over SFT but loses pass@1 and median AED; PAFT-w2 collapses. Use only as an appendix trade-off diagnostic.\n")
    lines.append("- **HumanEval-Java / Qwen2.5-Coder-14B seed7301 package-normalized n=5**: correctness-neutral across Base/SFT/PAFT, useful only for locality.\n")
    lines.append("- **HumanEval-Java / Qwen2.5-Coder-14B seed7302 package-normalized n=10**: correctness-neutral across Base/SFT/PAFT because every row solves only `SPLIT_WORDS`; use only for locality, not correctness.\n")
    lines.append("- **Defects4J / Qwen2.5-Coder-14B seed7402 n=10**: useful only as an internal stress/sensitivity seed; Base is unusually weak and w2 loses correctness, so do not replace seed7401 with this block.\n")
    lines.append("- **QuixBugs-Python / Qwen2.5-Coder-14B seed7106**: PAFT improves over SFT but not Base in raw pass@1; use only as PAFT-vs-SFT/cross-language locality evidence.\n")
    lines.append("- **HumanEvalPack-Python / OpenCoder-8B smoke**: generation quality is poor under the current script, so stop this path for now.\n")
    lines.append("- **Qwen14B v2opt/light PAFT (0.15/0.30/1 epoch)**: weaker than the old-recipe sweep; do not use as main evidence.\n")
    lines.append("- **OpenCoder8B oldcfg rerun**: not usable as a replacement; PAFT pass@1 drops to 2.43 and logs show `lcs_coverage=0`, indicating the preservation mask was not formed correctly.\n\n")

    lines.append("## Output-Format Preflight for Future Reruns\n\n")
    lines.append(
        "- Clean DS-Coder fixed-seed reruns must pass `scripts/tse_d4j_output_format_gate.sh` on a 10-20 bug fixed0 smoke generation before full Defects4J validation. "
        "The gate checks minimum file count, Java-like output rate, and prose-like output rate. "
        "A known-good historical PAFT output (`deepseek-6.7b-trained-prorepair`) passes with 371 files, 80.6% Java-like outputs, and 0.0% prose-like outputs.\n\n"
    )

    lines.append("## System-Level APR Scope\n\n")
    lines.append(
        "- Agentless, AutoCodeRover, and RepairAgent should be treated as **system-level APR references**, not same-class generator-training baselines. "
        "They include localization, retrieval/search, test feedback, reranking, and iterative validation, whereas PAFT changes the patch generator's training objective. "
        "The TSE manuscript now integrates this framing in the related-work section and `tab:system-level-reference`; keep `tse_system_level_reference_scope.md` as the source note for future edits. "
        "The manuscript should state that PAFT does not claim system-level APR SOTA; a fair comparison would require a generator-swap study that fixes the rest of the APR pipeline.\n\n"
    )
    lines.append(
        "- `system_level_swap_feasibility_20260703.md` is the current audit artifact for this claim boundary. "
        "It confirms local SWE-bench, SWE-bench Lite/Verified/Multilingual, and Multi-SWE-bench Java verified caches with gold patch/test-patch metadata; "
        "it also records that the local Agentless pipeline includes localization, retrieval, multi-sample repair, validation, and reranking. "
        "Use it to design a future generator-swap smoke test, not as evidence of completed system-level PAFT evaluation.\n\n"
    )
    if multiswe_java_summary:
        lines.append(
            "- `multiswe_java_verified_summary_20260703.md` audits the local Multi-SWE-bench Java Verified cache: "
            f"{int(multiswe_java_summary.get('rows', 0))} Java tasks, "
            f"{int(multiswe_java_summary.get('rows_with_gold_patch', 0))} with gold patches, "
            f"{int(multiswe_java_summary.get('rows_with_test_patch', 0))} with test patches, and "
            f"{int(multiswe_java_summary.get('multi_file_rows', 0))} multi-file gold patches "
            f"({float(multiswe_java_summary.get('multi_file_pct', 0.0)):.1f}%). "
            "This is a target for the future generator-swap/system-level study, not completed PAFT evidence.\n\n"
        )
    lines.append(
        "- `multiswe_java_verified_smoke10_20260703.jsonl` is a deterministic 10-instance Multi-SWE-bench Java verified manifest for that future smoke test. "
        "It records instance ids, repos, base commits, failing/passing tests, and changed source/test files.\n\n"
    )
    lines.append(
        "- `multiswe_java_verified_stratified_smoke12_20260703.jsonl` is the preferred smoke manifest when we want explicit coverage of complexity levels: "
        "4 single-file repairs, 4 two-file repairs, and 4 repairs touching three or more files, selected deterministically from the verified Java cache.\n\n"
    )
    if multiswe_neutral_rows:
        lines.append(
            "- **Completed generator-level Multi-SWE Java smoke10 (neutral prompt, seed7401)**: "
            "this is not an official Multi-SWE harness pass/fail result. It is a fixed-rule oracle-file/hunk-context generation diagnostic "
            "over 10 Java Verified tasks, including 6 tasks with multi-file gold patches (4 two-file and 2 three-plus-file). Use it only to show the PAFT generator can reduce patch-text distance "
            "and improve touched-file recall in a more complex setting under the same prompt/context protocol.\n\n"
        )
        lines.append("| Model | predictions | nonempty | Avg./Med. patch chars | Avg./Med. patch-text AED (n) | File P/R | Extra/Missing files |\n")
        lines.append("|---|---:|---:|---:|---:|---:|---:|\n")
        for row in multiswe_neutral_rows:
            lines.append(
                f"| {row['model']} | {int(float(row['predictions']))}/{int(float(row['instances']))} | "
                f"{int(float(row['nonempty']))} | "
                f"{float(row['avg_patch_chars']):.1f}/{float(row['med_patch_chars']):.1f} | "
                f"{float(row['avg_patch_text_aed']):.1f}/{float(row['med_patch_text_aed']):.1f} ({int(float(row['patch_text_aed_n']))}) | "
                f"{float(row['avg_file_precision']):.2f}/{float(row['avg_file_recall']):.2f} | "
                f"{float(row['avg_extra_file_count']):.2f}/{float(row['avg_missing_file_count']):.2f} |\n"
            )
        lines.append("\n")
    lines.append(
        "- `multiswe_generator_swap_protocol_20260703.md` fixes the intended first system-level smoke protocol: "
        "same subset, same localization/context, same candidate budget, same parser, same test harness, and only the Base/SFT/PAFT generator swapped.\n\n"
    )

    lines.append("## Remaining High-Value Gaps\n\n")
    lines.append("1. Keep the original OpenCoder8B positive result as secondary evidence; the oldcfg rerun is negative due to a mask-formation issue and should not replace it.\n")
    lines.append("2. Attribution diagnostics are now paper-facing: no-op, stable-region edits, and near-duplicate leakage are integrated into RQ4 and audited by `scripts/check_tse_ready.sh`. Keep `tse_attribution_diagnostics_summary.md` as the provenance note.\n")
    lines.append("3. Do not spend more GPU on repeated-seed robustness by default; the reportable path is fixed-seed reproducibility with seed7401 as the larger-backbone result.\n")
    lines.append("4. The remaining experimental gap is multi-file/system-level APR. Do not spend more GPU on random small function benchmarks unless they directly address this gap or reuse a proven fixed old-recipe pipeline.\n")

    summary_path = ROOT / "tse_current_evidence_summary.md"
    summary_path.write_text("".join(lines), encoding="utf-8")
    print(summary_path)
    print(ROOT / "tse_current_candidate_metrics.csv")
    print(ROOT / "tse_quixbugs_ds67_multirun_summary.csv")


if __name__ == "__main__":
    main()
