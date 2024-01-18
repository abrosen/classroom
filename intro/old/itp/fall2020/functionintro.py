import turtle


def printHello():
    print("hello")
    print("this is inside a function")
    print("this is yet another line in the function")

def manyHellos(repeats):
    for _ in range(repeats):
        print("hello")
    repeats = repeats + 1
    print("repeats in the function is",  repeats)
  

def drawSquare(herp, size):
    for _ in range(4):
        herp.fd(size)
        herp.rt(90)


def eyeTetrimo(bob,size):
    # bob will draw a vertical tetrimo 
    # each of the four squares in the tetrimo 
    # will have a side length of size
    for _ in range(4):
        drawSquare(bob,size)
        bob.rt(90)
        bob.fd(size)
        bob.lt(90)




"""
alice = turtle.Turtle()
alice.color("red")
alice.penup()
alice.goto(-200,200)
alice.pendown()
"""

bob = turtle.Turtle()
bob.penup()
bob.goto(0,100)
bob.pendown()
eyeTetrimo(bob,50)

#drawSquare(bob,100)
#drawSquare(alice,150)

turtle.done()

#num = int(input("how many times to print? "))
#manyHellos(num)
#print("but it is ", num, "on the outside")