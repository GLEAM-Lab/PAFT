# TSE Current Evidence Summary

- Fixed-seed provenance is recorded in `analysis_outputs/tse_fixed_seed_manifest.md`. Report these as fixed-seed diagnostics, not repeated-seed robustness claims.

- Reviewer-facing evidence gates are audited in `analysis_outputs/tse_evidence_artifact_check.md` (larger backbone, frontier prompting/common-plausible caution, stable-region edits, no-op, leakage, Multi-SWE, system-level APR scope, attribution/curriculum scope, cross-language, and fixed-seed reproducibility).

## Reportable Main Evidence

- **Defects4J / OpenCoder-8B**: PAFT improves pass@1 over both Base and SFT while sharply reducing AED. This is the cleanest new cross-backbone result.

| Model | pass@1 | Avg./Med. AED | Avg./Med. CCR | no-op |
|---|---:|---:|---:|---:|
| opencoder8b | 7.28 | 169.63/89.00 | 74.70/83.33 | 0.27 |
| opencoder8b-sft | 7.82 | 143.93/81.00 | 78.30/88.00 | 3.23 |
| opencoder8b-paft | 10.24 | 45.82/30.50 | 81.29/86.10 | 4.04 |

- **Defects4J / Qwen2.5-Coder-14B historical fixed0 sweep**: this earlier single-candidate audit is kept as sensitivity/provenance evidence only. Use the fixed-seed `n=10` block below as the reportable larger-backbone result; the `n=5` block is retained only as provenance/sensitivity evidence under the same sampled protocol.

| Model | pass@1 | Avg./Med. AED | Avg./Med. CCR | Use |
|---|---:|---:|---:|---|
| qwen2.5coder14b | 20.75 | 202.99/151.00 | 67.87/75.00 | historical fixed0 reference |
| qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620 | 18.06 | 88.40/31.00 | 74.96/85.37 | historical fixed0 SFT |
| qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620 | 22.10 | 73.61/45.50 | 76.43/83.33 | historical fixed0 positive PAFT point |
| qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620 | 18.33 | 76.29/35.50 | 80.50/89.44 | historical fixed0 locality point |
| qwen2.5coder14b-paft-oldrecipe-w125-lr2e4-e3-20260620 | 18.87 | 82.59/38.50 | 74.98/85.71 | historical fixed0 sensitivity point |

- **Defects4J / Qwen2.5-Coder-14B fixed seed 7401 (`n=5`)**: this earlier five-sample block is retained as provenance and sensitivity evidence for the larger-backbone diagnostic. Under the same Qwen14 backbone, prompt, decoding protocol, and sample budget, PAFT improves both correctness and locality over Base and SFT; the completed `n=10` block below is the reportable larger-backbone table. The w=2.0 row gives the strongest pass@1/pass@5, while w=1.5 remains the strongest AED/CCR operating point.

| Model | pass@1 | pass@5 | plausible patches | Avg./Med. AED | Avg./Med. CCR | no-op all |
|---|---:|---:|---:|---:|---:|---:|
| qwen2.5coder14b-d4j-n5-s7401 | 20.32 | 21.02 | 377 | 169.27/123.00 | 70.79/78.26 | 0.54 |
| qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620-d4j-n5-s7401 | 20.43 | 22.91 | 379 | 79.70/34.00 | 74.68/83.33 | 1.46 |
| qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620-d4j-n5-s7401 | 22.10 | 23.72 | 410 | 60.72/26.00 | 80.72/88.89 | 2.75 |
| qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620-d4j-n5-s7401 | 22.91 | 24.26 | 425 | 61.42/34.00 | 80.22/88.89 | 4.64 |

- **Defects4J / Qwen2.5-Coder-14B fixed seed 7401 (`n=10`)**: this completed four-row continuation confirms the larger-backbone trend at the usual ten-candidate budget. Both PAFT settings improve pass@1/pass@5/pass@10 over Base and SFT while reducing AED and improving CCR; w=2.0 gives the strongest correctness, while w=1.5 gives the strongest AED/CCR operating point.

