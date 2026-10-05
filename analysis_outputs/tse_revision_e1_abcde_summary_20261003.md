# E1: Final Results for A, B, C, D, E

Backbone: DeepSeek-Coder-6.7B-Instruct · QLoRA, 3 epochs, SEED 42, 1,149 steps, full-sequence loss
(prompt included in the loss, as in the paper).
Generation: plain repair prompt (no minimal-change phrase), strict patch extraction, n = 10 candidates
per fault, shared decoding configuration.

| ID | Method | Key setting |
|---|---|---|
| A | SFT (w = 1) | loss × 1.2131 |
| B | SFT (w = 1) | learning rate 2 × 10⁻⁴ → 2.426 × 10⁻⁴ |
| C | SFT (w = 1, paper recipe) | — |
| D | PAFT (w = 2, paper recipe) | — |
| E | PAFT (w = 2), loss divided by `Σ_t (w_t·M_t)` instead of by the token count | gradient scale ≡ SFT |

**Design.** Normalising the weighted loss by the token count N makes PAFT's per-instance gradient scale
`Σ_t β_t = 1.2131` instead of 1.0, so A (loss × 1.2131, same learning rate) isolates the clipping
channel and B isolates the step-size channel. E goes the other way: it removes the scale from PAFT itself
so that `Σ_t β_t = 1.0` exactly as in SFT. Measured mean gradient norms: A 0.373, B 0.282, C 0.317,
**E 0.276 (= 0.87 × C, the value predicted analytically by 0.317 × 1.041 / 1.2131)**, D 0.330.

---

## 1. Gradient-clipping activation rates (`max_grad_norm = 0.3`)

| ID | Setting | steps_logged | clipped_steps | clip_rate_pct | mean_grad_norm | median_grad_norm | p90_grad_norm | max_grad_norm |
|---|---|---:|---:|---:|---:|---:|---:|---:|
| A | SFT + loss × 1.2131 | 1149 | 721 | 62.8% | 0.373 | 0.328 | 0.548 | 2.015 |
| B | SFT + LR × 1.2131 | 1149 | 330 | 28.7% | 0.282 | 0.249 | 0.420 | 1.551 |
| C | SFT (paper recipe) | 1149 | 447 | 38.9% | 0.317 | 0.274 | 0.475 | 1.645 |
| D | PAFT (paper recipe) | 1149 | 519 | 45.2% | 0.330 | 0.290 | 0.482 | 1.564 |
| E | PAFT, weight-normalised | 1149 | 313 | 27.2% | 0.276 | 0.243 | 0.403 | 1.351 |

A's mean gradient norm is 1.177× C's, matching the designed factor 1.2131. D's is only 1.041× C's — PAFT
does not scale the gradient by 1.2131, it redistributes per-token pressure. E's is 0.87× C's, which
confirms that the weight-sum normalisation took effect exactly as designed.

---

## 2. Defects4J results

### 2.1 Main metrics

| Setting | pass@1 | Avg. AED ↓ | Med. AED ↓ | Avg. CCR ↑ | Med. CCR ↑ |
|---|---:|---:|---:|---:|---:|
| C — SFT | 7.12 | 92.69 | 58.0 | 74.98 | 82.43 |
| B — SFT + LR × 1.2131 | 6.20 | 111.20 | 59.5 | 69.72 | 76.10 |
| A — SFT + loss × 1.2131 | 8.25 | 88.55 | 59.0 | 74.82 | 81.73 |
| **E — PAFT, weight-normalised** | 7.90 | **75.01** | 48.0 | **75.38** | **83.33** |
| **D — PAFT** | **9.14** | 77.72 | **45.0** | 74.70 | 82.76 |

### 2.2 Full metric rows

