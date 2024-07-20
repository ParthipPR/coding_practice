

def print_pyramid_equal(n,str):
    val = int(n/2)%n
    for i in range(n):
        for j in range(n):
            if (j < n-i-1):
                print(" ", end = "")
            else:
                print(str[val], end = " ")
                val += 1
                val = val%n
        print("")
        val = int(n/2)%n

str = input()
n = len(str)
print_pyramid_equal(n,str)
