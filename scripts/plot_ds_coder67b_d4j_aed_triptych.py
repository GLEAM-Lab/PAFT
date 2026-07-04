#!/usr/bin/env python3

import argparse
import csv
import glob
import json
import os
import statistics
from dataclasses import dataclass
from pathlib import Path


METHODS = [
    ("Base", "deepseek-6.7b"),
    ("SFT", "deepseek-6.7b-sft"),
    ("Prompting", "deepseek-6.7b-prompting"),
    ("RepairLLaMA", "deepseek-6.7b-repairllama"),
    ("AdaPatcher", "deepseek-6.7b-adapatcher"),
    ("PAFT", "deepseek-6.7b-paft"),
]

PAPER_TABLE = {
    "Base": {
        "pass@1": 5.8,
        "pass@5": 14.6,
        "pass@10": 19.4,
        "aed_avg": 142.9,
        "aed_med": 113.0,
        "aed_min10": 95.5,
        "ccr_avg": 70.7,
        "ccr_med": 77.0,
        "ccr_max10": 77.5,
    },
    "SFT": {
        "pass@1": 6.1,
        "pass@5": 15.1,
        "pass@10": 18.9,
        "aed_avg": 93.5,
        "aed_med": 73.5,
        "aed_min10": 54.7,
        "ccr_avg": 70.6,
        "ccr_med": 78.2,
        "ccr_max10": 80.7,
    },
    "Prompting": {
        "pass@1": 8.3,
        "pass@5": 19.3,
        "pass@10": 24.7,
        "aed_avg": 148.6,
        "aed_med": 104.5,
        "aed_min10": 77.6,
        "ccr_avg": 72.2,
        "ccr_med": 75.0,
        "ccr_max10": 79.3,
    },
    "RepairLLaMA": {
        "pass@1": 7.0,
        "pass@5": 17.7,
        "pass@10": 23.7,
        "aed_avg": 149.1,
        "aed_med": 111.0,
        "aed_min10": 105.4,
        "ccr_avg": 35.3,
        "ccr_med": 25.0,
        "ccr_max10": 56.8,
    },
    "AdaPatcher": {
        "pass@1": 5.9,
        "pass@5": 16.6,
        "pass@10": 22.1,
        "aed_avg": 112.4,
        "aed_med": 61.0,
        "aed_min10": 77.0,
        "ccr_avg": 79.3,
        "ccr_med": 87.5,
        "ccr_max10": 84.2,
    },
    "PAFT": {
        "pass@1": 10.1,
        "pass@5": 21.2,
        "pass@10": 26.4,
        "aed_avg": 80.7,
        "aed_med": 42.0,
        "aed_min10": 48.9,
        "ccr_avg": 76.3,
        "ccr_med": 85.4,
        "ccr_max10": 81.8,
    },
}


@dataclass
class MethodMetrics:
    label: str
    model_dir: str
    bugs: int
    plausible_patches: int
    pass1: float
    pass5: float
    pass10: float
    aed_avg: float
    aed_med: float
    aed_min10: float
    aed_values: list[float]
    ccr_avg: float
    ccr_med: float
    ccr_max10: float


def comb(n: int, k: int) -> int:
    if k > n or k < 0:
        return 0
    if k == 0 or k == n:
        return 1
    k = min(k, n - k)
    result = 1
    for i in range(k):
        result = result * (n - i) // (i + 1)
    return result


def pass_at_k(n: int, c: int, k: int) -> float:
    if c == 0:
        return 0.0
    if n - c < k:
        return 1.0
    return 1.0 - (comb(n - c, k) / comb(n, k))


def load_bug_results(model_root: Path) -> dict[str, list[dict]]:
    results = {}
    for result_path in glob.glob(str(model_root / "**" / "*.json.result"), recursive=True):
        bug_id = Path(result_path).name.replace(".json.result", "")
        with open(result_path, encoding="utf-8") as f:
            results[bug_id] = json.load(f)
    return results


