"""Edit-localization on the COMMON-PLAUSIBLE subset (paired, per-bug first plausible)
plus the uniform-thinning null: if PAFT merely edits FEWER lines (uniform timidity),
precision = in/(in+out) stays flat under random subsampling of the base model's edits
to PAFT's edit count. Precision rising ABOVE that null = genuine localization.
"""
import json, os, re, random, statistics
from pathlib import Path
from difflib import SequenceMatcher

SP = Path(os.environ["TEMP"]) / "claude" / "C--Users-Administrator-paft-paper" / "f9e848c1-78b3-45ba-91f3-9e7432b08b84" / "scratchpad"
ROOT = SP / "d4j" / "defects4j"
rng = random.Random(20260709)

MODELS = {"Base": "deepseek-6.7b", "SFT": "deepseek-6.7b-promptloss", "PAFT": "deepseek-6.7b-paft"}

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
        pts = json.loads(p.read_text(encoding="utf-8", errors="replace"))
        if isinstance(pts, list) and pts:
            out[bug] = pts[:10]
    return out

dataset = {p.stem: json.loads(p.read_text(encoding="utf-8", errors="replace")) for p in sorted((ROOT / "dataset").glob("*.json"))}
data = {k: load(v) for k, v in MODELS.items()}

def first_plaus(patches):
    return next((p for p in patches if p.get("patch_status") == "PLAUSIBLE"), None)

# common-plausible bug set: solved (>=1 plausible) by all three
solved = {k: {b for b, ps in data[k].items() if any(p.get("patch_status") == "PLAUSIBLE" for p in ps)} for k in MODELS}
common = sorted(set.intersection(*solved.values()))
print(f"common-plausible bugs (Base & SFT & PAFT): {len(common)}")

def metrics_on(common_bugs):
    res = {}
    for k in MODELS:
        precs, recs, f1s, G_sizes = [], [], [], []
        for b in common_bugs:
            rec = dataset[b]
            B, F = norm_lines(rec.get("buggy", "")), norm_lines(rec.get("fix", ""))
            D = changed(B, F)
            if not D:
                continue
            fp = first_plaus(data[k][b])
            if not fp:
                continue
            P = norm_lines(fp.get("patch_code", ""))
            G = changed(B, P)
            if not G:
                continue
            inter = len(G & D)
            precs.append(inter / len(G)); recs.append(inter / len(D))
            f1s.append(2 * precs[-1] * recs[-1] / (precs[-1] + recs[-1]) if (precs[-1] + recs[-1]) else 0)
            G_sizes.append(len(G))
        m = lambda v: statistics.mean(v) * 100 if v else 0
        res[k] = dict(n=len(precs), prec=m(precs), rec=m(recs), f1=m(f1s), gsize=statistics.mean(G_sizes) if G_sizes else 0)
    return res

r = metrics_on(common)
print("\n## Common-plausible paired edit-localization (first plausible per bug)")
print("| method | n | precision | recall | F1 | mean |G| |")
print("|---|---:|---:|---:|---:|---:|")
for k in MODELS:
    print(f"| {k} | {r[k]['n']} | {r[k]['prec']:.1f} | {r[k]['rec']:.1f} | {r[k]['f1']:.1f} | {r[k]['gsize']:.2f} |")

# ---- uniform-thinning null ----
# For Base and SFT, randomly subsample each patch's edited lines (G) down to PAFT's
# per-bug edit count, recompute precision; if PAFT precision > thinned-baseline precision,
# the localization gain is NOT explained by editing fewer lines uniformly.
print("\n## Uniform-thinning null (does 'edit fewer lines' alone explain PAFT precision?)")
paft_gsize = {}
for b in common:
    rec = dataset[b]; B, F = norm_lines(rec.get("buggy","")), norm_lines(rec.get("fix",""))
    fp = first_plaus(data["PAFT"][b])
    if fp:
        paft_gsize[b] = len(changed(B, norm_lines(fp.get("patch_code",""))))

def thinned_precision(src, trials=200):
    vals = []
    for b in common:
        rec = dataset[b]; B, F = norm_lines(rec.get("buggy","")), norm_lines(rec.get("fix",""))
        D = changed(B, F)
        if not D: continue
        fp = first_plaus(data[src][b])
        if not fp: continue
        G = sorted(changed(B, norm_lines(fp.get("patch_code",""))))
        if not G: continue
        target = paft_gsize.get(b, len(G))
        keep = min(max(target, 1), len(G))
        pr = []
        for _ in range(trials):
            sub = set(rng.sample(G, keep))
            inter = len(sub & D)
            pr.append(inter / len(sub))
        vals.append(statistics.mean(pr))
    return statistics.mean(vals) * 100 if vals else 0

base_thin = thinned_precision("Base")
sft_thin = thinned_precision("SFT")
print(f"Base precision if thinned to PAFT edit-count: {base_thin:.1f}  (actual Base {r['Base']['prec']:.1f})")
print(f"SFT  precision if thinned to PAFT edit-count: {sft_thin:.1f}  (actual SFT  {r['SFT']['prec']:.1f})")
print(f"PAFT actual precision: {r['PAFT']['prec']:.1f}")
print("-> If PAFT precision >> thinned-baseline precision, the gain is genuine localization, not uniform edit-shrinkage.")
