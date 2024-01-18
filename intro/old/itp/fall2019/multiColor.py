import turtle

bob =  turtle.Turtle()
bob.pensize(50)
colors = ["red","green","cyan","blue","purple","black","#ff00ff","brown","red", "yellow"]

for color in colors:
    print(color)
    bob.color(color)
    bob.forward(50)
