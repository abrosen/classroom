import turtle





"""
bob =  turtle.Turtle()
bob.shape("turtle")

for i in range(sides):
    bob.forward(100)
    bob.right(360/sides)
"""

def drawNgon(fred,numSides,sideLength):
    for i in range(numSides):
        fred.forward(sideLength)
        fred.right(360/numSides)






bob = turtle.Turtle()
bob.shape("turtle")
bob.color("blue")
bob.up()
bob.forward(200)
bob.down()

alice = turtle.Turtle()
alice.shape("turtle")
alice.color("red")

drawNgon(bob,6,100)



#sides = input("how many sides in the shape")
#sides = int(sides)


    
