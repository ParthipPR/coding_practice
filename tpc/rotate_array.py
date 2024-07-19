# Input

size = int(input())
ele = input().split()
op = input().split()
r = int(op[1])
a = [int(num) for num in ele]
new = [] + a


#Operation

if (op[0] == "r"):
    for i in range(size):
        new[(i+r)%size] = a[i]
else:
    for i in range(size):
        new[i] = a[(i+r)%size] # new[(i-r+size)%(size)] = a[i]

#Output
st = ""
for i in range(size):
    st += str(new[i])+" "
print(st)
