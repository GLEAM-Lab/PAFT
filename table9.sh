#!/bin/bash

# Ablation table (tab:loss-ablation): DS-Coder-6.7B training-variant results on Defects4J.
# Row -> result-directory mapping for the current table:
#   Base checkpoint (no fine-tuning)                     == deepseek-6.7b
#   stdft: full-sequence loss, w_align = 1.0             == deepseek-6.7b-promptloss
#   PAFT: full-sequence loss, w_align = 2.0              == deepseek-6.7b-paft
#   w_align = 0.0 variant                                == deepseek-6.7b-paft-0.0/deepseek-6.7b-trained-prorepair-0.0
#   w_align = 4.0 variant                                == deepseek-6.7b-paft-4.0/deepseek-6.7b-trained-prorepair-4.0
#   assistant-only loss variant (w_align = 2.0)          == deepseek-6.7b-paft-assistantonly
#   assistant-only loss, uniform weights (w_align = 1.0) == dscoder67b_assistantonly_w1_20260711 (archive in analysis_outputs)
# Directories deepseek-6.7b-sft and deepseek-6.7b-trained-diff belong to earlier
# exploratory variants that are no longer reported in the table.
# deepseek-6.7b-trained-curriculum is no longer reported either: the manuscript no
# longer claims an edit-difficulty curriculum (the released trainer uses the HF
# Trainer's default random sampler, so sorting the input file does not order the
# traversal). That directory is an independent w_align = 1.0 full-sequence-loss run
# under a different effective example order; see
# analysis_outputs/tse_run_identity_mapping_20260706.md (2026-07-10 addendum).

set -e

echo "=========================================="
echo "DS-Coder-6.7B Ablation (tab:loss-ablation) Defects4J Results"
echo "=========================================="
echo ""

MODELS=(
    "deepseek-6.7b"
    "deepseek-6.7b-promptloss"
    "deepseek-6.7b-paft"
    "deepseek-6.7b-paft-0.0/deepseek-6.7b-trained-prorepair-0.0"
    "deepseek-6.7b-paft-4.0/deepseek-6.7b-trained-prorepair-4.0"
    "deepseek-6.7b-paft-assistantonly"
)

for MODEL in "${MODELS[@]}"; do
    echo "------------------------------------------"
    echo "Model: $MODEL"
    echo "------------------------------------------"
    python test_d4j.py -m "$MODEL" -n 10
    echo ""
done

echo "Ablation table results displayed."
