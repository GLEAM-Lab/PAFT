#!/usr/bin/env python3
import argparse
import json
import os
import re
from pathlib import Path

import torch
from transformers import AutoModelForCausalLM, AutoTokenizer, PreTrainedTokenizerFast
from peft import PeftModel


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


def sort_by_project_and_id(path: Path):
    parts = path.stem.split("-")
    if len(parts) >= 2:
        try:
            return (parts[0], int(parts[1]))
        except ValueError:
            pass
    return (path.stem, 0)


def extract_first_java_code(text: str) -> str:
    """Extract the first Java code block, tolerating truncated generations.

    Some generations open a ```java block but terminate with the model's EOT
    token before emitting the closing fence. Treat that as a recoverable
    extraction case instead of writing an empty fix.
    """
    match = re.search(r"```java\s*(.*?)(?:```|<\|EOT\|>|<\|im_end\|>|</s>|$)", text, re.DOTALL)
    if match:
        code = match.group(1)
    else:
        # The repair prompt already ends with an open ```java fence. Many
        # models therefore continue with raw Java and then close the fence,
        # so the response segment itself has no opening ```java marker.
        code = re.split(r"```|<\|EOT\|>|<\|im_end\|>|</s>", text, maxsplit=1)[0]
        if not re.search(
            r"^\s*(?:@\w+|public|private|protected|static|final|class|interface|enum|if|for|while|try|return|[A-Za-z_$][\w$<>\\[\\], ?]*\s+[A-Za-z_$][\w$]*\s*\()",
            code,
        ):
            return ""
    code = re.split(r"<\|EOT\|>|<\|im_end\|>|</s>", code, maxsplit=1)[0]
    code = "".join(ch for ch in code if ch in "\n\r\t" or ord(ch) >= 32)
    return code.strip()


def extract_first_java_code_historical(text: str) -> str:
    """Match the historical prorepair/d4j.py extraction behavior."""
    matches = re.findall(r"```java(.*?)```", text, re.DOTALL)
    return matches[0].strip() if matches else ""


def load_existing_fix(path: Path) -> str:
    try:
        data = json.loads(path.read_text(encoding="utf-8"))
    except Exception:
        return ""
    fix = data.get("fix", "")
    return fix if isinstance(fix, str) else ""


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
    code = item["buggy"]
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
        + code
        + "\n```\n"
        + repair_request
        + "\n"
        + eof
        + "\n```java\n"
    )
    return prompt, eof


def load_deepseek_tokenizer(tokenizer_path: str):
    tokenizer_json = Path(tokenizer_path) / "tokenizer.json"
    if tokenizer_json.exists():
        tokenizer = PreTrainedTokenizerFast(
            tokenizer_file=str(tokenizer_json),
            eos_token="<|EOT|>",
            pad_token="<|EOT|>",
        )
    else:
        tokenizer = AutoTokenizer.from_pretrained(
            tokenizer_path,
            trust_remote_code=True,
            local_files_only=True,
        )
    return tokenizer


def load_model(model_path: str, adapter_path: str = ""):
    def normalize_token(value):
        if isinstance(value, str):
            return value
        if isinstance(value, dict):
            content = value.get("content")
            return content if isinstance(content, str) else None
        return None

    tokenizer_path = os.environ.get("DEEPSEEK_TOKENIZER_PATH", "").strip() or model_path
    if "deepseek" in str(tokenizer_path).lower() or "deepseek" in str(model_path).lower():
        tokenizer = load_deepseek_tokenizer(tokenizer_path)
    else:
        tokenizer = AutoTokenizer.from_pretrained(tokenizer_path, trust_remote_code=True, local_files_only=True)
    if tokenizer.pad_token is None:
        tokenizer.pad_token = tokenizer.eos_token
    model = AutoModelForCausalLM.from_pretrained(
        model_path,
        torch_dtype=torch.float16,
        device_map="auto",
        trust_remote_code=True,
        local_files_only=True,
        low_cpu_mem_usage=True,
    )
    if adapter_path:
        model = PeftModel.from_pretrained(
            model,
            adapter_path,
            torch_dtype=torch.float16,
            local_files_only=True,
        )
    model.eval()
    return model, tokenizer


def extract_code(text: str, extract_profile: str) -> str:
    if extract_profile == "historical_strict":
        return extract_first_java_code_historical(text)
    return extract_first_java_code(text)


