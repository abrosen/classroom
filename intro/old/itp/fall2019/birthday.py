import random


def generateBirthday():
	return random.randrange(1,365)

# generates a list of num birthdays
def generateBirthdaysList(num): 
	birthdays = []
	for _ in range(num):
		birthdays.append(generateBirthday())
	return birthdays

def countPairs(birthdays):
	numPairs = 0
	for startIndex in range(len(birthdays)):
		birthday =  birthdays[startIndex]
		for index in range( startIndex+1 , len(birthdays)):
			numPairs += 1 
	return numPairs

def hasDuplicateBirthday(birthdays):
	sortedList = sorted(birthdays)
	for i in range(len(sortedList)  - 1):
		left = sortedList[i]
		right = sortedList[i+1]
		if right == left:
			return True
	return False
	
def checkCountsForDuplicates(counts):
	for birthday in counts:
		if counts[birthday] > 1:
			return True
	return False
	
def checkCountsForTriplicates(counts):
	for birthday in counts:
		if counts[birthday] > 2:
			return True
	return False

def checkCountsForQuadruplicates(counts):
	for birthday in counts:
		if counts[birthday] > 3:
			return True
	return False

def countNplicates(counts):
	nplicates = {}
	for birthday in counts:
		count = counts[birthday]
		if count not in nplicates:
			nplicates[count] = 1
		else:
			nplicates[count] = nplicates[count] + 1
	return nplicates

def countBirthdays(birthdays):
	counts = {}
	for birthday in birthdays:
		if birthday not in counts:
			counts[birthday] = 1
		else:
			counts[birthday] = counts[birthday] + 1
	return counts



def main():
	#birthdays  = generateBirthdaysList(70)
	#counts = countBirthdays(birthdays)
	"""
	dups = 0
	trips = 0
	quads = 0
	for _ in range(10000):
		birthdays  = generateBirthdaysList(365)
		counts  = countBirthdays(birthdays)
		if checkCountsForDuplicates(counts):
			dups += 1
		if checkCountsForTriplicates(counts):
			trips += 1
		if checkCountsForQuadruplicates(counts):
			quads += 1
	print(dups/10000,trips/10000,quads/10000)
	"""
	birthdays  = generateBirthdaysList(365)
	counts  = countBirthdays(birthdays)
	nplicates = countNplicates(counts)
	print(nplicates)

main()
