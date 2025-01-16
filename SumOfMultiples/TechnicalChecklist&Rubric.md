# Sum of Multiples Technical Checklist and Rubric

- **Date/time:**  
- **Applicant name:**  
- **Reviewer(s):**  

---

### **Correctness**

- **Core Logic:**
  - [ ] Loops through all numbers from `1` to `n-1`.
  - [ ] Correctly identifies numbers divisible by 3.
  - [ ] Correctly identifies numbers divisible by 5.
  - [ ] Adds numbers divisible by 3 or 5 to the total sum.
  - [ ] Returns `0` if no numbers meet the condition.

- **Output Accuracy:**
  - [ ] Produces correct results for small inputs (e.g., `n = 6`).
  - [ ] Produces correct results for larger inputs (e.g., `n = 100`).

---

### **Edge Cases**

- Handles the following edge cases:
  - [ ] `n = 1` (should return `0` as no numbers are less than `1`).
  - [ ] `n = 3` (should return `3` as it's the only multiple below `3`).
  - [ ] `n = 5` (should return the sum of `3` and `5`).
  - [ ] Large values of `n` (e.g., `n = 10,000`).

---

### **Code Efficiency (/20)**

- [ ] Avoids redundant calculations.
- [ ] Uses an efficient loop or method to check divisibility.
- [ ] Scales well for larger input values.

---

### **Readability and Style (/20)**

- [ ] Follows PEP-8 conventions (e.g., indentation, spacing, variable naming).
- [ ] Includes comments to explain logic and steps.
- [ ] Uses meaningful and descriptive variable names.

---

### **Understanding (/2)**

- Demonstrates understanding of:  
  - [ ] Loops and iteration.  
  - [ ] Divisibility rules using the modulus operator (`%`).  
  - [ ] Aggregating results (summing values).  

---

### **Debugging (/2)**

- **Error Handling:**
  - [ ] Identifies errors in logic or syntax.
  - [ ] Fixes errors and refines the code efficiently.

---

### **Behavior (/2)**

- **Coachability:**
  - [ ] Open to feedback and adapts the solution accordingly.  

- **Communication:**
  - [ ] Clearly explains the problem-solving approach.  
  - [ ] Asks clarifying questions when needed.

---

### **Final Score**
