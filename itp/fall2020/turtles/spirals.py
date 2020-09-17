import turtle

bob = turtle.Turtle()
bob.shape("turtle")
bob.shapesize(1.5,1.5)
bob.speed(10)
distance = 100
for _ in range(100):
    bob.forward(distance)
    bob.right(80)
    distance = distance + 20


