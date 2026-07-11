#!/usr/bin/env python3
"""Check that TSE revision evidence artifacts exist and support scoped claims."""

from __future__ import annotations

import csv
import json
import re
from dataclasses import asdict, dataclass
from pathlib import Path
from typing import Any


ROOT = Path("analysis_outputs")


@dataclass
class Check:
    concern: str
    status: str
    evidence: str
    caveat: str = ""


def read_csv(path: Path) -> list[dict[str, str]]:
    if not path.exists():
        return []
    with path.open(newline="", encoding="utf-8") as handle:
        return list(csv.DictReader(handle))


def row_by_model(rows: list[dict[str, str]], needle: str) -> dict[str, str] | None:
    for row in rows:
        if row.get("model") == needle or row.get("model_id") == needle:
            return row
    return None


def f(row: dict[str, str] | None, key: str) -> float | None:
    if not row or row.get(key) in (None, ""):
        return None
    return float(row[key])


def add(checks: list[Check], concern: str, ok: bool, evidence: str, caveat: str = "") -> None:
    evidence = evidence.replace("\\", "/")
    checks.append(Check(concern, "OK" if ok else "MISSING/WEAK", evidence, caveat))


def check_qwen14_d4j(checks: list[Check]) -> None:
    path = ROOT / "d4j_qwen14_oldrecipe_n10_s7401_metrics_20260703.csv"
    rows = read_csv(path)
    base = row_by_model(rows, "qwen2.5coder14b-d4j-n10-s7401")
    sft = row_by_model(rows, "qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620-d4j-n10-s7401")
    w15 = row_by_model(rows, "qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620-d4j-n10-s7401")
    w2 = row_by_model(rows, "qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620-d4j-n10-s7401")
    complete = all(row and int(float(row["result_files"])) == 371 for row in [base, sft, w15, w2])
    pass_positive = (
        f(w15, "pass@1") is not None
        and f(w2, "pass@1") is not None
        and f(base, "pass@1") is not None
        and f(sft, "pass@1") is not None
        and f(w15, "pass@1") > max(f(base, "pass@1"), f(sft, "pass@1"))  # type: ignore[arg-type]
        and f(w2, "pass@1") > max(f(base, "pass@1"), f(sft, "pass@1"))  # type: ignore[arg-type]
    )
    locality_positive = (
        f(w15, "avg_aed") is not None
        and f(w2, "avg_aed") is not None
        and f(sft, "avg_aed") is not None
        and f(w15, "avg_aed") < f(sft, "avg_aed")  # type: ignore[arg-type]
        and f(w2, "avg_aed") < f(sft, "avg_aed")  # type: ignore[arg-type]
    )
    evidence = (
        f"{path}: Base/SFT/w1.5/w2 pass@1="
        f"{f(base, 'pass@1'):.2f}/{f(sft, 'pass@1'):.2f}/{f(w15, 'pass@1'):.2f}/{f(w2, 'pass@1'):.2f}; "
        f"AED={f(base, 'avg_aed'):.2f}/{f(sft, 'avg_aed'):.2f}/{f(w15, 'avg_aed'):.2f}/{f(w2, 'avg_aed'):.2f}"
        if complete
        else f"{path}: expected four complete rows"
    )
    add(checks, "larger open backbone", complete and pass_positive and locality_positive, evidence)


