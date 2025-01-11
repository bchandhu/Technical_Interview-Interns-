# Sum of Multiples Technical Checklist and Rubric

- **Date/time:**  
- **Applicant name:**  
- **Reviewer(s):**  

---

## **Checklist**

### **Initial Setup**
- [ ] Reads the problem description and requirements carefully.
- [ ] Understands the concept of summing multiples of 3 or 5 below a given integer `n`.

---

### **Logic Implementation**
- **Iterating through numbers:**
  - [ ] Implements a loop to iterate through numbers from `1` to `n-1`.
  - [ ] Avoids including `n` itself in the calculations.

- **Condition for multiples:**
  - [ ] Checks if a number is divisible by 3 using the modulo operator (`%`).
  - [ ] Checks if a number is divisible by 5 using the modulo operator (`%`).
  - [ ] Correctly uses logical `OR` (`||`) to include numbers divisible by either 3 or 5.

- **Summing the multiples:**
  - [ ] Adds numbers that satisfy the condition (multiple of 3 or 5) to the total sum.
  - [ ] Returns the total sum after the loop completes.

---

### **Edge Cases**
- Handles the following edge cases:
  - [ ] `n = 1` (output should be `0` because there are no multiples of 3 or 5 below 1).
  - [ ] `n = 3` (output should be `0` because 3 itself is excluded).
  - [ ] `n = 6` (output includes 3 and 5, so result is `8`).
  - [ ] Large values of `n` (e.g., `n = 1000`).

---

### **Output Validation**
- Validates the output against examples:
  - [ ] `n = 10` produces correct output: `23` (multiples are 3, 5, 6, 9).
  - [ ] `n = 6` produces correct output: `8` (multiples are 3, 5).
  - [ ] `n = 1` produces correct output: `0` (no multiples below 1).
  - [ ] Large `n` values compute efficiently without errors.

---

### **Code Quality**
- [ ] Uses clear and descriptive variable names.
- [ ] Includes comments to explain key logic (e.g., checking divisibility, summing values).
- [ ] Avoids unnecessary calculations or redundant code.
- [ ] Implements a clean, readable structure (e.g., uses `if` or equivalent conditionals).

---

### **Debugging**
- [ ] Logs intermediate outputs (e.g., prints numbers satisfying the condition) to verify logic.
- [ ] Fixes any errors in logic or syntax that arise during testing.
- [ ] Verifies the function works correctly with edge cases and large inputs.

---

### **Completion**
- [ ] Solution produces the correct output for all test cases.
- [ ] Code runs efficiently, even for large inputs.

---

## **Rubric**

### **Solution (/4)**
- **0 points:** No progress or incorrect logic.
- **1-2 points:** Partially correct but misses cases (e.g., edge cases like `n = 1`).
- **3 points:** Correct logic but inefficient or redundant code.
- **4 points:** Fully correct, handles all edge cases, and runs efficiently.

---

### **Understanding (/2)**
- Demonstrates understanding of:
  - [ ] Loops and iterating through a range.
  - [ ] Conditional checks using modulo operator (`%`).
  - [ ] Summing values that meet a specific condition.

---

### **Debugging (/2)**
- **Error Handling:**
  - [ ] Identifies and resolves errors in logic or syntax.
  - [ ] Refines the implementation to handle edge cases efficiently.

- **Testing:**
  - [ ] Verifies results with intermediate outputs.
  - [ ] Ensures edge cases and large inputs produce correct results.

---

### **Behavior (/2)**
- **Coachability:**
  - [ ] Open to feedback and adapts the solution accordingly.

- **Communication:**
  - [ ] Clearly explains their problem-solving approach.
  - [ ] Asks relevant and clarifying questions if needed.

---

## **Overall Score (/10)**
- **Solution:** (/4)  
- **Understanding:** (/2)  
- **Debugging:** (/2)  
- **Behavior:** (/2)  
