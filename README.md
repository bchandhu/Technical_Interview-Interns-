
# Divisibility Game

## Prompt

You are tasked with implementing a function for a simple "Divisibility Game." The goal is to output specific words for numbers based on their divisibility, following the rules below:

1. Print `"Gamma"` for numbers divisible by both 3 and 5.
2. Print `"Alpha"` for numbers divisible by 3 but not 5.
3. Print `"Beta"` for numbers divisible by 5 but not 3.
4. Print `"Delta"` for numbers divisible by 7.
5. Print the number itself if it doesn't satisfy any of the above conditions.

### Expected Output

For example, running the function with `n = 15` should produce:
    1
    2
    Alpha
    4
    Beta
    Alpha
    Delta
    8
    Alpha
    Beta
    11
    AlphaDelta
    13
    14
    Gamma

