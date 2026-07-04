#!/usr/bin/env python3
"""Generate and evaluate HumanEvalPack Python repair candidates.

This is a lightweight cross-language sanity check: each task provides a buggy
function body, a canonical repaired body, and executable Python tests.
"""

from __future__ import annotations

import argparse
import difflib
import json
import math
import multiprocessing as mp
import os
import random
import re
import statistics
import traceback
from pathlib import Path
from typing import Any


MODEL_CONFIGS = {
    "deepseek-6.7b": "deepseek-ai/deepseek-coder-6.7b-instruct",
    "deepseek-6.7b-trained-noprompt": "deepseek-ai/deepseek-coder-6.7b-instruct",
    "deepseek-6.7b-trained-prorepair": "deepseek-ai/deepseek-coder-6.7b-instruct",
    "deepseek-6.7b-trained-prorepair-0.0": "deepseek-ai/deepseek-coder-6.7b-instruct",
    "deepseek-6.7b-trained-prorepair-2.0": "deepseek-ai/deepseek-coder-6.7b-instruct",
    "deepseek-6.7b-trained-prorepair-4.0": "deepseek-ai/deepseek-coder-6.7b-instruct",
    "deepseek-6.7b-trained-prorepair-2.0-assist-only": "/home/barty/research/prorepair/merged_models/sft_deepseek7b_prorepair_2.0_assist_only",
    "deepseek-6.7b-trained-prorepair-2.0-assist-onlyv1": "/home/barty/research/prorepair/merged_models/sft_deepseek7b_prorepair_2.0_assist_onlyv1",
    "deepseek-6.7b-trained-prorepair-2.0-fixed": "/home/barty/research/prorepair/merged_models/sft_deepseek7b_prorepair_2.0_fixed",
    "qwen3-8b": "Qwen/Qwen3-8b",
    "qwen8b-sft": "/home/barty/research/prorepair/merged_models/qwen8b-sft",
    "qwen8b-paft": "/home/barty/research/prorepair/merged_models/qwen8b-paft",
    "qwen-8b-trained-prorepair": "/home/barty/research/prorepair/merged_models/sft_qwen8b_parepair",
    "qwen2.5coder7b": "Qwen/Qwen2.5-Coder-7B-Instruct",
    "qwen2.5coder7b-paft": "/home/barty/research/prorepair/merged_models/qwen2.5coder7b-paft",
    "qwen2.5coder14b": "/home/barty/.cache/huggingface/hub/models--Qwen--Qwen2.5-Coder-14B-Instruct/snapshots/aedcc2d42b622764e023cf882b6652e646b95671",
    "qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620": "/home/barty/.cache/huggingface/hub/models--Qwen--Qwen2.5-Coder-14B-Instruct/snapshots/aedcc2d42b622764e023cf882b6652e646b95671",
    "qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620": "/home/barty/.cache/huggingface/hub/models--Qwen--Qwen2.5-Coder-14B-Instruct/snapshots/aedcc2d42b622764e023cf882b6652e646b95671",
    "qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620": "/home/barty/.cache/huggingface/hub/models--Qwen--Qwen2.5-Coder-14B-Instruct/snapshots/aedcc2d42b622764e023cf882b6652e646b95671",
    "opencoder8b": "infly/OpenCoder-8B-Instruct",
    "opencoder8b-sft": "/home/barty/research/prorepair/merged_models/opencoder8b-sft",
    "opencoder8b-paft": "/home/barty/research/prorepair/merged_models/opencoder8b-paft",
}

ADAPTER_CONFIGS = {
    "deepseek-6.7b-trained-noprompt": "/home/barty/research/morepair/models/sft_deepseek7b_noprompt",
    "deepseek-6.7b-trained-prorepair": "/home/barty/research/morepair/models/sft_deepseek7b_prorepair",
    "deepseek-6.7b-trained-prorepair-0.0": "/home/barty/research/morepair/models/sft_deepseek7b_prorepair_0.0",
    "deepseek-6.7b-trained-prorepair-2.0": "/home/barty/research/morepair/models/sft_deepseek7b_prorepair_2.0",
    "deepseek-6.7b-trained-prorepair-4.0": "/home/barty/research/morepair/models/sft_deepseek7b_prorepair_4.0",
    "qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620": "/home/barty/research/morepair/models/qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620",
    "qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620": "/home/barty/research/morepair/models/qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620",
    "qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620": "/home/barty/research/morepair/models/qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620",
}

