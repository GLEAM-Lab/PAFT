# Training data (MORepair corpus, 1,535 buggy/fixed pairs)

All five files serialize the same 1,535 C++ buggy/fixed pairs released by
MORepair; they differ only in prompt/response serialization format. Files were
renamed on 2026-07-10 to avoid implying an ordering mechanism or a diff-based
data format (old names in parentheses).

| file | role | format |
|---|---|---|
| `deepseek_llm_train.json` (`ds_llm_sorted_by_diff.json`) | actual DS-Coder-6.7B training input used by `pipeline_deepseek-6.7b.sh` | prompt + fenced code + `<|EOT|>` response |
| `qwen_llm_train.json` (`qwen_llm_diff.json`) | Qwen2.5-Coder / Qwen3 training input | `<|im_start|>/<|im_end|>` chat format |
| `opencoder_llm_train.json` (`opencoder_llm.json`) | OpenCoder-8B training input | `<|im_start|>/<|im_end|>` chat format |
| `deepseek_llm_pairs_alt_format.json` (`deepseek_llm_diff.json`) | alternative serialization; input of the 5-gram train/eval contamination check (`d4j_train_eval_5gram_jaccard_*`) | `### Response:` format, no `<|EOT|>` |
| `deepseek_llm_pairs_fillme_format.json` (`deepseek_llm_diff_fillme.json`) | unused FILL_ME-style serialization, kept for provenance | `<FILL_ME>` placeholder format |

Note on row order: `deepseek_llm_train.json` rows are sorted by line-level diff
size for historical reasons. This does not affect training: the trainer loads a
map-style Hugging Face `Dataset` and the HF `Trainer`'s default random
sampler reshuffles examples every epoch, so no ordered traversal occurs. See
`analysis_outputs/tse_run_identity_mapping_20260706.md` (2026-07-10 addendum).
