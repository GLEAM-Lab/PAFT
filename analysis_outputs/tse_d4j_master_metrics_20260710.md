# Defects4J Master Metrics (2026-07-10)

Computed from `defects4j/results/<dir>/fixed0/*.json.result` with the uniform
recompute pipeline (AED = char Levenshtein on stripped text; CCR = SequenceMatcher
matching blocks over stripped lines; ATCL/ATCT = ndiff added+deleted lines / tokens
with \b\w+\b|[^\w\s] tokenization). pass1_est = mean over validated bugs of c/10;
pass1_371 counts missing bugs as failures. bug_* = per-bug mean over plausible
candidates, then aggregated across bugs. no-op decomposition on first candidates:
byte-identical / whitespace-only / empty-extraction.

NOTE on the `qwen3-8b`, `qwen3-8b-sft`, and `qwen3-8b-paft` rows below: these are
the directories inside `defects4j.tar.zst`, which are later re-runs and are superseded
for paper-facing purposes by `d4j_qwen3_8b_paper_results_20260710.tar.zst` (see
`open_backbone_results_manifest_20260710.md` for the paper-facing metrics).

The deepseek-6.7b-prompting, deepseek-v3, qwen3-max, and qwen3-8b-paft directories
were completed to 371/371 on 2026-07-10 by re-running the released validation
harness (test_d4j.py, 16 workers, namespace-isolated) on the archived generations.
Reproduce: scripts/compute_d4j_master_metrics.py

|model|n_val|pass1_est|pass1_371|fixed0_pass|pooled_aed|pooled_med_aed|pooled_ccr|pooled_med_ccr|bug_aed|bug_med_aed|bug_ccr|bug_med_ccr|atcl_ds|atcl_re|atct_re|noop_ident|noop_ws|noop_empty|plaus_noop|firstcand_aed|
|deepseek-6.7b|371|5.8|5.8|6.74|142.9|113.0|70.64|75.0|181.17|147.0|64.86|73.32|8.25|7.24|43.17|92|0|0|0|411.48|
|deepseek-6.7b-promptloss|371|7.41|7.41|8.89|105.01|61.0|71.39|77.78|137.57|101.5|64.84|71.05|8.48|6.32|36.07|8|0|0|0|584.63|
|deepseek-6.7b-paft|371|10.13|10.13|11.05|80.66|42.0|76.34|85.42|114.47|69.56|72.5|76.28|6.05|5.07|23.77|32|3|0|0|400.78|
|deepseek-6.7b-trained-curriculum|371|8.25|8.25|7.01|111.17|64.5|68.29|75.0|162.38|102.61|62.99|66.67|8.9|7.35|39.69|6|0|0|0|509.77|
|deepseek-6.7b-paft-assistantonly|371|9.76|9.76|7.55|112.18|78.5|75.07|84.21|143.38|115.0|71.04|76.96|5.04|4.64|32.65|126|15|0|0|207.23|
|deepseek-6.7b-prompting|371|7.92|7.92|7.01|150.77|106.0|71.61|75.0|177.69|140.67|67.81|70.31|8.03|7.01|46.01|12|2|0|0|437.55|
|deepseek-6.7b-repairllama|316|6.99|5.96|6.33|173.29|126.0|47.14|36.36|217.76|165.5|45.54|38.5|25.38|8.6|47.73|6|15|0|0|427.02|
|deepseek-6.7b-adapatcher|371|5.9|5.9|6.74|112.38|61.0|68.57|75.0|151.51|92.5|64.6|66.67|8.8|7.42|42.51|6|0|0|0|509.74|
|deepseek-6.7b-paft-0.0|371|7.25|7.25|6.47|120.15|82.0|75.76|83.33|150.51|123.42|70.31|76.74|6.61|5.76|38.1|35|1|0|0|532.96|
|deepseek-6.7b-paft-4.0|371|8.22|8.22|8.36|106.93|58.0|77.8|87.5|146.32|96.0|72.35|77.78|5.68|5.28|33.4|36|2|0|0|483.38|
|qwen3-8b|371|17.84|17.84|17.79|91.82|30.0|75.91|80.33|117.92|59.25|73.63|78.17|5.85|5.29|25.36|32|35|21|10|123.31|
|qwen3-8b-sft|371|11.73|11.73|11.59|76.85|35.0|77.71|86.36|101.4|56.62|75.52|81.51|5.34|4.68|26.32|21|5|0|0|512.65|
|qwen3-8b-paft|371|11.0|11.0|9.7|64.83|32.5|77.32|85.71|85.42|45.67|76.31|82.61|5.74|4.19|20.83|16|5|0|0|485.19|
|opencoder8b|371|7.92|7.92|7.28|137.92|84.0|76.56|85.71|166.94|122.0|71.07|76.07|8.26|7.12|44.89|1|0|0|0|838.93|
|opencoder8b-sft|371|6.77|6.77|7.82|110.18|61.0|76.77|86.96|122.98|81.0|74.66|84.09|9.46|6.63|36.8|11|1|0|0|762.42|
|opencoder8b-paft|371|9.95|9.95|10.24|78.79|45.0|78.06|85.71|94.81|61.61|75.21|80.28|6.2|5.55|29.51|12|3|0|0|523.86|
|deepseek-v3|371|39.35|39.35|39.08|154.37|74.5|76.56|83.33|203.83|97.65|75.69|81.91|6.58|5.95|40.41|8|2|0|0|273.68|
|qwen3-max|371|28.79|28.79|26.95|118.82|74.0|75.76|82.35|136.88|98.67|72.3|78.93|7.28|5.98|35.0|1|2|0|0|196.53|
