import turtle
wn = turtle.Screen()
wn.bgcolor("yellow")

tess = turtle.Turtle()
tess.color("blue")
tess.shape("triangle")


dist = 5
tess.up()                     # this is new
for _ in range(45):    # start with size = 5 and grow by 2
    tess.stamp()                # leave an impression on the canvas
    tess.forward(dist)          # move tess along
    tess.right(48)              # and turn her
    dist = dist + 2
wn.exitonclick()

