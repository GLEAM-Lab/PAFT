# -*- coding: utf-8 -*-
"""Master Defects4J metrics: per model dir compute
- pass1_est (mean c/10 over validated bugs) and fixed0_pass (n=1)
- pooled (all plausible candidates) avg/med AED, CCR
- fixed0-only plausible avg/med AED, CCR
- bug-level (per-bug mean over plausible candidates, then across bugs) avg/med AED, CCR
- ATCL (mean added+deleted lines from result diff_stats over plausible) + recomputed line/token diffs
- no-op decomposition on first candidates: byte-identical / whitespace-only / empty-extraction
Metric defs copied from artifact scripts/recompute_d4j_pass1_metrics.py (strip-only, SequenceMatcher CCR).
"""
import difflib, json, re, statistics, sys, os, glob
from pathlib import Path

ROOT = Path(r"C:\Users\ADMINI~1\AppData\Local\Temp\claude\C--Users-Administrator-paft-paper\f9e848c1-78b3-45ba-91f3-9e7432b08b84\scratchpad\d4j\defects4j")

def edit_distance(a, b):
    a = (a or "").strip(); b = (b or "").strip()
    if not a or not b: return 0
    if len(a) < len(b): a, b = b, a
    prev = list(range(len(b) + 1))
    for i, ca in enumerate(a, 1):
        curr = [i]
        for j, cb in enumerate(b, 1):
            curr.append(min(prev[j] + 1, curr[j - 1] + 1, prev[j - 1] + (ca != cb)))
        prev = curr
    return prev[-1]

def ccr_percent(buggy, patch):
    bl = (buggy or "").strip().splitlines(); pl = (patch or "").strip().splitlines()
    if not pl: return 0.0
    m = difflib.SequenceMatcher(None, bl, pl)
    pres = sum(b.size for b in m.get_matching_blocks()[:-1])
    return pres / len(pl) * 100

def line_token_diff(buggy, patch):
    bl = [l.strip() for l in (buggy or "").strip().splitlines()]
    pl = [l.strip() for l in (patch or "").strip().splitlines()]
    sm = difflib.SequenceMatcher(None, bl, pl)
    add = dele = 0
    for tag, i1, i2, j1, j2 in sm.get_opcodes():
        if tag in ("replace", "delete"): dele += i2 - i1
        if tag in ("replace", "insert"): add += j2 - j1
    tok = lambda s: re.findall(r"\w+|[^\w\s]", s or "")
    bt, pt = tok((buggy or "").strip()), tok((patch or "").strip())
    smt = difflib.SequenceMatcher(None, bt, pt)
    addt = delt = 0
    for tag, i1, i2, j1, j2 in smt.get_opcodes():
        if tag in ("replace", "delete"): delt += i2 - i1
        if tag in ("replace", "insert"): addt += j2 - j1
    return add + dele, addt + delt

mean = lambda v: float(sum(v) / len(v)) if v else 0.0
med = lambda v: float(statistics.median(v)) if v else 0.0

try:
    from Levenshtein import distance as _lev
    def edit_distance(a, b):  # noqa: F811
        a = (a or "").strip(); b = (b or "").strip()
        if not a or not b: return 0
        return int(_lev(a, b))
except Exception:
    pass

DATASET = {p.stem: json.loads(p.read_text(encoding="utf-8", errors="replace")) for p in (ROOT / "dataset").glob("*.json")}

