#!/bin/bash

# Table 3: Multi-model Defects4J results comparison
# View results for qwen3-8b, qwen3-4b, opencoder8b, deepseek-6.7b and their variants (paft, sft) using test_d4j.py

set -e

echo "=========================================="
echo "Table 3: Effectiveness of PAFT on Defects4J."
echo "=========================================="
echo ""

# 1) Qwen3 series: base + PAFT + SFT
echo "------------------------------------------"
echo "Qwen3  (qwen3-8b, qwen3-8b-paft, qwen3-8b-sft, qwen3-4b, qwen3-4b-paft, qwen3-4b-sft)"
echo "------------------------------------------"
for MODEL in \
    "qwen3-8b" "qwen3-8b-paft" "qwen3-8b-sft" \
    "qwen3-4b" "qwen3-4b-paft" "qwen3-4b-sft"; do
    echo ""
    echo ">>> Model: $MODEL"
    python test_d4j.py -m "$MODEL"
done
echo ""

# 2) DeepSeek series: base + PAFT + SFT
echo "------------------------------------------"
echo "DeepSeek  (deepseek-6.7b, deepseek-6.7b-paft, deepseek-6.7b-sft)"
echo "------------------------------------------"
for MODEL in "deepseek-6.7b" "deepseek-6.7b-paft" "deepseek-6.7b-sft"; do
    echo ""
    echo ">>> Model: $MODEL"
    python test_d4j.py -m "$MODEL"
done
echo ""

# 3) OpenCoder series: base + PAFT + SFT
echo "------------------------------------------"
echo "OpenCoder  (opencoder8b, opencoder8b-paft, opencoder8b-sft)"
echo "------------------------------------------"
for MODEL in "opencoder8b" "opencoder8b-paft" "opencoder8b-sft"; do
    echo ""
    echo ">>> Model: $MODEL"
    python test_d4j.py -m "$MODEL"
done
echo ""

echo "✅ Table 3: Multi-model Defects4J results displayed!"
