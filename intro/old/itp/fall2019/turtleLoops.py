import turtle

bob= turtle.Turtle()
bob.shape("turtle")
bob.pensize(5)
bob.speed(0)
turtle.colormode(255)
bob.turtlesize(2,2)
"""
for x in range(0,5):
    
    if x % 2 == 0:
        bob.pencolor("blue")
        direction = 1
    else:
        bob.pencolor("red")
        direction = -1;


    
    bob.forward(100*direction)
    bob.penup()
    bob.forward((100+x*20)*direction)
    bob.stamp()

    # move back to starting x coordinate
    bob.right(180)
    bob.forward((200+x*20)*direction)

    #move down
    bob.left(90)
    bob.forward(20)
    
    # get ready for next part of the loop
    # by facing original direction
    bob.left(90)
    bob.pendown()
"""

"""
colors = ["red","orange", "green","pink","blue","black","purple"]

for index in range(0,len(colors)):
    color = colors[index]
    bob.pencolor(color)
    bob.forward(200+20*index)
    bob.right(120)
"""

turnAmount = 20
for x in range(360//turnAmount):
    # do the awesome move
    bob.pendown()
    bob.color( (2*x,0,255 -x  ) )
    bob.forward(150)
    bob.left(45)
    bob.color( (50,255-x,100 +x) )
    bob.forward(150)

    bob.right(30)
    bob.color( (150,255-x,150) )
    bob.forward(150)
    
    bob.penup()
    

    # face bob in the original direction
    # move bob back to the middle
    bob.right(15)
    bob.goto(0,0)
    
    #
    bob.left(turnAmount)
