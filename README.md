# PAFT

PAFT (Preservation-Aware Fine-Tuning) is an automated program repair (APR) system that leverages LCS-weighted fine-tuning to encourage models to preserve original code structure while generating patches. This repository contains the implementation and experimental scripts for reproducing the results presented in our paper.

## Overview

PAFT consists of three main phases:
1. **Model Training**: Fine-tunes code LLMs using LCS-weighted loss to encourage preservation of common code structures between buggy and fixed code
2. **Patch Generation**: Generates candidate patches for buggy code using fine-tuned models on Defects4J and HumanEval-Java datasets
3. **Patch Validation**: Validates generated patches against test suites and evaluates repair effectiveness using metrics like Pass@k, CCR  and AED 




## Quick Start
### View results
   ```bash
   # Table 2:  Performance of off-the-shelf code models on De-fects4J. Best results in each column are shown in bold.
   ./table2.sh

   # Table 3-5: Human annotation results
   ./table3-5.sh

   # Table 6:  Multi-model Defects4J results comparison
   ./table6.sh
   
   # Table 7: HumanEval-Java results
   ./table7.sh
   
   # Table 8: Comparison on DS-Coder-6.7B for Defects4J. Min@10 (resp. Max@10) selects the plausible patch with the smallest AED (resp. the largest CCR) among the 𝑘=10 candidates.
   ./table5.sh
   
   # Table 9: DeepSeek-6.7B ablation study Defects4J results
   ./table9.sh
   ```
###  Run complete training and evaluation pipeline
   ```bash
   # Complete execution
   ./pipeline_deepseek-6.7b.sh

   # Skip certain steps
   ./pipeline_deepseek-6.7b.sh --skip-training      # Skip training
   ./pipeline_deepseek-6.7b.sh --skip-inference     # Skip inference
   ./pipeline_deepseek-6.7b.sh --skip-eval          # Skip evaluation
   ```

## Repository Structure

```
PAFT/
├── defects4j/                    # Defects4J dataset
│   ├── dataset/                  # Original dataset 
│   ├── dataset_fillme/           # Fill-me template dataset 
│   └── results/                  # Model generation results

│
├── evalrepair-java-res/          # HumanEval-Java evaluation results
│   └── {model}/                  # Results directory for each model
│       ├── fixed0/               # Results from 0th repair attempt
│       │   ├── {bug_id}.java    # Repaired code
│       │   ├── {bug_id}.result  # Test results
│       │   └── {bug_id}.log     # Generation log
│       └── ...
│
├── evalrepair-java/              # HumanEval-Java dataset
│
├── data/trainset/                # Training dataset
│   ├── deepseek_llm_diff.json
│   ├── qwen_llm_diff.json
│   └── ...
│
├── scripts/                      # Analysis scripts
│   ├── labels_pairs.py          # Human annotation evaluation script
│   └── sample_50_*.json         # Sample datasets and annotation files
│
├── model/                        # Base model files (download required)
│   └── deepseek-coder-6.7b/
│
├── merged_models/                # Trained models (merged adapters)
│   └── {model_name}/            # Merged model directories

│
├── defects4j.py                  # Defects4J inference script (local models)
├── inference_java.py              # HumanEval-Java inference script
├── calc_java.py                 # HumanEval-Java evaluation script
├── stats_diff_java.py           # Diff statistics script
├── test_d4j.py                  # Defects4J validation and statistics script
├── SingleTrainWithLCS.py        # Model training script (LCS-weighted)
├── merge_adapter.py             # Merge LoRA adapter with base model
│
├── table1.sh                     # Table 1: Defects4J results
├── table2.sh                     # Table 2: Human annotation results
├── table3.sh                     # Table 3: Multi-model Defects4J comparison
├── table4.sh                     # Table 4: HumanEval-Java results
├── table5.sh                     # Table 5: DeepSeek-6.7B training method comparison
├── table6.sh                     # Table 6: DeepSeek-6.7B ablation study Defects4J results
├── pipeline_deepseek-6.7b.sh     # Complete pipeline: training to evaluation (deepseek-6.7b example)
└── README.md                     # This document
```

### Key Components

- **`defects4j/`**: Defects4J benchmark dataset with buggy code and test suites
- **`evalrepair-java/`**: HumanEval-Java dataset with buggy code and test cases
- **`model/`**: Base model files (pre-trained models, download required)
- **`merged_models/`**: Trained models after merging adapters (final models ready for inference)
- **`results/`**: Generated patches and per-model/per-bug artifacts
- **`table*.sh`**: Main entry points for reproducing each table in the paper
- **`pipeline_deepseek-6.7b.sh`**: Complete pipeline from training to evaluation
- **Core scripts**: `SingleTrainWithLCS.py`, `merge_adapter.py`, `defects4j.py`, `inference_java.py`, `test_d4j.py`, `calc_java.py`, `stats_diff_java.py`
- **Analysis scripts**: `scripts/labels_pairs.py` for human annotation evaluation

**Evaluation metrics:**
- **Pass@k** (k ∈ {1, 5, 10}): Repair success rate
- **CCR (Code Churn Rate)**: Percentage of original code lines preserved in patches
- **AED (Absolute Edit Distance)**: Levenshtein distance between buggy and fixed code
- **ATCT (Average Total Changed Tokens)**: Total number of changed tokens
- **ATCL (Average Total Changed Lines)**: Total number of changed lines

## Reproducing Tables

### Table 2: Performance of Off-the-Shelf Code Models on Defects4J

This table evaluates the performance of various off-the-shelf code models on the Defects4J benchmark without fine-tuning.

