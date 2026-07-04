#!/usr/bin/env python3
"""Fill Defects4J generation JSONs when logs exist but strict extraction skipped.

The vLLM generator writes a `.json.log` even when historical strict Java-fence
extraction fails. For validation, those candidates should still be represented:
we recover code with the tolerant extractor when possible, otherwise write an
empty fix so the candidate is counted as a failing patch instead of blocking
the whole row.
"""

from __future__ import annotations

import argparse
import json
import re
from pathlib import Path


QWEN_EOF = "<|im_end|>\n<|im_start|>assistant\n"
DEEPSEEK_EOF = "\n### Response:\n"


def extract_first_java_code_tolerant(text: str) -> str:
    match = re.search(r"```java\s*(.*?)(?:```|<\|EOT\|>|<\|im_end\|>|</s>|$)", text, re.DOTALL)
    if match:
        code = match.group(1)
    else:
        code = re.split(r"```|<\|EOT\|>|<\|im_end\|>|</s>", text, maxsplit=1)[0]
        if not re.search(
            r"^\s*(?:@\w+|public|private|protected|static|final|class|interface|enum|if|for|while|try|return|[A-Za-z_$][\w$<>\[\], ?]*\s+[A-Za-z_$][\w$]*\s*\()",
            code,
        ):
            return ""
    code = re.split(r"<\|EOT\|>|<\|im_end\|>|</s>", code, maxsplit=1)[0]
    return "".join(ch for ch in code if ch in "\n\r\t" or ord(ch) >= 32).strip()


def response_segment(full_text: str) -> str:
    for eof in (QWEN_EOF, DEEPSEEK_EOF):
        if eof in full_text:
            return full_text.split(eof)[-1]
    marker = "<|im_start|>assistant"
    if marker in full_text:
        return full_text.split(marker)[-1]
    return full_text


def fill_model(model: str, dataset_dir: Path, output_root: Path) -> tuple[int, int]:
    model_root = output_root / model
    filled = 0
    recovered = 0
    for log_path in sorted(model_root.glob("fixed*/*.json.log")):
        json_path = Path(str(log_path)[:-4])
        if json_path.exists():
            continue
        dataset_path = dataset_dir / json_path.name
        if not dataset_path.exists():
            continue
        item = json.loads(dataset_path.read_text(encoding="utf-8"))
        full_text = log_path.read_text(encoding="utf-8", errors="replace")
        fix = extract_first_java_code_tolerant(response_segment(full_text))
        if fix:
            recovered += 1
        result = dict(item)
        result["fix"] = fix
        json_path.write_text(json.dumps(result, indent=2, ensure_ascii=False), encoding="utf-8")
        filled += 1
    return filled, recovered


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("--model", required=True)
    parser.add_argument("--dataset", default="defects4j/dataset")
    parser.add_argument("--output-root", default="defects4j/results")
    args = parser.parse_args()

    filled, recovered = fill_model(args.model, Path(args.dataset), Path(args.output_root))
    print(json.dumps({"model": args.model, "filled": filled, "recovered_nonempty": recovered}, sort_keys=True))


if __name__ == "__main__":
    main()