| Model | pass@1 | pass@5 | pass@10 | plausible patches | Avg./Med. AED | Avg./Med. CCR | no-op all |
|---|---:|---:|---:|---:|---:|---:|---:|
| qwen2.5coder14b-d4j-n10-s7401 | 20.38 | 21.01 | 21.02 | 756 | 169.17/123.00 | 70.70/78.26 | 0.54 |
| qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620-d4j-n10-s7401 | 20.24 | 22.78 | 23.72 | 751 | 79.43/34.00 | 74.85/83.33 | 1.43 |
| qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620-d4j-n10-s7401 | 22.16 | 24.13 | 24.80 | 822 | 61.18/26.00 | 80.49/88.89 | 2.70 |
| qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620-d4j-n10-s7401 | 23.05 | 24.63 | 25.07 | 855 | 63.53/34.00 | 79.91/88.89 | 4.61 |

- **Defects4J / Qwen2.5-Coder-14B fixed seed 7402 (`n=10`)**: this follow-up is an internal stress/sensitivity seed, not a replacement for seed7401. Base is unusually weak, so do not use this block as the main larger-backbone result. It is still useful for characterizing the PAFT operating points: w=1.5 improves correctness over SFT and lowers median AED, while w=2.0 gives the strongest locality but loses correctness.

| Model | pass@1 | pass@5 | pass@10 | plausible patches | Avg./Med. AED | Avg./Med. CCR | Use |
|---|---:|---:|---:|---:|---:|---:|---|
| qwen2.5coder14b-d4j-n10-s7402 | 10.46 | 10.51 | 10.51 | 388 | 206.13/158.00 | 65.83/68.42 | internal stress seed |
| qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620-d4j-n10-s7402 | 18.17 | 20.02 | 20.75 | 674 | 64.15/43.00 | 78.84/87.50 | same-seed SFT comparator |
| qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620-d4j-n10-s7402 | 19.49 | 21.51 | 21.83 | 723 | 71.21/39.00 | 71.49/80.00 | correctness-positive vs SFT; median-AED positive |
| qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620-d4j-n10-s7402 | 14.93 | 16.31 | 16.71 | 554 | 47.22/28.00 | 78.78/85.71 | locality-positive, correctness-negative |

### Qwen14 Common-Plausible Audit

- This audit controls for the solved-bug subset when comparing edit locality. It is stronger than comparing AED over each model's own plausible set, but should still be framed as a diagnostic, not a new main benchmark.

| Scope | Model | common bugs | Avg./Med. AED | Avg./Med. CCR |
|---|---|---:|---:|---:|
| common_plausible:Qwen14-SFT+Qwen14-PAFT | Qwen14-SFT | 42 | 52.05/21.00 | 75.40/84.35 |
| common_plausible:Qwen14-SFT+Qwen14-PAFT | Qwen14-PAFT | 42 | 45.93/18.50 | 74.31/84.32 |
| common_plausible:Qwen14-Base+Qwen14-SFT+Qwen14-PAFT | Qwen14-Base | 32 | 179.62/114.50 | 68.35/70.83 |
| common_plausible:Qwen14-Base+Qwen14-SFT+Qwen14-PAFT | Qwen14-SFT | 32 | 48.66/21.00 | 78.20/85.60 |
| common_plausible:Qwen14-Base+Qwen14-SFT+Qwen14-PAFT | Qwen14-PAFT | 32 | 47.31/20.50 | 76.22/86.61 |

### Frontier Common-Plausible Caution

- Qwen3-Max minimal is competitive on common solved bugs, so do **not** claim PAFT beats frontier APIs in edit locality. Safe wording: frontier APIs are out-of-class high-correctness references; minimal-change prompting does not remove edit overhead, and PAFT remains a controllable open/local generator-training method.

| Pair | Model | common bugs | Avg./Med. AED | Avg./Med. CCR |
|---|---|---:|---:|---:|
| Qwen14-Base vs Qwen3-Max-minimal | Qwen14-Base | 57 | 199.07/127.00 | 69.68/75.86 |
| Qwen14-Base vs Qwen3-Max-minimal | Qwen3-Max-minimal | 57 | 58.88/37.00 | 84.51/88.89 |
| Qwen14-SFT vs Qwen3-Max-minimal | Qwen14-SFT | 50 | 71.00/24.50 | 77.68/85.60 |
| Qwen14-SFT vs Qwen3-Max-minimal | Qwen3-Max-minimal | 50 | 67.20/31.00 | 80.76/85.71 |
| Qwen14-PAFT vs Qwen3-Max-minimal | Qwen14-PAFT | 57 | 72.23/45.00 | 75.01/82.93 |
| Qwen14-PAFT vs Qwen3-Max-minimal | Qwen3-Max-minimal | 57 | 76.81/37.00 | 82.71/88.00 |

