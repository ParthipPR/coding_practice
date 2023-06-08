import re

def Avg(lst):
    return sum(lst)/len(lst)
lst = []
in_no = input("enter the nos:")
no_re = re.compile(r'(\d(\d)?) (\d(\d)?) (\d(\d)?) (\d(\d)?) (\d(\d)?) (\d(\d)?) (\d(\d)?) (\d(\d)?) (\d(\d)?) (\d(\d)?)')
no = no_re.search(in_no)
#print(no.groups())
for i in no.groups():
    if i == None:
        pass
    else:
        lst.append(int(i))
#print(lst)
av = Avg(lst)
count = 0
for i  in lst:
    if i > av:
        count+=1
    else:
        pass

print(count)

