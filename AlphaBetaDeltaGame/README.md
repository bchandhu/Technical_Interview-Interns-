
# Divisibility Game

## Prompt

You are tasked with implementing a function for a simple "Divisibility Game." The goal is to output specific words for numbers based on their divisibility, following the rules below:

1. If a number is divisible by 2, print `"Alpha"`
2. If a number is divisible by 3, print `"Beta"`
3. If a number is divisible by 5, print `"Gamma"`
4. If a number is divisible by 2 and 3, print `"AlphaBeta"`
5. If a number is divisible by 2 and 5, print `"AlphaGamma"`
6. If a number is divisible by 3 and 5, print `"BetaGamma"`
7. If a number is divisible by all three numbers, print `"AlphaBetaGamma"`
8. else, print the number
9. with an expected output of:


### Expected Output

For example, running the function with `n = 30` should produce:
```
1
Alpha
Beta
Alpha
Gamma
AlphaBeta
7
Alpha
Beta
AlphaGamma
11
AlphaBeta
13
Alpha
BetaGamma
Alpha
17
AlphaBeta
19
AlphaGamma
Beta
Alpha
23
AlphaBeta
Gamma
Alpha
Beta
Alpha
29
AlphaBetaGamma
```

