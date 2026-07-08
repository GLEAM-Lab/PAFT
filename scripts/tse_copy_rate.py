"""Token-level copy rate of generated Defects4J patches (DS-Coder-6.7B).

Copy rate = fraction of patch tokens aligned to the buggy input under the
DS-Coder tokenizer (difflib.SequenceMatcher over token ids). Reported for the
first plausible candidate per bug on each method's own solved set, and on the
common subset of bugs solved by Base, SFT, and PAFT.

Requires: pip install transformers sentencepiece
Usage: python scripts/tse_copy_rate.py --root .
"""
import argparse, json, statistics
from difflib import SequenceMatcher
from pathlib import Path

parser = argparse.ArgumentParser(description=__doc__)
parser.add_argument("--root", default=".", help="repo root containing defects4j/{dataset,results}")
parser.add_argument("--out", default="analysis_outputs/tse_copy_rate.md")
parser.add_argument("--tokenizer", default="deepseek-ai/deepseek-coder-6.7b-instruct")
args = parser.parse_args()

D4J = Path(args.root) / "defects4j"
MODELS = {"Base": "deepseek-6.7b", "SFT": "deepseek-6.7b-promptloss", "PAFT": "deepseek-6.7b-paft"}

from transformers import AutoTokenizer
tokz = AutoTokenizer.from_pretrained(args.tokenizer)

def load(mdir):
    out = {}
    for p in sorted((D4J / "results" / mdir / "fixed0").glob("*.json.result")):
        patches = json.loads(p.read_text(encoding="utf-8", errors="replace"))
        if isinstance(patches, list) and patches:
            out[p.name[: -len(".json.result")]] = patches[:10]
    return out

def copy_rate(buggy, patch):
    tb = tokz(buggy or "", add_special_tokens=False)["input_ids"]
    tp = tokz(patch or "", add_special_tokens=False)["input_ids"]
    if not tb or not tp:
        return None
    m = SequenceMatcher(None, tb, tp)
    return sum(n for _, _, n in m.get_matching_blocks() if n > 0) / len(tp)

dataset = {p.stem: json.loads(p.read_text(encoding="utf-8", errors="replace")).get("buggy", "")
           for p in sorted((D4J / "dataset").glob("*.json"))}
data = {lab: load(d) for lab, d in MODELS.items()}
solved = {lab: {b for b, ps in data[lab].items() if any(p.get("patch_status") == "PLAUSIBLE" for p in ps)}
          for lab in MODELS}
common = sorted(set.intersection(*solved.values()))

lines = [f"| method | own plausible set mean/med (n) | common subset ({len(common)}) mean/med |",
         "|---|---:|---:|"]
for lab in MODELS:
    own, com = [], []
    for b in sorted(solved[lab]):
        fp = next(p for p in data[lab][b] if p.get("patch_status") == "PLAUSIBLE")
        r = copy_rate(dataset[b], fp.get("patch_code", ""))
        if r is not None:
            own.append(r)
            if b in common:
                com.append(r)
    lines.append(f"| {lab} | {statistics.mean(own)*100:.1f} / {statistics.median(own)*100:.1f} ({len(own)}) "
                 f"| {statistics.mean(com)*100:.1f} / {statistics.median(com)*100:.1f} |")
    print(lines[-1])

Path(args.out).write_text("\n".join(lines), encoding="utf-8")
print("written:", args.out)