# Keep the cross-language HumanEvalPack diagnostic reproducible by default.
DEFAULT_EVAL_SEED = 7202

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
OPENCODER_BOF = (
    "<|im_start|>system\n"
    "You are OpenCoder, created by OpenCoder Team."
    "<|im_end|>\n<|im_start|>user\n"
)
IM_EOF = "<|im_end|>\n<|im_start|>assistant\n"


def load_dataset_rows() -> list[dict[str, Any]]:
    from datasets import load_dataset

    ds = load_dataset("bigcode/humanevalpack", "python", split="test")
    return [dict(row) for row in ds]


def full_buggy(row: dict[str, Any]) -> str:
    return row["prompt"].rstrip() + "\n" + row["buggy_solution"].rstrip() + "\n"


def full_reference(row: dict[str, Any]) -> str:
    return row["prompt"].rstrip() + "\n" + row["canonical_solution"].rstrip() + "\n"


def prompt_style_for_model(model_id: str) -> str:
    model_id = model_id.lower()
    if "qwen" in model_id:
        return "qwen"
    if "opencoder" in model_id:
        return "opencoder"
    return "deepseek"


def build_prompt(row: dict[str, Any], minimal_change: bool = False, model_id: str = "") -> str:
    change_phrase = " with the minimal change" if minimal_change else ""
    code = full_buggy(row)
    user_prompt = (
        row["instruction"].strip()
        + "\n\nThis is an incorrect Python code:\n```python\n"
        + code
        + "```\n"
        + f"You are a software engineer. Can you repair the incorrect Python code{change_phrase}?\n"
    )
    style = prompt_style_for_model(model_id)
    if style == "qwen":
        return QWEN_BOF + user_prompt + IM_EOF + "```python\n"
    if style == "opencoder":
        return OPENCODER_BOF + user_prompt + IM_EOF + "```python\n"
    return (
        DEEPSEEK_BOF
        + user_prompt
        + DEEPSEEK_EOF
        + "```python\n"
    )


def decode_byte_level_artifacts(text: str) -> str:
    """Repair byte-level BPE mojibake sometimes returned by vLLM tokenizers."""
    if not text:
        return text
    if "Ä" in text or "Â" in text:
        try:
            text = text.encode("cp1252").decode("utf-8")
        except UnicodeError:
            pass
    return text.replace("Ġ", " ").replace("Ċ", "\n").replace("ĉ", "\t")


def extract_python_code(text: str) -> str:
    if not text:
        return ""
    text = decode_byte_level_artifacts(text)
    marker = "### Response:"
    if marker in text:
        text = text.split(marker)[-1]
    for pattern in (r"```python\s*(.*?)```", r"```py\s*(.*?)```", r"```\s*(.*?)```"):
        matches = re.findall(pattern, text, flags=re.DOTALL | re.IGNORECASE)
        if matches:
            return matches[0].strip()
    if "```" in text:
        text = text.split("```", 1)[0]
    return text.strip()


def normalize_candidate(row: dict[str, Any], generated: str) -> str:
    code = extract_python_code(generated)
    entry = row["entry_point"]
    if re.search(rf"(^|\n)\s*def\s+{re.escape(entry)}\s*\(", code):
        return code.rstrip() + "\n"

    # Treat output as a function body if the model emits only the repaired body.
    body = code.rstrip()
    if not body:
        return ""
    if not body.startswith((" ", "\t")):
        body = "\n".join(("    " + line if line.strip() else line) for line in body.splitlines())
    return row["prompt"].rstrip() + "\n" + body + "\n"


