# Divisibility Game - Multi-language Solutions

## Python
```python
def divisibilityGame(n):
    for i in range(1, n + 1):
        output = ""
        if i % 2 == 0:
            output += "Alpha"
        if i % 3 == 0:
            output += "Beta"
        if i % 5 == 0:
            output += "Gamma"
        print(output if output else i)

# Example usage
divisibilityGame(30)
```

---

## Java
```java
public class DivisibilityGame {
    public static void divisibilityGame(int n) {
        for (int i = 1; i <= n; i++) {
            String output = "";
            if (i % 2 == 0) output += "Alpha";
            if (i % 3 == 0) output += "Beta";
            if (i % 5 == 0) output += "Gamma";
            System.out.println(output.isEmpty() ? i : output);
        }
    }

    public static void main(String[] args) {
        divisibilityGame(30);
    }
}
```

---

## C
```c
#include <stdio.h>

void divisibilityGame(int n) {
    for (int i = 1; i <= n; i++) {
        int flag = 0;
        if (i % 2 == 0) {
            printf("Alpha");
            flag = 1;
        }
        if (i % 3 == 0) {
            printf("Beta");
            flag = 1;
        }
        if (i % 5 == 0) {
            printf("Gamma");
            flag = 1;
        }
        if (!flag) {
            printf("%d", i);
        }
        printf("\n");
    }
}

int main() {
    divisibilityGame(30);
    return 0;
}
```

---

## C++
```cpp
#include <iostream>
using namespace std;

void divisibilityGame(int n) {
    for (int i = 1; i <= n; i++) {
        string output = "";
        if (i % 2 == 0) output += "Alpha";
        if (i % 3 == 0) output += "Beta";
        if (i % 5 == 0) output += "Gamma";
        if (output == "") cout << i << endl;
        else cout << output << endl;
    }
}

int main() {
    divisibilityGame(30);
    return 0;
}
```

---

## JavaScript
```javascript
function divisibilityGame(n) {
    for (let i = 1; i <= n; i++) {
        let output = "";
        if (i % 2 === 0) output += "Alpha";
        if (i % 3 === 0) output += "Beta";
        if (i % 5 === 0) output += "Gamma";
        console.log(output || i);
    }
}

divisibilityGame(30);
```

---

## Pseudocode
```pseudocode
FUNCTION divisibilityGame(n):
    FOR i FROM 1 TO n:
        SET output = ""
        IF i MOD 2 == 0:
            output = output + "Alpha"
        IF i MOD 3 == 0:
            output = output + "Beta"
        IF i MOD 5 == 0:
            output = output + "Gamma"
        IF output IS EMPTY:
            PRINT i
        ELSE:
            PRINT output
```
