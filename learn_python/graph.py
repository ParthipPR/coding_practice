import matplotlib.pyplot as plt

x=[]
y=[]
for i in range(0,20):
    x.append(i)
    y.append(i**2)
plt.plot(x,y)  
plt.show()


