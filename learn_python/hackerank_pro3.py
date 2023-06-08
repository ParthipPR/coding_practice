names = {}
for a in range(0,5):
    get_input = input().split(" ")
    names[int(get_input[0])] =get_input[1]
sorted_names={}
for i in sorted(names):
   sorted_names[i]=names[i]
   print(sorted_names[i])


