#!/bin/bash

# Baseline comparison table (tab:repairllama-compare): DS-Coder-6.7B generator-level baselines on Defects4J
# Display results for deepseek-6.7b variants (SFT, Prompting, PAFT, RepairLLaMA)
set -e

echo "=========================================="
echo "Table 8:  Comparison on DS-Coder-6.7B for Defects4J. Min@10 (resp. Max@10) selects the plausible patch with the smallest
AED (resp. the largest CCR) among the 𝑘=10 candidates."
echo "=========================================="
echo ""

# DeepSeek-6.7B variant list
MODELS=(
    "deepseek-6.7b"
    "deepseek-6.7b-sft"
    "deepseek-6.7b-prompting"
    "deepseek-6.7b-paft"
    "deepseek-6.7b-repairllama"
    "deepseek-6.7b-adapatcher"
)

# 1) Defects4J results
echo "=========================================="
echo "Defects4J Dataset Results"
echo "=========================================="
echo ""

for MODEL in "${MODELS[@]}"; do
    echo "------------------------------------------"
    echo "Model: $MODEL"
    echo "------------------------------------------"
    python test_d4j.py -m "$MODEL"
    echo ""
done



echo "✅ Table 8: DeepSeek-6.7B training method comparison completed!"