def generate_one(model, tokenizer, prompt: str, decode_profile: str, extract_profile: str):
    inputs = tokenizer(prompt, return_tensors="pt", truncation=True, max_length=4096)
    inputs.pop("token_type_ids", None)
    inputs = {k: v.to(model.device) for k, v in inputs.items()}
    prompt_len = inputs["input_ids"].shape[1]
    if decode_profile == "historical_pipeline":
        # Approximate the legacy pipeline call:
        # pipe(prompt, min_length=cnt+64, max_length=cnt+max_d,
        #      temperature=1.0, do_sample=True), where max_d=cnt.
        max_new = max(64, min(prompt_len, 1024))
        gen_kwargs = dict(
            do_sample=True,
            temperature=1.0,
            min_new_tokens=min(64, max_new),
            max_new_tokens=max_new,
            pad_token_id=tokenizer.pad_token_id,
            eos_token_id=tokenizer.eos_token_id,
        )
    else:
        gen_kwargs = dict(
            do_sample=True,
            temperature=1.0,
            top_p=0.9,
            top_k=50,
            max_new_tokens=1024,
            repetition_penalty=1.1,
            pad_token_id=tokenizer.pad_token_id,
            eos_token_id=tokenizer.eos_token_id,
        )
    with torch.inference_mode():
        output_ids = model.generate(
            **inputs,
            **gen_kwargs,
        )
    new_ids = output_ids[0, inputs["input_ids"].shape[1] :]
    response = tokenizer.decode(new_ids, skip_special_tokens=False)
    full_text = prompt + response
    code = extract_code(response, extract_profile)
    return full_text, code


def generate_nonempty(
    model,
    tokenizer,
    prompt: str,
    decode_profile: str,
    extract_profile: str,
    attempts: int = 3,
):
    last_full_text = ""
    last_code = ""
    for attempt in range(1, attempts + 1):
        full_text, code = generate_one(model, tokenizer, prompt, decode_profile, extract_profile)
        last_full_text, last_code = full_text, code
        if code.strip():
            return full_text, code
        print(f"empty extraction on attempt {attempt}/{attempts}", flush=True)
    return last_full_text, last_code


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("--model-path", required=True)
    parser.add_argument("--adapter-path", default="")
    parser.add_argument("--result-tag", required=True)
    parser.add_argument(
        "--model-family",
        choices=["auto", "deepseek", "qwen", "opencoder"],
        default="auto",
    )
    parser.add_argument("--dataset", default="defects4j/dataset")
    parser.add_argument("--output-root", default="defects4j/results")
    parser.add_argument("--num-processes", type=int, required=True)
    parser.add_argument("--process-id", type=int, required=True)
    parser.add_argument("--num-generations", type=int, default=1)
    parser.add_argument(
        "--prompt-style",
        choices=["minimal", "plain", "java_plain", "train_explain"],
        default="minimal",
    )
    parser.add_argument("--max-files", type=int, default=0)
    parser.add_argument(
        "--decode-profile",
        choices=["helper", "historical_pipeline"],
        default="helper",
    )
    parser.add_argument(
        "--extract-profile",
        choices=["tolerant", "historical_strict"],
        default="tolerant",
    )
    parser.add_argument("--attempts", type=int, default=3)
    args = parser.parse_args()

    model_family = (
        infer_model_family(args.model_path, args.adapter_path, args.result_tag)
        if args.model_family == "auto"
        else args.model_family
    )
    print(f"model_family={model_family}", flush=True)
    model, tokenizer = load_model(args.model_path, args.adapter_path)
    files = sorted(Path(args.dataset).glob("*.json"), key=sort_by_project_and_id)
    if args.max_files > 0:
        files = files[: args.max_files]
    out_base = Path(args.output_root) / args.result_tag

    for idx, file_path in enumerate(files, start=1):
        if idx % args.num_processes != args.process_id:
            continue
        with file_path.open("r", encoding="utf-8") as f:
            item = json.load(f)
        prompt, eof = build_prompt(item, args.prompt_style, model_family)
        for gen_idx in range(args.num_generations):
            fix_dir = out_base / f"fixed{gen_idx}"
            fix_dir.mkdir(parents=True, exist_ok=True)
            out_path = fix_dir / file_path.name
            log_path = Path(str(out_path) + ".log")
            if out_path.exists() and load_existing_fix(out_path).strip():
                continue

            if log_path.exists():
                full_text = log_path.read_text(encoding="utf-8", errors="ignore")
                code = extract_code(full_text.split(eof)[-1], args.extract_profile)
            else:
                full_text, code = "", ""

            if not code.strip():
                full_text, code = generate_nonempty(
                    model,
                    tokenizer,
                    prompt,
                    args.decode_profile,
                    args.extract_profile,
                    attempts=args.attempts,
                )

            if not code.strip():
                print(f"{args.result_tag} fixed{gen_idx} {file_path.name} empty_fix_skipped", flush=True)
                if out_path.exists():
                    out_path.unlink()
                log_path.write_text(full_text, encoding="utf-8")
                continue

            log_path.write_text(full_text, encoding="utf-8")
            result = dict(item)
            result["fix"] = code
            out_path.write_text(json.dumps(result, indent=2, ensure_ascii=False), encoding="utf-8")
            print(f"{args.result_tag} fixed{gen_idx} {file_path.name} code_len={len(code)}", flush=True)


if __name__ == "__main__":
    main()
