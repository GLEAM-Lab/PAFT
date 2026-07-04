# Repository Guidelines

## Project Structure & Module Organization

This repository implements PAFT, a preservation-aware fine-tuning workflow for program repair. Core training and evaluation scripts live at the repository root: `SingleTrainWithLCS.py` trains LoRA/PAFT models, `merge_adapter.py` merges adapters, `defects4j.py` generates Defects4J patches, `test_d4j.py` validates them, and `inference_java.py`, `calc_java.py`, and `stats_diff_java.py` handle HumanEval-Java. Benchmark assets are under `defects4j/` and `evalrepair-java/`; generated outputs usually go to `defects4j/results/`, `evalrepair-java-res/`, `analysis_outputs/`, `logs/`, and `models/`. Utility and audit scripts are in `scripts/`. The journal manuscript is maintained in the separate `tse-paper/` worktree; this public artifact repository tracks code, scripts, and small evidence summaries.

## Build, Test, and Development Commands

- `./pipeline_deepseek-6.7b.sh`: run the full DeepSeek 6.7B training, inference, and evaluation pipeline.
- `./pipeline_deepseek-6.7b.sh --skip-training`: reuse an existing trained model and run later stages.
- `python test_d4j.py -m <model-name> -n 10`: validate Defects4J generations and compute repair metrics.
- `python calc_java.py <model-name> rejudge && python stats_diff_java.py -m <model-name>`: re-evaluate HumanEval-Java results.
- `./table2.sh`, `./table3-5.sh`, `./table6.sh`, etc.: reproduce paper tables from existing artifacts.
- `python scripts/run_quixbugs_python.py --model-id <model> --mode all --n-samples 5`: run the QuixBugs-Python sanity benchmark.

## Coding Style & Naming Conventions

Use Python 3, four-space indentation, and descriptive snake_case names. Keep scripts CLI-driven with explicit model names, dataset paths, GPU IDs, and output directories. Prefer structured parsing and existing metric helpers over ad hoc string matching. Shell scripts should use clear variable blocks near the top and avoid hard-coded machine-specific paths when possible.

## Testing Guidelines

Before committing evaluation changes, run the smallest relevant benchmark slice, then the full metric command for affected outputs. For metric code, verify both pass/fail behavior and AED/CCR summaries. Keep generated checkpoints, logs, and raw benchmark outputs out of commits unless they are intentionally small reference artifacts.

## Commit & Pull Request Guidelines

Recent commits use short imperative summaries such as `Record incremental validation progress` or `Harden parallel D4J validation`. Follow that style: state the concrete change, not the motivation. Pull requests should describe affected scripts, required data/model paths, commands run, and any metric deltas. Include table or benchmark excerpts when changing evaluation behavior.

## Security & Configuration Tips

Do not commit API keys, SSH credentials, `.run_secrets/`, `.env*`, model weights, or large generated artifacts. Respect `.gitignore` for `models/`, `tokenizers/`, `logs/`, `wandb/`, `tmp/`, and benchmark result directories.
