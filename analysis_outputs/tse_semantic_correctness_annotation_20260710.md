# Semantic-Correctness Annotation of First Plausible DS-Coder-6.7B Patches (2026-07-10)

Every first plausible Defects4J patch of the DS-Coder-6.7B Base / SFT(promptloss) / PAFT
settings (265 patches: 72 / 95 / 98) was independently judged by two experienced
annotators, blind to the generating method (rows shuffled with seed 42), against the
developer fix as semantic reference, with a three-way label
(correct / suspected test-suite overfitting / cannot judge).

- Inter-annotator agreement: 215/265 = 81.1%, Cohen's kappa (3-category) = 0.612.
- Neither annotator used "cannot judge".

| Method | Plausible bugs | Consensus correct | Rate | Annotator1 | Annotator2 |
|---|---:|---:|---:|---:|---:|
| Base | 72 | 35 | 48.6% | 59.7% | 55.6% |
| SFT (promptloss) | 95 | 39 | 41.1% | 52.6% | 50.5% |
| PAFT | 98 | 56 | 57.1% | 68.4% | 63.3% |

Consensus = both annotators judge the patch semantically correct. The PAFT > Base > SFT
ordering holds for each annotator individually. Consensus-correct bugs out of 371:
Base 35 (9.43%), SFT 39 (10.51%), PAFT 56 (15.09%).

Reproduce:
- item construction: `scripts/make_correctness_annotation_xlsx.py`
  (+ `scripts/correctness_annotation_rows.json`, blinding seed 42)
- merged labels: `scripts/correctness_annotation_labels_20260710.json`
- statistics: `scripts/compute_correctness_annotation_stats.py`
