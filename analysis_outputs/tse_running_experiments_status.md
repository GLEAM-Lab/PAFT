# Running Experiment Status

Last updated: 2026-07-04 18:10 CST.

## 2026-07-04 Local Qwen14 Defects4J `n=10` Seed 7403 Continuation

Purpose: produce another fixed decoding-seed robustness block for the Qwen2.5-Coder-14B Defects4J comparison. Seed 7401 remains the main larger-open-backbone evidence; seed 7403 is a robustness/recovery run and should be reported only if the full four-row table is clean.

Active screens:

- `d4j_qwen14_n10_s7403_generate`: serial generation queue on local GPU1.
- `d4j_qwen14_n10_s7403_validate_watch`: per-row validation watcher.
- `post_hepack_qwen14_w2_resume_d4j_s7403`: completed HumanEvalPack-Python `w=2.0`, summarized the four-row table, and is now resuming the paused D4J PAFT `w=2.0` generation on GPU0.

Launchers and logs:

- GPU1 queue: `analysis_outputs/logs/run_d4j_qwen14_oldrecipe_n10_seed7403_gpu1_20260704.sh`
- GPU1 log: `analysis_outputs/logs/run_d4j_qwen14_oldrecipe_n10_seed7403_gpu1_20260704.log`
- GPU0 `w=2.0` launcher: `analysis_outputs/logs/run_d4j_qwen14_oldrecipe_w2_n10_seed7403_gpu0_20260704.sh`
- GPU0 `w=2.0` log: `analysis_outputs/logs/run_d4j_qwen14_oldrecipe_w2_n10_seed7403_gpu0_20260704.log`
- Validation watcher: `analysis_outputs/logs/watch_validate_d4j_qwen14_oldrecipe_n10_seed7403_20260704.sh`
- Watcher log: `analysis_outputs/logs/watch_validate_d4j_qwen14_oldrecipe_n10_seed7403_20260704.log`
- HumanEvalPack-Python `w=2.0` direct log: `analysis_outputs/logs/run_humanevalpack_python_qwen14_w2_now_gpu0_20260704.log`
- Post-watch launcher: `analysis_outputs/logs/post_humanevalpack_qwen14_w2_resume_d4j_s7403_gpu0_20260704.sh`
- Post-watch log: `analysis_outputs/logs/post_humanevalpack_qwen14_w2_resume_d4j_s7403_gpu0_20260704.log`

Settings:

- benchmark: Defects4J full 371 bugs
- candidates per bug: `n=10`
- seed: `7403`
- prompt style: `java_plain`
- extraction profile: `historical_strict`
- model rows: Qwen14 Base, SFT old-recipe, PAFT old-recipe `w=1.5`, PAFT old-recipe `w=2.0`

Status at 2026-07-04 15:35 CST: the low-priority D4J PAFT `w=2.0` robustness row was paused after preserving `1928/3710` generated JSON files so GPU0 could first fill the more useful missing Qwen14 HumanEvalPack-Python PAFT `w=2.0` row. A script configuration bug was found and fixed in `scripts/run_humanevalpack_python.py`: the w2 model id was missing from both `MODEL_CONFIGS` and `ADAPTER_CONFIGS`. The corrected HumanEvalPack-Python `w=2.0` row completed and was summarized in `analysis_outputs/humanevalpack_python_qwen14_oldrecipe_20260703_seed7202/summary_20260704_w2.{csv,md}` and `common_plausible_20260704_w2.{csv,md}`. Result: PAFT-w2 reaches `55.98/93.29` pass@1/5, `87.65/48.00` Avg./Med. AED, and `80.00/84.62` Avg./Med. CCR. This is weaker than PAFT-w1.5 on pass@1 and median AED, so w1.5 remains the preferred Python operating point. The evidence summary was regenerated to include the w2 row. GPU0 has resumed D4J PAFT `w=2.0`; latest count is `1960/3710`. GPU1 continues SFT generation for seed7403 (`256/3710` at latest check), and Base D4J validation continues on CPU (`243/371` result files at latest check).

Live update at 2026-07-04 18:03 CST: local generation is active and progressing. Base has completed generation and validation (`3710/3710` JSON, `371/371` result files). SFT is active on local GPU1 (`1840/3710` JSON; PID `1037848` has `CUDA_VISIBLE_DEVICES=1`). PAFT `w=1.5` is active on local GPU0 (`1992/3710` JSON; PID `935437` has `CUDA_VISIBLE_DEVICES=0`). PAFT `w=2.0` remains queued in `d4j_qwen14_w2_n10_s7403_wait_anygpu` and will resume automatically when either local GPU is released (`1968/3710` JSON currently preserved). The split-safe validation watcher `d4j_qwen14_n10_s7403_validate_watch_v3` is waiting for all four rows to reach `3710/3710` before running Defects4J validation. Readiness gate after adding seed7403 status/format script checks passed at `analysis_outputs/logs/check_tse_ready_after_ready_gate_seed7403_scripts_20260704_180229.log`; the follow-up gate after this status update passed at `analysis_outputs/logs/check_tse_ready_after_seed7403_status_update_20260704_180412.log`.

Live update at 2026-07-04 18:05 CST: SFT is at `1848/3710`, PAFT `w=1.5` is at `2024/3710`, and PAFT `w=2.0` remains preserved at `1968/3710` while waiting for a GPU. The refreshed partial fixed0 output-format audit (`analysis_outputs/d4j_qwen14_seed7403_partial_fixed0_format_20260704.csv`) reports no prose-like or empty outputs: SFT `185` files with `88.1%` Java-like, PAFT `w=1.5` `203` files with `97.0%` Java-like, and PAFT `w=2.0` `197` files with `95.4%` Java-like. `scripts/check_tse_evidence_artifacts.py` and the full readiness gate passed after this refresh; log: `analysis_outputs/logs/check_tse_ready_after_seed7403_partial_format_refresh_20260704_180529.log`.

Live update at 2026-07-04 18:07 CST: SFT is at `1864/3710`, PAFT `w=1.5` is at `2072/3710`, and PAFT `w=2.0` remains preserved at `1968/3710` while waiting for a GPU. The TSE manuscript framing was tightened to avoid root-cause overclaiming: the abstract now describes PAFT as learning a preservation prior for stable context, and the RQ1 insight now frames over-editing as a distinct review-oriented quality risk rather than the main semantic cause of repair failure. `scripts/check_tse_claim_hygiene.py` now requires the discussion phrase `does not require treating over-editing as the semantic root cause`. The full readiness gate passed after this edit; log: `analysis_outputs/logs/check_tse_ready_after_rootcause_framing_tighten_20260704_180727.log`.

Live update at 2026-07-04 18:10 CST: SFT is at `1896/3710`, PAFT `w=1.5` is at `2120/3710`, and PAFT `w=2.0` remains preserved at `1968/3710` while waiting for a GPU. Fixed-seed reproducibility was strengthened: `scripts/tse_fixed_seed_manifest.py` now validates that complete records have expected artifacts and that listed launcher scripts contain the corresponding fixed seed marker. The manifest now includes the Qwen14 HumanEvalPack-Python launcher scripts and the seed7402 D4J launchers, rather than only metric summaries. The full readiness gate passed after this validation change; log: `analysis_outputs/logs/check_tse_ready_after_fixed_seed_manifest_validation_20260704_181005.log`.

Live update at 2026-07-04 18:16 CST: a one-GPU follow-up has been queued locally as `multiswe_runnable89_qwen14_after_d4j`. It waits until the seed7403 PAFT `w=2.0` D4J continuation reserves one GPU, then uses the other free local GPU for a larger Multi-SWE Java Verified generator-level diagnostic. The input artifacts are `analysis_outputs/multiswe_java_verified_all91_20260704.jsonl`, `analysis_outputs/multiswe_java_verified_all91_contexts_ctx5_20260704.{jsonl,md}`, and `analysis_outputs/multiswe_java_verified_runnable_all91_ctx5_max20k_neutral_20260704.{jsonl,md}`. The runnable subset retains `89/91` Java Verified tasks under a neutral prompt with `+/-5` context lines and max prompt length `20,000` chars. Launcher/log: `analysis_outputs/logs/run_multiswe_runnable89_qwen14_neutral_after_d4j_w2_reserved_20260704.{sh,log}`. Expected summary: `analysis_outputs/multiswe_java_runnable89_neutral_generator_summary_20260704.{csv,md}`. The fixed-seed manifest was regenerated to include this running record, and the readiness gate passed after adding the launcher to the audit; log: `analysis_outputs/logs/check_tse_ready_after_multiswe_runnable89_queue_20260704_181640.log`.

Live update at 2026-07-04 18:18 CST: seed7403 generation continues with SFT at `2016/3710`, PAFT `w=1.5` at `2296/3710`, and PAFT `w=2.0` still preserved at `1968/3710` while waiting for a GPU. A refreshed partial fixed0 output-format audit (`analysis_outputs/d4j_qwen14_seed7403_partial_fixed0_format_20260704.csv`) reports no empty or prose-like outputs. Current Java-like rates are SFT `88.6%`, PAFT `w=1.5` `97.4%`, and PAFT `w=2.0` `95.4%`; no-op fixed0 counts are `4`, `9`, and `10`, respectively. The readiness gate passed after this refresh; log: `analysis_outputs/logs/check_tse_ready_after_seed7403_partial_format_20260704_181855.log`.

Live update at 2026-07-04 18:20 CST: cleaned the Multi-SWE context audit wording to pure ASCII (`+/-N` lines) in `scripts/prepare_multiswe_oracle_contexts.py` and the generated 20260704 context markdown artifacts, removing the mojibake plus-minus token from audit-facing files. `python3 -m py_compile scripts/prepare_multiswe_oracle_contexts.py` and the full readiness gate passed after the cleanup; log: `analysis_outputs/logs/check_tse_ready_after_multiswe_context_ascii_20260704_182045.log`.

Live update at 2026-07-04 18:23 CST: verified two earlier Qwen14 supplementary rows are complete. QuixBugs-Python seed7106 summary is in `analysis_outputs/quixbugs_python_qwen14_oldrecipe_seed7106_summary_with_w2_20260704.{csv,md}`: Base remains strongest on raw pass@1 (`65.50`), while PAFT `w=2.0` improves over SFT on pass@1/pass@5 (`52.50/82.50` vs `43.00/72.50`) and CCR (`92.18/94.29` vs `90.11/94.20`). HumanEval-Java package-normalized seed7302 `n=10` summary is in `analysis_outputs/humaneval_java_qwen14_oldrecipe_pkgfix_n10_s7302_20260704.{csv,md}` and remains correctness-neutral (`0.61/0.61/0.61` pass@1/5/10 for all rows), useful only as locality evidence: PAFT lowers AED from SFT `299.00` to `271.00/272.00` and raises CCR from `63.64` to `72.73`. The readiness gate passed after this status update; log: `analysis_outputs/logs/check_tse_ready_after_supplementary_status_20260704_182241.log`.

Live update at 2026-07-04 18:24 CST: ran a broader seed7403 partial output-format audit across all ten candidate directories (`fixed0`--`fixed9`), saved at `analysis_outputs/d4j_qwen14_seed7403_partial_allfixed_format_20260704.csv`. Current aggregate counts remain format-clean: SFT has `2072` files with `88.2%` Java-like, PAFT `w=1.5` has `2408` files with `97.4%` Java-like, and PAFT `w=2.0` has `1968` files with `95.6%` Java-like. All three rows have `0` empty and `0` prose-like outputs in the partial snapshot. The readiness gate passed after this audit; log: `analysis_outputs/logs/check_tse_ready_after_seed7403_allfixed_format_20260704_182404.log`.

Live update at 2026-07-04 18:26 CST: upgraded the evidence audit to prefer the all-candidate partial format snapshot over the earlier fixed0-only snapshot. `scripts/check_tse_evidence_artifacts.py` now aggregates `fixed0`--`fixed9` rows by model before checking Java-like/prose-like/empty rates, and `scripts/summarize_tse_current_evidence.py` now reports the all-candidate format table in the Output-Format Preflight section. The full readiness gate passed after this upgrade; log: `analysis_outputs/logs/check_tse_ready_after_allfixed_format_gate_upgrade_20260704_182556.log`.

## 2026-07-04 Local GPU0 QuixBugs-Python Qwen14 `w=2.0` Seed 7106 Completion Row

Purpose: fill the missing Qwen2.5-Coder-14B PAFT `w=2.0` row for the existing QuixBugs-Python seed-7106 sanity check. This is cross-language appendix/trade-off evidence; it should not be used to claim broad Python generalization because the Qwen14 Base row is already stronger than SFT/PAFT on raw correctness.

Screen:

`quixbugs_qwen14_w2_seed7106_gpu0`

Launcher:

`analysis_outputs/logs/run_quixbugs_qwen14_w2_seed7106_gpu0_20260704.sh`

Log:

`analysis_outputs/logs/run_quixbugs_qwen14_w2_seed7106_gpu0_20260704.log`

Settings:

- GPU: local GPU0 only (`CUDA_VISIBLE_DEVICES=0`)
- seed: `7106`
- candidates per task: `n=5`
- benchmark: full 40-task QuixBugs-Python
- model row: `qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620`
- output directory: `analysis_outputs/quixbugs_python_qwen14_oldrecipe_20260703_seed7106/qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620/`
- expected summary after completion: `analysis_outputs/quixbugs_python_qwen14_oldrecipe_seed7106_summary_with_w2_20260704.{csv,md}`

Status at 2026-07-04 12:02 CST: generation completed all `40/40` tasks and wrote `generations_n5.jsonl`; evaluation is still running inside the same screen. A reusable summarizer was added as `scripts/summarize_quixbugs_python.py` and included in `scripts/check_tse_ready.sh`.

## 2026-07-04 Local GPU0 HumanEval-Java Qwen14 `n=10` Seed 7302 Continuation

Purpose: keep exactly one local GPU active after the Qwen14 Defects4J seed-7402 GPU generation finished. This extends the existing package-normalized HumanEval-Java Qwen14 seed-7302 `n=5` diagnostic to `n=10`. This is appendix/trade-off evidence only; Defects4J seed-7401 remains the main larger-backbone result.

Screen:

`hejava_qwen14_n10_s7302_gpu0`

Launcher:

`analysis_outputs/logs/run_hejava_qwen14_oldrecipe_n10_s7302_generate_gpu0_20260704.sh`

Log:

`analysis_outputs/logs/run_hejava_qwen14_oldrecipe_n10_s7302_generate_gpu0_20260704.log`

Settings:

- GPU: local GPU0 only (`CUDA_VISIBLE_DEVICES=0`)
- seed: `7302`
- candidates per task: `n=10`
- compared rows: Qwen2.5-Coder-14B Base, SFT old-recipe, PAFT old-recipe `w=1.5`, PAFT old-recipe `w=2.0`
- initialization: copies existing raw `n=5` outputs into the new `n=10` output directories, deletes stale `.result` files, then generates missing candidates `fixed5`--`fixed9`

Current status at 2026-07-04 08:52 CST: screen is running on GPU0. Base row is loading/running with `815` Java files already present from the copied `n=5` prefix; SFT/PAFT rows are queued. Package normalization and rejudge still need to run after generation completes.

Post-generation watcher:

- Screen: `hejava_qwen14_n10_s7302_pkgfix_watch`
- Script: `analysis_outputs/logs/watch_hejava_qwen14_oldrecipe_n10_s7302_pkgfix_rejudge_20260704.sh`
- Log: `analysis_outputs/logs/watch_hejava_qwen14_oldrecipe_n10_s7302_pkgfix_rejudge_20260704.log`
- Behavior: waits for all raw `n=10` rows to reach `1630/1630` Java files, package-normalizes them to `*-pkgfix`, rejudges with `scripts/parallel_humaneval_java_rejudge.py`, then writes `analysis_outputs/humaneval_java_qwen14_oldrecipe_pkgfix_n10_s7302_20260704.{csv,md}`.

Status at 2026-07-04 12:02 CST: raw generation completed for all four rows and package normalization completed. Rejudge is running; Base package-normalized row is partially validated (`1388/1630` result files at 11:49 CST), and SFT/PAFT rows are queued in the same watcher.

## 2026-07-03 Local GPU1 Defects4J Qwen14 `n=10` Seed 7402 Robustness Run

Purpose: keep the local single GPU busy after the completed seed-7401 Qwen14 `n=10` block and produce a second fixed decoding seed for the larger-backbone Defects4J comparison. This is an inference-seed robustness run, not a training-seed claim.

Screen:

`d4j_qwen14_n10_s7402_gpu1`

Launcher:

`analysis_outputs/logs/run_d4j_qwen14_oldrecipe_n10_seed7402_gpu1_20260704.sh`

Log:

`analysis_outputs/logs/run_d4j_qwen14_oldrecipe_n10_seed7402_gpu1_20260704.log`

Settings:

- GPU: local GPU1 only (`CUDA_VISIBLE_DEVICES=1`)
- seed: `7402`
- candidates per bug: `n=10`
- prompt style: `java_plain`
- extraction: `historical_strict`
- compared rows: Qwen2.5-Coder-14B Base, SFT old-recipe, PAFT old-recipe `w=1.5`, PAFT old-recipe `w=2.0`

Validation watcher:

`d4j_qwen14_n10_s7402_validate`

Watcher script:

`analysis_outputs/logs/watch_validate_d4j_qwen14_oldrecipe_n10_seed7402_20260704.sh`

Expected final metrics:

- `analysis_outputs/d4j_qwen14_oldrecipe_n10_s7402_metrics_20260704.csv`
- `analysis_outputs/d4j_qwen14_oldrecipe_n10_s7402_metrics_20260704.md`

GPU0 acceleration:

- Screen: `d4j_qwen14_w2_n10_s7402_gpu0`
- Launcher: `analysis_outputs/logs/run_d4j_qwen14_oldrecipe_w2_n10_seed7402_gpu0_20260704.sh`
- Log: `analysis_outputs/logs/run_d4j_qwen14_oldrecipe_w2_n10_seed7402_gpu0_20260704.log`
- Purpose: generate the last PAFT `w=2.0` row concurrently on idle GPU0. The main GPU1 queue will skip this row once the outputs already exist.

Row-level split supervisor:

- Screen: `d4j_qwen14_split_s7402`
- Script: `analysis_outputs/logs/split_d4j_qwen14_seed7402_after_base_20260704.sh`
- Behavior: waits for the Base row to reach `3710/3710`, then stops the original serial GPU1 queue and launches SFT-only generation on GPU1. This prevents the original serial script from later colliding with the GPU0 PAFT rows.

PAFT `w=1.5` GPU0 continuation:

- Screen: `d4j_qwen14_w15_after_w2_s7402`
- Script: `analysis_outputs/logs/run_d4j_qwen14_oldrecipe_w15_n10_seed7402_gpu0_after_w2_20260704.sh`
- Behavior: waits for the GPU0 PAFT `w=2.0` generation to finish, then generates the PAFT `w=1.5` row on GPU0.

Split-aware validation watcher:

