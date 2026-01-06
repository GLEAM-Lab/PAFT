import argparse
import json
import os
import textwrap
from typing import List, Dict, Any


def load_data(path: str) -> List[Dict[str, Any]]:
    with open(path, "r", encoding="utf-8") as f:
        return json.load(f)


def save_labels(path: str, labels: List[Dict[str, Any]]) -> None:
    with open(path, "w", encoding="utf-8") as f:
        json.dump(labels, f, ensure_ascii=False, indent=2)


def safe_rate(num: float, den: float) -> float:
    return 0.0 if den == 0 else num / den


def compute_metrics(sample: List[Dict[str, Any]], labels: List[Dict[str, Any]], metric_field: str) -> Dict[str, Any]:
    """根据人工选择与样本中的 metric label 计算二分类指标 (a 为正例)。"""
    gold_map = {item["index"]: item.get("label") for item in labels}
    pairs = []
    missing_pred = 0
    missing_gold = 0
    skipped = 0
    for idx, item in enumerate(sample):
        gold = gold_map.get(idx)
        if gold is None:
            missing_gold += 1
            continue
        if gold == "skip":
            skipped += 1
            continue
        pred = item.get(metric_field)
        if pred not in ("a", "b"):
            missing_pred += 1
            continue
        pairs.append((gold, pred))

    tp = sum(1 for g, p in pairs if g == "a" and p == "a")
    tn = sum(1 for g, p in pairs if g == "b" and p == "b")
    fp = sum(1 for g, p in pairs if g == "b" and p == "a")
    fn = sum(1 for g, p in pairs if g == "a" and p == "b")
    total = tp + tn + fp + fn
    precision = safe_rate(tp, tp + fp)
    recall = safe_rate(tp, tp + fn)
    f1 = 0.0 if precision + recall == 0 else 2 * precision * recall / (precision + recall)
    accuracy = safe_rate(tp + tn, total)

    return {
        "metric_field": metric_field,
        "used": len(pairs),
        "skipped_gold": skipped,
        "missing_gold": missing_gold,
        "missing_pred": missing_pred,
        "tp": tp,
        "tn": tn,
        "fp": fp,
        "fn": fn,
        "accuracy": round(accuracy, 4),
        "precision": round(precision, 4),
        "recall": round(recall, 4),
        "f1": round(f1, 4),
    }


# 自动换行并保持三列对齐
def format_side_by_side(buggy: str, patch_a: str, patch_b: str, max_width=80):
    buggy_lines = buggy.splitlines()
    a_lines = patch_a.splitlines()
    b_lines = patch_b.splitlines()

    # 对每列的每行进行换行
    buggy_wrapped = [textwrap.wrap(line, max_width) or [""] for line in buggy_lines]
    a_wrapped = [textwrap.wrap(line, max_width) or [""] for line in a_lines]
    b_wrapped = [textwrap.wrap(line, max_width) or [""] for line in b_lines]

    # 将三列行列表扁平化，同时补齐行数
    max_rows = max(sum(len(x) for x in buggy_wrapped),
                   sum(len(x) for x in a_wrapped),
                   sum(len(x) for x in b_wrapped))

    # 扁平化三列
    def flatten_column(wrapped_lines):
        flat = []
        for block in wrapped_lines:
            flat.extend(block)
        return flat

    buggy_flat = flatten_column(buggy_wrapped)
    a_flat = flatten_column(a_wrapped)
    b_flat = flatten_column(b_wrapped)

    # 补空行
    while len(buggy_flat) < max_rows:
        buggy_flat.append("")
    while len(a_flat) < max_rows:
        a_flat.append("")
    while len(b_flat) < max_rows:
        b_flat.append("")

    # 构建横向对齐行
    rows = []
    for c1, c2, c3 in zip(buggy_flat, a_flat, b_flat):
        rows.append(f"{c1:<{max_width}} | {c2:<{max_width}} | {c3:<{max_width}}")
    return "\n".join(rows)


def prompt_pair(item: Dict[str, Any], idx: int, total: int) -> str:
    bug = item.get("bug_name", f"bug_{idx}")
    buggy = item.get("buggy_code", "")
    patches = item.get("patches", [])
    patch_a = patches[0].get("patch_code", "") if len(patches) > 0 else ""
    patch_b = patches[1].get("patch_code", "") if len(patches) > 1 else ""

    print("=" * 3 + f"[{idx + 1}/{total}] bug_name: {bug}" + "=" * 3)
    print(f"{'Buggy Code':<80} | {'Patch A':<80} | {'Patch B':<80}")
    print("-" * 245)
    print(format_side_by_side(buggy, patch_a, patch_b, 80))
    print("-" * 245)
    choice = input("Given two candidate patches for the same buggy snippet, select the patch that you would prefer to maintain. Prefer the patch that better preserves the original intent and structure, makes fewer unnecessary changes, and is more maintainable. (a/b/skip/quit): ").strip().lower()
    return choice


def main():
    parser = argparse.ArgumentParser(description="逐条标注补丁对 (a/b/skip).")
    parser.add_argument("--input", default="sample_50.json", help="输入样本文件")
    parser.add_argument("--output", default="sample_50_labels.json", help="输出标注结果文件")
    parser.add_argument("--start", type=int, default=0, help="断点续标")
    parser.add_argument("--metric-field", default=None, help="可选：样本中的预测字段 (如 ccr_label/atd_label)，用于结束后计算F1")
    parser.add_argument("--eval-output", default=None, help="可选：评估结果输出文件，默认与输出同名加 .eval.json")
    args = parser.parse_args()

    if not os.path.exists(args.input):
        print(f"[ERROR] 输入文件不存在: {args.input}")
        return

    data = load_data(args.input)
    labels: List[Dict[str, Any]] = []

    for i in range(args.start, len(data)):
        item = data[i]
        choice = prompt_pair(item, i, len(data))

        if choice == "quit":
            print("中止标注，不保存当前条目。")
            break
        if choice not in ("a", "b", "skip"):
            print("输入无效，标记为 skip")
            choice = "skip"

        patches = item.get("patches", [])
        labels.append({
            "index": i,
            "bug_name": item.get("bug_name"),
            "label": choice,
            "patch_a_status": patches[0].get("patch_status") if len(patches) > 0 else None,
            "patch_b_status": patches[1].get("patch_status") if len(patches) > 1 else None
        })

    if labels:
        save_labels(args.output, labels)
        print(f"✔ 已保存标注到: {args.output}")

        if args.metric_field:
            eval_output = args.eval_output or (args.output + ".eval.json")
            metrics = compute_metrics(data, labels, args.metric_field)
            with open(eval_output, "w", encoding="utf-8") as f:
                json.dump(metrics, f, ensure_ascii=False, indent=2)
            print(f"✔ 评估完成 ({args.metric_field}) 保存到: {eval_output}")
            print(json.dumps(metrics, ensure_ascii=False, indent=2))
    else:
        print("未生成任何标注")


if __name__ == "__main__":
    main()
