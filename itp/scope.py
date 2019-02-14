import turtle

bob = turtle.Turtle()
bob.penup()

for row in range(5):
	for dot in range(row+1):
		bob.stamp()
		bob.forward(50)
	bob.right(90)
	bob.forward(50)
	bob.right(90)
	bob.forward(50*(row+1))
	bob.right(180)
	
turtle.done()
