#!/bin/bash

# Table 5: DeepSeek-6.7B training method comparison
# Display results for deepseek-6.7b variants (SFT, Prompting, PAFT, RepairLLaMA, PARepair-FL)
# on Defects4J and HumanEval-Java datasets

set -e

echo "=========================================="
echo "Table 5: Comparison on DeepSeek-Coder-6.7B.Prompting changes only prompting, SFT applies standard fine tuning, and PAFT applies preservation-aware fine tuning."
echo "=========================================="
echo ""

# DeepSeek-6.7B variant list
MODELS=(
    "deepseek-6.7b-sft"
    "deepseek-6.7b-prompting"
    "deepseek-6.7b-paft"
    "deepseek-6.7b-repairllama"
    "deepseek-6.7b-parepair-fl"
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

echo ""
echo "=========================================="
echo "HumanEval-Java Dataset Results"
echo "=========================================="
echo ""

# 2) HumanEval-Java results
for MODEL in "${MODELS[@]}"; do
    echo "------------------------------------------"
    echo "Model: $MODEL"
    echo "------------------------------------------"
    echo "--- calc_java.py results (Pass@k, CCR) ---"
    python calc_java.py "$MODEL"
    echo ""
    echo "--- stats_diff_java.py results (Detailed Diff Statistics) ---"
    python stats_diff_java.py -m "$MODEL"
    echo ""
done

echo "✅ Table 5: DeepSeek-6.7B training method comparison completed!"
