#!/usr/bin/env bash
set -euo pipefail

cd "$(dirname "$0")/../tse-paper"

cat > /tmp/paft_tse_smoke.tex <<'EOF'
\documentclass{article}
\usepackage{xcolor}
\usepackage{placeins}
\input{macros}
\newboolean{showcomments}
\setboolean{showcomments}{false}
\newcommand{\tool}{\textsc{PAFT}\xspace}
\newcommand{\baseline}{\textsc{Base}\xspace}
\newcommand{\stdft}{\textsc{Sft}\xspace}
\newcommand{\dataset}{\textsc{TutorLLMCode}\xspace}
\newcommand{\prompt}{\textsc{Prompting}\xspace}
\definecolor{DarkGreen}{RGB}{0,128,0}
\newcommand{\up}[1]{\textcolor{DarkGreen}{(+#1\%)}}
\newcommand{\down}[1]{\textcolor{red}{(-#1\%)}}
\begin{document}
\input{0.abstract}
\input{1.introduction}
\input{2.motivating_example}
\input{3.approach}
\input{4.experimental_setup}
\input{5.experiments_new}
\input{6.discussion}
\input{7.threats}
\input{8.related_work}
\input{9.conclusion}
\input{10.appendix}
\bibliographystyle{plain}
\bibliography{sample-base,custom}
\end{document}
EOF

# Ignore the user's TeX home so stale user-mode packages cannot conflict with
# the system LaTeX format. This smoke gate checks section syntax, not venue style.
TEXMFHOME=/tmp/empty-texmf latexmk -pdf -interaction=nonstopmode -halt-on-error \
  -outdir=/tmp /tmp/paft_tse_smoke.tex

if grep -q "multiply defined" /tmp/paft_tse_smoke.log; then
  echo "duplicate labels detected in smoke compile" >&2
  grep -n "multiply defined" /tmp/paft_tse_smoke.log >&2 || true
  exit 1
fi

if grep -Eq "Citation .* undefined|Reference .* undefined|There were undefined references" /tmp/paft_tse_smoke.log; then
  echo "undefined citations or references detected in smoke compile" >&2
  grep -En "Citation .* undefined|Reference .* undefined|There were undefined references" /tmp/paft_tse_smoke.log >&2 || true
  exit 1
fi
