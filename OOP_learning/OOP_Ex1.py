#Creating class Vehicles with instance attributes max_speed and mileage 

class Vehicle:
    def __init__(self,max_speed,mileage):
        self.max_speed = max_speed
        self.mileage = mileage

model1 = Vehicle(240, 18)
print(model1.max_speed,model1.mileage)