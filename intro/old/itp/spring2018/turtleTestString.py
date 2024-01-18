import turtle
import random

"""
def sayHi(x,y):
    degrees = random.randint(1,360)
    bob.left(degrees)
    bob.forward(100)
bob.onclick(sayHi)
"""

bob  = turtle.Turtle()
bob.speed(1)
bob.shape("turtle")
bob.goto(-200,200)

data =  open("testFile.txt","r")
for line in data:
    x,y  = bob.position()
    
    for letter in line[::2]:
        bob.write(letter, True, font=("Fira Mono",20,"normal"))
    bob.penup()
    bob.goto(x ,y-40)
    bob.pendown()
    
#message = "Hello, how are you\n, my writing is super tiny"
#for letter in message:
  #  bob.write(letter, True, font=("Fira Mono",36,"normal"))




turtle.done()
