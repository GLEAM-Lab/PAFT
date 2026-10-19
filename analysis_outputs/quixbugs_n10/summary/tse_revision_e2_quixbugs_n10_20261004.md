# QuixBugs-Python, n = 10 (tasks = 40)

## pass@1 (%)

| setting | pass@1 | resolved tasks | plausible candidates |
|---|---:|---:|---:|
| Base | 34.75 | 29 | 139 |
| SFT | 36.25 | 31 | 145 |
| PAFT | 37.00 | 32 | 148 |

## Paired task-level bootstrap (10,000 resamples) of the pass@1 difference

| comparison | delta (pp) | 95% CI | p |
|---|---:|---|---:|
| PAFT - SFT | +0.75 | [-5.75, +7.25] | 0.8156 |
| PAFT - Base | +2.25 | [-4.50, +9.00] | 0.5130 |
| SFT - Base | +1.50 | [-4.00, +7.00] | 0.6096 |

## pass@5 (%) and paired task-level bootstrap of the difference

| setting | pass@5 |
|---|---:|
| Base | 63.96 |
| SFT | 64.77 |
| PAFT | 70.28 |

| comparison | delta (pp) | 95% CI | p |
|---|---:|---|---:|
| PAFT - SFT | +5.51 | [-4.68, +16.58] | 0.3144 |
| PAFT - Base | +6.32 | [-5.48, +17.98] | 0.2902 |
| SFT - Base | +0.81 | [-9.95, +11.77] | 0.8760 |

## pass@10 (%) and paired task-level bootstrap of the difference

| setting | pass@10 |
|---|---:|
| Base | 72.50 |
| SFT | 77.50 |
| PAFT | 80.00 |

| comparison | delta (pp) | 95% CI | p |
|---|---:|---|---:|
| PAFT - SFT | +2.50 | [-12.50, +17.50] | 0.8744 |
| PAFT - Base | +7.50 | [-7.50, +22.50] | 0.3896 |
| SFT - Base | +5.00 | [-7.50, +20.00] | 0.5740 |

## Exact McNemar on solved / not-solved tasks

| comparison | solved only by first | solved only by second | p |
|---|---:|---:|---:|
| PAFT vs SFT | 4 | 5 | 1.0000 |
| PAFT vs Base | 3 | 6 | 0.5078 |
| SFT vs Base | 3 | 5 | 0.7266 |

## Common-solved-subset AED / CCR (first passing candidate per task)

**PAFT+SFT** (27 common tasks)

| setting | AED mean | AED median | CCR mean | CCR median |
|---|---:|---:|---:|---:|
| PAFT | 262.26 | 239.00 | 76.02 | 80.00 |
| SFT | 275.22 | 244.00 | 72.70 | 80.77 |

**PAFT+Base** (26 common tasks)

| setting | AED mean | AED median | CCR mean | CCR median |
|---|---:|---:|---:|---:|
| PAFT | 264.00 | 236.50 | 73.96 | 80.00 |
| Base | 341.81 | 283.50 | 58.71 | 60.99 |

## Over-editing ratio vs the developer fix (all passing candidates)

| setting | plausible | median | ratio of sums | share <= 1 | share > 10 |
|---|---:|---:|---:|---:|---:|
| Base | 139 | 0.94 | 0.66 | 58% | 0% |
| SFT | 145 | 0.78 | 0.49 | 79% | 0% |
| PAFT | 148 | 0.80 | 0.54 | 82% | 0% |
