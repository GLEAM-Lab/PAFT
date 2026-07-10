# Run-Identity Mapping: Artifact Directories vs Paper Tables (2026-07-06)

> **Addendum 2026-07-10 — status of the previously open anomalies.**
> 1/2 (AdaPatcher, RepairLLaMA metric source): resolved on 2026-07-07; all baseline rows
>    use the uniform recompute-from-text pipeline. RepairLLaMA remains evaluated on its
>    released 316/371 generations, now disclosed with explicit per-row bug counts in the
>    manuscript.
> 3/4 ("- Full masking", `deepseek-6.7b-sft`): resolved; the ablation table was
>    deduplicated and these directories belong to earlier exploratory variants that no
>    current table row uses (see `table9.sh` for the current row mapping).
> 5 (Qwen3-8B / OpenCoder-8B): two separate causes. For OpenCoder-8B the archived
>    directories DO back the paper rows — the earlier mismatch was an estimator
>    difference (n=1 first-candidate vs n=10 pooled); the manuscript now reports all
>    rows under the shared n=10 protocol. For Qwen3-8B the archived directories are
>    later re-runs; the paper's original Qwen3-8B runs will be re-archived by the
>    authors (repository-version gap, not a numerical error).
> 6 (deepseek-v3 / qwen3-max / deepseek-6.7b-prompting / qwen3-8b-paft): the missing
>    validation results were completed on 2026-07-10 by re-running the released
>    validation harness on the already-archived generations; these directories now
>    cover 371/371 bugs and the manuscript reports the full-set numbers (see
>    `tse_d4j_master_metrics_20260710.md`).
> Training-data pinning: the actual DS-Coder training input
>    `data/trainset/ds_llm_sorted_by_diff.json` (prompt `<|EOT|>` response format,
>    sorted by line-diff size) is now committed, and `pipeline_deepseek-6.7b.sh`
>    points to it. The previously committed trainer was a stale copy whose collator
>    pre-shifted the weight vector; it did not match the implementation used to train
>    the released checkpoints and was corrected with per-token unit tests
>    (`tests/test_loss_weight_alignment.py`).

Recomputed from `defects4j/results/<model>/fixed0/*.json.result` (first-candidate lists,
10 candidates per bug) with the normalization of `scripts/recompute_d4j_metrics.py`
(AED = char Levenshtein on stripped text; CCR = SequenceMatcher over stripped lines).
pass@1 = mean over bugs of c/10. "Paper" values from TSE manuscript Tables 3/5/6.

## Verified matches (pass@1 / Avg AED / Med AED / Avg CCR all reproduce)

| artifact dir | paper row | recomputed | paper |
|---|---|---|---|
| deepseek-6.7b | Base (T3/T5/T6) | 5.80 / 142.90 / 113.0 / 70.64 | 5.80 / 142.90 / 113.0 / 70.64 |
| deepseek-6.7b-promptloss | \Sft (T3/T5), "+ SFT" (T6) | 7.41 / 105.01 / 61.0 / 71.39 | 7.40 / 105.00 / 61.0 / 71.40 |
| deepseek-6.7b-paft | PAFT (T3/T5/T6) | 10.13 / 80.66 / 42.0 / 76.34 | 10.13 / 80.66 / 42.0 / 76.34 |
| deepseek-6.7b-prompting | Prompting (T5); 308/371 bugs evaluated | 8.25 / 148.61 / 104.5 / 72.17 | 8.3 / 148.6 / 104.5 / 72.2 |
| deepseek-6.7b-trained-curriculum | "+ Curriculum" AND "PAFT (w=1.0)" (T6) | 8.25 / — / — / 68.29 | 8.3 / 111.2 / — / 68.3 |
| deepseek-6.7b-paft-assistantonly | "PAFT (assistant-only, w=2.0)" (T6) | 9.76 / 112.18 / 78.5 / 75.07 | 9.8 / 112.2 / — / 75.1 |
| deepseek-6.7b-paft-0.0 | "PAFT (w=0.0)" (T6) | 7.25 / 120.15 / 82.0 / 75.76 | 7.3 / 120.2 / — / 75.8 |
| deepseek-6.7b-paft-4.0 | "PAFT (w=4.0)" (T6) | 8.22 / 106.93 / 58.0 / 77.80 | 8.2 / 106.9 / — / 77.8 |

Key consequence (confirmed by the author, 2026-07-07): the reported \Sft baseline is the
`promptloss` run, i.e. SFT with full-sequence masking (include_prompt_in_loss=True), so
\Sft and PAFT share the masking convention; "+ Curriculum" == "PAFT (w=1.0)" is the same
run listed under two labels (expected under this reading). The manuscript's Sec. 3.2 was
updated accordingly.

