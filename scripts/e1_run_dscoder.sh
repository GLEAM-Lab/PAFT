#!/bin/bash
# E1 (TSE revision): gradient-scale-matched SFT controls on DS-Coder-6.7B.
#
# PAFT normalizes its weighted loss by the token count N, so with w_align = 2 the
# per-step loss scale is c = E[sum_t beta_t / N] = 1.2131 on deepseek_llm_train.json
# (scripts/e1_measure_weight_sum.py). The two controls give plain SFT (w_align = 1)
# the same scale in the two ways a reviewer can ask for:
#   A  loss scaled by c            (LOSS_SCALE=1.2131)
#   B  learning rate scaled by c   (LEARNING_RATE=2.426e-4 = 2e-4 * 1.2131)
# C and D re-train the paper's SFT and PAFT recipes with per-step logging so the
# gradient-clipping activation rate (max_grad_norm 0.3) can be read from
# trainer_state.json with scripts/e1_clipping_rate.py.
#
# Usage:  bash scripts/e1_run_dscoder.sh [A|B|C|D ...]   (default: all four)
# Then:   see analysis_outputs/tse_revision_e1_gradient_scale_plan_20260920.md
set -e
BASE_MODEL=${BASE_MODEL:-model/deepseek-coder-6.7b}
TRAIN=${TRAIN:-data/trainset/deepseek_llm_train.json}
C=1.2131
RUNS=${@:-A B C D}
for r in $RUNS; do
  case $r in
    A) LCS_WEIGHT=1.0 LOSS_SCALE=$C      LOGGING_STEPS=1 python SingleTrainWithLCS.py "$BASE_MODEL" "$TRAIN" deepseek-6.7b-sft-lossscale ;;
    B) LCS_WEIGHT=1.0 LEARNING_RATE=2.426e-4 LOGGING_STEPS=1 python SingleTrainWithLCS.py "$BASE_MODEL" "$TRAIN" deepseek-6.7b-sft-lrscale ;;
    C) LCS_WEIGHT=1.0                    LOGGING_STEPS=1 python SingleTrainWithLCS.py "$BASE_MODEL" "$TRAIN" deepseek-6.7b-sft-logged ;;
    D) LCS_WEIGHT=2.0                    LOGGING_STEPS=1 python SingleTrainWithLCS.py "$BASE_MODEL" "$TRAIN" deepseek-6.7b-paft-logged ;;
    *) echo "unknown run $r"; exit 1 ;;
  esac
done
