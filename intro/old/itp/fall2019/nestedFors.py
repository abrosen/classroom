for line in range(5):
	for _ in range(line):
		print("!",end="")
	for _ in range(5 - line):
		print("*",end="")
	print()
