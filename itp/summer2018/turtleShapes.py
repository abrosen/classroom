import turtle 
polygon = turtle.Turtle()
polygon.speed(0)
polygon.shape("turtle")
polygon.pensize(3)


def drawRegularPoly(sides, size):
    angle = 360/sides

    for i in range(sides):
        polygon.forward(size)
        polygon.right(angle)


drawRegularPoly(20, 50)    
turtle.done()
