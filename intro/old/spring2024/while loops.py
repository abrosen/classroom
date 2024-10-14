

"""
greeting = input("please say hello\n")
while greeting != "hello":
    print("you didn't say hello")
    greeting = input("please say hello\n")
print(greeting,"to you, too")
"""

print("Please enter the numbers you want to add")
print("Enter a negative number to stop")

number = 0
total = 0
done = False
while not done:
    number = int(input("Number: "))
    if number < 0:
        done = True
    else:
        total += number
    # some other code maybe???
print(total)

#for i  in range(0,10):
#    print(i)
