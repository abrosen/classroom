
import turtle

# "hello"-> "h, e, l, l, o"
# "one two!" -> "o, n, e, , t, w, o, !"
# "a" -> "a"
def eachChar(s):
	if len(s) == 1:
		return "" + s
	out = ""
	for index in range(len(s)-1):
		char = s[index]
		out = out + char+ ", "	
	
	return out + s[-1]

def sumOfThrees(n):
	if n <= 0:
		return 0
	total =  0
	for multiple in range(1,n+1):
		total = total +multiple*3
	
	return total

def spiral():
	alice  = turtle.Turtle()
	for step in range(1,50):
		alice.forward(100+step*20)
		alice.right(45)

def euler1():
	total = 0
	for num in range(1000):
		if num % 3 == 0 or num % 5 == 0:
			total += num
	
	
	return total 
	
	
print(euler1())