def check_frontier(checks: list[Check]) -> None:
    path = ROOT / "d4j_frontier_api_pass1_metrics_20260621.csv"
    rows = read_csv(path)
    qwen = row_by_model(rows, "qwen3-max-minimal")
    ds = row_by_model(rows, "dashscope-deepseek-v3-minimal-v3")
    ok = (
        qwen is not None
        and ds is not None
        and int(float(qwen["result_files"])) == 371
        and int(float(ds["result_files"])) == 371
    )
    evidence = (
        f"{path}: Qwen3-Max minimal pass@1={f(qwen, 'pass1_est'):.2f}, "
        f"AED={f(qwen, 'fixed0_avg_aed'):.2f}/{f(qwen, 'fixed0_med_aed'):.2f}; "
        f"DeepSeek-V3 minimal pass@1={f(ds, 'pass1_est'):.2f}, "
        f"AED={f(ds, 'fixed0_avg_aed'):.2f}/{f(ds, 'fixed0_med_aed'):.2f}"
        if ok
        else f"{path}: expected complete Qwen3-Max and DeepSeek-V3 minimal rows"
    )
    add(
        checks,
        "frontier scale-plus-prompt diagnostic",
        ok,
        evidence,
        "Out-of-class reference only; does not claim PAFT beats frontier APIs.",
    )


def check_frontier_common_caution(checks: list[Check]) -> None:
    path = ROOT / "qwen3max_minimal_vs_qwen14_paft_common_plausible_metrics.csv"
    rows = read_csv(path)
    paft = row_by_model(rows, "Qwen14-PAFT")
    qwen3 = row_by_model(rows, "Qwen3-Max-minimal")
    common = f(paft, "common_bugs")
    paft_avg = f(paft, "avg_aed")
    paft_med = f(paft, "med_aed")
    qwen3_avg = f(qwen3, "avg_aed")
    qwen3_med = f(qwen3, "med_aed")
    paft_ccr = f(paft, "avg_ccr")
    qwen3_ccr = f(qwen3, "avg_ccr")
    mixed_or_competitive = (
        common is not None
        and common >= 40
        and paft_avg is not None
        and paft_med is not None
        and qwen3_avg is not None
        and qwen3_med is not None
        and paft_ccr is not None
        and qwen3_ccr is not None
        and (qwen3_med <= paft_med or qwen3_ccr >= paft_ccr)
    )
    evidence = (
        f"{path}: common bugs={int(common)}, "
        f"PAFT AED={paft_avg:.2f}/{paft_med:.2f}, CCR={paft_ccr:.2f}; "
        f"Qwen3-Max minimal AED={qwen3_avg:.2f}/{qwen3_med:.2f}, CCR={qwen3_ccr:.2f}"
        if all(value is not None for value in [common, paft_avg, paft_med, qwen3_avg, qwen3_med, paft_ccr, qwen3_ccr])
        else f"{path}: expected Qwen14-PAFT and Qwen3-Max-minimal rows"
    )
    add(
        checks,
        "frontier common-plausible caution",
        mixed_or_competitive,
        evidence,
        "Prevents cross-model AED overclaim; frontier API rows remain out-of-class diagnostics.",
    )


def _markdown_table_rows(text: str) -> list[dict[str, str]]:
    rows: list[dict[str, str]] = []
    header: list[str] | None = None
    for line in text.splitlines():
        stripped = line.strip()
        if not stripped.startswith("|") or "---" in stripped:
            continue
        cells = [cell.strip() for cell in stripped.strip("|").split("|")]
        if not cells:
            continue
        if header is None or cells[0] == "Model":
            header = cells
            continue
        if header and len(cells) == len(header):
            rows.append(dict(zip(header, cells)))
    return rows


