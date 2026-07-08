# PAFT Artifact

This repository contains the implementation and public artifact for PAFT
(Preservation-Aware Fine-Tuning), a fine-tuning workflow for minimal-edit
program repair.

## What Is Included

- Core training and inference code: `SingleTrainWithLCS.py`,
  `merge_adapter.py`, `defects4j.py`, `test_d4j.py`, `inference_java.py`,
  `calc_java.py`, and `stats_diff_java.py`.
- Benchmark-facing assets and scripts for Defects4J and HumanEval-Java:
  `defects4j/`, `evalrepair-java/`, and `table*.sh`.
- TSE revision evidence and audit summaries under `analysis_outputs/`.
- Reproduction and audit utilities under `scripts/`.

Large model weights, tokenizer snapshots, generated logs, and full raw result
directories are intentionally excluded from Git. The scripts expect those assets
to be downloaded or regenerated locally.

## Key Reproduction Commands

```bash
# Original DS-Coder-6.7B training/evaluation pipeline
./pipeline_deepseek-6.7b.sh

# Reuse an existing trained model and run downstream stages
./pipeline_deepseek-6.7b.sh --skip-training

# Validate Defects4J generations and compute repair metrics
python test_d4j.py -m <model-name> -n 10

# Re-evaluate HumanEval-Java outputs
python calc_java.py <model-name> rejudge
python stats_diff_java.py -m <model-name>
```

## TSE Revision Evidence

The fixed-seed evidence used for the journal revision is summarized in:

- `analysis_outputs/tse_fixed_seed_manifest.md`
- `analysis_outputs/tse_current_evidence_summary.md`
- `analysis_outputs/tse_evidence_artifact_check.md`

Statistical analyses added for the revision (paired bootstrap + McNemar,
common-plausible-subset AED/CCR, alignment coverage), plus the mapping between
result directories and manuscript table rows:

- `analysis_outputs/tse_d4j_significance_common_plausible_20260706.md`
  (reproduce: `pip install Levenshtein` then
  `python scripts/tse_d4j_significance_common_plausible.py --root .`)
- `analysis_outputs/tse_alignment_coverage_20260706.md`
  (reproduce: `pip install transformers sentencepiece` then
  `python scripts/tse_alignment_coverage.py --trainset data/trainset`)
- `analysis_outputs/tse_run_identity_mapping_20260706.md`
  (directory-to-table mapping and open metric anomalies to reconcile)

The local paper-readiness gate, which expects the separate `tse-paper/`
manuscript checkout to exist next to the artifact files, is:

```bash
scripts/check_tse_ready.sh
```

## Environment Notes

Training requires a CUDA GPU with at least 24 GB VRAM, Python 3.8+, PyTorch,
Transformers, PEFT, bitsandbytes, and benchmark dependencies such as Defects4J.
Set model and dataset paths explicitly in scripts or command-line arguments; do
not commit local credentials, API keys, checkpoints, or generated model files.
