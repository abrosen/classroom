
print("Please enter some numbers. I will sum them up.")
print("Enter \"done\" when you are done")
userInput =  input()
total = 0

while userInput != "done":
    number =  int(userInput)
    total += number
    userInput =  input()
    userInput = userInput.lower()

print(total)

    
"""
number = int(input("\n"))
while number > 0: 
    print("that was a positive number")
    number = int(input("I'd like a negative number, actually.\n"))
    print("Thanks, I'm gonna check your number")
    
print("done")
"""