def check_stable_region_edits(checks: list[Check]) -> None:
    path = ROOT / "tse_existing_backbone_d4j_summary.md"
    text = path.read_text(encoding="utf-8") if path.exists() else ""
    rows = _markdown_table_rows(text)
    by_model = {row.get("Model", ""): row for row in rows}

    def metric(model: str, key: str) -> float | None:
        row = by_model.get(model)
        if not row or not row.get(key):
            return None
        return float(row[key])

    qwen_sft = metric("qwen8b-sft", "outside_ref avg")
    qwen_paft = metric("qwen8b-paft", "outside_ref avg")
    coder_base = metric("qwen2.5coder7b", "outside_ref avg")
    coder_paft = metric("qwen2.5coder7b-paft", "outside_ref avg")
    qwen_sft_missed = metric("qwen8b-sft", "missed_ref avg")
    qwen_paft_missed = metric("qwen8b-paft", "missed_ref avg")
    coder_base_missed = metric("qwen2.5coder7b", "missed_ref avg")
    coder_paft_missed = metric("qwen2.5coder7b-paft", "missed_ref avg")
    ok = (
        qwen_sft is not None
        and qwen_paft is not None
        and coder_base is not None
        and coder_paft is not None
        and qwen_paft < qwen_sft
        and coder_paft < coder_base
        and qwen_sft_missed is not None
        and qwen_paft_missed is not None
        and coder_base_missed is not None
        and coder_paft_missed is not None
        and qwen_paft_missed <= qwen_sft_missed + 0.20
        and coder_paft_missed <= coder_base_missed + 0.20
    )
    evidence = (
        f"{path}: outside_ref avg qwen8b {qwen_sft}->{qwen_paft}, "
        f"qwen2.5coder7b {coder_base}->{coder_paft}; "
        f"missed_ref avg {qwen_sft_missed}->{qwen_paft_missed}, {coder_base_missed}->{coder_paft_missed}"
        if path.exists()
        else f"{path}: missing"
    )
    add(
        checks,
        "mechanism / stable-region edits",
        ok,
        evidence,
        "Supports a learned preservation/localization prior; not proof of perfect fault localization.",
    )


def check_noop(checks: list[Check]) -> None:
    path = ROOT / "d4j_deepseek67b_current_complete_371_pass10_noop_20260701.csv"
    rows = read_csv(path)
    base = row_by_model(rows, "deepseek-6.7b")
    sft = row_by_model(rows, "deepseek-6.7b-trained-noprompt")
    paft = row_by_model(rows, "deepseek-6.7b-trained-prorepair")
    ok = (
        all(row and int(float(row["result_files"])) == 371 for row in [base, sft, paft])
        and f(paft, "no_op_fixed0_pct") is not None
        and f(sft, "no_op_fixed0_pct") is not None
        and f(paft, "no_op_fixed0_pct") < f(sft, "no_op_fixed0_pct")  # type: ignore[arg-type]
        and int(float(paft["no_op_plausible"])) == 0  # type: ignore[index]
    )
    evidence = (
        f"{path}: Base/SFT/PAFT fixed0 no-op="
        f"{f(base, 'no_op_fixed0_pct'):.2f}/{f(sft, 'no_op_fixed0_pct'):.2f}/{f(paft, 'no_op_fixed0_pct'):.2f}%; "
        f"PAFT plausible no-op={int(float(paft['no_op_plausible']))}"
        if all([base, sft, paft])
        else f"{path}: expected Base/SFT/PAFT rows"
    )
    add(checks, "copy-collapse side effect", ok, evidence)


def check_leakage(checks: list[Check]) -> None:
    path = ROOT / "d4j_train_eval_5gram_jaccard_summary_20260621.md"
    text = path.read_text(encoding="utf-8") if path.exists() else ""
    max_match = re.search(r"Max Jaccard:\s*([0-9.]+)", text)
    above_match = re.search(r"Pairs above threshold 0\.60:\s*(\d+)", text)
    max_j = float(max_match.group(1)) if max_match else None
    above = int(above_match.group(1)) if above_match else None
    ok = max_j is not None and max_j < 0.60 and above == 0
    evidence = f"{path}: max Jaccard={max_j}, pairs above 0.60={above}" if path.exists() else f"{path}: missing"
    add(
        checks,
        "near-duplicate leakage",
        ok,
        evidence,
        "Rules out exact/high lexical near duplicates under this normalization, not semantic contamination.",
    )