## Anomalies to reconcile

> Update 2026-07-07: items 1 and 2 are RESOLVED by author decision — the manuscript's
> Table 5 RepairLLaMA and AdaPatcher rows now use the same recompute-from-text pipeline
> as all other rows (RepairLLaMA AED/CCR 173.3/126.0, 47.1/36.4; AdaPatcher CCR 68.6/75.0).
> Also verified: the "2,378 training snippets" figure = 3,092 fenced code blocks from the
> 1,535 pairs (incl. intermediate blocks) deduplicated per side with the leakage-check
> tokenization; 742 = 371 bugs x (buggy + developer fix). See also
> `tse_copy_rate_20260707.md` for the output-side token-level copy-rate analysis
> (Base 72.9/80.2, SFT 77.7/82.9, PAFT 81.6/87.1 on own plausible sets).

1. **AdaPatcher (T5)**: pass@1/AED reproduce exactly (5.90 / 112.38 / 61.0, dir
   `deepseek-6.7b-adapatcher`, nested one level), but CCR recomputes to **68.57 / 75.0**,
   not the printed **79.3 / 87.5**. The printed CCR matches neither the cached
   `diff_stats.preserved_ratio` (68.57) nor the uniform recompute.
2. **RepairLLaMA (T5)**: printed AED/CCR (149.1/111.0, 35.3/25.0) equal the cached
   generation-time `diff_stats`; recomputing from `patch_code` with the uniform pipeline
   gives **173.29 / 126.0** and **47.14 / 36.36**. Metric source differs from the other rows.
   Only 316/371 bugs have results.
3. **"- Full masking" (T6)**: `table9.sh` maps this row to dir `deepseek-6.7b-trianed-diff`
   [sic], whose current data yields pass@1 6.69 over 366 bugs — not the printed
   8.7 / 110.7 / 74.3. Possibly a stale/incomplete re-judge. Also clarify how this
   configuration differs from `deepseek-6.7b-paft-assistantonly`.
4. **`deepseek-6.7b-sft`** ("+ Fine-tuning" in table9.sh's older mapping): 260/371 bugs,
   pass@1 6.08 over evaluated bugs; not used by any current table row.
5. **Qwen3-8B / OpenCoder-8B**: the archived dirs do NOT reproduce Table 3
   (e.g., `qwen3-8b` base pass@1 recomputes to 17.84 vs 9.65 in the paper;
   `opencoder8b-paft` has 1-10 candidates per bug). The paper's rows for these backbones
   appear to come from runs absent from the public archive — consider adding them.
6. **deepseek-v3 / qwen3-max**: 333 and 264 bugs with results; recomputed pass@1 39.19 and
   30.38 vs paper 40.6 and 30.4 (denominator/subset to document).

## Training-data / script mismatches (reproducibility)

- `SingleTrainWithLCS.py` selects `BUGGY_END_MARKER = "```\n<|EOT|>"` for any model whose
  name lacks "qwen"/"llama3", but:
  - `deepseek_llm_diff.json` contains no `<|EOT|>` at all (uses `### Response:`), so the
    response split (`split_indices`) fails on it;
  - `deepseek_llm_diff_fillme.json` has the `<|EOT|>` separators but uses the marker
    "This is a buggy code with <FILL_ME> placeholder:", so the buggy-code extraction fails;
  - `opencoder_llm.json` is in `<|im_start|>/<|im_end|>` format, which the name-based
    selection would not match for "opencoder8b".
  The script/data combination that actually produced the released checkpoints should be
  pinned (exact script version + data file + invocation per backbone).

## New analyses added alongside this note

- `tse_d4j_significance_common_plausible_20260706.md` (+ script
  `scripts/tse_d4j_significance_common_plausible.py`): paired bootstrap (10k, seed
  20260706) + exact McNemar for PAFT vs Base/SFT/Prompting/RepairLLaMA/AdaPatcher, and
  first-plausible common-plausible-subset AED/CCR. Requires `pip install Levenshtein`.
- `tse_alignment_coverage_20260706.md` (+ script `scripts/tse_alignment_coverage.py`):
  coverage of I_align over fixed-code tokens per backbone tokenizer on the 1,535 training
  pairs (mean ~77%, median ~86%, IQR 63-96%). Requires `transformers` + `sentencepiece`
  (OpenCoder needs trust_remote_code).
