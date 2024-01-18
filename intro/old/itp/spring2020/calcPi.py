
def f(x,y,z):
	print(str(x) + " is the first argument")
	print(str(y) + " is the second argument")
	print(str(z) + " is the third argument")
	
def doubleThis(x):
	return 2*x
	

def getMultiplesThru5(x):
	return x, 2*x, 3*x, 4*x, 5*x


# returns the sum of the numbers 1+2+3...+(n-1)+n
# if n  < 1, return 0
def summation(n):
	total = 0 
	for num in range(1,n+1):
		total = total + num
		print(num,total,sep="\t")
	return total


def leibniz(n):
	total = 0
	"""
	negative = False
	for num in range(n):
		numerator = 1
		if negative:
			numerator = -1
		denominator = (2*num+1)
		print(numerator,denominator,sep="/")
		negative = not negative
	"""
	for num in range(n):
		if num % 2 == 0:
			numerator = 1
		else:
			numerator = -1
		denominator = (2*num+1)
		total = total + (numerator/denominator)
	return total*4

print(leibniz(10000000))

#print(doubleThis(15))
#print(summation(5))

"""
f(1,2,"buckle my shoe")
ans = 2 * doubleThis(4)
print(ans)
ans = 2 * doubleThis(5)
print(ans)

a,b,c,d,e = getMultiplesThru5(5)
allTheAnswers = getMultiplesThru5(1)
print(a,b,c,d,e, sep="\t")
print(a)
print(b)
print(c,e)
print(d)
print(e)
print(allTheAnswers)
"""
