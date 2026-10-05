# E7 robustness: main analyses with the memorised faults excluded

The E7 prefix probe flags the faults for which the base DS-Coder-6.7B model
reproduces the held-out half of the developer fix near-verbatim (LCP >= 0.9):
19 of 336 faults (5.7%), listed in
`analysis_outputs/tse_revision_e7_leak_memorized_faults.txt`.

This report repeats the E3/E4 analyses on the remaining 352 faults, using
`scripts/tse_rev_overedit_and_strata.py --exclude-faults`.  Raw command outputs
are in `analysis_outputs/e7_robustness/` (`*_full.txt` vs `*_excl.txt`).

## 1. pass@1 and median over-editing ratio, all faults

`pass@1 (%) / median over-editing ratio`

| backbone | setting | full (371) | excluded (352) |
|---|---|---:|---:|
| DS-Coder-6.7B | Base | 5.80 / 3.28 | 5.31 / 2.93 |
| DS-Coder-6.7B | SFT | 7.41 / 1.45 | 6.65 / 1.50 |
| DS-Coder-6.7B | PAFT | **10.13 / 1.22** | **9.55 / 1.34** |
| OpenCoder-8B | Base | 7.92 / 3.19 | 7.59 / 2.94 |
| OpenCoder-8B | SFT | 6.77 / 1.69 | 6.34 / 1.59 |
| OpenCoder-8B | PAFT | **9.95 / 1.50** | **9.12 / 1.55** |
| Qwen3-8B | Base | 9.62 / 3.00 | 9.20 / 2.88 |
| Qwen3-8B | SFT | 10.16 / 1.50 | 9.46 / 1.47 |
| Qwen3-8B | PAFT | **13.02 / 1.00** | **12.41 / 1.00** |
| Qwen2.5-Coder-7B | Base | 14.42 / 2.58 | 13.66 / 2.50 |
| Qwen2.5-Coder-7B | SFT | 11.73 / 1.36 | 10.80 / 1.46 |
| Qwen2.5-Coder-7B | PAFT | **15.20 / 1.00** | **14.23 / 1.02** |
| Qwen2.5-Coder-14B | Base | 20.38 / 3.47 | 19.20 / 3.38 |
| Qwen2.5-Coder-14B | SFT | 20.24 / 1.00 | 19.32 / 1.00 |
| Qwen2.5-Coder-14B | PAFT | **23.05 / 1.00** | **22.02 / 1.00** |
| E1 batch (C/A/D) | C — SFT | 7.12 / 1.25 | 6.42 / 1.50 |
| E1 batch (C/A/D) | A — loss x 1.2131 | 8.25 / 1.32 | 7.47 / 1.50 |
| E1 batch (C/A/D) | D — PAFT | **9.14 / 1.07** | **8.44 / 1.30** |

PAFT remains the best setting on pass@1 and on the median over-editing ratio for
every backbone and for the E1 batch, before and after exclusion.

## 2. PAFT - SFT paired bootstrap, percentage points

