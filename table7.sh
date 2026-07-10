#!/bin/bash

# HumanEval-Java supplementary results
# View results for multiple models using calc_java.py and stats_diff_java.py

set -e

echo "=========================================="
echo "Table 4: Effectiveness of PAFT on HumanEval Java."
echo "=========================================="
echo ""

# 1) Qwen3 series: base + PAFT + SFT
echo "------------------------------------------"
echo "Qwen3  (qwen3-8b, qwen3-8b-paft, qwen3-8b-sft)"
echo "------------------------------------------"
for MODEL in \
    "qwen3-8b" "qwen3-8b-paft" "qwen3-8b-sft"; do
    echo ""
    echo ">>> Model: $MODEL"
    echo "--- calc_java.py results (Pass@k, CCR) ---"
    python calc_java.py "$MODEL"
    echo ""
    echo "--- stats_diff_java.py results (Detailed Diff Statistics) ---"
    python stats_diff_java.py -m "$MODEL"
    echo ""
done
echo ""

# 2) DeepSeek series: base + PAFT + SFT
echo "------------------------------------------"
echo "DeepSeek  (deepseek-6.7b, deepseek-6.7b-paft, deepseek-6.7b-sft)"
echo "------------------------------------------"
for MODEL in "deepseek-6.7b" "deepseek-6.7b-paft" "deepseek-6.7b-sft"; do
    echo ""
    echo ">>> Model: $MODEL"
    echo "--- calc_java.py results (Pass@k, CCR) ---"
    python calc_java.py "$MODEL"
    echo ""
    echo "--- stats_diff_java.py results (Detailed Diff Statistics) ---"
    python stats_diff_java.py -m "$MODEL"
    echo ""
done
echo ""

# 3) OpenCoder series: base + PAFT + SFT
echo "------------------------------------------"
echo "OpenCoder  (opencoder8b, opencoder8b-paft, opencoder8b-sft)"
echo "------------------------------------------"
for MODEL in "opencoder8b" "opencoder8b-paft" "opencoder8b-sft"; do
    echo ""
    echo ">>> Model: $MODEL"
    echo "--- calc_java.py results (Pass@k, CCR) ---"
    python calc_java.py "$MODEL"
    echo ""
    echo "--- stats_diff_java.py results (Detailed Diff Statistics) ---"
    python stats_diff_java.py -m "$MODEL"
    echo ""
done
echo ""

echo "✅ Table 4: HumanEval-Java dataset results displayed!"
