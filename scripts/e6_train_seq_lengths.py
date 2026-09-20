# -*- coding: utf-8 -*-
"""E6 (TSE revision): length of every training instance as SingleTrainWithLCS.py assembles it.

The trainer tokenizes the whole `text`, keeps prompt (before the first EOS) + first
response (between the first and second EOS), cuts at max_len-1 and appends EOS. This
script reproduces that assembly per backbone tokenizer and reports the maximum, p99 and
median length plus the count of instances that would be truncated at 2,048, and, for
contrast, the length of the raw `text` (which for DeepSeek/OpenCoder carries extra text
after the fixed program that the trainer discards).

Usage:
  python scripts/e6_train_seq_lengths.py --trainset data/trainset
Optional: --models to restrict the tokenizer list (HF ids or local dirs).
"""
import argparse
import json
import os

from transformers import AutoTokenizer, PreTrainedTokenizerFast

MAX_LEN = 2048
JOBS = [
    ("deepseek-ai/deepseek-coder-6.7b-instruct", "deepseek_llm_train.json"),
    ("Qwen/Qwen2.5-Coder-7B-Instruct", "qwen_llm_train.json"),
    ("Qwen/Qwen2.5-Coder-14B-Instruct", "qwen_llm_train.json"),
    ("Qwen/Qwen3-8B", "qwen_llm_train.json"),
    ("infly/OpenCoder-8B-Instruct", "opencoder_llm_train.json"),
]


def load_tokenizer(name):
    if "deepseek" in name.lower():
        from huggingface_hub import hf_hub_download
        tj = os.path.join(name, "tokenizer.json") if os.path.isdir(name) else hf_hub_download(name, "tokenizer.json")
        return PreTrainedTokenizerFast(tokenizer_file=tj, eos_token="<|EOT|>", pad_token="<|EOT|>")
    return AutoTokenizer.from_pretrained(name, trust_remote_code=True)


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--trainset", default="data/trainset")
    ap.add_argument("--models", nargs="*", default=None)
    a = ap.parse_args()
    jobs = [(m, f) for m, f in JOBS if not a.models or m in a.models]
    print("| tokenizer | vocab | file | trainer seq max | p99 | median | >2048 | raw text max | raw >2048 |")
    print("|---|---:|---|---:|---:|---:|---:|---:|---:|")
    for model, fn in jobs:
        tok = load_tokenizer(model)
        eos = tok.eos_token_id
        if "im_end" in (tok.eos_token or "") or "opencoder" in model.lower() or "qwen" in model.lower():
            eos = tok.convert_tokens_to_ids("<|im_end|>")
        data = json.load(open(os.path.join(a.trainset, fn), encoding="utf-8"))
        lens, raw = [], []
        for it in data:
            ids = tok(it["text"])["input_ids"]
            raw.append(len(ids))
            sp = [i for i, x in enumerate(ids) if x == eos]
            if len(sp) < 2:
                raise SystemExit(f"{fn}: instance without two EOS split points")
            comb = (ids[:sp[0]] + ids[sp[0] + 1:sp[1]])[:MAX_LEN - 1] + [eos]
            lens.append(len(comb))
        lens.sort(); raw.sort()
        print(f"| {model} | {len(tok)} | {fn} | {lens[-1]} | {lens[int(0.99 * len(lens))]} | {lens[len(lens) // 2]} | "
              f"{sum(l > MAX_LEN for l in lens)} | {raw[-1]} | {sum(r > MAX_LEN for r in raw)} |")


if __name__ == "__main__":
    main()
