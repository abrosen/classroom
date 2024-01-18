import turtle
alice  =  turtle.Turtle()
bob = turtle.Turtle()
bob.shape("turtle")

alice.penup()
size = 100
for i in range(50):
    alice.goto(5*i,5*i)
    alice.turtlesize(i+2,i+2)
    alice.left(30)
    alice.stamp()
    
    if i % 2 == 0:
        bob.penup()
    else:
        bob.pendown()
        
    bob.pencolor(1-i*.01 ,0 ,0+0.02*i)
    bob.forward(size + i*10)


    #if i % 2 == 0:
    #    bob.forward(size)
    #else:
    #    bob.forward(2*size)
    bob.left(90)


turtle.done()
