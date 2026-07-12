# HumanEvalPack-Python Common-Plausible Audit

- n_samples: 5
- max_tokens: 1024
- Metric scope: first plausible candidate per commonly solved task

| Scope | Model | Common tasks | Avg AED | Med AED | Avg CCR | Med CCR |
|---|---|---:|---:|---:|---:|---:|
| Base+SFT+PAFT-w1.5+PAFT-w2 | Base | 113 | 253.92 | 186.00 | 55.90 | 60.00 |
| Base+SFT+PAFT-w1.5+PAFT-w2 | SFT | 113 | 232.89 | 121.00 | 64.20 | 70.00 |
| Base+SFT+PAFT-w1.5+PAFT-w2 | PAFT-w1.5 | 113 | 71.09 | 26.00 | 81.47 | 86.67 |
| Base+SFT+PAFT-w1.5+PAFT-w2 | PAFT-w2 | 113 | 82.73 | 48.00 | 81.53 | 83.33 |
