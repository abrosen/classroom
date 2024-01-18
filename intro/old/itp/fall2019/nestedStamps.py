import turtle

def stamping(lines):
	bob = turtle.Turtle()
	bob.shape("turtle")
	bob.shapesize(1.5,1.5)
	bob.penup()
	
	for line in range(1,lines+1):
		for step in range(line):
			bob.forward(50)
			bob.stamp()
		
		bob.backward(50*line)
		
		bob.right(90)
		bob.forward(50)
		bob.left(90)


stamping(10)
turtle.done()
