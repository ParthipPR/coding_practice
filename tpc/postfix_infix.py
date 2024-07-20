import datastructure as ds


str = input()
s = ds.Stack()


for curr in str:
    if curr.isalpha():
        s.push(curr)
    else:
        a = s.pop()
        b = s.pop()
        temp = b + curr + a
        s.push(temp)

print(s.pop())
