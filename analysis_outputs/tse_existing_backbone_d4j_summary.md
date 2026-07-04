# Existing D4J Backbone Evidence for TSE Revision

Source checkout: `/home/barty/research/prorepair`

Command used:

```bash
python3 test_d4j.py -m <model> -n 10
```

The command loaded existing validated Defects4J results (`371` bugs, `10` candidates per bug) and did not run new validation. Logs are stored under `/home/barty/research/prorepair/logs/next_exps/*_test_d4j_summary.log`.

## Reliable Results

| Model | Role | pass@1 | pass@5 | pass@10 | Plausible patches | Avg AED | Med AED | Avg CCR | Med CCR |
|---|---|---:|---:|---:|---:|---:|---:|---:|---:|
| qwen8b-sft | SFT | 10.16 | 22.94 | 29.92 | 377 | 101.77 | 58.00 | 72.85 | 81.58 |
| qwen8b-paft | PAFT | 13.02 | 25.27 | 30.46 | 483 | 68.57 | 30.00 | 76.41 | 85.71 |
| qwen2.5coder7b | Base | 14.42 | 29.21 | 35.58 | 535 | 143.09 | 85.00 | 68.43 | 73.68 |
| qwen2.5coder7b-paft | PAFT | 15.20 | 29.86 | 36.39 | 564 | 71.26 | 43.00 | 77.27 | 85.71 |
| opencoder8b | Base | 7.92 | 18.65 | 25.07 | 294 | 137.92 | 84.00 | 76.56 | 85.71 |
| opencoder8b-sft | SFT | 6.77 | 17.03 | 22.91 | 251 | 110.18 | 61.00 | 76.77 | 86.96 |
| opencoder8b-paft | PAFT | 9.95 | 22.24 | 28.03 | 369 | 78.79 | 45.00 | 78.06 | 85.71 |

## Immediate Interpretation

- Qwen8B provides the cleanest same-backbone SFT-vs-PAFT evidence currently available: PAFT improves pass@1/5/10 and substantially lowers both Avg./Med. AED while improving CCR.
- Qwen2.5-Coder-7B provides a stronger/newer-backbone Base-vs-PAFT reference: correctness gains are modest, but locality gains are large.
- OpenCoder was previously marked suspicious because cached AED values were `0.00`; recomputing metrics from `patch_code` resolves this issue and restores a clean Base/SFT/PAFT block.
- These results help answer the "stronger backbone" concern better than closed-source prompting diagnostics, but they are still <=8B. A larger open-weight backbone remains preferable for a TSE version if feasible.

## Edit-Location Mechanism Diagnostic

For plausible patches, we compare buggy-to-reference and buggy-to-generated edits in buggy-line coordinates. `outside_ref` counts generated edited lines outside the reference-changed region; lower values mean fewer false edits in stable regions. `missed_ref` counts reference-changed lines not edited by the generated patch.

| Model | n plausible | outside_ref avg | outside_ref med | edited lines avg | edited lines med | missed_ref avg | missed_ref med |
|---|---:|---:|---:|---:|---:|---:|---:|
| qwen8b-sft | 377 | 2.62 | 1.00 | 3.61 | 2.00 | 0.47 | 0.00 |
| qwen8b-paft | 483 | 1.51 | 0.00 | 2.48 | 1.00 | 0.45 | 0.00 |
| qwen2.5coder7b | 535 | 2.57 | 1.00 | 3.61 | 2.00 | 0.39 | 0.00 |
| qwen2.5coder7b-paft | 564 | 1.32 | 0.00 | 2.30 | 1.00 | 0.46 | 0.00 |

Interpretation: PAFT reduces edits outside reference-changed regions on both backbones without materially increasing missed reference edits. This is direct evidence for a learned preservation/localization prior, not only a smaller-patch side effect.

## Excluded / Needs Audit

`qwen3-8b-trained-noprompt` is another historical variant with stale cached diff statistics: `test_d4j.py` reports Avg./Med. AED as `5.18/0.00`, but a fresh recomputation from stored `patch_code` gives `76.85/35.00` with zero plausible no-op patches. If this variant is used, recompute and rewrite the cached diff stats first, and map its exact training role. The cleaner Qwen3-8B pair remains `qwen8b-sft` vs `qwen8b-paft`.

The old DS-Coder standard SFT row in the paper (`6.1` pass@1, `93.5` AED) has not yet been mapped to a clean current result directory. Current DeepSeek directories map clearly to Base, full masking, curriculum / `w_align=1`, `w_align` sweep variants, and final PAFT, but not that exact standard SFT row.
