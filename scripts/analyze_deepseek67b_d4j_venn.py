#!/usr/bin/env python3

import argparse
import csv
import itertools
import json
import os
from collections import OrderedDict
from pathlib import Path


DEFAULT_MODEL_DIRS = OrderedDict(
    [
        ("PAFT", "deepseek-6.7b-paft"),
        ("SFT", "deepseek-6.7b-sft"),
        ("AdaPatcher", "deepseek-6.7b-adapatcher"),
        ("Prompting", "deepseek-6.7b-prompting"),
        ("RepairLLaMA", "deepseek-6.7b-repairllama"),
    ]
)


def parse_model_specs(model_specs: list[str] | None) -> OrderedDict[str, str]:
    if not model_specs:
        return DEFAULT_MODEL_DIRS.copy()

    parsed = OrderedDict()
    for spec in model_specs:
        if "=" not in spec:
            raise ValueError(f"Invalid --model spec: {spec}. Expected LABEL=DIRNAME.")
        label, dirname = spec.split("=", 1)
        parsed[label.strip()] = dirname.strip()
    return parsed


def parse_java_result(result_path: Path) -> int:
    content = result_path.read_text().strip()
    try:
        data = json.loads(content)
        if isinstance(data, dict) and "return_code" in data:
            return int(data["return_code"])
    except json.JSONDecodeError:
        pass
    return int(content)


def load_d4j_plausible_bug_set(model_root: Path, require_complete: int | None = None) -> tuple[set[str], dict[str, bool]]:
    bug_status = {}
    for result_path in sorted(model_root.rglob("*.json.result")):
        bug_id = result_path.name.removesuffix(".json.result")
        if bug_id in bug_status:
            raise ValueError(f"Duplicate bug result found for {bug_id}: {result_path}")

        data = json.loads(result_path.read_text())
        if require_complete is not None and len(data) != require_complete:
            continue
        is_plausible = any(item.get("patch_status") == "PLAUSIBLE" for item in data)
        bug_status[bug_id] = is_plausible

    plausible_bugs = {bug_id for bug_id, is_plausible in bug_status.items() if is_plausible}
    return plausible_bugs, bug_status


def load_humaneval_plausible_bug_set(model_root: Path, require_complete: int | None = None) -> tuple[set[str], dict[str, bool]]:
    bug_results = {}
    for result_path in sorted(model_root.rglob("*.java.result")):
        bug_id = result_path.name.removesuffix(".result").removesuffix(".java")
        return_code = parse_java_result(result_path)
        bug_results.setdefault(bug_id, []).append(return_code)

    bug_status = {}
    for bug_id, results in bug_results.items():
        if require_complete is not None and len(results) != require_complete:
            continue
        bug_status[bug_id] = any(return_code == 0 for return_code in results)

    plausible_bugs = {bug_id for bug_id, is_plausible in bug_status.items() if is_plausible}
    return plausible_bugs, bug_status


def load_plausible_bug_set(
    dataset_type: str, model_root: Path, require_complete: int | None = None
) -> tuple[set[str], dict[str, bool]]:
    if dataset_type == "d4j":
        return load_d4j_plausible_bug_set(model_root, require_complete=require_complete)
    if dataset_type == "humaneval_java":
        return load_humaneval_plausible_bug_set(model_root, require_complete=require_complete)
    raise ValueError(f"Unsupported dataset type: {dataset_type}")


def compute_exact_regions(sets_by_label: OrderedDict[str, set[str]]) -> list[dict[str, object]]:
    labels = list(sets_by_label.keys())
    rows = []
    for r in range(1, len(labels) + 1):
        for combo in itertools.combinations(labels, r):
            combo_set = set.intersection(*(sets_by_label[label] for label in combo))
            other_labels = [label for label in labels if label not in combo]
            other_union = set().union(*(sets_by_label[label] for label in other_labels)) if other_labels else set()
            exact_set = combo_set - other_union
            rows.append(
                {
                    "combination": " & ".join(combo),
                    "combination_size": len(combo),
                    "inclusive_count": len(combo_set),
                    "exact_count": len(exact_set),
                    "inclusive_bugs": sorted(combo_set),
                    "exact_bugs": sorted(exact_set),
                }
            )
    rows.sort(key=lambda row: (-row["combination_size"], -row["exact_count"], row["combination"]))
    return rows


def compute_pairwise_overlap(sets_by_label: OrderedDict[str, set[str]]) -> list[dict[str, object]]:
    rows = []
    labels = list(sets_by_label.keys())
    for left, right in itertools.combinations(labels, 2):
        overlap = sets_by_label[left] & sets_by_label[right]
        rows.append(
            {
                "left": left,
                "right": right,
                "count": len(overlap),
                "bugs": sorted(overlap),
            }
        )
    rows.sort(key=lambda row: (-row["count"], row["left"], row["right"]))
    return rows


