def init():
	wordsByLength = {}
	text = open("words.txt", "r")
	for line in text:
		word = line.strip()
		if len(word) not in wordsByLength:
			wordsByLength[len(word)]  =  [word]
		else:
			wordList = wordsByLength[len(word)]
			wordList.append(word)
	return wordsByLength

def q1(filename):
	data = open(filename,"r")
	total = 0
	for line in data:
		parts = line.split(",")
		value =  float(parts[2])
		if parts[0] != "Food":
			total+=value 
	return total
	
def isVowel(c):
	vowels = "aeiou"
	if c in vowels:
		return True
	return False
	# return c in "aeiou"
	
	
def mostVowels(words):
	
	wordWithMostVowels = ""
	most = 0
	
	for word in words:
		count = 0
		for letter in word:
			if isVowel(letter):
				count+=1
		if count > most:
			wordWithMostVowels = word
			most = count 
	return wordWithMostVowels

def mostCommonWord(text):
	words = text.split(" ")
	count = {}
	for word in words:
		if word not in count:
			count[word] = 1 
		else:
			count[word] += 1
	
	mostCommonSoFar = ""
	mostCount = 0
	
	for word in count:
		if count[word] > mostCount:
			mostCommonSoFar = word
			mostCount =  count[word]
	return mostCommonSoFar
			
	
print(init())


