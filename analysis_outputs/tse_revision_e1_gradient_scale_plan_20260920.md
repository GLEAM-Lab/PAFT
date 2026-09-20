# E1: gradient-scale-matched SFT control (TSE major revision, Reviewer 1 major comment 1)

Status 2026-09-20: scale factor measured, trainer options and run script ready, training
runs NOT yet executed.

## Why

PAFT normalizes the weighted loss by the number of unmasked target tokens N, not by the
sum of the weights:

    L = (1/N) * sum_t beta_t * CE_t ,   beta_t = w_align on aligned response tokens, 1 elsewhere.

With w_align = 2 the loss (and its gradient) is therefore scaled by

    c = sum_t beta_t / N = 1 + |I_align| / N

relative to plain SFT (w_align = 1, same full-sequence loss). Reviewer 1 asks for an SFT
control that receives the same gradient scale, so that the PAFT-vs-SFT difference cannot be
attributed to a larger effective step size, and for the gradient-clipping activation rates of
SFT and PAFT (max_grad_norm = 0.3).

## Measured scale factor (scripts/e1_measure_weight_sum.py)

Rebuilt every training instance exactly as `SingleTrainWithLCS.py` does (tokenize full text,
keep prompt + first response, cut at 2,047, append EOS, `difflib.SequenceMatcher` on token
ids, causal shift). N counts every target token (prompt and response; full-sequence loss).

| trainset / tokenizer | E[sum beta / N] (per instance) | median | min | max | pooled | mean I_align/N | mean I_align/response |
|---|---:|---:|---:|---:|---:|---:|---:|
| deepseek_llm_train.json / DS-Coder-6.7B | **1.2131** | 1.2239 | 1.0137 | 1.4001 | 1.2185 | 0.2131 | 0.6909 |
| qwen_llm_train.json / Qwen2.5-Coder-7B | 1.2218 | 1.2294 | 1.0091 | 1.4094 | 1.2237 | 0.2218 | 0.7289 |

The per-instance mean is the right factor: per-device batch size is 1, so every micro-batch
is normalized by its own N. ("mean I_align/response" divides by the whole first-response
segment including fences and role text; `tse_alignment_coverage_20260706.md` divides by
fixed-code tokens only, hence its higher 77%.)

Command:

    python scripts/e1_measure_weight_sum.py --tokenizer deepseek-ai/deepseek-coder-6.7b-instruct \
        --trainset data/trainset/deepseek_llm_train.json --w-align 2.0

## Trainer options added (SingleTrainWithLCS.py, backward compatible, defaults unchanged)

| env | default | effect |
|---|---|---|
| `LOSS_SCALE` | 1.0 | multiplies the normalized loss by a constant |
| `LEARNING_RATE` | 2e-4 | overrides the learning rate |
| `LOGGING_STEPS` | 100 | set to 1 to record the pre-clip `grad_norm` of every optimizer step in `trainer_state.json` |

`tests/test_loss_weight_alignment.py` still passes with `LOSS_SCALE = 1.0` in its namespace.

## Runs to execute (DS-Coder-6.7B, `bash scripts/e1_run_dscoder.sh`)

| run | output name | LCS_WEIGHT | LOSS_SCALE | LEARNING_RATE | purpose |
|---|---|---:|---:|---:|---|
| A | `deepseek-6.7b-sft-lossscale` | 1.0 | 1.2131 | 2e-4 | SFT with PAFT's loss scale |
| B | `deepseek-6.7b-sft-lrscale` | 1.0 | 1.0 | 2.426e-4 | SFT with PAFT's effective step size |
| C | `deepseek-6.7b-sft-logged` | 1.0 | 1.0 | 2e-4 | paper SFT recipe, per-step grad norms |
| D | `deepseek-6.7b-paft-logged` | 2.0 | 1.0 | 2e-4 | paper PAFT recipe, per-step grad norms |

All runs: SEED 42 (trainer default), 3 epochs, `data/trainset/deepseek_llm_train.json`,
everything else as in `pipeline_deepseek-6.7b.sh`. A and B need the full Defects4J
evaluation (n = 10, `defects4j.py` + `test_d4j.py`, or `scripts/fast_d4j_generate_vllm.py`
on the merged model); C and D only need the training logs, though evaluating them gives a
free same-seed reproducibility check of Table 2.

Interpretation guide. AdamW is invariant to a constant loss scale except through
gradient clipping and epsilon, so run A tests the clipping channel and run B tests the
step-size channel. If A and B land at SFT's pass@1 / AED / over-editing ratio while
PAFT keeps its gap, the preservation effect is not a gradient-scale effect.

## After training

1. Clipping rates: `python scripts/e1_clipping_rate.py models/deepseek-6.7b-sft-logged models/deepseek-6.7b-paft-logged models/deepseek-6.7b-sft-lossscale models/deepseek-6.7b-sft-lrscale`
   (reads the newest `checkpoint-*/trainer_state.json`; report the share of steps with
   pre-clip norm > 0.3 and the mean / median / p90 norm).
2. Defects4J metrics for A and B: `python scripts/compute_d4j_master_metrics.py` (pass@1, AED,
   CCR, ATCL/ATCT), then the over-editing ratio with
   `python scripts/tse_rev_overedit_and_strata.py --dataset <MORepair>/defects4j/dataset --set "SFT loss-scaled=defects4j/results/deepseek-6.7b-sft-lossscale" --set "SFT lr-scaled=defects4j/results/deepseek-6.7b-sft-lrscale"`.
3. Paper: add the two control rows to Table 7 (factorial) with the factor c = 1.21 stated in
   Section 4.4, and the clipping rates in one sentence.
