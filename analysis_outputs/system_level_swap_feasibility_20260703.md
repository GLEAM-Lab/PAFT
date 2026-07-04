# System-Level APR Generator-Swap Feasibility Audit

This note records local evidence for responding to Agentless/AutoCodeRover-style baseline concerns. It does not claim a completed system-level comparison.

## Dataset Caches

| Arrow file | Rows | Gold patch | Test patch | Languages | Sample id |
|---|---:|---:|---:|---|---|
| `/home/barty/.cache/huggingface/datasets/Daoguang___multi-swe-bench/default/0.0.0/8bd202138a4ab9987daa77111c76a3e66af9f1c9/multi-swe-bench-java_verified.arrow` | 91 | True | True | java:91 | `apache__dubbo-10638` |
| `/home/barty/.cache/huggingface/datasets/SWE-bench___swe-bench/default/0.0.0/7074ef12ea2a6f70a228943c1336553333c22786/swe-bench-dev.arrow` | 225 | True | True | - | `sqlfluff__sqlfluff-4764` |
| `/home/barty/.cache/huggingface/datasets/SWE-bench___swe-bench/default/0.0.0/7074ef12ea2a6f70a228943c1336553333c22786/swe-bench-test.arrow` | 2294 | True | True | - | `astropy__astropy-11693` |
| `/home/barty/.cache/huggingface/datasets/SWE-bench___swe-bench/default/0.0.0/7074ef12ea2a6f70a228943c1336553333c22786/swe-bench-train.arrow` | 19008 | True | True | - | `DataDog__integrations-core-10093` |
| `/home/barty/.cache/huggingface/datasets/SWE-bench___swe-bench_lite/default/0.0.0/69611d31007e1c6731db8bd5b5c3f2d33f5bab6e/swe-bench_lite-dev.arrow` | 23 | True | True | - | `sqlfluff__sqlfluff-1625` |
| `/home/barty/.cache/huggingface/datasets/SWE-bench___swe-bench_lite/default/0.0.0/69611d31007e1c6731db8bd5b5c3f2d33f5bab6e/swe-bench_lite-test.arrow` | 300 | True | True | - | `astropy__astropy-12907` |
| `/home/barty/.cache/huggingface/datasets/SWE-bench___swe-bench_multilingual/default/0.0.0/2b7aced941b4873e9cad3e76abbae93f481d1beb/swe-bench_multilingual-test.arrow` | 300 | True | True | - | `apache__druid-13704` |
| `/home/barty/.cache/huggingface/datasets/SWE-bench___swe-bench_verified/default/0.0.0/91aa3ed51b709be6457e12d00300a6a596d4c6a3/swe-bench_verified-test.arrow` | 500 | True | True | - | `astropy__astropy-12907` |
| `/home/barty/.cache/huggingface/datasets/princeton-nlp___swe-bench/default/0.0.0/e48e2bd1e9fecd5bbd641e9414ac59da9f2e69f6/swe-bench-dev.arrow` | 225 | True | True | - | `sqlfluff__sqlfluff-4764` |
| `/home/barty/.cache/huggingface/datasets/princeton-nlp___swe-bench/default/0.0.0/e48e2bd1e9fecd5bbd641e9414ac59da9f2e69f6/swe-bench-test.arrow` | 2294 | True | True | - | `astropy__astropy-11693` |
| `/home/barty/.cache/huggingface/datasets/princeton-nlp___swe-bench/default/0.0.0/e48e2bd1e9fecd5bbd641e9414ac59da9f2e69f6/swe-bench-train.arrow` | 19008 | True | True | - | `DataDog__integrations-core-10093` |
| `/home/barty/.cache/huggingface/datasets/princeton-nlp___swe-bench_lite/default/0.0.0/6ec7bb89b9342f664a54a6e0a6ea6501d3437cc2/swe-bench_lite-dev.arrow` | 23 | True | True | - | `sqlfluff__sqlfluff-1625` |
| `/home/barty/.cache/huggingface/datasets/princeton-nlp___swe-bench_lite/default/0.0.0/6ec7bb89b9342f664a54a6e0a6ea6501d3437cc2/swe-bench_lite-test.arrow` | 300 | True | True | - | `astropy__astropy-12907` |
| `/home/barty/.cache/huggingface/datasets/princeton-nlp___swe-bench_multimodal/default/0.0.0/aa2db68940196b6b59ae3f577faa0c25157bdd50/swe-bench_multimodal-dev.arrow` | 102 | True | True | - | `chartjs__Chart.js-10301` |
| `/home/barty/.cache/huggingface/datasets/princeton-nlp___swe-bench_multimodal/default/0.0.0/aa2db68940196b6b59ae3f577faa0c25157bdd50/swe-bench_multimodal-test.arrow` | 510 | True | True | - | `grommet__grommet-6282` |
| `/home/barty/.cache/huggingface/datasets/princeton-nlp___swe-bench_verified/default/0.0.0/c104f840cc67f8b6eec6f759ebc8b2693d585d4a/swe-bench_verified-test.arrow` | 500 | True | True | - | `astropy__astropy-12907` |