def compute_metrics(label: str, model_dir: str, results_root: Path) -> MethodMetrics:
    bug_results = load_bug_results(results_root / model_dir)

    pass1_sum = 0.0
    pass5_sum = 0.0
    pass10_sum = 0.0
    valid_bugs = 0

    aeds = []
    ccrs = []
    min_aed_weighted_sum = 0.0
    max_ccr_weighted_sum = 0.0
    plausible_patch_count = 0

    for patches in bug_results.values():
        if len(patches) != 10:
            continue

        plausible_patches = [p for p in patches if p.get("patch_status") == "PLAUSIBLE"]
        c = len(plausible_patches)
        valid_bugs += 1
        pass1_sum += pass_at_k(10, c, 1)
        pass5_sum += pass_at_k(10, c, 5)
        pass10_sum += pass_at_k(10, c, 10)

        plausible_aeds = []
        plausible_ccrs = []
        for patch in plausible_patches:
            diff_stats = patch.get("diff_stats") or {}
            if "edit_distance" in diff_stats:
                aed = diff_stats["edit_distance"]
                aeds.append(aed)
                plausible_aeds.append(aed)
            if "preserved_ratio" in diff_stats:
                ccr = diff_stats["preserved_ratio"]
                ccrs.append(ccr)
                plausible_ccrs.append(ccr)

        if plausible_aeds and plausible_ccrs:
            weighted_count = len([p for p in plausible_patches if p.get("diff_stats")])
            if weighted_count == 0:
                weighted_count = min(len(plausible_aeds), len(plausible_ccrs))
            min_aed_weighted_sum += min(plausible_aeds) * weighted_count
            max_ccr_weighted_sum += max(plausible_ccrs) * weighted_count
            plausible_patch_count += weighted_count

    return MethodMetrics(
        label=label,
        model_dir=model_dir,
        bugs=valid_bugs,
        plausible_patches=plausible_patch_count,
        pass1=(pass1_sum / valid_bugs) * 100,
        pass5=(pass5_sum / valid_bugs) * 100,
        pass10=(pass10_sum / valid_bugs) * 100,
        aed_avg=sum(aeds) / len(aeds),
        aed_med=statistics.median(aeds),
        aed_min10=min_aed_weighted_sum / plausible_patch_count,
        aed_values=sorted(aeds),
        ccr_avg=sum(ccrs) / len(ccrs),
        ccr_med=statistics.median(ccrs),
        ccr_max10=max_ccr_weighted_sum / plausible_patch_count,
    )


def save_comparison_csv(metrics: list[MethodMetrics], path: Path) -> None:
    fields = [
        "method",
        "paper_pass@1",
        "local_pass@1",
        "delta_pass@1",
        "paper_pass@5",
        "local_pass@5",
        "delta_pass@5",
        "paper_pass@10",
        "local_pass@10",
        "delta_pass@10",
        "paper_aed_avg",
        "local_aed_avg",
        "delta_aed_avg",
        "paper_aed_med",
        "local_aed_med",
        "delta_aed_med",
        "paper_aed_min10",
        "local_aed_min10",
        "delta_aed_min10",
        "paper_ccr_avg",
        "local_ccr_avg",
        "delta_ccr_avg",
        "paper_ccr_med",
        "local_ccr_med",
        "delta_ccr_med",
        "paper_ccr_max10",
        "local_ccr_max10",
        "delta_ccr_max10",
    ]
    with path.open("w", newline="", encoding="utf-8") as f:
        writer = csv.DictWriter(f, fieldnames=fields)
        writer.writeheader()
        for m in metrics:
            paper = PAPER_TABLE[m.label]
            row = {"method": m.label}
            for key, value in [
                ("pass@1", m.pass1),
                ("pass@5", m.pass5),
                ("pass@10", m.pass10),
                ("aed_avg", m.aed_avg),
                ("aed_med", m.aed_med),
                ("aed_min10", m.aed_min10),
                ("ccr_avg", m.ccr_avg),
                ("ccr_med", m.ccr_med),
                ("ccr_max10", m.ccr_max10),
            ]:
                row[f"paper_{key}"] = paper[key]
                row[f"local_{key}"] = round(value, 1)
                row[f"delta_{key}"] = round(value - paper[key], 1)
            writer.writerow(row)


