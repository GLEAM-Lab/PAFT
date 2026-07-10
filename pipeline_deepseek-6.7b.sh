#!/bin/bash

# ============================================================================
# Complete Pipeline: From Model Fine-tuning to Final Result Evaluation
# Example: deepseek-6.7b
# ============================================================================
#
# This script includes the following steps:
# 1. Model training (using LCS-weighted training)
# 2. Defects4J inference (generate patches)
# 3. Defects4J validation and evaluation
# 4. HumanEval-Java inference (generate patches)
# 5. HumanEval-Java evaluation
#
# Usage:
#   ./pipeline_deepseek-6.7b.sh [--skip-training] [--skip-inference] [--skip-eval]
#
# Parameters:
#   --skip-training:  Skip training step (if model is already trained)
#   --skip-inference: Skip inference step (if generation results already exist)
#   --skip-eval:      Skip evaluation step (if only viewing results)
# ============================================================================

set -e

# ============================================================================
# Configuration Parameters (modify according to actual needs)
# ============================================================================

# Model configuration
# BASE_MODEL can be:
#   - HuggingFace model name (e.g., "deepseek-ai/deepseek-coder-6.7b-instruct")
#   - Local model path (e.g., "model/deepseek-coder-6.7b")
BASE_MODEL="model/deepseek-coder-6.7b"  # Base model (HuggingFace name or local path under model/ directory)
TRAINED_MODEL_NAME="deepseek-6.7b-paft"  # Trained model name
TRAIN_DATASET="data/trainset/ds_llm_sorted_by_diff.json"  # actual training input (prompt <|EOT|> response <|EOT|> format, sorted by line-diff size)

# Inference configuration
NUM_PROCESSES=4  # Number of parallel processes (adjust according to GPU count)
NUM_GENERATIONS=10  # Number of patches generated per bug
GPU_ID="0"  # GPU ID (for multi-GPU, can be set to "0,1,2,3")

# LCS training weight (optional, default 2.0)
LCS_WEIGHT=${LCS_WEIGHT:-2.0}

SKIP_TRAINING=false
SKIP_INFERENCE=false
SKIP_EVAL=false

for arg in "$@"; do
    case $arg in
        --skip-training) SKIP_TRAINING=true ;;
        --skip-inference) SKIP_INFERENCE=true ;;
        --skip-eval) SKIP_EVAL=true ;;
    esac
done

# ============================================================================
# Step 1: Model Training
# ============================================================================

if [ "$SKIP_TRAINING" = false ]; then
    echo "Step 1: Model Training"
    LCS_WEIGHT=$LCS_WEIGHT python SingleTrainWithLCS.py \
        "$BASE_MODEL" \
        "$TRAIN_DATASET" \
        "$TRAINED_MODEL_NAME"
    echo ""
fi

# ============================================================================
# Step 2: Defects4J Inference
# ============================================================================

if [ "$SKIP_INFERENCE" = false ]; then
    echo "Step 2: Defects4J Inference"
    for ((i=0; i<$NUM_PROCESSES; i++)); do
        python defects4j.py \
            "$TRAINED_MODEL_NAME" \
            "$NUM_PROCESSES" \
            "$i" \
            "$GPU_ID" \
            "$NUM_GENERATIONS" \
            > "defects4j/results/${TRAINED_MODEL_NAME}/inference_${i}.log" 2>&1 &
    done
    wait
    echo ""
fi

# ============================================================================
# Step 3: Defects4J Validation and Evaluation
# ============================================================================

if [ "$SKIP_EVAL" = false ]; then
    echo "Step 3: Defects4J Validation and Evaluation"
    python test_d4j.py -m "$TRAINED_MODEL_NAME" -n "$NUM_GENERATIONS"
    echo ""
fi

# ============================================================================
# Step 4: HumanEval-Java Inference
# ============================================================================

if [ "$SKIP_INFERENCE" = false ]; then
    echo "Step 4: HumanEval-Java Inference"
    for ((i=0; i<$NUM_PROCESSES; i++)); do
        python inference_java.py \
            "$TRAINED_MODEL_NAME" \
            "$NUM_PROCESSES" \
            "$i" \
            "$GPU_ID" \
            "$NUM_GENERATIONS" \
            > "evalrepair-java-res/${TRAINED_MODEL_NAME}/inference_${i}.log" 2>&1 &
    done
    wait
    echo ""
fi

# ============================================================================
# Step 5: HumanEval-Java Evaluation
# ============================================================================

if [ "$SKIP_EVAL" = false ]; then
    echo "Step 5: HumanEval-Java Evaluation"
    python calc_java.py "$TRAINED_MODEL_NAME" rejudge
    python stats_diff_java.py -m "$TRAINED_MODEL_NAME"
    echo ""
fi

