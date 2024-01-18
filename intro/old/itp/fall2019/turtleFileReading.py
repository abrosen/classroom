import turtle

commands =  open("turtle boss.commands",'r')
bob =  turtle.Turtle()

for line in commands:
	parts = line.split()
	command = parts[0]
	
	if command == "f":
		bob.forward(int(parts[1]))
	if command == "r":
		bob.right(int(parts[1]))
	if command == "l":
		bob.left(int(parts[1]))
	if command == "g":
		bob.goto(int(parts[1]),int(parts[2]))
turtle.done()
