import datastructure as ds

def prec(sym):
    if sym in "^":
        return 3
    if sym in "+-":
        return 1
    if sym in "*/":
        return 2
    return 0

result = []
s = ds.Stack()
exp = input()

for curr in exp:
    if curr.isalpha():
        result.append(curr)
    elif curr == "(":
        s.push(curr)
    elif curr == ")":
        while(not s.isEmpty() and s.top()!= "("):
            result.append(s.pop())
        s.pop()
    else:
        while(not s.isEmpty() and prec(curr)<=prec(s.top())):
            result.append(s.pop())
        s.push(curr)
while not s.isEmpty():
    result.append(s.pop())


for i in result:
    print(i, end="")
#d+(a+b*c)*e^f/h
