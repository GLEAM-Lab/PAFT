# -*- coding: utf-8 -*-
"""Merge the two correctness-annotation workbooks with the blinded pid->method mapping
and compute per-method semantic-correctness rates + inter-annotator agreement."""
import json, os, random
from collections import Counter
from pathlib import Path
import openpyxl

SP = Path(os.environ["TEMP"]) / "claude" / "C--Users-Administrator-paft-paper" / "f9e848c1-78b3-45ba-91f3-9e7432b08b84" / "scratchpad"
rows = json.loads((SP / "annotation_rows.json").read_text(encoding="utf-8"))
rng = random.Random(42)
rng.shuffle(rows)
for i, r in enumerate(rows, 1):
    r["pid"] = f"P{i:03d}"
pid2 = {r["pid"]: r for r in rows}

def read_labels(path):
    wb = openpyxl.load_workbook(path, data_only=True)
    ws = wb["标注表"]
    out = {}
    for row in ws.iter_rows(min_row=2, values_only=True):
        pid, bug, title, buggy, patch, dev, label, note = row[:8]
        if pid:
            out[str(pid)] = (str(label).strip() if label else None, str(bug).strip() if bug else None)
    return out

A1 = read_labels(r"C:\Users\Administrator\Downloads\PAFT-补丁正确性标注表(1).xlsx")
A2 = read_labels(r"C:\Users\Administrator\Downloads\副本PAFT-补丁正确性标注表.xlsx")

# sanity: bug ids must match the mapping (guard against row reordering by annotators)
mismatch = [p for p in pid2 if p in A1 and A1[p][1] != pid2[p]["bug"]] + \
           [p for p in pid2 if p in A2 and A2[p][1] != pid2[p]["bug"]]
print(f"rows: mapping={len(pid2)} A1={len(A1)} A2={len(A2)}  bug-id mismatches: {len(set(mismatch))}")

lab_map = {"正确": "correct", "疑似过拟合": "overfit", "不确定": "unsure"}
def norm(l):
    return lab_map.get(l, l)

print("\n=== label distributions ===")
for name, A in [("Annotator1", A1), ("Annotator2", A2)]:
    print(name, Counter(norm(v[0]) for v in A.values()))

# agreement on common pids with both labels
common = [p for p in pid2 if A1.get(p, (None,))[0] and A2.get(p, (None,))[0]]
agree = sum(1 for p in common if norm(A1[p][0]) == norm(A2[p][0]))
print(f"\nagreement: {agree}/{len(common)} = {agree/len(common)*100:.1f}%")

# Cohen's kappa (3-category)
cats = ["correct", "overfit", "unsure"]
n = len(common)
po = agree / n
m1 = Counter(norm(A1[p][0]) for p in common)
m2 = Counter(norm(A2[p][0]) for p in common)
pe = sum((m1[c]/n) * (m2[c]/n) for c in cats)
kappa = (po - pe) / (1 - pe)
print(f"Cohen's kappa (3-cat): {kappa:.3f}")

print("\n=== disagreement matrix (A1 rows x A2 cols) ===")
mat = Counter((norm(A1[p][0]), norm(A2[p][0])) for p in common)
print(f"{'':10}" + "".join(f"{c:>10}" for c in cats))
for c1 in cats:
    print(f"{c1:10}" + "".join(f"{mat[(c1,c2)]:>10}" for c2 in cats))

print("\n=== per-method rates ===")
hdr = f"{'method':6} {'n':>4} | A1 correct | A2 correct | both-correct | either-overfit | any-unsure"
print(hdr)
for meth in ["Base", "SFT", "PAFT"]:
    pids = [p for p in common if pid2[p]["method"] == meth]
    nn = len(pids)
    a1c = sum(1 for p in pids if norm(A1[p][0]) == "correct")
    a2c = sum(1 for p in pids if norm(A2[p][0]) == "correct")
    both = sum(1 for p in pids if norm(A1[p][0]) == "correct" and norm(A2[p][0]) == "correct")
    ovf = sum(1 for p in pids if "overfit" in (norm(A1[p][0]), norm(A2[p][0])))
    uns = sum(1 for p in pids if "unsure" in (norm(A1[p][0]), norm(A2[p][0])))
    print(f"{meth:6} {nn:>4} | {a1c:>3} ({a1c/nn*100:4.1f}%) | {a2c:>3} ({a2c/nn*100:4.1f}%) | {both:>3} ({both/nn*100:4.1f}%) | {ovf:>3} ({ovf/nn*100:4.1f}%) | {uns}")

# correct-adjusted pass@1-style rate: fraction of the 371 bugs whose first plausible patch is both-correct
print("\n=== both-correct as fraction of 371 bugs (correctness-adjusted first-plausible rate) ===")
for meth in ["Base", "SFT", "PAFT"]:
    pids = [p for p in common if pid2[p]["method"] == meth]
    both = sum(1 for p in pids if norm(A1[p][0]) == "correct" and norm(A2[p][0]) == "correct")
    print(f"{meth:6}: {both}/371 = {both/371*100:.2f}%")

# save merged json for artifact
merged = []
for p in sorted(pid2):
    merged.append(dict(pid=p, bug=pid2[p]["bug"], method=pid2[p]["method"],
                       annotator1=norm(A1.get(p, (None,))[0]), annotator2=norm(A2.get(p, (None,))[0])))
outp = Path(__file__).parent / "correctness_annotation_merged.json"
json.dump(merged, outp.open("w", encoding="utf-8"), ensure_ascii=False, indent=1)
print(f"\nsaved -> {outp}")
