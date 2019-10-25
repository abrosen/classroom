import turtle


bob = turtle.Turtle()
bob.shape("turtle")
bob.shapesize(1.5,1.5)
bob.penup()


def triangle(bob):
	for line in range(5):
		for _ in range(10 - line* 2):
			bob.forward(50)
			bob.stamp()
		bob.back(50*(10 - line *2))
		bob.right(90)
		bob.forward(50)
		bob.left(90)	
	
bob.write("Hello, world how are you?", move=True,font=("Fira Sans",30,"normal"))

turtle.done()
