"""Common-plausible AED/CCR + significance tests for verified DS-Coder-6.7B Defects4J runs.

Metric recomputation replicates scripts/recompute_d4j_metrics.py from the PAFT artifact:
AED = char Levenshtein on stripped raw text; CCR = SequenceMatcher over stripped raw lines.
"""
import argparse, json, math, random, statistics, difflib
from pathlib import Path
from Levenshtein import distance as lev

_parser = argparse.ArgumentParser(description=__doc__)
_parser.add_argument("--root", default=".", help="repo root containing defects4j/{dataset,results}")
_parser.add_argument("--out", default="analysis_outputs/tse_d4j_significance_common_plausible.md")
_args = _parser.parse_args()
ROOT = Path(_args.root) / "defects4j"
OUT = Path(_args.out)

MODELS = {  # label -> dir (verified against paper Tables 3/5/6 via pass@1+AED+CCR)
    "Base": "deepseek-6.7b",
    "SFT": "deepseek-6.7b-promptloss",
    "PAFT": "deepseek-6.7b-paft",
    "Prompting": "deepseek-6.7b-prompting",
    "RepairLLaMA": "deepseek-6.7b-repairllama",
    "AdaPatcher": "deepseek-6.7b-adapatcher",
}

def edit_distance(a, b):
    a, b = (a or "").strip(), (b or "").strip()
    if not a or not b:
        return 0
    return int(lev(a, b))

def ccr_percent(buggy, patch):
    bl = (buggy or "").strip().splitlines()
    pl = (patch or "").strip().splitlines()
    if not pl:
        return 0.0
    m = difflib.SequenceMatcher(None, bl, pl)
    preserved = sum(blk.size for blk in m.get_matching_blocks()[:-1])
    return preserved / len(pl) * 100

def load(label):
    d = ROOT / "results" / MODELS[label] / "fixed0"
    if not d.is_dir():
        for sub in sorted((ROOT / "results" / MODELS[label]).iterdir()):
            if (sub / "fixed0").is_dir():
                d = sub / "fixed0"
                break
    out = {}
    for p in sorted(d.glob("*.json.result")):
        bug = p.name[: -len(".json.result")]
        patches = json.loads(p.read_text(encoding="utf-8", errors="replace"))
        if isinstance(patches, list) and patches:
            out[bug] = patches[:10]
    return out

dataset = {p.stem: json.loads(p.read_text(encoding="utf-8", errors="replace")).get("buggy", "")
           for p in sorted((ROOT / "dataset").glob("*.json"))}
print(f"dataset bugs: {len(dataset)}")

data = {lab: load(lab) for lab in MODELS}
for lab, d in data.items():
    print(f"{lab:12s} bugs with results: {len(d)}")

# Per-bug stats: success count c (of 10), first-plausible patch metrics
stats = {}
for lab, d in data.items():
    per = {}
    for bug, patches in d.items():
        buggy = dataset.get(bug, "")
        c = sum(1 for p in patches if p.get("patch_status") == "PLAUSIBLE")
        fp = next((p for p in patches if p.get("patch_status") == "PLAUSIBLE"), None)
        per[bug] = {
            "n": len(patches), "c": c,
            "fp_aed": edit_distance(buggy, fp["patch_code"]) if fp else None,
            "fp_ccr": ccr_percent(buggy, fp["patch_code"]) if fp else None,
        }
    stats[lab] = per

lines = []
def emit(s=""):
    print(s); lines.append(s)

# --- A. Sanity: full-set recomputed pass@1 and pooled plausible AED/CCR ---
emit("## A. Sanity check vs paper Table 5 (pooled plausible patches, recomputed from text)")
emit("| method | bugs | pass@1 | plaus. patches | Avg AED | Med AED | Avg CCR | Med CCR |")
emit("|---|---:|---:|---:|---:|---:|---:|---:|")
for lab in MODELS:
    d = data[lab]
    aeds, ccrs = [], []
    for bug, patches in d.items():
        buggy = dataset.get(bug, "")
        for p in patches:
            if p.get("patch_status") == "PLAUSIBLE":
                aeds.append(edit_distance(buggy, p.get("patch_code", "")))
                ccrs.append(ccr_percent(buggy, p.get("patch_code", "")))
    p1 = statistics.mean(v["c"] / v["n"] for v in stats[lab].values()) * 100
    emit(f"| {lab} | {len(d)} | {p1:.2f} | {len(aeds)} | {statistics.mean(aeds):.2f} | "
         f"{statistics.median(aeds):.2f} | {statistics.mean(ccrs):.2f} | {statistics.median(ccrs):.2f} |")

