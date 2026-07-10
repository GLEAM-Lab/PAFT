#!/bin/bash

# RQ1 off-the-shelf table (tab:defects4j-noft): Defects4J results for off-the-shelf models
# View results for multiple models using test_d4j.py

set -e

# List of models to display
MODELS=("qwen3-8b" "deepseek-v3" "opencoder8b" "qwen3-max" "deepseek-6.7b")

echo "=========================================="
echo "Table 1: Performance of off-the-shelf code models on Defects4J benchmark"
echo "=========================================="
echo ""

# Call test_d4j.py for each model
for MODEL in "${MODELS[@]}"; do
    echo "Viewing results for $MODEL..."
    python test_d4j.py -m "$MODEL" 
    echo ""
done

echo "✅ All model results displayed!"