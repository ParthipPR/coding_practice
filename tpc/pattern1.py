#Input


n = int(input())
size = 2*n -1

a = [[col for col in range(size)]for row in range(size)]


#Operation
rs = 0
re = size-1
cs = 0
ce = size-1
val = n

i = 0
while(rs != re and cs != ce):
    for i in range(cs, ce+1):
        a[rs][i] = val
    rs+=1
    for i in range(rs, re+1):
	    a[i][ce] = val
    ce-=1
    for i in range(ce, cs-1, -1):
	    a[re][i] = val
    re-=1
    for i in range(re, rs-1, -1):
	    a[i][cs] = val
    cs+=1
    val-=1
if rs == re:
    a[rs][re] = val

#Output

for i in range(size):
    for j in range(size):
        print(a[i][j], end=" ")
    print("")
