import turtle


painter =  turtle.Turtle()
turtle.colormode(255)
painter.pencolor(0,0,255)
painter.speed(0)

for i in range(50):
    painter.forward(100)
    painter.left(123)




painter.speed(0)

for i in range(50):
    painter.pencolor(50 + 4*i,0, 50+ 4*i)
    painter.forward(200)
    painter.left(123)

turtle.done()