def save_csv(path: Path, rows: list[dict[str, object]], fieldnames: list[str]) -> None:
    with path.open("w", newline="", encoding="utf-8") as f:
        writer = csv.DictWriter(f, fieldnames=fieldnames)
        writer.writeheader()
        for row in rows:
            writer.writerow(row)


def build_plot_labels(
    sets_by_label: OrderedDict[str, set[str]],
    coverage_by_label: OrderedDict[str, int],
    mode: str,
) -> OrderedDict[str, set[str]]:
    if mode == "plain":
        return sets_by_label

    relabeled = OrderedDict()
    for label, bug_set in sets_by_label.items():
        solved = len(bug_set)
        coverage = coverage_by_label[label]
        rate = (solved / coverage * 100) if coverage else 0.0
        if mode == "solved_over_coverage":
            display_label = f"{label} ({solved}/{coverage})"
        elif mode == "solved_over_coverage_with_rate":
            display_label = f"{label} ({solved}/{coverage}, {rate:.1f}%)"
        else:
            raise ValueError(f"Unsupported label mode: {mode}")
        relabeled[display_label] = bug_set
    return relabeled


def plot_venn(
    sets_by_label: OrderedDict[str, set[str]],
    output_png: Path,
    output_svg: Path,
    title: str,
    hide_title: bool,
    venn_fontsize: float,
    legend_fontsize: float,
    figsize: tuple[float, float],
    margin: float,
    pad_inches: float,
) -> None:
    os.environ.setdefault("MPLCONFIGDIR", str(Path("tmp/matplotlib").resolve()))
    Path(os.environ["MPLCONFIGDIR"]).mkdir(parents=True, exist_ok=True)

    import matplotlib.pyplot as plt
    from venn import venn

    fig, ax = plt.subplots(figsize=figsize)
    venn(sets_by_label, fmt="{size}", cmap="tab20", fontsize=venn_fontsize, legend_loc="upper right", ax=ax)
    if not hide_title and title:
        ax.set_title(title, fontsize=15, pad=18)
    legend = ax.get_legend()
    if legend is not None:
        for text in legend.get_texts():
            text.set_fontsize(legend_fontsize)
    fig.subplots_adjust(left=margin, right=1 - margin, bottom=margin, top=1 - margin)
    fig.savefig(output_png, dpi=220, bbox_inches="tight", pad_inches=pad_inches)
    fig.savefig(output_svg, bbox_inches="tight", pad_inches=pad_inches)
    plt.close(fig)


