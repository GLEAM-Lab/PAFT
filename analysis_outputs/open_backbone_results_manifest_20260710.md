# Open-Backbone Defects4J Result Bundles

These Git LFS archives contain the raw generations, per-bug validation
results, validation logs, and validated summaries behind the paper-facing
Qwen Defects4J rows. Metrics below were recomputed after extracting all three
archives into a clean directory with `scripts/recompute_d4j_metrics.py`.

## Qwen2.5-Coder-7B

Archive: `d4j_qwen25_7b_paper_results_20260710.tar.zst`

| Result directory | Bugs | pass@1/5/10 | Avg./Med. AED | Avg./Med. CCR |
|---|---:|---:|---:|---:|
| `qwen2.5coder7b` | 371 | 14.42/29.21/35.58 | 143.09/85.00 | 68.43/73.68 |
| `qwen2.5coder7b-sft-tse-20260619` | 371 | 11.73/25.74/31.54 | 96.13/53.00 | 71.12/80.26 |
| `qwen2.5coder7b-paft` | 371 | 15.20/29.86/36.39 | 71.26/43.00 | 77.27/85.71 |

The Base directory has two bugs with fewer than ten generated candidates;
the audit script pads the missing candidates as failures, matching the paper's
reported protocol.

## Qwen2.5-Coder-14B

Archive: `d4j_qwen25_14b_paper_results_20260710.tar.zst`

| Seed | Result directory | Bugs | pass@1/5/10 | Avg./Med. AED | Avg./Med. CCR |
|---:|---|---:|---:|---:|---:|
| 7401 | `qwen2.5coder14b-d4j-n10-s7401` | 371 | 20.38/21.01/21.02 | 169.17/123.00 | 70.70/78.26 |
| 7401 | `qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620-d4j-n10-s7401` | 371 | 20.24/22.78/23.72 | 79.43/34.00 | 74.85/83.33 |
| 7401 | `qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620-d4j-n10-s7401` | 371 | 22.16/24.13/24.80 | 61.18/26.00 | 80.49/88.89 |
| 7401 | `qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620-d4j-n10-s7401` | 371 | 23.05/24.63/25.07 | 63.53/34.00 | 79.91/88.89 |

These directories supply the main-text rows, the appendix pass@k table, and
the side-effect diagnostics.

## Qwen3-8B

Archive: `d4j_qwen3_8b_paper_results_20260710.tar.zst`

| Result directory | Bugs | pass@1/5/10 | Avg./Med. AED | Avg./Med. CCR |
|---|---:|---:|---:|---:|
| `qwen3-8b` | 370 | 9.65/19.15/23.51 | 190.73/100.00 | 64.29/66.67 |
| `qwen8b-sft` | 371 | 10.16/22.94/29.92 | 101.77/58.00 | 72.85/81.58 |
| `qwen8b-paft` | 371 | 13.02/25.27/30.46 | 68.57/30.00 | 76.41/85.71 |

The original Base run has 370 validated bugs; its reported metrics use those
370 available results. The similarly named Qwen3-8B directories inside the
older `defects4j.tar.zst` are later re-runs (17.84/11.73/11.00 pass@1) and do
not support the paper row. Extract this archive into a clean directory; do not
overlay it onto an extracted copy of `defects4j.tar.zst`.

## Integrity and Extraction

| Archive | Entries | SHA-256 |
|---|---:|---|
| `d4j_qwen25_7b_paper_results_20260710.tar.zst` | 4,458 | `43ab00c264a21bb85f67e2eb851be3fdf7efcc34dc5d2f31e50eada88dbe4535` |
| `d4j_qwen25_14b_paper_results_20260710.tar.zst` | 34,152 | `0f5957385bb8808e711523db0acd86e9710a29538434d2f2733d83b6acff0066` |
| `d4j_qwen3_8b_paper_results_20260710.tar.zst` | 4,454 | `11e5fcdb1456da643743cad6b0d5ba11492df9838af80127840007dd48e2e692` |

Example clean extraction:

```bash
git lfs pull
mkdir -p /tmp/paft-paper-results
tar --zstd -xf defects4j.tar.zst \
  -C /tmp/paft-paper-results defects4j/dataset
tar --zstd -xf analysis_outputs/d4j_qwen25_7b_paper_results_20260710.tar.zst -C /tmp/paft-paper-results
tar --zstd -xf analysis_outputs/d4j_qwen25_14b_paper_results_20260710.tar.zst -C /tmp/paft-paper-results
tar --zstd -xf analysis_outputs/d4j_qwen3_8b_paper_results_20260710.tar.zst -C /tmp/paft-paper-results
```

Then recompute any row with, for example:

```bash
python scripts/recompute_d4j_metrics.py \
  --root /tmp/paft-paper-results \
  --models qwen2.5coder7b qwen2.5coder7b-sft-tse-20260619 qwen2.5coder7b-paft
```
