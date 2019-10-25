def triangle(width):
	lines = width//2
	for line in range(lines):
		print(" "*(lines - line - 1),end="")
		print("/",end="")
		print(" "*(2*line),end="")
		print("\\",end="")
		print()
	
	#print("   /\\  ")
	#print("  /  \\ ")
	#print(" /    \\")
	#print("/      \\")
"""
line   before     middle
0        3          0
1        2          2
2        1          4
3        0          6
...
n        lines - (line +1)          2*line
"""

def rectangle(height,width):
	
	print("="*width) #top
	for line in range(height -2):
		print("|",end="")
		print(" "*(width-2),end="")
		print("|",end="")
		print()
	
	print("="*width) #bottom
	#print("======")
	#print("|    |")
	#print("|    |")
	#print("|    |")
	#print("|    |")
	#print("======")

def exhaust(width):
	for line in range(3): 
		print(" "*(width//2  -  line),end="")
		print("|",end="")
		print()

	print(" "*(width//2  -  1),end="")
	print("|",end="")
	print()
	#       01234567
	#print("    |   ")
	#print("   |    ")
	#print("  |     ")
	#print("   |    ")


def buildRocket(height,width):
	triangle(width)
	for _ in range(3):
		rectangle(height,width)
	triangle(width)
	for _ in range(5):
		exhaust(width)


buildRocket(20,8)
