n= int(input())
list_currency = []
name = []
for i in range(0,n):
    name.append(input())
name=set(name)
print(len(name))