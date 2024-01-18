import turtle

bob = turtle.Turtle()

bob.color('red', 'yellow')
bob.shape("turtle")
#bob.forward(200)
#bob.begin_fill()
#for i in range(3):
#    bob.forward(100)
#    bob.left(120)

bob.begin_fill()

while True:
    bob.forward(200)
    bob.left(170)
    if abs(bob.pos()) < 1:
        break
bob.end_fill()
turtle.done()