def check_multiswe(checks: list[Check]) -> None:
    summary_path = ROOT / "multiswe_java_smoke10_neutral_generator_summary_20260704.csv"
    detail_path = ROOT / "multiswe_java_smoke10_neutral_generator_details_20260704.csv"
    rows = read_csv(summary_path)
    details = read_csv(detail_path)
    w15 = row_by_model(rows, "qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620-multiswe-smoke10-neutral-s7401")
    w2 = row_by_model(rows, "qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620-multiswe-smoke10-neutral-s7401")
    sft = row_by_model(rows, "qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620-multiswe-smoke10-neutral-s7401")
    buckets = {row.get("bucket") for row in details}
    ok = (
        all(row and int(float(row["predictions"])) == 10 for row in [sft, w15, w2])
        and f(w15, "avg_file_recall") is not None
        and f(w2, "avg_file_recall") is not None
        and f(sft, "avg_file_recall") is not None
        and f(w15, "avg_file_recall") > f(sft, "avg_file_recall")  # type: ignore[arg-type]
        and f(w2, "avg_file_recall") > f(sft, "avg_file_recall")  # type: ignore[arg-type]
        and {"single_file", "two_file", "three_plus_file"}.issubset(buckets)
    )
    evidence = (
        f"{summary_path}: SFT/w1.5/w2 file recall="
        f"{f(sft, 'avg_file_recall'):.2f}/{f(w15, 'avg_file_recall'):.2f}/{f(w2, 'avg_file_recall'):.2f}; "
        f"detail buckets={','.join(sorted(b for b in buckets if b))}; details={detail_path}"
        if all([sft, w15, w2])
        else f"{summary_path}: expected SFT and PAFT rows"
    )
    add(
        checks,
        "complex/multi-file generator diagnostic",
        ok,
        evidence,
        "Generator-level oracle-context smoke only; not official Multi-SWE harness pass/fail.",
    )


def check_system_level_scope(checks: list[Check]) -> None:
    scope_note = ROOT / "tse_system_level_reference_scope.md"
    feasibility = ROOT / "system_level_swap_feasibility_20260703.md"
    required_note_terms = [
        "Agentless",
        "AutoCodeRover",
        "RepairAgent",
        "generator-swap study",
        "Do not claim system-level APR SOTA",
    ]
    note_text = scope_note.read_text(encoding="utf-8") if scope_note.exists() else ""
    note_ok = scope_note.exists() and all(term in note_text for term in required_note_terms)
    feasibility_text = feasibility.read_text(encoding="utf-8") if feasibility.exists() else ""
    feasibility_ok = (
        feasibility.exists()
        and "Agentless is not a same-class baseline" in feasibility_text
        and "generator-swap smoke test" in feasibility_text
    )
    evidence = (
        f"{scope_note}: source note={note_ok}; "
        f"{feasibility}: feasibility audit={feasibility_ok}"
    )
    add(
        checks,
        "system-level APR baseline scope",
        note_ok and feasibility_ok,
        evidence,
        "Addresses Agentless/AutoCodeRover/RepairAgent as references, not same-class PAFT baselines.",
    )


def check_attribution_scope(checks: list[Check]) -> None:
    path = ROOT / "d4j_recomputed_metrics_deepseek_variants.csv"
    rows = read_csv(path)
    full = row_by_model(rows, "deepseek-6.7b-trained")
    final = row_by_model(rows, "deepseek-6.7b-trained-prorepair")
    w0 = row_by_model(rows, "deepseek-6.7b-trained-prorepair-0.0")
    w2 = row_by_model(rows, "deepseek-6.7b-trained-prorepair-2.0")
    w4 = row_by_model(rows, "deepseek-6.7b-trained-prorepair-4.0")
    required_rows = [full, final, w0, w2, w4]
    rows_complete = all(
        row is not None and int(float(row.get("result_files", 0))) == 371
        for row in required_rows
    )
    interaction_matches = (
        rows_complete
        and f(final, "pass@1") > f(full, "pass@1")  # type: ignore[operator]
        and f(final, "avg_aed") < f(full, "avg_aed")  # type: ignore[operator]
        and f(w2, "pass@1") > f(w0, "pass@1")  # type: ignore[operator]
        and f(w2, "avg_aed") < f(w0, "avg_aed")  # type: ignore[operator]
        and f(w4, "avg_ccr") > f(w2, "avg_ccr")  # type: ignore[operator]
        and f(w4, "pass@1") < f(w2, "pass@1")  # type: ignore[operator]
    )
    evidence = (
        f"{path}: full/final pass@1="
        f"{f(full, 'pass@1'):.2f}/{f(final, 'pass@1'):.2f}; "
        f"AED={f(full, 'avg_aed'):.2f}/{f(final, 'avg_aed'):.2f}; "
        f"w0/w2/w4 pass@1={f(w0, 'pass@1'):.2f}/{f(w2, 'pass@1'):.2f}/{f(w4, 'pass@1'):.2f}"
        if rows_complete
        else f"{path}: expected complete full/final/w0/w2/w4 rows"
    )
    add(
        checks,
        "attribution / weighting dose response",
        rows_complete and interaction_matches,
        evidence,
        "Sensitivity evidence only; the manuscript no longer claims an "
        "edit-difficulty curriculum (the released trainer uses the HF default "
        "random sampler, so input-file order does not order the traversal).",
    )