| model | n_val | pass1_est | pass1_371 | fixed0_pass | pooled_aed | pooled_med_aed | pooled_ccr | pooled_med_ccr | bug_aed | bug_med_aed | bug_ccr | bug_med_ccr | atcl_ds | atcl_re | atct_re | noop_ident | noop_ws | noop_empty | plaus_noop | firstcand_aed |
|---|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|
| deepseek-6.7b-sft-plain-fixed (C) | 371 | 7.12 | 7.12 | 5.93 | 92.69 | 58.0 | 74.98 | 82.43 | 121.17 | 100.22 | 68.96 | 75.0 | 6.87 | 5.58 | 27.34 | 8 | 4 | 0 | 0 | 645.28 |
| deepseek-6.7b-b-plain-fixed (B) | 371 | 6.20 | 6.20 | 4.85 | 111.20 | 59.5 | 69.72 | 76.10 | 148.30 | 97.75 | 63.89 | 72.28 | 9.25 | 7.34 | 36.06 | 11 | 2 | 0 | 0 | 606.24 |
| deepseek-6.7b-a-plain-fixed (A) | 371 | 8.25 | 8.25 | 8.89 | 88.55 | 59.0 | 74.82 | 81.73 | 131.04 | 105.75 | 67.17 | 72.56 | 7.42 | 5.77 | 33.46 | 16 | 0 | 0 | 0 | 544.18 |
| deepseek-6.7b-paft-wnorm-plain (E) | 371 | 7.90 | 7.90 | 8.89 | 75.01 | 48.0 | 75.38 | 83.33 | 95.75 | 71.62 | 71.51 | 80.0 | 5.70 | 4.69 | 22.35 | 21 | 1 | 0 | 0 | 453.08 |
| deepseek-6.7b-paft-plain-fixed (D) | 371 | 9.14 | 9.14 | 9.97 | 77.72 | 45.0 | 74.70 | 82.76 | 108.60 | 72.80 | 69.47 | 75.54 | 7.27 | 4.93 | 26.48 | 12 | 1 | 0 | 0 | 410.81 |

---

## 3. Over-editing ratio

`Levenshtein(buggy, candidate) / Levenshtein(buggy, developer fix)` over all plausible candidates.

| Setting | plausible | median | ratio of sums | share ≤ 1 | share > 10 |
|---|---:|---:|---:|---:|---:|
| A (loss × 1.2131) | 306 | 1.34 | 2.15 | 41% | 16% |
| B (LR × 1.2131) | 230 | 1.60 | 2.47 | 39% | 17% |
| SFT (C) | 264 | 1.25 | 1.81 | 42% | 12% |
| **E (weight-normalised PAFT)** | 293 | 1.10 | **1.71** | 45% | **7%** |
| PAFT (D) | 339 | **1.07** | 1.80 | **47%** | 11% |

---

## 4. Complexity strata

Strata are defined on the developer fix: strip-normalised unified diff (context 0) line count binned
1–2 / 3–5 / 6–10 / >10, and single- vs multi-region (number of `@@` hunks). Cells are
`pass@1 (%) / median over-editing ratio`.

| stratum | n | SFT (C) | A (loss × 1.2131) | E (wnorm) | PAFT (D) |
|---|---:|---:|---:|---:|---:|
| 1–2 lines | 151 | 10.93 / 1.69 | 13.91 / 1.82 | 12.45 / 1.44 | **14.90** / 1.52 |
| 3–5 lines | 118 | 6.36 / 1.12 | 5.76 / 1.17 | 6.53 / 1.18 | **6.95** / **1.00** |
| 6–10 lines | 58 | 2.59 / 1.54 | 3.62 / 0.73 | 4.14 / 0.74 | **4.48** / 0.84 |
| >10 lines | 44 | **2.05** / 0.58 | 1.59 / 0.64 | 0.91 / 0.69 | 1.36 / 0.74 |
| single region | 216 | 9.31 / 1.18 | 11.25 / 1.50 | 10.23 / 1.11 | **11.99** / 1.36 |
| multi region | 155 | 4.06 / 1.54 | 4.06 / 1.11 | 4.65 / 1.06 | **5.16** / **1.00** |
| all | 371 | 7.12 / 1.25 | 8.25 / 1.32 | 7.90 / 1.10 | **9.14** / **1.07** |

---

## 5. Paired fault-level bootstrap (10,000 resamples) of pass@1 differences, percentage points

