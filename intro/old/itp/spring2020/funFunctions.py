import turtle
bob = turtle.Turtle()
alice = turtle.Turtle()
alice.color("red")
bob.shapesize(2)
bob.pensize(2)

print(3,"apple")

# draws a Square
# t is the turtle doing the drawing
# size is the size of a side of the square
# size is 100 if not defined
def drawSquare(t,size=100):
    for i in range(4):
        t.fd(size)
        t.rt(90)

def spam():
     print("spam, eggs, and spam.")
     print("spam, spam, eggs, baked beans, spam")

def f(x):
    print(2*x)


def stampRow(t,numStamps):
    t.penup()
    for i in range(numStamps):
        t.forward(100)
        t.stamp()
        

def stampSquare(t,numRows):
    for i in range(numRows):
        t.goto(0,i*-100)
        stampRow(t,numRows)


#
##
###
####
#####

######
######
######
######
######
######

def drawTextPyramid(rows):
    for line in range(rows):
        print("#"*(line+1))
    


drawTextPyramid(5)


#stampSquare(bob,5)     
    
    

"""
drawSquare(bob)
alice.goto(200,200)
drawSquare(alice,300)
"""





"""
print("outside the function")
print("calling the spam function")
spam()
print("done calling the spam function")
spam()

for i in range(5):
print(spam())
"""
