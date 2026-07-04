# TSE Revision Action Matrix

This note treats the ASE reviews as diagnostic feedback, not as a rebuttal checklist. For a TSE resubmission, we can revise the claim, benchmark mix, tables, and narrative directly, as long as every reported number is reproducible.

## Revision Policy

- Correct or replace any result whose metric script, model directory, prompt format, or benchmark subset is unclear.
- For the TSE resubmission, do not preserve weak or biased historical numbers for continuity. If a result is unfavorable because the protocol is flawed, stale, cherry-picked, or poorly traced, replace it with a clean rerun or remove it from the main evidence.
- Do not keep weak rebuttal diagnostics in the main paper just because they answered a reviewer once.
- Treat old tables as replaceable evidence, not as constraints. A cleaner rerun can supersede a historically reported number even when the old number was used in the ASE submission.
- Promotion rule for main tables: a result needs a traceable model artifact or training log, a fixed prompt/evaluation protocol, and cache-independent metric recomputation from generated patch text.
- Prefer fewer but cleaner tables over broad tables with fragile provenance.
- Separate generator-level claims from system-level APR claims.
- Report mixed results honestly: use them for scope/threats or appendix, not as primary evidence.

## Draft Edits Applied on 2026-06-19

- Updated `tse-paper/0.abstract.tex`, `1.introduction.tex`, and `9.conclusion.tex` to remove the old "all 6 settings / up to 65.6%" claim, because the current repository does not yet provide a provenance-clean HumanEval-Java three-backbone audit or a mapped DS-Coder standard SFT row.
- Replaced the RQ2 main table in `tse-paper/5.experiments_new.tex` with cache-independent Defects4J numbers recomputed from generated `patch_code`.
- Removed the old HumanEval-Java table from the main experimental narrative until those rows are reconstructed or rerun under the same audit script.
- Reframed RQ3 as "generator-level baselines" rather than broad representative APR baselines, and added Agentless/AutoCodeRover to related work as system-level pipelines rather than same-class baselines.
- Replaced the old DS-Coder `6.1/93.5` SFT row in RQ3/RQ4 because no provenance-clean current result directory maps to that row. RQ3 now uses the recomputed full-target SFT variant, and RQ4 is framed as sensitivity diagnostics rather than a perfect single-factor causal chain.
- Updated `4.experimental_setup.tex`, `6.discussion.tex`, and `7.threats.tex` so the current paper no longer implies system-level APR SOTA, multi-file repair, broad cross-language generalization, or fully audited frontier-scale fine-tuning.

These edits intentionally make the current TSE draft more conservative. They should be revisited after new HumanEval/Python/larger-backbone runs are audited.

## Experiment Status on 2026-06-19

- Repository search found no existing Qwen2.5-Coder-7B SFT model or Defects4J result directory. Existing Qwen2.5 artifacts are limited to `qwen2.5coder7b` (Base) and `qwen2.5coder7b-paft` (PAFT).
- The existing Qwen2.5 PAFT model has cleaner provenance than the final DS-Coder continuation: `models/qwen2.5coder7b-paft/adapter_config.json` points directly to `Qwen/Qwen2.5-Coder-7B-Instruct`, with LoRA `r=32`, `alpha=16`, and no intermediate SFT base.
- Training-format audit: Qwen2.5/Qwen3/OpenCoder SFT and PAFT runs use the same chat-template family and `include_prompt_in_loss=True`. Qwen2.5 PAFT's wandb run `u02opcci` records `lcs_weight=2.0`, `method=lcs_weighted`, and `include_prompt_in_loss=True`; the new Qwen2.5 SFT run `oa7y107q` records the same base model, learning rate, epochs, LoRA settings, and `include_prompt_in_loss=True`. This makes Qwen2.5 Base/SFT/PAFT a cleaner within-backbone block than the mixed DS-Coder historical variants.
- Completed a new Qwen2.5-Coder-7B full-target SFT run on local GPU 1:
  - Command: `CUDA_VISIBLE_DEVICES=1 WANDB_MODE=offline HF_ENDPOINT=https://hf-mirror.com python3 SingleTrain.py Qwen/Qwen2.5-Coder-7B-Instruct data/trainset/qwen_sft.json qwen2.5coder7b-sft-tse-20260619`
  - Log: `analysis_outputs/experiment_logs/qwen2.5coder7b-sft-tse-20260619.log`
  - Training completed with 1,535 examples, 3 epochs, and 4,605 steps; merged model copied to `~/research/prorepair/merged_models/qwen2.5coder7b-sft-tse-20260619`.
  - Added the inference alias `qwen2.5coder7b-sft-tse-20260619` to `~/research/prorepair/d4j.py` and the local `defects4j.py`; it points to `merged_models/qwen2.5coder7b-sft-tse-20260619`.
  - Defects4J generation/testing completed for all 371 bugs and 10 candidates per bug; metrics are recomputed in `analysis_outputs/qwen25_sft_tse_audit.md`.
