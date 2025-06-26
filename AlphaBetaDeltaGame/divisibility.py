def divisibilityGame(n):
    # Write your logic here
    for i in range(1, n+1):
        str = ""
        if i % 2 == 0:
            str += "Alpha"
        if i % 3 == 0:
            str += "Beta"
        if i % 5 == 0:
            str += "Gamma"
        if str:
            print(str)
        else:
            print(i)

divisibilityGame(30)