def check_quixbugs(checks: list[Check]) -> None:
    path = ROOT / "quixbugs_python_qwen14_oldrecipe_seed7106_summary_with_w2_20260704.csv"
    rows = read_csv(path)
    sft = row_by_model(rows, "qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620")
    w15 = row_by_model(rows, "qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620")
    w2 = row_by_model(rows, "qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620")
    ok = (
        all([sft, w15, w2])
        and f(w15, "pass@1") > f(sft, "pass@1")  # type: ignore[operator]
        and f(w2, "pass@1") > f(sft, "pass@1")  # type: ignore[operator]
    )
    evidence = (
        f"{path}: SFT/w1.5/w2 pass@1={f(sft, 'pass@1'):.2f}/{f(w15, 'pass@1'):.2f}/{f(w2, 'pass@1'):.2f}; "
        f"pass@5={f(sft, 'pass@5'):.2f}/{f(w15, 'pass@5'):.2f}/{f(w2, 'pass@5'):.2f}"
        if all([sft, w15, w2])
        else f"{path}: expected SFT and PAFT rows"
    )
    add(
        checks,
        "cross-language sanity check",
        ok,
        evidence,
        "Use as PAFT-vs-SFT sanity evidence only; Base remains stronger in raw correctness.",
    )


def write_outputs(checks: list[Check]) -> None:
    payload: dict[str, Any] = {
        "checks": [asdict(check) for check in checks],
        "ok": all(check.status == "OK" for check in checks),
    }
    json_path = ROOT / "tse_evidence_artifact_check.json"
    md_path = ROOT / "tse_evidence_artifact_check.md"
    json_path.write_text(json.dumps(payload, indent=2, ensure_ascii=False) + "\n", encoding="utf-8")

    lines = ["# TSE Evidence Artifact Check\n\n"]
    lines.append(f"Overall status: **{'OK' if payload['ok'] else 'MISSING/WEAK'}**\n\n")
    lines.append("| Concern | Status | Evidence | Caveat |\n")
    lines.append("|---|---|---|---|\n")
    for check in checks:
        lines.append(
            f"| {check.concern} | {check.status} | {check.evidence} | {check.caveat} |\n"
        )
    md_path.write_text("".join(lines), encoding="utf-8")
    print(md_path)
    print(json_path)


def main() -> None:
    checks: list[Check] = []
    check_qwen14_d4j(checks)
    check_frontier(checks)
    check_frontier_common_caution(checks)
    check_stable_region_edits(checks)
    check_noop(checks)
    check_leakage(checks)
    check_multiswe(checks)
    check_system_level_scope(checks)
    check_attribution_scope(checks)
    check_quixbugs(checks)
    write_outputs(checks)
    if not all(check.status == "OK" for check in checks):
        raise SystemExit(1)


if __name__ == "__main__":
    main()