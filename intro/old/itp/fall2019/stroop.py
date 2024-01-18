import turtle
import random

colors = ["red", "green", "blue", "purple","yellow","black","brown"]

WORDS_PER_LINE = 5
LINES = 5

bob = turtle.Turtle()
bob.shape("turtle")
bob.shapesize(1.5,1.5)
bob.penup()
bob.goto(-300,300)

for line in range(LINES):
	for _ in range(WORDS_PER_LINE):
		word = random.choice(colors)
		color = random.choice(colors)
		while color == word or color == "yellow":
			color = random.choice(colors)
		bob.color(color)
		bob.write(word,move=True,font=("Arial",24,"normal"))
		bob.write(" ",move=True,font=("Arial",24,"normal"))
		
		
	bob.goto(-300,300 -(50 *(line+1)))
	
	
turtle.done()
