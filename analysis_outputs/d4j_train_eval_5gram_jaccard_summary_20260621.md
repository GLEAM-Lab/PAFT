# Near-Duplicate Leakage Check

- Train snippets: 2378
- Evaluation snippets: 742
- Token n-gram size: 5
- Max Jaccard: 0.110169
- Pairs above threshold 0.60: 0
- Top-k CSV: `analysis_outputs/d4j_train_eval_5gram_jaccard_top100_20260621.csv`

| rank | Jaccard | eval | eval side | train | train side |
|---:|---:|---|---|---|---|
| 1 | 0.110169 | Jsoup-43 | eval_fixed | deepseek_llm_pairs_alt_format.json:58:0 | train_buggy |
| 2 | 0.107438 | Jsoup-43 | eval_buggy | deepseek_llm_pairs_alt_format.json:58:0 | train_buggy |
| 3 | 0.103175 | Jsoup-43 | eval_fixed | deepseek_llm_pairs_alt_format.json:425:0 | train_buggy |
| 4 | 0.100775 | Jsoup-43 | eval_buggy | deepseek_llm_pairs_alt_format.json:425:0 | train_buggy |
| 5 | 0.092857 | Jsoup-43 | eval_fixed | deepseek_llm_pairs_alt_format.json:61:0 | train_buggy |
| 6 | 0.090909 | Jsoup-43 | eval_buggy | deepseek_llm_pairs_alt_format.json:61:0 | train_buggy |
| 7 | 0.090909 | Jsoup-43 | eval_fixed | deepseek_llm_pairs_alt_format.json:1194:0 | train_buggy |
| 8 | 0.089041 | Jsoup-43 | eval_buggy | deepseek_llm_pairs_alt_format.json:1194:0 | train_buggy |
| 9 | 0.089041 | Jsoup-43 | eval_fixed | deepseek_llm_pairs_alt_format.json:723:0 | train_buggy |
| 10 | 0.087248 | Jsoup-43 | eval_buggy | deepseek_llm_pairs_alt_format.json:723:0 | train_buggy |
