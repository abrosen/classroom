import re

def findSupers(filename):
	text = open(filename,'r')
	supers = []
	#superRegex = re.compile(r"\w+man|\w+woman|\w+boy|\w+girl")
	for line in text:
		line= line.split(" ")
		supers += superRegex.findall(line)		
	return supers

def euler5():
	done = False
	num  = 2520
	while not done:	
		good = True
		for i in range(3,21):
			if num % i != 0:
				good = False
				break
		if good:
			done = True
		else:
			num +=2
		if num % 1000000 == 0:
			print(num)
	return num
	
def sumDigits(num):
	total  = 0
	while num != 0:
		total += num % 10
		num = num // 10
	return total
	
	

def isPalindrome(word):
	reversedWord =  ""
	for letter in word[::-1]:
		reversedWord =  reversedWord +letter 
		
	return reversedWord == word


# ’Andrew Rosen’,12 -> ar12
# ’Alan Turing’, 5 -> at5
# ’Andrew Benjamin Rosen’, 3 -> abr3
# ’Andrew Benjamin Rosen’, 104 -> abr104
def makeUsername(name,n):
	initials = ""
	name = name.split(" ")
	for part in name:
		firstLetter = part[0]
		firstLetter = firstLetter.lower()
		initials += firstLetter
	return initials + str(n)

def isPermutation(word1,word2):
	count1 = {} # keys are each character in word1
	# value is the counts of each character in word2
	count2 = {} # same, but word2
	
	for letter in word1:
		if letter not in count1:
			count1[letter] = 1
		else:
			count1[letter] = count1[letter] +1
	
	# same, but for word2 and count2
	for letter in word2:
		if letter not in count2:
			count2[letter] = 1
		else:
			count2[letter] = count2[letter] +1
	
	return count1 == count2

def belowAverage(numbers):
	avg = sum(numbers) / len(numbers)
	below = []
	for n in numbers:
		if n < avg:
			below.append(n)
	return below
	

def sumOfTens(numbers):
	total = 0
	for innerList in numbers:
		for item in innerList:
			if item % 10 == 0:
				total += item
	return totral

def sumOfFile(filename):
	text =  open(filename,'r')
	total = 0
	for line in text:
		line = line.split(",")
		for item in line:
			total =  total +int(item)
		
	return total
	

def mono():
	doubles = 0
	doubles2 = 0
	doubles3 = 0
	for _ in range(100000):
		roll1 = random.randint(1,6)
		roll2 = random.randint(1,6)
		if roll1 == roll2:
			doubles+=1
			roll1 = random.randint(1,6)
			roll2 = random.randint(1,6)
			if roll1 == roll2:
				doubles2+=1
				roll1 = random.randint(1,6)
				roll2 = random.randint(1,6)
				if roll1 == roll2:
					doubles3 += 1
	print(100000 - (doubles+ doubles2+ doubles3) / 100000)
	print(doubles/100000)
	print(doubles2/100000)
	print(doubles3/100000)
#print(findSupers("hero.txt"))
print(euler5())








