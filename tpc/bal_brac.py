import datastructure as ds 

def is_balanced(input_string):
    s = ds.Stack()

    for i in input_string:
        if i in "{[(":
            s.push(i)
        elif i in "}])":
            if not s.isEmpty():
                match i:
                    case "}":
                        if s.top() == "{":
                            s.pop()
                        else:
                            return "unbalanced"
                    case "]":
                        if s.top() == "[":
                            s.pop()
                        else:
                            return "unbalanced"
                    case ")":
                        if s.top() == "(":
                            s.pop()
                        else:
                            return "unbalanced"
            else:
                return "unbalanced"

    if s.isEmpty():
        return "balanced"
    else:
        return "unbalanced"

# Example usage
input_string = input("Enter the string: ")
result = is_balanced(input_string)
print(result)