- Started an additional Qwen2.5-Coder-7B assistant-only SFT run on local GPU 0 to test whether the SFT comparison is sensitive to prompt-loss masking:
  - Small script change: `/home/barty/research/morepair/SingleTrain.py` now honors `INCLUDE_PROMPT_IN_LOSS`, defaulting to `true` to preserve historical behavior.
  - Command script: `analysis_outputs/experiment_logs/launch_qwen25_assistonly_sft.sh`
  - Log: `analysis_outputs/experiment_logs/qwen2.5coder7b-sft-assistonly-tse-20260619.log`
  - Wandb offline run: `e59wf6u0`
  - Config confirmed in log: same Qwen2.5 base, same 1,535 examples, 3 epochs, but `INCLUDE_PROMPT_IN_LOSS=false`.
  - Added inference alias `qwen2.5coder7b-sft-assistonly-tse-20260619` to `~/research/prorepair/d4j.py` and local `defects4j.py`.
  - Decision rule: use the cleaner/stronger SFT baseline in the TSE main table only if PAFT still improves the pass@1/AED operating point; otherwise, report the comparison honestly and adjust claims.
- Completed Qwen2.5-Coder-7B SFT generation and Defects4J validation for both SFT variants under the complete 371-bug, 10-candidate protocol. The TSE paper should report only pass@1:
  - Full-target SFT: pass@1 = 11.73, Avg./Med. AED = 96.13/53.00, Avg./Med. CCR = 71.12/80.26.
  - Assistant-only SFT: pass@1 = 12.70, Avg./Med. AED = 81.58/36.00, Avg./Med. CCR = 75.29/85.00.
  - PAFT remains strongest on pass@1 and Avg. AED: pass@1 = 15.20, Avg./Med. AED = 71.26/43.00. Assistant-only SFT has the lowest Med. AED, so state this exception explicitly.
- Rechecked the strong HumanEval-Java `deepseek-6.7b-parepair-fl` result. The generated outputs exist in `evalrepair-java-res/deepseek-6.7b-parepair-fl`, but the only model provenance found in the current repository is `inference_java.py`, which points to `/root/autodl-tmp/models/deepseek-6.7b-parepair-fl/merged`. Additional searches across `~/research/morepair`, `~/research/prorepair`, local model directories, shell/log files, and wandb metadata did not find a matching model artifact, training command, or recipe. Keep this result out of the TSE main evidence unless the missing training provenance is recovered or the model is rerun cleanly.
- Fixed `scripts/recompute_humaneval_java_metrics.py` so HumanEval-Java pass@1 estimation uses all origin tasks as the denominator; tasks where generation failed to extract Java are now counted as failures instead of being dropped. The clean n=10 Qwen2.5 results were unchanged after recomputation, but this matters for small-n diagnostics.
- Ran a separate HumanEval-Java Qwen2.5 greedy n=1 diagnostic with independent output keys (`*-greedy-n1`) and the corrected denominator:
  - Base: pass@1 `7.98`, Avg./Med. AED `139.15/101.00`, Avg./Med. CCR `64.69/66.67`.
  - Assistant-only SFT: pass@1 `6.13`, Avg./Med. AED `24.60/3.50`, Avg./Med. CCR `82.41/83.48`.
  - PAFT: pass@1 `3.68`, Avg./Med. AED `36.00/11.00`, Avg./Med. CCR `81.96/85.64`.
  - Decision: greedy n=1 is not a usable PAFT evidence block; it improves locality among PAFT's few plausible patches but substantially hurts PAFT correctness.

