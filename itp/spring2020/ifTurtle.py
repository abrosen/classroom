import turtle
turtle.colormode(255)

bob = turtle.Turtle()

bob.shape("turtle")
bob.shapesize(2)
bob.pensize(2)
bob.color("orange")
bob.speed(10)

# range of variable is [0,end)
# or... starts at zero inclusive and goes up
# but does not include the endpoint
"""
for step in range(500): 
    print("Bob is at step " + str(step))
    if step > 250:
        bob.color("blue")
    elif step > 100:
        bob.color("red")
    
    
    bob.forward(1)

    
print("This is out of the for loop")
"""
length = 200
"""
for side in range(4):
    if side == 0:
        bob.color("red")
    if side == 1:
        bob.color("green")
    if side == 2:
        bob.color("blue")
    if side == 3:
        bob.color(0, 0, 0)
    bob.forward(length)
    bob.right(90)

"""
turtle.tracer(5000)
for blueness in range(256):
    bob.penup()
    bob.goto(0, blueness * -2)
    bob.pendown()
    for redness in range(256):
        bob.color(redness,0,blueness)
        bob.fd(3)




