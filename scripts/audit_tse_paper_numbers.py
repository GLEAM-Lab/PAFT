#!/usr/bin/env python3
"""Check that key TSE manuscript numbers match current evidence files."""

from __future__ import annotations

import csv
import re
import sys
from pathlib import Path


ROOT = Path(__file__).resolve().parents[1]
TSE_ROOT = ROOT / "tse-paper"


def read_csv(path: Path) -> list[dict[str, str]]:
    with path.open(newline="", encoding="utf-8") as f:
        return list(csv.DictReader(f))


def fmt(value: str | float, digits: int = 2) -> str:
    return f"{float(value):.{digits}f}"


def require(text: str, needle: str, label: str, errors: list[str]) -> None:
    if needle not in text:
        errors.append(f"missing {label}: {needle}")


def forbid(text: str, needle: str, label: str, errors: list[str]) -> None:
    if needle in text:
        errors.append(f"stale {label}: {needle}")


def main() -> int:
    text = "\n".join(path.read_text(encoding="utf-8") for path in sorted(TSE_ROOT.glob("*.tex")))
    errors: list[str] = []

    # OpenCoder-8B is high risk because several rerun summaries exist. Use the
    # consolidated current file, not the oldcfg rerun summary.
    opencoder = {
        row["model"]: row
        for row in read_csv(
            ROOT / "analysis_outputs" / "d4j_opencoder8b_all_pass1_metrics_20260620.csv"
        )
    }
    for model in ["opencoder8b", "opencoder8b-sft", "opencoder8b-paft"]:
        row = opencoder[model]
        label = f"OpenCoder {model}"
        for key in ["pass1_est", "fixed0_avg_aed", "fixed0_med_aed", "fixed0_avg_ccr", "fixed0_med_ccr"]:
            require(text, fmt(row[key]), f"{label} {key}", errors)

    for stale in ["7.92", "6.77", "9.95", "137.92", "110.18", "78.79", "86.96"]:
        forbid(text, stale, "OpenCoder old-result value", errors)

    qwen14 = {
        row["model"]: row
        for row in read_csv(
            ROOT / "analysis_outputs" / "d4j_qwen14_oldrecipe_n10_s7401_metrics_20260703.csv"
        )
    }
    for model in [
        "qwen2.5coder14b-d4j-n10-s7401",
        "qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620-d4j-n10-s7401",
        "qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620-d4j-n10-s7401",
        "qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620-d4j-n10-s7401",
    ]:
        row = qwen14[model]
        for key in ["pass@1", "avg_aed", "med_aed", "avg_ccr", "med_ccr", "no_op_all_pct"]:
            require(text, fmt(row[key]), f"Qwen14 n=10 {model} {key}", errors)

    for stale in ["20.75", "202.99", "18.33", "76.29", "5.66\\%"]:
        forbid(text, stale, "Qwen14 stale fixed0 value", errors)
    for stale in ["20.32", "20.43", "22.10", "22.91", "169.27", "60.72", "61.42", "80.72", "80.22", "1.46\\%", "2.75\\%", "4.64\\%"]:
        forbid(text, stale, "Qwen14 stale n=5 value", errors)

    ds_noop = {
        row["model"]: row
        for row in read_csv(
            ROOT / "analysis_outputs" / "d4j_deepseek67b_current_complete_371_pass10_noop_20260701.csv"
        )
    }
    for model in [
        "deepseek-6.7b",
        "deepseek-6.7b-trained-noprompt",
        "deepseek-6.7b-trained-prorepair",
    ]:
        row = ds_noop[model]
        require(text, str(int(float(row["no_op_fixed0"]))), f"DS-Coder no-op {model} no_op_fixed0", errors)
        for key in ["no_op_fixed0_pct"]:
            require(text, fmt(row[key]), f"DS-Coder no-op {model} {key}", errors)

    frontier = {
        row["model"]: row
        for row in read_csv(ROOT / "analysis_outputs" / "d4j_frontier_api_pass1_metrics_20260621.csv")
    }
    for model in ["qwen3-max-minimal", "dashscope-deepseek-v3-minimal-v3"]:
        row = frontier[model]
        for key in [
            "pass1_est",
            "fixed0_avg_aed",
            "fixed0_med_aed",
            "fixed0_avg_ccr",
            "fixed0_med_ccr",
        ]:
            require(text, fmt(row[key], 1), f"frontier {model} {key}", errors)
    for stale in ["333/371", "368/371", "264/371"]:
        forbid(text, stale, "incomplete frontier diagnostic coverage", errors)

    quix = {
        row["model"]: row
        for row in read_csv(ROOT / "analysis_outputs" / "tse_quixbugs_ds67_fixed_seed7106_summary.csv")
    }
    for model in [
        "deepseek-6.7b",
        "deepseek-6.7b-trained-noprompt",
        "deepseek-6.7b-trained-prorepair",
    ]:
        row = quix[model]
        for key in ["pass@1", "aed_avg", "aed_median", "ccr_avg", "ccr_median"]:
            require(text, fmt(row[key]), f"QuixBugs {model} {key}", errors)

    hepack = {
        row["model_id"]: row
        for row in read_csv(
            ROOT
            / "analysis_outputs"
            / "humanevalpack_python_ds67_lora_tfm_20260701_seed7202"
            / "summary_20260703.csv"
        )
    }
    for model in [
        "deepseek-6.7b",
        "deepseek-6.7b-trained-noprompt",
        "deepseek-6.7b-trained-prorepair",
    ]:
        row = hepack[model]
        for key in ["pass@1", "avg_aed", "med_aed", "med_ccr"]:
            require(text, fmt(row[key]), f"HumanEvalPack-Python {model} {key}", errors)

    hepack_qwen14 = {
        row["model_id"]: row
        for row in read_csv(
            ROOT
            / "analysis_outputs"
            / "humanevalpack_python_qwen14_oldrecipe_20260703_seed7202"
            / "summary_20260704_w2.csv"
        )
    }
    for model in [
        "qwen2.5coder14b",
        "qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620",
        "qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620",
        "qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620",
    ]:
        row = hepack_qwen14[model]
        for key in ["pass@1", "avg_aed", "med_aed", "med_ccr"]:
            require(text, fmt(row[key]), f"HumanEvalPack-Python Qwen14 {model} {key}", errors)

    hepack_qwen14_common = {
        (row["scope"], row["model"]): row
        for row in read_csv(
            ROOT
            / "analysis_outputs"
            / "humanevalpack_python_qwen14_oldrecipe_20260703_seed7202"
            / "common_plausible_20260703.csv"
        )
    }
    for label in ["Base", "PAFT"]:
        row = hepack_qwen14_common[("Base+PAFT", label)]
        require(
            text,
            str(int(float(row["common_tasks"]))),
            f"HumanEvalPack-Python Qwen14 common {label} common_tasks",
            errors,
        )
        for key in ["avg_aed", "med_aed", "avg_ccr", "med_ccr"]:
            require(text, fmt(row[key]), f"HumanEvalPack-Python Qwen14 common {label} {key}", errors)

    hejava = {
        row["model"]: row
        for row in read_csv(
            ROOT / "analysis_outputs" / "humaneval_java_qwen14_oldrecipe_n1_s7301_20260703.csv"
        )
    }
    for model in [
        "qwen2.5coder14b-hejava-n1-s7301",
        "qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620-hejava-n1-s7301",
        "qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620-hejava-n1-s7301",
    ]:
        row = hejava[model]
        for key in ["pass@1", "avg_aed", "med_aed", "med_ccr"]:
            require(text, fmt(row[key]), f"HumanEval-Java {model} {key}", errors)

    leakage_summary = (ROOT / "analysis_outputs" / "d4j_train_eval_5gram_jaccard_summary_20260621.md").read_text(
        encoding="utf-8"
    )
    max_match = re.search(r"Max Jaccard:\s*([0-9.]+)", leakage_summary)
    if not max_match:
        errors.append("missing leakage max Jaccard in summary")
    else:
        require(text, f"{float(max_match.group(1)):.3f}", "leakage max Jaccard", errors)
    require(text, "2,378", "leakage train snippet count", errors)
    require(text, "742", "leakage eval snippet count", errors)
    forbid(text, "0.106", "stale leakage Jaccard value", errors)

    multiswe = {
        row["model"]: row
        for row in read_csv(ROOT / "analysis_outputs" / "multiswe_java_smoke10_neutral_generator_summary_20260704.csv")
    }
    for model in [
        "qwen2.5coder14b-multiswe-smoke10-neutral-s7401",
        "qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620-multiswe-smoke10-neutral-s7401",
        "qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620-multiswe-smoke10-neutral-s7401",
        "qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620-multiswe-smoke10-neutral-s7401",
    ]:
        row = multiswe[model]
        require(text, f"{fmt(row['avg_patch_text_aed'], 1)} ({int(float(row['patch_text_aed_n']))})", f"Multi-SWE {model} Avg AED (n)", errors)
        for key in ["avg_file_recall", "avg_missing_file_count"]:
            require(text, fmt(row[key]), f"Multi-SWE {model} {key}", errors)

    if errors:
        print("TSE number audit failed:")
        for err in errors:
            print(f"- {err}")
        return 1
    print("TSE number audit passed.")
    return 0


if __name__ == "__main__":
    sys.exit(main())