## Must Change for TSE

| Area | Current Risk | TSE Action |
|---|---|---|
| Core claim | Current text implies a broad APR baseline win and a general recipe. | Reframe as preservation-aware generator fine-tuning for localized/single-file repair. Remove system-level SOTA implications. |
| Large-model concern | Closed-source frontier models have much higher pass@1, so PAFT should not be framed as universally better than frontier APIs. | Treat Qwen3-Max/DeepSeek-V3 as reference diagnostics. Emphasize within-backbone controllable fine-tuning. Use the complete Qwen2.5-Coder-14B Defects4J `n=10` seed 7401 block as the larger open-weight backbone evidence: Base 20.38/21.01/21.02 pass@1/5/10 and 169.17/123.00 AED; SFT 20.24/22.78/23.72 and 79.43/34.00 AED; PAFT-w1.5 22.16/24.13/24.80 and 61.18/26.00 AED; PAFT-w2 23.05/24.63/25.07 and 63.53/34.00 AED. |
| Baselines | Agentless/AutoCodeRover are absent and reviewers read this as missing SOTA. | Add them to related work and a separate system-level reference table. State they are multi-step APR systems with localization/search/reranking, not same-class generator baselines. |
| Method rationale | "Simple weighting" invites black-box/data-magic criticism. | Recast PAFT as copy/transform supervision decomposition: matched tokens teach source-conditioned preservation; unmatched tokens retain repair transformation loss. |
| Fault localization | Current framing can sound like over-editing is the semantic cause of failures. | State over-editing is an observable failure mode and reviewability risk; correctness gains likely come from a learned preservation/localization prior, not an inference-time oracle. |
| Curriculum | Table 10 shows curriculum alone worsens AED/CCR. | Stop claiming curriculum is a locality component. Present it as capability/stability oriented; do not spend more compute on repeated PAFT-minus-curriculum runs unless a single fixed-seed rerun becomes reportable. |
| Weight selection | Single-run `w_align=2` should not be presented as a universal optimum. | Reframe `w_align=2` as a fixed symmetric anchor validated by diagnostic sweeps and the Qwen14 fixed-seed trade-off. Use fixed seeds for reproducibility instead of repeated-seed averaging. |
| Contamination | Exact SHA-only analysis is too weak. | Add normalized token n-gram near-duplicate analysis and top-k manual inspection if feasible. |
| Cross-language scope | Original paper is Java-only. | Use Python pilots only as sanity checks. DS-Coder QuixBugs seed 7106 is positive over Base/SFT. Qwen14 QuixBugs seed 7106 is positive over SFT and locality but not over Base raw correctness. Do not claim broad cross-language coverage. |

## Strong Existing Evidence to Keep

| Evidence | Why It Helps | Status |
|---|---|---|
| Qwen8B Defects4J SFT vs PAFT | Clean same-backbone comparison: PAFT improves pass@1 and lowers Avg./Med. AED while improving CCR. | Keep in main or appendix after provenance check. |
| Qwen2.5-Coder-7B Defects4J Base/SFT/PAFT | Newer/stronger open backbone with complete 371-bug validation. PAFT improves pass@1 and Avg. AED over Base, full-target SFT, and assistant-only SFT; assistant-only SFT has lower Med. AED. | Keep in main table as the cleanest same-backbone block; state the median-AED exception explicitly. |
| Qwen2.5-Coder-14B Defects4J fixed-seed Base/SFT/PAFT | Strongest larger-backbone result. With fixed seed 7401 and ten samples, both PAFT rows improve correctness over Base/SFT and reduce AED while increasing CCR. PAFT-w2 gives the best pass@1/pass@5/pass@10 (23.05/24.63/25.07), while PAFT-w1.5 gives the best AED/CCR operating point (61.18/26.00 AED, 80.49/88.89 CCR). The `n=5` block shows the same pattern and remains useful provenance/sensitivity evidence. | Promote as the main answer to the larger-backbone concern and as fixed-seed `w_align` trade-off evidence. Keep frontier models as out-of-class diagnostics. |
| Edit-location diagnostic | Directly answers "fault localization" concern: PAFT reduces edits outside reference-changed lines without increasing missed reference edits. | Good mechanism analysis. |
| No-op analysis | Shows PAFT does not collapse to copying the buggy input. | Keep as side-effect diagnostic, with raw counts and validation semantics. |
| Human study | Supports AED as review-oriented quality metric among plausible patches. | Keep, but avoid claiming it decides all system-level trade-offs. |

