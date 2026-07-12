# HumanEvalPack-Python Common-Plausible Audit

- n_samples: 5
- max_tokens: 1024
- Metric scope: first plausible candidate per commonly solved task

| Scope | Model | Common tasks | Avg AED | Med AED | Avg CCR | Med CCR |
|---|---|---:|---:|---:|---:|---:|
| Base+PAFT+SFT | Base | 118 | 289.92 | 238.00 | 56.19 | 62.83 |
| Base+PAFT+SFT | PAFT | 118 | 87.35 | 18.00 | 77.87 | 88.89 |
| Base+PAFT+SFT | SFT | 118 | 165.81 | 80.50 | 63.73 | 71.83 |
| SFT+PAFT | SFT | 124 | 173.19 | 92.00 | 63.54 | 71.83 |
| SFT+PAFT | PAFT | 124 | 92.02 | 20.50 | 77.68 | 87.50 |
| Base+PAFT | Base | 135 | 297.96 | 247.00 | 55.58 | 61.90 |
| Base+PAFT | PAFT | 135 | 88.36 | 18.00 | 78.01 | 88.89 |
