#!/usr/bin/env python3
"""Batch HumanEval-Java patch generation with the standard PAFT prompt."""

from __future__ import annotations

import argparse
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
    "qwen2.5coder7b": "/home/barty/.cache/huggingface/hub/models--Qwen--Qwen2.5-Coder-7B-Instruct/snapshots/c03e6d358207e414f1eca0bb1891e29f1db0e242",
    "qwen2.5coder7b-paft": "/home/barty/research/prorepair/merged_models/qwen2.5coder7b-paft",
    "qwen2.5coder7b-sft-tse-20260619": "/home/barty/research/prorepair/merged_models/qwen2.5coder7b-sft-tse-20260619",
    "qwen2.5coder7b-sft-assistonly-tse-20260619": "/home/barty/research/prorepair/merged_models/qwen2.5coder7b-sft-assistonly-tse-20260619",
    "qwen2.5coder14b": "/home/barty/.cache/huggingface/hub/models--Qwen--Qwen2.5-Coder-14B-Instruct/snapshots/aedcc2d42b622764e023cf882b6652e646b95671",
    "qwen2.5coder14b-sft-v2opt-assistonly-lr5e5-e1-20260619": "/home/barty/research/prorepair/merged_models/qwen2.5coder14b-sft-v2opt-assistonly-lr5e5-e1-20260619",
    "qwen2.5coder14b-paft-v2opt-assistonly-w125-lr5e5-e1-20260619": "/home/barty/research/prorepair/merged_models/qwen2.5coder14b-paft-v2opt-assistonly-w125-lr5e5-e1-20260619",
    "qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620": "/home/barty/.cache/huggingface/hub/models--Qwen--Qwen2.5-Coder-14B-Instruct/snapshots/aedcc2d42b622764e023cf882b6652e646b95671",
    "qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620": "/home/barty/.cache/huggingface/hub/models--Qwen--Qwen2.5-Coder-14B-Instruct/snapshots/aedcc2d42b622764e023cf882b6652e646b95671",
    "qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620": "/home/barty/.cache/huggingface/hub/models--Qwen--Qwen2.5-Coder-14B-Instruct/snapshots/aedcc2d42b622764e023cf882b6652e646b95671",
}

LORA_ADAPTER_PATHS = {
    "qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620": "/home/barty/research/morepair/models/qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620",
    "qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620": "/home/barty/research/morepair/models/qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620",
    "qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620": "/home/barty/research/morepair/models/qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620",
}


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


def make_prompt(code: str, filename: str, bof: str, eof: str) -> str:
    return (
        bof
        + f"This is an incorrect Java code ({filename}):\n"
        + f"```java\n{code}\n```\n"
        + "You are a software engineer.\n"
        + "Can you repair the incorrect Java code?\n"
        + eof
        + "\n```java\n"
    )


def iter_missing_tasks(root: Path, output_key: str, n: int) -> list[tuple[int, Path, Path, Path, str, str]]:
    origin_dir = root / "evalrepair-java" / "origin"
    result_root = root / "evalrepair-java-res" / output_key
    tasks: list[tuple[int, Path, Path, Path, str, str]] = []
    for source_file in sorted(origin_dir.glob("*.java"), reverse=True):
        code = source_file.read_text(encoding="utf-8")
        for sample_id in range(n):
            fixed_dir = result_root / f"fixed{sample_id}"
            fixed_dir.mkdir(parents=True, exist_ok=True)
            out_java = fixed_dir / source_file.name
            out_log = fixed_dir / f"{source_file.name}.log"
            if out_java.exists() and out_log.exists():
                continue
            tasks.append((sample_id, source_file, out_java, out_log, code, source_file.name))
    return tasks


def save_result(out_java: Path, out_log: Path, full_text: str, fix: str) -> None:
    out_java.write_text(fix, encoding="utf-8")
    out_log.write_text(full_text, encoding="utf-8")


def configure_environment() -> None:
    os.environ.setdefault("HF_HUB_OFFLINE", "1")
    os.environ.setdefault("TRANSFORMERS_OFFLINE", "1")
    os.environ.setdefault("HF_DATASETS_OFFLINE", "1")
    os.environ.setdefault("VLLM_USE_V1", "0")
    os.environ.setdefault("VLLM_ALLOW_LONG_MAX_MODEL_LEN", "1")
    os.environ.setdefault("VLLM_DO_NOT_TRACK", "1")


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("--root", default="/home/barty/GLEAM-Lab/PAFT")
    parser.add_argument("--model", required=True, choices=sorted(MODEL_PATHS))
    parser.add_argument("--output-key", help="Result directory name under evalrepair-java-res; defaults to --model.")
    parser.add_argument("--n", type=int, default=10)
    parser.add_argument("--batch-size", type=int, default=16)
    parser.add_argument("--max-retries", type=int, default=5)
    parser.add_argument("--gpu-memory-utilization", type=float, default=0.9)
    parser.add_argument("--temperature", type=float, default=1.0)
    parser.add_argument("--top-p", type=float, default=0.9)
    parser.add_argument("--top-k", type=int, default=50)
    parser.add_argument("--max-tokens", type=int, default=512)
    parser.add_argument("--repetition-penalty", type=float, default=1.1)
    parser.add_argument("--seed", type=int)
    parser.add_argument("--limit-tasks", type=int, default=0)
    args = parser.parse_args()

    configure_environment()
    root = Path(args.root)
    model_path = MODEL_PATHS[args.model]
    lora_path = LORA_ADAPTER_PATHS.get(args.model, "")
    output_key = args.output_key or args.model
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
        "tensor_parallel_size": 1,
    }
    if lora_path:
        llm_kwargs.update({"enable_lora": True, "max_lora_rank": 32})
    llm = LLM(**llm_kwargs)
    lora_request = LoRARequest(args.model, 1, lora_path=lora_path) if lora_path else None
    sampling_params = SamplingParams(
        temperature=args.temperature,
        top_p=args.top_p,
        top_k=args.top_k,
        max_tokens=args.max_tokens,
        repetition_penalty=args.repetition_penalty,
        seed=args.seed,
        stop=[tokenizer.eos_token] if tokenizer.eos_token else None,
    )

    tasks = iter_missing_tasks(root, output_key, args.n)
    if args.limit_tasks > 0:
        tasks = tasks[: args.limit_tasks]
    print(f"[INFO] Missing generations: {len(tasks)}", flush=True)
    idx = 0
    while idx < len(tasks):
        batch = tasks[idx : idx + args.batch_size]
        pending = [(task, make_prompt(task[4], task[5], bof, eof)) for task in batch]
        done: list[tuple[tuple[int, Path, Path, Path, str, str], str, str]] = []

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
                    print(f"[WARN] failed to extract code after retries: {task[5]} fixed{task[0]}", flush=True)
            pending = retry_pending

        for task, full_text, fix in done:
            _, _, out_java, out_log, _, _ = task
            save_result(out_java, out_log, full_text, fix)
        idx += args.batch_size
        print(f"[INFO] Saved through {idx}/{len(tasks)}", flush=True)


if __name__ == "__main__":
    main()
