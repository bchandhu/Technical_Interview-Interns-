# Sum of Multiples

## Prompt

You are tasked with implementing a function for a simple "Sum of Multiples" problem. The goal is to calculate the sum of all numbers below a given positive integer `n` that are divisible by either 3 or 5.

### Rules

1. Loop through all numbers from `1` to `n-1`.
2. Check if a number is divisible by 3 or 5.
3. Add all such numbers to get the total sum.
4. Return `0` if no numbers meet the condition.

### Example 1 & Expected Output

```
Input: n = 10 Output: 23
Explanation: Explanation: The multiples of 3 or 5 below 10 are `3, 5, 6, 9`. Their sum is `23`.
```
### Example 2 & Expected Output

```
Input: n = 6 Output: 8
Explanation: The multiples of 3 or 5 below 6 are `3, 5`. Their sum is `8`.
```

