for x in range(10):
    print(x**2)

print("----------")
for x in range(20,0,-1):
    print("T-Minus: " + str(x))
print("BLAST OFF")

def bottlesOfBeer(n):
    print("This should print out " + str(n) + " lines")

def printHello():
    print("Hello")
    
def main():
    print("my program starts here")
    printHello()
    numBottles = int(input("How many bottles?"))
    bottlesOfBeer(numBottles)


main()
