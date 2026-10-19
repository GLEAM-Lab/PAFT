# B

| Field | Value |
|---|---|
| Manuscript row | Table 9, B |
| Training run | `models/deepseek-6.7b-sft-lrscale (LEARNING_RATE = 2.426e-4)` (weights not included) |
| Validated generations | `defects4j/results/deepseek-6.7b-b-plain-fixed` (371 faults, n = 10; not included) |
| Metric source | `metrics/table9_rows.csv`, row `B_lr_scale` |

This control scales the effective step size directly, without changing the
per-token weights.

| Metric | Value |
|---|---:|
| pass@1 | 6.20% |
| Avg. AED | 111.20 |
| Med. AED | 59.5 |
| Avg. CCR | 69.72 |
| Med. CCR | 76.10 |
| Median over-editing ratio | 1.60 |