def analyze(model, subdir=None):
    d = ROOT / "results" / model
    if subdir: d = d / subdir
    fx = d / "fixed0"
    rows = {}
    for p in sorted(fx.glob("*.json.result")):
        bug = p.name[:-len(".json.result")]
        try: rows[bug] = json.loads(p.read_text(encoding="utf-8", errors="replace"))
        except Exception: pass
    n_val = len(rows)
    pooled_aed, pooled_ccr, pooled_atcl_ds = [], [], []
    pooled_l, pooled_t = [], []
    f0_aed, f0_ccr = [], []
    bug_aed, bug_ccr = [], []
    per_bug_mean_aed = {}
    pass1_sum = 0.0; f0_pass = 0; plaus_total = 0; solved = 0
    noop_ident = noop_ws = noop_empty = 0; f0_total = 0; plaus_noop = 0
    firstcand_aed = []
    for bug, patches in rows.items():
        buggy = DATASET.get(bug, {}).get("buggy", "")
        if not isinstance(patches, list): continue
        pls = [p for p in patches if isinstance(p, dict) and p.get("patch_status") == "PLAUSIBLE"]
        c = len(pls); plaus_total += c
        pass1_sum += c / max(len(patches), 1)
        if c: solved += 1
        b_aed, b_ccr = [], []
        for p in pls:
            code = p.get("patch_code", "")
            aed = edit_distance(buggy, code); ccr = ccr_percent(buggy, code)
            pooled_aed.append(aed); pooled_ccr.append(ccr)
            b_aed.append(aed); b_ccr.append(ccr)
            ds = p.get("diff_stats") or {}
            if "added_lines" in ds: pooled_atcl_ds.append(ds.get("added_lines", 0) + ds.get("deleted_lines", 0))
            lt, tt = line_token_diff(buggy, code)
            pooled_l.append(lt); pooled_t.append(tt)
        if b_aed:
            bug_aed.append(mean(b_aed)); bug_ccr.append(mean(b_ccr))
            per_bug_mean_aed[bug] = mean(b_aed)
        if patches:
            f0 = patches[0] if isinstance(patches[0], dict) else {}
            f0_total += 1
            code0 = f0.get("patch_code", "")
            if f0.get("patch_status") == "PLAUSIBLE":
                f0_pass += 1
                f0_aed.append(edit_distance(buggy, code0)); f0_ccr.append(ccr_percent(buggy, code0))
            if not (code0 or "").strip():
                noop_empty += 1
            elif code0 == buggy:
                noop_ident += 1
            elif re.sub(r"\s+", "", code0) == re.sub(r"\s+", "", buggy):
                noop_ws += 1
            if (code0 or "").strip():
                firstcand_aed.append(edit_distance(buggy, code0))
            for p in pls:
                if re.sub(r"\s+", "", p.get("patch_code", "") or "") == re.sub(r"\s+", "", buggy): plaus_noop += 1
    out = dict(model=model, n_val=n_val, solved=solved, plaus=plaus_total,
        pass1_est=round(pass1_sum / n_val * 100, 2) if n_val else 0,
        pass1_371=round(pass1_sum / 371 * 100, 2),
        fixed0_pass=round(f0_pass / n_val * 100, 2) if n_val else 0,
        pooled_aed=round(mean(pooled_aed), 2), pooled_med_aed=round(med(pooled_aed), 2),
        pooled_ccr=round(mean(pooled_ccr), 2), pooled_med_ccr=round(med(pooled_ccr), 2),
        bug_aed=round(mean(bug_aed), 2), bug_med_aed=round(med(bug_aed), 2),
        bug_ccr=round(mean(bug_ccr), 2), bug_med_ccr=round(med(bug_ccr), 2),
        f0_aed=round(mean(f0_aed), 2), f0_med_aed=round(med(f0_aed), 2),
        f0_ccr=round(mean(f0_ccr), 2), f0_med_ccr=round(med(f0_ccr), 2),
        atcl_ds=round(mean(pooled_atcl_ds), 2), atcl_re=round(mean(pooled_l), 2), atct_re=round(mean(pooled_t), 2),
        noop_ident=noop_ident, noop_ws=noop_ws, noop_empty=noop_empty, f0_total=f0_total, plaus_noop=plaus_noop,
        firstcand_aed=round(mean(firstcand_aed), 2))
    return out, per_bug_mean_aed

MODELS = [
    ("deepseek-6.7b", None), ("deepseek-6.7b-promptloss", None), ("deepseek-6.7b-paft", None),
    ("deepseek-6.7b-trained-curriculum", None), ("deepseek-6.7b-paft-assistantonly", None),
    ("deepseek-6.7b-prompting", None), ("deepseek-6.7b-repairllama", None),
    ("deepseek-6.7b-adapatcher", "deepseek-6.7b-adapatcher"),
    ("deepseek-6.7b-paft-0.0", "deepseek-6.7b-trained-prorepair-0.0"),
    ("deepseek-6.7b-paft-4.0", "deepseek-6.7b-trained-prorepair-4.0"),
    ("qwen3-8b", None), ("qwen3-8b-sft", None), ("qwen3-8b-paft", None),
    ("opencoder8b", None), ("opencoder8b-sft", None), ("opencoder8b-paft", None),
    ("deepseek-v3", None), ("qwen3-max", None),
]

if __name__ == "__main__":
    only = sys.argv[1:] if len(sys.argv) > 1 else None
    results = {}
    per_bug = {}
    for m, sub in MODELS:
        if only and m not in only: continue
        try:
            r, pb = analyze(m, sub)
            results[m] = r; per_bug[m] = pb
        except Exception as e:
            print(f"{m}: ERROR {e}")
    hdr = ["model","n_val","pass1_est","pass1_371","fixed0_pass","pooled_aed","pooled_med_aed","pooled_ccr","pooled_med_ccr",
           "bug_aed","bug_med_aed","bug_ccr","bug_med_ccr","atcl_ds","atcl_re","atct_re",
           "noop_ident","noop_ws","noop_empty","plaus_noop","firstcand_aed"]
    print("|" + "|".join(hdr) + "|")
    for m, r in results.items():
        print("|" + "|".join(str(r.get(k, "")) for k in hdr) + "|")
    outp = Path(__file__).parent / "d4j_master_metrics.json"
    json.dump({"summary": results, "per_bug_mean_aed": per_bug}, outp.open("w", encoding="utf-8"))
    print(f"\nsaved -> {outp}")
