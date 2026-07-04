#!/usr/bin/env python3
"""Lightweight static checks for the TSE LaTeX draft."""

from pathlib import Path
import re
import sys


def main() -> int:
    risky = [
        "pass@k",
        "pass@$k$",
        "â",
        "’",
        "table1.sh",
        "representative APR baselines",
        "outperforms representative",
        "HumanEval-Java benchmark datasets",
    ]
    tex_files = sorted(Path("tse-paper").glob("*.tex"))
    hits: list[str] = []
    errors: list[str] = []
    for path in tex_files:
        text = path.read_text(encoding="utf-8", errors="ignore")
        for token in risky:
            if token in text:
                hits.append(f"{path.name}: {token}")

    print("risky-token hits:", len(hits))
    for hit in hits:
        print(hit)
    errors.extend(hits)

    for rel in ["main.tex", "5.experiments_new.tex", "10.appendix.tex"]:
        path = Path("tse-paper") / rel
        text = path.read_text(encoding="utf-8", errors="ignore")
        counts = {
            "table": (text.count(r"\begin{table}"), text.count(r"\end{table}")),
            "table*": (text.count(r"\begin{table*}"), text.count(r"\end{table*}")),
            "figure": (text.count(r"\begin{figure}"), text.count(r"\end{figure}")),
            "tabular": (text.count(r"\begin{tabular}"), text.count(r"\end{tabular}")),
        }
        print(
            rel,
            "table",
            *counts["table"],
            "table*",
            *counts["table*"],
            "figure",
            *counts["figure"],
            "tabular",
            *counts["tabular"],
        )
        for env, (opens, closes) in counts.items():
            if opens != closes:
                errors.append(f"{rel}: mismatched {env}: {opens} begin vs {closes} end")

    approach = Path("tse-paper/3.approach.tex").read_text(encoding="utf-8", errors="ignore")
    if re.search(
        r"\\sum_\{t\\in\\mathcal\{I\}_\{\\mathrm\{align\}\}\}.*?\\ell_t\(\\theta\)\s*\n\s*\\sum_\{t\\in\\mathcal\{I\}_\{\\mathrm\{edit\}\}\}",
        approach,
        flags=re.S,
    ):
        errors.append("3.approach.tex: missing plus between aligned and edit loss terms")

    if errors:
        print("static check failed:")
        for error in errors:
            print(error)
        return 1
    return 0


if __name__ == "__main__":
    sys.exit(main())
