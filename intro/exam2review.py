def readTemps(filename):
	data = open(filename,"r")
	lines = data.readlines()
	hottestTemp = -100000
	hottestDay = ""
	coldestTemp = 100000
	coldestDay = ""
	
	totalHigh = 0
	for line in lines:
		parts = line.split(",")
		date = parts[0]
		high = int(parts[1])
		low = int(parts[2])
		
		if high > hottestTemp:
			hottestDay = date
			hottestTemp = high
		if low < coldestTemp:
			coldestDay = date
			coldestTemp = high
		totalHigh += high
			
	print(totalHigh/len(lines))
	
def unOrUn(word):
	if word[:2] == 'un':
		return word[2:]
	else:
		return "un"+word

# [1,2,3,4,5] -> 4
# [15,31,21,17,28] -> 16
# [-1,-100,12,2,100] -> 200
def maxMinDiff(numbers):
	return max(numbers) - min(numbers)

# [1,2,3,4,5] -> [5,2,3,4,1]
# [15,31,21,17,28] -> [28,31,21,17,15]
# [-1,-100,12,2,100] -> [100,-100,12,2,-1]
def swapEnds(numbers):
	temp  = numbers[0]
	numbers[0] = numbers[-1]
	numbers[-1] = temp

# [1,2,3,4,5,6] -> [1,2,3]
# [15,31,21,17,28] -> [15,31]
# [”a”,”b”,”c”,”d”,”e”,”f”,”g”,”h”] -> [”a”,”b”,”c”,”d”]
def firstHalf(theList):
	midpoint = len(theList)//2
	return theList[:midpoint]
	
# hasWildcat(”kitty”) -> false
# hasWildcat(”tomcat”) -> true
# hasWildcat(”c4tn1P”) -> true
def hasWildcat(word): # A-- would not buy again
	for index in range(len(word) -2):
		letter = word[index]
		if letter == 'c' and word[index+2] == 't':
			return True
	return False

# source: http://codingbat.com/prob/p110222
# isEverywhere([1, 2, 1, 3], 1) -> true
# isEverywhere([1, 2, 1, 3], 2) -> false
# isEverywhere([1, 2, 1, 3, 4], 1) -> false
# isEverywhere([3, 2, 1, 3, 4], 1) -> false
def isEverywhere(nums, val):
	for index in range(len(nums)):
		sliced = nums[index:index+2]
		if len(sliced) == 2 and val not in sliced:
			return False
	return True


# http://codingbat.com/prob/p197890
# sumStringDigits(”aa1bc2d3”) -> 6
# sumStringDigits(”aa11b33”) -> 8
# sumStringDigits(”Chocolate”) -> 0
def sumStringDigits(word):
	total = 0
	for letter in word:
		if letter.isDigit():
			total += int(letter)
	return total
	
	
# sumDigits(1234) -> 10
# sumDigits(1000) -> 1
# sumDigits(-581) -> 14
def sumDigits(num):
	total = 0
	if num < 0:
		num = num * -1
	while num != 0:
		digit = num % 10
		total += digit
		num = num//10
		
	return total
	#return sumStringDigits(str(num))

import random

def roll():
	return random.randint(1,6)

def monop():
	doubles = 0
	for i in range(3):
		 d1 = roll()
		 d2 = roll()
		 if d1 != d2:
			 return doubles
		 doubles +=1 
	return doubles
	"""
	
	
	
	d1 = roll()
	d2 = roll()
	
	if d1 != d2:
		return 0
		
	d1 = roll()
	d2 = roll()
	
	if d1 != d2:
		return 1
	
	d1 = roll()
	d2 = roll()
	
	if d1 != d2:
		return 2
	return 3
	"""

def letterCount(word):
	count = {}
	count["a"] = 0
	for letter in word:
		if letter not in count:
			count[letter] = 1
		else:
			count[letter] = count[letter] + 1
	
	mostCommonLetter = "a"
	for letter in count:
		if count[letter] > count[mostCommonLetter]:
			mostCommonLetter = letter
	return letter
	

def flip():
	faces = "HT"
	return random.choice(faces)


def game(seq1,seq2):
	flips = ""
	while True:
		flips += flip()
		if flips[-3:] == seq1:
			return True
		elif flips[-3:] ==seq2:
			return False

TRIALS =100000
wins = 0
for _ in range(TRIALS):
	result =  game("HHT", "THH")
	if result:
		wins+=1	

print(wins/TRIALS)
"""

TRIALS = 100000
results = {0:0,1:0,2:0,3:0} # [0,0,0,0]
for _ in range(TRIALS):
	outcome =  monop()
	results[outcome] = results[outcome] + 1
for double in results:
	print(double, results[double]/TRIALS)
"""