def _exec_candidate(candidate: str, test_setup: str, test: str, queue: mp.Queue) -> None:
    namespace: dict[str, Any] = {}
    try:
        exec(candidate + "\n" + (test_setup or "") + "\n" + test, namespace)
        queue.put({"passed": True, "error": ""})
    except BaseException:
        queue.put({"passed": False, "error": traceback.format_exc(limit=3)})


def run_tests(candidate: str, row: dict[str, Any], timeout: float) -> tuple[bool, str]:
    if not candidate.strip():
        return False, "empty candidate"
    ctx = mp.get_context("spawn")
    queue: mp.Queue = ctx.Queue()
    proc = ctx.Process(target=_exec_candidate, args=(candidate, row.get("test_setup", ""), row["test"], queue))
    proc.start()
    proc.join(timeout)
    if proc.is_alive():
        proc.kill()
        proc.join(1)
        return False, "timeout"
    if queue.empty():
        return False, f"no result; exitcode={proc.exitcode}"
    result = queue.get()
    return bool(result["passed"]), str(result.get("error", ""))


def levenshtein_distance(a: str, b: str) -> int:
    if len(a) < len(b):
        a, b = b, a
    if not b:
        return len(a)
    previous = list(range(len(b) + 1))
    for i, ca in enumerate(a, 1):
        current = [i]
        for j, cb in enumerate(b, 1):
            current.append(min(previous[j] + 1, current[-1] + 1, previous[j - 1] + (ca != cb)))
        previous = current
    return previous[-1]


def ccr(buggy: str, candidate: str) -> float:
    buggy_lines = [line.rstrip() for line in buggy.strip().splitlines() if line.strip()]
    cand_lines = [line.rstrip() for line in candidate.strip().splitlines() if line.strip()]
    if not cand_lines:
        return 0.0
    matcher = difflib.SequenceMatcher(None, buggy_lines, cand_lines, autojunk=False)
    preserved = sum(block.size for block in matcher.get_matching_blocks()[:-1])
    return preserved / len(cand_lines) * 100.0


def calc_pass_at_k(total: int, correct: int, k: int) -> float:
    if correct <= 0:
        return 0.0
    if total - correct < k:
        return 1.0
    return 1.0 - math.comb(total - correct, k) / math.comb(total, k)


def patch_transformers_config_registration() -> None:
    try:
        from transformers.models.auto import configuration_auto

        config_mapping = configuration_auto.CONFIG_MAPPING
        if getattr(config_mapping, "_paft_duplicate_register_patch", False):
            return

        original_register = config_mapping.register

        def safe_register(key, value, exist_ok=False):
            try:
                return original_register(key, value, exist_ok=exist_ok)
            except ValueError as exc:
                if "is already used by a Transformers config" in str(exc):
                    print(f"[INFO] skip duplicate Transformers config registration: {key}")
                    return None
                raise

        config_mapping.register = safe_register
        config_mapping._paft_duplicate_register_patch = True
    except Exception as exc:
        print(f"[WARNING] failed to patch Transformers config registration: {exc}")


def load_tokenizer(model_path: str):
    import json as json_lib
    from pathlib import Path as PathCls

    from transformers import AutoTokenizer, PreTrainedTokenizerFast

    path = PathCls(model_path)
    if path.exists() and path.is_dir():
        tokenizer_json = path / "tokenizer.json"
        tokenizer_config_path = path / "tokenizer_config.json"
        if tokenizer_json.exists() and tokenizer_config_path.exists():
            try:
                config = json_lib.loads(tokenizer_config_path.read_text(encoding="utf-8"))
                if config.get("tokenizer_class") == "LlamaTokenizerFast":
                    kwargs: dict[str, Any] = {
                        "tokenizer_file": str(tokenizer_json),
                        "clean_up_tokenization_spaces": config.get("clean_up_tokenization_spaces", False),
                        "model_max_length": config.get("model_max_length", int(1e30)),
                    }
                    for key in ("bos_token", "eos_token", "pad_token", "unk_token"):
                        value = config.get(key)
                        if isinstance(value, dict):
                            value = value.get("content")
                        if value is not None:
                            kwargs[key] = value
                    tokenizer = PreTrainedTokenizerFast(**kwargs)
                    if tokenizer.pad_token is None:
                        tokenizer.pad_token = tokenizer.eos_token
                    return tokenizer
            except Exception as exc:
                print(f"[WARNING] fast tokenizer fallback failed for {path}: {exc}")

    tokenizer = AutoTokenizer.from_pretrained(model_path, trust_remote_code=True, use_fast=True)
    if tokenizer.pad_token is None:
        tokenizer.pad_token = tokenizer.eos_token
    return tokenizer


