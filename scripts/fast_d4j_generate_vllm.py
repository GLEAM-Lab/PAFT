#!/usr/bin/env python3
"""Batch Defects4J patch generation with the same prompt/sampling as prorepair/d4j.py."""

from __future__ import annotations

import argparse
import json
import os
from pathlib import Path
import re

from transformers import AutoTokenizer
from vllm import LLM, SamplingParams
from vllm.lora.request import LoRARequest


PROMPT_FORMATS = {
    "qwen": (
        "<|im_start|>system\nYou are Qwen, created by Alibaba Cloud. You are a helpful assistant.<|im_end|>\n<|im_start|>user\n",
        "<|im_end|>\n<|im_start|>assistant\n",
    ),
    "opencoder": (
        "<|im_start|>system\nYou are OpenCoder, created by OpenCoder Team.<|im_end|>\n<|im_start|>user\n",
        "<|im_end|>\n<|im_start|>assistant\n",
    ),
    "deepseek": (
        "You are an AI programming assistant, utilizing the DeepSeek Coder model, developed by DeepSeek Company, and you only answer questions related to computer science. For politically sensitive questions, security and privacy issues, and other non-computer science questions, you will refuse to answer.\n### Instruction:\n",
        "\n### Response:\n",
    ),
}

MODEL_PATHS = {
    "deepseek-6.7b-trained-noprompt-lora": "/home/barty/.cache/huggingface/hub/models--deepseek-ai--deepseek-coder-6.7b-instruct/snapshots/e5d64addd26a6a1db0f9b863abf6ee3141936807",
    "deepseek-6.7b-trained-prorepair-lora": "/home/barty/.cache/huggingface/hub/models--deepseek-ai--deepseek-coder-6.7b-instruct/snapshots/e5d64addd26a6a1db0f9b863abf6ee3141936807",
    "deepseek-6.7b-trained-prorepair-w0-lora": "/home/barty/.cache/huggingface/hub/models--deepseek-ai--deepseek-coder-6.7b-instruct/snapshots/e5d64addd26a6a1db0f9b863abf6ee3141936807",
    "deepseek-6.7b-trained-prorepair-w2-lora": "/home/barty/.cache/huggingface/hub/models--deepseek-ai--deepseek-coder-6.7b-instruct/snapshots/e5d64addd26a6a1db0f9b863abf6ee3141936807",
    "deepseek-6.7b-trained-prorepair-w4-lora": "/home/barty/.cache/huggingface/hub/models--deepseek-ai--deepseek-coder-6.7b-instruct/snapshots/e5d64addd26a6a1db0f9b863abf6ee3141936807",
    "opencoder8b": "/home/barty/.cache/huggingface/hub/models--infly--OpenCoder-8B-Instruct/snapshots/01badbbf10c2dfd7e2a0b5f570065ef44548576c",
    "opencoder8b-base-v2prompt-20260620": "/home/barty/.cache/huggingface/hub/models--infly--OpenCoder-8B-Instruct/snapshots/01badbbf10c2dfd7e2a0b5f570065ef44548576c",
    "opencoder8b-sft": "/home/barty/.cache/huggingface/hub/models--infly--OpenCoder-8B-Instruct/snapshots/01badbbf10c2dfd7e2a0b5f570065ef44548576c",
    "opencoder8b-paft": "/home/barty/.cache/huggingface/hub/models--infly--OpenCoder-8B-Instruct/snapshots/01badbbf10c2dfd7e2a0b5f570065ef44548576c",
    "opencoder8b-sft-oldcfg-rerun-e3-lr2e4-20260620": "/home/barty/.cache/huggingface/hub/models--infly--OpenCoder-8B-Instruct/snapshots/01badbbf10c2dfd7e2a0b5f570065ef44548576c",
    "opencoder8b-paft-oldcfg-rerun-w2-e3-lr2e4-20260620": "/home/barty/.cache/huggingface/hub/models--infly--OpenCoder-8B-Instruct/snapshots/01badbbf10c2dfd7e2a0b5f570065ef44548576c",
    "opencoder8b-sft-v2opt-assistonly-neutral-lr5e5-e1-20260620": "/home/barty/.cache/huggingface/hub/models--infly--OpenCoder-8B-Instruct/snapshots/01badbbf10c2dfd7e2a0b5f570065ef44548576c",
    "opencoder8b-paft-v2opt-assistonly-w125-lr5e5-e1-20260620": "/home/barty/.cache/huggingface/hub/models--infly--OpenCoder-8B-Instruct/snapshots/01badbbf10c2dfd7e2a0b5f570065ef44548576c",
    "qwen2.5coder14b": "/home/barty/.cache/huggingface/hub/models--Qwen--Qwen2.5-Coder-14B-Instruct/snapshots/aedcc2d42b622764e023cf882b6652e646b95671",
    "qwen2.5coder14b-paft-tse-20260619-e1": "/home/barty/.cache/huggingface/hub/models--Qwen--Qwen2.5-Coder-14B-Instruct/snapshots/aedcc2d42b622764e023cf882b6652e646b95671",
    "qwen2.5coder14b-paft-v2opt-assistonly-w125-lr5e5-e1-20260619": "/home/barty/.cache/huggingface/hub/models--Qwen--Qwen2.5-Coder-14B-Instruct/snapshots/aedcc2d42b622764e023cf882b6652e646b95671",
    "qwen2.5coder14b-paft-alpha4-20260620": "/home/barty/.cache/huggingface/hub/models--Qwen--Qwen2.5-Coder-14B-Instruct/snapshots/aedcc2d42b622764e023cf882b6652e646b95671",
    "qwen2.5coder14b-paft-alpha8-20260620": "/home/barty/.cache/huggingface/hub/models--Qwen--Qwen2.5-Coder-14B-Instruct/snapshots/aedcc2d42b622764e023cf882b6652e646b95671",
    "qwen2.5coder14b-paft-alpha12-20260620": "/home/barty/.cache/huggingface/hub/models--Qwen--Qwen2.5-Coder-14B-Instruct/snapshots/aedcc2d42b622764e023cf882b6652e646b95671",
    "qwen2.5coder14b-paft-v2opt-assistonly-w110-lr5e5-e1-20260620": "/home/barty/.cache/huggingface/hub/models--Qwen--Qwen2.5-Coder-14B-Instruct/snapshots/aedcc2d42b622764e023cf882b6652e646b95671",
    "qwen2.5coder14b-paft-light-assistonly-w125-lr5e5-e03-20260620": "/home/barty/.cache/huggingface/hub/models--Qwen--Qwen2.5-Coder-14B-Instruct/snapshots/aedcc2d42b622764e023cf882b6652e646b95671",
    "qwen2.5coder14b-paft-light-assistonly-w125-lr5e5-e015-20260620": "/home/barty/.cache/huggingface/hub/models--Qwen--Qwen2.5-Coder-14B-Instruct/snapshots/aedcc2d42b622764e023cf882b6652e646b95671",
    "qwen2.5coder14b-sft-v2opt-assistonly-lr5e5-e1-20260619": "/home/barty/.cache/huggingface/hub/models--Qwen--Qwen2.5-Coder-14B-Instruct/snapshots/aedcc2d42b622764e023cf882b6652e646b95671",
    "deepseek-coder-v2-lite": "/home/barty/modelscope_models/DeepSeek-Coder-V2-Lite-Instruct",
    "deepseek-coder-v2-lite-tokfix": "/home/barty/modelscope_models/DeepSeek-Coder-V2-Lite-Instruct",
    "deepseek-coder-v2-lite-sft-v2opt-attnonly-lr5e5-e1-20260620": "/home/barty/modelscope_models/DeepSeek-Coder-V2-Lite-Instruct",
    "deepseek-coder-v2-lite-paft-v2opt-attnonly-w125-lr5e5-e1-20260620": "/home/barty/modelscope_models/DeepSeek-Coder-V2-Lite-Instruct",
    "qwen2.5coder7b-sft-tse-20260619": "/home/barty/.cache/huggingface/hub/models--Qwen--Qwen2.5-Coder-7B-Instruct/snapshots/c03e6d358207e414f1eca0bb1891e29f1db0e242",
    "qwen2.5coder7b-sft-assistonly-tse-20260619": "/home/barty/.cache/huggingface/hub/models--Qwen--Qwen2.5-Coder-7B-Instruct/snapshots/c03e6d358207e414f1eca0bb1891e29f1db0e242",
    "qwen2.5coder7b-paft-v2-assistonly-wnorm-20260619": "/home/barty/.cache/huggingface/hub/models--Qwen--Qwen2.5-Coder-7B-Instruct/snapshots/c03e6d358207e414f1eca0bb1891e29f1db0e242",
    "qwen2.5coder7b-paft-v2-assistonly-wnorm-w15-20260619": "/home/barty/.cache/huggingface/hub/models--Qwen--Qwen2.5-Coder-7B-Instruct/snapshots/c03e6d358207e414f1eca0bb1891e29f1db0e242",
    "qwen2.5coder7b-paft-v2-assistonly-wnorm-w125-20260619": "/home/barty/.cache/huggingface/hub/models--Qwen--Qwen2.5-Coder-7B-Instruct/snapshots/c03e6d358207e414f1eca0bb1891e29f1db0e242",
}