## Mechanism and Side-Effect Diagnostics

- These diagnostics target the ASE concern that PAFT is a black-box weighting trick or may collapse into copying. They should be framed as empirical mechanism/side-effect evidence, not a formal proof of fault localization.

- **Stable-region edit diagnostic**: for plausible Defects4J patches, `outside_ref` counts generated edited lines outside the reference-changed buggy-line region, and `missed_ref` counts reference-changed lines left untouched. Lower `outside_ref` with stable `missed_ref` supports a learned preservation/localization prior.

| Model | n plausible | outside_ref Avg./Med. | edited lines Avg./Med. | missed_ref Avg./Med. |
|---|---:|---:|---:|---:|
| qwen8b-sft | 377 | 2.62/1.00 | 3.61/2.00 | 0.47/0.00 |
| qwen8b-paft | 483 | 1.51/0.00 | 2.48/1.00 | 0.45/0.00 |
| qwen2.5coder7b | 535 | 2.57/1.00 | 3.61/2.00 | 0.39/0.00 |
| qwen2.5coder7b-paft | 564 | 1.32/0.00 | 2.30/1.00 | 0.46/0.00 |

- **Copy-collapse audit**: normalized-exact no-op outputs are counted under the same Defects4J validation protocol. PAFT has lower no-op rates than Base/SFT, and no PAFT no-op output is plausible.

| Model | pass@1 | fixed0 no-op | all no-op | plausible no-op | Avg./Med. AED |
|---|---:|---:|---:|---:|---:|
| deepseek-6.7b | 5.80 | 92/371 (24.80%) | 933/3710 | 0 | 142.90/113.00 |
| deepseek-6.7b-trained-noprompt | 3.75 | 159/371 (42.86%) | 1191/3710 | 0 | 76.63/44.00 |
| deepseek-6.7b-trained-prorepair | 10.13 | 35/371 (9.43%) | 326/3710 | 0 | 80.66/42.00 |

- **Near-duplicate leakage audit**: normalized token 5-gram Jaccard over train/evaluation buggy and fixed snippets uses 2378 training snippets and 742 evaluation snippets. Max Jaccard is 0.110, with 0 pairs above 0.60. This rules out exact/high lexical near duplicates under the stated normalization, not semantic/template contamination.

## Frontier API Diagnostics

- **Do not use these as PAFT baselines.** They are out-of-class high-correctness references for the reviewer concern that scale plus a minimal-change prompt might eliminate edit overhead. The complete DeepSeek-V3 row is `dashscope-deepseek-v3-minimal-v3`; the direct `deepseek-v3` row is incomplete and should not be used as the main reference.

| Model | result files | pass@1 | Avg./Med. AED | Avg./Med. CCR | Use |
|---|---:|---:|---:|---:|---|
| deepseek-v3 | 333/371 | 35.04 | 160.32/86.50 | 76.26/81.93 | incomplete; do not use main |
| dashscope-deepseek-v3-minimal | 368/371 | 42.59 | 152.16/83.00 | 76.38/83.71 | incomplete; do not use main |
| dashscope-deepseek-v3-minimal-v3 | 371/371 | 45.28 | 106.18/58.00 | 79.45/85.71 | complete DeepSeek-V3 minimal diagnostic |
| qwen3-max | 264/371 | 19.68 | 91.85/60.00 | 78.76/85.71 | incomplete diagnostic |
| qwen3-max-minimal | 371/371 | 31.54 | 99.38/57.00 | 81.01/87.50 | complete frontier diagnostic |

## Cross-Language Evidence

- **QuixBugs-Python / DS-6.7B adapter-direct fixed seed 7106**: PAFT improves pass@1 over Base and SFT-noprompt, and also improves AED/CCR under the fixed-seed protocol. This is usable as a cross-language sanity check, but not as larger-backbone evidence. For the new paper, pass@1 is the primary reported correctness metric.

| Model | seed | pass@1 | Avg./Med. AED | Avg./Med. CCR | No-op first/all |
|---|---:|---:|---:|---:|---:|
| deepseek-6.7b | 7106 | 32.00 | 306.11/284.50 | 59.65/64.58 | 0/0 |
| deepseek-6.7b-trained-noprompt | 7106 | 24.50 | 285.16/269.00 | 56.74/66.67 | 0/0 |
| deepseek-6.7b-trained-prorepair | 7106 | 43.50 | 261.94/250.00 | 75.66/81.82 | 0/0 |

