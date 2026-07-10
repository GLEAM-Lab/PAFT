#!/bin/bash

# Ablation table (tab:loss-ablation): DS-Coder-6.7B training-variant results on Defects4J.
# Row -> result-directory mapping for the current (deduplicated) table:
#   Base checkpoint                                  == deepseek-6.7b
#   + full-sequence SFT (stdft)                      == deepseek-6.7b-promptloss
#   + curriculum (w_align = 1.0)                     == deepseek-6.7b-trained-curriculum
#   + preservation weighting (w_align = 2.0, PAFT)   == deepseek-6.7b-paft
#   w_align = 0.0 variant                            == deepseek-6.7b-paft-0.0/deepseek-6.7b-trained-prorepair-0.0
#   w_align = 4.0 variant                            == deepseek-6.7b-paft-4.0/deepseek-6.7b-trained-prorepair-4.0
#   PAFT, assistant-only masking                     == deepseek-6.7b-paft-assistantonly
# Directories deepseek-6.7b-sft and deepseek-6.7b-trained-diff belong to earlier
# exploratory variants that are no longer reported in the table.

set -e

echo "=========================================="
echo "DS-Coder-6.7B Ablation (tab:loss-ablation) Defects4J Results"
echo "=========================================="
echo ""

MODELS=(
    "deepseek-6.7b"
    "deepseek-6.7b-promptloss"
    "deepseek-6.7b-trained-curriculum"
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
