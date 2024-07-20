

def print_pyramid_unequal(n):
    val = 0
    for i in range(n):
        for j in range(2*n-1):
            if (j < n-i-1):
                print("  ", end = "")
            elif(j <= n-1+i):
                if j<n:
                    val += 1
                    print(chr(96+val),end = " ")
                else:
                    val -= 1
                    print(chr(96+val),end = " ")
            else:
                break
        val = 0
        print("")

a = int(input())

print_pyramid_unequal(a)
