#!/usr/bin/env python3
from huggingface_hub import snapshot_download


if __name__ == "__main__":
    path = snapshot_download(
        "deepseek-ai/DeepSeek-Coder-V2-Lite-Instruct",
        local_dir="/home/barty/modelscope_models/DeepSeek-Coder-V2-Lite-Instruct",
        endpoint="https://hf-mirror.com",
        max_workers=4,
        ignore_patterns=["*.md", ".gitattributes"],
    )
    print(path)
