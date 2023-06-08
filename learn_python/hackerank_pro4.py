n = int(input())
nos = input().split(' ')
int_nos = map(int,nos)
t = tuple(int_nos)

product = 1
for ele in t:
    product *= ele
print(product)