def plot_distribution_scatter(
    metrics: list[MethodMetrics], output_png: Path, output_svg: Path, output_pdf: Path
) -> None:
    os.environ.setdefault("MPLCONFIGDIR", str(Path("tmp/matplotlib").resolve()))
    Path(os.environ["MPLCONFIGDIR"]).mkdir(parents=True, exist_ok=True)

    import matplotlib.pyplot as plt
    from matplotlib.lines import Line2D
    from matplotlib.patches import Patch

    labels = ["DS-Coder-6.7B" if m.label == "Base" else m.label for m in metrics]
    y = list(range(len(labels)))
    x_cap = 500
    fig, ax = plt.subplots(figsize=(10.8, 4.2))
    visible_series = [[v for v in m.aed_values if v <= x_cap] for m in metrics]
    box = ax.boxplot(
        visible_series,
        vert=False,
        positions=y,
        widths=0.52,
        patch_artist=True,
        showfliers=False,
        manage_ticks=False,
        medianprops={"color": "#2f2f2f", "linewidth": 1.8},
        whiskerprops={"color": "#7a7a7a", "linewidth": 1.2},
        capprops={"color": "#7a7a7a", "linewidth": 1.2},
        boxprops={"linewidth": 1.2},
    )

    for patch, m in zip(box["boxes"], metrics):
        if m.label == "PAFT":
            patch.set_facecolor("#f2a65a")
            patch.set_edgecolor("#b85a00")
            patch.set_alpha(0.95)
        else:
            patch.set_facecolor("#d4d4d4")
            patch.set_edgecolor("#7a7a7a")
            patch.set_alpha(0.95)

    mean_x = [min(m.aed_avg, x_cap) for m in metrics]
    mean_face = ["#d95f02" if m.label == "PAFT" else "#ffffff" for m in metrics]
    mean_edge = ["#9c3f00" if m.label == "PAFT" else "#333333" for m in metrics]
    ax.scatter(
        mean_x,
        y,
        s=48,
        marker="o",
        facecolors=mean_face,
        edgecolors=mean_edge,
        linewidths=1.2,
        zorder=4,
    )

    ax.set_xlim(0, x_cap)
    ax.set_xticks([0, 100, 200, 300, 400, 500])
    ax.set_xlabel("AED", fontsize=13)
    ax.set_yticks(y, labels)
    ax.invert_yaxis()
    ax.grid(axis="x", linestyle=":", color="#cfcfcf", linewidth=0.8)
    ax.tick_params(axis="x", labelsize=11)
    ax.tick_params(axis="y", length=0, labelsize=13)
    ax.spines["top"].set_visible(False)
    ax.spines["right"].set_visible(False)
    ax.spines["left"].set_linewidth(0.8)
    ax.spines["bottom"].set_linewidth(0.8)

    legend_handles = [
        Patch(facecolor="#d4d4d4", edgecolor="#7a7a7a", label="IQR"),
        Line2D([0], [0], color="#2f2f2f", linewidth=1.8, label="Median"),
        Line2D([0], [0], marker="o", linestyle="None", markerfacecolor="#ffffff", markeredgecolor="#333333", markersize=7, label="Mean"),
    ]
    ax.legend(
        handles=legend_handles,
        loc="upper right",
        frameon=False,
        ncol=3,
        fontsize=11,
        handletextpad=0.5,
        columnspacing=1.0,
        borderaxespad=0.3,
    )

    fig.subplots_adjust(left=0.19, right=0.995, bottom=0.16, top=0.95)
    fig.savefig(output_png, dpi=260, bbox_inches="tight", pad_inches=0.01)
    fig.savefig(output_svg, bbox_inches="tight", pad_inches=0.01)
    fig.savefig(output_pdf, bbox_inches="tight", pad_inches=0.01)
    plt.close(fig)