- **QuixBugs-Python / Qwen2.5-Coder-14B fixed seed 7106 (`n=5`)**: PAFT improves over SFT in pass@1, pass@5, resolved tasks, and CCR, while Base remains strongest in raw correctness. Use this as a larger-backbone cross-language sanity check and phrase the result as PAFT-vs-SFT/locality, not as a PAFT-over-Base correctness claim.

| Model | seed | pass@1 | pass@5 | resolved | plausible candidates | Avg./Med. AED | Avg./Med. CCR | No-op first/all |
|---|---:|---:|---:|---:|---:|---:|---:|---:|
| qwen2.5coder14b | 7106 | 65.50 | 87.50 | 35 | 131 | 238.21/129.00 | 84.42/88.89 | 0/0 |
| qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620 | 7106 | 43.00 | 72.50 | 29 | 86 | 134.58/14.00 | 90.11/94.20 | 0/0 |
| qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620 | 7106 | 45.00 | 85.00 | 34 | 90 | 179.00/15.00 | 91.42/94.51 | 0/0 |

- **HumanEvalPack-Python / DS-6.7B fixed seed 7202, 1024-token diagnostic**: PAFT improves over SFT in pass@1 and edit locality, but Base remains stronger in raw pass@1. Use this only as supplementary cross-language evidence for the preservation-aware training objective, not as a PAFT-over-Base claim.

| Model | seed | max tokens | pass@1 | pass@5 | Avg./Med. AED | Avg./Med. CCR | No-op first/all |
|---|---:|---:|---:|---:|---:|---:|---:|
| deepseek-6.7b | 7202 | 1024 | 67.07 | 86.59 | 260.17/192.50 | 58.75/64.40 | 0/1 |
| deepseek-6.7b-trained-prorepair | 7202 | 1024 | 61.83 | 87.20 | 82.79/14.00 | 80.31/88.46 | 3/13 |
| deepseek-6.7b-trained-noprompt | 7202 | 1024 | 37.93 | 81.10 | 152.84/74.00 | 66.33/76.47 | 0/2 |

  Common-plausible audit: among the 118 tasks solved by all three settings, PAFT has lower first-plausible AED and higher CCR than both Base and SFT. This is the safer locality comparison because it controls for solved-task subset differences.

| Scope | Model | common tasks | Avg./Med. AED | Avg./Med. CCR |
|---|---|---:|---:|---:|
| Base+PAFT+SFT | Base | 118 | 289.92/238.00 | 56.19/62.83 |
| Base+PAFT+SFT | PAFT | 118 | 87.35/18.00 | 77.87/88.89 |
| Base+PAFT+SFT | SFT | 118 | 165.81/80.50 | 63.73/71.83 |

- **HumanEvalPack-Python / Qwen2.5-Coder-14B old-recipe fixed seed 7202, 1024-token diagnostic**: Base is strongest in raw pass@1 on this easy function-level Python benchmark. PAFT-w1.5 preserves most of the Base correctness and substantially improves edit locality over both Base and SFT; PAFT-w2 is weaker than w1.5 on pass@1 and median AED, so w1.5 remains the preferred Python operating point. Use this as a larger-backbone locality diagnostic, not as a PAFT-over-Base correctness claim.

| Model | seed | max tokens | pass@1 | pass@5 | Avg./Med. AED | Avg./Med. CCR | No-op first/all |
|---|---:|---:|---:|---:|---:|---:|---:|
| qwen2.5coder14b | 7202 | 1024 | 84.63 | 97.56 | 272.57/221.50 | 56.83/60.00 | 0/0 |
| qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620 | 7202 | 1024 | 31.59 | 70.73 | 212.01/84.00 | 65.81/71.43 | 0/1 |
| qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620 | 7202 | 1024 | 75.61 | 94.51 | 81.86/24.00 | 79.66/87.50 | 2/3 |
| qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620 | 7202 | 1024 | 55.98 | 93.29 | 87.65/48.00 | 80.00/84.62 | 0/2 |

  Qwen14 common-plausible audit: on commonly solved tasks, PAFT variants have much lower first-plausible AED and higher CCR than Base/SFT, which isolates edit locality from solved-task subset differences.

