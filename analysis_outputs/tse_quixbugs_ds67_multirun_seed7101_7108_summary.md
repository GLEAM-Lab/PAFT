# QuixBugs-Python DS-Coder 6.7B 8-Seed Audit

Source runs: `analysis_outputs/quixbugs_python_ds67_lora_local_20260701_seed7101/` through `analysis_outputs/quixbugs_python_ds67_lora_local_20260701_seed7108/`.

| Setting | Runs | pass@1 mean+/-std | pass@5 mean+/-std | Avg./Med. AED mean | Avg./Med. CCR mean | No-op first/all mean |
|---|---:|---:|---:|---:|---:|---:|
| Base | 8 | 32.62+/-2.76 | 65.94+/-2.65 | 297.26/271.62 | 57.84/61.30 | 0.12/0.38 |
| SFT | 8 | 22.94+/-2.96 | 58.12+/-4.17 | 270.99/259.50 | 56.44/63.63 | 0.00/0.00 |
| PAFT | 8 | 39.12+/-2.99 | 68.75+/-4.01 | 243.68/230.94 | 75.61/82.68 | 0.38/0.88 |

Interpretation: PAFT improves mean pass@1/pass@5 over Base and SFT, lowers AED versus both, and substantially improves CCR. Treat as a Python sanity check, not broad cross-language proof.
