print("Please enter a string, I will tell you how long it is")
userInput = input()
size = len(userInput)
print(size)

if size > 15:
    print("That's a REALLY BIG STRING!")
elif size > 10:
    print("That's a big string")
elif size > 7:
    print("That's a kinda big string")
else:
    print("That's a small string")
print("Done")
    
#if size > 15:
#    print("That's a REALLY BIG STRING!")
#else:
#    if size > 10:
#        print("That's a big string!")
#        print("Inside the if") 
#    else:
#        if size > 7:
#            print("That's kinda a big string")
#        else:
#            print("That's a small string!")
#print("Done")