| Scope | Model | common tasks | Avg./Med. AED | Avg./Med. CCR |
|---|---|---:|---:|---:|
| Base+SFT+PAFT-w1.5+PAFT-w2 | Base | 113 | 253.92/186.00 | 55.90/60.00 |
| Base+SFT+PAFT-w1.5+PAFT-w2 | SFT | 113 | 232.89/121.00 | 64.20/70.00 |
| Base+SFT+PAFT-w1.5+PAFT-w2 | PAFT-w1.5 | 113 | 71.09/26.00 | 81.47/86.67 |
| Base+SFT+PAFT-w1.5+PAFT-w2 | PAFT-w2 | 113 | 82.73/48.00 | 81.53/83.33 |

- **HumanEval-Java / Qwen2.5-Coder-14B old-recipe fixed seed 7301**: PAFT improves over the same old-recipe SFT baseline in pass@1, plausible patch count, AED, and CCR. Against Base, PAFT also improves pass@1 while greatly improving locality. This diagnostic generated one candidate per task (`n=1`), so only pass@1 is reported. Use as a supplementary larger-backbone diagnostic, not as a main HumanEval-Java claim.

| Model | seed | pass@1 | plausible patches | Avg./Med. AED | Avg./Med. CCR | No-op all |
|---|---:|---:|---:|---:|---:|---:|
| qwen2.5coder14b-hejava-n1-s7301 | 7301 | 7.36 | 12 | 320.50/339.50 | 50.08/45.80 | 0.00 |
| qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620-hejava-n1-s7301 | 7301 | 4.29 | 7 | 77.00/49.00 | 70.88/72.73 | 0.00 |
| qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620-hejava-n1-s7301 | 7301 | 7.98 | 13 | 46.00/4.00 | 78.98/80.00 | 1.84 |

- **HumanEval-Java / Qwen2.5-Coder-14B package-normalized fixed seed 7302 (`n=5`)**: This rerun supersedes the unnormalized `n=5` artifacts because HumanEval-Java tests call `humaneval.buggy.*`, while raw generations often declared `humaneval.fixed`, `humaneval.fix`, `humaneval`, or no package. The `*-pkgfix` directories preserve raw outputs and normalize only the package declaration for fair compilation. PAFT-w1.5 improves pass@5 and average locality over SFT, but not pass@1 or median AED; PAFT-w2 is negative. Use this as a supplementary trade-off diagnostic, not as a main HumanEval-Java claim.

| Model | seed | pass@1 | pass@5 | plausible patches | Avg./Med. AED | Avg./Med. CCR | No-op all |
|---|---:|---:|---:|---:|---:|---:|---:|
| qwen2.5coder14b-hejava-n5-s7302-pkgfix | 7302 | 2.09 | 7.36 | 17 | 394.24/481.00 | 42.92/33.33 | 0.00 |
| qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620-hejava-n5-s7302-pkgfix | 7302 | 3.07 | 7.36 | 25 | 139.44/29.00 | 73.63/77.78 | 1.35 |
| qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620-hejava-n5-s7302-pkgfix | 7302 | 2.33 | 8.59 | 19 | 124.05/127.00 | 75.14/72.73 | 2.33 |
| qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620-hejava-n5-s7302-pkgfix | 7302 | 0.61 | 0.61 | 5 | 272.00/272.00 | 72.73/72.73 | 2.82 |

- **HumanEval-Java / Qwen2.5-Coder-14B package-normalized fixed seed 7301 (`n=5`)**: this follow-up preserves the positive n=1 seed but remains correctness-neutral at `n=5`: all three settings solve the same number of patches. PAFT is useful only as a locality diagnostic here, with much lower AED and higher CCR on plausible patches. Do not use as a correctness claim.

| Model | seed | pass@1 | pass@5 | plausible patches | Avg./Med. AED | Avg./Med. CCR | No-op all |
|---|---:|---:|---:|---:|---:|---:|---:|
| qwen2.5coder14b-hejava-n5-s7301-pkgfix | 7301 | 0.61 | 0.61 | 5 | 425.00/425.00 | 40.91/40.91 | 0.00 |
| qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620-hejava-n5-s7301-pkgfix | 7301 | 0.61 | 0.61 | 5 | 272.00/272.00 | 72.73/72.73 | 1.84 |
| qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620-hejava-n5-s7301-pkgfix | 7301 | 0.61 | 0.61 | 5 | 3.00/3.00 | 94.12/94.12 | 3.07 |

