# Frontier Minimal-Prompt Result Bundle

The Git LFS archive `frontier_minimal_results_20260710.tar.zst` contains the
complete Defects4J outputs used for the two closed-model minimal-prompt rows.

| Result directory | Validated bugs | pass@1 | Avg./Med. AED | Avg./Med. CCR |
|---|---:|---:|---:|---:|
| `qwen3-max-minimal` | 371 | 31.54 | 99.38/57.00 | 81.01/87.50 |
| `dashscope-deepseek-v3-minimal-v3` | 371 | 45.28 | 106.18/58.00 | 79.45/85.71 |

The archive has 3,702 entries and includes generated patches, per-bug
validation results, validation logs, and validated summaries. Each model has
371 files matching `fixed0/*.json.result`. No credentials or API keys are
included.

SHA-256:

```text
395f574248a50c8489e44317027a38f180a327a40dd09a0a440ff6e0d2cb2ff7
```

Extract from the repository root:

```bash
tar --zstd -xf analysis_outputs/frontier_minimal_results_20260710.tar.zst
```

The aggregate source table is
`analysis_outputs/d4j_frontier_api_pass1_metrics_20260621.csv`.
