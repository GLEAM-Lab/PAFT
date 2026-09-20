# E6: training-instance token lengths per backbone tokenizer (TSE major revision)

Reviewers 1 and 3 (minor comment 4) ask which tokenizer the manuscript's "longest serialized
instance is 1,464 tokens" was measured with and whether the 2,048-token limit holds for all
five backbones.

## What the trainer feeds

`SingleTrainWithLCS.py` tokenizes the whole `text` with `truncation=False`, then the
collator splits at the EOS token id and keeps the prompt (before the first EOS) and the
first response (between the first and second EOS), cuts at `max_len - 1 = 2047` and appends
EOS. Text after the second EOS is discarded: in `deepseek_llm_train.json` that is MORepair's
tutor explanation (a second `### Response:` block; every item has three `<|EOT|>`), in
`opencoder_llm_train.json` the later chat turns (6 to 34 `<|im_end|>` per item).

## Lengths under that assembly (scripts/e6_train_seq_lengths.py, 1,535 instances each)

| tokenizer | vocab | trainset | trainer seq max | p99 | median | >2048 | raw `text` max | raw >2048 |
|---|---:|---|---:|---:|---:|---:|---:|---:|
| deepseek-ai/deepseek-coder-6.7b-instruct (fast tokenizer from `tokenizer.json`, as in the trainer; the stock AutoTokenizer gives the same lengths) | 32,022 | deepseek_llm_train.json | **1,585** | 1,551 | 945 | 0 | 2,842 | 382 |
| Qwen/Qwen2.5-Coder-7B-Instruct | 151,665 | qwen_llm_train.json | **1,249** | 1,176 | 707 | 0 | 1,250 | 0 |
| Qwen/Qwen2.5-Coder-14B-Instruct | 151,665 | qwen_llm_train.json | **1,249** | 1,176 | 707 | 0 | 1,250 | 0 |
| Qwen/Qwen3-8B | 151,669 | qwen_llm_train.json | **1,249** | 1,176 | 707 | 0 | 1,250 | 0 |
| infly/OpenCoder-8B-Instruct | 96,541 | opencoder_llm_train.json | **1,248** | 1,183 | 722 | 0 | 8,007 | 557 |

## Consequences for the manuscript

* "Truncation never triggers and no fixed-code tokens are lost" is confirmed for all five
  backbones (largest instance 1,585 < 2,048).
* The number 1,464 cannot be reproduced from any released training file with any of the
  five tokenizers (nor can the earlier "899 with the Qwen tokenizer"); Section 4.4 must state
  the per-tokenizer maxima above and the tokenizer identifiers.
* Qwen2.5-Coder-7B, Qwen2.5-Coder-14B and Qwen3-8B produce identical lengths and identical
  alignment-coverage statistics (Appendix G.3); their vocabularies differ only in four
  Qwen3 special tokens (151,665 vs 151,669).
* The two released files that carry extra text after the fixed program are documented in
  `data/trainset/README.md`; the paper's description (prompt + corrected program) matches
  what is trained.
