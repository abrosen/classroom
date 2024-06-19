import turtle

bob = turtle.Turtle()
bob.pensize(10)
bob.speed(0)

colors = ["red","blue","green","black","yellow","purple"]
"""
for c in colors:
    bob.color(c)
    bob.forward(100)
"""

def draw1(bob,size,colors):
    for c in colors:
        bob.color(c)
        bob.forward(size)
        bob.right(360//len(colors))

def draw2(bob,numShapes,size,colors):
    for _ in range(numShapes):
        draw1(bob,size,colors)
        bob.right(360/numShapes)
        bob.forward(size)

def draw3(bob,size,numSides,colors):
    for _ in range(40):
        for c in colors:
            bob.color(c)
            drawShape(bob,size,numSides)
            bob.right(360//len(colors))
        bob.right(360//40+2)
        bob.forward(50)

def drawShape(bob,size,numSides):
    for _ in range(numSides):
        bob.forward(size)
        bob.right(360//numSides)
    
#draw1(bob,100,["red","blue","green","yellow"])
#draw2(bob, 50 ,100,colors)
draw3(bob,100,8,colors)

        