def main() -> None:
    parser = argparse.ArgumentParser(description="Analyze overlap Venn diagrams for Defects4J or HumanEval-Java results.")
    parser.add_argument(
        "--dataset-type",
        default="d4j",
        choices=["d4j", "humaneval_java"],
        help="Result format to parse.",
    )
    parser.add_argument(
        "--results-root",
        default="defects4j/results",
        help="Root directory that contains the deepseek-6.7b-* result folders.",
    )
    parser.add_argument(
        "--output-dir",
        default="analysis_outputs/deepseek67b_d4j_overlap",
        help="Directory for generated plots and tables.",
    )
    parser.add_argument(
        "--model",
        action="append",
        dest="model_specs",
        help="Model spec in LABEL=DIRNAME format. Repeat to override the default five models.",
    )
    parser.add_argument(
        "--basename",
        default="deepseek67b_d4j_venn",
        help="Basename for generated PNG/SVG files.",
    )
    parser.add_argument(
        "--title",
        default="Defects4J Plausible-Bug Overlap on DeepSeek-Coder-6.7B",
        help="Figure title. Ignored when --hide-title is set.",
    )
    parser.add_argument(
        "--hide-title",
        action="store_true",
        help="Do not render a title above the Venn diagram.",
    )
    parser.add_argument(
        "--venn-fontsize",
        type=float,
        default=12,
        help="Font size for region counts and set labels.",
    )
    parser.add_argument(
        "--legend-fontsize",
        type=float,
        default=15,
        help="Font size for the legend labels.",
    )
    parser.add_argument(
        "--figsize",
        default="13,11",
        help="Figure size as WIDTH,HEIGHT.",
    )
    parser.add_argument(
        "--margin",
        type=float,
        default=0.025,
        help="Outer subplot margin on each side.",
    )
    parser.add_argument(
        "--pad-inches",
        type=float,
        default=0.02,
        help="Extra whitespace kept by savefig around the cropped figure.",
    )
    parser.add_argument(
        "--require-complete",
        type=int,
        default=None,
        help="Only include bugs/problems with exactly this many candidates/results.",
    )
    parser.add_argument(
        "--label-mode",
        default="plain",
        choices=["plain", "solved_over_coverage", "solved_over_coverage_with_rate"],
        help="How to render set labels in the plotted Venn diagram.",
    )
    args = parser.parse_args()

    results_root = Path(args.results_root)
    output_dir = Path(args.output_dir)
    output_dir.mkdir(parents=True, exist_ok=True)
    model_dirs = parse_model_specs(args.model_specs)
    width_str, height_str = args.figsize.split(",", 1)
    figsize = (float(width_str), float(height_str))

    sets_by_label: OrderedDict[str, set[str]] = OrderedDict()
    coverage_by_label = OrderedDict()
    for label, dirname in model_dirs.items():
        model_root = results_root / dirname
        if not model_root.exists():
            raise FileNotFoundError(f"Missing result directory: {model_root}")
        plausible_set, bug_status = load_plausible_bug_set(
            args.dataset_type, model_root, require_complete=args.require_complete
        )
        if not bug_status:
            raise FileNotFoundError(f"No result files found under: {model_root}")
        sets_by_label[label] = plausible_set
        coverage_by_label[label] = len(bug_status)

    universe = set().union(*sets_by_label.values())
    common_all = set.intersection(*sets_by_label.values())
    exact_rows = compute_exact_regions(sets_by_label)
    pairwise_rows = compute_pairwise_overlap(sets_by_label)

    exact_csv_rows = [
        {
            "combination": row["combination"],
            "combination_size": row["combination_size"],
            "exact_count": row["exact_count"],
            "inclusive_count": row["inclusive_count"],
            "exact_bugs": ";".join(row["exact_bugs"]),
            "inclusive_bugs": ";".join(row["inclusive_bugs"]),
        }
        for row in exact_rows
    ]
    pairwise_csv_rows = [
        {
            "left": row["left"],
            "right": row["right"],
            "count": row["count"],
            "bugs": ";".join(row["bugs"]),
        }
        for row in pairwise_rows
    ]

    save_csv(
        output_dir / "exact_intersections.csv",
        exact_csv_rows,
        ["combination", "combination_size", "exact_count", "inclusive_count", "exact_bugs", "inclusive_bugs"],
    )
    save_csv(output_dir / "pairwise_overlaps.csv", pairwise_csv_rows, ["left", "right", "count", "bugs"])

    summary = {
        "model_count": len(model_dirs),
        "require_complete": args.require_complete,
        "label_mode": args.label_mode,
        "coverage_by_label": coverage_by_label,
        "plausible_bug_count_by_label": {label: len(bugs) for label, bugs in sets_by_label.items()},
        "union_bug_count": len(universe),
        "all_models_intersection_count": len(common_all),
        "all_models_intersection_bugs": sorted(common_all),
        "unique_bug_count_by_label": {
            label: next(row["exact_count"] for row in exact_rows if row["combination"] == label)
            for label in model_dirs
        },
        "top_exact_regions": [
            {
                "combination": row["combination"],
                "exact_count": row["exact_count"],
            }
            for row in exact_rows
            if row["exact_count"] > 0
        ][:10],
        "top_pairwise_overlaps": [
            {
                "left": row["left"],
                "right": row["right"],
                "count": row["count"],
            }
            for row in pairwise_rows[:10]
        ],
    }
    (output_dir / "summary.json").write_text(json.dumps(summary, indent=2, ensure_ascii=False) + "\n", encoding="utf-8")

    plot_venn(
        build_plot_labels(sets_by_label, coverage_by_label, args.label_mode),
        output_dir / f"{args.basename}.png",
        output_dir / f"{args.basename}.svg",
        title=args.title,
        hide_title=args.hide_title,
        venn_fontsize=args.venn_fontsize,
        legend_fontsize=args.legend_fontsize,
        figsize=figsize,
        margin=args.margin,
        pad_inches=args.pad_inches,
    )

    print("Coverage by model:")
    for label, count in coverage_by_label.items():
        print(f"  {label:12s}: {count}")

    print("\nPlausible bug counts:")
    for label, bugs in sets_by_label.items():
        print(f"  {label:12s}: {len(bugs)}")

    print(f"\nUnion count: {len(universe)}")
    print(f"Common-to-all count: {len(common_all)}")
    print("\nUnique-only counts:")
    for label in model_dirs:
        unique_count = summary["unique_bug_count_by_label"][label]
        print(f"  {label:12s}: {unique_count}")

    print("\nTop exact overlap regions:")
    for row in summary["top_exact_regions"]:
        print(f"  {row['combination']}: {row['exact_count']}")

    print("\nTop pairwise overlaps:")
    for row in summary["top_pairwise_overlaps"]:
        print(f"  {row['left']} & {row['right']}: {row['count']}")

    print(f"\nSaved outputs to: {output_dir}")


if __name__ == "__main__":
    main()
