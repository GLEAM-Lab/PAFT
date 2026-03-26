#!/bin/bash

# Table 9: DeepSeek-6.7B ablation study Defects4J results
# Display results for deepseek-6.7b training variants on Defects4J dataset

set -e

echo "=========================================="
echo "Table 6: DeepSeek-6.7B Ablation Study Defects4J Results"
echo "=========================================="
echo ""

# DeepSeek-6.7B ablation study variant list
#deepseek-6.7b==Base checkpoint 
#deepseek-6.7b-sft==+ Fine-tuning
#deepseek-6.7b-promptloss==+ Full masking
#deepseek-6.7b-trained-diff==- Full masking
#deepseek-6.7b-trained-curriculum==+ Curriculum，PAFT (𝑤align = 1.0) 
#deepseek-6.7b-paft==PAFT，PAFT (𝑤align = 2.0)
#deepseek-6.7b-paft-assistantonly==PAFT (assistant-only, 𝑤align = 2.0) 
#
MODELS=(
    "deepseek-6.7b"
    "deepseek-6.7b-sft"
    "deepseek-6.7b-paft"
    "deepseek-6.7b-promptloss"
    "deepseek-6.7b-trained-curriculum"
    "deepseek-6.7b-trained-diff"
    "deepseek-6.7b-paft-w0.0"
    "deepseek-6.7b-paft-assistantonly"
    "deepseek-6.7b-paft-w4.0"
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
