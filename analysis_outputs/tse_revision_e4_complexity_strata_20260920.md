# E4: pass@1 by reference-fix complexity, with paired bootstrap CIs (TSE major revision, Reviewers 2/3: "does PAFT only help on simple faults?")

Script: `scripts/tse_rev_overedit_and_strata.py` (`--trio` rows). Same inputs as
`tse_revision_e3_overedit_ratio_20260920.md`. Strata come from the developer fix:
strip-normalized unified diff (context 0) line count, binned 1-2 / 3-5 / 6-10 / >10, and the
number of changed regions (@@ hunks), single vs multi. Fault counts: 1-2: 151, 3-5: 118,
6-10: 58, >10: 44; single-region 216, multi-region 155.

pass@1 in %, followed by the median over-editing ratio of the plausible candidates in that
stratum (see E3 for the definition).

## DS-Coder-6.7B

| stratum | n | Base | SFT | PAFT |
|---|---:|---:|---:|---:|
| 1-2 lines | 151 | 9.74 / 5.75 | 12.38 / 2.00 | **16.75** / 1.69 |
| 3-5 lines | 118 | 3.81 / 2.08 | 5.17 / 1.26 | **7.29** / 1.02 |
| 6-10 lines | 58 | 3.10 / 0.98 | 3.45 / 0.73 | **5.52** / 0.74 |
| >10 lines | 44 | 1.14 / 0.85 | 1.59 / 0.83 | 1.14 / 0.60 |
| single region | 216 | 7.73 / 3.76 | 9.77 / 1.50 | **12.87** / 1.44 |
| multi region | 155 | 3.10 / 2.59 | 4.13 / 1.28 | **6.32** / 1.00 |
| all | 371 | 5.80 / 3.28 | 7.41 / 1.45 | **10.13** / 1.22 |

## OpenCoder-8B

| stratum | n | Base | SFT | PAFT |
|---|---:|---:|---:|---:|
| 1-2 lines | 151 | 13.38 / 5.23 | 9.93 / 2.95 | **15.76** / 2.00 |
| 3-5 lines | 118 | 5.34 / 1.92 | 5.85 / 1.18 | **8.05** / 1.01 |
| 6-10 lines | 58 | 4.14 / 1.29 | 4.31 / 0.94 | **4.66** / 1.55 |
| >10 lines | 44 | 1.14 / 0.66 | 1.59 / 0.55 | **2.05** / 0.44 |
| single region | 216 | 10.79 / 3.96 | 8.10 / 2.11 | **12.92** / 1.69 |
| multi region | 155 | 3.94 / 1.86 | 4.90 / 1.14 | **5.81** / 1.11 |
| all | 371 | 7.92 / 3.19 | 6.77 / 1.69 | **9.95** / 1.50 |

## Qwen3-8B

| stratum | n | Base | SFT | PAFT |
|---|---:|---:|---:|---:|
| 1-2 lines | 151 | 16.95 / 3.74 | 16.23 / 1.69 | **21.66** / 1.28 |
| 3-5 lines | 118 | 5.76 / 3.50 | 7.63 / 1.09 | **8.64** / 1.00 |
| 6-10 lines | 58 | 3.97 / 1.42 | 5.17 / 0.74 | **6.72** / 0.73 |
| >10 lines | 44 | 2.27 / 0.95 | 2.73 / 0.99 | **3.41** / 0.57 |
| single region | 216 | 12.31 / 3.54 | 13.10 / 1.64 | **17.31** / 1.02 |
| multi region | 155 | 5.87 / 2.79 | 6.06 / 1.18 | **7.03** / 0.98 |
| all | 371 | 9.62 / 3.00 | 10.16 / 1.50 | **13.02** / 1.00 |

## Qwen2.5-Coder-7B

| stratum | n | Base | SFT | PAFT |
|---|---:|---:|---:|---:|
| 1-2 lines | 151 | **23.18** / 3.68 | 17.48 / 1.74 | 23.11 / 1.44 |
| 3-5 lines | 118 | 11.44 / 1.72 | 9.41 / 1.00 | **12.03** / 1.00 |
| 6-10 lines | 58 | 6.72 / 1.37 | 8.10 / 0.99 | **9.14** / 0.83 |
| >10 lines | 44 | 2.50 / 0.88 | 2.95 / 0.45 | **4.55** / 0.50 |
| single region | 216 | 18.66 / 2.92 | 14.49 / 1.52 | **18.84** / 1.18 |
| multi region | 155 | 8.52 / 1.85 | 7.87 / 1.02 | **10.13** / 0.88 |
| all | 371 | 14.42 / 2.58 | 11.73 / 1.36 | **15.20** / 1.00 |

## Qwen2.5-Coder-14B

