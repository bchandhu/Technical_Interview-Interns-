
# Divisibility Game Solutions

## Python

```python
def divisibility_game(n):
    for i in range(1, n + 1):
        if i % 2 == 0 and i % 3 == 0 and i % 5 == 0:
            print("AlphaBetaGamma")
        elif i % 2 == 0 and i % 3 == 0:
            print("AlphaBeta")
        elif i % 2 == 0 and i % 5 == 0:
            print("AlphaGamma")
        elif i % 3 == 0 and i % 5 == 0:
            print("BetaGamma")
        elif i % 2 == 0:
            print("Alpha")
        elif i % 3 == 0:
            print("Beta")
        elif i % 5 == 0:
            print("Gamma")
        else:
            print(i)
```

---

## C

```c
#include <stdio.h>

void divisibilityGame(int n) {
    for (int i = 1; i <= n; i++) {
        if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0)
            printf("AlphaBetaGamma\n");
        else if (i % 2 == 0 && i % 3 == 0)
            printf("AlphaBeta\n");
        else if (i % 2 == 0 && i % 5 == 0)
            printf("AlphaGamma\n");
        else if (i % 3 == 0 && i % 5 == 0)
            printf("BetaGamma\n");
        else if (i % 2 == 0)
            printf("Alpha\n");
        else if (i % 3 == 0)
            printf("Beta\n");
        else if (i % 5 == 0)
            printf("Gamma\n");
        else
            printf("%d\n", i);
    }
}
```

---

## C++

```cpp
#include <iostream>
using namespace std;

void divisibilityGame(int n) {
    for (int i = 1; i <= n; ++i) {
        if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0)
            cout << "AlphaBetaGamma" << endl;
        else if (i % 2 == 0 && i % 3 == 0)
            cout << "AlphaBeta" << endl;
        else if (i % 2 == 0 && i % 5 == 0)
            cout << "AlphaGamma" << endl;
        else if (i % 3 == 0 && i % 5 == 0)
            cout << "BetaGamma" << endl;
        else if (i % 2 == 0)
            cout << "Alpha" << endl;
        else if (i % 3 == 0)
            cout << "Beta" << endl;
        else if (i % 5 == 0)
            cout << "Gamma" << endl;
        else
            cout << i << endl;
    }
}
```

---

## Java

```java
public class DivisibilityGame {
    public static void divisibilityGame(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0)
                System.out.println("AlphaBetaGamma");
            else if (i % 2 == 0 && i % 3 == 0)
                System.out.println("AlphaBeta");
            else if (i % 2 == 0 && i % 5 == 0)
                System.out.println("AlphaGamma");
            else if (i % 3 == 0 && i % 5 == 0)
                System.out.println("BetaGamma");
            else if (i % 2 == 0)
                System.out.println("Alpha");
            else if (i % 3 == 0)
                System.out.println("Beta");
            else if (i % 5 == 0)
                System.out.println("Gamma");
            else
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        divisibilityGame(30);
    }
}
```

---

## JavaScript

```javascript
function divisibilityGame(n) {
    for (let i = 1; i <= n; i++) {
        if (i % 2 === 0 && i % 3 === 0 && i % 5 === 0)
            console.log("AlphaBetaGamma");
        else if (i % 2 === 0 && i % 3 === 0)
            console.log("AlphaBeta");
        else if (i % 2 === 0 && i % 5 === 0)
            console.log("AlphaGamma");
        else if (i % 3 === 0 && i % 5 === 0)
            console.log("BetaGamma");
        else if (i % 2 === 0)
            console.log("Alpha");
        else if (i % 3 === 0)
            console.log("Beta");
        else if (i % 5 === 0)
            console.log("Gamma");
        else
            console.log(i);
    }
}

divisibilityGame(30);
```

---

## Pseudocode

```
function divisibilityGame(n):
    for i from 1 to n:
        if i divisible by 2 and 3 and 5:
            print "AlphaBetaGamma"
        else if i divisible by 2 and 3:
            print "AlphaBeta"
        else if i divisible by 2 and 5:
            print "AlphaGamma"
        else if i divisible by 3 and 5:
            print "BetaGamma"
        else if i divisible by 2:
            print "Alpha"
        else if i divisible by 3:
            print "Beta"
        else if i divisible by 5:
            print "Gamma"
        else:
            print i
```
