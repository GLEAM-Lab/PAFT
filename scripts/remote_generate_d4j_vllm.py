#!/usr/bin/env python3
"""Remote Defects4J generation with vLLM and optional LoRA adapters."""

from __future__ import annotations

import argparse
import json
import os
import re
from pathlib import Path

from transformers import AutoTokenizer
from vllm import LLM, SamplingParams
from vllm.lora.request import LoRARequest


DEEPSEEK_BOF = (
    "You are an AI programming assistant, utilizing the DeepSeek Coder model, "
    "developed by DeepSeek Company, and you only answer questions related to "
    "computer science. For politically sensitive questions, security and "
    "privacy issues, and other non-computer science questions, you will refuse "
    "to answer.\n### Instruction:\n"
)
DEEPSEEK_EOF = "\n### Response:\n"
QWEN_BOF = (
    "<|im_start|>system\n"
    "You are Qwen, created by Alibaba Cloud. You are a helpful assistant."
    "<|im_end|>\n<|im_start|>user\n"
)
QWEN_EOF = "<|im_end|>\n<|im_start|>assistant\n"
OPENCODER_BOF = (
    "<|im_start|>system\n"
    "You are OpenCoder, created by OpenCoder Team."
    "<|im_end|>\n<|im_start|>user\n"
)
OPENCODER_EOF = QWEN_EOF


def sort_by_project_and_id(path: Path) -> tuple[str, int]:
    parts = path.stem.split("-")
    if len(parts) >= 2:
        try:
            return parts[0], int(parts[1])
        except ValueError:
            pass
    return path.stem, 0


def infer_model_family(model_path: str, adapter_path: str, result_tag: str) -> str:
    marker = " ".join([model_path, adapter_path, result_tag]).lower()
    if "qwen" in marker:
        return "qwen"
    if "opencoder" in marker:
        return "opencoder"
    return "deepseek"


def prompt_tokens(model_family: str) -> tuple[str, str]:
    if model_family == "qwen":
        return QWEN_BOF, QWEN_EOF
    if model_family == "opencoder":
        return OPENCODER_BOF, OPENCODER_EOF
    return DEEPSEEK_BOF, DEEPSEEK_EOF


def build_prompt(item: dict, prompt_style: str, model_family: str) -> tuple[str, str]:
    title = item.get("issue_title", "")
    description = item.get("issue_description", "")
    filename = item.get("loc", "")
    buggy = item["buggy"]
    if prompt_style == "train_explain":
        code_intro = "This is an incorrect code ("
        repair_request = "You are a software engineer. Can you repair the incorrect code with an explaination?"
    elif prompt_style == "java_plain":
        code_intro = "This is an incorrect Java code ("
        repair_request = "You are a software engineer. Can you repair the incorrect Java code?"
    elif prompt_style == "plain":
        code_intro = "This is an incorrect code ("
        repair_request = "You are a software engineer. Can you repair the incorrect code?"
    else:
        code_intro = "This is an incorrect Java code ("
        repair_request = "You are a software engineer. Can you repair the incorrect Java code with the minimal change ?"
    bof, eof = prompt_tokens(model_family)
    prompt = (
        bof
        + "\n# "
        + title
        + "\n"
        + description
        + "\n"
        + code_intro
        + filename
        + "):\n```java\n"
        + buggy
        + "\n```\n"
        + repair_request
        + "\n"
        + eof
        + "\n```java\n"
    )
    return prompt, eof


def extract_first_java_code_historical(text: str) -> str:
    matches = re.findall(r"```java(.*?)```", text, re.DOTALL)
    return matches[0].strip() if matches else ""


