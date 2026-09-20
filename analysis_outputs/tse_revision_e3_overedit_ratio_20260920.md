# E3: over-editing ratio relative to the developer fix (TSE major revision, Reviewer 1 comment on a reference-relative locality metric)

Script: `scripts/tse_rev_overedit_and_strata.py` (`--set` rows). Inputs: the Defects4J
result directories listed in `tse_run_identity_mapping_20260706.md` /
`tse_d4j_master_metrics_20260710.md` (DS-Coder-6.7B, n = 10 candidates per fault), the
assistant-only w = 1 bundle `d4j_dscoder67b_assistantonly_w1_results_20260711.tar.zst`, and
the developer references from MORepair's `defects4j/dataset/*.json` (371 faults; the `fix`
field inside result copies is overwritten by the generation script and must not be used).

## Definition

For every plausible candidate: ratio = Levenshtein(buggy, candidate) / Levenshtein(buggy,
developer fix), characters, `strip()`-only normalization (same as AED). A ratio of 1.0 means
the candidate edits as much as the developer did; ratios below 1 are possible (shorter
correct fixes). Reference edits: median 71 characters (mean 132, min 1, max 1,499); 50 faults (13.5%)
have a reference edit of at most 10 characters, so the mean ratio is dominated by a few tiny denominators and is
not reported; we report the median and the ratio of sums (total candidate edit / total
reference edit over the same candidates).

## DS-Coder-6.7B, all settings

| setting | plausible candidates | median ratio | ratio of sums | share <= 1 | share > 10 |
|---|---:|---:|---:|---:|---:|
| Base | 215 | 3.28 | 2.99 | 23% | 24% |
| SFT (full-sequence loss, w = 1) | 275 | 1.45 | 2.19 | 39% | 13% |
| **PAFT (w = 2)** | 376 | **1.22** | **1.79** | 44% | 11% |
| Prompting (minimal-edit instruction) | 254 | 3.21 | 3.61 | 17% | 21% |
| RepairLLaMA | 221 | 4.44 | 2.87 | 11% | 33% |
| AdaPatcher | 219 | 1.71 | 2.77 | 35% | 16% |
| w = 0 | 269 | 2.49 | 2.44 | 30% | 19% |
| w = 4 | 305 | 1.38 | 2.24 | 46% | 14% |
| assistant-only loss, w = 2 | 362 | 2.44 | 2.13 | 28% | 12% |
| assistant-only loss, w = 1 | 243 | 2.00 | 2.11 | 37% | 14% |

## Other backbones (Base / SFT / PAFT median ratio over all plausible candidates)

| backbone | Base | SFT | PAFT |
|---|---:|---:|---:|
| DS-Coder-6.7B | 3.28 | 1.45 | 1.22 |
| OpenCoder-8B | 3.19 | 1.69 | 1.50 |
| Qwen3-8B | 3.00 | 1.50 | 1.00 |
| Qwen2.5-Coder-7B | 2.58 | 1.36 | 1.00 |
| Qwen2.5-Coder-14B | 3.47 | 1.00 | 1.00 |

## Reading

PAFT is closest to the developer's edit size on both summaries and on every backbone; on
the three Qwen backbones its median candidate edits exactly as much as the developer. A
no-op candidate would score 0 but is never plausible, so the metric cannot be gamed by not
editing; the reference point is 1.0, not "lower is better".
