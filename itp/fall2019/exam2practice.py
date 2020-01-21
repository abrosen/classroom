import random

"""
Suppose we have a file that contains the contents of the information every student at Temple
University called students.csv. The file contains various information on each student, with each
student having a single line for their data. Each line is has the following fields:
Student ID, First Name, Last Name, Age, Major, Credit Hours, GPA
with each field being separated by a comma. So an example file might look like:
90431, Alice, Hackerwoman, 21, CS, 43, 3.92
12331, Bob, Hackerman, 24, ENG, 13, 3.2
1337, Mallory, Malicious, 43, BIS, 90, 2.7
31212, Clark, Kent, 19, JRNL, 110, 4.0
Write a program reads the file and finds the average GPA of all students above the age of 40.
"""
def gpaProblem():
	data =  open("students.csv",'r')
	total = 0
	count = 0 
	
	worstStudent = ""
	worstGPA = 5.0
	
	oldestStudent = ""
	maxAge = 2
	
	gpas = []
	for line in data:
		line = line.split(",") # line is now a list
		age = int(line[3])
		gpa = float(line[-1])
		gpas.append(gpa)
		
		
		if gpa < worstGPA:
			worstGPA  = gpa
			worstStudent = line[0] + line[1]
		if age > maxAge:
			maxAge = age
			oldestStudent = line[0] + line[1]
		
		if age > 40:
			total += gpa
			count += 1
			
	print(total/count)
	sorted(gpas)
	print(gpas[len(gpas//2)] )
"""
(10 points) Suppose you have a file named numbers.csv which contains a bunch of integers, five per
line of text, separated by commas. Write code below that will open the file, read the numbers from it,
and print the sum of all the even numbers in the file. For example, the file might look like this:
353,213,5,12399421,1
-4,3243,2323456,32186,4234
123,1,2,3,4
0,8,6,-3,2
"""

def evenFileSum():
	data = open("numbers.csv", 'r')
	sum =  0
	for line in data:
		line =  line.split(",")
		for item in line:
			item  =  int(item)
			if	item % 2 ==0:
				sum += item
	print(sum)


# unOrUn("untied") -> "tied"
# unOrUn("unable")  -> "able"
# unOrUn("necessary") -> "unnecessary"
def unOrUn(word):
	if word[:2] == "un":
		return word[2:]
	else:
		return "un" + word
	
	
# [1,2,3,4,5] -> 4
# [15,31,21,17,28] -> 16
# [-1,-100,12,2,100] -> 200
def maxMinDiff(numbers):
	biggest = numbers[0]
	smallest = number[0]
	
	for n in numbers:
		if n  > biggest:
			biggest = n
		if n < smallest:
			smallest = n
	return biggest - smallest
	
	
# [1,2,3,4,5] -> [5,2,3,4,1]
# [15,31,21,17,28] -> [28,31,21,17,15]
# [-1,-100,12,2,100] -> [100,-100,12,2,-1]
def swapEnds(numbers):
	first =  numbers[0]
	last = numbers[-1]
	numbers[0] = last
	numbers[-1] = first 
	
	
	temp = numbers[0]
	numbers[0] = numbers[-1]
	numbers[-1] = temp
	
	
# source: http://codingbat.com/prob/p110222
# isEverywhere([1, 2, 1, 3], 1) -> true
# isEverywhere([1, 2, 1, 3], 2) -> false
# isEverywhere([1, 2, 1, 3, 4], 1) -> false
def isEverywhere(nums, val):
	for i in range(len(nums) -1):
		left = nums[i]
		right = nums[i+1]
		if left!=val and right!=val:
			return False
	return True

# http://codingbat.com/prob/p197890
# sumStringDigits("aa1bc2d3") -> 6
# sumStringDigits("aa11b33") -> 8
# sumStringDigits("Chocolate") -> 0
def sumStringDigits(word):
	total = 0
	for char in word:
		if char in '0123456789':
			total += int(char)
	
	return total
	

# sumDigits(1234) -> 10
# sumDigits(1000) -> 1
# sumDigits(-581) -> 14
def sumDigits(num):
	if num < 0:
		num = num * -1
	total = 0
	while num > 0:
		lastDigit = num % 10
		total += lastDigit
		num = num // 10
	

	return total 


#Write a program that simulates the game on the previous page with one player trying to get HHT and the other trying to get THH. 2 Have your program simulate the game 100000 times and print out the percentage of times the two players win.
def headTails():
	rosen = "THH"
	student = "HHT"
	outcomes = ["H","T"]
	
	results = {}
	for i in range(100000):
		flips = ""
		while flips[-3:] != rosen and  flips[-3:] != student:
			flips = flips + random.choice(outcomes)
		
		winner  = flips[-3:]
		if winner not in results:
			results[winner] = 1
		else:
			results[winner] = results[winner]+1
	for key in results:
		print(key,results[key]/100000)
	
headTails()
#Write a method called hasWildcat: Given an input String word, return true if word
#contains the String “cat” in it, but the middle ‘a’ can be any char.
# hasWildcat("kitty") -> false
# hasWildcat("tarmac") ->
# hasWildcat("tomcat") -> true
# hasWildcat("c4tn1P") -> true
def hasWildcat(word): # A-- would not buy again
	for index in range(len(word) -2 ):
		c = word[index]
		if c == 'c'  and word[index+2] =='t':
			return True
	return False



def mostCommonChar(s):
	counts = {}
	for char in s:
		if char not in counts:
			counts[char] =1 
		else:
			counts[char] = counts[char] +1 
			
	mostCommon = ''
	mostCount = -1
	for key in counts:
		if counts[key] > mostCount:
			mostCommon = key
			mostCount = counts[key]
			
	return mostCommon
	
	