def resolve_model_path(model_id_or_path: str) -> str:
    path = Path(model_id_or_path)
    if path.exists():
        return str(path)
    try:
        from huggingface_hub import snapshot_download

        return snapshot_download(model_id_or_path, local_files_only=True)
    except Exception:
        return model_id_or_path


def generate(args: argparse.Namespace) -> None:
    os.environ.setdefault("VLLM_USE_V1", "0")
    os.environ.setdefault("VLLM_WORKER_MULTIPROC_METHOD", "spawn")
    os.environ.setdefault("VLLM_ALLOW_LONG_MAX_MODEL_LEN", "1")
    os.environ.setdefault("CUDA_VISIBLE_DEVICES", str(args.gpu))
    if args.seed is not None:
        random.seed(args.seed)
        try:
            import numpy as np

            np.random.seed(args.seed)
        except Exception:
            pass
        try:
            import torch

            torch.manual_seed(args.seed)
            torch.cuda.manual_seed_all(args.seed)
        except Exception:
            pass

    rows = load_dataset_rows()
    if args.limit:
        rows = rows[: args.limit]
    model_path = resolve_model_path(MODEL_CONFIGS.get(args.model_id, args.model_id))
    adapter_path = ADAPTER_CONFIGS.get(args.model_id, "")
    if adapter_path and not Path(adapter_path, "adapter_config.json").exists():
        raise FileNotFoundError(f"missing adapter for {args.model_id}: {adapter_path}")
    out_dir = Path(args.out_dir) / args.model_id
    out_dir.mkdir(parents=True, exist_ok=True)
    out_file = out_dir / f"generations_n{args.n_samples}.jsonl"
    if args.overwrite and out_file.exists():
        out_file.unlink()

    done = set()
    if out_file.exists() and not args.overwrite:
        with out_file.open("r", encoding="utf-8") as fh:
            for line in fh:
                if line.strip():
                    done.add(json.loads(line)["task_id"])

    todo = [row for row in rows if row["task_id"] not in done]
    if not todo:
        print(f"[INFO] all generations already exist: {out_file}")
        return

    prompts = [build_prompt(row, minimal_change=args.minimal_change, model_id=args.model_id) for row in todo]
    print(f"[INFO] loading {args.model_id}: {model_path}")
    if adapter_path:
        print(f"[INFO] adapter: {adapter_path}")
    if args.backend == "transformers":
        generate_with_transformers_stream(args, model_path, adapter_path, todo, prompts, out_file)
        print(f"[INFO] wrote {len(todo)} tasks to {out_file}")
        return

    outputs_by_prompt = generate_with_vllm(args, model_path, adapter_path, prompts)

    with out_file.open("a", encoding="utf-8") as fh:
        for row, prompt, prompt_outputs in zip(todo, prompts, outputs_by_prompt):
            candidates = []
            for raw in prompt_outputs:
                candidates.append(
                    {
                        "raw": raw,
                        "candidate": normalize_candidate(row, raw),
                    }
                )
            fh.write(
                json.dumps(
                    {
                        "task_id": row["task_id"],
                        "entry_point": row["entry_point"],
                        "candidates": candidates,
                    },
                    ensure_ascii=False,
                )
                + "\n"
            )
            fh.flush()
    print(f"[INFO] wrote {len(todo)} tasks to {out_file}")