def extract_first_java_code_tolerant(text: str) -> str:
    match = re.search(r"```java\s*(.*?)(?:```|<\|EOT\|>|<\|im_end\|>|</s>|$)", text, re.DOTALL)
    if match:
        code = match.group(1)
    else:
        # The prompt may already have opened the Java fence; in that case the
        # model often emits raw Java followed by the closing fence.
        code = re.split(r"```|<\|EOT\|>|<\|im_end\|>|</s>", text, maxsplit=1)[0]
        if not re.search(
            r"^\s*(?:@\w+|public|private|protected|static|final|class|interface|enum|if|for|while|try|return|[A-Za-z_$][\w$<>\\[\\], ?]*\s+[A-Za-z_$][\w$]*\s*\()",
            code,
        ):
            return ""
    code = re.split(r"<\|EOT\|>|<\|im_end\|>|</s>", code, maxsplit=1)[0]
    return "".join(ch for ch in code if ch in "\n\r\t" or ord(ch) >= 32).strip()


def extract_code(text: str, extract_profile: str) -> str:
    if extract_profile == "historical_strict":
        return extract_first_java_code_historical(text)
    return extract_first_java_code_tolerant(text)


def load_existing_fix(path: Path) -> str:
    try:
        data = json.loads(path.read_text(encoding="utf-8"))
    except Exception:
        return ""
    fix = data.get("fix", "")
    return fix if isinstance(fix, str) else ""


