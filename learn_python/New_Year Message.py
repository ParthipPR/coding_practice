year = int(input("Enter the current year:"))
dob = int(input("Enter your year of birth:"))
for i in range(2003,year):
    print("Happy New Year",i)


def age_find(y):
    age = y - dob
    print ('your are',age,'old')

age_find(year)

