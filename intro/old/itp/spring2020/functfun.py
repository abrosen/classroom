import turtle

PI = 3.14159


def hello():
    """This is a simple function 
    that says "hello"
    """
    print("hello")
    print("how are you?")

def drawSquare(bob, sz):
    """Make turtle bob draw a square of with side sz."""
    
    bob.color("green")
    
    for i in range(4):
        bob.forward(sz)
        bob.left(90)



alice = turtle.Turtle()
alice.color("red")
bob  =  turtle.Turtle()
bob.color("blue")



alice.goto(-100,100)
drawSquare(alice,100)

bob.goto(100,-100)
#drawSquare(bob,100)
turtle.done()