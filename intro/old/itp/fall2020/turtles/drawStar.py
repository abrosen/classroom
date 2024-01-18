import turtle

bob = turtle.Turtle()
bob.speed(0)

for i in range(50):
    print(i)
    bob.fd(i * 10)
    bob.rt(144)
    
