# Multi-SWE Java Generator-Swap Protocol

This note defines a future system-level smoke test for responding to the multi-file and Agentless/AutoCodeRover concerns. It is a protocol, not a completed PAFT result.

## Fixed Inputs

- Benchmark: local Multi-SWE-bench Java Verified cache at `/home/barty/.cache/huggingface/datasets/Daoguang___multi-swe-bench/default/0.0.0/8bd202138a4ab9987daa77111c76a3e66af9f1c9/multi-swe-bench-java_verified.arrow`.
- Preferred smoke subset: `analysis_outputs/multiswe_java_verified_stratified_smoke12_20260703.jsonl`.
- Subset composition: 4 single-file, 4 two-file, and 4 three-or-more-file repairs.
- Compared generators: Qwen2.5-Coder-14B Base, SFT old-recipe, PAFT old-recipe `w=1.5`, and PAFT old-recipe `w=2.0`.
- Fixed seed: 7401 unless a future script records a replacement seed.

## Controlled Pipeline

1. Checkout each repository at `base_commit`.
2. Use the same localization/context source for every generator. For a first smoke, use oracle changed file paths from the gold patch as file-level localization, but do not expose the gold patch content.
3. Build the prompt from the issue/problem statement plus the buggy content of the localized files.
4. Generate the same number of candidates per generator under identical decoding settings.
5. Convert model output to a repository patch with the same parser for all generators.
6. Evaluate with the same SWE-style harness: apply candidate patch, apply/use the benchmark test patch as required by the harness, and run the listed `FAIL_TO_PASS` and `PASS_TO_PASS` tests.

## Metrics

- End-to-end plausibility: pass@1 and pass@k under the fixed candidate budget.
- Review locality on plausible patches: AED and CCR against the gold patch or gold-modified file content.
- File-level preservation: generated changed-file count, extra touched files, missing gold-touched files.
- Side effects: no-op rate and uncompilable-rate.

## Claim Boundary

This smoke test can support a statement that PAFT is useful as a generator inside a fixed APR-style pipeline if it improves plausibility and/or locality under the same localization, context, test, and selection protocol. It should not be reported as system-level SOTA unless the full pipeline and candidate budget match a published system baseline.
