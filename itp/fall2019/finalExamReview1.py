import re

# 
def valid_n_Number(studentID):
	idRegex = re.compile("N\d{8}")
	if idRegex.match(studentID):
		return True
	else:
		return False
	"""
	if len(studentID) != 9:
		return False
	if studentID[0] != "N":
		return False
	for letter in studentID[1:]:
		if letter not in "1234567890":
			return False
	return True
	"""		
def enter5IDs():
	ids = []
	
	for _ in range(5):
		userInput = input("Please enter a valid ID: ")
		while not valid_n_Number(userInput) or userInput in ids:
			userInput = input("Invalid ID. Please enter a valid ID, meatbag: ")
		ids.append(userInput)
	ids = sorted(ids)
	for id in ids:
		print(id)	
	
	
def reduceLyrics(lyrics):
	lyrics = lyrics.split(" ")
	print(lyrics)
	originalWords = []
	for word in lyrics:
		word = word.lower()
		if word not in originalWords:
			originalWords.append(word)
	return " ".join(originalWords)
#print(reduceLyrics("like Baby baby baby ohhh Baby baby Like nooo"))

# text is string
def line(text):
	for char in text:
		if char not in "1234567890":
			return ""
	num =  int(text)
	if num % 2 == 0:
		return "#"*num
	else:
		return "*"*num

# rules:
# 1 optional country code, 3 area code, 3 exchange, 4 finals digits 
# area code and exchange can't start with 1 or 0
# sperators are optional and can be a - space or period
def isValidPhoneNumber(num):
	phoneRegex = re.compile(r"(1[- .]?)?[23456789]\d\d[- .]?[23456789]\d\d[- .]?\d\d\d\d")
	if phoneRegex.match(num):
		return True
	else:
		return False
	
	

print(isValidPhoneNumber("1-800222z2222"))


def wordLineCount(fileName):
	text = open(fileName, 'r')
	count = {}
	for line in text:
		line= line.strip() 
		words = line.split(" ")
		seen = []
		for word in words:
			if word not in count:
				count[word] = 1
			elif word not in seen:
				count[word] = count[word] + 1 
			seen.append(word)
	return count

print(wordLineCount("ben.txt"))
"""
x = [snow,snowflake,sled,sledding]


------
snow!
snowflake?
sled!
sledding!
"""

