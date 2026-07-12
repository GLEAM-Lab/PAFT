## Edit-localization and region-split copy behavior (DS-Coder-6.7B, plausible patches)
| method | n_plaus | edit precision | edit recall | edit F1 | stable-preserve | change-region edit |
|---|---:|---:|---:|---:|---:|---:|
| Base | 215 | 58.0 | 81.6 | 62.1 | 89.2 | 81.6 |
| SFT | 275 | 66.0 | 86.7 | 69.9 | 94.0 | 86.7 |
| PAFT | 376 | 72.2 | 83.2 | 72.9 | 95.9 | 83.2 |

## w_align sweep (mechanism vs outcome)
| w_align | n_plaus | edit precision | edit recall | edit F1 | stable-preserve | change-region edit |
|---|---:|---:|---:|---:|---:|---:|
| w0.0 | 269 | 66.2 | 81.2 | 68.8 | 94.6 | 81.2 |
| w2.0 | 376 | 72.2 | 83.2 | 72.9 | 95.9 | 83.2 |
| w4.0 | 305 | 71.1 | 85.1 | 73.6 | 94.8 | 85.1 |