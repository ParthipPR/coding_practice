a = input().split()
n = int(a[0])
col = int(a[1])
row = int(n/col)

if n%col != 0:
    row+=1

mat = [[c for c in range(col)]for r in range(row)]

cs = 0
ce = col
val = 1
i = 0
pos = 1
for j in range(row):
    if (pos):
        for i in range(cs, ce):
            mat[j][i] = val
            val+=1
        pos = 0
    else:
        for i in range(ce-1, cs-1, -1):
            mat[j][i] = val
            val+=1
        pos = 1

val = 1
for i in range(row):
    for j in range(col):
        if mat[i][j] <= n:
            print(f"%2d"%mat[i][j], end=" ")
        else:
            print("  ", end=" ")
    print("")
