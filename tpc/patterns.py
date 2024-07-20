
def value(j,n):
    if j<n:
        print((n-j),end = " ")
    else:
        print(((j+2)-n),end = " ")


def print_pyramid_equal(n):
    for i in range(n):
        for j in range(n):
            if (j < n-i-1):
                print(" ", end = "")
            else:
                value(j,n)
            print("")

def print_pyramid_unequal(n):
    for i in range(n):
        for j in range(2*n-1):
            if (j < n-i-1):
                print("  ", end = "")
            elif(j <= n-1+i):
                value(j,n)
            else:
                break
        print("")
    for i in range(n-2,-1,-1):
        for j in range(2*n-1):
            if (j < n-i-1):
                print("  ", end = "")
            elif(j <= n-1+i):
                value(j,n)
            else:
                break
        print("")

n = int(input())
print_pyramid_unequal(n)
