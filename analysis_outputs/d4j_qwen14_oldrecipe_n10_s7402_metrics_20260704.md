| model | normalized_bugs | padded_bugs | truncated_bugs | pass@1 | pass@5 | pass@10 | plausible_patches | avg_aed | med_aed | avg_ccr | med_ccr | stale_aed_count | stale_ccr_count | no_op_all_pct | no_op_plausible |
|---|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|
| qwen2.5coder14b-d4j-n10-s7402 | 371 | 0 | 0 | 10.46 | 10.51 | 10.51 | 388 | 206.13 | 158.00 | 65.83 | 68.42 | 0 | 0 | 0.27 | 0 |
| qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620-d4j-n10-s7402 | 371 | 0 | 0 | 18.17 | 20.02 | 20.75 | 674 | 64.15 | 43.00 | 78.84 | 87.50 | 0 | 0 | 1.54 | 10 |
| qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620-d4j-n10-s7402 | 371 | 0 | 0 | 19.49 | 21.51 | 21.83 | 723 | 71.21 | 39.00 | 71.49 | 80.00 | 0 | 0 | 2.78 | 10 |
| qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620-d4j-n10-s7402 | 371 | 0 | 0 | 14.93 | 16.31 | 16.71 | 554 | 47.22 | 28.00 | 78.78 | 85.71 | 0 | 0 | 3.58 | 0 |