def iter_files(dataset: Path, max_files: int) -> list[Path]:
    files = sorted(dataset.glob("*.json"), key=sort_by_project_and_id)
    return files[:max_files] if max_files > 0 else files


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("--model-path", required=True)
    parser.add_argument("--adapter-path", default="")
    parser.add_argument("--result-tag", required=True)
    parser.add_argument("--dataset", default="defects4j/dataset")
    parser.add_argument("--output-root", default="defects4j/results")
    parser.add_argument("--model-family", choices=["auto", "deepseek", "qwen", "opencoder"], default="auto")
    parser.add_argument("--prompt-style", choices=["minimal", "plain", "java_plain", "train_explain"], default="java_plain")
    parser.add_argument("--extract-profile", choices=["tolerant", "historical_strict"], default="historical_strict")
    parser.add_argument("--num-generations", type=int, default=1)
    parser.add_argument("--max-files", type=int, default=0)
    parser.add_argument("--batch-size", type=int, default=8)
    parser.add_argument("--attempts", type=int, default=5)
    parser.add_argument("--gpu-memory-utilization", type=float, default=0.9)
    parser.add_argument("--max-model-len", type=int, default=4096)
    parser.add_argument("--max-num-seqs", type=int, default=8)
    parser.add_argument("--max-num-batched-tokens", type=int, default=2048)
    parser.add_argument("--cpu-offload-gb", type=float, default=0.0)
    parser.add_argument("--max-tokens", type=int, default=1024)
    parser.add_argument("--temperature", type=float, default=1.0)
    parser.add_argument("--top-p", type=float, default=0.9)
    parser.add_argument("--top-k", type=int, default=50)
    parser.add_argument("--repetition-penalty", type=float, default=1.1)
    parser.add_argument("--tensor-parallel-size", type=int, default=1)
    parser.add_argument("--seed", type=int)
    args = parser.parse_args()

    os.environ.setdefault("HF_HUB_OFFLINE", "1")
    os.environ.setdefault("TRANSFORMERS_OFFLINE", "1")
    os.environ.setdefault("HF_DATASETS_OFFLINE", "1")
    os.environ.setdefault("VLLM_USE_V1", "0")
    os.environ.setdefault("VLLM_ALLOW_LONG_MAX_MODEL_LEN", "1")

    dataset = Path(args.dataset)
    output_base = Path(args.output_root) / args.result_tag
    model_family = (
        infer_model_family(args.model_path, args.adapter_path, args.result_tag)
        if args.model_family == "auto"
        else args.model_family
    )
    print(f"model_family={model_family}", flush=True)

    files = iter_files(dataset, args.max_files)
    print(f"files={len(files)} num_generations={args.num_generations}", flush=True)
    prompts: list[tuple[Path, int, str, str, dict]] = []
    for file_path in files:
        item = json.loads(file_path.read_text(encoding="utf-8"))
        prompt, eof = build_prompt(item, args.prompt_style, model_family)
        for gen_idx in range(args.num_generations):
            out_dir = output_base / f"fixed{gen_idx}"
            out_dir.mkdir(parents=True, exist_ok=True)
            out_path = out_dir / file_path.name
            log_path = Path(str(out_path) + ".log")
            if out_path.exists() and load_existing_fix(out_path).strip() and log_path.exists():
                continue
            prompts.append((file_path, gen_idx, prompt, eof, item))

    print(f"pending={len(prompts)}", flush=True)
    if not prompts:
        print("nothing to generate; skip model load", flush=True)
        return

    tokenizer = AutoTokenizer.from_pretrained(args.model_path, trust_remote_code=True, local_files_only=True)
    stop = [tokenizer.eos_token] if tokenizer.eos_token else None
    llm_kwargs = {
        "model": args.model_path,
        "trust_remote_code": True,
        "gpu_memory_utilization": args.gpu_memory_utilization,
        "max_model_len": args.max_model_len,
        "enforce_eager": True,
        "disable_custom_all_reduce": True,
        "disable_log_stats": True,
        "tensor_parallel_size": args.tensor_parallel_size,
        "max_num_seqs": args.max_num_seqs,
        "max_num_batched_tokens": args.max_num_batched_tokens,
    }
    if args.cpu_offload_gb > 0:
        llm_kwargs["cpu_offload_gb"] = args.cpu_offload_gb
    lora_request = None
    if args.adapter_path:
        llm_kwargs.update({"enable_lora": True, "max_lora_rank": 32})
        lora_request = LoRARequest(args.result_tag, 1, lora_path=args.adapter_path)
    llm = LLM(**llm_kwargs)
    sampling_params = SamplingParams(
        temperature=args.temperature,
        top_p=args.top_p,
        top_k=args.top_k,
        max_tokens=args.max_tokens,
        repetition_penalty=args.repetition_penalty,
        stop=stop,
        seed=args.seed,
    )

    completed = 0
    for start in range(0, len(prompts), args.batch_size):
        batch = prompts[start : start + args.batch_size]
        pending = batch
        saved: list[tuple[Path, int, str, dict, str]] = []
        last_text: dict[tuple[str, int], str] = {}
        for attempt in range(1, args.attempts + 1):
            if not pending:
                break
            outputs = llm.generate([task[2] for task in pending], sampling_params, lora_request=lora_request)
            retry: list[tuple[Path, int, str, str, dict]] = []
            for task, output in zip(pending, outputs):
                file_path, gen_idx, prompt, eof, item = task
                response = output.outputs[0].text
                full_text = prompt + response
                code = extract_code(full_text.split(eof)[-1], args.extract_profile)
                last_text[(file_path.name, gen_idx)] = full_text
                if code.strip():
                    saved.append((file_path, gen_idx, full_text, item, code))
                elif attempt < args.attempts:
                    retry.append(task)
                else:
                    print(
                        f"{args.result_tag} fixed{gen_idx} {file_path.name} empty_fix_skipped",
                        flush=True,
                    )
                    out_dir = output_base / f"fixed{gen_idx}"
                    log_path = out_dir / f"{file_path.name}.log"
                    log_path.write_text(full_text, encoding="utf-8")
            pending = retry

        for file_path, gen_idx, full_text, item, code in saved:
            out_dir = output_base / f"fixed{gen_idx}"
            out_path = out_dir / file_path.name
            log_path = Path(str(out_path) + ".log")
            log_path.write_text(full_text, encoding="utf-8")
            result = dict(item)
            result["fix"] = code
            out_path.write_text(json.dumps(result, indent=2, ensure_ascii=False), encoding="utf-8")
            completed += 1
            print(
                f"{args.result_tag} fixed{gen_idx} {file_path.name} code_len={len(code)}",
                flush=True,
            )
        print(f"saved={completed}/{len(prompts)}", flush=True)


if __name__ == "__main__":
    main()
