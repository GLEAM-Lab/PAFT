#!/usr/bin/env python3
"""Static citation-key check for the TSE manuscript."""

from __future__ import annotations

import re
import sys
from pathlib import Path


ROOT = Path(__file__).resolve().parents[1] / "tse-paper"
CITE_RE = re.compile(r"\\(?:no)?cite[a-zA-Z*]*\s*(?:\[[^\]]*\]\s*){0,2}\{([^}]*)\}")
BIB_RE = re.compile(r"@\w+\s*\{\s*([^,\s]+)\s*,")


def main() -> int:
    tex_keys: dict[str, set[str]] = {}
    for path in sorted(ROOT.glob("*.tex")):
        text = path.read_text(encoding="utf-8")
        for match in CITE_RE.finditer(text):
            line = text.count("\n", 0, match.start()) + 1
            for key in match.group(1).split(","):
                key = key.strip()
                if key:
                    tex_keys.setdefault(key, set()).add(f"{path.name}:{line}")

    bib_keys: dict[str, str] = {}
    for path in [ROOT / "sample-base.bib", ROOT / "custom.bib"]:
        text = path.read_text(encoding="utf-8", errors="replace")
        for match in BIB_RE.finditer(text):
            bib_keys[match.group(1).strip()] = path.name

    missing = sorted(set(tex_keys) - set(bib_keys))
    duplicates: dict[str, list[str]] = {}
    seen: dict[str, str] = {}
    for path in [ROOT / "sample-base.bib", ROOT / "custom.bib"]:
        text = path.read_text(encoding="utf-8", errors="replace")
        for match in BIB_RE.finditer(text):
            key = match.group(1).strip()
            if key in seen:
                duplicates.setdefault(key, [seen[key]]).append(path.name)
            else:
                seen[key] = path.name

    if missing:
        print("Missing citation keys:")
        for key in missing:
            print(f"- {key}: {', '.join(sorted(tex_keys[key]))}")
    if duplicates:
        print("Duplicate bib keys:")
        for key, paths in sorted(duplicates.items()):
            print(f"- {key}: {', '.join(paths)}")
    if missing or duplicates:
        return 1
    print(f"Citation check passed: {len(tex_keys)} cited keys, {len(bib_keys)} bib keys.")
    return 0


if __name__ == "__main__":
    sys.exit(main())