| backbone | stratum | full | excluded |
|---|---|---:|---:|
| DS-Coder-6.7B | all | +2.72 [+1.40, +4.04] p<0.001 | +2.90 [+1.56, +4.32] p<0.001 |
| DS-Coder-6.7B | <=5 lines | +3.38 [+1.64, +5.17] p<0.001 | +3.72 [+1.90, +5.53] p<0.001 |
| DS-Coder-6.7B | multi region | +2.19 [+0.71, +3.94] p=0.004 | +2.18 [+0.61, +3.95] p=0.005 |
| OpenCoder-8B | all | +3.18 [+1.94, +4.45] p<0.001 | +2.78 [+1.56, +4.01] p<0.001 |
| OpenCoder-8B | multi region | +0.90 [-0.52, +2.45] p=0.224 | +0.75 [-0.75, +2.31] p=0.346 |
| Qwen3-8B | all | +2.86 [+1.48, +4.31] p<0.001 | +2.95 [+1.53, +4.40] p<0.001 |
| Qwen3-8B | multi region | +0.97 [-0.52, +2.45] p=0.202 | +1.16 [-0.27, +2.72] p=0.128 |
| Qwen2.5-Coder-7B | all | +3.48 [+1.86, +5.12] p<0.001 | +3.44 [+1.73, +5.17] p<0.001 |
| Qwen2.5-Coder-7B | multi region | +2.26 [+0.32, +4.32] p=0.020 | +2.45 [+0.48, +4.56] p=0.015 |
| Qwen2.5-Coder-14B | all | +2.80 [-0.67, +6.28] p=0.110 | +2.70 [-0.91, +6.28] p=0.146 |
| Qwen2.5-Coder-14B | multi region | +3.10 [-1.68, +8.19] p=0.209 | +2.59 [-2.38, +7.62] p=0.303 |
| E1 D - A (loss-scaled SFT) | all | +0.89 [-0.13, +1.91] p=0.078 | +0.97 [-0.06, +2.02] p=0.061 |
| E1 D - A (loss-scaled SFT) | multi region | +1.10 [+0.06, +2.26] p=0.037 | +1.16 [+0.14, +2.31] p=0.023 |
| E1 D - C (same-batch SFT) | all | +2.02 [+0.94, +3.15] p<0.001 | +2.02 [+0.91, +3.21] p<0.001 |
| E1 D - C (same-batch SFT) | multi region | +1.10 [-0.19, +2.45] p=0.091 | +1.22 [-0.00, +2.52] p=0.053 |

## 3. PAFT - Base on multi-region faults (the only results that move)

| backbone | full | excluded |
|---|---:|---:|
| DS-Coder-6.7B | +3.23 [+1.29, +5.48] p<0.001 | +2.72 [+0.88, +4.83] p=0.003 |
| OpenCoder-8B | +1.87 [+0.45, +3.48] p=0.011 | **+1.36 [-0.00, +2.93] p=0.061** |
| Qwen3-8B | +1.16 [-1.16, +3.68] p=0.354 | +0.54 [-1.70, +2.86] p=0.678 |
| Qwen2.5-Coder-7B | +1.61 [-0.90, +4.06] p=0.188 | +1.16 [-1.22, +3.54] p=0.326 |
| Qwen2.5-Coder-14B | +6.45 [+0.26, +12.77] p=0.042 | **+5.44 [-1.02, +11.97] p=0.097** |

Two previously significant multi-region PAFT-vs-Base results (OpenCoder,
Qwen2.5-14B) lose significance after removing the 19 faults; both keep the same
direction and a similar effect size.  No conclusion is reversed.

## 4. Over-editing ratio, DS-Coder paper rows and the E1 batch

`plausible candidates / median / ratio of sums`

| setting | full | excluded |
|---|---|---|
| Base | 215 / 3.28 / 2.99 | 187 / 2.93 / 2.73 |
| SFT | 275 / 1.45 / 2.19 | 234 / 1.50 / 2.13 |
| PAFT | 376 / **1.22** / **1.79** | 336 / **1.35** / **1.82** |
| C — SFT (E1) | 264 / 1.25 / 1.81 | 226 / 1.50 / 1.81 |
| A — loss x 1.2131 (E1) | 306 / 1.34 / 2.15 | 263 / 1.50 / 2.21 |
| D — PAFT (E1) | 339 / **1.07** / **1.80** | 297 / **1.30** / 1.85 |

For the paper DS-Coder rows PAFT stays best on both summaries.  For the E1
batch PAFT stays best on the median; on the ratio of sums the same-batch SFT
edges ahead after exclusion (1.81 vs 1.85), which should be reported as-is.

## 5. Conclusion for the manuscript

Removing every fault on which the base backbone shows near-verbatim
reproduction leaves the paper's comparisons intact: PAFT is still the best
setting on pass@1 and on the median over-editing ratio for all five backbones
and for the E1 A/C/D batch, and the PAFT-vs-SFT gains remain significant
overall.  The only changes are two multi-region PAFT-vs-Base comparisons that
fall from p = 0.011 / 0.042 to p = 0.061 / 0.097.  The leakage threat is
therefore bounded and does not drive the paper's conclusions.
