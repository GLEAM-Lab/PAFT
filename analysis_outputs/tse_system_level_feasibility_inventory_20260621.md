# TSE System-Level APR Feasibility Inventory (2026-06-21)

This note audits local Agentless/KGCompass/SWE-bench artifacts for Reviewer C's
request to compare with recent system-level APR methods such as Agentless and
AutoCodeRover. The goal is to distinguish usable paper evidence from runs that
are useful only for future experiment planning.

## Current Conclusion

No existing local run is a same-protocol PAFT baseline. The available Agentless
and KGCompass artifacts are system-level SWE-bench/SWE-bench Verified pipelines
with localization, retrieval or context construction, patch generation,
application, validation, and selection. They do not use PAFT as the patch
generator, and they do not provide Defects4J AED/CCR-style edit-quality metrics.

Recommended current manuscript use:

1. Keep Agentless, AutoCodeRover, and RepairAgent in a separated system-level
   reference table, not in the same-class generator baseline table.
2. State that these methods are complementary and that a head-to-head claim
   would require a generator-swap study.
3. Do not report the local KGCompass/Agentless subset runs as PAFT evidence.

## Local Agentless Repository

Path: `/home/barty/research/Agentless`

Relevant local documentation confirms the pipeline structure:

- `README.md`: Agentless follows localization, repair, and patch validation.
- `README_swebench.md`: the SWE-bench workflow localizes files/elements/lines,
  samples multiple patch candidates, runs regression/reproduction tests, and
  reranks selected patches.

This supports the paper's scope distinction: Agentless is not a same-class
single-sample generator-training baseline for PAFT.

## Local KGCompass Agentless Runs

Path: `/home/barty/GLEAM-Lab/KGCompass/temp_run/agentless_compare_subset100*`

Representative official summaries:

| Run | Predictions | Applied | Resolved | Missing reports | Use |
|---|---:|---:|---:|---:|---|
| `agentless_original_qwen3codernext_fulla100` | 100 | 85 | 36 | 15 | system-level reference only |
| `agentless_hybrid_edit_glm5_hybridedit_glm_100` | 100 | 89 | 36 | 11 | system-level reference only |
| `agentless_original_qwen3codernext_serial3_qwen_orig` | 100 | 86 | 36 | 14 | system-level reference only |
| `agentless_original_glm5_serial3_glm_orig` | 100 | 89 | 35 | 11 | system-level reference only |
| `agentless_kg_glm5_kgcompass_subset20_verify` | 20 | 19 | 8 | 1 | small system-level diagnostic |
| `agentless_original_glm5_kgcompass_subset20_verify` | 20 | 17 | 7 | 3 | small system-level diagnostic |

Why not report in PAFT main results:

- They are SWE-bench/SWE-bench Verified repository-level issue runs, not the
  Defects4J generator-level setup used by PAFT.
- They include localization/context construction and validation/selection.
- They do not compare Base/SFT/PAFT under fixed localization and decoding.
- Several summaries have missing official reports, so they are not clean
  publication-ready PAFT evidence.

## Local Regression Patch Evaluation Runs

Path:
`/home/barty/GLEAM-Lab/KGCompass/regression_patch_eval_verified_subset100_v36_subset100_topkdiagnose_r1`

Observed summaries:

| Model family | Evaluated | Passed regression | Notes |
|---|---:|---:|---|
| `glm5` | 100 | 20 | regression-only patch evaluation |
| `qwen3codernext` | 90 | 17 | incomplete 90/100 coverage |

These artifacts contain `predictions.jsonl`, `passing_patches.jsonl`, and
`regression_test_results.jsonl`, but they are not PAFT-generated patches and are
not Defects4J plausibility/AED/CCR evaluations. Keep them out of PAFT tables.

## Dataset/Benchmark Availability

Cached datasets and repos exist locally:

- Hugging Face cache: SWE-bench, SWE-bench Lite, SWE-bench Verified,
  SWE-bench Multilingual, Multi-SWE-bench, and SWE-bench Java.
- Repositories: `/home/barty/research/SWE-bench`,
  `/home/barty/research/SWE-EVO/SWE-bench`,
  `/home/barty/GLEAM-Lab/KGCompass/playground/SWE-bench`.

These make a future system-level or multi-file experiment feasible, but not
cheap. SWE-bench-style evaluation is slower than Defects4J/QuixBugs and does
not directly provide the same ground-truth-patch AED/CCR protocol.

## Strongest Future Experiment

The most defensible future experiment is a generator-swap study:

1. Fix an APR pipeline's localization/retrieval/validation components.
2. Replace only the patch generator with Base, SFT, and PAFT.
3. Run the same bug subset, same candidate budget, and same validation harness.
4. Report both system-level resolved rate and edit-quality metrics where a
   reference patch is available.

Practical starting point:

- Use Agentless repair with existing processed SWE-bench/SWE-bench Verified
  locations if available.
- Start with a 10--20 instance smoke subset to verify patch format and runtime.
- Do not claim system-level SOTA unless the generator-swap is complete and
  reproducible.

## Manuscript Implication

The current TSE framing is appropriate: PAFT is a generator-level preservation
objective. System-level APR methods should be cited and separated because they
are stronger end-to-end repair systems, not controlled generator baselines.
