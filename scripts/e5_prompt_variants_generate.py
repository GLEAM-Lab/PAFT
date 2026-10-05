#!/usr/bin/env python3
"""E5 (TSE major revision): prompt-variant patch generation on the base DS-Coder model.

Standalone script written for the E5 experiment. It does NOT modify
scripts/fast_d4j_generate_vllm.py and does not train anything: it only changes the
repair-request wording and generates candidates with vLLM.

Variants (the shared part of the prompt is identical in all of them):
  plain    : "You are a software engineer. Can you repair the incorrect Java code?"
             (byte-identical to the archived BASE / SFT / PAFT prompt)
  minimal  : "... with the minimal change ?"
             (byte-identical to the archived PROMPTING row)
  emphatic : a stronger three-sentence minimal-edit instruction
  fewshot  : emphatic + one short worked example of a one-line fix

Output layout matches the existing harness so test_d4j.py can consume it:
  <root>/defects4j/results/<result-tag>/fixed<k>/<fault>.json
  <root>/defects4j/results/<result-tag>/fixed<k>/<fault>.json.log
"""

from __future__ import annotations

import argparse
import json
import os
from pathlib import Path
import re

DEEPSEEK_BOF = (
    "You are an AI programming assistant, utilizing the DeepSeek Coder model, developed "
    "by DeepSeek Company, and you only answer questions related to computer science. For "
    "politically sensitive questions, security and privacy issues, and other non-computer "
    "science questions, you will refuse to answer.\n### Instruction:\n"
)
DEEPSEEK_EOF = "\n### Response:\n"


EMPHATIC_INSTRUCTION = (
    "You are a software engineer. Repair the incorrect Java code. "
    "Change as few lines as possible and keep every line that does not need to change. "
    "Return only the fixed Java code in a single ```java code block."
)

# One short worked example of a one-line fix. Hand-written, contains no Defects4J
# content, so it cannot leak anything from the evaluation set.
FEWSHOT_EXAMPLE = (
    "\n\nExample\n"
    "Buggy code:\n```java\n"
    "static int sumFirstN(int[] a, int n) {\n"
    "    int s = 0;\n"
    "    for (int i = 0; i <= n; i++) {\n"
    "        s += a[i];\n"
    "    }\n"
    "    return s;\n"
    "}\n```\n"
    "Minimal fix: the loop runs one iteration too far, so only the loop condition changes.\n"
    "```java\n"
    "static int sumFirstN(int[] a, int n) {\n"
    "    int s = 0;\n"
    "    for (int i = 0; i < n; i++) {\n"
    "        s += a[i];\n"
    "    }\n"
    "    return s;\n"
    "}\n```\n"
    "Every other line is preserved verbatim."
)


def repair_request(variant: str) -> str:
    if variant == "minimal":
        # Byte-identical to the archived PROMPTING prompt, including the space before "?".
        return (
            "You are a software engineer. "
            "Can you repair the incorrect Java code with the minimal change ?"
        )
    if variant == "emphatic":
        return EMPHATIC_INSTRUCTION
    if variant == "fewshot":
        return EMPHATIC_INSTRUCTION + FEWSHOT_EXAMPLE
    return "You are a software engineer. Can you repair the incorrect Java code?"


def _lf(text: str) -> str:
    """Normalise CRLF/CR to LF.

    The released JSON files carry CRLF in 69 of the 371 faults, while the archived
    generations behind the paper were produced from LF text. Normalising here makes the
    prompt byte-identical to the archived rows (verified for all 371 faults).
    """
    return text.replace("\r\n", "\n").replace("\r", "\n")


def make_prompt(data: dict, variant: str) -> str:
    return (
        DEEPSEEK_BOF
        + "\n# "
        + _lf(data["issue_title"])
        + "\n"
        + _lf(data["issue_description"])
        + "\nThis is an incorrect Java code ("
        + _lf(data["loc"])
        + "):\n```java\n"
        + _lf(data["buggy"])
        + "\n```\n"
        + repair_request(variant)
        + "\n"
        + DEEPSEEK_EOF
        + "\n```java\n"
    )


def sort_by_project_and_id(path: Path) -> tuple[str, int]:
    parts = path.stem.split("-")
    if len(parts) >= 2:
        try:
            return parts[0], int(parts[1])
        except ValueError:
            pass
    return path.stem, 0


def extract_first_java_code(text: str) -> str:
    matches = re.findall(r"```java(.*?)```", text, re.DOTALL)
    if matches:
        return matches[0].strip()
    marker = "```java"
    start = text.find(marker)
    if start >= 0:
        tail = text[start + len(marker) :]
        end = tail.find("```")
        return (tail[:end] if end >= 0 else tail).strip()
    return ""


def iter_missing_tasks(root: Path, result_tag: str, n: int):
    dataset_dir = root / "defects4j" / "dataset"
    result_root = root / "defects4j" / "results" / result_tag
    tasks = []
    for dataset_file in sorted(dataset_dir.rglob("*.json"), key=sort_by_project_and_id):
        data = json.loads(dataset_file.read_text(encoding="utf-8"))
        for sample_id in range(n):
            fixed_dir = result_root / f"fixed{sample_id}"
            fixed_dir.mkdir(parents=True, exist_ok=True)
            out_json = fixed_dir / dataset_file.name
            out_log = fixed_dir / f"{dataset_file.name}.log"
            if out_json.exists() and out_log.exists():
                continue
            tasks.append(
                (sample_id, dataset_file, out_json, out_log, data, dataset_file.stem)
            )
    return tasks


