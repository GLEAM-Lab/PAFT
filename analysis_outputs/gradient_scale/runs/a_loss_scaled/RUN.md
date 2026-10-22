# A

| Field | Value |
|---|---|
| Manuscript row | Table 9, A |
| Training run | `models/deepseek-6.7b-sft-lossscale (LOSS_SCALE = 1.2131)` (weights not included) |
| Validated generations | `defects4j/results/deepseek-6.7b-a-plain-fixed` (371 faults, n = 10; not included) |
| Metric source | `metrics/table9_rows.csv`, row `A_loss_scale` |

Because AdamW is approximately invariant to a constant loss rescaling apart
from clipping and epsilon, this control isolates the loss-scale / clipping
channel. It is equivalent to lowering `max_grad_norm` from 0.3 to
0.3 / 1.2131 = 0.247.

| Metric | Value |
|---|---:|
| pass@1 | 8.25% |
| Avg. AED | 88.55 |
| Med. AED | 59.0 |
| Avg. CCR | 74.82 |
| Med. CCR | 81.73 |
| Median over-editing ratio | 1.34 |