def generate_with_vllm(
    args: argparse.Namespace,
    model_path: str,
    adapter_path: str,
    prompts: list[str],
) -> list[list[str]]:
    patch_transformers_config_registration()

    from vllm import LLM, SamplingParams
    from vllm.lora.request import LoRARequest

    llm_kwargs = dict(
        model=model_path,
        trust_remote_code=True,
        tensor_parallel_size=1,
        dtype="bfloat16",
        gpu_memory_utilization=args.gpu_memory_utilization,
        max_model_len=4096,
        enforce_eager=True,
        disable_custom_all_reduce=True,
    )
    lora_request = None
    if adapter_path:
        llm_kwargs.update({"enable_lora": True, "max_lora_rank": 32})
        lora_request = LoRARequest(args.model_id, 1, lora_path=adapter_path)
    llm = LLM(**llm_kwargs)
    tokenizer = load_tokenizer(model_path)
    sampling = SamplingParams(
        n=args.n_samples,
        temperature=args.temperature,
        top_p=args.top_p,
        top_k=args.top_k,
        max_tokens=args.max_tokens,
        repetition_penalty=args.repetition_penalty,
        seed=args.seed,
        stop=[tokenizer.eos_token] if tokenizer.eos_token else None,
    )

    outputs = llm.generate(prompts, sampling, lora_request=lora_request)
    return [[item.text for item in output.outputs] for output in outputs]


def generate_with_transformers(
    args: argparse.Namespace,
    model_path: str,
    adapter_path: str,
    prompts: list[str],
) -> list[list[str]]:
    import torch
    from peft import PeftModel
    from transformers import AutoModelForCausalLM

    tokenizer = load_tokenizer(model_path)
    tokenizer.padding_side = "left"

    model = AutoModelForCausalLM.from_pretrained(
        model_path,
        torch_dtype=torch.bfloat16,
        device_map="auto",
        trust_remote_code=True,
        low_cpu_mem_usage=True,
    )
    if adapter_path:
        model = PeftModel.from_pretrained(model, adapter_path)
    model.eval()

    grouped: list[list[str]] = []
    for start in range(0, len(prompts), args.batch_size):
        batch_prompts = prompts[start : start + args.batch_size]
        inputs = tokenizer(
            batch_prompts,
            return_tensors="pt",
            padding=True,
            truncation=True,
            max_length=4096 - args.max_tokens,
        ).to(model.device)
        with torch.no_grad():
            generated = model.generate(
                **inputs,
                do_sample=True,
                temperature=args.temperature,
                top_p=args.top_p,
                top_k=args.top_k,
                max_new_tokens=args.max_tokens,
                num_return_sequences=args.n_samples,
                repetition_penalty=args.repetition_penalty,
                pad_token_id=tokenizer.pad_token_id,
                eos_token_id=tokenizer.eos_token_id,
            )
        prompt_width = inputs["input_ids"].shape[1]
        decoded = tokenizer.batch_decode(generated[:, prompt_width:], skip_special_tokens=False)
        for offset in range(len(batch_prompts)):
            lo = offset * args.n_samples
            hi = lo + args.n_samples
            grouped.append(decoded[lo:hi])
        print(f"[INFO] generated {min(start + args.batch_size, len(prompts))}/{len(prompts)} prompts", flush=True)
    return grouped


