import turtle
#def reverse(text):
    #for i in range(len(text) -1, -1,-1):
    #    print(text[i], end="")

    #output =  ""
    #for letter in text:
        #output = letter + output
    #print(output)

    #print(text[::-1])
    #print(reversed(text))

def drawSquare(bob,side):
     for _ in range(4):
         bob.forward(side)
         bob.right(90)

x = 6
foo =10
def drawProblem(bob):
    print(foo)
    side = 100
    for _ in range(4):
        drawSquare(bob,side)
        bob.up()
        bob.right(90)
        bob.forward(side/2)
        bob.left(90)
        bob.forward(side/2)
        bob.down()
        



bob =  turtle.Turtle()
drawProblem(bob)
