# -*- coding: utf-8 -*-
"""Edit-localization (precision/recall vs developer-changed lines) + uniform-thinning null
+ paired bootstrap CIs, for DS-Coder-6.7B and OpenCoder-8B (Base/SFT/PAFT), common-plausible
subset, first plausible candidate per bug. Same normalization as edit_loc_v2.py."""
import json, os, re, random, statistics
from pathlib import Path
from difflib import SequenceMatcher

ROOT = Path(r"C:\Users\ADMINI~1\AppData\Local\Temp\claude\C--Users-Administrator-paft-paper\f9e848c1-78b3-45ba-91f3-9e7432b08b84\scratchpad\d4j\defects4j")
rng = random.Random(20260710)

FAMILIES = {
    "DS-Coder-6.7B": {"Base": "deepseek-6.7b", "SFT": "deepseek-6.7b-promptloss", "PAFT": "deepseek-6.7b-paft"},
    "OpenCoder-8B": {"Base": "opencoder8b", "SFT": "opencoder8b-sft", "PAFT": "opencoder8b-paft"},
}

def norm_lines(code):
    code = re.sub(r"/\*.*?\*/", "", code or "", flags=re.DOTALL)
    out = []
    for ln in code.splitlines():
        s = ln.strip()
        if not s or s.startswith("//"):
            continue
        out.append(re.sub(r"\s+", " ", s))
    return out

def changed(buggy, other):
    sm = SequenceMatcher(None, buggy, other, autojunk=False)
    s = set()
    for tag, i1, i2, j1, j2 in sm.get_opcodes():
        if tag in ("replace", "delete"):
            s.update(range(i1, i2))
        elif tag == "insert":
            s.add(min(i1, len(buggy) - 1) if buggy else 0)
    return s

def load(mdir):
    d = ROOT / "results" / mdir / "fixed0"
    out = {}
    for p in sorted(d.glob("*.json.result")):
        bug = p.name[: -len(".json.result")]
        try:
            pts = json.loads(p.read_text(encoding="utf-8", errors="replace"))
        except Exception:
            continue
        if isinstance(pts, list) and pts:
            out[bug] = pts[:10]
    return out

DATASET = {p.stem: json.loads(p.read_text(encoding="utf-8", errors="replace")) for p in sorted((ROOT / "dataset").glob("*.json"))}
first_plaus = lambda ps: next((p for p in ps if p.get("patch_status") == "PLAUSIBLE"), None)

def paired_bootstrap_ci(deltas, iters=10000):
    if not deltas:
        return (0.0, 0.0, 0.0)
    n = len(deltas)
    means = []
    for _ in range(iters):
        sample = [deltas[rng.randrange(n)] for _ in range(n)]
        means.append(sum(sample) / n)
    means.sort()
    return (sum(deltas) / n, means[int(0.025 * iters)], means[int(0.975 * iters)])

for fam, MODELS in FAMILIES.items():
    data = {k: load(v) for k, v in MODELS.items()}
    solved = {k: {b for b, ps in data[k].items() if any(p.get("patch_status") == "PLAUSIBLE" for p in ps)} for k in MODELS}
    common = sorted(set.intersection(*solved.values()))
    print(f"\n#### {fam}: common-plausible bugs = {len(common)}")
    prec = {k: {} for k in MODELS}; rec = {k: {} for k in MODELS}; gsz = {k: {} for k in MODELS}
    for k in MODELS:
        for b in common:
            recd = DATASET[b]
            B, F = norm_lines(recd.get("buggy", "")), norm_lines(recd.get("fix", ""))
            D = changed(B, F)
            if not D: continue
            fp = first_plaus(data[k][b])
            if not fp: continue
            P = norm_lines(fp.get("patch_code", ""))
            G = changed(B, P)
            if not G: continue
            inter = len(G & D)
            prec[k][b] = inter / len(G); rec[k][b] = inter / len(D); gsz[k][b] = len(G)
    keys = set.intersection(*(set(prec[k]) for k in MODELS))
    m = lambda d: statistics.mean([d[b] for b in keys]) * 100
    print(f"| method | n | precision | recall |")
    for k in MODELS:
        print(f"| {k} | {len(keys)} | {m(prec[k]):.1f} | {m(rec[k]):.1f} |")
    # paired deltas PAFT - X on same bugs
    for other in ["Base", "SFT"]:
        dp = [(prec["PAFT"][b] - prec[other][b]) * 100 for b in keys]
        dr = [(rec["PAFT"][b] - rec[other][b]) * 100 for b in keys]
        mp, lo, hi = paired_bootstrap_ci(dp); mr, lor, hir = paired_bootstrap_ci(dr)
        print(f"  PAFT-{other}: dPrec {mp:+.1f} [95% CI {lo:+.1f},{hi:+.1f}]  dRec {mr:+.1f} [{lor:+.1f},{hir:+.1f}]")
    # uniform thinning null
    for src in ["Base", "SFT"]:
        vals = []
        for b in keys:
            recd = DATASET[b]
            B, F = norm_lines(recd.get("buggy", "")), norm_lines(recd.get("fix", ""))
            D = changed(B, F)
            fp = first_plaus(data[src][b])
            G = sorted(changed(B, norm_lines(fp.get("patch_code", ""))))
            if not G or not D: continue
            target = gsz["PAFT"].get(b, len(G))
            keep = min(max(target, 1), len(G))
            pr = []
            for _ in range(200):
                sub = set(rng.sample(G, keep))
                pr.append(len(sub & D) / len(sub))
            vals.append(statistics.mean(pr))
        print(f"  {src} thinned-to-PAFT-count precision: {statistics.mean(vals)*100:.1f} (actual {m(prec[src]):.1f})")
    # paired bug-level AED CIs (per-bug mean over plausible candidates), PAFT vs SFT/Base
    aed_bug = {k: {} for k in MODELS}
    try:
        from Levenshtein import distance as lev
    except Exception:
        lev = None
    def aed(a, b_):
        a = (a or "").strip(); b_ = (b_ or "").strip()
        if not a or not b_: return 0
        return lev(a, b_) if lev else 0
    for k in MODELS:
        for b, ps in data[k].items():
            buggy = DATASET.get(b, {}).get("buggy", "")
            vals = [aed(buggy, p.get("patch_code", "")) for p in ps if p.get("patch_status") == "PLAUSIBLE"]
            if vals: aed_bug[k][b] = statistics.mean(vals)
    for other in ["Base", "SFT"]:
        cb = sorted(set(aed_bug["PAFT"]) & set(aed_bug[other]))
        deltas = [aed_bug["PAFT"][b] - aed_bug[other][b] for b in cb]
        md_, lo, hi = paired_bootstrap_ci(deltas)
        print(f"  bug-level AED, PAFT-{other} on {len(cb)} common bugs: {md_:+.1f} [95% CI {lo:+.1f},{hi:+.1f}]")