def generate_with_transformers_stream(
    args: argparse.Namespace,
    model_path: str,
    adapter_path: str,
    rows: list[dict[str, Any]],
    prompts: list[str],
    out_file: Path,
) -> None:
    import torch
    from peft import PeftModel
    from transformers import AutoModelForCausalLM

    tokenizer = load_tokenizer(model_path)
    tokenizer.padding_side = "left"

    model = AutoModelForCausalLM.from_pretrained(
        model_path,
        torch_dtype=torch.bfloat16,
        device_map="auto",
        trust_remote_code=True,
        low_cpu_mem_usage=True,
    )
    if adapter_path:
        model = PeftModel.from_pretrained(model, adapter_path)
    model.eval()

    out_file.parent.mkdir(parents=True, exist_ok=True)
    with out_file.open("a", encoding="utf-8") as fh:
        for start in range(0, len(prompts), args.batch_size):
            batch_rows = rows[start : start + args.batch_size]
            batch_prompts = prompts[start : start + args.batch_size]
            inputs = tokenizer(
                batch_prompts,
                return_tensors="pt",
                padding=True,
                truncation=True,
                max_length=4096 - args.max_tokens,
            ).to(model.device)
            with torch.no_grad():
                generated = model.generate(
                    **inputs,
                    do_sample=True,
                    temperature=args.temperature,
                    top_p=args.top_p,
                    top_k=args.top_k,
                    max_new_tokens=args.max_tokens,
                    num_return_sequences=args.n_samples,
                    repetition_penalty=args.repetition_penalty,
                    pad_token_id=tokenizer.pad_token_id,
                    eos_token_id=tokenizer.eos_token_id,
                )
            prompt_width = inputs["input_ids"].shape[1]
            decoded = tokenizer.batch_decode(generated[:, prompt_width:], skip_special_tokens=False)
            for offset, row in enumerate(batch_rows):
                lo = offset * args.n_samples
                hi = lo + args.n_samples
                candidates = [
                    {"raw": raw, "candidate": normalize_candidate(row, raw)}
                    for raw in decoded[lo:hi]
                ]
                fh.write(
                    json.dumps(
                        {
                            "task_id": row["task_id"],
                            "entry_point": row["entry_point"],
                            "candidates": candidates,
                        },
                        ensure_ascii=False,
                    )
                    + "\n"
                )
            fh.flush()
            print(f"[INFO] generated {min(start + args.batch_size, len(prompts))}/{len(prompts)} prompts", flush=True)


