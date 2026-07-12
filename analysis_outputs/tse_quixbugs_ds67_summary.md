# QuixBugs-Python Summary (DS-Coder-6.7B)


Source directory: `analysis_outputs/quixbugs_python_ds67_lora_local_20260701/`

| Model | pass@1 | Avg. AED | Med. AED | Avg. CCR | Med. CCR | No-op first/all |
|---|---:|---:|---:|---:|---:|---:|
| `deepseek-6.7b` | 32.00 | 306.11 | 284.50 | 59.65 | 64.58 | 0 / 0 |
| `deepseek-6.7b-trained-noprompt` | 24.50 | 285.16 | 269.00 | 56.74 | 66.67 | 0 / 0 |
| `deepseek-6.7b-trained-prorepair` | 43.50 | 261.94 | 250.00 | 75.66 | 81.82 | 0 / 0 |

Interpretation: PAFT improves pass@1, Avg./Med. AED, and Avg./Med. CCR over both Base and SFT. This remains a cross-language sanity check, not broad Python generalization.