def save_caption_and_description(metrics: list[MethodMetrics], output_dir: Path) -> None:
    paft = next(m for m in metrics if m.label == "PAFT")
    baseline_mins = [m.aed_min10 for m in metrics if m.label != "PAFT"]
    best_baseline_min10 = min(baseline_mins)
    caption = (
        "Boxplot of plausible-patch AED on Defects4J with DS-Coder-6.7B across representative baselines. "
        "Boxes show the interquartile range, the center line shows the median, and the dot marks the mean. "
        f"PAFT concentrates more mass at low AED values and also achieves the best Avg. and Median AED. "
        f"Notably, its median AED ({paft.aed_med:.1f}) is lower than the Min@10 AED of every baseline "
        f"(best baseline: {best_baseline_min10:.1f})."
    )
    (output_dir / "caption.txt").write_text(caption + "\n", encoding="utf-8")

    description = f"""This figure is a single-panel horizontal boxplot focused on AED for Defects4J on DS-Coder-6.7B.

Visual encoding:
- Each row is one method, ordered exactly as in the comparison table: DS-Coder-6.7B, SFT, Prompting, RepairLLaMA, AdaPatcher, PAFT.
- The horizontal axis is truncated at AED = 500 to keep the main mass readable; rare points above 500 are omitted from the plot area.
- Each box shows the interquartile range of the visible AED distribution, and the horizontal line inside the box marks the median.
- The circular marker marks the mean AED.
- PAFT is highlighted in orange; every baseline is shown in light gray.

Exact plotted values:
- DS-Coder-6.7B: {len(metrics[0].aed_values)} plausible AED points; Avg. AED {metrics[0].aed_avg:.1f}, Median AED {metrics[0].aed_med:.1f}, Min@10 AED {metrics[0].aed_min10:.1f}
- SFT: {len(metrics[1].aed_values)} plausible AED points; Avg. AED {metrics[1].aed_avg:.1f}, Median AED {metrics[1].aed_med:.1f}, Min@10 AED {metrics[1].aed_min10:.1f}
- Prompting: {len(metrics[2].aed_values)} plausible AED points; Avg. AED {metrics[2].aed_avg:.1f}, Median AED {metrics[2].aed_med:.1f}, Min@10 AED {metrics[2].aed_min10:.1f}
- RepairLLaMA: {len(metrics[3].aed_values)} plausible AED points; Avg. AED {metrics[3].aed_avg:.1f}, Median AED {metrics[3].aed_med:.1f}, Min@10 AED {metrics[3].aed_min10:.1f}
- AdaPatcher: {len(metrics[4].aed_values)} plausible AED points; Avg. AED {metrics[4].aed_avg:.1f}, Median AED {metrics[4].aed_med:.1f}, Min@10 AED {metrics[4].aed_min10:.1f}
- PAFT: {len(metrics[5].aed_values)} plausible AED points; Avg. AED {metrics[5].aed_avg:.1f}, Median AED {metrics[5].aed_med:.1f}, Min@10 AED {metrics[5].aed_min10:.1f}

Main message:
- PAFT's box is shifted furthest to the left, indicating that both its central mass and its typical edit distance are lower than those of the baselines.
- The mean marker for PAFT is also leftmost, showing that the advantage is consistent under average behavior as well.
- The stronger quantitative statement still comes from the table values: PAFT's median AED is lower than the Min@10 AED of every baseline.
"""
    (output_dir / "description.txt").write_text(description, encoding="utf-8")


def main() -> None:
    parser = argparse.ArgumentParser(description="Plot a single-panel AED boxplot for DS-Coder-6.7B on Defects4J.")
    parser.add_argument("--results-root", default="defects4j/results")
    parser.add_argument("--output-dir", default="analysis_outputs/ds_coder67b_d4j_aed_distribution")
    args = parser.parse_args()

    results_root = Path(args.results_root)
    output_dir = Path(args.output_dir)
    output_dir.mkdir(parents=True, exist_ok=True)

    metrics = [compute_metrics(label, model_dir, results_root) for label, model_dir in METHODS]

    comparison_json = {}
    for m in metrics:
        comparison_json[m.label] = {
            "local": {
                "pass@1": round(m.pass1, 1),
                "pass@5": round(m.pass5, 1),
                "pass@10": round(m.pass10, 1),
                "aed_avg": round(m.aed_avg, 1),
                "aed_med": round(m.aed_med, 1),
                "aed_min10": round(m.aed_min10, 1),
                "ccr_avg": round(m.ccr_avg, 1),
                "ccr_med": round(m.ccr_med, 1),
                "ccr_max10": round(m.ccr_max10, 1),
                "bugs": m.bugs,
                "plausible_patches": m.plausible_patches,
            },
            "paper": PAPER_TABLE[m.label],
        }

    (output_dir / "paper_comparison.json").write_text(
        json.dumps(comparison_json, indent=2, ensure_ascii=False) + "\n",
        encoding="utf-8",
    )
    save_comparison_csv(metrics, output_dir / "paper_comparison.csv")
    plot_distribution_scatter(
        metrics,
        output_dir / "ds_coder67b_d4j_aed_distribution.png",
        output_dir / "ds_coder67b_d4j_aed_distribution.svg",
        output_dir / "ds_coder67b_d4j_aed_distribution.pdf",
    )
    save_caption_and_description(metrics, output_dir)

    for m in metrics:
        print(
            f"{m.label:12s} | pass@1 {m.pass1:5.1f} | pass@5 {m.pass5:5.1f} | pass@10 {m.pass10:5.1f} | "
            f"AED {m.aed_avg:5.1f}/{m.aed_med:5.1f}/{m.aed_min10:5.1f}"
        )
    print(f"\nSaved outputs to: {output_dir}")


if __name__ == "__main__":
    main()
