def sayHi():
    print("Hello")
    print("World")


# prints a line of |length| stars
def printLine(length):
    print("*" * length)
    #for i in range(length):
    #    print("*",end="")



def printSquare(side):
    for i in range(side):
        printLine(side)


printSquare(5)
