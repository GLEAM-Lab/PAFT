# -*- coding: utf-8 -*-
"""Unit tests for preservation-weight <-> target-token alignment in SingleTrainWithLCS.py.

These tests load the REAL collator/trainer classes from SingleTrainWithLCS.py (extracted
by AST so that importing the training script does not launch training) and verify, on
short synthetic sequences with hand-written alignment masks, the EXACT loss contribution
of every target token:

  the loss term that predicts target token x_t must be weighted by w(x_t), where
  w(x_t) = lcs_weight iff the response-relative position of x_t is in the aligned set.

Effective per-target weights are measured end-to-end through LCSWeightedTrainer.compute_loss
by logit-spike differencing: with baseline logits the batch loss is L0; spiking only the
logit row of the loss term for target t changes that term's CE from c0 to c1, so

  w_eff(t) = (L_spike - L0) * N / (c1 - c0),   N = number of unmasked targets.

Coverage requested in review: first and last response tokens, isolated edits, consecutive
edits, prompt masking, padding, and truncation.

Run:  python -m unittest tests/test_loss_weight_alignment.py -v
Optional: set PAFT_TEST_TOKENIZER to a local HF tokenizer dir to use it instead of the
built-in tiny tokenizer.
"""
import ast
import math
import os
import sys
import unittest
from difflib import SequenceMatcher
from types import SimpleNamespace
from typing import Any, Dict, List, Optional, Tuple, Union

import torch
import torch.nn as nn
from transformers import DataCollatorForLanguageModeling, Trainer

HERE = os.path.dirname(os.path.abspath(__file__))
TRAINER_PATH = os.environ.get(
    "PAFT_TRAINER_PATH", os.path.join(HERE, os.pardir, "SingleTrainWithLCS.py")
)

VOCAB = 50
EOS_ID = 2


def _load_real_classes():
    """Extract compute_lcs_tokens / LCSWeightedDataCollator / LCSWeightedTrainer from the
    actual training script without executing its module-level training code."""
    with open(TRAINER_PATH, "r", encoding="utf-8") as f:
        tree = ast.parse(f.read())
    wanted = {"compute_lcs_tokens", "LCSWeightedDataCollator", "LCSWeightedTrainer"}
    nodes = [
        n
        for n in tree.body
        if isinstance(n, (ast.FunctionDef, ast.ClassDef)) and n.name in wanted
    ]
    missing = wanted - {n.name for n in nodes}
    if missing:
        raise RuntimeError(f"could not find {missing} in {TRAINER_PATH}")
    ns = {
        "torch": torch,
        "nn": nn,
        "sys": sys,
        "os": os,
        "DataCollatorForLanguageModeling": DataCollatorForLanguageModeling,
        "Trainer": Trainer,
        "SequenceMatcher": SequenceMatcher,
        "List": List,
        "Dict": Dict,
        "Any": Any,
        "Optional": Optional,
        "Tuple": Tuple,
        "Union": Union,
        # module-level globals the collator reads at call time (mutable per test):
        "eos_token_id": EOS_ID,
        "max_len": 2048,
        # wandb is only touched when global_step % logging_steps == 0; stub anyway.
        "wandb": SimpleNamespace(log=lambda *a, **k: None),
    }
    mod = ast.Module(body=nodes, type_ignores=[])
    exec(compile(mod, TRAINER_PATH, "exec"), ns)
    return ns


def _build_tokenizer():
    override = os.environ.get("PAFT_TEST_TOKENIZER", "").strip()
    if override:
        from transformers import AutoTokenizer

        tok = AutoTokenizer.from_pretrained(override)
        if tok.pad_token is None:
            tok.pad_token = tok.eos_token
        return tok
    from tokenizers import Tokenizer
    from tokenizers.models import WordLevel
    from transformers import PreTrainedTokenizerFast

    vocab = {f"tok{i}": i for i in range(VOCAB)}
    vocab["<pad>"] = VOCAB  # pad id outside the ids used in tests
    tok = Tokenizer(WordLevel(vocab, unk_token="tok0"))
    return PreTrainedTokenizerFast(
        tokenizer_object=tok, pad_token="<pad>", eos_token=f"tok{EOS_ID}"
    )


NS = _load_real_classes()
TOKENIZER = _build_tokenizer()


class _FixedLogitsModel(nn.Module):
    """Stub causal-LM: returns preset logits regardless of inputs."""

    def __init__(self, logits):
        super().__init__()
        self.logits = logits

    def forward(self, **kwargs):  # noqa: D401
        return SimpleNamespace(logits=self.logits)


def make_feature(prompt_ids, response_ids, buggy_ids):
    """Build a raw feature in the format the collator expects:
    input_ids = prompt + [eos] + response + [eos]."""
    ids = list(prompt_ids) + [EOS_ID] + list(response_ids) + [EOS_ID]
    return {
        "input_ids": ids,
        "attention_mask": [1] * len(ids),
        "buggy_code_token_ids": list(buggy_ids),
    }


