word = input("Enter a word ")
if len(word) > 12:
    print("Wow; " + word + " is a REALLY big word")
elif len(word) > 10:
    print("Wow; " + word + " is a big word")
else:
    print("You entered " + word)
    print("That was pretty boring")
    print("Try something else")


#else:


print("Program is done.")