# --- B. Common-plausible (first-plausible candidate per bug) ---
def common_block(labels):
    solved = [set(b for b, v in stats[l].items() if v["c"] > 0) for l in labels]
    common = sorted(set.intersection(*solved))
    rows = []
    for l in labels:
        aeds = [stats[l][b]["fp_aed"] for b in common]
        ccrs = [stats[l][b]["fp_ccr"] for b in common]
        rows.append((l, len(common),
                     statistics.mean(aeds) if aeds else 0, statistics.median(aeds) if aeds else 0,
                     statistics.mean(ccrs) if ccrs else 0, statistics.median(ccrs) if ccrs else 0))
    return common, rows

emit("")
emit("## B. Common-plausible subsets (first plausible candidate per bug)")
emit("| scope | method | common bugs | Avg AED | Med AED | Avg CCR | Med CCR |")
emit("|---|---|---:|---:|---:|---:|---:|")
for scope in [("Base", "SFT", "PAFT"), ("Base", "PAFT"), ("SFT", "PAFT"),
              ("Prompting", "PAFT"), ("RepairLLaMA", "PAFT"), ("AdaPatcher", "PAFT"),
              ("Base", "SFT", "PAFT", "Prompting", "RepairLLaMA", "AdaPatcher")]:
    common, rows = common_block(scope)
    tag = "+".join(scope)
    for (l, n, aa, ma, ac, mc) in rows:
        emit(f"| {tag} | {l} | {n} | {aa:.2f} | {ma:.2f} | {ac:.2f} | {mc:.2f} |")

# --- C. Significance: paired bootstrap on per-bug pass@1 + exact McNemar on solved ---
def paired_tests(l1, l2, iters=10000, seed=20260706):
    """l1 vs l2 on bugs present in both. Returns dict."""
    bugs = sorted(set(stats[l1]) & set(stats[l2]))
    x = [stats[l1][b]["c"] / stats[l1][b]["n"] for b in bugs]
    y = [stats[l2][b]["c"] / stats[l2][b]["n"] for b in bugs]
    delta = (statistics.mean(x) - statistics.mean(y)) * 100
    rng = random.Random(seed)
    n = len(bugs)
    deltas = []
    for _ in range(iters):
        idx = [rng.randrange(n) for _ in range(n)]
        deltas.append((sum(x[i] for i in idx) - sum(y[i] for i in idx)) / n * 100)
    deltas.sort()
    lo, hi = deltas[int(0.025 * iters)], deltas[int(0.975 * iters) - 1]
    p_boot = 2 * min(sum(1 for d in deltas if d <= 0) / iters, sum(1 for d in deltas if d >= 0) / iters)
    p_boot = min(1.0, max(p_boot, 1 / iters))
    # exact McNemar on bug-level solved indicator
    b01 = sum(1 for b in bugs if stats[l1][b]["c"] > 0 and stats[l2][b]["c"] == 0)
    b10 = sum(1 for b in bugs if stats[l1][b]["c"] == 0 and stats[l2][b]["c"] > 0)
    k, m = min(b01, b10), b01 + b10
    p_mcn = min(1.0, 2 * sum(math.comb(m, i) for i in range(k + 1)) * 0.5 ** m) if m else 1.0
    return dict(bugs=n, delta=delta, lo=lo, hi=hi, p_boot=p_boot, b01=b01, b10=b10, p_mcn=p_mcn)

emit("")
emit("## C. PAFT vs each method: paired bootstrap (10k, seed 20260706) + exact McNemar")
emit("| comparison | bugs | delta pass@1 (pp) | 95% CI | p(bootstrap) | solved-only PAFT/other | p(McNemar) |")
emit("|---|---:|---:|---|---:|---:|---:|")
for other in ["Base", "SFT", "Prompting", "RepairLLaMA", "AdaPatcher"]:
    r = paired_tests("PAFT", other)
    emit(f"| PAFT vs {other} | {r['bugs']} | +{r['delta']:.2f} | [{r['lo']:.2f}, {r['hi']:.2f}] | "
         f"{r['p_boot']:.4f} | {r['b01']}/{r['b10']} | {r['p_mcn']:.4f} |")

OUT.write_text("\n".join(lines), encoding="utf-8")
print(f"\nwritten: {OUT}")
