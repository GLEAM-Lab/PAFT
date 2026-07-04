#!/usr/bin/env python3
"""Line-level edit-location diagnostic for Defects4J fixed0 results.

For plausible patches, compare buggy->reference and buggy->generated edits in
buggy-line coordinates. Reports how many generated edited lines fall outside
the reference-changed region.
"""

from __future__ import annotations

import difflib
import json
import statistics
import sys
from pathlib import Path


def changed_buggy_lines(source: str, target: str) -> set[int]:
    source_lines = source.splitlines()
    target_lines = target.splitlines()
    changed: set[int] = set()
    matcher = difflib.SequenceMatcher(a=source_lines, b=target_lines, autojunk=False)
    for tag, i1, i2, _j1, _j2 in matcher.get_opcodes():
        if tag == "equal":
            continue
        if i1 < i2:
            changed.update(range(i1, i2))
        elif source_lines:
            changed.add(max(0, min(i1, len(source_lines) - 1)))
    return changed


def summarize(tag: str) -> dict[str, object]:
    root = Path("defects4j/results") / tag / "fixed0"
    values: list[tuple[int, int, int, int]] = []
    for result_path in sorted(root.glob("*.json.result")):
        try:
            data = json.loads(result_path.read_text())
        except json.JSONDecodeError:
            continue
        entry = data[0] if isinstance(data, list) and data else data
        if not isinstance(entry, dict) or entry.get("patch_status") != "PLAUSIBLE":
            continue
        bug_name = entry.get("bug_name") or result_path.name.split(".json.result")[0]
        dataset_path = Path("defects4j/dataset") / f"{bug_name}.json"
        if not dataset_path.exists():
            continue
        dataset = json.loads(dataset_path.read_text())
        buggy = dataset.get("buggy") or dataset.get("buggy_fl") or ""
        reference = dataset.get("fix") or ""
        patch = entry.get("patch_code") or ""
        if not buggy or not reference or not patch:
            continue
        reference_changed = changed_buggy_lines(buggy, reference)
        predicted_changed = changed_buggy_lines(buggy, patch)
        if not predicted_changed:
            continue
        outside = len(predicted_changed - reference_changed)
        missed = len(reference_changed - predicted_changed)
        values.append((outside, len(predicted_changed), len(reference_changed), missed))

    outside_counts = [v[0] for v in values]
    predicted_counts = [v[1] for v in values]
    missed_counts = [v[3] for v in values]
    return {
        "tag": tag,
        "plausible_with_stats": len(values),
        "outside_ref_avg": sum(outside_counts) / len(values) if values else 0.0,
        "outside_ref_med": statistics.median(outside_counts) if values else 0.0,
        "edited_lines_avg": sum(predicted_counts) / len(values) if values else 0.0,
        "edited_lines_med": statistics.median(predicted_counts) if values else 0.0,
        "missed_ref_avg": sum(missed_counts) / len(values) if values else 0.0,
        "missed_ref_med": statistics.median(missed_counts) if values else 0.0,
    }


def main(argv: list[str]) -> int:
    if not argv:
        print("Usage: python scripts/analyze_edit_location.py TAG [TAG ...]", file=sys.stderr)
        return 2
    header = [
        "tag",
        "plausible_with_stats",
        "outside_ref_avg",
        "outside_ref_med",
        "edited_lines_avg",
        "edited_lines_med",
        "missed_ref_avg",
        "missed_ref_med",
    ]
    print(",".join(header))
    for tag in argv:
        row = summarize(tag)
        print(",".join(
            f"{row[key]:.2f}" if isinstance(row[key], float) else str(row[key])
            for key in header
        ))
    return 0


if __name__ == "__main__":
    raise SystemExit(main(sys.argv[1:]))