def collate(features, include_prompt_in_loss=True, lcs_weight=2.0, max_len=2048):
    NS["max_len"] = max_len
    collator = NS["LCSWeightedDataCollator"](
        tokenizer=TOKENIZER,
        mlm=False,
        include_prompt_in_loss=include_prompt_in_loss,
        lcs_weight=lcs_weight,
    )
    return collator(features)


def intended_weights(prompt_len, response_len, aligned_resp_positions, total_len, lcs_weight=2.0):
    """Ground-truth weight of every combined-sequence token x_t, written by hand:
    combined = prompt + response + [eos]; aligned response position i -> t = prompt_len + i."""
    w = [1.0] * total_len
    for i in aligned_resp_positions:
        if 0 <= i < response_len and prompt_len + i < total_len:
            w[prompt_len + i] = lcs_weight
    return w


def make_trainer():
    trainer = object.__new__(NS["LCSWeightedTrainer"])
    trainer.state = SimpleNamespace(global_step=1)  # 1 % 10 != 0 -> no wandb path
    trainer.args = SimpleNamespace(logging_steps=10)
    return trainer


def batch_loss(batch, logits):
    trainer = make_trainer()
    inputs = {k: (v.clone() if isinstance(v, torch.Tensor) else v) for k, v in batch.items()}
    model = _FixedLogitsModel(logits)
    with torch.no_grad():
        loss = trainer.compute_loss(model, inputs)
    return float(loss)


def measure_effective_weights(batch, sample=0):
    """Measure, for every target position t (predicting combined[t]), the effective
    weight applied by compute_loss, via logit-spike differencing. Returns dict t -> w_eff.
    Masked targets (label -100) are reported as 0.0."""
    labels = batch["labels"]
    bsz, seqlen = labels.shape
    base_logits = torch.zeros(bsz, seqlen, VOCAB)
    L0 = batch_loss(batch, base_logits)
    n_unmasked = int((labels[:, 1:] != -100).sum().item())
    c0 = math.log(VOCAB)  # CE of an all-zero logit row

    out = {}
    for t in range(1, seqlen):  # target x_t is predicted by logits row t-1
        label = int(labels[sample, t].item())
        spiked = base_logits.clone()
        if label == -100:
            # spike an arbitrary logit; a masked target must contribute nothing
            spiked[sample, t - 1, 0] = 7.0
            L1 = batch_loss(batch, spiked)
            out[t] = 0.0 if abs(L1 - L0) < 1e-9 else float("nan")
            continue
        spiked[sample, t - 1, label] = 5.0
        row = spiked[sample, t - 1].unsqueeze(0)
        c1 = float(nn.functional.cross_entropy(row, torch.tensor([label])))
        L1 = batch_loss(batch, spiked)
        out[t] = (L1 - L0) * n_unmasked / (c1 - c0)
    return out


class TestCollatorWeightPositions(unittest.TestCase):
    """The collator must attach UNSHIFTED weights: loss_weights[t] == w(x_t)."""

    def assert_weights(self, batch, expected, sample=0):
        got = batch["loss_weights"][sample, : len(expected)].tolist()
        for t, (g, e) in enumerate(zip(got, expected)):
            self.assertAlmostEqual(
                g, e, places=6,
                msg=f"loss_weights[{t}] = {g}, expected w(x_{t}) = {e}",
            )

    def test_midspan_alignment(self):
        # response [20, 11, 12, 13, 21]; buggy [10, 11, 12, 13, 14]
        # matching block = [11,12,13] -> aligned response positions {1,2,3}
        prompt, response, buggy = [30, 31, 32], [20, 11, 12, 13, 21], [10, 11, 12, 13, 14]
        batch = collate([make_feature(prompt, response, buggy)])
        exp = intended_weights(len(prompt), len(response), {1, 2, 3},
                               len(prompt) + len(response) + 1)
        self.assert_weights(batch, exp)

    def test_first_response_token_aligned(self):
        # span starts at response position 0 (prompt/response boundary)
        prompt, response, buggy = [30, 31], [11, 12, 20, 21], [11, 12]
        batch = collate([make_feature(prompt, response, buggy)])
        exp = intended_weights(len(prompt), len(response), {0, 1},
                               len(prompt) + len(response) + 1)
        self.assert_weights(batch, exp)
        # boundary regression: the last prompt token must NOT be upweighted
        self.assertAlmostEqual(float(batch["loss_weights"][0, len(prompt) - 1]), 1.0, places=6)

    def test_last_response_token_aligned(self):
        # span ends at the final response token (before trailing eos)
        prompt, response, buggy = [30, 31], [20, 21, 11, 12], [11, 12]
        batch = collate([make_feature(prompt, response, buggy)])
        exp = intended_weights(len(prompt), len(response), {2, 3},
                               len(prompt) + len(response) + 1)
        self.assert_weights(batch, exp)
        # boundary regression: final response token keeps its weight, eos stays 1.0
        self.assertAlmostEqual(float(batch["loss_weights"][0, len(prompt) + 3]), 2.0, places=6)
        self.assertAlmostEqual(float(batch["loss_weights"][0, len(prompt) + 4]), 1.0, places=6)

    def test_isolated_aligned_token_and_consecutive_edits(self):
        # response [20, 11, 21, 22, 12, 13]; buggy [11, 40, 12, 13]
        # blocks: [11] at resp pos 1 (isolated), [12,13] at resp pos {4,5};
        # resp pos {2,3} are consecutive edits between spans.
        prompt = [30, 31, 32]
        response = [20, 11, 21, 22, 12, 13]
        buggy = [11, 40, 12, 13]
        batch = collate([make_feature(prompt, response, buggy)])
        exp = intended_weights(len(prompt), len(response), {1, 4, 5},
                               len(prompt) + len(response) + 1)
        self.assert_weights(batch, exp)