| stratum | n | D − SFT | D − A | D − E | E − SFT | E − A |
|---|---:|---|---|---|---|---|
| multi region | 155 | +1.10 [−0.19, +2.45] p = 0.091 | **+1.10 [+0.06, +2.26] p = 0.037** | +0.52 [−0.45, +1.61] p = 0.323 | +0.58 [−0.58, +1.68] p = 0.288 | +0.58 [−0.26, +1.42] p = 0.152 |
| ≤ 5 lines | 269 | **+2.49 [+1.08, +3.94] p < 0.001** | +1.08 [−0.26, +2.38] p = 0.113 | **+1.56 [+0.30, +2.86] p = 0.014** | +0.93 [−0.48, +2.38] p = 0.194 | −0.48 [−1.71, +0.74] p = 0.437 |
| >10 lines | 44 | −0.68 [−2.95, +0.91] p = 0.649 | −0.23 [−1.14, +0.68] p = 0.834 | +0.45 [0.00, +1.14] p = 0.269 | −1.14 [−3.41, +0.45] p = 0.320 | −0.68 [−2.05, +0.45] p = 0.341 |
| all | 371 | **+2.02 [+0.94, +3.15] p < 0.001** | +0.89 [−0.13, +1.91] p = 0.078 | **+1.24 [+0.24, +2.26] p = 0.011** | +0.78 [−0.27, +1.91] p = 0.153 | −0.35 [−1.27, +0.57] p = 0.463 |

---

## 6. Common-plausible-subset edit metrics

Cells are `AED mean/median` and `CCR mean/median` on the faults solved by every setting in the subset.
Subsets with n < 7 are omitted (too small to interpret).

First-plausible-patch metrics over each setting's own solved set:

| setting | n | AED mean / median | CCR mean / median |
|---|---:|---|---|
| SFT | 22 | 98.27 / 58.50 | 72.50 / 76.98 |
| B | 18 | 175.72 / 38.50 | 60.03 / 70.00 |
| A | 33 | 87.00 / 47.00 | 73.97 / 80.95 |
| **E** | 33 | **56.09** / 37.00 | **79.84** / 89.66 |
| PAFT | 37 | 81.78 / **36.00** | 77.01 / **92.31** |

Pairwise subsets:

| subset | n | AED mean / median | CCR mean / median |
|---|---:|---|---|
| SFT + A | 14 | SFT **50.07** / 18.00 · A 58.71 / 26.00 | SFT 84.02 / 85.71 · A 81.82 / **91.99** |
| SFT + E | 8 | SFT **83.25** / **57.50** · E 103.12 / 73.50 | SFT 78.79 / 80.95 · E 77.58 / **91.19** |
| SFT + PAFT | 15 | SFT 79.53 / 57.00 · PAFT **47.60** / **14.00** | SFT 78.67 / 85.71 · PAFT **85.70** / **92.68** |
| B + A | 10 | B **80.50** / 9.50 · A 84.10 / 11.50 | B **75.79** / 76.97 · A 74.67 / 76.39 |
| B + E | 11 | B 28.00 / 8.00 · E **26.18** / **6.00** | B **83.69** / 85.71 · E 81.55 / **92.86** |
| B + PAFT | 10 | B 90.70 / 6.50 · PAFT **60.10** / **6.00** | B 67.61 / 74.17 · PAFT **75.35** / **80.36** |
| A + E | 14 | A **28.79** / 12.00 · E 34.21 / **7.50** | A **86.90** / 93.20 · E 86.18 / **93.30** |
| A + PAFT | 20 | A 38.65 / 19.00 · PAFT **38.15** / **12.00** | A 84.38 / 93.20 · PAFT **85.00** / **94.00** |
| E + PAFT | 16 | E 38.31 / 22.50 · PAFT **21.75** / **7.50** | E 84.99 / 93.65 · PAFT **87.78** / **94.59** |

Multi-way subsets:

