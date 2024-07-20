

word = input()
n = len(word)


for i in range(n):
    for j in range(n):
        if (i == j or i == (n-j)-1 ):
            print(word[j],end = "")
        else:
            print(" ", end = "")
    print("")
