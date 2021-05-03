text = open("instructions.txt",'r')

import turtle
bob = turtle.Turtle()

bob.shape('turtle')
bob.shapesize(2)
bob.pensize(2)



for line in text:
    line = line.strip()
    line = line.split(" ")
    print(line)
    instruction =  line[0]
    val = int(line[1])
    if instruction == 'f':
        bob.forward(val)
    elif instruction == 'l':
        bob.left(val)
    elif instruction == 'r':
        bob.right(val)


turtle.done()