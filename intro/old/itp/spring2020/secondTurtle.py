# import turtle
import turtle

# create a turtle
bob = turtle.Turtle()
bob.shape("turtle")
bob.shapesize(2)
bob.pensize(3)
bob.speed(10)
# make the turtle do stuff

#for i in range(4):
#    bob.forward(100)
#    bob.right(90)
#    print(i)

#for i in range(50):
#    bob.forward(300)
#    bob.right(144)

for i in range(50):
    bob.forward(100+10*i)
    bob.right(144)
    print(i,10*i,100+10*i)


# (if not in IDLE) turtle.done()
turtle.done()