## Agentless Assets

- Repository: `/home/barty/research/Agentless`; exists=True.
- supports_lite_verified: True
- uses_openai_api: True
- has_localization: True
- has_retrieval: True
- has_repair_samples: True
- has_patch_selection: True
- Key files:
  - `agentless/fl/localize.py`: True
  - `agentless/fl/retrieve.py`: True
  - `agentless/repair/repair.py`: True
  - `agentless/repair/rerank.py`: True
  - `agentless/test/run_tests.py`: True

## Existing System-Level Outputs

- KGCompass root: `/home/barty/GLEAM-Lab/KGCompass`; exists=True.
- Summary files: 175; Agentless project structures: 1604; patch output files: 167.
- `/home/barty/GLEAM-Lab/KGCompass/generated_patch_eval_verified_20260329_final/glm5/r1_c20_t0/summary.json`: evaluated=268, passed_regression=None, round=r1_c20_t0
- `/home/barty/GLEAM-Lab/KGCompass/generated_patch_eval_verified_20260329_final/glm5/r2_c20_t1/summary.json`: evaluated=268, passed_regression=None, round=r2_c20_t1
- `/home/barty/GLEAM-Lab/KGCompass/generated_patch_eval_verified_20260329_final/glm5/r3_c20_t1/summary.json`: evaluated=268, passed_regression=None, round=r3_c20_t1
- `/home/barty/GLEAM-Lab/KGCompass/generated_patch_eval_verified_20260329_final/glm5/r4_c10_t0/summary.json`: evaluated=266, passed_regression=None, round=r4_c10_t0
- `/home/barty/GLEAM-Lab/KGCompass/generated_patch_eval_verified_20260329_final/glm5/r5_c10_t1/summary.json`: evaluated=268, passed_regression=None, round=r5_c10_t1
- `/home/barty/GLEAM-Lab/KGCompass/generated_patch_eval_verified_20260329_final/glm5/r6_c10_t1/summary.json`: evaluated=269, passed_regression=None, round=r6_c10_t1
- `/home/barty/GLEAM-Lab/KGCompass/generated_patch_eval_verified_20260329_final/qwen3codernext/r1_c20_t0/summary.json`: evaluated=215, passed_regression=None, round=r1_c20_t0
- `/home/barty/GLEAM-Lab/KGCompass/generated_patch_eval_verified_20260329_final/qwen3codernext/r2_c20_t1/summary.json`: evaluated=222, passed_regression=None, round=r2_c20_t1

## Multi-SWE-bench Java Verified

- Arrow cache: `/home/barty/.cache/huggingface/datasets/Daoguang___multi-swe-bench/default/0.0.0/8bd202138a4ab9987daa77111c76a3e66af9f1c9/multi-swe-bench-java_verified.arrow`
- Rows: 91
- Rows with gold patches: 91
- Rows with test patches: 91
- Multi-file gold patches: 61 (67.0%)
- Patch-file count distribution: `{1: 30, 2: 31, 3: 17, 4: 8, 5: 2, 8: 2, 12: 1}`
- Test-patch file count distribution: `{1: 65, 2: 25, 3: 1}`

## Feasibility Conclusion

- A local Multi-SWE-bench Java Verified cache is available with 91 Java tasks, gold patches, and test patches. 61/91 tasks (67.0%) require multi-file gold patches, so this is a suitable target for the reviewer-requested complex/multi-file follow-up.
- Local assets are sufficient to design a small generator-swap smoke test: fix dataset instances, localized files/edit locations, context window, candidate budget, and selection policy, then replace only the patch generator with Base/SFT/PAFT.
- Agentless is not a same-class baseline for PAFT's main tables because it adds localization, retrieval, multiple repair samples, regression/reproduction tests, and reranking.
- SWE-bench-style datasets include gold patch/test metadata, but full system-level evaluation is slower and should be treated as a separate appendix or major-revision experiment rather than folded into the controlled generator-level benchmark.
