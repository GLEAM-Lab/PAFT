#!/usr/bin/env python3
"""Record fixed seeds and artifact paths for TSE revision experiments."""

from __future__ import annotations

from dataclasses import dataclass
from pathlib import Path
import sys


@dataclass(frozen=True)
class SeedRecord:
    benchmark: str
    setting: str
    seed: int
    status: str
    artifacts: tuple[str, ...]
    note: str
    seed_artifacts: tuple[str, ...] = ()


SEEDS: tuple[SeedRecord, ...] = (
    SeedRecord(
        benchmark="Defects4J",
        setting="Qwen2.5-Coder-14B n=10 main larger-backbone diagnostic",
        seed=7401,
        status="complete/reportable",
        artifacts=(
            "analysis_outputs/d4j_qwen14_oldrecipe_n10_s7401_metrics_20260703.csv",
            "analysis_outputs/d4j_qwen14_oldrecipe_n10_s7401_metrics_20260703.md",
            "analysis_outputs/logs/run_d4j_qwen14_base_n10_gpu0_20260703.sh",
            "analysis_outputs/logs/run_d4j_qwen14_sft_n10_gpu0_after_base_20260703.sh",
            "analysis_outputs/logs/run_d4j_qwen14_oldrecipe_remaining_n10_gpu1_20260703.sh",
            "analysis_outputs/logs/run_d4j_qwen14_oldrecipe_w2_n10_gpu1_20260703.sh",
            "analysis_outputs/logs/watch_validate_d4j_qwen14_oldrecipe_n10_all_20260703.sh",
        ),
        note="Positive fixed-seed Base/SFT/PAFT comparison; use as the main larger-open-backbone table.",
        seed_artifacts=(
            "analysis_outputs/logs/run_d4j_qwen14_base_n10_gpu0_20260703.sh",
            "analysis_outputs/logs/run_d4j_qwen14_sft_n10_gpu0_after_base_20260703.sh",
            "analysis_outputs/logs/run_d4j_qwen14_oldrecipe_remaining_n10_gpu1_20260703.sh",
            "analysis_outputs/logs/run_d4j_qwen14_oldrecipe_w2_n10_gpu1_20260703.sh",
        ),
    ),
    SeedRecord(
        benchmark="Defects4J",
        setting="Qwen2.5-Coder-14B n=10 stress seed",
        seed=7402,
        status="complete/internal stress",
        artifacts=(
            "analysis_outputs/d4j_qwen14_oldrecipe_n10_s7402_metrics_20260704.csv",
            "analysis_outputs/d4j_qwen14_oldrecipe_n10_s7402_metrics_20260704.md",
            "analysis_outputs/logs/run_d4j_qwen14_oldrecipe_n10_seed7402_gpu1_20260704.sh",
            "analysis_outputs/logs/run_d4j_qwen14_oldrecipe_sft_n10_seed7402_gpu1_20260704.sh",
            "analysis_outputs/logs/run_d4j_qwen14_oldrecipe_w2_n10_seed7402_gpu0_20260704.sh",
            "analysis_outputs/logs/run_d4j_qwen14_oldrecipe_w15_n10_seed7402_gpu0_after_w2_20260704.sh",
        ),
        note="Stress/sensitivity seed; Base is unusually weak, so do not replace seed7401.",
        seed_artifacts=(
            "analysis_outputs/logs/run_d4j_qwen14_oldrecipe_n10_seed7402_gpu1_20260704.sh",
            "analysis_outputs/logs/run_d4j_qwen14_oldrecipe_sft_n10_seed7402_gpu1_20260704.sh",
            "analysis_outputs/logs/run_d4j_qwen14_oldrecipe_w2_n10_seed7402_gpu0_20260704.sh",
            "analysis_outputs/logs/run_d4j_qwen14_oldrecipe_w15_n10_seed7402_gpu0_after_w2_20260704.sh",
        ),
    ),
    SeedRecord(
        benchmark="QuixBugs-Python",
        setting="Qwen2.5-Coder-14B n=5 cross-language sanity check",
        seed=7106,
        status="complete/supplementary",
        artifacts=(
            "analysis_outputs/quixbugs_python_qwen14_oldrecipe_seed7106_summary_with_w2_20260704.csv",
            "analysis_outputs/quixbugs_python_qwen14_oldrecipe_seed7106_summary_with_w2_20260704.md",
            "analysis_outputs/logs/run_quixbugs_qwen14_oldrecipe_seed7106_generate_gpu1_20260703.sh",
            "analysis_outputs/logs/run_quixbugs_qwen14_w2_seed7106_gpu0_20260704.sh",
            "analysis_outputs/logs/watch_quixbugs_qwen14_seed7106_evaluate_after_hejava_20260703.sh",
        ),
        note="PAFT improves over SFT, but Base remains strongest in raw pass@1; use with narrow framing.",
        seed_artifacts=(
            "analysis_outputs/logs/run_quixbugs_qwen14_oldrecipe_seed7106_generate_gpu1_20260703.sh",
            "analysis_outputs/logs/run_quixbugs_qwen14_w2_seed7106_gpu0_20260704.sh",
        ),
    ),
    SeedRecord(
        benchmark="HumanEvalPack-Python",
        setting="Qwen2.5-Coder-14B n=5 old-recipe locality diagnostic",
        seed=7202,
        status="complete/supplementary",
        artifacts=(
            "analysis_outputs/humanevalpack_python_qwen14_oldrecipe_20260703_seed7202/summary_20260704_w2.csv",
            "analysis_outputs/humanevalpack_python_qwen14_oldrecipe_20260703_seed7202/summary_20260704_w2.md",
            "analysis_outputs/logs/run_humanevalpack_python_qwen14_oldrecipe_gpu1_20260703.sh",
        ),
        note="PAFT improves over SFT, not over Base; use as locality/common-plausible evidence only.",
        seed_artifacts=(
            "analysis_outputs/logs/run_humanevalpack_python_qwen14_oldrecipe_gpu1_20260703.sh",
        ),
    ),
    SeedRecord(
        benchmark="Multi-SWE Java Verified",
        setting="neutral-prompt generator-level smoke10",
        seed=7401,
        status="complete/generator-level diagnostic",
        artifacts=(
            "analysis_outputs/multiswe_java_smoke10_neutral_generator_summary_20260704.csv",
            "analysis_outputs/multiswe_java_smoke10_neutral_generator_summary_20260704.md",
            "analysis_outputs/multiswe_java_smoke10_neutral_generator_details_20260704.csv",
            "analysis_outputs/multiswe_java_verified_runnable_smoke10_ctx5_max20k_neutral_20260704.jsonl",
            "analysis_outputs/logs/run_multiswe_smoke10_qwen14_neutral_gpu0_20260704.sh",
        ),
        note="Not official harness pass/fail; shows patch-text AED/file-recall behavior on complex Java tasks.",
        seed_artifacts=(
            "analysis_outputs/logs/run_multiswe_smoke10_qwen14_neutral_gpu0_20260704.sh",
        ),
    ),
)


