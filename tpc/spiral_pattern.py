#Input

"""
ilove
onsaz
ighso
tuoth
seuqo
"""

a = []

size = int(input())

for i in range(size):
    ele = input()
    a.append(ele)
"""
for i in range(size):
    for j in range(size):
        print(a[i][j])
"""


#Operation
rs = 0
re = size-1
cs = 0
ce = size-1

i = 0
ch = ""
while(rs != re and cs != ce):
    for i in range(cs, ce+1):
        ch += a[rs][i]
    rs+=1
    for i in range(rs, re+1):
	    ch += a[i][ce]
    ce-=1
    for i in range(ce, cs-1, -1):
	    ch  += a[re][i]
    re-=1
    for i in range(re, rs-1, -1):
	    ch += a[i][cs]
    cs+=1
if rs == re:
    ch += a[rs][re]

#Output
print(ch)

