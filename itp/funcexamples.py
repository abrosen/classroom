def doubleThis(x):
    print(2*x)


def printMessage(message):
    print(message)

def spamMessage(message, numberOfTimes):
    for x in range(numberOfTimes):
        print(message)

def triangle(height):
    for x in range(height):
        #print("  /\\  ")
        #print(" /  \\ ")
        #print("/    \\")
        print(" "*(height - (x+1)),end="")
        print("/",end="")
        print(" "*x*2,end="")
        print("\\",end="")
        print(" "*x)
    
def printHello():
    print("Hello")

triangle(15)
#printMessage("hello, how are you")
#spamMessage("Foo",5)
#print("spam",end ="\t")
#print("egg", end="")
#print("done")
#printHello()
#doubleThis("hello4")