class TestEffectiveLossContribution(unittest.TestCase):
    """End-to-end: the loss term predicting x_t must be scaled by exactly w(x_t)."""

    def test_every_target_token_weight(self):
        prompt, response, buggy = [30, 31, 32], [20, 11, 12, 13, 21], [10, 11, 12, 13, 14]
        batch = collate([make_feature(prompt, response, buggy)])
        total = len(prompt) + len(response) + 1
        exp = intended_weights(len(prompt), len(response), {1, 2, 3}, total)
        eff = measure_effective_weights(batch)
        for t in range(1, total):
            self.assertAlmostEqual(
                eff[t], exp[t], places=4,
                msg=f"effective weight of target x_{t} = {eff[t]:.4f}, expected {exp[t]}",
            )

    def test_prompt_masking(self):
        prompt, response, buggy = [30, 31, 32, 33], [11, 12, 20], [11, 12]
        batch = collate([make_feature(prompt, response, buggy)],
                        include_prompt_in_loss=False)
        # all prompt positions must be label-masked and contribute exactly nothing
        eff = measure_effective_weights(batch)
        for t in range(1, len(prompt)):
            self.assertEqual(eff[t], 0.0, msg=f"masked prompt target x_{t} leaked into loss")
        # response tokens keep their intended weights
        total = len(prompt) + len(response) + 1
        exp = intended_weights(len(prompt), len(response), {0, 1}, total)
        for t in range(len(prompt), total):
            self.assertAlmostEqual(eff[t], exp[t], places=4)

    def test_padding_batch(self):
        # two samples of different lengths; pad targets must contribute nothing
        f_short = make_feature([30], [11, 12], [11, 12])
        f_long = make_feature([30, 31, 32], [20, 11, 12, 13, 21], [10, 11, 12, 13, 14])
        batch = collate([f_short, f_long])
        labels = batch["labels"]
        self.assertEqual(labels.shape[0], 2)
        # sample 0: padded tail must be -100
        short_total = 1 + 2 + 1
        self.assertTrue(bool((labels[0, short_total:] == -100).all()))
        eff0 = measure_effective_weights(batch, sample=0)
        exp0 = intended_weights(1, 2, {0, 1}, short_total)
        for t in range(1, short_total):
            self.assertAlmostEqual(eff0[t], exp0[t], places=4)
        for t in range(short_total, labels.shape[1]):
            self.assertEqual(eff0[t], 0.0, msg=f"pad target x_{t} leaked into loss")
        # sample 1 unaffected by batching with a shorter sample
        eff1 = measure_effective_weights(batch, sample=1)
        exp1 = intended_weights(3, 5, {1, 2, 3}, 3 + 5 + 1)
        for t in range(1, 3 + 5 + 1):
            self.assertAlmostEqual(eff1[t], exp1[t], places=4)

    def test_truncation(self):
        # max_len=8: combined = (prompt+response)[:7] + [eos]
        # prompt(3) + response(6) = 9 -> keep first 7 (resp positions 0..3), then eos.
        prompt = [30, 31, 32]
        response = [11, 12, 20, 21, 22, 23]
        buggy = [11, 12]  # aligned resp positions {0,1}, inside the kept prefix
        batch = collate([make_feature(prompt, response, buggy)], max_len=8)
        self.assertEqual(batch["labels"].shape[1], 8)
        exp = intended_weights(len(prompt), 4, {0, 1}, 8)
        got = batch["loss_weights"][0].tolist()
        for t, (g, e) in enumerate(zip(got, exp)):
            self.assertAlmostEqual(g, e, places=6,
                                   msg=f"truncated: loss_weights[{t}]={g}, expected {e}")
        eff = measure_effective_weights(batch)
        for t in range(1, 8):
            self.assertAlmostEqual(eff[t], exp[t], places=4)


if __name__ == "__main__":
    unittest.main(verbosity=2)
