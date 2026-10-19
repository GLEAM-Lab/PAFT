# E

| Field | Value |
|---|---|
| Manuscript row | Table 9, E |
| Training run | `models/deepseek-6.7b-paft-wnorm-logged` (weights not included) |
| Validated generations | `defects4j/results/deepseek-6.7b-paft-wnorm-plain` (371 faults, n = 10; not included) |
| Metric source | `metrics/table9_rows.csv`, row `E_wnorm` |

The loss is divided by `sum_t (w_t * M_t)` instead of by the token count, so
that `sum_t beta_t = 1` exactly as in SFT while the preservation weighting is
retained.

| Metric | Value |
|---|---:|
| pass@1 | 7.90% |
| Avg. AED | 75.01 |
| Med. AED | 48.0 |
| Avg. CCR | 75.38 |
| Med. CCR | 83.33 |
| Median over-editing ratio | 1.10 |
