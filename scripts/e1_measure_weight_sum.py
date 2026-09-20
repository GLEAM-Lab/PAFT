# -*- coding: utf-8 -*-
"""E1 (TSE revision): measure the gradient-scale factor of PAFT's preservation weighting.

PAFT normalizes the weighted loss by the number of unmasked target tokens N, not by the
sum of weights, so the total loss scale of an instance is

    c = sum_t beta_t / N = 1 + (w_align - 1) * |I_align| / N ,

where I_align is the aligned response-token set and N counts every target token
(prompt + response, full-sequence loss), after the causal shift. This script rebuilds
each training instance exactly as SingleTrainWithLCS.py does (tokenize the full text,
keep prompt + first response, cut at max_len-1, append EOS, align with
difflib.SequenceMatcher on token ids, shift by one) and reports

  * mean over instances of c        (matches per-device batch size 1: each micro-batch is
                                     normalized by its own N, so this is the expected
                                     per-step scale factor)
  * pooled  sum(sum_t beta_t)/sum(N)
  * mean |I_align|/N and mean |I_align|/|response|

Usage:
  python scripts/e1_measure_weight_sum.py --tokenizer deepseek-ai/deepseek-coder-6.7b-instruct \
      --trainset data/trainset/deepseek_llm_train.json --w-align 2.0
  python scripts/e1_measure_weight_sum.py --tokenizer Qwen/Qwen2.5-Coder-7B-Instruct \
      --trainset data/trainset/qwen_llm_train.json
"""
import argparse
import json
import os
import statistics as st
from difflib import SequenceMatcher

from transformers import AutoTokenizer, PreTrainedTokenizerFast

MAX_LEN = 2048
BUGGY_START_MARKER = "This is an incorrect code to the problem:\n```"


def load_tokenizer(name):
    if "deepseek" in name.lower():
        from huggingface_hub import hf_hub_download
        tj = name if name.endswith("tokenizer.json") else (
            os.path.join(name, "tokenizer.json") if os.path.isdir(name) else hf_hub_download(name, "tokenizer.json"))
        return PreTrainedTokenizerFast(tokenizer_file=tj, eos_token="<|EOT|>", pad_token="<|EOT|>")
    return AutoTokenizer.from_pretrained(name, trust_remote_code=True)


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--tokenizer", required=True)
    ap.add_argument("--trainset", required=True)
    ap.add_argument("--w-align", type=float, default=2.0)
    ap.add_argument("--end-marker", default=None,
                    help="text marker closing the buggy block; default <|EOT|> for deepseek, <|im_end|> otherwise")
    a = ap.parse_args()
    tok = load_tokenizer(a.tokenizer)
    eos = tok.eos_token_id
    end_marker = a.end_marker or ("```\n<|EOT|>" if "deepseek" in a.tokenizer.lower() else "```\n<|im_end|>")
    if eos is None or tok.convert_tokens_to_ids(tok.eos_token) != eos:
        print(f"warning: eos token {tok.eos_token!r} id {eos}")
    if "im_end" in end_marker:
        eos = tok.convert_tokens_to_ids("<|im_end|>")

    data = json.load(open(a.trainset, encoding="utf-8"))
    ratios, aligned_frac, resp_cov, ns = [], [], [], []
    truncated = 0
    for item in data:
        text = item["text"]
        ids = tok(text)["input_ids"]
        sp = [i for i, x in enumerate(ids) if x == eos]
        if len(sp) < 2:
            raise SystemExit("instance without two EOS split points")
        prompt_ids = ids[:sp[0]]
        response_ids = ids[sp[0] + 1:sp[1]]
        combined = (prompt_ids + response_ids)[:MAX_LEN - 1] + [eos]
        if len(prompt_ids) + len(response_ids) > MAX_LEN - 1:
            truncated += 1
        prompt_len = min(len(prompt_ids), len(combined) - 1)

        bs = text.find(BUGGY_START_MARKER)
        buggy_tokens = []
        if bs != -1:
            cs = bs + len(BUGGY_START_MARKER)
            le = text.find("\n", cs)
            if le != -1:
                cs = le + 1
            be = text.find(end_marker, cs)
            if be != -1:
                buggy_tokens = tok(text[cs:be], add_special_tokens=False)["input_ids"]

        weights = [1.0] * len(combined)
        resp_len = min(len(response_ids), len(combined) - prompt_len)
        resp = response_ids[:resp_len]
        n_aligned = 0
        if buggy_tokens:
            for i, j, n in SequenceMatcher(None, buggy_tokens, resp).get_matching_blocks():
                for pos in range(j, j + n):
                    weights[prompt_len + pos] = a.w_align
                    n_aligned += 1
        shifted = weights[1:]                      # target x_t is predicted at position t-1
        N = len(shifted)
        ratios.append(sum(shifted) / N)
        aligned_frac.append(n_aligned / N)
        resp_cov.append(n_aligned / max(1, resp_len))
        ns.append((sum(shifted), N))

    pooled = sum(s for s, _ in ns) / sum(n for _, n in ns)
    print(f"tokenizer={a.tokenizer} trainset={os.path.basename(a.trainset)} w_align={a.w_align} n={len(data)}")
    print(f"instances truncated at {MAX_LEN}: {truncated}")
    print(f"E[sum_t beta_t / N] (per-instance mean) = {st.mean(ratios):.4f}  "
          f"(median {st.median(ratios):.4f}, min {min(ratios):.4f}, max {max(ratios):.4f})")
    print(f"pooled sum(beta)/sum(N)                = {pooled:.4f}")
    print(f"mean |I_align|/N                        = {st.mean(aligned_frac):.4f}")
    print(f"mean |I_align|/|response|               = {st.mean(resp_cov):.4f}")


if __name__ == "__main__":
    main()
