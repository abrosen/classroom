import turtle
alice = turtle.Turtle()
bob =  turtle.Turtle()
alice.pensize(5)
bob.pensize(5)


def drawPoly(dude, sides, size, direction):
    angle = 360 /sides
    if direction > 0:
        direction = 1
    else:
        direction = -1
    for i in range(sides):
        dude.left(direction * angle)
        dude.forward(size)

drawPoly(alice,5,50,1)
drawPoly(alice,6,50,1)

drawPoly(bob,5,50,-1)        
