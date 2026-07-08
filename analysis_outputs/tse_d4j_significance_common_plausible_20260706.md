## A. Sanity check vs paper Table 5 (pooled plausible patches, recomputed from text)
| method | bugs | pass@1 | plaus. patches | Avg AED | Med AED | Avg CCR | Med CCR |
|---|---:|---:|---:|---:|---:|---:|---:|
| Base | 371 | 5.80 | 215 | 142.90 | 113.00 | 70.64 | 75.00 |
| SFT | 371 | 7.41 | 275 | 105.01 | 61.00 | 71.39 | 77.78 |
| PAFT | 371 | 10.13 | 376 | 80.66 | 42.00 | 76.34 | 85.42 |
| Prompting | 308 | 8.25 | 254 | 148.61 | 104.50 | 72.17 | 75.00 |
| RepairLLaMA | 316 | 6.99 | 221 | 173.29 | 126.00 | 47.14 | 36.36 |
| AdaPatcher | 371 | 5.90 | 219 | 112.38 | 61.00 | 68.57 | 75.00 |

## B. Common-plausible subsets (first plausible candidate per bug)
| scope | method | common bugs | Avg AED | Med AED | Avg CCR | Med CCR |
|---|---|---:|---:|---:|---:|---:|
| Base+SFT+PAFT | Base | 41 | 155.59 | 87.00 | 68.63 | 76.74 |
| Base+SFT+PAFT | SFT | 41 | 125.41 | 70.00 | 67.89 | 75.00 |
| Base+SFT+PAFT | PAFT | 41 | 131.00 | 44.00 | 72.33 | 77.78 |
| Base+PAFT | Base | 52 | 158.56 | 104.00 | 67.85 | 75.87 |
| Base+PAFT | PAFT | 52 | 126.90 | 63.50 | 72.24 | 78.84 |
| SFT+PAFT | SFT | 69 | 124.99 | 73.00 | 68.69 | 75.00 |
| SFT+PAFT | PAFT | 69 | 110.75 | 44.00 | 74.37 | 82.14 |
| Prompting+PAFT | Prompting | 57 | 155.53 | 97.00 | 72.42 | 78.57 |
| Prompting+PAFT | PAFT | 57 | 85.11 | 42.00 | 77.15 | 80.00 |
| RepairLLaMA+PAFT | RepairLLaMA | 43 | 212.02 | 147.00 | 52.84 | 54.55 |
| RepairLLaMA+PAFT | PAFT | 43 | 95.58 | 44.00 | 73.90 | 80.00 |
| AdaPatcher+PAFT | AdaPatcher | 59 | 149.92 | 90.00 | 67.98 | 71.88 |
| AdaPatcher+PAFT | PAFT | 59 | 99.61 | 41.00 | 74.77 | 85.42 |
| Base+SFT+PAFT+Prompting+RepairLLaMA+AdaPatcher | Base | 16 | 110.44 | 71.00 | 78.27 | 82.86 |
| Base+SFT+PAFT+Prompting+RepairLLaMA+AdaPatcher | SFT | 16 | 82.25 | 45.50 | 73.52 | 79.29 |
| Base+SFT+PAFT+Prompting+RepairLLaMA+AdaPatcher | PAFT | 16 | 84.19 | 36.00 | 76.37 | 82.71 |
| Base+SFT+PAFT+Prompting+RepairLLaMA+AdaPatcher | Prompting | 16 | 92.19 | 63.50 | 78.92 | 86.19 |
| Base+SFT+PAFT+Prompting+RepairLLaMA+AdaPatcher | RepairLLaMA | 16 | 206.25 | 141.50 | 47.68 | 35.38 |
| Base+SFT+PAFT+Prompting+RepairLLaMA+AdaPatcher | AdaPatcher | 16 | 145.62 | 62.00 | 74.35 | 78.17 |

## C. PAFT vs each method: paired bootstrap (10k, seed 20260706) + exact McNemar
| comparison | bugs | delta pass@1 (pp) | 95% CI | p(bootstrap) | solved-only PAFT/other | p(McNemar) |
|---|---:|---:|---|---:|---:|---:|
| PAFT vs Base | 371 | +4.34 | [2.67, 6.09] | 0.0001 | 46/20 | 0.0019 |
| PAFT vs SFT | 371 | +2.72 | [1.40, 4.10] | 0.0001 | 29/26 | 0.7877 |
| PAFT vs Prompting | 308 | +2.34 | [0.58, 4.16] | 0.0114 | 25/19 | 0.4514 |
| PAFT vs RepairLLaMA | 316 | +4.49 | [2.09, 7.06] | 0.0004 | 49/32 | 0.0748 |
| PAFT vs AdaPatcher | 371 | +4.23 | [2.86, 5.66] | 0.0001 | 39/23 | 0.0559 |