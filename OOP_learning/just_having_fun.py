class Employee:  
    
    def __init__(self,name,id):
       self.Id = id
       self.Name = name

    def display(self):  
        print("ID: %d \nName: %s" % (self.Id, self.Name))  
     
     
# creates the object of the class Student  
emp1 = Employee("Parthip",56)  
emp2 = Employee('vedanth',76)
#delattr(emp1,'Id')
print(emp1.Id)

emp1.display() 
emp2.display()  
delattr(emp1,'Id')

