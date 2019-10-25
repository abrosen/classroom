def doubleIt(x):
	
	return 2*x
	print("done")



def countEvens(myList):
	numEvens = 0
	for num in myList:
		if num % 2 == 0:
			numEvens = numEvens + 1
	return numEvens
	
def sumDigits(num):
	total = 0
	while num > 0:
		lastDigit = num % 10
		num = num // 10
		total = total + lastDigit
	return total



def spam(text):
	print(text)
	print(text)


words = "Here are some words"
spam(words)