LORA_ADAPTER_PATHS = {
    "deepseek-6.7b-trained-noprompt-lora": "/home/barty/research/morepair/models/sft_deepseek7b_noprompt",
    "deepseek-6.7b-trained-prorepair-lora": "/home/barty/research/morepair/models/sft_deepseek7b_prorepair",
    "deepseek-6.7b-trained-prorepair-w0-lora": "/home/barty/research/morepair/models/sft_deepseek7b_prorepair_0.0",
    "deepseek-6.7b-trained-prorepair-w2-lora": "/home/barty/research/morepair/models/sft_deepseek7b_prorepair_2.0",
    "deepseek-6.7b-trained-prorepair-w4-lora": "/home/barty/research/morepair/models/sft_deepseek7b_prorepair_4.0",
    "deepseek-coder-v2-lite-sft-v2opt-attnonly-lr5e5-e1-20260620": "/home/barty/research/morepair/models/deepseek-v2-lite-sft-v2opt-attnonly-lr5e5-e1-20260620",
    "deepseek-coder-v2-lite-paft-v2opt-attnonly-w125-lr5e5-e1-20260620": "/home/barty/research/morepair/models/deepseek-v2-lite-paft-v2opt-attnonly-w125-lr5e5-e1-20260620",
    "opencoder8b-sft": "/home/barty/research/morepair/models/opencoder8b-sft",
    "opencoder8b-paft": "/home/barty/research/morepair/models/opencoder8b-paft",
    "opencoder8b-sft-oldcfg-rerun-e3-lr2e4-20260620": "/home/barty/research/morepair/models/opencoder8b-sft-oldcfg-rerun-e3-lr2e4-20260620",
    "opencoder8b-paft-oldcfg-rerun-w2-e3-lr2e4-20260620": "/home/barty/research/morepair/models/opencoder8b-paft-oldcfg-rerun-w2-e3-lr2e4-20260620",
    "opencoder8b-sft-v2opt-assistonly-neutral-lr5e5-e1-20260620": "/home/barty/research/morepair/models/opencoder8b-sft-v2opt-assistonly-neutral-lr5e5-e1-20260620",
    "opencoder8b-paft-v2opt-assistonly-w125-lr5e5-e1-20260620": "/home/barty/research/morepair/models/opencoder8b-paft-v2opt-assistonly-w125-lr5e5-e1-20260620",
    "qwen2.5coder14b-sft-v2opt-assistonly-lr5e5-e1-20260619": "/home/barty/research/morepair/models/qwen2.5coder14b-sft-v2opt-assistonly-lr5e5-e1-20260619",
    "qwen2.5coder14b-paft-tse-20260619-e1": "/home/barty/research/morepair/models/qwen2.5coder14b-paft-tse-20260619-e1",
    "qwen2.5coder14b-paft-v2opt-assistonly-w125-lr5e5-e1-20260619": "/home/barty/research/morepair/models/qwen2.5coder14b-paft-v2opt-assistonly-w125-lr5e5-e1-20260619",
    "qwen2.5coder14b-paft-v2opt-assistonly-w110-lr5e5-e1-20260620": "/home/barty/research/morepair/models/qwen2.5coder14b-paft-v2opt-assistonly-w110-lr5e5-e1-20260620",
    "qwen2.5coder14b-paft-light-assistonly-w125-lr5e5-e03-20260620": "/home/barty/research/morepair/models/qwen2.5coder14b-paft-light-assistonly-w125-lr5e5-e03-20260620",
    "qwen2.5coder14b-paft-light-assistonly-w125-lr5e5-e015-20260620": "/home/barty/research/morepair/models/qwen2.5coder14b-paft-light-assistonly-w125-lr5e5-e015-20260620",
    "qwen2.5coder14b-paft-alpha4-20260620": "/home/barty/research/morepair/models/qwen2.5coder14b-paft-v2opt-assistonly-w125-alpha4-20260620",
    "qwen2.5coder14b-paft-alpha8-20260620": "/home/barty/research/morepair/models/qwen2.5coder14b-paft-v2opt-assistonly-w125-alpha8-20260620",
    "qwen2.5coder14b-paft-alpha12-20260620": "/home/barty/research/morepair/models/qwen2.5coder14b-paft-v2opt-assistonly-w125-alpha12-20260620",
    "qwen2.5coder7b-sft-tse-20260619": "/home/barty/research/morepair/models/qwen2.5coder7b-sft-tse-20260619",
    "qwen2.5coder7b-sft-assistonly-tse-20260619": "/home/barty/research/morepair/models/qwen2.5coder7b-sft-assistonly-tse-20260619",
    "qwen2.5coder7b-paft-v2-assistonly-wnorm-20260619": "/home/barty/research/morepair/models/qwen2.5coder7b-paft-v2-assistonly-wnorm-20260619",
    "qwen2.5coder7b-paft-v2-assistonly-wnorm-w15-20260619": "/home/barty/research/morepair/models/qwen2.5coder7b-paft-v2-assistonly-wnorm-w15-20260619",
    "qwen2.5coder7b-paft-v2-assistonly-wnorm-w125-20260619": "/home/barty/research/morepair/models/qwen2.5coder7b-paft-v2-assistonly-wnorm-w125-20260619",
}


