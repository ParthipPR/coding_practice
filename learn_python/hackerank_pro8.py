import math
string_cost = input().split(" ")
for no in string_cost:
    print(math.factorial(int(no))+int(no))