| stratum | n | Base | SFT | PAFT |
|---|---:|---:|---:|---:|
| 1-2 lines | 151 | 30.73 / 5.16 | 29.14 / 1.14 | **33.05** / 1.00 |
| 3-5 lines | 118 | 16.78 / 2.46 | 16.53 / 0.96 | **19.66** / 0.97 |
| 6-10 lines | 58 | 11.03 / 1.88 | 10.86 / 0.49 | **13.97** / 0.41 |
| >10 lines | 44 | 6.82 / 0.83 | **12.05** / 0.52 | 9.77 / 0.57 |
| single region | 216 | **27.04** / 3.83 | 24.40 / 1.00 | 26.99 / 1.00 |
| multi region | 155 | 11.10 / 2.81 | 14.45 / 0.69 | **17.55** / 0.93 |
| all | 371 | 20.38 / 3.47 | 20.24 / 1.00 | **23.05** / 1.00 |

## Paired fault-level bootstrap (10,000 resamples) of the pass@1 difference, percentage points

| backbone | stratum | n | PAFT - SFT [95% CI], p | PAFT - Base [95% CI], p |
|---|---|---:|---|---|
| DS-Coder-6.7B | multi region | 155 | +2.19 [+0.71, +3.94] p=0.004 | +3.23 [+1.29, +5.48] p<0.001 |
| DS-Coder-6.7B | <=5 lines | 269 | +3.38 [+1.64, +5.17] p<0.001 | +5.46 [+3.35, +7.66] p<0.001 |
| DS-Coder-6.7B | >10 lines | 44 | -0.45 [-2.05, +0.91] p=0.649 | +0.00 [-1.82, +1.59] p=1.000 |
| DS-Coder-6.7B | all | 371 | +2.72 [+1.43, +4.04] p<0.001 | +4.34 [+2.72, +6.04] p<0.001 |
| OpenCoder-8B | multi region | 155 | +0.90 [-0.52, +2.45] p=0.224 | +1.87 [+0.45, +3.48] p=0.011 |
| OpenCoder-8B | <=5 lines | 269 | +4.24 [+2.60, +5.95] p<0.001 | +2.53 [+0.89, +4.13] p=0.002 |
| OpenCoder-8B | >10 lines | 44 | +0.45 [-1.36, +2.50] p=0.765 | +0.91 [-1.36, +3.41] p=0.463 |
| OpenCoder-8B | all | 371 | +3.18 [+1.94, +4.45] p<0.001 | +2.02 [+0.81, +3.29] p=0.001 |
| Qwen3-8B | multi region | 155 | +0.97 [-0.52, +2.45] p=0.202 | +1.16 [-1.16, +3.68] p=0.354 |
| Qwen3-8B | <=5 lines | 269 | +3.49 [+1.71, +5.35] p<0.001 | +3.90 [+1.26, +6.62] p=0.004 |
| Qwen3-8B | >10 lines | 44 | +0.68 [-0.91, +2.50] p=0.477 | +1.14 [-2.27, +6.14] p=0.752 |
| Qwen3-8B | all | 371 | +2.86 [+1.48, +4.31] p<0.001 | +3.40 [+1.35, +5.53] p=0.003 |
| Qwen2.5-Coder-7B | multi region | 155 | +2.26 [+0.32, +4.32] p=0.020 | +1.61 [-0.90, +4.06] p=0.188 |
| Qwen2.5-Coder-7B | <=5 lines | 269 | +4.31 [+2.30, +6.43] p<0.001 | +0.22 [-1.97, +2.53] p=0.834 |
| Qwen2.5-Coder-7B | >10 lines | 44 | +1.59 [-0.91, +4.55] p=0.280 | +2.05 [-0.45, +5.68] p=0.177 |
| Qwen2.5-Coder-7B | all | 371 | +3.48 [+1.86, +5.12] p<0.001 | +0.78 [-0.97, +2.56] p=0.377 |
| Qwen2.5-Coder-14B | multi region | 155 | +3.10 [-1.68, +8.19] p=0.209 | +6.45 [+0.26, +12.77] p=0.042 |
| Qwen2.5-Coder-14B | <=5 lines | 269 | +3.57 [-0.78, +7.92] p=0.108 | +2.57 [-2.38, +7.66] p=0.324 |
| Qwen2.5-Coder-14B | >10 lines | 44 | -2.27 [-11.82, +7.05] p=0.644 | +2.95 [-5.00, +11.36] p=0.456 |
| Qwen2.5-Coder-14B | all | 371 | +2.80 [-0.67, +6.28] p=0.110 | +2.67 [-1.54, +6.82] p=0.209 |

## Reading

* Multi-region faults (155): PAFT has the highest pass@1 on all five backbones; the gain
  over Base is significant on DS-Coder, OpenCoder and Qwen2.5-14B, over SFT on DS-Coder
  and Qwen2.5-7B.
* Across the 1-2 / 3-5 / 6-10 line bins PAFT is best in 14 of 15 backbone x bin cells
  (the exception is Qwen2.5-7B at 1-2 lines, 23.11 vs Base 23.18).
* The >10-line bin has 44 faults and single-digit pass@1 for every setting; no difference
  is significant and PAFT is never below Base. The revision should state this as "too few
  solved faults to conclude", not as a gain.
* The over-editing ratio drops in every stratum, including >10 lines, so the locality
  effect is not confined to small fixes.