def sort_by_project_and_id(path: Path) -> tuple[str, int]:
    parts = path.stem.split("-")
    if len(parts) >= 2:
        try:
            return parts[0], int(parts[1])
        except ValueError:
            pass
    return path.stem, 0


def prompt_format(model_key: str) -> tuple[str, str]:
    for prefix, fmt in PROMPT_FORMATS.items():
        if model_key.startswith(prefix):
            return fmt
    return "[INST]", "[/INST]"


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


def make_prompt(data: dict, bof: str, eof: str) -> str:
    return (
        bof
        + "\n# "
        + data["issue_title"]
        + "\n"
        + data["issue_description"]
        + "\nThis is an incorrect Java code ("
        + data["loc"]
        + "):\n```java\n"
        + data["buggy"]
        + "\n```\nYou are a software engineer. Can you repair the incorrect Java code?\n"
        + eof
        + "\n```java\n"
    )


def iter_missing_tasks(root: Path, model_key: str, n: int) -> list[tuple[int, Path, Path, Path, dict, str]]:
    dataset_dir = root / "defects4j" / "dataset"
    result_root = root / "defects4j" / "results" / model_key
    tasks: list[tuple[int, Path, Path, Path, dict, str]] = []
    for dataset_file in sorted(dataset_dir.rglob("*.json"), key=sort_by_project_and_id):
        data = json.loads(dataset_file.read_text(encoding="utf-8"))
        for sample_id in range(n):
            fixed_dir = result_root / f"fixed{sample_id}"
            fixed_dir.mkdir(parents=True, exist_ok=True)
            out_json = fixed_dir / dataset_file.name
            out_log = fixed_dir / f"{dataset_file.name}.log"
            if out_json.exists() and out_log.exists():
                continue
            tasks.append((sample_id, dataset_file, out_json, out_log, data, dataset_file.stem))
    return tasks