## Weak or Risky Evidence

| Evidence | Issue | Decision |
|---|---|---|
| OpenCoder cached edit metrics | Cached `.result` diff_stats are stale for OpenCoder base/PAFT: cached AED was `0.00` for some rows, but recomputation from `patch_code` gives normal values (`opencoder8b`: `137.92/84.00`; `opencoder8b-paft`: `78.79/45.00`). | Use only recomputed AED/CCR, not cached diff_stats. OpenCoder can return to the main table after all rows are regenerated with `scripts/recompute_d4j_metrics.py`. |
| `qwen3-8b-trained-noprompt` | Cached `.result` diff_stats are stale/wrong: `test_d4j.py` reports Avg./Med. AED `5.18/0.00`, but independent recomputation from cached `patch_code` gives `76.85/35.00`, with zero plausible no-op patches. | Exclude from the main table unless its exact training role is mapped and cached diff stats are rewritten. |
| Old DS-Coder SFT row (`6.1/93.5`) | The current result directories do not map cleanly to this row. `deepseek-6.7b-trained` maps to the old `+ Full masking` row (`7.4/105.0`) rather than standard SFT. | Removed from current TSE main tables. Use recomputed full-target SFT as the DS-Coder generator baseline when needed. |
| Final DS-Coder PAFT continuation | `sft_deepseek7b_prorepair_2.0_fixed_aligned` was trained from `merged_models/sft_deepseek7b_prorepair_2.0_fixed_ckpt1200`, not directly from the raw DeepSeek base. | Keep as a strong final recipe result, but present RQ4 as sensitivity diagnostics, not a strict one-factor causal ablation. |
| `qwen-8b-trained-prorepair` | Looks positive (`11.67` pass@1, `60.33/30.00` AED), but naming/provenance differs from `qwen8b-paft`. | Treat as historical variant only until mapped to its exact training script. |
| QuixBugs-Python AED | The DS-Coder fixed-seed 7106 audit supersedes older cached runs for reportable text: PAFT improves pass@1, Avg./Med. AED, and Avg./Med. CCR over Base/SFT under the adapter-direct protocol. The Qwen14 fixed-seed 7106 run improves PAFT over SFT in pass@1/pass@5 and CCR, but Base remains strongest in raw correctness. | Use as preliminary cross-language sanity checks with full provenance; do not promote them to broad Python generalization. |
| HumanEval-Java Qwen2.5 assistant-only SFT | Clean n=10 run shows PAFT improves estimated pass@1 over Base/full-target SFT/assistant-only SFT, but assistant-only SFT has lower Avg./Med. AED than PAFT. Common-solved-bug analysis is also unfavorable for PAFT on AED. Qwen14 seed 7301/7302 `n=5` runs are correctness-mixed but can be used as appendix locality/trade-off diagnostics. | Use HumanEval-Java only as an appendix correctness/locality sanity check. Do not use it as main minimal-edit evidence. |
| HumanEval-Java Qwen2.5 greedy n=1 | Corrected-denominator run gives PAFT lower pass@1 than Base/SFT (`3.68` vs `7.98/6.13`), despite reasonable locality among its few plausible patches. | Do not use. This protocol is bad for PAFT and does not answer the main TSE concern. |
| Frontier prompt vs PAFT AED | Different solved subsets make direct AED comparison unfair. | Use only as "minimal-change prompting does not eliminate edit overhead for tested frontier model," not PAFT beats frontier LLM. |
| PAFT-minus-curriculum quick run | Prior single run looked unstable/bad. | Rerun cleanly or omit. Do not report as evidence. |

