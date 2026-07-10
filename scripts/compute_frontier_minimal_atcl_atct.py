# -*- coding: utf-8 -*-
"""Compute ATCL/ATCT (+ cross-check pass@1/AED/CCR) for the two frontier minimal dirs,
using the exact verified definitions that reproduced the base Table 1 rows."""
import difflib, json, re, glob, os
from pathlib import Path

EXTRACT = Path(r"C:\Users\ADMINI~1\AppData\Local\Temp\claude\C--Users-Administrator-paft-paper\eb46c17e-8414-409a-840b-a002dd8c9d70\scratchpad\frontier_minimal\defects4j\results")
DATASETDIR = Path(r"C:\Users\ADMINI~1\AppData\Local\Temp\claude\C--Users-Administrator-paft-paper\f9e848c1-78b3-45ba-91f3-9e7432b08b84\scratchpad\d4j\defects4j\dataset")
DATASET = {p.stem: json.loads(p.read_text(encoding="utf-8", errors="replace")) for p in DATASETDIR.glob("*.json")}

try:
    from Levenshtein import distance as lev
except Exception:
    lev = None
def aed(a, b):
    a = (a or "").strip(); b = (b or "").strip()
    if not a or not b: return 0
    return int(lev(a, b)) if lev else 0
def ccr_percent(buggy, patch):
    bl = (buggy or "").strip().splitlines(); pl = (patch or "").strip().splitlines()
    if not pl: return 0.0
    m = difflib.SequenceMatcher(None, bl, pl)
    return sum(b.size for b in m.get_matching_blocks()[:-1]) / len(pl) * 100
ct = lambda t: len(re.findall(r'\b\w+\b|[^\w\s]', t)) if t else 0
def atclt(buggy, patch):
    bl = (buggy or "").strip().splitlines(); pl = (patch or "").strip().splitlines()
    diff = list(difflib.ndiff(bl, pl))
    al = [l[2:] for l in diff if l.startswith('+ ')]; dl = [l[2:] for l in diff if l.startswith('- ')]
    return len(al) + len(dl), sum(ct(x) for x in al) + sum(ct(x) for x in dl)
mean = lambda v: sum(v) / len(v) if v else 0.0
med = lambda v: sorted(v)[len(v)//2] if v else 0.0

TARGETS = {"qwen3-max-minimal": (31.54, 99.38, 81.01),
           "dashscope-deepseek-v3-minimal-v3": (45.28, 106.18, 79.45)}

print(f"{'dir':34} {'pass@1':>7} {'avgAED':>7} {'avgCCR':>7} | {'ATCL':>6} {'ATCT':>6}  (n_plaus)")
for d, (p1t, aedt, ccrt) in TARGETS.items():
    fx = EXTRACT / d / "fixed0"
    aeds, ccrs, atcls, atcts = [], [], [], []
    pass_sum = 0.0; nval = 0
    for f in sorted(fx.glob("*.json.result")):
        bug = f.name[:-len(".json.result")]
        buggy = DATASET.get(bug, {}).get("buggy", "")
        try: ps = json.loads(f.read_text(encoding="utf-8", errors="replace"))
        except Exception: continue
        if not isinstance(ps, list) or not ps: continue
        nval += 1
        pl = [q for q in ps if isinstance(q, dict) and q.get("patch_status") == "PLAUSIBLE"]
        pass_sum += len(pl) / len(ps)
        for q in pl:
            code = q.get("patch_code", "")
            aeds.append(aed(buggy, code)); ccrs.append(ccr_percent(buggy, code))
            l, t = atclt(buggy, code); atcls.append(l); atcts.append(t)
    p1 = pass_sum / nval * 100 if nval else 0
    flag = "OK" if abs(p1 - p1t) < 0.6 and abs(mean(aeds) - aedt) < 1.5 and abs(mean(ccrs) - ccrt) < 1.5 else "MISMATCH"
    print(f"{d:34} {p1:>7.2f} {mean(aeds):>7.2f} {mean(ccrs):>7.2f} | {mean(atcls):>6.2f} {mean(atcts):>6.2f}  (n={len(aeds)})  [xcheck vs {p1t}/{aedt}/{ccrt}: {flag}]")
