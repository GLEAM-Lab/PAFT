#!/usr/bin/env python3
"""Generate Multi-SWE Java smoke patches from prepared oracle-file contexts."""

from __future__ import annotations

import argparse
import json
import os
import re
from pathlib import Path

from transformers import AutoTokenizer
from vllm import LLM, SamplingParams
from vllm.lora.request import LoRARequest


QWEN_BOF = (
    "<|im_start|>system\n"
    "You are Qwen, created by Alibaba Cloud. You are a helpful assistant."
    "<|im_end|>\n<|im_start|>user\n"
)
QWEN_EOF = "<|im_end|>\n<|im_start|>assistant\n"
DEEPSEEK_BOF = (
    "You are an AI programming assistant, utilizing the DeepSeek Coder model, "
    "developed by DeepSeek Company, and you only answer questions related to "
    "computer science.\n### Instruction:\n"
)
DEEPSEEK_EOF = "\n### Response:\n"


def prompt_tokens(model_family: str) -> tuple[str, str]:
    if model_family == "qwen":
        return QWEN_BOF, QWEN_EOF
    return DEEPSEEK_BOF, DEEPSEEK_EOF


def build_prompt(record: dict, model_family: str) -> str:
    bof, eof = prompt_tokens(model_family)
    return bof + record["prompt"] + "\n" + eof


def extract_unified_diff(text: str) -> str:
    match = re.search(r"```(?:diff|patch)?\s*(diff --git .*?)```", text, re.DOTALL)
    if match:
        return match.group(1).strip()
    idx = text.find("diff --git ")
    if idx >= 0:
        diff = text[idx:]
        diff = re.split(r"```|<\|im_end\|>|</s>", diff, maxsplit=1)[0]
        return diff.strip()
    return ""


def load_records(path: Path, limit: int) -> list[dict]:
    records = [json.loads(line) for line in path.read_text(encoding="utf-8").splitlines() if line.strip()]
    return records[:limit] if limit > 0 else records


def write_predictions(records: list[dict], raw_dir: Path, predictions_path: Path, num_generations: int) -> None:
    predictions_path.parent.mkdir(parents=True, exist_ok=True)
    with predictions_path.open("w", encoding="utf-8") as handle:
        for record in records:
            org, repo_name = str(record["repo"]).split("/", 1)
            for gen_idx in range(num_generations):
                raw_path = raw_dir / f"{record['instance_id']}__fixed{gen_idx}.json"
                if not raw_path.exists():
                    continue
                data = json.loads(raw_path.read_text(encoding="utf-8"))
                item = {
                    "org": org,
                    "repo": repo_name,
                    "number": int(record["pull_number"]),
                    "instance_id": record["instance_id"],
                    "generation": gen_idx,
                    "fix_patch": data.get("fix_patch", ""),
                }
                handle.write(json.dumps(item, ensure_ascii=False) + "\n")


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("--contexts", required=True)
    parser.add_argument("--model-path", required=True)
    parser.add_argument("--adapter-path", default="")
    parser.add_argument("--result-tag", required=True)
    parser.add_argument("--output-root", default="analysis_outputs/multiswe_java_smoke10_generations")
    parser.add_argument("--model-family", choices=["qwen", "deepseek"], default="qwen")
    parser.add_argument("--num-generations", type=int, default=1)
    parser.add_argument("--limit", type=int, default=0)
    parser.add_argument("--batch-size", type=int, default=2)
    parser.add_argument("--max-model-len", type=int, default=8192)
    parser.add_argument("--max-num-seqs", type=int, default=2)
    parser.add_argument("--max-num-batched-tokens", type=int, default=16384)
    parser.add_argument("--gpu-memory-utilization", type=float, default=0.82)
    parser.add_argument("--max-tokens", type=int, default=2048)
    parser.add_argument("--temperature", type=float, default=0.2)
    parser.add_argument("--top-p", type=float, default=0.95)
    parser.add_argument("--seed", type=int, default=7401)
    args = parser.parse_args()

    os.environ.setdefault("HF_HUB_OFFLINE", "1")
    os.environ.setdefault("TRANSFORMERS_OFFLINE", "1")
    os.environ.setdefault("HF_DATASETS_OFFLINE", "1")
    os.environ.setdefault("VLLM_USE_V1", "0")
    os.environ.setdefault("VLLM_ALLOW_LONG_MAX_MODEL_LEN", "1")

    records = load_records(Path(args.contexts), args.limit)
    output_dir = Path(args.output_root) / args.result_tag
    raw_dir = output_dir / "raw"
    raw_dir.mkdir(parents=True, exist_ok=True)
    predictions_path = output_dir / "predictions.jsonl"

    tasks: list[tuple[dict, int, str]] = []
    for record in records:
        prompt = build_prompt(record, args.model_family)
        for gen_idx in range(args.num_generations):
            raw_path = raw_dir / f"{record['instance_id']}__fixed{gen_idx}.json"
            if raw_path.exists():
                continue
            tasks.append((record, gen_idx, prompt))
    print(f"records={len(records)} pending={len(tasks)}")
    if not tasks:
        write_predictions(records, raw_dir, predictions_path, args.num_generations)
        print(f"wrote {predictions_path}")
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
        "max_num_seqs": args.max_num_seqs,
        "max_num_batched_tokens": args.max_num_batched_tokens,
    }
    lora_request = None
    if args.adapter_path:
        llm_kwargs.update({"enable_lora": True, "max_lora_rank": 32})
        lora_request = LoRARequest(args.result_tag, 1, lora_path=args.adapter_path)
    llm = LLM(**llm_kwargs)
    sampling = SamplingParams(
        temperature=args.temperature,
        top_p=args.top_p,
        max_tokens=args.max_tokens,
        stop=stop,
        seed=args.seed,
    )

    completed = 0
    for start in range(0, len(tasks), args.batch_size):
        batch = tasks[start : start + args.batch_size]
        outputs = llm.generate([task[2] for task in batch], sampling, lora_request=lora_request)
        for (record, gen_idx, prompt), output in zip(batch, outputs):
            response = output.outputs[0].text
            fix_patch = extract_unified_diff(response)
            raw_path = raw_dir / f"{record['instance_id']}__fixed{gen_idx}.json"
            raw_path.write_text(
                json.dumps(
                    {
                        "instance_id": record["instance_id"],
                        "repo": record["repo"],
                        "pull_number": record["pull_number"],
                        "generation": gen_idx,
                        "prompt_chars": len(prompt),
                        "response": response,
                        "fix_patch": fix_patch,
                    },
                    ensure_ascii=False,
                )
                + "\n",
                encoding="utf-8",
            )
            completed += 1
            print(f"{record['instance_id']} fixed{gen_idx} patch_chars={len(fix_patch)}")
        write_predictions(records, raw_dir, predictions_path, args.num_generations)
        print(f"saved={completed}/{len(tasks)}")

    print(f"wrote {predictions_path}")


if __name__ == "__main__":
    main()