### QuixBugs-Python Audit Detail

Existing QuixBugs-Python runs are useful for stress testing cross-language behavior, but should remain sanity-check evidence rather than a main TSE claim.

- Early directories such as `quixbugs_python_ds67_benchmark_prompt` report very low CCR because they used an older CCR/ground-truth comparison convention (`gt_ccr_median` around 26.4). The current adapter-direct audit uses the corrected line-preservation convention and a fixed Base/SFT/PAFT triad.
- The reportable fixed-seed audit (`analysis_outputs/tse_quixbugs_ds67_fixed_seed7106_summary.md`) gives Base/SFT/PAFT:
  - pass@1 = 32.00 / 24.50 / 43.50.
  - Avg. AED = 306.11 / 285.16 / 261.94.
  - Med. AED = 284.50 / 269.00 / 250.00.
  - Avg. CCR = 59.65 / 56.74 / 75.66.
  - Med. CCR = 64.58 / 66.67 / 81.82.
- Decision: use QuixBugs-Python as a limited cross-language sanity check with full provenance. Do not claim broad Python generalization or multi-file transfer.
- Qwen14 fixed-seed audit (`analysis_outputs/quixbugs_python_qwen14_oldrecipe_seed7106_summary_20260703.md`) gives Base/SFT/PAFT:
  - pass@1 = 65.50 / 43.00 / 45.00.
  - pass@5 = 87.50 / 72.50 / 85.00.
  - Avg. AED = 238.21 / 134.58 / 179.00.
  - Med. AED = 129.00 / 14.00 / 15.00.
  - Avg. CCR = 84.42 / 90.11 / 91.42.
  - Med. CCR = 88.89 / 94.20 / 94.51.
- Decision: use Qwen14 QuixBugs only as PAFT-vs-SFT/locality evidence because Base dominates raw correctness.

## Candidate New Main Table for TSE

Recommended main Defects4J table should emphasize reproducible within-backbone comparisons and single-sample repair. Main text should report `pass@1` plus AED/CCR. `pass@5`/`pass@10` should stay as internal sampling diagnostics only, not as paper tables, because they imply multiple candidates and an oracle/reranker. All AED/CCR values below are recomputed from stored `patch_code`, not trusted from cached `diff_stats`.

| Backbone | Method | pass@1 | Avg AED | Med AED | Avg CCR | Med CCR |
| DS-Coder-6.7B | Base | 5.80 | 142.90 | 113.00 | 70.64 | 75.00 |
| DS-Coder-6.7B | PAFT | 10.13 | 80.66 | 42.00 | 76.34 | 85.42 |
| Qwen3-8B | SFT | 10.16 | 101.77 | 58.00 | 72.85 | 81.58 |
| Qwen3-8B | PAFT | 13.02 | 68.57 | 30.00 | 76.41 | 85.71 |
| Qwen2.5-Coder-7B | Base | 14.42 | 143.09 | 85.00 | 68.43 | 73.68 |
| Qwen2.5-Coder-7B | SFT (full-target) | 11.73 | 96.13 | 53.00 | 71.12 | 80.26 |
| Qwen2.5-Coder-7B | SFT (assistant-only) | 12.70 | 81.58 | 36.00 | 75.29 | 85.00 |
| Qwen2.5-Coder-7B | PAFT | 15.20 | 71.26 | 43.00 | 77.27 | 85.71 |
| OpenCoder-8B | Base | 7.92 | 137.92 | 84.00 | 76.56 | 85.71 |
| OpenCoder-8B | SFT | 6.77 | 110.18 | 61.00 | 76.77 | 86.96 |
| OpenCoder-8B | PAFT | 9.95 | 78.79 | 45.00 | 78.06 | 85.71 |