- **HumanEval-Java / Qwen2.5-Coder-14B package-normalized fixed seed 7302 (`n=10`)**: this completed ten-candidate continuation is correctness-neutral: all four rows solve only `SPLIT_WORDS` in all ten samples. It should not be used as a correctness-improvement result. It is useful only as a locality appendix point because PAFT reduces AED and improves CCR under equal correctness.

| Model | seed | pass@1 | pass@5 | pass@10 | plausible patches | Avg./Med. AED | Avg./Med. CCR | No-op all |
|---|---:|---:|---:|---:|---:|---:|---:|---:|
| qwen2.5coder14b-hejava-n10-s7302-pkgfix | 7302 | 0.61 | 0.61 | 0.61 | 10 | 481.00/481.00 | 33.33/33.33 | 0.00 |
| qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620-hejava-n10-s7302-pkgfix | 7302 | 0.61 | 0.61 | 0.61 | 10 | 299.00/299.00 | 63.64/63.64 | 1.47 |
| qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620-hejava-n10-s7302-pkgfix | 7302 | 0.61 | 0.61 | 0.61 | 10 | 271.00/271.00 | 72.73/72.73 | 2.33 |
| qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620-hejava-n10-s7302-pkgfix | 7302 | 0.61 | 0.61 | 0.61 | 10 | 272.00/272.00 | 72.73/72.73 | 2.70 |

## Negative / Do-Not-Use Evidence

- **QuixBugs-Python / OpenCoder-8B pass@1**: Base=27.50, SFT=20.00, PAFT=20.00. Do not use as positive cross-language evidence.
- **HumanEvalPack-Python / DS-6.7B**: PAFT does not improve pass@1 over Base. The fixed-seed 1024-token diagnostic above is usable only for PAFT-vs-SFT and locality framing, not as a main pass@1-over-Base result.
- **HumanEvalPack-Python / Qwen2.5-Coder-14B**: PAFT does not improve pass@1 over Base. Use only for larger-backbone locality/common-plausible framing.
- **HumanEval-Java / Qwen2.5-Coder-14B package-normalized n=5**: PAFT-w1.5 improves pass@5 and average AED/CCR over SFT but loses pass@1 and median AED; PAFT-w2 collapses. Use only as an appendix trade-off diagnostic.
- **HumanEval-Java / Qwen2.5-Coder-14B seed7301 package-normalized n=5**: correctness-neutral across Base/SFT/PAFT, useful only for locality.
- **HumanEval-Java / Qwen2.5-Coder-14B seed7302 package-normalized n=10**: correctness-neutral across Base/SFT/PAFT because every row solves only `SPLIT_WORDS`; use only for locality, not correctness.
- **Defects4J / Qwen2.5-Coder-14B seed7402 n=10**: useful only as an internal stress/sensitivity seed; Base is unusually weak and w2 loses correctness, so do not replace seed7401 with this block.
- **QuixBugs-Python / Qwen2.5-Coder-14B seed7106**: PAFT improves over SFT but not Base in raw pass@1; use only as PAFT-vs-SFT/cross-language locality evidence.
- **HumanEvalPack-Python / OpenCoder-8B smoke**: generation quality is poor under the current script, so stop this path for now.
- **Qwen14B v2opt/light PAFT (0.15/0.30/1 epoch)**: weaker than the old-recipe sweep; do not use as main evidence.
- **OpenCoder8B oldcfg rerun**: not usable as a replacement; PAFT pass@1 drops to 2.43 and logs show `lcs_coverage=0`, indicating the preservation mask was not formed correctly.

## Output-Format Preflight for Future Reruns

- Clean DS-Coder fixed-seed reruns must pass `scripts/tse_d4j_output_format_gate.sh` on a 10-20 bug fixed0 smoke generation before full Defects4J validation. The gate checks minimum file count, Java-like output rate, and prose-like output rate. A known-good historical PAFT output (`deepseek-6.7b-trained-prorepair`) passes with 371 files, 80.6% Java-like outputs, and 0.0% prose-like outputs.

## System-Level APR Scope

