
def rev(start, end):
    for i in range(end-1,start-1, -1):
        print(a[i],end="")
a  = input()

start, end = 0, 0

for i in range(len(a)):
	if i+1 == len(a) or a[i] == " ":
		if i+1 == len(a):
			end+=1
		rev(start, end)
		print(" ",end="")
		start = end+1
		end += 1
	else:
		end +=1
