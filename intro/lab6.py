# given floating point number (eg $X.YY) 
# print number of coins returned'

def isFloat(text):
	validChars = "1234567890."
	if len(text) == 0:
		return False
	for char in text:
		if char not in validChars:
			return False
	if text.count(".") > 1:
		return False
	return True


def numCoins(value):
	# assume value is a float
	total = 0
	cents = int(value * 100)
	while cents >= 25:
		
	return total
	
	
	
text =  input("Enter the amount of change, I will return number of coins: ")
while not isFloat(text):
	text =  input("Enter the amount of change, I will return number of coins: ")
value = float(text)
total = numCoins(value)
print(value,"requires", total,"coins in change")