- Agentless, AutoCodeRover, and RepairAgent should be treated as **system-level APR references**, not same-class generator-training baselines. They include localization, retrieval/search, test feedback, reranking, and iterative validation, whereas PAFT changes the patch generator's training objective. The TSE manuscript now integrates this framing in the related-work section and `tab:system-level-reference`; keep `tse_system_level_reference_scope.md` as the source note for future edits. The manuscript should state that PAFT does not claim system-level APR SOTA; a fair comparison would require a generator-swap study that fixes the rest of the APR pipeline.

- `system_level_swap_feasibility_20260703.md` is the current audit artifact for this claim boundary. It confirms local SWE-bench, SWE-bench Lite/Verified/Multilingual, and Multi-SWE-bench Java verified caches with gold patch/test-patch metadata; it also records that the local Agentless pipeline includes localization, retrieval, multi-sample repair, validation, and reranking. Use it to design a future generator-swap smoke test, not as evidence of completed system-level PAFT evaluation.

- `multiswe_java_verified_summary_20260703.md` audits the local Multi-SWE-bench Java Verified cache: 91 Java tasks, 91 with gold patches, 91 with test patches, and 61 multi-file gold patches (67.0%). This is a target for the future generator-swap/system-level study, not completed PAFT evidence.

- `multiswe_java_verified_smoke10_20260703.jsonl` is a deterministic 10-instance Multi-SWE-bench Java verified manifest for that future smoke test. It records instance ids, repos, base commits, failing/passing tests, and changed source/test files.

- `multiswe_java_verified_stratified_smoke12_20260703.jsonl` is the preferred smoke manifest when we want explicit coverage of complexity levels: 4 single-file repairs, 4 two-file repairs, and 4 repairs touching three or more files, selected deterministically from the verified Java cache.

- **Completed generator-level Multi-SWE Java smoke10 (neutral prompt, seed7401)**: this is not an official Multi-SWE harness pass/fail result. It is a fixed-rule oracle-file/hunk-context generation diagnostic over 10 Java Verified tasks, including 6 tasks with multi-file gold patches (4 two-file and 2 three-plus-file). Use it only to show the PAFT generator can reduce patch-text distance and improve touched-file recall in a more complex setting under the same prompt/context protocol.

| Model | predictions | nonempty | Avg./Med. patch chars | Avg./Med. patch-text AED (n) | File P/R | Extra/Missing files |
|---|---:|---:|---:|---:|---:|---:|
| qwen2.5coder14b-multiswe-smoke10-neutral-s7401 | 10/10 | 10 | 2703.5/2623.0 | 1045.8/978.0 (4) | 1.00/0.85 | 0.00/0.80 |
| qwen2.5coder14b-sft-oldrecipe-lr2e4-e3-20260620-multiswe-smoke10-neutral-s7401 | 10/10 | 10 | 2397.5/1499.5 | 1014.0/930.0 (5) | 1.00/0.86 | 0.00/0.60 |
| qwen2.5coder14b-paft-oldrecipe-w15-lr2e4-e3-20260620-multiswe-smoke10-neutral-s7401 | 10/10 | 10 | 2732.8/1508.5 | 894.0/802.5 (6) | 1.00/0.91 | 0.00/0.40 |
| qwen2.5coder14b-paft-oldrecipe-w2-lr2e4-e3-20260620-multiswe-smoke10-neutral-s7401 | 10/10 | 10 | 2999.8/2207.0 | 850.5/847.0 (4) | 1.00/0.92 | 0.00/0.60 |

- `multiswe_generator_swap_protocol_20260703.md` fixes the intended first system-level smoke protocol: same subset, same localization/context, same candidate budget, same parser, same test harness, and only the Base/SFT/PAFT generator swapped.

## Remaining High-Value Gaps

1. Keep the original OpenCoder8B positive result as secondary evidence; the oldcfg rerun is negative due to a mask-formation issue and should not replace it.
2. Attribution diagnostics are now paper-facing: no-op, stable-region edits, and near-duplicate leakage are integrated into RQ4 and audited by `scripts/check_tse_ready.sh`. Keep `tse_attribution_diagnostics_summary.md` as the provenance note.
3. Do not spend more GPU on repeated-seed robustness by default; the reportable path is fixed-seed reproducibility with seed7401 as the larger-backbone result.
4. The remaining experimental gap is multi-file/system-level APR. Do not spend more GPU on random small function benchmarks unless they directly address this gap or reuse a proven fixed old-recipe pipeline.
