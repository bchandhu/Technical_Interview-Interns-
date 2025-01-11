# Divisibility Game Technical Checklist and Rubric

- **Date/time:**  
- **Applicant name:**  
- **Reviewer(s):**  

---

## **Checklist**

### **Initial Setup**
- [ ] Reads problem description and requirements carefully.
- [ ] Understands the divisibility rules (e.g., divisible by 3, 5, 7, or combinations).

---

### **Logic Implementation**
- **Divisible by both 3 and 5:**
  - [ ] Implements condition for numbers divisible by 3 and 5 (`Gamma`).
  - [ ] Correctly uses logical `AND` operator.
  - [ ] Places this condition before others to ensure correct output.
  
- **Divisible by 3:**
  - [ ] Implements condition for numbers divisible by 3 (`Alpha`).
  - [ ] Correctly uses the modulo operator `%`.

- **Divisible by 5:**
  - [ ] Implements condition for numbers divisible by 5 (`Beta`).
  - [ ] Correctly uses the modulo operator `%`.

- **Divisible by 7:**
  - [ ] Implements condition for numbers divisible by 7 (`Delta`).
  - [ ] Correctly uses the modulo operator `%`.

- **Default case:**
  - [ ] Prints the number itself if no other condition is met.

---

### **Edge Cases**
- Handles the following edge cases:
  - [ ] `n = 1` (only one output: `1`).
  - [ ] Numbers divisible by multiple values (e.g., 15 → `Gamma`, 21 → `Delta`).
  - [ ] Numbers divisible by none of the conditions.
  - [ ] Large values of `n` (e.g., `n = 1000`).

---

### **Output Validation**
- Validates the output against examples:
  - [ ] `n = 15` produces correct output:
    ```plaintext
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
    ```
  - [ ] Handles cases where `n` includes multiple combinations (e.g., 105 → `Gamma`).
  - [ ] Ensures the order of output matches the sequence from 1 to `n`.

---

### **Code Quality**
- [ ] Uses clear variable names and comments.
- [ ] Avoids unnecessary calculations or redundant code.
- [ ] Implements a clean, readable structure (e.g., uses `elif` or equivalent to avoid overlapping conditions).

---

### **Debugging**
- [ ] Logs intermediate outputs to verify each condition (optional).
- [ ] Fixes errors in logic or syntax if any arise.

---

### **Completion**
- [ ] Solution produces the correct output without errors.
- [ ] Code runs efficiently for large inputs.

---

## **Rubric**

### **Solution (/4)**
- **0 points:** No progress or incorrect logic.  
- **1-2 points:** Partially correct but misses cases (e.g., numbers divisible by multiple values).  
- **3 points:** Correct logic but inefficient or redundant code.  
- **4 points:** Fully correct and handles all edge cases cleanly.

---

### **Understanding (/2)**
- Demonstrates understanding of:  
  - [ ] Conditionals (`if-else` or equivalent).  
  - [ ] Divisibility rules and logical operators.  

---

### **Debugging (/2)**
- **Error Handling:**
  - [ ] Identifies errors in logic or syntax.
  - [ ] Fixes errors and refines the code efficiently.

- **Testing:**
  - [ ] Verifies results with intermediate outputs.  
  - [ ] Correctly handles edge cases during debugging.  

---

### **Behavior (/2)**
- **Coachability:**
  - [ ] Open to feedback and adapts the solution accordingly.  

- **Communication:**
  - [ ] Clearly articulates the problem-solving process.  
  - [ ] Asks clarifying questions when necessary.  

---

## **Overall Score (/10)**
- **Solution:** (/4)  
- **Understanding:** (/2)  
- **Debugging:** (/2)  
- **Behavior:** (/2)  