- Screen: `d4j_qwen14_n10_s7402_validate`
- Script: `analysis_outputs/logs/watch_validate_d4j_qwen14_oldrecipe_n10_seed7402_split_20260704.sh`
- Behavior: watches the split generation screens, validates each row once its `3710` JSON outputs exist, and writes `analysis_outputs/d4j_qwen14_oldrecipe_n10_s7402_metrics_20260704.{csv,md}` after all four rows complete.

Status at 2026-07-04 07:56 CST: Base validation completed. The seed7402 Base row is weak: pass@1/pass@5/pass@10 = `10.46/10.51/10.51`, plausible patches = `388`, Avg./Med. AED = `206.13/158.00`, Avg./Med. CCR = `65.83/68.42`. The early PAFT `w=2.0` validation completed with pass@1/pass@5/pass@10 = `14.93/16.31/16.71`, plausible patches = `554`, Avg./Med. AED = `47.22/28.00`, Avg./Med. CCR = `78.78/85.71`. This is a useful internal recovery signal for PAFT under a weak decoding seed, but it should not replace the stronger seed7401 reportable block. The main watcher is waiting for SFT outputs. SFT-only generation is active on GPU1 (`3144/3710` JSON files). GPU0 is generating PAFT `w=1.5` (`3447/3710` JSON files).

## 2026-07-03 Local GPU1 Defects4J Qwen14 `w=2.0` n=10 Continuation

Purpose: extend the strongest Qwen14 PAFT `w=2.0` Defects4J row from the completed `n=5` diagnostic toward the usual `n=10` candidate protocol. This keeps the same fixed seed, prompt, extraction profile, base model, and adapter as the reportable `n=5` row. It does not overwrite the `n=5` artifact.

Screen:

`d4j_qwen14_w2_n10_gpu1`

Launcher:

`analysis_outputs/logs/run_d4j_qwen14_oldrecipe_w2_n10_gpu1_20260703.sh`

Log:

`analysis_outputs/logs/run_d4j_qwen14_oldrecipe_w2_n10_gpu1_20260703.log`

Settings:

- GPU: local GPU1 only (`CUDA_VISIBLE_DEVICES=1`)
- seed: `7401`
- candidates per bug: `n=10`
- prompt style: `java_plain`
- extraction: `historical_strict`
- source artifact reused by file copy: `qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620-d4j-n5-s7401`
- source copy excludes stale `.json.result` validation caches
- output tag: `qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620-d4j-n10-s7401`

Validation watcher:

`d4j_qwen14_w2_n10_validate`

Watcher script:

`analysis_outputs/logs/watch_validate_d4j_qwen14_oldrecipe_w2_n10_20260703.sh`

Watcher log:

`analysis_outputs/logs/watch_validate_d4j_qwen14_oldrecipe_w2_n10_20260703.log`

Expected final metrics:

- `analysis_outputs/d4j_qwen14_oldrecipe_n10_w2_s7401_metrics_20260703.csv`
- `analysis_outputs/d4j_qwen14_oldrecipe_n10_w2_s7401_metrics_20260703.md`

Status at 2026-07-03 16:40 CST: generation is running on GPU1 with vLLM loaded. It started from `1855/3710` JSON files (candidates 0--4 copied from the `n=5` artifact) and is generating candidates 5--9. The watcher is waiting for all `3710/3710` JSON files before running fresh `n=10` Defects4J validation.

Live check at 2026-07-03 16:52 CST: both local GPUs are active (`GPU0` 42.0/48.0 GiB, 100%; `GPU1` 39.8/48.0 GiB, 88%). Current JSON counts are Base `2191/3710`, SFT `0/3710` (queued after Base), PAFT `w=1.5` `0/3710` (queued after `w=2.0`), and PAFT `w=2.0` `2335/3710`. No fresh n=10 validation results have been written yet.

Live check at 2026-07-03 18:00 CST: Base and PAFT `w=2.0` generation have completed all `3710/3710` JSON files. Fresh validation is running for both rows (`47/371` Base result files; `49/371` PAFT `w=2.0` result files). The queued SFT and PAFT `w=1.5` continuations have started on GPU0/GPU1 respectively; both copied their `n=5` artifacts and are generating candidates 5--9 (`1879/3710` JSON files each at this check).

Live check at 2026-07-03 18:20 CST: validation continues for the completed Base and PAFT `w=2.0` rows (`70/371` Base result files; `68/371` PAFT `w=2.0` result files). SFT and PAFT `w=1.5` generation are still active (`1935/3710` and `1983/3710` JSON files). No n=10 aggregate metrics file has been produced yet.

Live check at 2026-07-03 18:41 CST: validation still running (`101/371` Base result files; `88/371` PAFT `w=2.0` result files). SFT and PAFT `w=1.5` generation remain active with vLLM loaded (`1975/3710` and `2103/3710` JSON files). No n=10 aggregate metrics file has been produced yet.

Live check at 2026-07-03 19:12 CST: validation still running (`198/371` Base result files; `186/371` PAFT `w=2.0` result files). SFT and PAFT `w=1.5` generation remain active (`2087/3710` and `2319/3710` JSON files). No n=10 aggregate metrics file has been produced yet.

Live check at 2026-07-03 20:12 CST: Base and PAFT `w=2.0` validation completed (`371/371` each). The completed two-row metrics are now in `analysis_outputs/d4j_qwen14_oldrecipe_n10_base_w2_s7401_metrics_20260703.{csv,md}` and the PAFT-w2-only metrics are in `analysis_outputs/d4j_qwen14_oldrecipe_n10_w2_s7401_metrics_20260703.{csv,md}`. Base reaches 20.38/21.01/21.02 pass@1/5/10 with 169.17/123.00 AED and 70.70/78.26 CCR; PAFT `w=2.0` reaches 23.05/24.63/25.07 with 63.53/34.00 AED and 79.91/88.89 CCR. SFT and PAFT `w=1.5` generation are still active (`2447/3710` and `3023/3710` JSON files).

Live check at 2026-07-03 21:15 CST: PAFT `w=1.5` generation completed (`3710/3710` JSON files) and a separate validation screen `d4j_qwen14_w15_n10_validate` was started with `D4J_VALIDATION_WORKERS=6`; log: `analysis_outputs/logs/validate_d4j_qwen14_oldrecipe_w15_n10_20260703.log`. SFT generation is still active on GPU0 (`3175/3710` JSON files). The all-row validation watcher remains alive and should skip already validated rows when SFT finishes.

Live check at 2026-07-03 21:46 CST: SFT generation remains active (`3335/3710` JSON files). PAFT `w=1.5` validation is running in the separate screen and has written `99/371` result files. The all-row validation watcher is still waiting for the SFT output count to reach `3710/3710`.

Live check at 2026-07-03 22:46 CST: SFT generation completed and the all-row watcher started SFT validation (`57/371` result files). PAFT `w=1.5` validation also completed (`371/371`). The completed PAFT `w=1.5` `n=10` metrics are in `analysis_outputs/d4j_qwen14_oldrecipe_n10_w15_s7401_metrics_20260703.{csv,md}` and the three-row Base/PAFT partial metrics are in `analysis_outputs/d4j_qwen14_oldrecipe_n10_base_w15_w2_s7401_metrics_20260703.{csv,md}`. PAFT `w=1.5` reaches 22.16/24.13/24.80 pass@1/5/10 with 61.18/26.00 AED and 80.49/88.89 CCR. Only the SFT `n=10` validation remains before the all-row table can be recomputed.

Final check at 2026-07-03 23:48 CST: all four Qwen14 `n=10` rows completed generation and Defects4J validation (`3710/3710` JSON and `371/371` result files each). No experiment screens remain. The final four-row metrics are in `analysis_outputs/d4j_qwen14_oldrecipe_n10_s7401_metrics_20260703.{csv,md}`. Results: Base 20.38/21.01/21.02 pass@1/5/10, 169.17/123.00 AED, 70.70/78.26 CCR; SFT 20.24/22.78/23.72, 79.43/34.00 AED, 74.85/83.33 CCR; PAFT `w=1.5` 22.16/24.13/24.80, 61.18/26.00 AED, 80.49/88.89 CCR; PAFT `w=2.0` 23.05/24.63/25.07, 63.53/34.00 AED, 79.91/88.89 CCR.

Parallel GPU0 queue: GPU0 is now running `d4j_qwen14_base_n10_gpu0` with `analysis_outputs/logs/run_d4j_qwen14_base_n10_gpu0_20260703.sh`. It extends `qwen2.5coder14b-d4j-n5-s7401` to `qwen2.5coder14b-d4j-n10-s7401` under the same seed/protocol, excluding stale `.json.result` files. A second screen, `d4j_qwen14_sft_n10_gpu0`, runs `analysis_outputs/logs/run_d4j_qwen14_sft_n10_gpu0_after_base_20260703.sh`; it waits for Base generation to finish, then extends `qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620-d4j-n5-s7401` to `qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620-d4j-n10-s7401`.

Queued GPU1 follow-up: to avoid GPU idle time after the active `w=2.0` generation exits, `d4j_qwen14_remaining_n10_gpu1` is waiting to extend the comparable Qwen14 PAFT `w=1.5` row from `n=5` to `n=10` under the same seed/protocol. It uses `analysis_outputs/logs/run_d4j_qwen14_oldrecipe_remaining_n10_gpu1_20260703.sh` and writes to:

- `qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620-d4j-n10-s7401`

All-row validation watcher: screen `d4j_qwen14_n10_all_validate` runs `analysis_outputs/logs/watch_validate_d4j_qwen14_oldrecipe_n10_all_20260703.sh`. It watches `d4j_qwen14_base_n10_gpu0`, `d4j_qwen14_sft_n10_gpu0`, `d4j_qwen14_w2_n10_gpu1`, and `d4j_qwen14_remaining_n10_gpu1`, validates each n=10 tag with `D4J_VALIDATION_WORKERS=6`, skips already validated tags, and writes `analysis_outputs/d4j_qwen14_oldrecipe_n10_s7401_metrics_20260703.{csv,md}` after all four rows are complete.

## 2026-07-03 Multi-SWE-bench Java Verified Asset Audit

Purpose: document a complex/multi-file benchmark target for the reviewer-requested system-level follow-up. This is an asset audit only, not a PAFT result.

Outputs:

- `scripts/summarize_multiswe_java_verified.py`
- `analysis_outputs/multiswe_java_verified_summary_20260703.json`
- `analysis_outputs/multiswe_java_verified_summary_20260703.md`

Result: local Multi-SWE-bench Java Verified cache has 91 Java tasks with gold patches and test patches; 61/91 tasks (67.0%) have multi-file gold patches. Patch-file count distribution is `{1: 30, 2: 31, 3: 17, 4: 8, 5: 2, 8: 2, 12: 1}`.

Preferred smoke manifest:

`analysis_outputs/multiswe_java_verified_stratified_smoke12_20260703.jsonl`

Composition: 12 tasks total, deterministically selected as 4 single-file, 4 two-file, and 4 three-or-more-file repairs. Use this before the older lexicographic `smoke10` manifest when testing a future system-level/generator-swap pipeline.

Protocol note:

`analysis_outputs/multiswe_generator_swap_protocol_20260703.md`

This fixes the first intended system-level smoke design: same subset, same localization/context, same candidate budget, same parser, same test harness, and only the Base/SFT/PAFT generator swapped.

## 2026-07-03 Local GPU1 Defects4J Qwen14 `w=2.0` n=5 Generation

Purpose: extend the completed Qwen14 Defects4J `n=5` larger-backbone block with the old-recipe PAFT `w=2.0` adapter under the same seed/protocol as Base, SFT, and PAFT `w=1.5`. This is a fixed-seed trade-off diagnostic for the `w_align` concern, not a repeated-seed experiment.

Screen:

`d4j_qwen14_w2_n5_gpu1`

Launcher:

`analysis_outputs/logs/run_d4j_qwen14_oldrecipe_w2_n5_gpu1_20260703.sh`

Log:

`analysis_outputs/logs/run_d4j_qwen14_oldrecipe_w2_n5_gpu1_20260703.log`

Settings:

- GPU: local GPU1 only (`CUDA_VISIBLE_DEVICES=1`)
- seed: `7401`
- candidates per bug: `n=5`
- prompt style: `java_plain`
- extraction: `historical_strict`
- adapter: `/home/barty/research/morepair/models/qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620`
- output tag: `qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620-d4j-n5-s7401`

Validation watcher:

`watch_d4j_qwen14_w2_n5_validate`

Watcher script:

`analysis_outputs/logs/watch_validate_d4j_qwen14_oldrecipe_w2_n5_20260703.sh`

Watcher log:

`analysis_outputs/logs/watch_validate_d4j_qwen14_oldrecipe_w2_n5_20260703.log`

Expected final metrics:

- `analysis_outputs/d4j_qwen14_oldrecipe_n5_w2_s7401_metrics_20260703.csv`
- `analysis_outputs/d4j_qwen14_oldrecipe_n5_w2_s7401_metrics_20260703.md`

Status: completed at 2026-07-03 16:21 CST. Generation produced all `1855/1855` JSON files, local Defects4J validation produced `371/371` result files, and no active screen remains.

Completed metrics:

| Setting | pass@1 | pass@5 | Plausible patches | Avg./Med. AED | Avg./Med. CCR | no-op all |
|---|---:|---:|---:|---:|---:|---:|
| Base | 20.32 | 21.02 | 377 | 169.27/123.00 | 70.79/78.26 | 0.54 |
| SFT old-recipe | 20.43 | 22.91 | 379 | 79.70/34.00 | 74.68/83.33 | 1.46 |
| PAFT old-recipe `w=1.5` | 22.10 | 23.72 | 410 | 60.72/26.00 | 80.72/88.89 | 2.75 |
| PAFT old-recipe `w=2.0` | 22.91 | 24.26 | 425 | 61.42/34.00 | 80.22/88.89 | 4.64 |

Interpretation: `w=2.0` is the strongest correctness row in the fixed-seed `n=5` Qwen14 block, while `w=1.5` remains marginally better on average AED/CCR and median AED. Both PAFT rows improve over Base/SFT on correctness and locality.

## 2026-07-03 Local GPU1 Defects4J Qwen14 n=5 Generation

Purpose: fill a same-backbone larger-model Defects4J `pass@5` diagnostic for Qwen2.5-Coder-14B Base/SFT/PAFT under a fixed seed. This is generation only; Defects4J validation and metric recomputation must run after all three generation blocks finish.

Screen:

`d4j_qwen14_n5_gpu1`

Launcher:

`analysis_outputs/logs/run_d4j_qwen14_oldrecipe_n5_generate_gpu1_20260703.sh`

Log:

`analysis_outputs/logs/run_d4j_qwen14_oldrecipe_n5_generate_gpu1_20260703.log`

Settings:

- GPU: local GPU1 only (`CUDA_VISIBLE_DEVICES=1`)
- seed: `7401`
- candidates per bug: `n=5`
- prompt style: `java_plain`
- extraction: `historical_strict`
- outputs: `defects4j/results/<tag>/fixed{0..4}/`

Queued tags:

| Setting | Tag | Adapter | Status at launch |
|---|---|---|---|
| Base | `qwen2.5coder14b-d4j-n5-s7401` | none | running first |
| SFT old-recipe | `qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620-d4j-n5-s7401` | `/home/barty/research/morepair/models/qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620` | queued |
| PAFT old-recipe `w=1.5` | `qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620-d4j-n5-s7401` | `/home/barty/research/morepair/models/qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620` | queued |

Initial verification: model loaded successfully on GPU1 and started generating Base outputs; GPU1 memory was about 40 GiB during generation. Validate only after the screen exits.

Incremental validation watcher:

- Screen: `watch_d4j_qwen14_n5_validate`
- Script: `analysis_outputs/logs/watch_validate_d4j_qwen14_oldrecipe_n5_20260703.sh`
- Log: `analysis_outputs/logs/watch_validate_d4j_qwen14_oldrecipe_n5_20260703.log`
- Behavior: waits for each tag to reach `371 * 5 = 1855` generated JSON files, then immediately validates that tag with `D4J_VALIDATION_WORKERS=16` while the GPU generation screen can continue with the next tag. After all three validations finish, it writes `analysis_outputs/d4j_qwen14_oldrecipe_n5_s7401_metrics_20260703.{csv,md}` using `--expected-patch-count 5`.
- Environment fix: the first watcher attempt lacked the Defects4J/Perl environment and failed before writing any `.json.result` files. That log was preserved as `analysis_outputs/logs/watch_validate_d4j_qwen14_oldrecipe_n5_20260703.failed_missing_d4j.log`. The active watcher now exports `/home/barty/research/defects4j/framework/bin` and `/home/barty/perl5/lib/perl5`; Base validation restarted successfully and is running real Defects4J checkout/test commands.

## HumanEvalPack-Python DS-Coder-6.7B, Transformers, Seed 7202

Purpose: cross-language repair sanity check with a ground-truth reference patch, using the standard PAFT prompt and `n=5`. This run is intended to replace the earlier vLLM seed7201 diagnostic, whose output format was affected by byte-level decoding artifacts and produced negative correctness results.

Output root:

`analysis_outputs/humanevalpack_python_ds67_lora_tfm_20260701_seed7202/`

Current running jobs:

| Setting | Model tag | GPU | Screen | Log | Progress |
|---|---|---:|---|---|---:|
| Base | `deepseek-6.7b` | completed | exited | `analysis_outputs/logs/humanevalpack_seed7202_gpu0_base_transformers.screenlog` | complete, 164/164 prompts, `eval_n5.json` written |
| PAFT | `deepseek-6.7b-trained-prorepair` | 1 | `hepack_tfm7202_paft_retry` | `analysis_outputs/logs/humanevalpack_seed7202_gpu1_paft_transformers_retry.screenlog` | running, 99/164 prompts |
| SFT | `deepseek-6.7b-trained-noprompt` | 0 | `hepack_tfm7202_sft_gpu0` | `analysis_outputs/logs/humanevalpack_seed7202_sft_transformers_gpu0.screenlog` | running, 64/164 prompts |

Base completed metrics:

- pass@1/pass@5: 67.07 / 86.59
- resolved tasks / plausible candidates: 142 / 550
- plausible-patch AED Avg./Med.: 260.17 / 192.50
- plausible-patch CCR Avg./Med.: 58.75 / 64.40

SFT launch note:

`hepack_sft7202_watch` attempted to launch SFT after GPU0 freed, but the resulting screen was dead with no useful log. It was cleaned with `screen -wipe` and SFT was manually launched on GPU0 with the same seed and command script.

Summary watcher:

`watch_hepack_seed7202_summary` waits for all three `eval_n5.json` files, then writes:

- `analysis_outputs/humanevalpack_python_ds67_lora_tfm_seed7202_metrics.csv`
- `analysis_outputs/humanevalpack_python_ds67_lora_tfm_seed7202_metrics.md`

Log:

`analysis_outputs/logs/watch_humanevalpack_seed7202_summarize.log`

Scripts:

