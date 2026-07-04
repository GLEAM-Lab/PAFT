#!/usr/bin/env python3
"""Repair known mojibake artifacts in TSE TeX files."""

from pathlib import Path


def main() -> None:
    path = Path("tse-paper/5.experiments_new.tex")
    data = path.read_bytes()
    replacements = {
        "â€™".encode("utf-8"): b"'",
        b"\xe2\x80\x99": b"'",
        b"metric_vs_human_round1}and~": b"metric_vs_human_round1} and~",
    }
    for old, new in replacements.items():
        data = data.replace(old, new)
    path.write_bytes(data)


if __name__ == "__main__":
    main()
