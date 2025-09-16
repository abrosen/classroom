import turtle

bob = turtle.Turtle()
bob.shape("turtle")
#bob.color(0,1,1)


#for i in range(50):
#    for _ in range(4):
#        bob.forward(i*5)
#        bob.right(90)
#    bob.forward(10)
#    bob.color(1 - i*1/50,0,i/50)

for i in range(50):
    bob.forward(i*5)
    bob.right(61)
    bob.forward(10)
    bob.color(1 - i*1/50,0,i/50)
