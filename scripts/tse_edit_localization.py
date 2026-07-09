"""Edit-localization + region-split copy analysis for Base/SFT/PAFT (DS-Coder, seed 42).

For each plausible patch, compare the model's changed buggy-line set to the DEVELOPER's
changed buggy-line set:
  edit precision = |model_changed & dev_changed| / |model_changed|   (edits land on the right place)
  edit recall    = |model_changed & dev_changed| / |dev_changed|     (edits cover the needed change)
Region-split copy:
  stable-preserve rate = fraction of developer-UNCHANGED buggy lines kept verbatim by the model
  change-edit rate     = fraction of developer-CHANGED  buggy lines the model actually modified
Distinguishes "copy stable, edit the right place" from "copy everything / under-edit".
"""
import json, os, re, statistics
from pathlib import Path
from difflib import SequenceMatcher

SP = Path(os.environ["TEMP"]) / "claude" / "C--Users-Administrator-paft-paper" / "f9e848c1-78b3-45ba-91f3-9e7432b08b84" / "scratchpad"
ROOT = SP / "d4j" / "defects4j"
OUT = SP / "edit_localization_out.md"

MODELS = {  # label -> dir (DS-Coder seed 42)
    "Base": "deepseek-6.7b",
    "SFT": "deepseek-6.7b-promptloss",
    "PAFT": "deepseek-6.7b-paft",
    "w0.0": "deepseek-6.7b-paft-0.0",
    "w2.0": "deepseek-6.7b-paft",   # PAFT default == w2.0
    "w4.0": "deepseek-6.7b-paft-4.0",
}

def norm_lines(code):
    """Whitespace-normalized, comment/blank-stripped lines (Java-ish)."""
    code = re.sub(r"/\*.*?\*/", "", code or "", flags=re.DOTALL)
    out = []
    for ln in code.splitlines():
        s = ln.strip()
        if not s or s.startswith("//"):
            continue
        out.append(re.sub(r"\s+", " ", s))
    return out

def changed_buggy_indices(buggy_lines, other_lines):
    """Set of buggy-line indices marked replace/delete (and insertion anchor points)."""
    sm = SequenceMatcher(None, buggy_lines, other_lines, autojunk=False)
    changed = set()
    for tag, i1, i2, j1, j2 in sm.get_opcodes():
        if tag in ("replace", "delete"):
            changed.update(range(i1, i2))
        elif tag == "insert":
            # anchor an insertion to the buggy line just before it (or 0)
            changed.add(min(i1, len(buggy_lines) - 1) if buggy_lines else 0)
    return changed

def preserved_buggy_indices(buggy_lines, patch_lines):
    """Buggy-line indices kept verbatim (in an 'equal' block) in the patch."""
    sm = SequenceMatcher(None, buggy_lines, patch_lines, autojunk=False)
    kept = set()
    for tag, i1, i2, j1, j2 in sm.get_opcodes():
        if tag == "equal":
            kept.update(range(i1, i2))
    return kept

def load_nested(mdir):
    d = ROOT / "results" / mdir / "fixed0"
    if not d.is_dir():
        for sub in sorted((ROOT / "results" / mdir).iterdir()):
            if (sub / "fixed0").is_dir():
                d = sub / "fixed0"; break
    out = {}
    for p in sorted(d.glob("*.json.result")):
        bug = p.name[: -len(".json.result")]
        try:
            patches = json.loads(p.read_text(encoding="utf-8", errors="replace"))
        except Exception:
            continue
        if isinstance(patches, list) and patches:
            out[bug] = patches[:10]
    return out

dataset = {p.stem: json.loads(p.read_text(encoding="utf-8", errors="replace"))
           for p in sorted((ROOT / "dataset").glob("*.json"))}

def analyze(mdir):
    data = load_nested(mdir)
    precs, recs, f1s = [], [], []
    stable_keep, change_edit = [], []
    n_patches = 0
    for bug, patches in data.items():
        rec = dataset.get(bug)
        if not rec:
            continue
        B = norm_lines(rec.get("buggy", ""))
        F = norm_lines(rec.get("fix", ""))
        if not B or not F:
            continue
        dev_changed = changed_buggy_indices(B, F)
        stable = set(range(len(B))) - dev_changed
        if not dev_changed:
            continue
        for pt in patches:
            if pt.get("patch_status") != "PLAUSIBLE":
                continue
            P = norm_lines(pt.get("patch_code", ""))
            if not P:
                continue
            n_patches += 1
            model_changed = changed_buggy_indices(B, P)
            kept = preserved_buggy_indices(B, P)
            inter = len(model_changed & dev_changed)
            prec = inter / len(model_changed) if model_changed else (1.0 if not dev_changed else 0.0)
            rec_ = inter / len(dev_changed) if dev_changed else 1.0
            f1 = 2 * prec * rec_ / (prec + rec_) if (prec + rec_) else 0.0
            precs.append(prec); recs.append(rec_); f1s.append(f1)
            if stable:
                stable_keep.append(len(kept & stable) / len(stable))
            change_edit.append(len(model_changed & dev_changed) / len(dev_changed))
    m = lambda v: statistics.mean(v) if v else 0.0
    return {
        "n_plausible": n_patches,
        "edit_prec": m(precs) * 100, "edit_rec": m(recs) * 100, "edit_f1": m(f1s) * 100,
        "stable_keep": m(stable_keep) * 100, "change_edit": m(change_edit) * 100,
    }

lines = []
def emit(s=""):
    print(s); lines.append(s)

emit("## Edit-localization and region-split copy behavior (DS-Coder-6.7B, seed 42, plausible patches)")
emit("| method | n_plaus | edit precision | edit recall | edit F1 | stable-preserve | change-region edit |")
emit("|---|---:|---:|---:|---:|---:|---:|")
for lab in ["Base", "SFT", "PAFT"]:
    r = analyze(MODELS[lab])
    emit(f"| {lab} | {r['n_plausible']} | {r['edit_prec']:.1f} | {r['edit_rec']:.1f} | {r['edit_f1']:.1f} | {r['stable_keep']:.1f} | {r['change_edit']:.1f} |")

emit("")
emit("## w_align sweep (mechanism vs outcome)")
emit("| w_align | n_plaus | edit precision | edit recall | edit F1 | stable-preserve | change-region edit |")
emit("|---|---:|---:|---:|---:|---:|---:|")
for lab in ["w0.0", "w2.0", "w4.0"]:
    r = analyze(MODELS[lab])
    emit(f"| {lab} | {r['n_plausible']} | {r['edit_prec']:.1f} | {r['edit_rec']:.1f} | {r['edit_f1']:.1f} | {r['stable_keep']:.1f} | {r['change_edit']:.1f} |")

OUT.write_text("\n".join(lines), encoding="utf-8")
print("\nwritten:", OUT)