- `analysis_outputs/logs/run_hepack_tfm7202_base.sh`
- `analysis_outputs/logs/run_hepack_tfm7202_paft_retry.sh`
- `analysis_outputs/logs/run_hepack_tfm7202_sft.sh`
- `analysis_outputs/logs/watch_start_hepack_sft7202.sh`
- `analysis_outputs/logs/watch_humanevalpack_seed7202_summarize.sh`

Partial output sanity check before PAFT restart:

- Base partial candidates: no empty candidates, no exact no-op candidates, no mojibake markers.
- PAFT partial candidates: 2 empty candidates among 130 generated candidates, no exact no-op candidates, no mojibake markers.

PAFT restart note:

The initial PAFT transformers run stalled after 26/164 prompts with no file update for roughly 10 minutes. `scripts/run_humanevalpack_python.py` was patched so `--overwrite` actually removes the old JSONL file before generation. PAFT was clean-restarted with `--batch-size 1 --overwrite` while keeping the same seed, prompt, and 1024-token generation limit.

Base restart note:

The Base transformers run later stalled around 88/164 prompts under `--batch-size 2`. It was restarted with `--batch-size 1` and no `--overwrite`, so the existing 88 generated tasks are preserved and the script resumes from the remaining tasks.

Do not cite these partial counts as benchmark results. Use only `eval_n5.json` after each setting completes.

## Remote AutoDL Westd Weight-Sweep Completion Runs

Purpose: complete the extra `w_align` variance evidence requested by Reviewer B. Existing corrected fast-tokenizer evidence has `w=2` over three seeds, `w=4` over two seeds, and `w=0` over one seed. These runs add one more seed each for `w=0` and `w=4` using the same DeepSeek 6.7B fast-tokenizer PAFT recipe.

Remote root:

`/root/autodl-tmp/PAFT`

Running jobs:

| Setting | Tag | GPU | Screen | Log | Status |
|---|---|---:|---|---|---|
| PAFT `w=0.0` | `tse_fasttok_dscoder67b_paft_w0p0_s211_20260701` | completed | exited | `/root/autodl-tmp/PAFT/analysis_outputs/logs/train_tse_fasttok_dscoder67b_paft_w0p0_s211_20260701.log` | final checkpoint ready |
| PAFT `w=4.0` | `tse_fasttok_dscoder67b_paft_w4p0_s212_20260701` | completed | exited | `/root/autodl-tmp/PAFT/analysis_outputs/logs/train_tse_fasttok_dscoder67b_paft_w4p0_s212_20260701.log` | final checkpoint ready |

Remote watcher:

`watch_fasttok_weight_extra_generate` waits for both adapters, then generates D4J `fixed0` outputs for both tags on the two remote GPUs.

Current remote generation status:

- Both adapters are ready under `/root/autodl-tmp/PAFT/models/<tag>/final_checkpoint`.
- Generation was restarted at 2026-07-01 08:45 CST after fixing the transformer extractor fallback.
- At 2026-07-01 09:29 CST, the restarted run was still active: w=0 had 92 JSON / 101 log files with 9 `empty_fix_skipped` events; w=4 had 83 JSON / 90 log files with 7 `empty_fix_skipped` events. Both remote generation screens were alive.

Extractor fix:

