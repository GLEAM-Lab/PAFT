# E7 add-on: reproduction of the developer-changed, held-out lines

For each fault we take the prefix probe's held-out second half, keep only the lines the developer actually changed (replace/insert opcodes of a stripped-line diff), and count how many of them appear verbatim in the model's continuation.

| condition | faults | mean changed-line recall | >=1 changed line | all changed lines | changed lines scored |
|---|---:|---:|---:|---:|---:|
| canonical | 234 | 0.364 | 58.1% | 17.9% | 726 |
| renamed | 234 | 0.289 | 50.9% | 12.4% | 731 |

| metric | n | canonical - renamed [95% CI] | p |
|---|---:|---|---:|
| changed-line recall | 234 | +0.075 [+0.039, +0.113] | 0.000 |
| >=1 changed line reproduced | 234 | +0.073 [+0.034, +0.111] | 0.000 |
| all changed lines reproduced | 234 | +0.056 [+0.017, +0.098] | 0.007 |

Reading: a leakage claim would require the canonical condition to reproduce the developer's *edited* lines, which were never shown to the model, at a clearly higher rate than the renamed control.  Low absolute recall is the no-leakage outcome; the renamed control is an upper bound on the OOD penalty of renaming.
