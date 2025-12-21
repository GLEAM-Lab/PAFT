#!/bin/bash

# Table 6: DeepSeek-6.7B ablation study Defects4J results
# Display results for deepseek-6.7b training variants on Defects4J dataset

set -e

echo "=========================================="
echo "Table 6: DeepSeek-6.7B Ablation Study Defects4J Results"
echo "=========================================="
echo ""

# DeepSeek-6.7B ablation study variant list
MODELS=(
    "deepseek-6.7b"
    "deepseek-6.7b-paft"
    "deepseek-6.7b-promptloss"
    "deepseek-6.7b-trained-curriculum"
    "deepseek-6.7b-paft-w0"
    "deepseek-6.7b-sft"
)

# Defects4J results
for MODEL in "${MODELS[@]}"; do
    echo "------------------------------------------"
    echo "Model: $MODEL"
    echo "------------------------------------------"
    python test_d4j.py -m "$MODEL"
    echo ""
done

echo "✅ Table 6: DeepSeek-6.7B ablation study Defects4J results displayed!"
