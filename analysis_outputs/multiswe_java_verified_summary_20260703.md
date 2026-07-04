# Multi-SWE-bench Java Verified Asset Summary

This is an asset audit, not a PAFT result. It identifies a local benchmark target for a future system-level generator-swap study.

## Aggregate

- Arrow cache: `/home/barty/.cache/huggingface/datasets/Daoguang___multi-swe-bench/default/0.0.0/8bd202138a4ab9987daa77111c76a3e66af9f1c9/multi-swe-bench-java_verified.arrow`
- Rows: 91
- Rows with gold patches: 91
- Rows with test patches: 91
- Multi-file gold patches: 61 (67.0%)
- Patch-file count distribution: `{1: 30, 2: 31, 3: 17, 4: 8, 5: 2, 8: 2, 12: 1}`
- Test-patch file count distribution: `{1: 65, 2: 25, 3: 1}`

## Top Repositories

| Repo | Rows |
|---|---:|
| `fasterxml/jackson-databind` | 49 |
| `fasterxml/jackson-core` | 23 |
| `fasterxml/jackson-dataformat-xml` | 5 |
| `google/gson` | 5 |
| `googlecontainertools/jib` | 5 |
| `apache/dubbo` | 4 |

## Smoke Instances

| Instance | Repo | Gold files | Test files | F2P tests | P2P tests |
|---|---|---:|---:|---:|---:|
| `fasterxml__jackson-core-1133` | `fasterxml/jackson-core` | 12 | 2 | 2 | 0 |
| `apache__dubbo-9187` | `apache/dubbo` | 8 | 1 | 1 | 0 |
| `fasterxml__jackson-dataformat-xml-531` | `fasterxml/jackson-dataformat-xml` | 8 | 2 | 2 | 0 |
| `fasterxml__jackson-databind-4615` | `fasterxml/jackson-databind` | 5 | 1 | 1 | 0 |
| `googlecontainertools__jib-4144` | `googlecontainertools/jib` | 5 | 2 | 2 | 0 |
| `fasterxml__jackson-core-150` | `fasterxml/jackson-core` | 4 | 2 | 2 | 0 |
| `fasterxml__jackson-databind-3622` | `fasterxml/jackson-databind` | 4 | 2 | 2 | 0 |
| `fasterxml__jackson-databind-4015` | `fasterxml/jackson-databind` | 4 | 1 | 1 | 0 |
| `fasterxml__jackson-databind-4048` | `fasterxml/jackson-databind` | 4 | 1 | 1 | 0 |
| `fasterxml__jackson-databind-4131` | `fasterxml/jackson-databind` | 4 | 1 | 1 | 0 |
| `fasterxml__jackson-databind-4365` | `fasterxml/jackson-databind` | 4 | 1 | 1 | 0 |
| `google__gson-1787` | `google/gson` | 4 | 1 | 1 | 0 |
| `googlecontainertools__jib-2536` | `googlecontainertools/jib` | 4 | 2 | 1 | 0 |
| `fasterxml__jackson-core-1016` | `fasterxml/jackson-core` | 3 | 1 | 1 | 0 |
| `fasterxml__jackson-core-1172` | `fasterxml/jackson-core` | 3 | 2 | 2 | 0 |
| `fasterxml__jackson-core-1182` | `fasterxml/jackson-core` | 3 | 2 | 2 | 0 |
| `fasterxml__jackson-core-1204` | `fasterxml/jackson-core` | 3 | 2 | 2 | 0 |
| `fasterxml__jackson-core-729` | `fasterxml/jackson-core` | 3 | 3 | 3 | 0 |
| `fasterxml__jackson-core-922` | `fasterxml/jackson-core` | 3 | 1 | 1 | 0 |
| `fasterxml__jackson-core-980` | `fasterxml/jackson-core` | 3 | 1 | 1 | 0 |

## Suggested Generator-Swap Protocol

- Fix the instance subset, localization/context provider, candidate count, test protocol, and reranker.
- Swap only the generator among Base, SFT, and PAFT.
- Report end-to-end plausible rate plus AED/CCR against gold patches for generated plausible patches.
- Keep this separate from generator-level Defects4J tables because the pipeline includes localization, retrieval, validation, and selection.