def save_result(out_json: Path, out_log: Path, data: dict, full_text: str, fix: str) -> None:
    out_log.write_text(full_text, encoding="utf-8")
    result = dict(data)
    result["fix"] = fix
    out_json.write_text(json.dumps(result, indent=2, ensure_ascii=False), encoding="utf-8")


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("--root", default="/home/barty/research/prorepair")
    parser.add_argument("--model", required=True, choices=sorted(MODEL_PATHS))
    parser.add_argument("--n", type=int, default=10)
    parser.add_argument("--batch-size", type=int, default=16)
    parser.add_argument("--max-retries", type=int, default=5)
    parser.add_argument("--gpu-memory-utilization", type=float, default=0.9)
    parser.add_argument("--tensor-parallel-size", type=int, default=1)
    parser.add_argument("--num-shards", type=int, default=1)
    parser.add_argument("--shard-index", type=int, default=0)
    parser.add_argument("--limit-tasks", type=int, default=0)
    args = parser.parse_args()

    root = Path(args.root)
    os.chdir(root)
    os.environ.setdefault("HF_HUB_OFFLINE", "1")
    os.environ.setdefault("TRANSFORMERS_OFFLINE", "1")
    os.environ.setdefault("HF_DATASETS_OFFLINE", "1")
    os.environ.setdefault("VLLM_USE_V1", "0")
    os.environ.setdefault("VLLM_ALLOW_LONG_MAX_MODEL_LEN", "1")

    model_path = MODEL_PATHS[args.model]
    lora_path = LORA_ADAPTER_PATHS.get(args.model)
    bof, eof = prompt_format(args.model)
    tokenizer = AutoTokenizer.from_pretrained(model_path, trust_remote_code=True, local_files_only=True)
    llm_kwargs = {
        "model": model_path,
        "gpu_memory_utilization": args.gpu_memory_utilization,
        "trust_remote_code": True,
        "max_model_len": 4096,
        "enforce_eager": True,
        "disable_custom_all_reduce": True,
        "disable_log_stats": True,
        "tensor_parallel_size": args.tensor_parallel_size,
    }
    if lora_path:
        llm_kwargs.update({"enable_lora": True, "max_lora_rank": 32})
    llm = LLM(**llm_kwargs)
    lora_request = (
        LoRARequest(args.model, 1, lora_path=lora_path)
        if lora_path
        else None
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
    if args.shard_index < 0 or args.shard_index >= args.num_shards:
        raise ValueError("--shard-index must satisfy 0 <= shard-index < num-shards")

    tasks = iter_missing_tasks(root, args.model, args.n)
    if args.num_shards > 1:
        tasks = [task for task_index, task in enumerate(tasks) if task_index % args.num_shards == args.shard_index]
    if args.limit_tasks > 0:
        tasks = tasks[: args.limit_tasks]
    print(f"[INFO] Missing generations: {len(tasks)}")
    idx = 0
    while idx < len(tasks):
        batch = tasks[idx : idx + args.batch_size]
        pending = [(task, make_prompt(task[4], bof, eof)) for task in batch]
        done: list[tuple[tuple[int, Path, Path, Path, dict, str], str, str]] = []

        for retry in range(1, args.max_retries + 1):
            if not pending:
                break
            outputs = llm.generate(
                [prompt for _, prompt in pending],
                sampling_params,
                lora_request=lora_request,
            )
            retry_pending = []
            for (task, prompt), output in zip(pending, outputs):
                full_text = prompt + output.outputs[0].text
                try:
                    fix = extract_first_java_code(full_text.split(eof)[-1])
                except Exception:
                    fix = ""
                if fix:
                    done.append((task, full_text, fix))
                elif retry < args.max_retries:
                    retry_pending.append((task, prompt))
                else:
                    print(f"[WARN] failed to extract code after retries: {task[5]} fixed{task[0]}")
            pending = retry_pending

        for task, full_text, fix in done:
            _, _, out_json, out_log, data, _ = task
            save_result(out_json, out_log, data, full_text, fix)
        idx += args.batch_size
        print(f"[INFO] Saved through {idx}/{len(tasks)}")


if __name__ == "__main__":
    main()
