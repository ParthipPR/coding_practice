
def palin(str, start, end):
    n=start
    palin = 1
    for i in range(end-1,start-1, -1):
        if str[n] != str[i]:
            palin = 0
        n+=1
        
    if palin == 0:
        for j in range(start,end):
            print(str[j],end="")

a  = input()
start, end = 0, 0
for i in range(len(a)):
	if i+1 == len(a) or a[i] == " ":
		if i+1 == len(a):
			end+=1
		palin(a,start, end)
		print(" ",end="")
		start = end+1
		end += 1
	else:
		end +=1
