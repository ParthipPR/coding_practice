import datastructure as ds

str = input()
out = input()
s = ds.Stack()
result = ""
temp = "+"
for curr in str:
    if curr.isalpha():
        result += curr
    elif curr in "+-":
        if temp =="+":
            result += curr
            s.push(curr)
        else:
            if curr == "+":
                result += "-"
                s.push("-")
            else:
                result += "+"
                s.push("+")
    elif curr == "(":
        temp  = s.top()
    else:
        s.pop()

if result == out:
    print("yes")
else:
    print("no")