`scripts/remote_generate_d4j_transformers.py` and `scripts/remote_generate_d4j_vllm.py` now handle the case where the prompt already opens a Java code fence and the model response starts with raw Java followed by a closing fence. Before this fix, normal code responses such as `public ... } ``` ` could be miscounted as empty because the response segment did not contain a second opening Java fence marker.

Local fetch/validation watcher:

`watch_fetch_remote_fasttok_weight_extra` monitors remote generation completion. Once both remote generation screens write `analysis_outputs/logs/gen_<tag>.exit`, it fetches the generated patches to local `prorepair`, runs local Defects4J validation, and writes:

- `analysis_outputs/tse_fasttok_dscoder67b_weight_sweep_extra_20260701.csv`
- `analysis_outputs/tse_fasttok_dscoder67b_weight_sweep_extra_20260701.md`

Logs:

- `analysis_outputs/logs/watch_fetch_validate_remote_fasttok_weight_extra_20260701.log`
- `analysis_outputs/logs/test_d4j_tse_fasttok_dscoder67b_paft_w0p0_s211_20260701.log`
- `analysis_outputs/logs/test_d4j_tse_fasttok_dscoder67b_paft_w4p0_s212_20260701.log`

Launcher scripts:

- `.run_secrets/launch_remote_fasttok_weight_extra_20260701.sh`
- `.run_secrets/watch_remote_fasttok_weight_extra_generate_20260701.sh`
- `.run_secrets/fetch_validate_remote_fasttok_weight_extra_20260701.sh`
- `.run_secrets/watch_fetch_validate_remote_fasttok_weight_extra_20260701.sh`

Important environment note:

The remote server does not currently have Java/Defects4J installed. Remote is used for training and generation only. After generation exits for both tags, fetch `defects4j/results/<tag>/fixed0` back to the local machine and run local Defects4J validation/metrics. If any JSON files are missing, `scripts/recompute_d4j_pass1_metrics.py` keeps the denominator at all 371 Defects4J bugs and reports the missing files as failures through `missing_results`.

## 2026-07-01 09:51 CST Stop Local GPU / Remote Recovery Snapshot

By user request, the local HumanEvalPack Python transformer runs were stopped:

- `hepack_tfm7202_paft_retry`
- `hepack_tfm7202_sft_gpu0`
- `watch_hepack_seed7202_summary`

After stopping them, no `scripts/run_humanevalpack_python.py` GPU process remained locally. Local GPU state was approximately GPU0 568 MiB / GPU1 0 MiB; the remaining screen is only `watch_fetch_remote_fasttok_weight_extra`, which monitors remote completion and does not run local GPU inference.

Remote westd generation was not stopped. A recovery snapshot was saved locally at:

`analysis_outputs/remote_recovery_westd_20260701_095112`

Snapshot contents:

- `remote_status.txt`: remote screen/GPU/status/disk snapshot.
- `logs/`: remote logs copied from `/root/autodl-tmp/PAFT/analysis_outputs/logs/`.
- `defects4j/results/<tag>/`: partial generated outputs for the two active extra weight-sweep tags.
- `models/<tag>/final_checkpoint/`: final LoRA adapters for both tags.
- `scripts/`: remote generation scripts with the extractor fallback.

Counts after the latest rsync:

| Tag | Local JSON saved | Adapter |
|---|---:|---|
| `tse_fasttok_dscoder67b_paft_w0p0_s211_20260701` | 147 | saved |
| `tse_fasttok_dscoder67b_paft_w4p0_s212_20260701` | 132 | saved |

See `analysis_outputs/remote_recovery_westd_20260701_095112/RECOVERY.md` for restore notes.

## 2026-07-02 20:13 CST Local One-GPU Resume

By user request, local experiments were resumed with exactly one GPU. GPU1 is used; GPU0 is left for other work.

Target benchmark:

`analysis_outputs/humanevalpack_python_ds67_lora_tfm_20260701_seed7202`

Existing state before resume:

| Model | Existing generation lines | Eval |
|---|---:|---|
| `deepseek-6.7b` | 164 / 164 | complete |
| `deepseek-6.7b-trained-prorepair` | 106 / 164 | missing |
| `deepseek-6.7b-trained-noprompt` | 67 / 164 | missing |

Launcher:

`analysis_outputs/logs/run_hepack_tfm7202_paft_sft_seq_gpu1_20260702.sh`

Screen:

`hepack_tfm7202_seq_gpu1_20260702`

Log:

`analysis_outputs/logs/humanevalpack_seed7202_paft_sft_seq_gpu1_20260702.screenlog`

Command strategy:

- Run `deepseek-6.7b-trained-prorepair` first.
- Then run `deepseek-6.7b-trained-noprompt`.
- Use `--mode all`, `--backend transformers`, `--batch-size 1`, `--n-samples 5`, `--seed 7202`.
- Do not use `--overwrite`; the script resumes from existing `generations_n5.jsonl` and fills only missing HumanEvalPack tasks.

Verification shortly after launch:

- Active process: `scripts/run_humanevalpack_python.py --model-id deepseek-6.7b-trained-prorepair ... --gpu 1`.
- GPU1 was active at approximately 15.7 GiB memory.
- No new local experiment was launched on GPU0.

## 2026-07-02 20:16 CST Local Resume Monitor / Remote Status

The local one-GPU HumanEvalPack continuation is still running on GPU1. Updated observed progress:

| Model | Generation lines | Eval |
|---|---:|---|
| `deepseek-6.7b` | 164 / 164 | complete |
| `deepseek-6.7b-trained-prorepair` | 109 / 164 | pending |
| `deepseek-6.7b-trained-noprompt` | 67 / 164 | pending |

A summary watcher was started:

`watch_hepack_seed7202_seq_summary_20260702`

Watcher script:

`analysis_outputs/logs/watch_humanevalpack_seed7202_seq_summary_20260702.sh`

Watcher log:

`analysis_outputs/logs/watch_humanevalpack_seed7202_seq_summary_20260702.log`

Expected final summary files once both PAFT and SFT evals exist:

- `analysis_outputs/humanevalpack_python_ds67_lora_tfm_20260701_seed7202/summary_20260702.md`
- `analysis_outputs/humanevalpack_python_ds67_lora_tfm_20260701_seed7202/summary_20260702.csv`

Remote westd status:

- The current westd SSH endpoint now closes connections during key exchange.
- The local fetch watcher has been seeing the same connection failure since at least 2026-07-02 19:08 CST.
- Latest recoverable local snapshot remains `analysis_outputs/remote_recovery_westd_20260701_095112` with 147 JSON for `w0p0_s211` and 132 JSON for `w4p0_s212`; no newer remote data could be synced in this turn.

## 2026-07-02 20:25 CST QuixBugs Evidence Audit / Local Progress

The local HumanEvalPack continuation remains active on GPU1. Updated observed progress:

| Model | Generation lines | Eval |
|---|---:|---|
| `deepseek-6.7b` | 164 / 164 | complete |
| `deepseek-6.7b-trained-prorepair` | 111 / 164 | pending |
| `deepseek-6.7b-trained-noprompt` | 67 / 164 | pending |

GPU1 is active at roughly 48.6 GiB memory; GPU0 is not running this continuation.

QuixBugs-Python evidence was audited in this step, but this intermediate reporting
format has since been superseded by the fixed-seed `7106` reporting pivot below.

## 2026-07-02 20:32 CST HumanEvalPack Acceleration Check

The HumanEvalPack continuation was checked for possible vLLM acceleration.

Current local state:

| Model | Generation lines | Eval |
|---|---:|---|
| `deepseek-6.7b` | 164 / 164 | complete |
| `deepseek-6.7b-trained-prorepair` | 113 / 164 | pending |
| `deepseek-6.7b-trained-noprompt` | 67 / 164 | pending |

Decision: keep the current transformers continuation instead of switching to vLLM.

Reason:

- Local vLLM is installed (`0.9.2`) and can load the DeepSeek 6.7B base.
- The existing adapter probe `analysis_outputs/logs/probe_humanevalpack_sft_lora_vllm_gpu1_20260701.log` loaded LoRA successfully, but generated malformed DeepSeek BPE text such as `fromtypingimport...`.
- The same probe wrote `analysis_outputs/humanevalpack_python_local_probe_20260701/deepseek-6.7b-trained-noprompt/eval_n1.json` with 0 plausible candidates.
- vLLM adapter probe speed was also poor (`~112s` for one prompt at low memory utilization), so it is not a safe acceleration path for the current reportable run.

The active transformers process remains:

`scripts/run_humanevalpack_python.py --model-id deepseek-6.7b-trained-prorepair --mode all --out-dir analysis_outputs/humanevalpack_python_ds67_lora_tfm_20260701_seed7202 --gpu 1 --n-samples 5 --backend transformers --batch-size 1 --seed 7202`

This is slow but preserves output formatting and prompt consistency for the current run.

## 2026-07-02 20:25 CST TSE Text Sync / Local GPU Continuation

The local HumanEvalPack continuation is still active on GPU1 via:

`screen -r hepack_tfm7202_seq_gpu1_20260702`

Observed progress during this check:

| Model | Generation lines | Eval |
|---|---:|---|
| `deepseek-6.7b` | 164 / 164 | complete |
| `deepseek-6.7b-trained-prorepair` | 122 / 164 | pending |
| `deepseek-6.7b-trained-noprompt` | 67 / 164 | pending |

GPU1 is using about 48.6 GiB and remains compute-active. GPU0 is not used by this continuation.

This intermediate TSE text sync has since been superseded by the fixed-seed
`7106` reporting pivot below. The still-current part of this step is:

- The RQ1/RQ2 insight wording was softened to avoid causal-fault phrasing and to frame PAFT as reducing unnecessary edits to stable regions.

Verification:

- `python3 scripts/check_tse_claim_hygiene.py` passed.
- `python3 scripts/check_tse_tex_static.py` passed with 0 risky-token hits.
- This verification was rerun after the fixed-seed pivot below.

## 2026-07-02 20:32 CST Fixed-Seed Reporting Pivot

The reporting strategy was adjusted to avoid expensive repeated-seed experiments. Reportable diagnostics now use fixed seeds recorded in code/artifacts:

- `scripts/run_quixbugs_python.py`: default seed is `7106`.
- `scripts/run_humanevalpack_python.py`: default seed is `7202`.
- `SingleTrainWithLCS.py`: default training seed remains fixed at `42` unless `SEED` is explicitly set.

QuixBugs-Python reportable evidence now uses fixed seed `7106`:

| Setting | pass@1 | Avg./Med. AED | Avg./Med. CCR | No-op first/all |
|---|---:|---:|---:|---:|
| Base | 32.00 | 306.11 / 284.50 | 59.65 / 64.58 | 0 / 0 |
| SFT | 24.50 | 285.16 / 269.00 | 56.74 / 66.67 | 0 / 0 |
| PAFT | 43.50 | 261.94 / 250.00 | 75.66 / 81.82 | 0 / 0 |

New/updated evidence files:

- `analysis_outputs/tse_quixbugs_ds67_fixed_seed7106_summary.md`
- `analysis_outputs/tse_quixbugs_ds67_fixed_seed7106_summary.csv`
- `analysis_outputs/tse_current_evidence_summary.md`
- `analysis_outputs/tse_revision_action_matrix.md`
- `analysis_outputs/tse_reviewer_concern_resolution_matrix.md`

TSE draft changes:

- `tse-paper/5.experiments_new.tex` now reports QuixBugs-Python with fixed seed `7106`.
- `tse-paper/4.experimental_setup.tex` now states the reportable fixed seeds: training `42`, QuixBugs-Python `7106`, and HumanEvalPack-Python `7202`.
- `tse-paper/10.appendix.tex` now records the script defaults for these fixed seeds.
- `scripts/audit_tse_paper_numbers.py` now audits the fixed-seed summary file.
- `scripts/summarize_tse_current_evidence.py` now regenerates the fixed-seed evidence table.

Verification after this pivot:

- `bash scripts/check_tse_ready.sh` passed.
- After adding the setup/appendix fixed-seed documentation, `bash scripts/check_tse_ready.sh` passed again.

The active local HumanEvalPack fixed-seed continuation remains running:

| Model | Generation lines | Eval |
|---|---:|---|
| `deepseek-6.7b` | 164 / 164 | complete |
| `deepseek-6.7b-trained-prorepair` | 126 / 164 | pending |
| `deepseek-6.7b-trained-noprompt` | 67 / 164 | pending |

## 2026-07-02 22:10 CST HumanEvalPack Fast Diagnostic Completed

Because the original 1024-token HumanEvalPack continuation was slow, a separate
fixed-seed fast diagnostic was launched on GPU0 while preserving the original
GPU1 run. It uses the same benchmark, same DS-Coder-6.7B Base/SFT/PAFT models,
same standard PAFT prompt, same seed 7202, and `n=5`; the only decoding change is
`--max-tokens 256`. This output is isolated from the original 1024-token run.

Output root:

`analysis_outputs/humanevalpack_python_ds67_lora_tfm_20260702_seed7202_fast256/`

Launcher:

`analysis_outputs/logs/run_hepack_tfm7202_fast256_gpu0_20260702.sh`

Summary files:

- `analysis_outputs/humanevalpack_python_ds67_lora_tfm_20260702_seed7202_fast256/summary_20260702.md`
- `analysis_outputs/humanevalpack_python_ds67_lora_tfm_20260702_seed7202_fast256/summary_20260702.csv`
- `analysis_outputs/humanevalpack_python_ds67_lora_tfm_20260702_seed7202_fast256/common_plausible_20260702.md`
- `analysis_outputs/humanevalpack_python_ds67_lora_tfm_20260702_seed7202_fast256/common_plausible_20260702.csv`

Completed fast diagnostic metrics:

| Model | pass@1 | pass@5 | Avg AED | Med AED | Avg CCR | Med CCR | no-op first/all |
|---|---:|---:|---:|---:|---:|---:|---:|
| `deepseek-6.7b` | 50.61 | 78.66 | 225.52 | 151.00 | 59.73 | 69.23 | 0/0 |
| `deepseek-6.7b-trained-prorepair` | 44.15 | 67.68 | 70.93 | 15.00 | 79.21 | 87.50 | 4/9 |
| `deepseek-6.7b-trained-noprompt` | 33.29 | 67.07 | 122.12 | 48.00 | 69.93 | 80.00 | 0/3 |

Interpretation:

- Use this only as supplementary cross-language evidence.
- PAFT improves over SFT in pass@1 and edit locality.
- Base remains stronger in raw pass@1/pass@5, so do not frame this as PAFT
  beating Base on HumanEvalPack-Python.
- On the common-plausible subset, PAFT has lower AED and higher CCR than both
  Base and SFT, which is the safer locality comparison because it controls for
  solved-task subset differences.

Common-plausible fast diagnostic metrics:

| Scope | Model | Common tasks | Avg AED | Med AED | Avg CCR | Med CCR |
|---|---|---:|---:|---:|---:|---:|
| Base+SFT+PAFT | Base | 89 | 188.83 | 143.00 | 61.37 | 68.75 |
| Base+SFT+PAFT | SFT | 89 | 123.28 | 62.00 | 66.73 | 75.00 |
| Base+SFT+PAFT | PAFT | 89 | 87.39 | 15.00 | 76.87 | 87.50 |

Manuscript integration:

- Added Appendix~`app:python-diagnostics` with the fast HumanEvalPack-Python
  table and common-plausible audit.
- Updated `tse-paper/4.experimental_setup.tex`,
  `tse-paper/6.discussion.tex`, and `tse-paper/7.threats.tex` so the
  HumanEvalPack result is framed as a supplementary diagnostic, not a main
  Defects4J claim.
- `bash scripts/check_tse_ready.sh` passed after these edits.

Original 1024-token run status at 2026-07-03 00:18 CST:

| Model | Generation lines | Eval |
|---|---:|---|
| `deepseek-6.7b` | 164 / 164 | complete |
| `deepseek-6.7b-trained-prorepair` | 164 / 164 | complete |
| `deepseek-6.7b-trained-noprompt` | 164 / 164 | complete |

Original completed 1024-token summary files:

- `analysis_outputs/humanevalpack_python_ds67_lora_tfm_20260701_seed7202/summary_20260703.md`
- `analysis_outputs/humanevalpack_python_ds67_lora_tfm_20260701_seed7202/summary_20260703.csv`
- `analysis_outputs/humanevalpack_python_ds67_lora_tfm_20260701_seed7202/common_plausible_20260703.md`
- `analysis_outputs/humanevalpack_python_ds67_lora_tfm_20260701_seed7202/common_plausible_20260703.csv`

Original completed 1024-token metrics:

| Model | pass@1 | pass@5 | Avg AED | Med AED | Avg CCR | Med CCR | no-op first/all |
|---|---:|---:|---:|---:|---:|---:|---:|
| `deepseek-6.7b` | 67.07 | 86.59 | 260.17 | 192.50 | 58.75 | 64.40 | 0/1 |
| `deepseek-6.7b-trained-prorepair` | 61.83 | 87.20 | 82.79 | 14.00 | 80.31 | 88.46 | 3/13 |
| `deepseek-6.7b-trained-noprompt` | 37.93 | 81.10 | 152.84 | 74.00 | 66.33 | 76.47 | 0/2 |

Original common-plausible metrics:

| Scope | Model | Common tasks | Avg AED | Med AED | Avg CCR | Med CCR |
|---|---|---:|---:|---:|---:|---:|
| Base+PAFT+SFT | Base | 118 | 289.92 | 238.00 | 56.19 | 62.83 |
| Base+PAFT+SFT | PAFT | 118 | 87.35 | 18.00 | 77.87 | 88.89 |
| Base+PAFT+SFT | SFT | 118 | 165.81 | 80.50 | 63.73 | 71.83 |

Manuscript integration now uses this 1024-token diagnostic rather than the earlier
fast 256-token diagnostic. GPU1 was released after the run completed.

## 2026-07-03 01:08 CST Qwen2.5-Coder-14B HumanEval-Java Old-Recipe Diagnostic

Purpose: check whether the positive larger-backbone Defects4J old-recipe result
also transfers to HumanEval-Java under a clean, same-seed Base/SFT/PAFT triad.
This uses exactly one local GPU for generation; CPU rejudge runs after GPU
generation completes.

Launcher:

`analysis_outputs/logs/run_hejava_qwen14_oldrecipe_triage_gpu1_20260703.sh`

Screen log:

`analysis_outputs/logs/hejava_qwen14_oldrecipe_triage_gpu1_20260703.screenlog`

Output directories:

- `evalrepair-java-res/qwen2.5coder14b-hejava-n1-s7301`
- `evalrepair-java-res/qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620-hejava-n1-s7301`
- `evalrepair-java-res/qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620-hejava-n1-s7301`

Summary files:

- `analysis_outputs/humaneval_java_qwen14_oldrecipe_n1_s7301_20260703.md`
- `analysis_outputs/humaneval_java_qwen14_oldrecipe_n1_s7301_20260703.csv`

Completed metrics. Because this diagnostic generated only one candidate per
task (`n=1`), only pass@1 should be used; pass@5/pass@10 columns emitted by the
generic metric script are not reported here.

| Model | pass@1 | Plausible patches | Avg AED | Med AED | Avg CCR | Med CCR | no-op all |
|---|---:|---:|---:|---:|---:|---:|---:|
| `qwen2.5coder14b-hejava-n1-s7301` | 7.36 | 12 | 320.50 | 339.50 | 50.08 | 45.80 | 0.00 |
| `qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620-hejava-n1-s7301` | 4.29 | 7 | 77.00 | 49.00 | 70.88 | 72.73 | 0.00 |
| `qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620-hejava-n1-s7301` | 7.98 | 13 | 46.00 | 4.00 | 78.98 | 80.00 | 1.84 |

Interpretation:

- Positive larger-open-backbone result: PAFT improves pass@1, plausible patch
  count, AED, and CCR over both the Base reference and the same old-recipe SFT
  baseline.
- Treat this as a supplementary HumanEval-Java diagnostic. The pass@1 values
  are low and should not be over-promoted as a main benchmark claim.

## 2026-07-03 01:36 CST Qwen2.5-Coder-14B HumanEvalPack-Python Old-Recipe Diagnostic

Purpose: use the local single GPU to test whether the larger open Qwen2.5-Coder-14B
old-recipe Base/SFT/PAFT triad also shows preservation effects on a Python
function-level benchmark. This run uses the standard PAFT repair prompt, no
minimal-change phrase, vLLM generation, fixed seed 7202, `n=5`, and 1024 generated
tokens. The run finished; GPU1 was released after completion.

Launcher:

`analysis_outputs/logs/run_humanevalpack_python_qwen14_oldrecipe_gpu1_20260703.sh`

Screen log:

`analysis_outputs/logs/humanevalpack_python_qwen14_oldrecipe_gpu1_20260703.screenlog`

Output root:

`analysis_outputs/humanevalpack_python_qwen14_oldrecipe_20260703_seed7202/`

Summary files:

- `analysis_outputs/humanevalpack_python_qwen14_oldrecipe_20260703_seed7202/summary_20260703.md`
- `analysis_outputs/humanevalpack_python_qwen14_oldrecipe_20260703_seed7202/summary_20260703.csv`
- `analysis_outputs/humanevalpack_python_qwen14_oldrecipe_20260703_seed7202/common_plausible_20260703.md`
- `analysis_outputs/humanevalpack_python_qwen14_oldrecipe_20260703_seed7202/common_plausible_20260703.csv`

Completed metrics:

| Model | pass@1 | pass@5 | Avg AED | Med AED | Avg CCR | Med CCR | no-op first/all |
|---|---:|---:|---:|---:|---:|---:|---:|
| Base | 84.63 | 97.56 | 272.57 | 221.50 | 56.83 | 60.00 | 0/0 |
| SFT | 31.59 | 70.73 | 212.01 | 84.00 | 65.81 | 71.43 | 0/1 |
| PAFT | 75.61 | 94.51 | 81.86 | 24.00 | 79.66 | 87.50 | 2/3 |

Common-plausible audit:

| Scope | Model | Common tasks | Avg AED | Med AED | Avg CCR | Med CCR |
|---|---|---:|---:|---:|---:|---:|
| Base+SFT+PAFT | Base | 114 | 255.57 | 190.50 | 55.84 | 60.00 |
| Base+SFT+PAFT | SFT | 114 | 231.34 | 119.50 | 64.43 | 70.71 |
| Base+SFT+PAFT | PAFT | 114 | 71.21 | 26.50 | 81.54 | 86.92 |
| Base+PAFT | Base | 154 | 279.06 | 218.50 | 55.54 | 59.23 |
| Base+PAFT | PAFT | 154 | 76.63 | 23.50 | 80.89 | 87.50 |

Interpretation:

- Usable as a larger-open-backbone locality diagnostic: PAFT greatly reduces AED
  and raises CCR relative to both Base and SFT, including on common-plausible
  task subsets.
- Do not use as a PAFT-over-Base correctness claim: Base has higher pass@1/pass@5
  on this relatively easy function-level Python benchmark.

## 2026-07-03 06:34 CST Qwen2.5-Coder-14B Defects4J n=5 Local GPU Status

Purpose: run the larger open-backbone Defects4J Base/SFT/PAFT triad with a
fixed seed and the historical PAFT prompt/extraction protocol. Generation is
running on the local GPU worker in a detached screen:

`d4j_qwen14_n5_gpu1`

Launcher:

`analysis_outputs/logs/run_d4j_qwen14_oldrecipe_n5_generate_gpu1_20260703.sh`

Output tags:

- `qwen2.5coder14b-d4j-n5-s7401`
- `qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620-d4j-n5-s7401`
- `qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620-d4j-n5-s7401`

Current status after changing validation to wait for all generation first:

| Model | Generated JSON | D4J result files | Status |
|---|---:|---:|---|
| Base | 1855/1855 | 371/371 fixed0 | complete |
| SFT | 1855/1855 | 371/371 fixed0 | complete |
| PAFT w1.5 | 1855/1855 | 371/371 fixed0 | complete |

The original validation watcher was paused because D4J Java tests raised CPU
load and reduced generation throughput. The watcher script now waits until all
three result directories contain 1855 JSON files before starting validation.
It is running in screen:

`watch_d4j_qwen14_n5_validate`

Current watcher log:

`analysis_outputs/logs/watch_validate_d4j_qwen14_oldrecipe_n5_20260703.wait_all.log`

At 10:21 CST all three D4J n=5 generation directories reached 1855 JSON files,
and the watcher entered CPU validation. GPU1 was released by D4J generation.
At 13:04 CST validation and metric recomputation finished.

Metrics files:

- `analysis_outputs/d4j_qwen14_oldrecipe_n5_s7401_metrics_20260703.csv`
- `analysis_outputs/d4j_qwen14_oldrecipe_n5_s7401_metrics_20260703.md`

Completed metrics:

| Model | pass@1 | pass@5 | Avg AED | Med AED | Avg CCR | Med CCR |
|---|---:|---:|---:|---:|---:|---:|
| Base | 20.32 | 21.02 | 169.27 | 123.00 | 70.79 | 78.26 |
| SFT | 20.43 | 22.91 | 79.70 | 34.00 | 74.68 | 83.33 |
| PAFT w1.5 | 22.10 | 23.72 | 60.72 | 26.00 | 80.72 | 88.89 |

Interpretation: larger-open-backbone positive result on Defects4J. PAFT improves
correctness and locality over both Base and SFT under the same Qwen14 backbone,
seed, prompt, decoding, and `n=5` protocol.

## 2026-07-03 10:23 CST Qwen2.5-Coder-14B HumanEval-Java n=5 Seed 7301 Generation

Purpose: rerun the larger-open-backbone HumanEval-Java triad with the same seed
that gave the positive n=1 diagnostic, but with `n=5`, to check whether the
positive pass@1/locality operating point persists under multi-sample decoding.
Generation is complete. Package normalization has been applied to separate
`*-pkgfix` directories; rejudge is queued behind D4J CPU validation.

Launcher:

`analysis_outputs/logs/run_hejava_qwen14_oldrecipe_n5_s7301_generate_gpu1_20260703.sh`

Screen:

`hejava_qwen14_n5_s7301_gpu1`

Log:

`analysis_outputs/logs/run_hejava_qwen14_oldrecipe_n5_s7301_generate_gpu1_20260703.log`

Output tags:

- `qwen2.5coder14b-hejava-n5-s7301`
- `qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620-hejava-n5-s7301`
- `qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620-hejava-n5-s7301`

Status at 13:28 CST:

| Model | Generated Java files | Status |
|---|---:|---|
| Base | 815/815 | generation complete |
| SFT | 815/815 | generation complete |
| PAFT w1.5 | 815/815 | generation complete |

Package-normalized output tags:

- `qwen2.5coder14b-hejava-n5-s7301-pkgfix`
- `qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620-hejava-n5-s7301-pkgfix`
- `qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620-hejava-n5-s7301-pkgfix`

Package normalization log:

`analysis_outputs/logs/normalize_hejava_qwen14_n5_s7301_pkgfix_20260703.log`

Queued rejudge watcher:

`hejava_qwen14_n5_s7301_rejudge_wait`

Watcher log:

`analysis_outputs/logs/watch_hejava_qwen14_n5_s7301_pkgfix_rejudge_after_d4j_20260703.log`

After D4J metrics appeared, this watcher started rejudging HumanEval-Java. At
13:28 CST Base rejudge was complete (5 plausible patches) and SFT rejudge was
in progress.

## 2026-07-03 12:27 CST Qwen2.5-Coder-14B QuixBugs-Python Seed 7106 Generation

Purpose: add a larger-open-backbone cross-language repair sanity check on a
small benchmark with ground-truth fixed programs. This complements the existing
DS-Coder-6.7B QuixBugs run and the Qwen14 HumanEvalPack-Python diagnostic.
Generation is running now; evaluation should be run after D4J validation or
other CPU-heavy work finishes.

Launcher:

`analysis_outputs/logs/run_quixbugs_qwen14_oldrecipe_seed7106_generate_gpu1_20260703.sh`

Screen:

`quixbugs_qwen14_seed7106_gpu1`

Log:

`analysis_outputs/logs/run_quixbugs_qwen14_oldrecipe_seed7106_generate_gpu1_20260703.log`

Output root:

`analysis_outputs/quixbugs_python_qwen14_oldrecipe_20260703_seed7106/`

Models:

- `qwen2.5coder14b`
- `qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620`
- `qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620`

Status at 13:28 CST: generation complete for all three models (40 tasks each).
Evaluation is intentionally deferred until the HumanEval-Java rejudge CPU load
finishes.

Queued evaluation watcher:

`quixbugs_qwen14_seed7106_eval_wait`

Watcher log:

`analysis_outputs/logs/watch_quixbugs_qwen14_seed7106_evaluate_after_hejava_20260703.log`

Planned summary files after evaluation:

- `analysis_outputs/quixbugs_python_qwen14_oldrecipe_seed7106_summary_20260703.csv`
- `analysis_outputs/quixbugs_python_qwen14_oldrecipe_seed7106_summary_20260703.md`

## 2026-07-04 12:12 CST Local GPU Qwen2.5-Coder-14B D4J Seed 7403 Generation

Purpose: use one local GPU for another full Qwen14 Defects4J `n=10` generation
seed. This is intended as robustness/audit evidence for the larger-open-backbone
D4J result. Validation is intentionally deferred until the current CPU-heavy
HumanEval-Java rejudge and seed7402 D4J validation finish.

Launcher:

`analysis_outputs/logs/run_d4j_qwen14_oldrecipe_n10_seed7403_gpu1_20260704.sh`

Screen:

`d4j_qwen14_n10_s7403_generate`

Log:

`analysis_outputs/logs/run_d4j_qwen14_oldrecipe_n10_seed7403_gpu1_20260704.log`

Output tags:

- `qwen2.5coder14b-d4j-n10-s7403`
- `qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620-d4j-n10-s7403`
- `qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620-d4j-n10-s7403`
- `qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620-d4j-n10-s7403`

Status at 12:12 CST: screen launched and the Base model is loading on local
GPU1. GPU1 memory usage reached roughly 28.7 GiB during vLLM model load.

## 2026-07-04 12:17 CST Qwen2.5-Coder-14B D4J Seed 7402 Completed

Seed7402 is complete after conservatively marking the long-running
`Compress-30` w1.5 validation as `RELEVANT_TIMEOUT`. This avoids inflating
plausibility and frees CPU for later validation. This run is an internal
robustness/stress seed only; seed7401 remains the preferred reportable D4J
larger-open-backbone result.

Metric files:

- `analysis_outputs/d4j_qwen14_oldrecipe_n10_s7402_metrics_20260704.csv`
- `analysis_outputs/d4j_qwen14_oldrecipe_n10_s7402_metrics_20260704.md`

Summary:

| Model | pass@1 | pass@5 | pass@10 | Plausible patches | Avg. AED | Med. AED | Avg. CCR | Med. CCR |
|---|---:|---:|---:|---:|---:|---:|---:|---:|
| Base | 10.46 | 10.51 | 10.51 | 388 | 206.13 | 158.00 | 65.83 | 68.42 |
| SFT | 18.17 | 20.02 | 20.75 | 674 | 64.15 | 43.00 | 78.84 | 87.50 |
| PAFT w1.5 | 19.49 | 21.51 | 21.83 | 723 | 71.21 | 39.00 | 71.49 | 80.00 |
| PAFT w2 | 14.93 | 16.31 | 16.71 | 554 | 47.22 | 28.00 | 78.78 | 85.71 |

Interpretation:

- PAFT w1.5 improves correctness over SFT on this seed and has lower median AED,
  but worse average AED/CCR.
- PAFT w2 gives the strongest locality but loses correctness relative to SFT.
- Because Base is unusually weak in this seed, this should not replace seed7401
  as the main paper-facing run.

## 2026-07-04 12:17 CST Seed 7403 Validation Watcher

A waiting validation watcher has been launched. It waits for all four seed7403
generation rows to produce `3710` JSON files, then waits for CPU-heavy blockers
to finish before running D4J validation and recomputing metrics.

Watcher:

`d4j_qwen14_n10_s7403_validate_watch`

Watcher log:

`analysis_outputs/logs/watch_validate_d4j_qwen14_oldrecipe_n10_seed7403_20260704.log`

## 2026-07-04 12:23 CST HumanEval-Java Qwen14 n10 Progress

The HumanEval-Java n10 package-fixed rejudge has completed Base and SFT and
has started PAFT w1.5.

Current rejudge counts:

| Model | Results | Plausible patches reported by rejudge log |
|---|---:|---:|
| Base | 1630/1630 | already complete |
| SFT | 1630/1630 | 10 |
| PAFT w1.5 | started | pending |
| PAFT w2 | pending | pending |

Metric output remains pending until all four rows complete:

- `analysis_outputs/humaneval_java_qwen14_oldrecipe_pkgfix_n10_s7302_20260704.csv`
- `analysis_outputs/humaneval_java_qwen14_oldrecipe_pkgfix_n10_s7302_20260704.md`

## 2026-07-04 12:23 CST Seed 7403 Generation Progress

Local GPU1 Qwen14 D4J seed7403 generation is actively writing files. Base has
`120/3710` JSON files; SFT/PAFT rows have not started yet.

## 2026-07-04 12:29 CST Running Progress Snapshot

Active screens:

- `d4j_qwen14_n10_s7403_generate`
- `d4j_qwen14_n10_s7403_validate_watch`
- `hejava_qwen14_n10_s7302_pkgfix_watch`

HumanEval-Java n10 rejudge:

| Model | Results | Status |
|---|---:|---|
| Base | 1630/1630 | complete |
| SFT | 1630/1630 | complete, 10 plausible patches in log |
| PAFT w1.5 | 312/1630 | running |
| PAFT w2 | 0/1630 | pending |

Defects4J seed7403 generation:

| Model | Generated JSON files | Status |
|---|---:|---|
| Base | 272/3710 | running |
| SFT | 0/3710 | pending |
| PAFT w1.5 | 0/3710 | pending |
| PAFT w2 | 0/3710 | pending |

## 2026-07-04 13:23 CST HumanEval-Java Qwen14 n10 Completed

Metric files:

- `analysis_outputs/humaneval_java_qwen14_oldrecipe_pkgfix_n10_s7302_20260704.csv`
- `analysis_outputs/humaneval_java_qwen14_oldrecipe_pkgfix_n10_s7302_20260704.md`

Summary:

| Model | pass@1 | pass@5 | pass@10 | Plausible patches | Avg. AED | Med. AED | Avg. CCR | Med. CCR |
|---|---:|---:|---:|---:|---:|---:|---:|---:|
| Base | 0.61 | 0.61 | 0.61 | 10 | 481.00 | 481.00 | 33.33 | 33.33 |
| SFT | 0.61 | 0.61 | 0.61 | 10 | 299.00 | 299.00 | 63.64 | 63.64 |
| PAFT w1.5 | 0.61 | 0.61 | 0.61 | 10 | 271.00 | 271.00 | 72.73 | 72.73 |
| PAFT w2 | 0.61 | 0.61 | 0.61 | 10 | 272.00 | 272.00 | 72.73 | 72.73 |

Audit note:

- All four rows solve the same single task (`SPLIT_WORDS`) in all ten samples.
- This run is not useful as a correctness-improvement result.
- It is usable only as appendix/locality evidence: under equal correctness,
  PAFT reduces AED versus SFT (271/272 vs 299) and improves CCR (72.73 vs
  63.64).

The result has also been integrated into
`scripts/summarize_tse_current_evidence.py`, and the refreshed summary is in
`analysis_outputs/tse_current_evidence_summary.md`.

## 2026-07-04 13:26 CST Seed 7403 Watcher Optimization

The seed7403 validation watcher was changed from all-row waiting to per-row
waiting: it now validates each row as soon as that row reaches `3710` generated
JSON files. This allows Base validation to run while SFT generation proceeds,
instead of waiting for all four rows to finish generating first.

Current watcher:

`d4j_qwen14_n10_s7403_validate_watch`

Current status at 13:25 CST: Base generation is active and has reached roughly
`1256/3710` JSON files. The watcher is waiting specifically on
`qwen2.5coder14b-d4j-n10-s7403`.

Sanity checks passed after the watcher and evidence-summary edits:

- `bash -n scripts/check_tse_ready.sh analysis_outputs/logs/watch_validate_d4j_qwen14_oldrecipe_n10_seed7403_20260704.sh`
- `python3 -m py_compile scripts/summarize_tse_current_evidence.py`

## 2026-07-04 13:31 CST Seed 7403 GPU0 PAFT-w2 Parallel Generation

To reduce total wall time, GPU0 was started on the PAFT `w=2.0` seed7403 row
while GPU1 continues the Base row. This is safe because
`scripts/remote_generate_d4j_vllm.py` skips existing non-empty JSON outputs with
logs; if the sequential GPU1 script reaches the w2 row later, it should skip the
already generated candidates.

Screen:

`d4j_qwen14_w2_n10_s7403_gpu0`

Launcher:

`analysis_outputs/logs/run_d4j_qwen14_oldrecipe_w2_n10_seed7403_gpu0_20260704.sh`

Log:

`analysis_outputs/logs/run_d4j_qwen14_oldrecipe_w2_n10_seed7403_gpu0_20260704.log`

Status at launch: GPU0 started loading Qwen14; GPU1 remained active on Base
generation.

Live check at 13:35 CST: GPU0 and GPU1 are both generating. Base reached
`1576/3710` JSON files; PAFT `w=2.0` reached `88/3710` JSON files. GPU0 memory
usage was about 42.7 GiB and GPU1 about 42.0 GiB.

Live check at 13:50 CST: Base reached `2008/3710`; PAFT `w=2.0` reached
`456/3710`. Both GPUs remained active at high utilization. The validation
watcher is still waiting for the Base row to reach `3710/3710`.

Live check at 14:20 CST: Base reached `2984/3710`; PAFT `w=2.0` reached
`1144/3710`. Both generation processes remained active. The watcher has not yet
started Base validation because Base generation is still incomplete.

## 2026-07-04 15:43 CST Local GPU Continuation and Multi-SWE Queue

Current local GPU state:

- GPU0 is running Qwen14 PAFT `w=2.0` Defects4J seed7403 generation through
  `post_hepack_qwen14_w2_resume_d4j_s7403`.
- GPU1 is running Qwen14 SFT Defects4J seed7403 generation through
  `d4j_qwen14_n10_s7403_generate`.
- CPU validation is running Base seed7403 through
  `d4j_qwen14_n10_s7403_validate_watch`.

Progress snapshot at 15:41 CST:

- Base: `3710/3710` generated JSON files and `291/371` validation result files.
- SFT: `296/3710` generated JSON files.
- PAFT `w=2.0`: `1964/3710` generated JSON files.
- PAFT `w=1.5`: queued in the GPU1 serial generation script after SFT.

The validation watcher script has been audited and will validate all four
seed7403 rows after their generation files exist, then recompute:

- `analysis_outputs/d4j_qwen14_oldrecipe_n10_s7403_metrics_20260704.csv`
- `analysis_outputs/d4j_qwen14_oldrecipe_n10_s7403_metrics_20260704.md`

New complex-benchmark preparation:

- Added `scripts/prepare_multiswe_oracle_contexts.py` to export Multi-SWE Java
  Verified oracle-file contexts from local Git repositories at each
  `base_commit`.
- Generated full/diagnostic context artifacts:
  - `analysis_outputs/multiswe_java_verified_stratified_smoke12_contexts_20260704.jsonl`
  - `analysis_outputs/multiswe_java_verified_stratified_smoke12_contexts_20260704.md`
  - `analysis_outputs/multiswe_java_verified_stratified_smoke12_contexts_ctx20_20260704.jsonl`
  - `analysis_outputs/multiswe_java_verified_stratified_smoke12_contexts_ctx20_20260704.md`
  - `analysis_outputs/multiswe_java_verified_stratified_smoke12_contexts_ctx5_20260704.jsonl`
  - `analysis_outputs/multiswe_java_verified_stratified_smoke12_contexts_ctx5_20260704.md`
- Generated a runnable fixed-rule smoke subset:
  - `analysis_outputs/multiswe_java_verified_runnable_smoke10_ctx5_max20k_20260704.jsonl`
  - `analysis_outputs/multiswe_java_verified_runnable_smoke10_ctx5_max20k_20260704.md`

The runnable smoke subset uses +/-5-line oracle hunk windows, keeps prompts below
20K characters, and retains `10/12` stratified instances, including two
multi-file repairs (`8` and `5` gold-touched files). Gold patches are stored for
metrics, but prompts include only issue text and buggy localized snippets.

Added `scripts/generate_multiswe_oracle_vllm.py` for Qwen/DeepSeek-family vLLM
generation over the prepared contexts. It writes raw responses plus
Multi-SWE-compatible `predictions.jsonl` files.

Queued GPU0 follow-up:

- Screen: `multiswe_smoke10_qwen14_wait_gpu0`
- Launcher:
  `analysis_outputs/logs/run_multiswe_smoke10_qwen14_after_gpu0_free_20260704.sh`
- Log:
  `analysis_outputs/logs/run_multiswe_smoke10_qwen14_after_gpu0_free_20260704.log`

This queued job waits until GPU0 memory drops below 8 GiB, then runs Qwen14
Base/SFT/PAFT-w1.5/PAFT-w2 on the runnable Multi-SWE smoke10 contexts with
fixed seed `7401`, `n=1`. It does not interrupt the current Defects4J PAFT-w2
run.

## 2026-07-04 16:24 CST Multi-SWE Neutral Smoke10 Result and GPU Reallocation

The first Multi-SWE smoke10 queue used wording that included "minimal necessary
changes". Because this does not match the neutral repair prompt used for the
controlled generator comparisons, that output is kept only as a discarded audit
trail under:

- `analysis_outputs/multiswe_java_smoke10_generations/`
- `analysis_outputs/logs/run_multiswe_smoke10_qwen14_after_gpu0_free_20260704.log`

The usable Multi-SWE smoke10 artifacts are the neutral-prompt versions:

- Context JSONL:
  `analysis_outputs/multiswe_java_verified_runnable_smoke10_ctx5_max20k_neutral_20260704.jsonl`
- Context summary:
  `analysis_outputs/multiswe_java_verified_runnable_smoke10_ctx5_max20k_neutral_20260704.md`
- Generation root:
  `analysis_outputs/multiswe_java_smoke10_generations_neutral/`
- Launcher:
  `analysis_outputs/logs/run_multiswe_smoke10_qwen14_neutral_gpu0_20260704.sh`
- Log:
  `analysis_outputs/logs/run_multiswe_smoke10_qwen14_neutral_gpu0_20260704.log`
- Summary CSV/Markdown:
  - `analysis_outputs/multiswe_java_smoke10_neutral_generator_summary_20260704.csv`
  - `analysis_outputs/multiswe_java_smoke10_neutral_generator_summary_20260704.md`

Neutral smoke10 generator-level summary:

| Model | Predictions | Nonempty | Avg/Med patch chars | Avg/Med patch-text AED (computed n) | File P/R | Extra/Missing files |
|---|---:|---:|---:|---:|---:|---:|
| Base | 10/10 | 10 | 2703.5/2623.0 | 1045.8/978.0 (4) | 1.00/0.85 | 0.00/0.80 |
| SFT | 10/10 | 10 | 2397.5/1499.5 | 1014.0/930.0 (5) | 1.00/0.86 | 0.00/0.60 |
| PAFT `w=1.5` | 10/10 | 10 | 2732.8/1508.5 | 894.0/802.5 (6) | 1.00/0.91 | 0.00/0.40 |
| PAFT `w=2.0` | 10/10 | 10 | 2999.8/2207.0 | 850.5/847.0 (4) | 1.00/0.92 | 0.00/0.60 |

Interpretation: this is not an official Multi-SWE harness pass/fail result. It
is a generator-level complex-benchmark smoke test over 10 fixed-rule Java
Verified tasks, including two multi-file repairs. Both PAFT variants improve
file recall over SFT and lower patch-text AED on the computable subset. PAFT
`w=1.5` has the best missing-file count; PAFT `w=2.0` has the best file recall
and patch-text AED, but larger patch length.

D4J seed7403 update:

- Base validation completed at `371/371`.
- Base-only metrics were written to:
  - `analysis_outputs/d4j_qwen14_oldrecipe_n10_s7403_base_only_metrics_20260704.csv`
  - `analysis_outputs/d4j_qwen14_oldrecipe_n10_s7403_base_only_metrics_20260704.md`
- Base seed7403 metrics: pass@1/5/10 = `16.33/17.59/17.79`, Avg./Med. AED =
  `172.33/101.00`, Avg./Med. CCR = `68.38/71.43`.

After the Multi-SWE run completed, GPU0 was reassigned to Qwen14 PAFT `w=1.5`
D4J seed7403 generation:

- Screen: `d4j_qwen14_w15_n10_s7403_gpu0`
- Launcher:
  `analysis_outputs/logs/run_d4j_qwen14_oldrecipe_w15_n10_seed7403_gpu0_20260704.sh`
- Log:
  `analysis_outputs/logs/run_d4j_qwen14_oldrecipe_w15_n10_seed7403_gpu0_20260704.log`

GPU1 continues Qwen14 SFT D4J seed7403 generation through
`d4j_qwen14_n10_s7403_generate`. The seed7403 watcher remains active and will
validate rows as their JSON files become complete.

Static checks passed:

- `python3 -m py_compile scripts/prepare_multiswe_oracle_contexts.py scripts/prepare_multiswe_eval_files.py scripts/generate_multiswe_oracle_vllm.py scripts/summarize_multiswe_oracle_generations.py scripts/summarize_tse_current_evidence.py scripts/remote_generate_d4j_vllm.py scripts/recompute_d4j_metrics.py`
- `bash -n analysis_outputs/logs/run_multiswe_smoke10_qwen14_after_gpu0_free_20260704.sh analysis_outputs/logs/watch_summarize_multiswe_smoke10_20260704.sh analysis_outputs/logs/run_multiswe_smoke10_qwen14_neutral_gpu0_20260704.sh analysis_outputs/logs/run_d4j_qwen14_oldrecipe_w15_n10_seed7403_gpu0_20260704.sh scripts/check_tse_ready.sh`

## 2026-07-04 16:33 CST Local GPU Continuation

The old sequential seed7403 generation screen
`d4j_qwen14_n10_s7403_generate` was stopped because it would have continued
from SFT into PAFT `w=1.5` / `w=2.0`, risking duplicate concurrent writes with
the dedicated GPU0 PAFT job. It was replaced with a SFT-only resume job:

- Screen: `d4j_qwen14_sft_only_n10_s7403_gpu1`
- Launcher:
  `analysis_outputs/logs/run_d4j_qwen14_oldrecipe_sft_only_n10_seed7403_gpu1_20260704.sh`
- Log:
  `analysis_outputs/logs/run_d4j_qwen14_oldrecipe_sft_only_n10_seed7403_gpu1_20260704.log`

GPU0 continues PAFT `w=1.5`:

- Screen: `d4j_qwen14_w15_n10_s7403_gpu0`
- Log:
  `analysis_outputs/logs/run_d4j_qwen14_oldrecipe_w15_n10_seed7403_gpu0_20260704.log`

PAFT `w=2.0` has been queued to resume only after either SFT on GPU1 or PAFT
`w=1.5` on GPU0 releases a local GPU:

- Screen: `d4j_qwen14_w2_n10_s7403_wait_anygpu`
- Launcher:
  `analysis_outputs/logs/run_d4j_qwen14_oldrecipe_w2_n10_seed7403_wait_anygpu_20260704.sh`
- Log:
  `analysis_outputs/logs/run_d4j_qwen14_oldrecipe_w2_n10_seed7403_wait_anygpu_20260704.log`

The old validation watcher was replaced with a v2 watcher aware of these split
generation screens:

- Screen: `d4j_qwen14_n10_s7403_validate_watch_v2`
- Launcher:
  `analysis_outputs/logs/watch_validate_d4j_qwen14_oldrecipe_n10_seed7403_v2_20260704.sh`
- Log:
  `analysis_outputs/logs/watch_validate_d4j_qwen14_oldrecipe_n10_seed7403_v2_20260704.log`

Current seed7403 counts at launch/restart time:

| Model | JSON | Validation results |
|---|---:|---:|
| Base | 3710/3710 | 371/371 |
| SFT | 736/3710 | 0/371 |
| PAFT `w=1.5` | 192/3710 | 0/371 |
| PAFT `w=2.0` | 1964/3710 | 0/371 |

Summary integration update:

- `scripts/summarize_tse_current_evidence.py` now includes the neutral
  Multi-SWE Java smoke10 generator-level result and will include the seed7403
  D4J `n=10` table once the four-row metrics file exists.
- The v2 seed7403 validation watcher now runs
  `python3 scripts/summarize_tse_current_evidence.py` after recomputing the
  seed7403 D4J metrics, so the paper-facing evidence summary refreshes
  automatically when validation finishes.
- `scripts/check_tse_ready.sh` now syntax-checks the split seed7403 SFT,
  PAFT-`w=2`, and v2 watcher launchers.

Verification:

- `python3 -m py_compile scripts/summarize_tse_current_evidence.py`
- `bash -n analysis_outputs/logs/watch_validate_d4j_qwen14_oldrecipe_n10_seed7403_v2_20260704.sh scripts/check_tse_ready.sh`
- `python3 scripts/summarize_tse_current_evidence.py`

Partial output-format audit on seed7403 fixed0 files:

- CSV:
  `analysis_outputs/d4j_qwen14_seed7403_partial_output_format_20260704.csv`
- SFT: 76 fixed0 files, 86.8% Java-like, 9.2% prose/diff-like marker,
  0 empty, 1 no-op.
- PAFT `w=1.5`: 25 fixed0 files, 96.0% Java-like, 0.0% prose/diff-like
  marker, 0 empty, 1 no-op.
- PAFT `w=2.0`: 197 fixed0 files, 95.4% Java-like, 2.0% prose/diff-like
  marker, 0 empty, 10 no-op.

The current partial generations pass the loose format gate used here
(`min_files=20`, `min_java_like_pct=60`, `max_prose_like_pct=10`). The
`prose_like` detector is conservative and flags leading unified-diff-like
snippets such as `- old + new`, so this audit is only a preflight, not a repair
metric.

## 2026-07-04 16:36 CST Fixed-Seed Manifest

Added code-level fixed-seed provenance:

- Script:
  `scripts/tse_fixed_seed_manifest.py`
- Generated artifact:
  `analysis_outputs/tse_fixed_seed_manifest.md`

This manifest records the fixed seeds that should be reported instead of
multi-seed claims:

- D4J Qwen14 main positive diagnostic: seed `7401`
- D4J Qwen14 sensitivity rerun: seed `7403` (running)
- D4J Qwen14 stress seed: seed `7402`
- QuixBugs-Python Qwen14: seed `7106`
- HumanEvalPack-Python Qwen14: seed `7202`
- Multi-SWE Java neutral smoke10: seed `7401`

`scripts/summarize_tse_current_evidence.py` now links this manifest at the top
of `analysis_outputs/tse_current_evidence_summary.md`, and
`scripts/check_tse_ready.sh` includes the manifest script in the py_compile
gate.

Verification:

- `python3 -m py_compile scripts/tse_fixed_seed_manifest.py scripts/summarize_tse_current_evidence.py`
- `python3 scripts/tse_fixed_seed_manifest.py`
- `python3 scripts/summarize_tse_current_evidence.py`

## 2026-07-04 16:38 CST Reviewer Matrix Refresh

Updated the post-ASE reviewer concern tracking artifacts so they match the
current evidence state:

- `analysis_outputs/tse_reviewer_concern_resolution_matrix.md`
  - Multi-SWE Java is no longer listed as only "asset audited"; it is now
    marked partially addressed by the neutral-prompt generator-level smoke10
    result, with the official-harness caveat preserved.
  - Qwen14 QuixBugs-Python now includes both PAFT `w=1.5` and `w=2.0`, with
    the correct fixed-seed result: PAFT improves over SFT but not over Base in
    raw correctness.
  - `w_align` selection now points to
    `analysis_outputs/tse_fixed_seed_manifest.md` as the reproducibility
    record.
- `analysis_outputs/ase2442_reviews_and_meta.md`
  - The complex-benchmark requirement now references the Multi-SWE smoke10
    result as generator-level evidence, not official pass/fail.
  - Added `analysis_outputs/tse_fixed_seed_manifest.md` to the evidence
    pointer list.

## 2026-07-04 16:39 CST Multi-SWE Detail Audit

Extended the Multi-SWE generator-level summarizer so aggregate smoke results
have per-instance audit rows:

- Script updated:
  `scripts/summarize_multiswe_oracle_generations.py`
- New detail CSV:
  `analysis_outputs/multiswe_java_smoke10_neutral_generator_details_20260704.csv`

The detail CSV records, for every model/instance pair:

- instance id
- nonempty patch flag
- generated/gold patch character length
- patch-text AED when the bounded Levenshtein computation is tractable
- generated/gold touched-file counts
- file precision/recall
- extra/missing file counts

This makes the Multi-SWE smoke10 result auditable beyond the aggregate table and
helps defend against cherry-pick concerns. It remains generator-level evidence,
not official harness pass/fail.

Verification:

- `python3 -m py_compile scripts/summarize_multiswe_oracle_generations.py`
- Recomputed:
  `analysis_outputs/multiswe_java_smoke10_neutral_generator_summary_20260704.{csv,md}`
- Wrote:
  `analysis_outputs/multiswe_java_smoke10_neutral_generator_details_20260704.csv`

## 2026-07-04 16:40 CST Multi-SWE Bucket-Level Audit

Further strengthened the Multi-SWE smoke audit:

- `scripts/summarize_multiswe_oracle_generations.py` now writes bucket/repo
  metadata, prompt length, generated/gold file lists, and file-count fields in
  the detail CSV.
- The Markdown summary now includes a "By Complexity Bucket" table that reports
  single-file, two-file, and three-plus-file subsets separately.
- `scripts/tse_fixed_seed_manifest.py` now lists
  `analysis_outputs/multiswe_java_smoke10_neutral_generator_details_20260704.csv`
  as an official artifact for the fixed-seed Multi-SWE smoke.

This is useful because the reviewer concern was specifically about complex and
multi-file repair. The new bucket table shows that the smoke includes 4
single-file tasks, 4 two-file tasks, and 2 three-plus-file tasks after the
prompt-length filter, while preserving the caveat that this is not official
Multi-SWE harness pass/fail.

Verification:

- `python3 -m py_compile scripts/summarize_multiswe_oracle_generations.py scripts/tse_fixed_seed_manifest.py`
- Recomputed:
  `analysis_outputs/multiswe_java_smoke10_neutral_generator_summary_20260704.{csv,md}`
- Regenerated:
  `analysis_outputs/tse_fixed_seed_manifest.md`
- Refreshed:
  `analysis_outputs/tse_current_evidence_summary.md`

## 2026-07-04 16:42 CST Evidence Gate

Added a reviewer-facing evidence gate so the key post-ASE concerns are checked
against current artifacts instead of only described manually:

- Script:
  `scripts/check_tse_evidence_artifacts.py`
- Markdown output:
  `analysis_outputs/tse_evidence_artifact_check.md`
- JSON output:
  `analysis_outputs/tse_evidence_artifact_check.json`

Current gate status: `OK`.

Checked concerns:

- larger open backbone: Qwen14 D4J seed7401 `n=10`
- frontier scale-plus-prompt diagnostic: Qwen3-Max and DeepSeek-V3 minimal
- copy-collapse side effect: DS-Coder no-op audit
- near-duplicate leakage: normalized 5-gram Jaccard
- complex/multi-file generator diagnostic: Multi-SWE smoke10 neutral prompt
- cross-language sanity check: Qwen14 QuixBugs-Python seed7106
- fixed-seed reproducibility: `analysis_outputs/tse_fixed_seed_manifest.md`

`scripts/check_tse_ready.sh` now runs this evidence gate before the TeX smoke
compile, and `scripts/summarize_tse_current_evidence.py` links the generated
gate report near the top of the evidence summary.

Verification:

- `python3 -m py_compile scripts/check_tse_evidence_artifacts.py scripts/summarize_tse_current_evidence.py`
- `bash -n scripts/check_tse_ready.sh`
- `python3 scripts/check_tse_evidence_artifacts.py`
- `python3 scripts/summarize_tse_current_evidence.py`

## 2026-07-04 16:50 CST Local GPU Continuation and Mechanism Gate

Local Defects4J Qwen14 seed7403 experiments are continuing in detached screens:

- GPU0: PAFT w=1.5 generation.
- GPU1: SFT generation.
- Queue: PAFT w=2.0 waits for either generation job to release a GPU.
- Watcher: validation starts automatically when each model reaches 3710 JSON
  outputs and then refreshes the metrics summary.

The evidence gate was also extended with a stable-region edit diagnostic from
`analysis_outputs/tse_existing_backbone_d4j_summary.md`. It now checks that
PAFT reduces edits outside reference-changed regions on the existing Qwen8B and
Qwen2.5-Coder-7B Defects4J artifacts without materially increasing missed
reference edits. This directly supports the learned preservation/localization
prior argument.

Current gate status: `OK`.

Verification:

- `python3 -m py_compile scripts/check_tse_evidence_artifacts.py scripts/summarize_tse_current_evidence.py`
- `python3 scripts/check_tse_evidence_artifacts.py`
- `python3 scripts/summarize_tse_current_evidence.py`

## 2026-07-04 16:57 CST Mechanism Summary Integration

The current evidence summary now includes an explicit
"Mechanism and Side-Effect Diagnostics" section generated from audited
artifacts:

- Stable-region edit table from
  `analysis_outputs/tse_existing_backbone_d4j_summary.md`.
- Copy-collapse/no-op table from
  `analysis_outputs/d4j_deepseek67b_current_complete_371_pass10_noop_20260701.csv`.
- Near-duplicate leakage text from
  `analysis_outputs/d4j_train_eval_5gram_jaccard_summary_20260621.md`.

This makes the Reviewer A evidence visible in the main summary instead of only
in the gate/matrix.

Local seed7403 generation status at 16:57 CST:

- Base: `3710/3710` JSON files and `371/371` validation results.
- SFT: `1024/3710` JSON files.
- PAFT w=1.5: `656/3710` JSON files.
- PAFT w=2.0: `1964/3710` JSON files; queued until a GPU is free.

Verification:

- `python3 -m py_compile scripts/check_tse_evidence_artifacts.py scripts/summarize_tse_current_evidence.py`
- `python3 scripts/check_tse_evidence_artifacts.py`
- `python3 scripts/summarize_tse_current_evidence.py`
- Inspected `analysis_outputs/tse_current_evidence_summary.md`

## 2026-07-04 16:59 CST TSE Readiness Gate

After adding the mechanism summary section, the lightweight TSE readiness gate
still passes.

Verification:

- `bash -n scripts/check_tse_ready.sh`
- `bash scripts/check_tse_ready.sh`

## 2026-07-04 17:11 CST Attribution Gate and Local GPU Progress

Added an attribution/curriculum scope check to the reviewer-facing evidence gate.
The gate verifies the DS-Coder sensitivity rows and manuscript wording:

- full masking vs. curriculum vs. final PAFT pass@1:
  `7.41 / 8.25 / 10.13`;
- full masking vs. curriculum vs. final PAFT Avg. AED:
  `105.01 / 111.17 / 80.66`;
- `w_align=0/2/4` pass@1:
  `7.25 / 9.14 / 8.22`;
- manuscript text explicitly says curriculum is not itself a locality mechanism,
  the sweep is not definitive hyperparameter optimization, and `w_align=2` is
  not universally optimal.

Verification:

- `python3 -m py_compile scripts/check_tse_evidence_artifacts.py scripts/summarize_tse_current_evidence.py`
- `python3 scripts/check_tse_evidence_artifacts.py`
- `bash scripts/check_tse_ready.sh`

Latest local seed7403 generation status at 17:11 CST:

- Base: `3710/3710` JSON files and `371/371` validation results.
- SFT: `1224/3710` JSON files.
- PAFT w=1.5: `1024/3710` JSON files.
- PAFT w=2.0: `1964/3710` JSON files; queued until a GPU is free.
- GPU0/GPU1 are both occupied by the SFT and PAFT w=1.5 generation jobs, with
  GPU utilization around `88%` and `81%`.

## 2026-07-04 17:16 CST Local Incremental Validation Throttle

Added `scripts/local_incremental_validate_d4j_loop.sh` for safe CPU-side
incremental validation of partially generated D4J outputs. The script validates
only bugs with all `n` candidate JSON files present and uses a per-model lock
compatible with the seed7403 validation watcher.

A first attempt to run SFT, PAFT w=1.5, and PAFT w=2.0 validation loops in
parallel with 4 workers each started correctly:

- SFT ready bugs: `126/371`;
- PAFT w=1.5 ready bugs: `107/371`;
- PAFT w=2.0 ready bugs: `196/371`.

However, concurrent D4J validation reduced local GPU utilization into the
`30--60%` range. The incremental loops were stopped, after which GPU utilization
returned to roughly `80--90%`. Current policy: prioritize uninterrupted local GPU
generation; use incremental validation only after one GPU generation job ends or
with much lower concurrency.

## 2026-07-04 17:05 CST Fixed-Seed Claim Hygiene

`scripts/check_tse_claim_hygiene.py` now guards against accidental
multi-seed claims in the TSE manuscript. It forbids `multi-seed`/`multiseed`
wording in the paper and requires the manuscript to retain the fixed-seed and
single-seed-limitation framing.

Verification:

- `bash scripts/check_tse_ready.sh`

## 2026-07-04 17:06 CST Fixed-Seed Artifact Existence Gate

The fixed-seed reproducibility gate now checks artifact existence, not only
manifest text:

- complete/reportable and supplementary metric artifacts must exist;
- running seed7403 result directories must exist;
- representative launchers must exist, be listed in the manifest, and contain
  the expected `--seed` value.

Current evidence gate line:

- `fixed-seed reproducibility | OK | ... complete artifacts present=True; running artifacts present=True; key launchers present=True; launcher --seed values verified=True`

Verification:

- `python3 -m py_compile scripts/check_tse_evidence_artifacts.py`
- `python3 scripts/check_tse_evidence_artifacts.py`
- `bash scripts/check_tse_ready.sh`

## 2026-07-04 17:10 CST System-Level APR Baseline Scope Gate

Added an explicit evidence-gate row for Reviewer C's Agentless/AutoCodeRover
baseline concern. The gate checks that:

- the TSE manuscript discusses Agentless, AutoCodeRover, and RepairAgent;
- the manuscript states these are not complete APR systems in the same-class
  generator-baseline table;
- the manuscript retains the generator-swap study framing and states that the
  current evidence does not establish system-level APR state of the art;
- `analysis_outputs/tse_system_level_reference_scope.md` and
  `analysis_outputs/system_level_swap_feasibility_20260703.md` exist and
  support the same scope boundary.

Current evidence gate line:

- `system-level APR baseline scope | OK | paper scope terms=True; ...`

Verification:

- `python3 -m py_compile scripts/check_tse_evidence_artifacts.py`
- `python3 scripts/check_tse_evidence_artifacts.py`
- `bash scripts/check_tse_ready.sh`

## 2026-07-04 17:06 CST Local GPU Progress

Local seed7403 generation is still active and writing outputs:

- Base: `3710/3710` JSON files and `371/371` validation results.
- SFT: `1160/3710` JSON files.
- PAFT w=1.5: `864/3710` JSON files.
- PAFT w=2.0: `1964/3710` JSON files; queued until a GPU is free.

Both local 4090D GPUs are occupied by the SFT and w=1.5 generation jobs. Log
tails confirm new candidates are being written.

## 2026-07-04 17:08 CST Frontier Common-Plausible Gate

Added a separate evidence-gate row for the Qwen3-Max common-plausible caution.
This guards against overclaiming from cross-model AED comparisons:

- common bugs: `57`
- Qwen14 PAFT AED/CCR: `72.23/45.00`, `75.01`
- Qwen3-Max minimal AED/CCR: `76.81/37.00`, `82.71`

The result is mixed, so the safe claim remains: frontier APIs are out-of-class
high-correctness diagnostics; PAFT should not be described as beating frontier
APIs in edit locality.

Verification:

- `python3 -m py_compile scripts/check_tse_evidence_artifacts.py`
- `python3 scripts/check_tse_evidence_artifacts.py`
- `bash scripts/check_tse_ready.sh`

The gate passed the number audit, citation check, claim hygiene check, evidence
artifact check, and TeX smoke compile.

## 2026-07-04 17:00 CST Fixed-Seed Reproducibility Hardening

`scripts/tse_fixed_seed_manifest.py` now records launcher scripts alongside the
metric artifacts for the fixed-seed evidence blocks. This makes the seed
protocol auditable from summary table back to command script:

- Qwen14 Defects4J seed7401 main larger-backbone run.
- Qwen14 Defects4J seed7403 running sensitivity audit.
- Qwen14 QuixBugs-Python seed7106 sanity run.
- Qwen14 HumanEvalPack-Python seed7202 locality diagnostic.
- Multi-SWE Java smoke10 neutral-prompt seed7401 generator diagnostic.

`scripts/check_tse_evidence_artifacts.py` now checks that the manifest contains
the expected seeds and representative launcher scripts.

Verification:

- `python3 -m py_compile scripts/tse_fixed_seed_manifest.py scripts/check_tse_evidence_artifacts.py scripts/summarize_tse_current_evidence.py`
- `python3 scripts/tse_fixed_seed_manifest.py`
- `python3 scripts/check_tse_evidence_artifacts.py`
- `python3 scripts/summarize_tse_current_evidence.py`
- `bash scripts/check_tse_ready.sh`

## 2026-07-04 17:01 CST Manuscript/Matrix Consistency Check

The TSE manuscript already contains the Reviewer A diagnostics:

- source-conditioned copy/transform supervision in the approach section;
- no-op, stable-region edit, and near-duplicate diagnostics in RQ4;
- scoped discussion of learned preservation/localization prior rather than an
  inference-time localization oracle.

The reviewer concern matrix was updated to use the current Qwen14 Defects4J
seed7401 `n=10` no-op rates: Base `0.54%`, SFT `1.43%`, PAFT w=1.5 `2.70%`,
and PAFT w=2.0 `4.61%`.

Verification:

- checked manuscript occurrences with `rg`;
- removed stale matrix wording from the old `n=5` no-op diagnostic;
- `bash scripts/check_tse_ready.sh`

## 2026-07-04 17:02 CST Launcher-Level Seed Gate

The fixed-seed evidence gate now verifies more than the manifest text:

- key launcher scripts must be listed in
  `analysis_outputs/tse_fixed_seed_manifest.md`;
- each representative launcher must exist;
- each representative launcher must contain the expected seed value and a
  `--seed` argument.

This directly supports the fixed-seed reporting plan for the TSE version.

Verification:

- `python3 -m py_compile scripts/check_tse_evidence_artifacts.py scripts/summarize_tse_current_evidence.py scripts/tse_fixed_seed_manifest.py`
- `python3 scripts/check_tse_evidence_artifacts.py`
- `bash scripts/check_tse_ready.sh`

Current evidence gate line:

- `fixed-seed reproducibility | OK | ... launcher --seed values verified=True`

Latest local seed7403 generation status at 17:02 CST:

- Base: `3710/3710` JSON files and `371/371` validation results.
- SFT: `1128/3710` JSON files.
- PAFT w=1.5: `792/3710` JSON files.
- PAFT w=2.0: `1964/3710` JSON files; queued until a GPU is free.

## 2026-07-04 17:04 CST Readiness Rebuilds Derived Evidence

`scripts/check_tse_ready.sh` now rebuilds the derived reviewer-facing evidence
artifacts as part of the readiness gate:

- `analysis_outputs/tse_fixed_seed_manifest.md`
- `analysis_outputs/tse_evidence_artifact_check.{md,json}`
- `analysis_outputs/tse_current_evidence_summary.md`
- `analysis_outputs/tse_current_candidate_metrics.csv`
- `analysis_outputs/tse_quixbugs_ds67_multirun_summary.csv`

This reduces the chance that the manuscript, gate, and summary drift apart after
new fixed-seed runs finish.

Verification:

- `bash -n scripts/check_tse_ready.sh`
- `bash scripts/check_tse_ready.sh`

## 2026-07-04 17:18 CST Seed7403 Local GPU Status

The local Qwen14 seed7403 D4J jobs are still running normally.

- Base: `3710/3710` JSON files and `371/371` bug-level validation results.
- SFT: `1288/3710` JSON files and `2/371` partial bug-level validation results from the throttled incremental-validation attempt.
- PAFT w=1.5: `1112/3710` JSON files and `2/371` partial bug-level validation results.
- PAFT w=2.0: `1964/3710` JSON files and `2/371` partial bug-level validation results; the queued screen is still waiting for SFT or w=1.5 to release a GPU.

GPU utilization after stopping the parallel CPU validation loops is back around `80%+` on both local 4090D cards. The next action is to let SFT and w=1.5 finish generation; the w=2.0 queue will then automatically take the first free GPU, and the seed7403 validation watcher will run final D4J validation/metrics once each result tag reaches `3710/3710` JSON files.

## 2026-07-04 17:20 CST Seed7403 Watcher Readiness Hook

The seed7403 validation watcher was updated and restarted so that, after all
four D4J rows are validated and
`analysis_outputs/d4j_qwen14_oldrecipe_n10_s7403_metrics_20260704.{csv,md}`
are regenerated, it also runs:

- `bash scripts/check_tse_ready.sh`

with output saved to
`analysis_outputs/logs/check_tse_ready_after_seed7403_20260704.log`.

Current counts after restart:

- Base: `3710/3710` JSON files and `371/371` bug-level validation results.
- SFT: `1312/3710` JSON files and `2/371` partial bug-level validation results.
- PAFT w=1.5: `1168/3710` JSON files and `2/371` partial bug-level validation results.
- PAFT w=2.0: `1964/3710` JSON files and `2/371` partial bug-level validation results.

The watcher is waiting on SFT completion first, then will validate PAFT w=1.5
and w=2.0 after their generation outputs are complete.

## 2026-07-04 17:21 CST Readiness Check During Seed7403 Run

`bash scripts/check_tse_ready.sh` still passes after the watcher readiness hook
change. Current local generation status:

- Base: `3710/3710` JSON files and `371/371` bug-level validation results.
- SFT: `1320/3710` JSON files and `2/371` partial bug-level validation results.
- PAFT w=1.5: `1200/3710` JSON files and `2/371` partial bug-level validation results.
- PAFT w=2.0: `1964/3710` JSON files and `2/371` partial bug-level validation results.

GPU utilization remains high (`84%`/`79%` at the snapshot), so no additional
CPU-heavy validation is running. The reportable seed7403 metrics are still
pending full generation and validation.

## 2026-07-04 17:23 CST Seed7403 Partial Output-Format Audit

Updated `scripts/check_d4j_output_format.py` to distinguish diff-style patch
hunks from natural-language prose. The earlier prose-like samples were
diff-like outputs beginning with `-`/`+`, not explanatory text.

Partial fixed0 audit output:

- CSV: `analysis_outputs/d4j_qwen14_seed7403_partial_fixed0_format_20260704.csv`
- SFT: `134` files, `86.57%` java-like, `0.00%` prose-like, `29.85%` diff-like,
  `0` empty.
- PAFT w=1.5: `123` files, `95.93%` java-like, `0.00%` prose-like, `21.95%`
  diff-like, `0` empty.
- PAFT w=2.0: `197` files, `95.43%` java-like, `0.00%` prose-like, `38.58%`
  diff-like, `0` empty.

The seed7403 validation watcher now runs an output-format preflight for each
completed model and writes a combined final fixed0 audit to
`analysis_outputs/d4j_qwen14_seed7403_fixed0_format_20260704.csv` after metrics
are regenerated.

Verification:

- `python3 -m py_compile scripts/check_d4j_output_format.py`
- `python3 scripts/check_d4j_output_format.py --root defects4j/results --fixed fixed0 ...`
- `bash scripts/check_tse_ready.sh`

## 2026-07-04 17:25 CST Output-Format Gate Added

The partial/final seed7403 output-format sanity check is now part of
`scripts/check_tse_evidence_artifacts.py` and appears in
`analysis_outputs/tse_evidence_artifact_check.md`.

Current gate line:

- `output-format sanity | OK | analysis_outputs/d4j_qwen14_seed7403_partial_fixed0_format_20260704.csv: ...`

`bash scripts/check_tse_ready.sh` passes with this new gate. Current local
generation status:

- Base: `3710/3710` JSON files and `371/371` bug-level validation results.
- SFT: `1368/3710` JSON files and `2/371` partial bug-level validation results.
- PAFT w=1.5: `1280/3710` JSON files and `2/371` partial bug-level validation results.
- PAFT w=2.0: `1964/3710` JSON files and `2/371` partial bug-level validation results.

GPU utilization remains high (`81%`/`78%` at the snapshot), so no extra
CPU-heavy validation is running.

## 2026-07-04 17:26 CST Seed7403 Live Status Snapshot

Added `scripts/summarize_seed7403_status.py`, a lightweight status helper that
counts generated JSON files, bug-level result files, active seed7403 screens, and
current GPU utilization without running validation or inference.

Generated status artifacts:

- `analysis_outputs/d4j_qwen14_seed7403_live_status.md`
- `analysis_outputs/d4j_qwen14_seed7403_live_status.json`

Current snapshot:

- Base: `3710/3710` JSON files and `371/371` bug-level validation results.
- SFT: `1384/3710` JSON files and `2/371` bug-level validation results.
- PAFT w=1.5: `1288/3710` JSON files and `2/371` bug-level validation results.
- PAFT w=2.0: `1964/3710` JSON files and `2/371` bug-level validation results.

Verification:

- `python3 -m py_compile scripts/summarize_seed7403_status.py`
- `python3 scripts/summarize_seed7403_status.py`
- `bash scripts/check_tse_ready.sh`

## 2026-07-04 17:28 CST Concern Matrix and Fresh Format Snapshot

Updated the reviewer concern matrix with an explicit output-format/protocol
reliability row. The row points to the `output-format sanity` evidence gate and
records that diff-style patch hunks are not natural-language prose failures.

Also corrected `scripts/summarize_tse_current_evidence.py` so the Qwen14
historical fixed0 section no longer implies that the `n=5` block is the
reportable larger-backbone result; the fixed-seed `n=10` block is the reportable
one, while `n=5` is provenance/sensitivity evidence.

Fresh seed7403 partial fixed0 format audit:

- SFT: `141` files, `86.52%` java-like, `0.00%` prose-like, `0` empty.
- PAFT w=1.5: `135` files, `96.30%` java-like, `0.00%` prose-like, `0` empty.
- PAFT w=2.0: `197` files, `95.43%` java-like, `0.00%` prose-like, `0` empty.

Live status snapshot:

- `analysis_outputs/d4j_qwen14_seed7403_live_status.md`
- Base: `3710/3710` JSON files and `371/371` bug-level validation results.
- SFT: `1408/3710` JSON files and `2/371` bug-level validation results.
- PAFT w=1.5: `1344/3710` JSON files and `2/371` bug-level validation results.
- PAFT w=2.0: `1964/3710` JSON files and `2/371` bug-level validation results.

Verification:

- `python3 scripts/check_d4j_output_format.py --root defects4j/results --fixed fixed0 ...`
- `python3 scripts/check_tse_evidence_artifacts.py`
- `python3 scripts/summarize_seed7403_status.py`
- `python3 scripts/summarize_tse_current_evidence.py`
- `bash scripts/check_tse_ready.sh`

## 2026-07-04 17:34 local continuation

- Local GPUs occupied by Qwen14 D4J seed7403 generation: SFT and PAFT w=1.5 running; PAFT w=2.0 queued in wait-anygpu screen.
- Refreshed live status: analysis_outputs/d4j_qwen14_seed7403_live_status.md.
- Refreshed partial fixed0 output-format audit: analysis_outputs/d4j_qwen14_seed7403_partial_fixed0_format_20260704.csv.

## 2026-07-04 17:44 manuscript/evidence update

- Added appendix-only Multi-SWE Java smoke10 generator diagnostic to tse-paper/10.appendix.tex.
- Updated setup/discussion/threats to state this is a generator-level diagnostic, not official Multi-SWE pass/fail or system-level SOTA.
- Verified with bash scripts/check_tse_ready.sh; output: analysis_outputs/logs/check_tse_ready_after_artifact_final_20260704_174343.log.

## 2026-07-04 17:46 validation scheduling fix

- Replaced seed7403 validation watcher v2 with v3 so D4J validation waits for all four generation rows to complete before consuming CPU.
- Active watcher: analysis_outputs/logs/watch_validate_d4j_qwen14_oldrecipe_n10_seed7403_v3_20260704.sh.
- Updated fixed-seed manifest and artifact checker; verified with scripts/check_tse_evidence_artifacts.py and scripts/check_tse_ready.sh.

## 2026-07-04 17:51 manuscript citation and local GPU audit

- Added the Multi-SWE-bench citation to the setup and appendix-only Multi-SWE Java generator diagnostic in `tse-paper/4.experimental_setup.tex` and `tse-paper/10.appendix.tex`.
- Verified citation/claim/evidence gates:
  - `python3 scripts/check_tse_claim_hygiene.py`
  - `python3 scripts/check_tse_evidence_artifacts.py`
  - `python3 scripts/check_tse_citations.py`
  - `bash scripts/check_tse_ready.sh`
- Readiness log: `analysis_outputs/logs/check_tse_ready_after_multiswe_citation_20260704_175101.log`.
- Local GPUs remain occupied by seed7403 generation. Snapshot: Base `3710/3710`; SFT `1688/3710`; PAFT `w=1.5` `1808/3710`; PAFT `w=2.0` `1968/3710`.
- `d4j_qwen14_w2_n10_s7403_wait_anygpu` remains queued and will resume automatically when SFT or `w=1.5` releases a GPU.

## 2026-07-04 17:54 no-op scope clarification

- Updated the TSE side-effect table so DS-Coder no-op is explicitly first-sample (`fixed0/371`) and Qwen2.5-Coder-14B no-op is explicitly all-candidate (`all/3710`).
- Synchronized `scripts/audit_tse_paper_numbers.py` with the new no-op count/percentage check instead of the old fixed0 pass-number check.
- Verified:
  - `python3 scripts/audit_tse_paper_numbers.py`
  - `python3 scripts/check_tse_claim_hygiene.py`
  - `python3 scripts/check_tse_evidence_artifacts.py`
  - `bash scripts/check_tse_ready.sh`
- Readiness log: `analysis_outputs/logs/check_tse_ready_after_noop_scope_20260704_175433.log`.

## 2026-07-04 17:57 appendix transparency updates

- Added the completed Qwen2.5-Coder-14B HumanEvalPack-Python `w_align=2.0` row to the appendix table and updated the text to state that `w=1.5` remains the preferred Python operating point.
- Updated the Multi-SWE smoke10 appendix table to show patch-text AED as `Avg. AED (n)` because AED is computed only on rows where generated and gold file sets allow text comparison.
- Extended `scripts/audit_tse_paper_numbers.py` to audit the Qwen14 HumanEvalPack-Python `w=2.0` row and Multi-SWE AED sample counts.
- Verified:
  - `python3 scripts/audit_tse_paper_numbers.py`
  - `python3 scripts/check_tse_claim_hygiene.py`
  - `python3 scripts/check_tse_citations.py`
  - `python3 scripts/check_tse_evidence_artifacts.py`
  - `bash scripts/check_tse_ready.sh`
- Readiness log: `analysis_outputs/logs/check_tse_ready_after_multiswe_aedn_20260704_175728.log`.

## 2026-07-04 17:58 seed7403 partial output-format refresh

- Refreshed `analysis_outputs/d4j_qwen14_seed7403_partial_fixed0_format_20260704.csv` while generation continues.
- Current fixed0 prefix audit:
  - SFT: `178` files, `88.2%` Java-like, `0.0%` prose-like, `0` empty.
  - PAFT `w=1.5`: `193` files, `96.9%` Java-like, `0.0%` prose-like, `0` empty.
  - PAFT `w=2.0`: `197` files, `95.4%` Java-like, `0.0%` prose-like, `0` empty.
- `python3 scripts/check_tse_evidence_artifacts.py` remains OK.

## 2026-07-04 18:00 Multi-SWE multi-file count correction

- Corrected the Multi-SWE smoke10 description in `scripts/summarize_tse_current_evidence.py` and `analysis_outputs/tse_reviewer_concern_resolution_matrix.md`: the smoke set contains `6` tasks with multi-file gold patches (`4` two-file and `2` three-plus-file), not two multi-file tasks.
- Regenerated `analysis_outputs/tse_current_evidence_summary.md`.
- Verified:
  - `python3 scripts/audit_tse_paper_numbers.py`
  - `python3 scripts/check_tse_claim_hygiene.py`
  - `python3 scripts/check_tse_evidence_artifacts.py`
  - `bash scripts/check_tse_ready.sh`
- Readiness log: `analysis_outputs/logs/check_tse_ready_after_multiswe_multifile_count_20260704_175958.log`.

## 2026-07-04 18:29 local one-GPU continuation

- Switched local execution to a one-GPU policy per user instruction.
- Kept the active SFT seed7403 generation running on GPU1; released GPU0 by stopping the in-progress PAFT `w=1.5` generation. Existing JSON outputs are preserved for later resume.
- Stopped the old wait-anygpu PAFT `w=2.0` and Multi-SWE runnable89 queues so they do not automatically occupy the second local GPU.
- Added and launched `analysis_outputs/logs/run_local_onegpu_qwen14_followup_20260704.sh` in screen `local_onegpu_qwen14_followup`.
- New queue behavior: wait for SFT completion, then resume PAFT `w=2.0`, resume PAFT `w=1.5`, and finally run Multi-SWE runnable89, all serially on one local GPU.
- Snapshot after switch: SFT `2144/3710`, PAFT `w=1.5` `2552/3710`, PAFT `w=2.0` `1968/3710`; GPU0 idle, GPU1 active.

## 2026-07-04 18:31 local one-GPU evidence refresh

- Added the one-GPU continuation launcher to the fixed-seed manifest and evidence checker so it is auditable for both D4J seed `7403` and Multi-SWE seed `7401`.
- Regenerated `analysis_outputs/tse_fixed_seed_manifest.md`, `analysis_outputs/tse_evidence_artifact_check.md`, and `analysis_outputs/tse_current_evidence_summary.md`.
- Refreshed `analysis_outputs/d4j_qwen14_seed7403_partial_allfixed_format_20260704.csv`.
- Current all-candidate format audit: SFT `2176` files, `88.79%` Java-like, `0` prose/empty; PAFT `w=1.5` `2552` files, `97.53%` Java-like, `0` prose/empty; PAFT `w=2.0` `1968` files, `95.58%` Java-like, `0` prose/empty.
- Live seed7403 progress: Base `3710/3710`, SFT `2176/3710`, PAFT `w=1.5` `2552/3710`, PAFT `w=2.0` `1968/3710`.

## 2026-07-04 18:32 live-status screen visibility fix

- Updated `scripts/summarize_seed7403_status.py` so `analysis_outputs/d4j_qwen14_seed7403_live_status.md` includes `local_onegpu_qwen14_followup` and `seed7403_status_refresh`, not only `d4j_qwen14_*` screens.
- Refreshed live status after the change. Snapshot: Base `3710/3710`, SFT `2184/3710`, PAFT `w=1.5` `2552/3710`, PAFT `w=2.0` `1968/3710`; GPU0 idle, GPU1 active.
- Verified with `bash scripts/check_tse_ready.sh`; readiness log: `analysis_outputs/logs/check_tse_ready_after_seed7403_status_screen_fix_20260704_183248.log`.

## 2026-07-04 18:33 partial audit refresh

- Refreshed `analysis_outputs/d4j_qwen14_seed7403_partial_allfixed_format_20260704.csv` and regenerated the evidence summary while SFT continues.
- Current all-candidate format audit: SFT `2197` files, `88.89%` Java-like, `0` prose/empty; PAFT `w=1.5` `2552` files, `97.53%` Java-like, `0` prose/empty; PAFT `w=2.0` `1968` files, `95.58%` Java-like, `0` prose/empty.
- Live seed7403 progress at refresh: Base `3710/3710`, SFT `2200/3710`, PAFT `w=1.5` `2552/3710`, PAFT `w=2.0` `1968/3710`.

## 2026-07-04 18:34 partial audit refresh

- Refreshed `analysis_outputs/d4j_qwen14_seed7403_partial_allfixed_format_20260704.csv` and regenerated evidence summaries.
- Current all-candidate format audit: SFT `2208` files, `88.95%` Java-like, `0` prose/empty; PAFT `w=1.5` `2552` files, `97.53%` Java-like, `0` prose/empty; PAFT `w=2.0` `1968` files, `95.58%` Java-like, `0` prose/empty.
- Live seed7403 progress at refresh: Base `3710/3710`, SFT `2208/3710`, PAFT `w=1.5` `2552/3710`, PAFT `w=2.0` `1968/3710`.
- Single-GPU policy remains active: GPU1 runs SFT; GPU0 is idle; `local_onegpu_qwen14_followup` waits for SFT completion before resuming PAFT and Multi-SWE.

## 2026-07-04 18:36 one-GPU queue hardening

- Hardened `analysis_outputs/logs/run_local_onegpu_qwen14_followup_20260704.sh`: the queue now checks SFT JSON completion (`3710/3710`) before moving to PAFT, and if the SFT screen exits early it will resume SFT on the single local GPU instead of silently continuing.
- Restarted screen `local_onegpu_qwen14_followup` so the new logic is active. Latest queue log shows `waiting for active SFT generation: 2224/3710`.
- Refreshed `analysis_outputs/d4j_qwen14_seed7403_partial_allfixed_format_20260704.csv` and evidence summaries.
- Current all-candidate format audit: SFT `2224` files, `89.03%` Java-like, `0` prose/empty; PAFT `w=1.5` `2552` files, `97.53%` Java-like, `0` prose/empty; PAFT `w=2.0` `1968` files, `95.58%` Java-like, `0` prose/empty.
- Live seed7403 progress: Base `3710/3710`, SFT `2224/3710`, PAFT `w=1.5` `2552/3710`, PAFT `w=2.0` `1968/3710`.

## 2026-07-04 18:36 partial audit refresh

- Refreshed `analysis_outputs/d4j_qwen14_seed7403_partial_allfixed_format_20260704.csv` and regenerated evidence summaries while SFT continues.
- Current all-candidate format audit: SFT `2240` files, `89.11%` Java-like, `0` prose/empty; PAFT `w=1.5` `2552` files, `97.53%` Java-like, `0` prose/empty; PAFT `w=2.0` `1968` files, `95.58%` Java-like, `0` prose/empty.
- Live seed7403 progress at refresh: Base `3710/3710`, SFT `2240/3710`, PAFT `w=1.5` `2552/3710`, PAFT `w=2.0` `1968/3710`; GPU1 active, GPU0 idle under the one-GPU policy.

## 2026-07-04 18:37 partial audit refresh

- Refreshed `analysis_outputs/d4j_qwen14_seed7403_partial_allfixed_format_20260704.csv` and regenerated evidence summaries.
- Current all-candidate format audit: SFT `2248` files, `89.15%` Java-like, `0` prose/empty; PAFT `w=1.5` `2552` files, `97.53%` Java-like, `0` prose/empty; PAFT `w=2.0` `1968` files, `95.58%` Java-like, `0` prose/empty.
- Live seed7403 progress at refresh: Base `3710/3710`, SFT `2248/3710`, PAFT `w=1.5` `2552/3710`, PAFT `w=2.0` `1968/3710`.

## 2026-07-04 18:39 validation watcher hardening

- Hardened `analysis_outputs/logs/watch_validate_d4j_qwen14_oldrecipe_n10_seed7403_v3_20260704.sh` so its active-generation check includes `local_onegpu_qwen14_followup`.
- Added a validation-cache backup step for incomplete models: before final validation, existing partial `fixed0/*.json.result` and `fixed0/*.json.log` files will be moved to `analysis_outputs/seed7403_incomplete_validation_cache_backup/<model>/` instead of being reused by `test_d4j.py`.
- Restarted screen `d4j_qwen14_n10_s7403_validate_watch_v3`; new watcher log starts at `2026-07-04 18:38:59`.
- Refreshed `analysis_outputs/d4j_qwen14_seed7403_partial_allfixed_format_20260704.csv` and evidence summaries.
- Current all-candidate format audit: SFT `2264` files, `89.22%` Java-like, `0` prose/empty; PAFT `w=1.5` `2552` files, `97.53%` Java-like, `0` prose/empty; PAFT `w=2.0` `1968` files, `95.58%` Java-like, `0` prose/empty.
- Live seed7403 progress: Base `3710/3710`, SFT `2264/3710`, PAFT `w=1.5` `2552/3710`, PAFT `w=2.0` `1968/3710`.

## 2026-07-04 18:40 partial audit refresh

- Refreshed `analysis_outputs/d4j_qwen14_seed7403_partial_allfixed_format_20260704.csv` and regenerated evidence summaries.
- Current all-candidate format audit: SFT `2272` files, `89.26%` Java-like, `0` prose/empty; PAFT `w=1.5` `2552` files, `97.53%` Java-like, `0` prose/empty; PAFT `w=2.0` `1968` files, `95.58%` Java-like, `0` prose/empty.
- Live seed7403 progress: Base `3710/3710`, SFT `2272/3710`, PAFT `w=1.5` `2552/3710`, PAFT `w=2.0` `1968/3710`.

## 2026-07-04 18:41 evidence checker hardening

- Hardened `scripts/check_tse_evidence_artifacts.py` so the `fixed-seed reproducibility` check now verifies both:
  - `run_local_onegpu_qwen14_followup_20260704.sh` has the SFT completeness/resume guard.
  - `watch_validate_d4j_qwen14_oldrecipe_n10_seed7403_v3_20260704.sh` recognizes `local_onegpu_qwen14_followup` and backs up incomplete validation caches.
- Regenerated `analysis_outputs/tse_evidence_artifact_check.md`; the fixed-seed row now reports `one-GPU queue hardened=True` and `validation watcher hardened=True`.
- Refreshed `analysis_outputs/d4j_qwen14_seed7403_partial_allfixed_format_20260704.csv` and evidence summaries.
- Current all-candidate format audit: SFT `2288` files, `89.34%` Java-like, `0` prose/empty; PAFT `w=1.5` `2552` files, `97.53%` Java-like, `0` prose/empty; PAFT `w=2.0` `1968` files, `95.58%` Java-like, `0` prose/empty.
- Live seed7403 progress: Base `3710/3710`, SFT `2288/3710`, PAFT `w=1.5` `2552/3710`, PAFT `w=2.0` `1968/3710`.

## 2026-07-04 18:42 partial audit refresh

- Refreshed `analysis_outputs/d4j_qwen14_seed7403_partial_allfixed_format_20260704.csv` and regenerated evidence summaries.
- Current all-candidate format audit: SFT `2296` files, `89.37%` Java-like, `0` prose/empty; PAFT `w=1.5` `2552` files, `97.53%` Java-like, `0` prose/empty; PAFT `w=2.0` `1968` files, `95.58%` Java-like, `0` prose/empty.
- Fixed-seed evidence checker remains OK with `one-GPU queue hardened=True` and `validation watcher hardened=True`.
- Live seed7403 progress: Base `3710/3710`, SFT `2296/3710`, PAFT `w=1.5` `2552/3710`, PAFT `w=2.0` `1968/3710`.

## 2026-07-04 18:43 partial audit refresh

- Refreshed `analysis_outputs/d4j_qwen14_seed7403_partial_allfixed_format_20260704.csv` and regenerated evidence summaries.
- Current all-candidate format audit: SFT `2304` files, `89.41%` Java-like, `0` prose/empty; PAFT `w=1.5` `2552` files, `97.53%` Java-like, `0` prose/empty; PAFT `w=2.0` `1968` files, `95.58%` Java-like, `0` prose/empty.
- Fixed-seed evidence checker remains OK with `one-GPU queue hardened=True` and `validation watcher hardened=True`.

## 2026-07-04 18:43 fixed-seed wording scan and partial audit refresh

- Refreshed live status while generation continues. SFT reached `2312/3710`; GPU1 remains active and GPU0 remains idle.
- Scanned `tse-paper/`, `paper/`, `analysis_outputs/`, and `scripts/` for multi-seed/std/SOTA/frontier/system-level wording. Current TSE manuscript wording stays scoped to fixed-seed diagnostics, out-of-class frontier references, and no system-level APR SOTA claim. Multi-seed hits are from old experiment logs/scripts and are not current manuscript claims.
- Refreshed `analysis_outputs/d4j_qwen14_seed7403_partial_allfixed_format_20260704.csv` and regenerated evidence summaries.
- Current all-candidate format audit: SFT `2304` files, `89.41%` Java-like, `0` prose/empty; PAFT `w=1.5` `2552` files, `97.53%` Java-like, `0` prose/empty; PAFT `w=2.0` `1968` files, `95.58%` Java-like, `0` prose/empty.
- Fixed-seed evidence checker remains OK with `one-GPU queue hardened=True` and `validation watcher hardened=True`.

## 2026-07-04 18:45 one-GPU continuation check

- Confirmed the one-GPU policy remains active: GPU1 is running SFT seed7403 generation (`~41.2GB`, `~80%` utilization) and GPU0 is idle (`~1.9GB`, `P8`).
- Active screens: `d4j_qwen14_sft_only_n10_s7403_gpu1`, `local_onegpu_qwen14_followup`, `d4j_qwen14_n10_s7403_validate_watch_v3`, and `seed7403_status_refresh`.
- Live seed7403 progress: Base `3710/3710`, SFT `2336/3710`, PAFT `w=1.5` `2552/3710`, PAFT `w=2.0` `1968/3710`.
- The follow-up queue is still waiting for SFT to reach `3710/3710`; it will then resume PAFT `w=2.0`, PAFT `w=1.5`, and Multi-SWE runnable89 serially on one local GPU.
- Readiness gate still passes; log: `analysis_outputs/logs/check_tse_ready_after_onegpu_continuation_check_20260704_184558.log`.

## 2026-07-04 18:47 partial audit refresh

- Refreshed `analysis_outputs/d4j_qwen14_seed7403_partial_allfixed_format_20260704.csv`, `analysis_outputs/tse_evidence_artifact_check.md`, and `analysis_outputs/tse_current_evidence_summary.md` while SFT seed7403 continues.
- Current all-candidate format audit: SFT `2368` files, `89.70%` Java-like, `0` prose/empty; PAFT `w=1.5` `2552` files, `97.53%` Java-like, `0` prose/empty; PAFT `w=2.0` `1968` files, `95.58%` Java-like, `0` prose/empty.
- Live seed7403 progress at refresh: Base `3710/3710`, SFT `2368/3710`, PAFT `w=1.5` `2552/3710`, PAFT `w=2.0` `1968/3710`.
- The one-GPU queue does not need repair: it is waiting for SFT completion and GPU1 remains the only active local experiment GPU.
- Readiness gate still passes; log: `analysis_outputs/logs/check_tse_ready_after_partial_audit_refresh8_20260704_184723.log`.

## 2026-07-04 18:48 partial audit refresh

- Refreshed `analysis_outputs/d4j_qwen14_seed7403_partial_allfixed_format_20260704.csv`, `analysis_outputs/tse_evidence_artifact_check.md`, `analysis_outputs/tse_current_evidence_summary.md`, and `analysis_outputs/d4j_qwen14_seed7403_live_status.md`.
- Current all-candidate format audit: SFT `2376` files, `89.73%` Java-like, `0` prose/empty; PAFT `w=1.5` `2552` files, `97.53%` Java-like, `0` prose/empty; PAFT `w=2.0` `1968` files, `95.58%` Java-like, `0` prose/empty.
- Live seed7403 progress: Base `3710/3710`, SFT `2376/3710`, PAFT `w=1.5` `2552/3710`, PAFT `w=2.0` `1968/3710`.
- One-GPU queue health is normal: `local_onegpu_qwen14_followup` is still waiting for SFT completion; GPU1 is active, GPU0 is not running an experiment.
- Readiness gate still passes; log: `analysis_outputs/logs/check_tse_ready_after_partial_audit_refresh9_20260704_184821.log`.

## 2026-07-04 18:49 status-loop hardening

- Hardened `analysis_outputs/logs/refresh_seed7403_live_status_loop_20260704.sh` so the background refresh loop now updates both fixed0 and all-candidate format audits, then regenerates `analysis_outputs/tse_evidence_artifact_check.md` and `analysis_outputs/tse_current_evidence_summary.md`.
- Restarted screen `seed7403_status_refresh` with the hardened loop; active screen id is `2600967.seed7403_status_refresh`.
- Automatic refresh confirmed by timestamps on:
  - `analysis_outputs/d4j_qwen14_seed7403_partial_allfixed_format_20260704.csv`
  - `analysis_outputs/tse_evidence_artifact_check.md`
  - `analysis_outputs/tse_current_evidence_summary.md`
- Current all-candidate format audit after the automatic refresh: SFT `2399` files, `89.83%` Java-like, `0` prose/empty; PAFT `w=1.5` `2552` files, `97.53%` Java-like, `0` prose/empty; PAFT `w=2.0` `1968` files, `95.58%` Java-like, `0` prose/empty.
- Live seed7403 status at loop restart: Base `3710/3710`, SFT `2392/3710`, PAFT `w=1.5` `2552/3710`, PAFT `w=2.0` `1968/3710`; GPU1 remains the only active experiment GPU.
- Readiness gate still passes; log: `analysis_outputs/logs/check_tse_ready_after_status_loop_harden_20260704_184929.log`.

## 2026-07-04 18:50 progress and ETA check

- Refreshed live status and all-candidate format audit manually after the hardened background loop started.
- Live seed7403 progress: Base `3710/3710`, SFT `2408/3710`, PAFT `w=1.5` `2552/3710`, PAFT `w=2.0` `1968/3710`.
- Current all-candidate format audit: SFT `2408` files, `89.87%` Java-like, `0` prose/empty; PAFT `w=1.5` `2552` files, `97.53%` Java-like, `0` prose/empty; PAFT `w=2.0` `1968` files, `95.58%` Java-like, `0` prose/empty.
- Recent SFT generation rate is roughly `12-13` candidates/minute from the one-GPU switch point (`2144` at `18:29` to `2408` at `18:50`). At that observed rate, SFT has about `100-110` minutes remaining before the queue can start PAFT `w=2.0`.
- Queue health remains normal: `d4j_qwen14_sft_only_n10_s7403_gpu1` is active on GPU1, `local_onegpu_qwen14_followup` is waiting for SFT completion, and GPU0 is not running an experiment.
- Readiness gate still passes; log: `analysis_outputs/logs/check_tse_ready_after_eta_status_20260704_185107.log`.

## 2026-07-04 18:52 live-status ETA and format audit

- Enhanced `scripts/summarize_seed7403_status.py` so `analysis_outputs/d4j_qwen14_seed7403_live_status.md` now includes:
  - an active-queue ETA based on the one-GPU queue log,
  - queue order after SFT completion,
  - all-candidate format audit totals from `analysis_outputs/d4j_qwen14_seed7403_partial_allfixed_format_20260704.csv`.
- Reordered `analysis_outputs/logs/refresh_seed7403_live_status_loop_20260704.sh` so it refreshes fixed0 and all-candidate format audits before regenerating the live status file. This avoids stale format totals in the live status.
- Restarted `seed7403_status_refresh`; active screen id is now `2629003.seed7403_status_refresh`.
- Current live status: Base `3710/3710`, SFT `2440/3710`, PAFT `w=1.5` `2552/3710`, PAFT `w=2.0` `1968/3710`.
- Current ETA for SFT completion is about `98.3` minutes at `12.92` candidates/minute, using the interval `2224` at `18:35:50` to `2440` at `18:52:32`.
- Current all-candidate format audit in live status: SFT `2440` files, `89.59%` Java-like, `0` prose/empty; PAFT `w=1.5` `2552` files, `97.53%` Java-like, `0` prose/empty; PAFT `w=2.0` `1968` files, `95.58%` Java-like, `0` prose/empty.
- Readiness gate still passes; log: `analysis_outputs/logs/check_tse_ready_after_live_status_eta_20260704_185244.log`.

## 2026-07-04 18:53 synchronized live-status refresh

- Refreshed all-candidate format audit first, then regenerated `analysis_outputs/d4j_qwen14_seed7403_live_status.md`, `analysis_outputs/tse_evidence_artifact_check.md`, and `analysis_outputs/tse_current_evidence_summary.md`.
- Live seed7403 progress: Base `3710/3710`, SFT `2456/3710`, PAFT `w=1.5` `2552/3710`, PAFT `w=2.0` `1968/3710`.
- Current all-candidate format audit in live status: SFT `2456` files, `89.66%` Java-like, `0` prose/empty; PAFT `w=1.5` `2552` files, `97.53%` Java-like, `0` prose/empty; PAFT `w=2.0` `1968` files, `95.58%` Java-like, `0` prose/empty.
- ETA for SFT completion is about `96.6` minutes at the observed rate of `12.97` candidates/minute.
- Queue health remains normal: only GPU1 is running the SFT job, and `local_onegpu_qwen14_followup` is waiting to continue PAFT `w=2.0`, PAFT `w=1.5`, and Multi-SWE runnable89.
- Readiness gate still passes; log: `analysis_outputs/logs/check_tse_ready_after_seed7403_refresh_20260704_185349.log`.

## 2026-07-04 18:54 local GPU process audit

- Confirmed the active generation process is `python3 scripts/remote_generate_d4j_vllm.py` under screen `d4j_qwen14_sft_only_n10_s7403_gpu1`.
- The active command uses adapter `/home/barty/research/morepair/models/qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620`, result tag `qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620-d4j-n10-s7403`, prompt style `java_plain`, extract profile `historical_strict`, and seed `7403`.
- Process environment confirms `CUDA_VISIBLE_DEVICES=1`, so the SFT job is pinned to local GPU1. GPU0 shows low background memory/utilization but is not running a PAFT experiment process.
- Live seed7403 progress at audit: Base `3710/3710`, SFT `2464/3710`, PAFT `w=1.5` `2552/3710`, PAFT `w=2.0` `1968/3710`.
- Readiness gate still passes; log: `analysis_outputs/logs/check_tse_ready_after_gpu_process_audit_20260704_185505.log`.

## 2026-07-04 18:56 live-status lag guard

- Updated `scripts/summarize_seed7403_status.py` so the live all-candidate format table now includes `Lag vs JSON`. This catches the common case where generation advances after the last format-audit refresh.
- Refreshed all-candidate format audit, evidence summaries, and live status after the change.
- Live seed7403 progress: Base `3710/3710`, SFT `2496/3710`, PAFT `w=1.5` `2552/3710`, PAFT `w=2.0` `1968/3710`.
- Current all-candidate format audit in live status: SFT `2496` files, `89.82%` Java-like, lag `+0`; PAFT `w=1.5` `2552` files, `97.53%` Java-like, lag `+0`; PAFT `w=2.0` `1968` files, `95.58%` Java-like, lag `+0`; all have `0` prose/empty.
- ETA for SFT completion is about `90.0` minutes at `13.48` candidates/minute.
- Readiness gate still passes; log: `analysis_outputs/logs/check_tse_ready_after_live_status_lag_20260704_185607.log`.

## 2026-07-04 18:57 validation cache length guard

- Hardened `analysis_outputs/logs/watch_validate_d4j_qwen14_oldrecipe_n10_seed7403_v3_20260704.sh` against stale D4J validation caches:
  - `bug_results_complete_for_model` now checks both `371` result files and exactly `10` patch results per bug before skipping validation.
  - `backup_incomplete_validation_cache` now moves stale `*.json.result`, `*.json.judgelog`, `*.judgelog`, and legacy `*.json.log` files into `analysis_outputs/seed7403_incomplete_validation_cache_backup/<model>/`.
- Updated `scripts/check_tse_evidence_artifacts.py` so the fixed-seed reproducibility check verifies the new cache-length guard and judgelog backup behavior.
- Restarted `d4j_qwen14_n10_s7403_validate_watch_v3` before validation begins; active screen id is `2661957.d4j_qwen14_n10_s7403_validate_watch_v3`.
- Refreshed live status and all-candidate audit: Base `3710/3710`, SFT `2512/3710`, PAFT `w=1.5` `2552/3710`, PAFT `w=2.0` `1968/3710`; all format-audit lags are `+0`.
- Current all-candidate format audit: SFT `2512` files, `89.89%` Java-like, `0` prose/empty; PAFT `w=1.5` `2552` files, `97.53%` Java-like, `0` prose/empty; PAFT `w=2.0` `1968` files, `95.58%` Java-like, `0` prose/empty.
- Evidence checker reports `fixed-seed reproducibility` as OK with `validation watcher hardened=True` and `status loop hardened=True`.
- Readiness gate still passes; log: `analysis_outputs/logs/check_tse_ready_after_validation_cache_length_guard_20260704_185754.log`.

## 2026-07-04 18:59 one-GPU queue pinning

- Hardened `analysis_outputs/logs/run_local_onegpu_qwen14_followup_20260704.sh` so follow-up stages are pinned to a single local GPU through `single_gpu="${LOCAL_SINGLE_GPU:-1}"` instead of selecting any free GPU. This avoids switching from GPU1 to GPU0 after SFT and makes the one-GPU policy directly auditable.
- Updated `scripts/check_tse_evidence_artifacts.py` so `fixed-seed reproducibility` verifies the queue's pinned-GPU guard (`waiting for pinned local GPU`).
- Restarted screen `local_onegpu_qwen14_followup`; active screen id is `2669733.local_onegpu_qwen14_followup`. The SFT generation process itself was not restarted.
- Refreshed live status and all-candidate audit: Base `3710/3710`, SFT `2536/3710`, PAFT `w=1.5` `2552/3710`, PAFT `w=2.0` `1968/3710`; all format-audit lags are `+0`.
- Current all-candidate format audit: SFT `2536` files, `89.59%` Java-like, `0` prose/empty; PAFT `w=1.5` `2552` files, `97.53%` Java-like, `0` prose/empty; PAFT `w=2.0` `1968` files, `95.58%` Java-like, `0` prose/empty.
- SFT ETA is about `89.0` minutes at `13.19` candidates/minute.
- Readiness gate still passes; log: `analysis_outputs/logs/check_tse_ready_after_onegpu_pin_20260704_185933.log`.

## 2026-07-04 19:00 live-run evidence summary hook

- Updated `scripts/summarize_tse_current_evidence.py` so `analysis_outputs/tse_current_evidence_summary.md` now points directly to the seed7403 live status artifact and describes the two run-safety guards:
  - `analysis_outputs/logs/run_local_onegpu_qwen14_followup_20260704.sh` pins follow-up stages to one local GPU through `LOCAL_SINGLE_GPU`.
  - `analysis_outputs/logs/watch_validate_d4j_qwen14_oldrecipe_n10_seed7403_v3_20260704.sh` checks cached result length before reusing `.json.result` validation files.
- The summary now also reports the live ETA from `analysis_outputs/d4j_qwen14_seed7403_live_status.json`.
- At regeneration time, live seed7403 progress was Base `3710/3710`, SFT `2544/3710`, PAFT `w=1.5` `2552/3710`, PAFT `w=2.0` `1968/3710`.
- Current summary notes SFT ETA at about `89.2` minutes, with the all-candidate format audit still serving only as running generation-format sanity evidence.
- Readiness gate still passes; log: `analysis_outputs/logs/check_tse_ready_after_live_run_summary_20260704_190057.log`.

## 2026-07-04 19:05 local one-GPU continuation

- Confirmed the local continuation is still restricted to one experiment GPU: the active SFT generation job is running on GPU1, while GPU0 is not used by the experiment queue.
- Live seed7403 progress after synchronized refresh: Base `3710/3710`, SFT `2600/3710`, PAFT `w=1.5` `2552/3710`, PAFT `w=2.0` `1968/3710`.
- SFT advanced from `2576/3710` to `2600/3710` over the two-minute monitor window, confirming forward progress.
- Current all-candidate format audit has lag `+0`: SFT `2600` files, `89.85%` Java-like, `0` prose/empty; PAFT `w=1.5` `2552` files, `97.53%` Java-like, `0` prose/empty; PAFT `w=2.0` `1968` files, `95.58%` Java-like, `0` prose/empty.
- Active queue ETA estimates about `88.1` minutes to finish SFT, then the pinned one-GPU queue will run PAFT `w=2.0`, PAFT `w=1.5`, and Multi-SWE runnable89.
- Readiness gate still passes; log: `analysis_outputs/logs/check_tse_ready_after_local_onegpu_continue_20260704_190600.log`.

## 2026-07-04 19:16 fixed-seed convergence decision

- Stopped all local seed7403-related screens and the queued follow-up jobs after deciding not to pursue repeated-seed robustness. `screen -ls` reports no sockets; GPU1 memory returned to `0` MiB.
- The paper-facing path is now fixed-seed reproducibility: Qwen2.5-Coder-14B Defects4J seed `7401`, `n=10`, is the reportable larger-backbone result.
- Updated `scripts/tse_fixed_seed_manifest.py`, `scripts/summarize_tse_current_evidence.py`, `scripts/check_tse_evidence_artifacts.py`, and `scripts/check_tse_ready.sh` so regenerated paper-facing artifacts no longer list seed7403 or runnable89 as running evidence.
- Regenerated `analysis_outputs/tse_fixed_seed_manifest.md`, `analysis_outputs/tse_evidence_artifact_check.md`, and `analysis_outputs/tse_current_evidence_summary.md`. The evidence checker reports `Overall status: OK`.
- Readiness gate still passes; log: `analysis_outputs/logs/check_tse_ready_after_fixed_seed_convergence_20260704_191612.log`.
