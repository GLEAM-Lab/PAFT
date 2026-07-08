"""Alignment coverage of the PAFT preservation signal, per backbone tokenizer.

Follows Sec. 3.1 of the paper: extract buggy code b and fixed code f (fenced code
spans, wrappers stripped), tokenize with the backbone tokenizer
(add_special_tokens=False), align with difflib.SequenceMatcher, and report
|I_align| / |T(f)| (coverage of the fixed-code span) plus |I_align| / |response tokens|.
"""
import argparse, json, os, statistics, re
from difflib import SequenceMatcher
from transformers import AutoTokenizer

_parser = argparse.ArgumentParser(description=__doc__)
_parser.add_argument("--trainset", default="data/trainset", help="directory with the *_llm*.json training files")
_parser.add_argument("--out", default="analysis_outputs/tse_alignment_coverage.md")
_args = _parser.parse_args()
TRAIN = _args.trainset
OUT = _args.out

BUGGY_MARKER = "This is an incorrect code to the problem:\n```"

def first_fenced_block(text):
    """Content of the first ``` fenced block (language line stripped)."""
    i = text.find("```")
    if i < 0:
        return None
    j = text.find("\n", i)
    if j < 0:
        return None
    k = text.find("```", j)
    if k < 0:
        return None
    return text[j + 1 : k]

def extract(fmt, text):
    """Return (buggy_code, fixed_code, response_full) or None."""
    i = text.find(BUGGY_MARKER)
    if i < 0:
        return None
    rest = text[i + len(BUGGY_MARKER) :]
    j = rest.find("\n")           # skip language tag line
    k = rest.find("```", j)
    if j < 0 or k < 0:
        return None
    buggy = rest[j + 1 : k]
    if fmt == "im":
        a = text.find("<|im_start|>assistant")
        if a < 0:
            return None
        resp = text[a + len("<|im_start|>assistant") :]
        e = resp.rfind("<|im_end|>")
        resp = resp[:e] if e >= 0 else resp
    else:  # deepseek "### Response:"
        a = text.find("### Response:")
        if a < 0:
            return None
        resp = text[a + len("### Response:") :]
    fixed = first_fenced_block(resp)
    if fixed is None:
        return None
    return buggy, fixed, resp

def coverage(tok, buggy, fixed, resp):
    tb = tok(buggy, add_special_tokens=False)["input_ids"]
    tf = tok(fixed, add_special_tokens=False)["input_ids"]
    tr = tok(resp, add_special_tokens=False)["input_ids"]
    if not tb or not tf:
        return None
    m = SequenceMatcher(None, tb, tf)
    matched = sum(n for _, _, n in m.get_matching_blocks() if n > 0)
    return matched / len(tf), (matched / len(tr) if tr else 0.0), len(tf)

CONFIGS = [
    ("DS-Coder-6.7B", "deepseek_llm_diff.json", "ds", "deepseek-ai/deepseek-coder-6.7b-instruct", False),
    ("Qwen2.5-Coder", "qwen_llm_diff.json", "im", "Qwen/Qwen2.5-Coder-7B-Instruct", False),
    ("Qwen3-8B", "qwen_llm_diff.json", "im", "Qwen/Qwen3-8B", False),
    ("OpenCoder-8B", "opencoder_llm.json", "im", "infly/OpenCoder-8B-Instruct", True),
]

lines = ["| backbone tokenizer | instances | mean cov | median | p25 | p75 | >90% | mean share of response |",
         "|---|---:|---:|---:|---:|---:|---:|---:|"]
for label, fname, fmt, tokname, trust in CONFIGS:
    try:
        tok = AutoTokenizer.from_pretrained(tokname, trust_remote_code=trust)
    except Exception as e:
        lines.append(f"| {label} | tokenizer load failed: {str(e)[:60]} |")
        continue
    data = json.load(open(os.path.join(TRAIN, fname), encoding="utf-8"))
    covs, shares, flens, skipped = [], [], [], 0
    for inst in data:
        ex = extract(fmt, inst["text"])
        if ex is None:
            skipped += 1
            continue
        r = coverage(tok, *ex)
        if r is None:
            skipped += 1
            continue
        covs.append(r[0]); shares.append(r[1]); flens.append(r[2])
    covs_s = sorted(covs)
    n = len(covs_s)
    q = lambda p: covs_s[min(n - 1, int(p * n))] * 100
    hi = sum(1 for c in covs_s if c > 0.9) / n * 100
    lines.append(f"| {label} | {n} (skip {skipped}) | {statistics.mean(covs)*100:.1f}% | {q(0.5):.1f}% | "
                 f"{q(0.25):.1f}% | {q(0.75):.1f}% | {hi:.1f}% | {statistics.mean(shares)*100:.1f}% |")
    print(lines[-1])

open(OUT, "w", encoding="utf-8").write("\n".join(lines))
print("written:", OUT)
