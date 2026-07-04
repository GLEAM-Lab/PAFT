#!/usr/bin/env bash
set -euo pipefail

cd "$(dirname "$0")/.."

python3 scripts/audit_tse_paper_numbers.py
python3 scripts/check_tse_citations.py
python3 scripts/check_tse_tex_static.py
python3 scripts/check_tse_claim_hygiene.py

python3 -m py_compile \
  scripts/audit_tse_paper_numbers.py \
  scripts/check_tse_citations.py \
  scripts/check_tse_claim_hygiene.py \
  scripts/check_tse_tex_static.py \
  scripts/fix_tse_tex_mojibake.py \
  scripts/summarize_tse_current_evidence.py \
  scripts/summarize_humanevalpack_python_results.py \
  scripts/audit_system_level_swap_feasibility.py \
  scripts/summarize_multiswe_java_verified.py \
  scripts/prepare_multiswe_oracle_contexts.py \
  scripts/prepare_multiswe_eval_files.py \
  scripts/generate_multiswe_oracle_vllm.py \
  scripts/summarize_multiswe_oracle_generations.py \
  scripts/normalize_humaneval_java_packages.py \
  scripts/parallel_humaneval_java_rejudge.py \
  scripts/check_near_duplicate_leakage.py \
  scripts/check_tse_evidence_artifacts.py \
  scripts/remote_generate_d4j_vllm.py \
  scripts/fill_d4j_missing_json_from_logs.py \
  scripts/recompute_d4j_metrics.py \
  scripts/tse_fixed_seed_manifest.py \
  scripts/check_d4j_output_format.py \
  scripts/fast_humaneval_java_generate_vllm.py \
  scripts/summarize_quixbugs_python.py \
  scripts/run_quixbugs_python.py \
  scripts/run_humanevalpack_python.py \
  SingleTrainWithLCS.py

bash -n \
  scripts/smoke_compile_tse_tex.sh \
  scripts/cleanup_intermediate_outputs.sh \
  scripts/tse_d4j_output_format_gate.sh \
  scripts/check_tse_ready.sh \
  analysis_outputs/logs/run_d4j_qwen14_oldrecipe_n5_generate_gpu1_20260703.sh \
  analysis_outputs/logs/watch_validate_d4j_qwen14_oldrecipe_n5_20260703.sh \
  analysis_outputs/logs/run_d4j_qwen14_oldrecipe_w2_n5_gpu1_20260703.sh \
  analysis_outputs/logs/watch_validate_d4j_qwen14_oldrecipe_w2_n5_20260703.sh \
  analysis_outputs/logs/run_d4j_qwen14_oldrecipe_w2_n10_gpu1_20260703.sh \
  analysis_outputs/logs/watch_validate_d4j_qwen14_oldrecipe_w2_n10_20260703.sh \
  analysis_outputs/logs/run_d4j_qwen14_base_n10_gpu0_20260703.sh \
  analysis_outputs/logs/run_d4j_qwen14_sft_n10_gpu0_after_base_20260703.sh \
  analysis_outputs/logs/run_d4j_qwen14_oldrecipe_remaining_n10_gpu1_20260703.sh \
  analysis_outputs/logs/validate_d4j_qwen14_oldrecipe_w15_n10_20260703.sh \
  analysis_outputs/logs/watch_validate_d4j_qwen14_oldrecipe_n10_all_20260703.sh \
  analysis_outputs/logs/run_d4j_qwen14_oldrecipe_n10_seed7402_gpu1_20260704.sh \
  analysis_outputs/logs/run_d4j_qwen14_oldrecipe_w2_n10_seed7402_gpu0_20260704.sh \
  analysis_outputs/logs/run_d4j_qwen14_oldrecipe_sft_n10_seed7402_gpu1_20260704.sh \
  analysis_outputs/logs/run_d4j_qwen14_oldrecipe_w15_n10_seed7402_gpu0_after_w2_20260704.sh \
  analysis_outputs/logs/split_d4j_qwen14_seed7402_after_base_20260704.sh \
  analysis_outputs/logs/validate_d4j_qwen14_oldrecipe_w2_n10_seed7402_20260704.sh \
  analysis_outputs/logs/watch_validate_d4j_qwen14_oldrecipe_n10_seed7402_20260704.sh \
  analysis_outputs/logs/watch_validate_d4j_qwen14_oldrecipe_n10_seed7402_split_20260704.sh \
  analysis_outputs/logs/run_hejava_qwen14_oldrecipe_n10_s7302_generate_gpu0_20260704.sh \
  analysis_outputs/logs/watch_hejava_qwen14_oldrecipe_n10_s7302_pkgfix_rejudge_20260704.sh \
  analysis_outputs/logs/run_hejava_qwen14_oldrecipe_n5_s7301_generate_gpu1_20260703.sh \
  analysis_outputs/logs/watch_hejava_qwen14_n5_s7301_pkgfix_rejudge_after_d4j_20260703.sh \
  analysis_outputs/logs/run_quixbugs_qwen14_oldrecipe_seed7106_generate_gpu1_20260703.sh \
  analysis_outputs/logs/run_quixbugs_qwen14_w2_seed7106_gpu0_20260704.sh \
  analysis_outputs/logs/watch_quixbugs_qwen14_seed7106_evaluate_after_hejava_20260703.sh \
  analysis_outputs/logs/run_multiswe_smoke10_qwen14_after_gpu0_free_20260704.sh \
  analysis_outputs/logs/watch_summarize_multiswe_smoke10_20260704.sh \
  analysis_outputs/logs/run_multiswe_smoke10_qwen14_neutral_gpu0_20260704.sh
python3 scripts/tse_fixed_seed_manifest.py
python3 scripts/check_tse_evidence_artifacts.py
python3 scripts/summarize_tse_current_evidence.py
bash scripts/smoke_compile_tse_tex.sh
