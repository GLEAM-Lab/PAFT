# System-Level APR Reference Scope for TSE

This note separates same-class PAFT baselines from system-level APR/agent references. It is intended for the TSE related-work, scope, and experimental-design sections.

## Recommended Claim Boundary

PAFT should be framed as a **generator-level preservation-aware fine-tuning objective**. Main quantitative tables should compare Base, SFT, PAFT, prompting, and preference/fine-tuning baselines under the same patch-generation/evaluation protocol. Do not claim system-level APR SOTA.

System-level methods should be discussed in a separate reference table because they include additional pipeline components such as localization, retrieval/code search, reproduction tests, reranking, iterative validation, and multi-candidate selection. These components are complementary to PAFT: PAFT could serve as the patch generator inside such pipelines.

## Reference Methods

| Method | Primary benchmark/source | Key pipeline components | Why not same-class baseline | How to include in TSE |
|---|---|---|---|---|
| Agentless | SWE-bench Lite; reports a three-phase process of localization, repair, and patch validation; 32.00% / 96 fixes in the arXiv abstract. Source: [arXiv:2407.01489](https://arxiv.org/abs/2407.01489). | Localization, repair, patch validation; generated reproduction tests and regression tests in the paper description. | Solves repository-level software issues, not single-function/single-file generator fine-tuning. Uses validation/selection beyond one-shot generation. | Related work + separated system-level reference table; fair comparison requires fixing localization/validation and swapping only the generator. |
| AutoCodeRover | SWE-bench Lite; reports 19% on SWE-bench-lite, code search APIs, AST-oriented retrieval, SBFL, and patch validation. Source: [arXiv:2404.05427](https://arxiv.org/html/2404.05427v3). | Iterative code search, class/method retrieval, optional SBFL, LLM patch construction, test validation/retry. | End-to-end repository-level issue repair; performance depends on retrieval/localization and validation loop, not only generator training. | Related work + separated system-level reference table; fair comparison requires fixing retrieved context/retry policy and swapping only the generator. |
| RepairAgent | Defects4J; repository states 164 fixed bugs and an autonomous loop of localize/analyze/generate/test/iterate. Source: [RepairAgent GitHub](https://github.com/sola-st/RepairAgent). | Autonomous agent loop, codebase search, patch generation, test execution, iteration, up to configured cycles. | Uses repeated interaction with the project and test suite; not a single-sample generator objective. | Most relevant Defects4J system-level reference. Include as reference; fair comparison requires a fixed agent trajectory/candidate budget plus generator swap. |

## Manuscript Wording

Use:

> Compared with generator-level prompting, SFT, PAFT variants, and preference/fine-tuning baselines under the same decoding and validation protocol, PAFT improves the correctness/locality trade-off. We do not claim system-level APR SOTA; end-to-end APR agents such as Agentless, AutoCodeRover, and RepairAgent incorporate localization, retrieval, test feedback, and iterative selection, and are complementary to PAFT.

Avoid:

> PAFT outperforms representative APR baselines.

Replace with:

> PAFT outperforms the evaluated generator-level baselines under a controlled single-sample repair protocol.

## Optional Future Experiment

If time allows, the strongest system-level comparison is a generator-swap study: keep an existing APR pipeline's localization/retrieval/validation fixed and replace only its patch generator with Base/SFT/PAFT. This directly tests whether preservation-aware training reduces sampling/reranking burden inside a system-level workflow.
