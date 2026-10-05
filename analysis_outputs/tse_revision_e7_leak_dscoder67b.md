# E7: backbone pretraining-memorisation probe

**Base model**: `models/deepseek-coder-6.7b-instruct` (DS-Coder-6.7B-Instruct-base)
**Faults**: 371 (all, seed 20261004)
**Probes**: repair = paper repair prompt over the buggy function; prefix = first 50% of the developer fix given as a code prefix.
**Control**: every user-defined identifier is consistently renamed (Java keywords and a small JDK allow-list are kept) in both the buggy and the fixed text.

> Leakage signal = canonical reproduces the held-out text much better than the renamed control.

## Aggregate metrics

| probe | condition | n | mean LCP frac | exact match | mean matched-line frac | longest run >= 5 lines | mean edit sim |
|---|---|---:|---:|---:|---:|---:|---:|
| repair | canonical | 371 | 0.451 | 0.0% | 0.777 | 74.7% | 0.509 |
| repair | renamed | 371 | 0.322 | 0.0% | 0.660 | 59.6% | 0.442 |
| prefix | canonical | 336 | 0.135 | 0.3% | 0.453 | 15.5% | 0.222 |
| prefix | renamed | 336 | 0.086 | 0.0% | 0.368 | 8.3% | 0.183 |

## Paired bootstrap, canonical - renamed (fault-level, 10k resamples)

| probe | metric | n | delta [95% CI] | p |
|---|---|---:|---|---:|
| repair | LCP frac | 371 | +0.129 [+0.103, +0.156] | 0.000 |
| repair | matched-line frac | 371 | +0.117 [+0.096, +0.138] | 0.000 |
| prefix | LCP frac | 336 | +0.049 [+0.025, +0.074] | 0.000 |
| prefix | matched-line frac | 336 | +0.085 [+0.066, +0.105] | 0.000 |

## Reading

* A large, significant canonical-minus-renamed gap on `prefix` is the strongest evidence of exact memorisation; a near-zero gap means the backbone is behaving like a general code model rather than a lookup table.
* `repair` is reported for completeness but is the weaker probe: its canonical-minus-renamed gap also absorbs the fact that renamed code is simply harder to model, so only the `prefix` probe should be used to argue about leakage.
* The absolute verbatim rate alone is not a leakage signal: boilerplate and library calls can be reproduced from ordinary language modelling, which is exactly what the renamed control absorbs.
* Because PAFT and SFT share the same base backbone, any residual familiarity of the base model with Defects4J affects both fine-tuned settings equally and cannot explain PAFT's gains over SFT.

Per-fault generations: `analysis_outputs/tse_revision_e7_leak_dscoder67b.jsonl`
