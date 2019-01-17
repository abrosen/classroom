import turtle
bob = turtle.Turtle()
wn = turtle.Screen()
wn.bgcolor("black")
bob.color("white")
bob.shape("turtle")
bob.pensize(20)



def drawSquare(size):
    for i in range(4):
        bob.forward(size)
        bob.left(90)

drawSquare(100)
bob.speed("slowest")
bob.forward(200)
drawSquare(50)
bob.left(90)
bob.forward(200)
drawSquare(20)
turtle.done()
