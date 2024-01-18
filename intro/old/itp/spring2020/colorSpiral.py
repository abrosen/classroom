import turtle
turtle.colormode(255)


bob = turtle.Turtle()
bob.shape("turtle")
bob.shapesize(2,2)


bob.color(0,0,255)



"""
for _ in range(4):

    for _ in range(4):
        bob.forward(100)
        bob.right(90)

    bob.penup()
    bob.forward(150)
    bob.pendown()
"""
bob.speed(0)
for blueRemove in range(0,250,10):
    
    for red in range(0,250,10):
        bob.color(red,0,255 - blueRemove)
        bob.forward(10)
    bob.penup()
    bob.backward(250)
    bob.rt(90)
    bob.fd(1)
    bob.lt(90)
    bob.pendown()



turtle.done()