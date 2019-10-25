import turtle
bob = turtle.Turtle()
screen = turtle.Screen()
bob.shape("turtle")
screen.colormode(255)
for x in range(20):
    bob.forward(20 + 10*x)
    bob.lt(120)
    bob.pencolor(10*x +50, 10*x, 0)
turtle.done()
