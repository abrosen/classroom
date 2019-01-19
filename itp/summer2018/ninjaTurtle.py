import turtle 

turtle.colormode(255)
ninja = turtle.Turtle()

ninja.speed(0)

for i in range(180):
    ninja.pencolor(i,i//2,i+50)
    ninja.forward(100)
    ninja.right(30)
    ninja.forward(20)
    ninja.left(60)
    ninja.forward(50)
    ninja.right(30)
    
    ninja.penup()
    ninja.setposition(0, 0)
    ninja.pendown()
    
    ninja.right(2)
    
turtle.done()