This table is now a strong Defects4J candidate table. It directly supports the TSE-scoped claim that PAFT improves the pass@1/AED operating point for controllable open/local generators. It still needs (1) the same cache-independent metric audit for any additional benchmark before reuse, and (2) optionally a clean DS-Coder standard SFT rerun if we want a complete DS-Coder Base/SFT/PAFT block again.

### Qwen2.5 PAFT-v2 Sensitivity

The PAFT-v2 runs use assistant-only loss plus weighted normalization. They are useful as a sensitivity study, not the current main table, because the original Qwen2.5 PAFT remains the strongest standard pass@1 estimator. However, PAFT-v2 `w=2.0` is the strongest locality variant and also improves strict first-candidate (`fixed0`) pass/AED over both SFT variants.

| Method | pass@1 est. | fixed0 pass | Avg AED | Med AED | fixed0 Avg AED | fixed0 Med AED | Avg CCR | Med CCR |
|---|---:|---:|---:|---:|---:|---:|---:|---:|
| SFT (full-target) | 11.73 | 13.21 | 96.13 | 53.00 | 97.06 | 66.00 | 71.12 | 80.26 |
| SFT (assistant-only) | 12.70 | 12.40 | 81.58 | 36.00 | 82.39 | 35.50 | 75.29 | 85.00 |
| PAFT (original) | 15.20 | 11.86 | 71.26 | 43.00 | 70.73 | 45.00 | 77.27 | 85.71 |
| PAFT-v2 `w=2.0` | 13.18 | 14.29 | 58.06 | 30.00 | 51.55 | 27.00 | 78.62 | 85.71 |
| PAFT-v2 `w=1.5` | 13.13 | 13.48 | 60.53 | 30.00 | 60.66 | 35.50 | 80.05 | 88.89 |
| PAFT-v2 `w=1.25` | 13.48 | 13.21 | 68.42 | 34.00 | 73.35 | 35.00 | 76.36 | 85.71 |

Decision: keep original Qwen2.5 PAFT as the main pass@1-estimator result. Use PAFT-v2 `w=2.0` as evidence that the improved assistant-only weighted-normalization strategy can further reduce AED and improve strict first-candidate behavior. Do not use `w=1.5` or `w=1.25` as main results; they mainly trade locality for small or no pass@1 gains.

### HumanEval-Java Qwen2.5-Coder-7B Clean n=10 Audit

Generated with `scripts/fast_humaneval_java_generate_vllm.py` using the appendix-style HumanEval-Java prompt and evaluated with the fixed parallel Maven harness (`scripts/parallel_humaneval_java_rejudge.py`, 16 workers, offline local Maven repo). Missing extracted files are padded as failures by `scripts/recompute_humaneval_java_metrics.py`.

| Method | pass@1 | Plausible patches | Avg AED | Med AED | Avg CCR | Med CCR |
|---|---:|---:|---:|---:|---:|---:|
| Base | 1.29 | 21 | 326.67 | 260.00 | 50.58 | 58.33 |
| SFT (full-target) | 1.29 | 21 | 149.24 | 124.00 | 61.74 | 61.11 |
| SFT (assistant-only) | 1.35 | 22 | 73.23 | 6.50 | 78.40 | 79.47 |
| PAFT | 1.60 | 26 | 123.31 | 33.50 | 74.02 | 82.21 |

By solved bug rather than plausible patch, PAFT solves 12 bugs, assistant-only SFT solves 11, and the overlap contains only 5 bugs. On this common solved subset, PAFT's best-AED Avg./Med. is `52.60/3.00`, while assistant-only SFT is `26.80/1.00`; best-CCR Avg./Med. is `73.05/80.00` for PAFT and `82.06/80.00` for assistant-only SFT.

Interpretation: PAFT is the best on estimated pass@1 and plausible patch count, and it improves AED/CCR over Base and full-target SFT. However, it does not beat assistant-only SFT on AED, including on the common solved subset. This benchmark should not be used as primary minimal-edit evidence in the TSE submission. It is only defensible as an appendix sanity check that PAFT transfers some correctness benefit to HumanEval-Java under Qwen2.5, with locality trade-offs stated explicitly.