def has_seed_marker(path: Path, seed: int) -> bool:
    text = path.read_text(encoding="utf-8", errors="replace")
    markers = [
        f"seed={seed}",
        f"SEED={seed}",
        f"--seed {seed}",
        f"--seed={seed}",
        f"--seed \"{seed}\"",
        f"--seed '{seed}'",
        f"seed{seed}",
    ]
    return any(marker in text for marker in markers)


def validate_records() -> list[str]:
    errors: list[str] = []
    for record in SEEDS:
        check_all_artifacts = not record.status.startswith("running")
        if check_all_artifacts:
            for artifact in record.artifacts:
                path = Path(artifact)
                if not path.exists():
                    errors.append(f"{record.setting}: missing artifact {artifact}")
        for artifact in record.seed_artifacts:
            path = Path(artifact)
            if not path.exists():
                errors.append(f"{record.setting}: missing seed launcher {artifact}")
                continue
            if not has_seed_marker(path, record.seed):
                errors.append(f"{record.setting}: launcher lacks seed marker {record.seed}: {artifact}")
    return errors


def render_markdown() -> str:
    lines = ["# TSE Fixed Seed Manifest\n\n"]
    lines.append(
        "This file records the fixed seeds used for reproducible TSE revision experiments. "
        "It is generated by `scripts/tse_fixed_seed_manifest.py`, which also checks that "
        "complete records have their expected artifacts and that listed launcher scripts contain "
        "the corresponding fixed seed. The revision should report these fixed-seed diagnostics "
        "rather than repeated-seed claims unless explicitly stated.\n\n"
    )
    lines.append("| Benchmark | Setting | Seed | Status | Key artifacts | Note |\n")
    lines.append("|---|---|---:|---|---|---|\n")
    for record in SEEDS:
        artifacts = "<br>".join(f"`{path}`" for path in record.artifacts)
        lines.append(
            f"| {record.benchmark} | {record.setting} | {record.seed} | "
            f"{record.status} | {artifacts} | {record.note} |\n"
        )
    return "".join(lines)


def main() -> None:
    out = Path("analysis_outputs/tse_fixed_seed_manifest.md")
    out.parent.mkdir(parents=True, exist_ok=True)
    out.write_text(render_markdown(), encoding="utf-8")
    errors = validate_records()
    if errors:
        print("Fixed seed manifest validation failed:", file=sys.stderr)
        for error in errors:
            print(f"- {error}", file=sys.stderr)
        raise SystemExit(1)
    print(out)


if __name__ == "__main__":
    main()