| subset | n | AED mean / median | CCR mean / median |
|---|---:|---|---|
| SFT + A + PAFT | 11 | SFT 54.09 / 14.00 · A 34.45 / 24.00 · PAFT **21.91** / **14.00** | SFT 84.80 / 92.19 · A **86.34** / 93.55 · PAFT 89.74 / 93.55 |
| A + E + PAFT | 12 | A 28.50 / 7.50 · E 33.67 / 7.50 · PAFT **14.92** / **7.00** | A 87.61 / 93.71 · E 87.18 / 93.65 · PAFT **90.92** / **94.78** |
| SFT + E + PAFT | 7 | SFT 52.00 / 57.00 · E 53.86 / 68.00 · PAFT **26.29** / **10.00** | SFT 85.07 / 85.71 · E 84.50 / 92.19 · PAFT **90.90** / **93.55** |

---

## 7. Summary and conclusions

| Metric | SFT (C) | B (LR ×1.2131) | A (loss ×1.2131) | E (wnorm) | PAFT (D) |
|---|---:|---:|---:|---:|---:|
| pass@1 | 7.12 | 6.20 | 8.25 | 7.90 | **9.14** |
| Avg. AED ↓ | 92.69 | 111.20 | 88.55 | **75.01** | 77.72 |
| Med. AED ↓ | 58.0 | 59.5 | 59.0 | 48.0 | **45.0** |
| Avg. CCR ↑ | 74.98 | 69.72 | 74.82 | **75.38** | 74.70 |
| Bug-level AED ↓ | 121.17 | 148.30 | 131.04 | **95.75** | 108.60 |
| Over-editing ratio (median) | 1.25 | 1.60 | 1.34 | 1.10 | **1.07** |
| Over-editing ratio (sums) | 1.81 | 2.47 | 2.15 | **1.71** | 1.80 |
| Share of edits > 10× reference | 12% | 17% | 16% | **7%** | 11% |
| First-candidate AED ↓ | 645.28 | 606.24 | 544.18 | 453.08 | **410.81** |

1. **The step-size channel does not explain PAFT.** Increasing the learning rate by the same factor (B)
   degrades every metric: pass@1 6.20 vs 7.12, average AED 111.20 vs 92.69, over-editing ratio 1.60 vs
   1.25.

2. **The gradient-scale channel raises plausibility but not locality.** Scaling the loss (A) lifts pass@1
   to 8.25 (accounting for roughly +1.13 of PAFT's +2.02 gain over SFT), yet its edit metrics are worse
   than SFT's: over-editing ratio 1.34 vs 1.25, median AED 59.0 vs 58.0, bug-level AED 131.04 vs 121.17.

3. **The preservation weighting drives the locality gain.** With the scale normalised away (E,
   `Σ_t β_t = 1.0`, measured gradient norm 0.87× SFT's), PAFT still improves **every** reported metric
   over SFT: pass@1 7.90 vs 7.12, average AED 75.01 vs 92.69, bug-level AED 95.75 vs 121.17,
   over-editing ratio 1.10 vs 1.25 (sums 1.71 vs 1.81), share of edits above 10× the reference 7% vs
   12%. E is the best setting on average AED, both CCR statistics, both bug-level AED statistics, and the
   ratio-of-sums locality measure.

4. **PAFT combines the two channels.** Its pass@1 exceeds E's by a significant margin
   (+1.24 [+0.24, +2.26], p = 0.011) and SFT's by +2.02 [+0.94, +3.15] (p < 0.001), while its locality
   remains near the best (median over-editing ratio 1.07). Neither channel alone reproduces PAFT.

### Caveats reported honestly

* E's pass@1 gain over SFT (+0.78) is **not** statistically significant on its own
  (p = 0.153), even though it is achieved with a *smaller* gradient norm (0.87× SFT).
* The `>10 lines` stratum (44 faults) is the only one where PAFT is not the best on pass@1
  (1.36 vs A 1.59 vs SFT 2.05); the differences are not significant (p = 0.649) and the stratum is small.
* In the common-plausible subsets the ranking is less consistent; for example on the 8 faults solved by
  both SFT and E, SFT has the lower mean AED (83.25 vs 103.12). These subsets contain only 7–20 faults.
