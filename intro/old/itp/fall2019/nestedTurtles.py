import turtle

bob = turtle.Turtle()
bob.shape("turtle")
bob.shapesize(1.5,1.5)
bob.pensize(3)
bob.speed(0)

gap = 15
baseLength = 100
numSquares = 10
sideColors = ["cyan","pink", "yellow", "green", "red","teal"]
#sideColors = ["cyan","cyan", "cyan", "cyan","cyan"]


for square in range(numSquares):
    
    for color in sideColors:
        bob.color(color)
        bob.forward(baseLength + square*gap*2)
        bob.right(360//len(sideColors))

    #bob.penup()
    bob.back(gap)
    bob.left(90)
    bob.forward(gap)
    bob.right(90)
    bob.pendown()
    firstColor = sideColors[0:1]
    otherColors = sideColors[1:]
    sideColors = otherColors + firstColor
    

    