def main() -> None:
    from transformers import AutoTokenizer
    from vllm import LLM, SamplingParams

    parser = argparse.ArgumentParser()
    parser.add_argument("--root", default=".")
    parser.add_argument("--model-path", default="model/deepseek-coder-6.7b-instruct")
    parser.add_argument("--n", type=int, default=10)
    parser.add_argument("--batch-size", type=int, default=512)
    parser.add_argument("--prompt-variant", choices=["plain", "minimal", "emphatic", "fewshot"],
                        default="plain")
    parser.add_argument("--result-tag", required=True)
    parser.add_argument("--limit-tasks", type=int, default=0,
                        help="only run the first N (fault, sample) pairs; 0 = all")
    parser.add_argument("--num-shards", type=int, default=1)
    parser.add_argument("--shard-index", type=int, default=0)
    parser.add_argument("--max-retries", type=int, default=5)
    parser.add_argument("--gpu-memory-utilization", type=float, default=0.85)
    parser.add_argument("--max-model-len", type=int, default=4096)
    parser.add_argument("--tensor-parallel-size", type=int, default=1)
    parser.add_argument("--dump-prompts", action="store_true",
                        help="also write <fault>.prompt next to each result")
    args = parser.parse_args()

    root = Path(args.root).resolve()
    os.chdir(root)
    os.environ.setdefault("HF_HUB_OFFLINE", "1")
    os.environ.setdefault("TRANSFORMERS_OFFLINE", "1")
    os.environ.setdefault("HF_DATASETS_OFFLINE", "1")
    os.environ.setdefault("VLLM_USE_V1", "0")
    os.environ.setdefault("VLLM_ALLOW_LONG_MAX_MODEL_LEN", "1")

    if not (root / args.model_path).exists() and not Path(args.model_path).exists():
        raise SystemExit(f"model path not found: {args.model_path}")

    tokenizer = AutoTokenizer.from_pretrained(
        args.model_path, trust_remote_code=True, local_files_only=True
    )
    llm = LLM(
        model=args.model_path,
        gpu_memory_utilization=args.gpu_memory_utilization,
        trust_remote_code=True,
        max_model_len=args.max_model_len,
        enforce_eager=True,
        disable_custom_all_reduce=True,
        disable_log_stats=True,
        tensor_parallel_size=args.tensor_parallel_size,
    )
    sampling_params = SamplingParams(
        temperature=1.0,
        top_p=0.9,
        top_k=50,
        max_tokens=1024,
        repetition_penalty=1.1,
        stop=[tokenizer.eos_token] if tokenizer.eos_token else None,
    )

    if args.num_shards < 1:
        raise ValueError("--num-shards must be >= 1")
    if not 0 <= args.shard_index < args.num_shards:
        raise ValueError("--shard-index must satisfy 0 <= shard-index < num-shards")

    tasks = iter_missing_tasks(root, args.result_tag, args.n)
    if args.num_shards > 1:
        tasks = [t for i, t in enumerate(tasks) if i % args.num_shards == args.shard_index]
    if args.limit_tasks > 0:
        tasks = tasks[: args.limit_tasks]

    print(
        f"[E5] tag={args.result_tag} variant={args.prompt_variant} "
        f"missing_pairs={len(tasks)} n={args.n} batch={args.batch_size}",
        flush=True,
    )

    idx = 0
    while idx < len(tasks):
        batch = tasks[idx : idx + args.batch_size]
        pending = [(t, make_prompt(t[4], args.prompt_variant)) for t in batch]
        done = []
        for retry in range(1, args.max_retries + 1):
            if not pending:
                break
            outputs = llm.generate([p for _, p in pending], sampling_params)
            retry_pending = []
            for (task, prompt), output in zip(pending, outputs):
                full_text = prompt + output.outputs[0].text
                try:
                    fix = extract_first_java_code(full_text.split(DEEPSEEK_EOF)[-1])
                except Exception:
                    fix = ""
                if fix:
                    done.append((task, prompt, full_text, fix))
                elif retry < args.max_retries:
                    retry_pending.append((task, prompt))
                else:
                    print(f"[WARN] no code after retries: {task[5]} fixed{task[0]}", flush=True)
            pending = retry_pending

        for task, prompt, full_text, fix in done:
            _, _, out_json, out_log, data, _ = task
            out_log.write_text(full_text, encoding="utf-8")
            if args.dump_prompts:
                (out_json.parent / (out_json.name + ".prompt")).write_text(
                    prompt, encoding="utf-8"
                )
            result = dict(data)
            result["fix"] = fix
            out_json.write_text(json.dumps(result, indent=2, ensure_ascii=False), encoding="utf-8")
        idx += args.batch_size
        print(f"[E5] saved through {idx}/{len(tasks)}", flush=True)


if __name__ == "__main__":
    main()
