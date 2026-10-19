# QuixBugs-Python at n = 10 (Table 6)

This bundle contains the n = 10 rerun that replaced the earlier n = 5 result.
It covers all 40 tasks with 10 candidates per task.

| Setting | pass@1 | pass@5 | pass@10 | solved | plausible |
|---|---:|---:|---:|---:|---:|
| BASE | 34.75 | 63.96 | 72.50 | 29 | 139 |
| SFT | 36.25 | 64.77 | 77.50 | 31 | 145 |
| PAFT | 37.00 | 70.28 | 80.00 | 32 | 148 |

Task-level paired bootstrap (10,000 resamples): PAFT - SFT +0.75 pp
[-5.75, +7.25], p = 0.816; PAFT - BASE +2.25 pp [-4.50, +9.00], p = 0.513.
Exact McNemar on PAFT vs SFT: 4 versus 5 tasks, p = 1.000. The n = 10 run is
therefore a robustness check of the ordering, not a new significance claim.

Common-solved subsets: on the 27 tasks solved by both PAFT and SFT, AED is
262.26 versus 275.22 and CCR is 76.02 versus 72.70; on the 26 tasks solved by
both PAFT and BASE, AED is 264.00 versus 341.81 and CCR is 73.96 versus 58.71.

## Data

| Folder | Source run | pass@1 |
|---|---|---:|
| `base/` | `models/deepseek-coder-6.7b-instruct` | 34.75 |
| `sft/` | `models/deepseek-6.7b-sft-logged/deepseek-6.7b-sft-logged_merged` | 36.25 |
| `paft/` | `deepseek-6.7b-trained-prorepair` | 37.00 |

Each folder contains `eval_n10.json` (per-task, per-candidate pass flags) and
`generations_n10.jsonl` (candidate code).

**Do not use** `models/deepseek-6.7b-paft-logged/deepseek-6.7b-paft-logged_merged`
from the source directory: that is the superseded 2026-10-01 run (pass@1 39.50).
The authoritative PAFT run is `deepseek-6.7b-trained-prorepair`.

The old n = 5 result (32.00 / 24.50 / 43.50) is archived under
`../_archive/stale_summaries/tse_quixbugs_ds67_summary.md` and is not used.

## Reproduce

```bash
python scripts/e2_quixbugs_paired_ci.py   --out-dir analysis_outputs/quixbugs_python_ds67_n10   --bench-dir data/QuixBugs   --base models/deepseek-coder-6.7b-instruct   --sft models/deepseek-6.7b-sft-logged/deepseek-6.7b-sft-logged_merged   --paft deepseek-6.7b-trained-prorepair
```
