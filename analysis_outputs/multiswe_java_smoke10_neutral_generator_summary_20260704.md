# Multi-SWE Java Smoke10 Generator-Level Summary

This summarizes generated unified diffs against gold patch metadata. It is not an official Multi-SWE harness pass/fail result.

| Model | Predictions | Nonempty | Avg/Med patch chars | Avg/Med patch-text AED (n) | File P/R | Extra/Missing files |
|---|---:|---:|---:|---:|---:|---:|
| `qwen2.5coder14b-multiswe-smoke10-neutral-s7401` | 10/10 | 10 (100.0%) | 2703.5/2623.0 | 1045.8/978.0 (4) | 1.00/0.85 | 0.00/0.80 |
| `qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620-multiswe-smoke10-neutral-s7401` | 10/10 | 10 (100.0%) | 2397.5/1499.5 | 1014.0/930.0 (5) | 1.00/0.86 | 0.00/0.60 |
| `qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620-multiswe-smoke10-neutral-s7401` | 10/10 | 10 (100.0%) | 2732.8/1508.5 | 894.0/802.5 (6) | 1.00/0.91 | 0.00/0.40 |
| `qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620-multiswe-smoke10-neutral-s7401` | 10/10 | 10 (100.0%) | 2999.8/2207.0 | 850.5/847.0 (4) | 1.00/0.92 | 0.00/0.60 |

## By Complexity Bucket

Buckets are inherited from the deterministic smoke manifest: single-file, two-file, and three-plus-file gold patches.

| Model | Bucket | Instances | Avg/Med patch chars | Avg/Med patch-text AED (n) | File P/R | Missing files |
|---|---|---:|---:|---:|---:|---:|
| `qwen2.5coder14b-multiswe-smoke10-neutral-s7401` | single_file | 4 | 1524.5/1295.0 | 1045.8/978.0 (4) | 1.00/1.00 | 0.00 |
| `qwen2.5coder14b-multiswe-smoke10-neutral-s7401` | three_plus_file | 2 | 5436.5/5436.5 | -/- (0) | 1.00/0.53 | 3.50 |
| `qwen2.5coder14b-multiswe-smoke10-neutral-s7401` | two_file | 4 | 2516.0/2645.0 | -/- (0) | 1.00/0.88 | 0.25 |
| `qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620-multiswe-smoke10-neutral-s7401` | single_file | 4 | 1215.8/1123.5 | 866.2/837.5 (4) | 1.00/1.00 | 0.00 |
| `qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620-multiswe-smoke10-neutral-s7401` | three_plus_file | 2 | 4986.5/4986.5 | -/- (0) | 1.00/0.54 | 2.50 |
| `qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620-multiswe-smoke10-neutral-s7401` | two_file | 4 | 2284.8/2397.0 | 1605.0/1605.0 (1) | 1.00/0.88 | 0.25 |
| `qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620-multiswe-smoke10-neutral-s7401` | single_file | 4 | 973.5/982.0 | 634.0/611.5 (4) | 1.00/1.00 | 0.00 |
| `qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620-multiswe-smoke10-neutral-s7401` | three_plus_file | 2 | 7686.0/7686.0 | -/- (0) | 1.00/0.81 | 1.50 |
| `qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620-multiswe-smoke10-neutral-s7401` | two_file | 4 | 2015.5/1858.0 | 1414.0/1414.0 (2) | 1.00/0.88 | 0.25 |
| `qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620-multiswe-smoke10-neutral-s7401` | single_file | 4 | 1333.2/1281.0 | 850.5/847.0 (4) | 1.00/1.00 | 0.00 |
| `qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620-multiswe-smoke10-neutral-s7401` | three_plus_file | 2 | 5332.0/5332.0 | -/- (0) | 1.00/0.59 | 3.00 |
| `qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620-multiswe-smoke10-neutral-s7401` | two_file | 4 | 3500.2/3096.5 | -/- (0) | 1.00/1.00 | 0.00 |
