#https://michael0x2a.com/blog/turtle-examples
import turtle

bob =  turtle.Turtle()
bob.speed(0)

for _ in range(180):
    bob.pencolor("black")
    bob.forward(100)
    bob.right(30)
    bob.pencolor("blue")
    bob.forward(20)
    bob.left(60)
    bob.pencolor("red")
    bob.forward(50)
    bob.right(30)

    bob.penup()
    bob.goto(0,0)
    bob.pendown()
    bob.right(2)