def evaluate(args: argparse.Namespace) -> None:
    rows = {row["task_id"]: row for row in load_dataset_rows()}
    if args.limit:
        rows = dict(list(rows.items())[: args.limit])

    gen_file = Path(args.out_dir) / args.model_id / f"generations_n{args.n_samples}.jsonl"
    if not gen_file.exists():
        raise FileNotFoundError(gen_file)

    records = []
    with gen_file.open("r", encoding="utf-8") as fh:
        for line in fh:
            if not line.strip():
                continue
            record = json.loads(line)
            if record["task_id"] in rows:
                records.append(record)

    details = []
    pass1_sum = pass5_sum = passn_sum = 0.0
    plausible_aed: list[int] = []
    plausible_ccr: list[float] = []
    plausible_norm_aed: list[float] = []
    noop_first = 0
    noop_all = 0
    all_candidates = 0
    fixed_tasks = set()

    for record in records:
        row = rows[record["task_id"]]
        buggy = full_buggy(row)
        ref = full_reference(row)
        cand_results = []
        correct = 0
        for idx, item in enumerate(record["candidates"][: args.n_samples]):
            candidate = normalize_candidate(row, item.get("raw", "")) if item.get("raw") else item.get("candidate", "")
            is_noop = candidate.strip() == buggy.strip()
            if idx == 0 and is_noop:
                noop_first += 1
            if is_noop:
                noop_all += 1
            all_candidates += 1
            passed, error = run_tests(candidate, row, args.timeout)
            if passed:
                correct += 1
                fixed_tasks.add(record["task_id"])
                dist = levenshtein_distance(buggy.strip(), candidate.strip())
                plausible_aed.append(dist)
                plausible_norm_aed.append(dist / max(1, len(buggy.strip()), len(candidate.strip())))
                plausible_ccr.append(ccr(buggy, candidate))
            cand_results.append(
                {
                    "index": idx,
                    "passed": passed,
                    "no_op": is_noop,
                    "error": "" if passed else error[:1000],
                }
            )
        total = min(args.n_samples, len(record["candidates"]))
        pass1_sum += calc_pass_at_k(total, correct, 1)
        pass5_sum += calc_pass_at_k(total, correct, min(5, total))
        passn_sum += calc_pass_at_k(total, correct, total)
        details.append(
            {
                "task_id": record["task_id"],
                "correct": correct,
                "results": cand_results,
                "gt_aed": levenshtein_distance(buggy.strip(), ref.strip()),
                "gt_ccr": ccr(buggy, ref),
            }
        )

    n_tasks = len(records)
    gt_aed = [item["gt_aed"] for item in details]
    gt_ccr = [item["gt_ccr"] for item in details]
    summary = {
        "model_id": args.model_id,
        "benchmark": "bigcode/humanevalpack/python",
        "tasks": n_tasks,
        "n_samples": args.n_samples,
        "pass@1": pass1_sum / n_tasks * 100 if n_tasks else 0.0,
        "pass@5": pass5_sum / n_tasks * 100 if n_tasks else 0.0,
        f"pass@{args.n_samples}": passn_sum / n_tasks * 100 if n_tasks else 0.0,
        "resolved_tasks": len(fixed_tasks),
        "plausible_candidates": len(plausible_aed),
        "aed_avg": statistics.mean(plausible_aed) if plausible_aed else None,
        "aed_median": statistics.median(plausible_aed) if plausible_aed else None,
        "norm_aed_avg": statistics.mean(plausible_norm_aed) if plausible_norm_aed else None,
        "ccr_avg": statistics.mean(plausible_ccr) if plausible_ccr else None,
        "ccr_median": statistics.median(plausible_ccr) if plausible_ccr else None,
        "noop_first": noop_first,
        "noop_first_rate": noop_first / n_tasks * 100 if n_tasks else 0.0,
        "noop_all": noop_all,
        "noop_all_rate": noop_all / all_candidates * 100 if all_candidates else 0.0,
        "gt_aed_avg": statistics.mean(gt_aed) if gt_aed else None,
        "gt_aed_median": statistics.median(gt_aed) if gt_aed else None,
        "gt_ccr_avg": statistics.mean(gt_ccr) if gt_ccr else None,
        "gt_ccr_median": statistics.median(gt_ccr) if gt_ccr else None,
    }

    out_dir = Path(args.out_dir) / args.model_id
    out_dir.mkdir(parents=True, exist_ok=True)
    (out_dir / f"eval_n{args.n_samples}.json").write_text(
        json.dumps({"summary": summary, "details": details}, indent=2, ensure_ascii=False),
        encoding="utf-8",
    )
    print(json.dumps(summary, indent=2, ensure_ascii=False))


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("--model-id", required=True)
    parser.add_argument("--mode", choices=["generate", "evaluate", "all"], default="all")
    parser.add_argument("--out-dir", default="analysis_outputs/humanevalpack_python")
    parser.add_argument("--gpu", default="0")
    parser.add_argument("--n-samples", type=int, default=5)
    parser.add_argument("--limit", type=int, default=0)
    parser.add_argument("--temperature", type=float, default=1.0)
    parser.add_argument("--top-p", type=float, default=0.9)
    parser.add_argument("--top-k", type=int, default=50)
    parser.add_argument("--max-tokens", type=int, default=1024)
    parser.add_argument("--repetition-penalty", type=float, default=1.1)
    parser.add_argument("--gpu-memory-utilization", type=float, default=0.88)
    parser.add_argument("--backend", choices=["transformers", "vllm"], default="transformers")
    parser.add_argument("--batch-size", type=int, default=4)
    parser.add_argument("--timeout", type=float, default=3.0)
    parser.add_argument("--minimal-change", action="store_true")
    parser.add_argument("--overwrite", action="store_true")
    parser.add_argument("--seed", type=int, default=DEFAULT_EVAL_SEED)
    args = parser.parse_args()

    if args.mode in {"generate", "all"}:
        generate(args)
    if args.mode in {"evaluate", "all"}:
        evaluate(args)


if __name__ == "__main__":
    main()
