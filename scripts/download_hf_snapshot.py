#!/usr/bin/env python3
"""Download a Hugging Face repository snapshot with resumable workers."""

from __future__ import annotations

import argparse
import os


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("repo_id")
    parser.add_argument("--cache-dir", default="/home/barty/.cache/huggingface/hub")
    parser.add_argument("--endpoint", default="https://hf-mirror.com")
    parser.add_argument("--max-workers", type=int, default=8)
    args = parser.parse_args()

    if args.endpoint:
        os.environ.setdefault("HF_ENDPOINT", args.endpoint)

    from huggingface_hub import snapshot_download

    path = snapshot_download(
        repo_id=args.repo_id,
        cache_dir=args.cache_dir,
        max_workers=args.max_workers,
        resume_download=True,
    )
    print(path)


if __name__ == "__main__":
    main()
