import turtle
alice = turtle.Turtle()
alice.shapesize(2)
alice.shape("circle")
alice.speed(8)


alice.pencolor("blue")
alice.pensize(2)

for i in range(50):
    alice.forward(200)
    alice.left(123)

alice.pencolor("red")

for i in range(50):
    alice.forward(400)
    alice.left(123)


