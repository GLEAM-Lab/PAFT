#!/bin/bash

# Table 2: Human annotation results
# Display human annotation files and evaluation results

set -e

echo "=========================================="
echo "Table 2: Human Annotation Study results "
echo "=========================================="
echo ""

# Switch to scripts directory
cd scripts

# Sample data file list (questions)
SAMPLE_FILES=(
    "sample_50_aed_unomal.json"
    "sample_50_ccr_unomal.json"
    "sample_50_atct_unomal.json"
    "sample_50_atcl_unomal.json"
    "sample_50_aed.json"
    "sample_50_ccr.json"
    "sample_50_atct.json"
    "sample_50_atcl.json"
)

# Human annotation file list
LABEL_FILES=(
    "sample_50_labels_aed.json"
    "sample_50_labels_ccr.json"
    "sample_50_labels_atct.json"
    "sample_50_labels_atcl.json"
    "sample_50_labels_aed_unormal.json"
    "sample_50_labels_ccr_unormal.json"
    "sample_50_labels_atct_unormal.json"
    "sample_50_labels_atcl_unormal.json"
)

# Evaluation result file list
EVAL_FILES=(
    "sample_50_labels_aed.json.eval.json"
    "sample_50_labels_ccr.json.eval.json"
    "sample_50_labels_atct.json.eval.json"
    "sample_50_labels_atcl.json.eval.json"
    "sample_50_labels_aed_unormal.json.eval.json"
    "sample_50_labels_ccr_unormal.json.eval.json"
    "sample_50_labels_atct_unormal.json.eval.json"
    "sample_50_labels_atcl_unormal.json.eval.json"
)

# Display sample data statistics (questions)
echo "----------------------------------------"
echo "Sample Data Statistics (Questions)"
echo "----------------------------------------"
for FILE in "${SAMPLE_FILES[@]}"; do
    if [ -f "$FILE" ]; then
        COUNT=$(python -c "import json; print(len(json.load(open('$FILE', 'r', encoding='utf-8'))))" 2>/dev/null || echo "0")
        echo "$FILE: $COUNT samples"
    fi
done
echo ""

# Display human annotation statistics
echo "----------------------------------------"
echo "Human Annotation Statistics"
echo "----------------------------------------"

echo ""

# Display evaluation results
echo "----------------------------------------"
echo "Evaluation Results (Human vs Automatic Annotation Consistency)"
echo "----------------------------------------"
for FILE in "${EVAL_FILES[@]}"; do
    if [ -f "$FILE" ]; then
        echo ""
        echo "File: $FILE"
        python -c "
import json
import sys

try:
    with open('$FILE', 'r', encoding='utf-8') as f:
        data = json.load(f)
    
    print(f\"  Metric: {data.get('metric_field', 'N/A')}\")
    print(f\"  Used samples: {data.get('used', 0)}\")
    print(f\"  TP: {data.get('tp', 0)}, FP: {data.get('fp', 0)}, TN: {data.get('tn', 0)}, FN: {data.get('fn', 0)}\")
    print(f\"  Accuracy: {data.get('accuracy', 0):.4f}\")
    print(f\"  Precision: {data.get('precision', 0):.4f}\")
    print(f\"  Recall: {data.get('recall', 0):.4f}\")
    print(f\"  F1: {data.get('f1', 0):.4f}\")
except Exception as e:
    print(f\"  Error reading $FILE: {e}\")
"
    fi
done

echo ""
echo "=========================================="
echo "✅ Human annotation results displayed!"
echo "=========================================="
