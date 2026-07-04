#!/usr/bin/env python3
"""Generate and evaluate repair candidates on QuixBugs-Python."""

from __future__ import annotations

import argparse
import ast
import difflib
import json
import os
import random
import re
import shutil
import statistics
import subprocess
import tempfile
from pathlib import Path
from typing import Any


MODEL_CONFIGS = {
    "deepseek-6.7b": "deepseek-ai/deepseek-coder-6.7b-instruct",
    "deepseek-6.7b-trained": "/home/barty/research/prorepair/merged_models/sft_deepseek7b/codellama_merged",
    "deepseek-6.7b-trained-noprompt": "deepseek-ai/deepseek-coder-6.7b-instruct",
    "deepseek-6.7b-trained-prorepair": "deepseek-ai/deepseek-coder-6.7b-instruct",
    "deepseek-6.7b-trained-prorepair-0.0": "deepseek-ai/deepseek-coder-6.7b-instruct",
    "deepseek-6.7b-trained-prorepair-2.0": "deepseek-ai/deepseek-coder-6.7b-instruct",
    "deepseek-6.7b-trained-prorepair-2.0-fixed": "/home/barty/research/prorepair/merged_models/sft_deepseek7b_prorepair_2.0_fixed",
    "deepseek-6.7b-trained-prorepair-4.0": "deepseek-ai/deepseek-coder-6.7b-instruct",
    "deepseek-6.7b-trained-difficulty": "/home/barty/research/prorepair/merged_models/sft_deepseek7b_sortedbydifficultyfirst",
    "deepseek-6.7b-trained-diff": "/home/barty/research/prorepair/merged_models/sft_deepseek7b_sortedbydifffirst",
    "deepseek-6.7b-trained-diffonly": "/home/barty/research/prorepair/merged_models/sft_deepseek7b_sortedbydiff",
    "opencoder8b": "infly/OpenCoder-8B-Instruct",
    "opencoder8b-sft": "/home/barty/research/prorepair/merged_models/opencoder8b-sft",
    "opencoder8b-paft": "/home/barty/research/prorepair/merged_models/opencoder8b-paft",
    "qwen2.5coder7b": "Qwen/Qwen2.5-Coder-7B-Instruct",
    "qwen2.5coder7b-sft-assistonly-tse-20260619": "/home/barty/research/prorepair/merged_models/qwen2.5coder7b-sft-assistonly-tse-20260619",
    "qwen2.5coder7b-paft-v2-assistonly-wnorm-w125-20260619": "/home/barty/research/prorepair/merged_models/qwen2.5coder7b-paft-v2-assistonly-wnorm-w125-20260619",
    "qwen2.5coder14b": "/home/barty/.cache/huggingface/hub/models--Qwen--Qwen2.5-Coder-14B-Instruct/snapshots/aedcc2d42b622764e023cf882b6652e646b95671",
    "qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620": "/home/barty/.cache/huggingface/hub/models--Qwen--Qwen2.5-Coder-14B-Instruct/snapshots/aedcc2d42b622764e023cf882b6652e646b95671",
    "qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620": "/home/barty/.cache/huggingface/hub/models--Qwen--Qwen2.5-Coder-14B-Instruct/snapshots/aedcc2d42b622764e023cf882b6652e646b95671",
    "qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620": "/home/barty/.cache/huggingface/hub/models--Qwen--Qwen2.5-Coder-14B-Instruct/snapshots/aedcc2d42b622764e023cf882b6652e646b95671",
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

# Reportable QuixBugs-Python sanity checks use a fixed seed for reproducibility.
DEFAULT_EVAL_SEED = 7106

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


def resolve_model_path(model_id_or_path: str) -> str:
    path = Path(model_id_or_path)
    if path.exists():
        return str(path)
    try:
        from huggingface_hub import snapshot_download

        return snapshot_download(model_id_or_path, local_files_only=True)
    except Exception:
        return model_id_or_path


def load_tasks(bench_dir: Path) -> list[dict[str, Any]]:
    tasks = []
    for buggy_path in sorted((bench_dir / "python_programs").glob("*.py")):
        if buggy_path.name == "node.py" or buggy_path.name.endswith("_test.py"):
            continue
        fixed_path = bench_dir / "correct_python_programs" / buggy_path.name
        test_path = bench_dir / "python_testcases" / f"test_{buggy_path.name}"
        if not fixed_path.exists() or not test_path.exists():
            continue
        buggy = buggy_path.read_text(encoding="utf-8")
        fixed = fixed_path.read_text(encoding="utf-8")
        entry = first_function_name(buggy) or buggy_path.stem
        tasks.append(
            {
                "task_id": buggy_path.stem,
                "entry_point": entry,
                "buggy": buggy,
                "fixed": fixed,
                "test_file": f"python_testcases/test_{buggy_path.name}",
            }
        )
    return tasks


def first_function_name(code: str) -> str | None:
    try:
        module = ast.parse(code)
    except SyntaxError:
        return None
    for node in module.body:
        if isinstance(node, ast.FunctionDef):
            return node.name
    return None


def prompt_style_for_model(model_id: str) -> str:
    model_id = model_id.lower()
    if "qwen" in model_id:
        return "qwen"
    if "opencoder" in model_id:
        return "opencoder"
    return "deepseek"


def build_prompt(
    task: dict[str, Any],
    minimal_change: bool = False,
    strict: bool = False,
    model_id: str = "",
) -> str:
    filename = f"{task['task_id']}.py"
    change_phrase = " with the minimal change" if minimal_change else ""
    repair_line = (
        "You are a software engineer. Can you repair the incorrect Python code"
        f"{change_phrase} without modifying any code indentations?\n"
    )
    if strict:
        repair_line = (
            "Return only the complete fixed Python code inside one python code block.\n"
            + repair_line
        )
    user_prompt = (
        f"This is an incorrect Python code ({filename}):\n```python\n"
        + task["buggy"].rstrip()
        + "\n```\n"
        + repair_line
    )
    style = prompt_style_for_model(model_id)
    if style == "qwen":
        return QWEN_BOF + user_prompt + IM_EOF + "```python\n"
    if style == "opencoder":
        return OPENCODER_BOF + user_prompt + IM_EOF + "```python\n"
    return DEEPSEEK_BOF + user_prompt + DEEPSEEK_EOF + "\n```python\n"


def extract_python_code(text: str) -> str:
    if not text:
        return ""
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


def normalize_candidate(task: dict[str, Any], generated: str) -> str:
    code = extract_python_code(generated).strip()
    if not code:
        return ""
    entry = re.escape(task["entry_point"])
    if re.search(rf"(^|\n)\s*def\s+{entry}\s*\(", code):
        return code.rstrip() + "\n"
    # If the model emits only a function body, preserve the original signature.
    lines = task["buggy"].splitlines()
    signature = next((line for line in lines if re.match(rf"\s*def\s+{entry}\s*\(", line)), None)
    if signature:
        body = code.rstrip()
        if not body.startswith((" ", "\t")):
            body = "\n".join(("    " + line if line.strip() else line) for line in body.splitlines())
        return signature.rstrip() + "\n" + body + "\n"
    return code.rstrip() + "\n"


def levenshtein_distance(a: str, b: str) -> int:
    if a == b:
        return 0
    if len(a) < len(b):
        a, b = b, a
    previous = list(range(len(b) + 1))
    for i, ca in enumerate(a, 1):
        current = [i]
        for j, cb in enumerate(b, 1):
            insert = current[j - 1] + 1
            delete = previous[j] + 1
            replace = previous[j - 1] + (ca != cb)
            current.append(min(insert, delete, replace))
        previous = current
    return previous[-1]


def ccr(a: str, b: str) -> float:
    a_lines = a.strip().splitlines()
    b_lines = b.strip().splitlines()
    if not b_lines:
        return 0.0
    matcher = difflib.SequenceMatcher(None, a_lines, b_lines)
    preserved = sum(block.size for block in matcher.get_matching_blocks()[:-1])
    return preserved / len(b_lines) * 100


def calc_pass_at_k(n: int, c: int, k: int) -> float:
    if n - c < k:
        return 1.0
    result = 1.0
    for i in range(k):
        result *= (n - c - i) / (n - i)
    return 1.0 - result


def run_tests(bench_dir: Path, task: dict[str, Any], candidate: str, timeout: float) -> tuple[bool, str]:
    if not candidate.strip():
        return False, "empty candidate"
    with tempfile.TemporaryDirectory(prefix="quixbugs_eval_") as tmp:
        root = Path(tmp)
        shutil.copytree(bench_dir / "python_programs", root / "python_programs")
        shutil.copytree(bench_dir / "python_testcases", root / "python_testcases")
        os.symlink(bench_dir / "json_testcases", root / "json_testcases")
        shutil.copy2(bench_dir / "conftest.py", root / "conftest.py")
        (root / "python_programs" / f"{task['task_id']}.py").write_text(candidate, encoding="utf-8")
        try:
            proc = subprocess.run(
                [
                    "python3",
                    "-m",
                    "pytest",
                    "-q",
                    task["test_file"],
                    "--tb=short",
                    "--disable-warnings",
                ],
                cwd=root,
                stdout=subprocess.PIPE,
                stderr=subprocess.STDOUT,
                text=True,
                timeout=timeout,
            )
        except subprocess.TimeoutExpired:
            return False, "timeout"
        return proc.returncode == 0, proc.stdout[-2000:]


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
                    tokenizer.padding_side = "left"
                    return tokenizer
            except Exception as exc:
                print(f"[WARNING] fast tokenizer fallback failed for {path}: {exc}")

    tokenizer = AutoTokenizer.from_pretrained(model_path, trust_remote_code=True, use_fast=True)
    if tokenizer.pad_token is None:
        tokenizer.pad_token = tokenizer.eos_token
    tokenizer.padding_side = "left"
    return tokenizer


def safe_batch_decode(tokenizer, sequences, skip_special_tokens: bool = False) -> list[str]:
    decoded: list[str] = []
    vocab_size = getattr(tokenizer, "vocab_size", None)
    for seq in sequences:
        ids = seq.tolist() if hasattr(seq, "tolist") else list(seq)
        if vocab_size is not None:
            ids = [idx for idx in ids if 0 <= int(idx) < vocab_size]
        decoded.append(tokenizer.decode(ids, skip_special_tokens=skip_special_tokens))
    return decoded


def generate_with_transformers_stream(
    args: argparse.Namespace,
    model_path: str,
    adapter_path: str,
    tasks: list[dict[str, Any]],
    prompts: list[str],
    out_file: Path,
) -> None:
    import torch
    from peft import PeftModel
    from transformers import AutoModelForCausalLM

    if args.seed is not None:
        random.seed(args.seed)
        torch.manual_seed(args.seed)
        torch.cuda.manual_seed_all(args.seed)

    tokenizer = load_tokenizer(model_path)
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
            batch_tasks = tasks[start : start + args.batch_size]
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
            decoded = safe_batch_decode(tokenizer, generated[:, prompt_width:], skip_special_tokens=False)
            for offset, task in enumerate(batch_tasks):
                lo = offset * args.n_samples
                hi = lo + args.n_samples
                candidates = [
                    {"raw": raw, "candidate": normalize_candidate(task, raw)}
                    for raw in decoded[lo:hi]
                ]
                fh.write(
                    json.dumps(
                        {
                            "task_id": task["task_id"],
                            "entry_point": task["entry_point"],
                            "candidates": candidates,
                        },
                        ensure_ascii=False,
                    )
                    + "\n"
                )
            fh.flush()
            print(f"[INFO] generated {min(start + args.batch_size, len(prompts))}/{len(prompts)} prompts", flush=True)


def generate(args: argparse.Namespace) -> None:
    os.environ.setdefault("CUDA_VISIBLE_DEVICES", str(args.gpu))
    bench_dir = Path(args.bench_dir).resolve()
    all_tasks = load_tasks(bench_dir)
    tasks = all_tasks[: args.limit] if args.limit else all_tasks
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
    if out_file.exists():
        with out_file.open("r", encoding="utf-8") as fh:
            for line in fh:
                if line.strip():
                    done.add(json.loads(line)["task_id"])
    todo = [task for task in tasks if task["task_id"] not in done]
    if not todo:
        print(f"[INFO] all generations already exist: {out_file}")
        return

    prompts = [build_prompt(task, args.minimal_change, args.strict, args.model_id) for task in todo]
    print(f"[INFO] loading {args.model_id}: {model_path}")
    if adapter_path:
        print(f"[INFO] adapter: {adapter_path}")
    generate_with_transformers_stream(args, model_path, adapter_path, todo, prompts, out_file)
    print(f"[INFO] wrote {len(todo)} tasks to {out_file}")


def evaluate(args: argparse.Namespace) -> None:
    bench_dir = Path(args.bench_dir).resolve()
    tasks = {task["task_id"]: task for task in load_tasks(bench_dir)}
    if args.limit:
        tasks = dict(list(tasks.items())[: args.limit])
    gen_file = Path(args.out_dir) / args.model_id / f"generations_n{args.n_samples}.jsonl"
    if not gen_file.exists():
        raise FileNotFoundError(gen_file)
    records = []
    with gen_file.open("r", encoding="utf-8") as fh:
        for line in fh:
            if line.strip():
                record = json.loads(line)
                if record["task_id"] in tasks:
                    records.append(record)

    details = []
    pass1_sum = pass5_sum = passn_sum = 0.0
    plausible_aed: list[int] = []
    plausible_ccr: list[float] = []
    noop_first = noop_all = all_candidates = 0
    fixed_tasks = set()
    for record in records:
        task = tasks[record["task_id"]]
        correct = 0
        cand_results = []
        for idx, item in enumerate(record["candidates"][: args.n_samples]):
            candidate = item.get("candidate", "")
            is_noop = candidate.strip() == task["buggy"].strip()
            if idx == 0 and is_noop:
                noop_first += 1
            if is_noop:
                noop_all += 1
            all_candidates += 1
            passed, output = run_tests(bench_dir, task, candidate, args.timeout)
            if passed:
                correct += 1
                fixed_tasks.add(record["task_id"])
                plausible_aed.append(levenshtein_distance(task["buggy"].strip(), candidate.strip()))
                plausible_ccr.append(ccr(task["buggy"], candidate))
            cand_results.append(
                {
                    "index": idx,
                    "passed": passed,
                    "no_op": is_noop,
                    "output": "" if passed else output,
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
                "gt_aed": levenshtein_distance(task["buggy"].strip(), task["fixed"].strip()),
                "gt_ccr": ccr(task["buggy"], task["fixed"]),
            }
        )

    n_tasks = len(records)
    gt_aed = [item["gt_aed"] for item in details]
    gt_ccr = [item["gt_ccr"] for item in details]
    summary = {
        "model_id": args.model_id,
        "benchmark": "QuixBugs-Python",
        "tasks": n_tasks,
        "n_samples": args.n_samples,
        "pass@1": pass1_sum / n_tasks * 100 if n_tasks else 0.0,
        "pass@5": pass5_sum / n_tasks * 100 if n_tasks else 0.0,
        f"pass@{args.n_samples}": passn_sum / n_tasks * 100 if n_tasks else 0.0,
        "resolved_tasks": len(fixed_tasks),
        "plausible_candidates": len(plausible_aed),
        "aed_avg": statistics.mean(plausible_aed) if plausible_aed else None,
        "aed_median": statistics.median(plausible_aed) if plausible_aed else None,
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
    parser.add_argument("--bench-dir", default="data/QuixBugs")
    parser.add_argument("--out-dir", default="analysis_outputs/quixbugs_python_ds67")
    parser.add_argument("--gpu", default="0")
    parser.add_argument("--n-samples", type=int, default=5)
    parser.add_argument("--limit", type=int, default=0)
    parser.add_argument("--temperature", type=float, default=1.0)
    parser.add_argument("--top-p", type=float, default=0.9)
    parser.add_argument("--top-k", type=int, default=50)
    parser.add_argument("--max-tokens", type=int, default=192)
    parser.add_argument("--repetition-penalty", type=float, default=1.1)
    parser.add_argument("--batch-size", type=int, default=4)
    parser.add_argument("--timeout", type=float, default=8.0)
    parser.add_argument("--minimal-change", action="store_true")
    parser.add_argument("--strict", action="store_true")
    parser.add_argument("--seed", type=int, default=DEFAULT_EVAL_SEED)
    parser.add_argument("--overwrite", action="store_true")
    args = parser.parse_args()
    if args.mode in {"generate", "all"}:
        generate(args)
    if args.mode in {"evaluate", "all"}:
        evaluate(args)


if __name__ == "__main__":
    main()