### HumanEval-Java Qwen2.5-Coder-14B Package-Normalized n=5 Audit

The old unnormalized Qwen14 `n=5` HumanEval-Java artifacts should not be used: benchmark tests call `humaneval.buggy.*`, while raw generations often declared `humaneval.fixed`, `humaneval.fix`, `humaneval`, or no package. The `*-pkgfix` rerun preserves raw outputs and normalizes only the package declaration before Maven validation.

| Method | pass@1 | pass@5 | Plausible patches | Avg AED | Med AED | Avg CCR | Med CCR |
|---|---:|---:|---:|---:|---:|---:|---:|
| Base | 2.09 | 7.36 | 17 | 394.24 | 481.00 | 42.92 | 33.33 |
| SFT old-recipe | 3.07 | 7.36 | 25 | 139.44 | 29.00 | 73.63 | 77.78 |
| PAFT old-recipe `w=1.5` | 2.33 | 8.59 | 19 | 124.05 | 127.00 | 75.14 | 72.73 |
| PAFT old-recipe `w=2.0` | 0.61 | 0.61 | 5 | 272.00 | 272.00 | 72.73 | 72.73 |

Interpretation: the only defensible positive signal is PAFT-w1.5's pass@5 and average locality improvement over SFT. It loses pass@1 and median AED to SFT, and PAFT-w2 is a clear over-preservation/capability-collapse point. Use this as an appendix trade-off diagnostic only, not a main HumanEval-Java claim.

## Next Experiments, Ordered

1. Use the completed Qwen2.5-Coder-14B Defects4J old-recipe `n=10` seed7401 sweep as the reportable larger-backbone evidence. Keep the earlier `n=5` sweep only as provenance/sensitivity evidence, and use the HumanEval-Java and HumanEvalPack-Python Qwen14 rows only as appendix diagnostics.
2. Keep QuixBugs-Python fixed seed 7106 as the reportable Python sanity check; use HumanEvalPack-Python as locality/common-plausible support, not as a raw correctness claim over Base.
3. Do not report pass@5/pass@10 in main paper tables. The TSE main text should define pass@1 as the primary correctness metric for single-sample repair and pair it with AED/CCR.
4. Do not start additional repeated-seed `w_align={0,2,4}` runs unless explicitly required later. Use fixed reportable seeds and record them in scripts/artifacts.
5. Do not rerun PAFT-minus-curriculum by default: the prior fixed diagnostic was unfavorable and would mainly weaken the narrative unless the training setup is redesigned.
6. The next high-value experiment, if any, should address multi-file/system-level APR directly rather than repeated seed search. `system_level_swap_feasibility_20260703.md` records the local SWE-bench/Multi-SWE-bench Java/Agentless/KGCompass assets needed to design a small generator-swap smoke test; `multiswe_java_verified_summary_20260703.md` shows 91 Java Verified tasks with gold/test patches and 61/91 (67.0%) multi-file gold patches. Prefer `multiswe_java_verified_stratified_smoke12_20260703.jsonl` for a first smoke because it deterministically covers 4 single-file, 4 two-file, and 4 three-plus-file repairs. The initial protocol is fixed in `multiswe_generator_swap_protocol_20260703.md`. Avoid more small function-level benchmarks unless they expose a new reviewer-facing gap.

## Historical Larger-Backbone Runs

- Qwen2.5-Coder-14B PAFT smoke succeeded on local GPU1 with QLoRA, confirming the 14B backbone fits and trains on one RTX 4090D.
- Completed `qwen2.5coder14b-paft-tse-20260619-e1` as a 1-epoch PAFT screening run:
  - Training log: `analysis_outputs/experiment_logs/qwen2.5coder14b-paft-tse-20260619-e1.log`
  - Training config: Qwen/Qwen2.5-Coder-14B-Instruct, `LCS_WEIGHT=2.0`, `INCLUDE_PROMPT_IN_LOSS=true`, `EPOCH_NUM=1`, `MERGE_AND_SAVE_FULL_MODEL=true`.
  - Revalidated Defects4J fixed0/pass@1 result: Base `20.75`, AED Avg./Med. `202.99/151.00`, CCR Avg./Med. `67.87/75.00`; PAFT e1 `15.90`, AED `62.76/34.00`, CCR `79.61/90.00`.
  - Interpretation: this configuration strongly improves locality but loses raw correctness on 14B, so it should be treated as an over-preservation/capability trade-off diagnostic, not as main larger-backbone evidence.
