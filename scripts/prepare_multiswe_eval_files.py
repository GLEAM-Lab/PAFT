#!/usr/bin/env python3
"""Prepare Multi-SWE harness dataset and patch files for a context subset."""

from __future__ import annotations

import argparse
import json
from pathlib import Path

from datasets import Dataset


DEFAULT_ARROW = Path(
    "/home/barty/.cache/huggingface/datasets/"
    "Daoguang___multi-swe-bench/default/0.0.0/"
    "8bd202138a4ab9987daa77111c76a3e66af9f1c9/"
    "multi-swe-bench-java_verified.arrow"
)


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("--arrow", default=str(DEFAULT_ARROW))
    parser.add_argument(
        "--contexts",
        default="analysis_outputs/multiswe_java_verified_runnable_smoke10_ctx5_max20k_20260704.jsonl",
    )
    parser.add_argument("--dataset-jsonl", default="analysis_outputs/multiswe_eval/smoke10_dataset.jsonl")
    parser.add_argument("--gold-patches-jsonl", default="analysis_outputs/multiswe_eval/smoke10_gold_patches.jsonl")
    parser.add_argument("--config-json", default="analysis_outputs/multiswe_eval/smoke10_gold_config.json")
    parser.add_argument("--limit", type=int, default=0)
    args = parser.parse_args()

    contexts = [
        json.loads(line)
        for line in Path(args.contexts).read_text(encoding="utf-8").splitlines()
        if line.strip()
    ]
    if args.limit > 0:
        contexts = contexts[: args.limit]
    wanted = {str(row["instance_id"]) for row in contexts}
    ds = Dataset.from_file(str(Path(args.arrow)))
    rows = [dict(row) for row in ds if str(row["instance_id"]) in wanted]
    rows.sort(key=lambda row: [ctx["instance_id"] for ctx in contexts].index(str(row["instance_id"])))

    dataset_path = Path(args.dataset_jsonl)
    patch_path = Path(args.gold_patches_jsonl)
    dataset_path.parent.mkdir(parents=True, exist_ok=True)
    with dataset_path.open("w", encoding="utf-8") as handle:
        for row in rows:
            serializable = {}
            for key, value in row.items():
                serializable[key] = str(value) if key == "created_at" else value
            handle.write(json.dumps(serializable, ensure_ascii=False) + "\n")

    with patch_path.open("w", encoding="utf-8") as handle:
        for row in rows:
            org, repo = str(row["repo"]).split("/", 1)
            handle.write(
                json.dumps(
                    {
                        "org": org,
                        "repo": repo,
                        "number": int(row["pull_number"]),
                        "instance_id": row["instance_id"],
                        "fix_patch": row["patch"],
                    },
                    ensure_ascii=False,
                )
                + "\n"
            )

    config = {
        "mode": "evaluation",
        "workdir": str(dataset_path.parent / "workdir_gold"),
        "patch_files": [str(patch_path)],
        "dataset_files": [str(dataset_path)],
        "force_build": False,
        "output_dir": str(dataset_path.parent / "output_gold"),
        "specifics": [],
        "skips": [],
        "repo_dir": str(dataset_path.parent / "repos"),
        "need_clone": False,
        "global_env": [],
        "clear_env": True,
        "stop_on_error": False,
        "max_workers": 2,
        "max_workers_build_image": 2,
        "max_workers_run_instance": 2,
        "log_dir": str(dataset_path.parent / "logs_gold"),
        "log_level": "INFO",
    }
    config_path = Path(args.config_json)
    config_path.write_text(json.dumps(config, indent=2, ensure_ascii=False) + "\n", encoding="utf-8")
    print(f"instances={len(rows)}")
    print(f"wrote {dataset_path}")
    print(f"wrote {patch_path}")
    print(f"wrote {config_path}")


if __name__ == "__main__":
    main()
