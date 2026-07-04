#!/usr/bin/env python3
"""Guard against high-risk claim drift in the TSE manuscript."""

from __future__ import annotations

import re
import sys
from pathlib import Path


ROOT = Path(__file__).resolve().parents[1] / "tse-paper"
TEX_FILES = [
    path
    for path in sorted(ROOT.glob("*.tex"))
    if path.name not in {"bare_jrnl.tex", "arxiv.tex"}
]

FORBIDDEN = [
    (re.compile(r"pass@\s*(?:5|10|\$k|k)\b", re.IGNORECASE), "TSE version should report pass@1, not pass@5/10/k"),
    (re.compile(r"representative\s+APR\s+baselines?", re.IGNORECASE), "avoid broad representative-APR-baseline claim"),
    (re.compile(r"system-level\s+APR\s+SOTA", re.IGNORECASE), "avoid system-level APR SOTA shorthand"),
    (re.compile(r"outperform[s]?\s+state-of-the-art", re.IGNORECASE), "avoid SOTA outperform claim"),
    (re.compile(r"PAFT\s+outperform[s]?\s+frontier", re.IGNORECASE), "do not claim PAFT beats frontier models"),
    (re.compile(r"frontier\s+scale\s+.*solves\s+edit", re.IGNORECASE), "avoid overclaim about frontier scale"),
    (re.compile(r"most\s+bugs\s+are\s+localized", re.IGNORECASE), "avoid root-cause/fault-localization framing"),
    (re.compile(r"fault-relevant", re.IGNORECASE), "use change-relevant wording instead of fault-localization wording"),
    (re.compile(r"faulty\s+regions?", re.IGNORECASE), "avoid implying PAFT identifies faulty regions"),
    (re.compile(r"outside\s+the\s+fault\s+region", re.IGNORECASE), "use needed/reference-change wording instead of fault-region framing"),
    (re.compile(r"true\s+fault", re.IGNORECASE), "avoid implying access to a ground-truth semantic fault location"),
    (re.compile(r"concentrat(?:e|es|ing)\s+edits?\s+on\s+fault", re.IGNORECASE), "avoid implying PAFT localizes faults"),
    (re.compile(r"come\s+from\s+better\s+edit\s+placement", re.IGNORECASE), "avoid causal over-attribution"),
    (re.compile(r"multi[- ]?seed", re.IGNORECASE), "do not imply multi-seed evidence in the fixed-seed TSE revision"),
    (
        re.compile(r"(?<!not as a )universally\s+optimal\s+preservation\s+weight", re.IGNORECASE),
        "do not claim a universal w_align optimum",
    ),
]

REQUIRED_SNIPPETS = [
    "diagnostic references, not same-class baselines",
    "why they are not same-class generator baselines",
    "generator-swap study",
    "complementary rather than direct controls",
    "not complete APR systems",
    "does not establish system-level APR state of the art",
    "not as a claim of broad cross-language coverage",
    "not as an inference-time fault-localization oracle",
    "does not require treating over-editing as the semantic root cause",
    "semantic template-level contamination remains a broader threat",
    "not as a universally optimal preservation weight",
    "not an official Multi-SWE harness pass/fail evaluation",
    "does not compare complete APR pipelines",
    "fixed seed 7401",
    "single-seed sweep as definitive hyperparameter optimization",
    "held-out or bilevel objective",
]


def line_number(text: str, index: int) -> int:
    return text.count("\n", 0, index) + 1


def main() -> int:
    errors: list[str] = []
    combined = ""
    for path in TEX_FILES:
        text = path.read_text(encoding="utf-8")
        combined += "\n" + text
        for pattern, reason in FORBIDDEN:
            for match in pattern.finditer(text):
                errors.append(f"{path.name}:{line_number(text, match.start())}: {reason}: {match.group(0)}")

    for snippet in REQUIRED_SNIPPETS:
        if snippet not in combined:
            errors.append(f"missing required scope/limitation phrase: {snippet}")

    if errors:
        print("TSE claim hygiene check failed:")
        for err in errors:
            print(f"- {err}")
        return 1
    print("TSE claim hygiene check passed.")
    return 0


if __name__ == "__main__":
    sys.exit(main())