- Completed Qwen2.5-Coder-14B base Defects4J generation in pass@1/fixed0-only mode (`n=1`, batch size 8, and `--gpu-memory-utilization 0.75`):
  - Earlier `n=10` generation was stopped after producing a small partial prefix because the TSE version now reports pass@1 only.
  - Generation log: `analysis_outputs/experiment_logs/fast_d4j_qwen2.5coder14b_fixed0.log`
  - Output dir: `/home/barty/research/prorepair/defects4j/results/qwen2.5coder14b`
- Completed earlier larger-backbone optimization run: `qwen2.5coder14b-paft-v2opt-assistonly-w125-lr5e5-e1-20260619`.
  - Script: `/home/barty/research/morepair/SingleTrainWithLCSOptimized.py`.
  - Config: `INCLUDE_PROMPT_IN_LOSS=false`, `LCS_WEIGHT=1.25`, `LEARNING_RATE=5e-5`, `EPOCH_NUM=1`, `VAL_RATIO=0.0`, `GRADIENT_ACCUMULATION_STEPS=1`, `LR_SCHEDULER=constant`, `NEFTUNE_NOISE_ALPHA=5.0`.
  - Purpose: reduce the over-preservation pressure observed in e1 and test whether a more conservative PAFT setting can recover 14B pass@1 while preserving AED/CCR gains.
  - Training log: `analysis_outputs/experiment_logs/qwen2.5coder14b-paft-v2opt-assistonly-w125-lr5e5-e1-20260619.log`.
  - Generation logs: `analysis_outputs/experiment_logs/fast_d4j_qwen2.5coder14b-paft-v2opt-assistonly-w125-lr5e5-e1-20260619_shard0.log` and `_shard1.log`.
  - Validation log: `analysis_outputs/experiment_logs/test_d4j_qwen2.5coder14b-paft-v2opt-assistonly-w125-lr5e5-e1-20260619_fixed0only.log`.
  - Recomputed metrics: `analysis_outputs/d4j_qwen25_14b_v2opt_pass1_metrics.md` and `.csv`.
  - Completed fixed0/pass@1 Defects4J result: Base `20.75`, AED Avg./Med. `202.99/151.00`, CCR Avg./Med. `67.87/75.00`; PAFT e1 `15.90`, AED `62.76/34.00`, CCR `79.61/90.00`; PAFT v2opt `18.06`, AED `74.63/34.00`, CCR `71.41/83.33`.
  - Interpretation: v2opt recovers `+2.16` pass@1 points over the first 14B PAFT screening run and keeps a large edit-locality gain over the 14B base model (`202.99 -> 74.63` Avg. AED; `151.00 -> 34.00` Med. AED). It still trails the 14B base in raw pass@1 (`20.75 -> 18.06`), so it is useful as larger-backbone evidence for preservation/locality but not yet as a clean larger-backbone correctness win.
  - Qwen2.5-Coder-32B-Instruct fallback download was attempted via `scripts/download_hf_snapshot.py` with `hf-mirror`; it only produced partial `.incomplete` blobs and no `model.safetensors.index.json`, so the 32B backbone is not usable until the weight sync is fixed.

## Python Sanity Check Status

Several QuixBugs-Python pilot runs exist under `analysis_outputs/quixbugs_python_ds67*`, and older folders should not be mixed because their prompt and extraction settings differ. The current reportable audit is the adapter-direct fixed-seed 7106 Base/SFT/PAFT block summarized in `analysis_outputs/tse_quixbugs_ds67_fixed_seed7106_summary.md`; use those numbers for TSE text and tables.
