import turtle

bob =  turtle.Turtle()

def drawSquare(bob, side):
    for _ in range(4):
        bob.forward(side)
        bob.right(90)


def drawFour(bob,side):
    for _ in range(4):
        drawSquare(bob,side)
        bob.penup()
        bob.right(90) # face down
        bob.forward(side/2)
        bob.left(90) # face east again
        bob.forward(side/2)
        bob.pendown()

drawFour(bob,100)

"""
Find the sum of all the multiples of 3 or 5  below 1000.
"""
#loop thru all numbers < 1000
#   if number is divisible by 3 or 5
#       add it to our running total
def euler1():
    total = 0
    for num in range(1000):
        if num % 3 == 0 or num % 5 == 0:
            total += num
    print(total)

"""
10 8 6 4 2 0
8 6 4 2 0
6 4 2 0
4 2 0
2 0
0
"""

def nested():
    rows = 6
    cols = 6
    for r in range(rows):
        start = 10 - r*2
        for c in range(cols-r):
            print(start - c*2,end=" ")
        print()
        

#nested()

def printReverse(text):
    output = "" 
    #for letter in text:
    #    output =  letter + output 
    #for index in range(len(text), -1 , -1):
    #    letter = text[index]
    #    output = output +letter

    #for offset in range(len(text)):
    #    letter = text[  len(text)-1 - offset]
    #    output = output +letter
    print(text[::-1])
    print(output)


#euler1()
