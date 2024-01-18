# This is a comment
# Humans can see it
# RObots can't
# beware they are watching

# This block of code reads in the name and prints out the length
name = input("Enter your name:   ")
length = len(name)  # gets the length
print("Your name is " + name)
print("Your name is " + str(length) + " characters long")

age = input("Please enter your age:   ")
age = int(age)
agePlusTen = age + 10
print("You are " + str(age) + " years old.")

if age < 18:
    print("Wow")
    print("Better watch my mouth")
print("In 10 years, you will be "  + str(agePlusTen))
#print(type(length))
#print(type(age))