**Models evaluated:**
- **qwen3-8b**: Qwen3 8B parameter model
- **deepseek-coder-6.7b**: DeepSeek 6.7B parameter model
- **deepseek-v3**: DeepSeek-V3 commercial model
- **opencoder8b**: OpenCoder 8B model
- **qwen3-max**: Qwen3 Max commercial model



Run the command:

```bash
./table2.sh
```

For details and options, see the script content.

### Table 3-5: Human Annotation Study Results

This table presents results from human annotation studies evaluating the correlation between automatic metrics (CCR, AED, ATCT, ATCL) and human preferences for patch quality.

**Evaluation dimensions:**
1. **Sample data statistics**: Distribution of samples across different metric categories
2. **Human annotation statistics**: Label distribution ('a' vs 'b' preferences)
3. **Evaluation metrics**: Accuracy, Precision, Recall, F1 score comparing human annotations with automatic metric predictions

**Sample files:**
- `sample_50_aed_unomal.json`, `sample_50_ccr_unomal.json`, `sample_50_atct_unomal.json`, `sample_50_atcl_unomal.json`
- `sample_50_labels_*.json`: Human annotation files
- `sample_50_labels_*.json.eval.json`: Evaluation results

Run the command:

```bash
./table3-5.sh
```

For details and options, see the script content.

### Table 6: Effectiveness of PAFT on Defects4J

This table evaluates the effectiveness of PAFT (Preservation-Aware Fine-Tuning) compared to standard fine-tuning (SFT) and base models on Defects4J.

**Models evaluated:**
- **Qwen3 series**: qwen3-8b, qwen3-8b-paft, qwen3-8b-sft, qwen3-4b, qwen3-4b-paft, qwen3-4b-sft
- **DeepSeek series**: deepseek-6.7b, deepseek-6.7b-paft, deepseek-6.7b-sft
- **OpenCoder series**: opencoder8b, opencoder8b-paft, opencoder8b-sft

**Comparison:**
- **Base**: Original pre-trained models without fine-tuning
- **PAFT**: Models fine-tuned with LCS-weighted loss (preservation-aware)
- **SFT**: Models fine-tuned with standard fine-tuning

Run the command:

```bash
./table6.sh
```

For details and options, see the script content.

### Table 7: Effectiveness of PAFT on HumanEval-Java

This table evaluates the effectiveness of PAFT on HumanEval-Java dataset, measuring both repair success rate and patch quality metrics.

**Models evaluated:**
- Same model series as Table 3 (Qwen3, DeepSeek, OpenCoder with base, PAFT, and SFT variants)



Run the command:

```bash
./table7.sh
```

For details and options, see the script content.

### Table 5: Comparison on DS-Coder-6.7B for Defects4J. Min@10 (resp. Max@10) selects the plausible patch with the smallest AED (resp. the largest CCR) among the 𝑘=10 candidates.
# Display results for deepseek-6.7b variants (SFT, Prompting, PAFT, RepairLLaMA)

This table compares different training methods on DeepSeek-Coder-6.7B across both Defects4J and HumanEval-Java datasets.

**Training methods compared:**
- **base checkpoint**: base model
- **Prompting**: Prompt-only approach without fine-tuning
- **SFT**: Standard fine-tuning
- **PAFT**: Preservation-aware fine-tuning (our approach)
- **RepairLLaMA**: RepairLLaMA fine-tuning method
- **AdaPatcher**: AdaPatcher fine-tuning method


Run the command:

```bash
./table8.sh
```

For details and options, see the script content.

### Table 9: Ablation Study on DeepSeek-Coder-6.7B

This table presents ablation study results on DeepSeek-Coder-6.7B, evaluating different components and variants of PAFT.

**Variants evaluated:**
- **deepseek-6.7b**: Base model without fine-tuning
- **deepseek-6.7b-paft**: Full PAFT with LCS-weighted(2) loss
- **deepseek-6.7b-promptloss**: Variant with prompt loss only
- **deepseek-6.7b-trained-curriculum**: Curriculum learning variant
- **deepseek-6.7b-paft-w0**: PAFT with 0 LCS weight
- **deepseek-6.7b-paft-assistantonly**: PAFT with 2 LCS weight and assistantonly
- **deepseek-6.7b-paft-w4**: PAFT with 4 LCS weight
- **deepseek-6.7b-promptloss**: Standard fine-tuning baseline+ Full masking
- **deepseek-6.7b-trained-diff**: PAFT with - Full masking

- **deepseek-6.7b-sft**: Standard fine-tuning baseline


Run the command:

```bash
./table9.sh
```

For details and options, see the script content.

## Model Training

PAFT uses LCS (Longest Common Subsequence) weighted training to encourage models to preserve original code structure while generating patches.

### Step 1: Fine-tuning with LCS-weighted Loss

```bash
# Basic usage
python SingleTrainWithLCS.py <model_name> <dataset.json> <output_name>

# Custom LCS weight (default: 2.0)
LCS_WEIGHT=2.0 python SingleTrainWithLCS.py model/deepseek-coder-6.7b data/trainset/deepseek_llm_diff.json deepseek-6.7b-trained
```

**Configuration**: 4-bit QLoRA, r=32, alpha=16, dropout=0.05, learning rate 2e-4, 3 epochs

### Step 2: Merge LoRA Adapter (Optional)

After training, merge the LoRA adapter with the base model to create a standalone model:

```bash
python merge_adapter.py \
    --base_model model/deepseek-coder-6.7b \
    --adapter_path models/deepseek-6.7b-trained \
    --output_path merged_models/deepseek-6.7b-paft
```

**Note**: The training script saves adapters to `models/{output_name}` directory. The merged model can be used directly for inference without loading the adapter separately.
  
## Notice
This project is released under the MIT License and is intended for research use only. Please review the license before using the code or data in other contexts.
