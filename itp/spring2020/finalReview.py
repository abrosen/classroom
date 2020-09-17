def findEuler5():
    i = 2520
    while True:
        if fufillsRequirements(i):
            return i
        else:
            i = i+10
        

def fufillsRequirements(number):
    for divisor in range(2,21):
        if number % divisor != 0:
            return False

    return True 

def sumDigits(num):
    total = 0
    while num > 0:
        lastDigit = num % 10
        total = total + lastDigit
        num = num // 10
    return total


def palindrome(word):
    reversed = "" 
    for letter in word:
        reversed = letter + reversed
    return reversed == word 
"wolf"
"flow"
"lowf"


"aab"
"aba"
"baa"

"abb"



def isPermutation(word1,word2): 
    count1 = {} # keys are each character in word1  
                #value is the counts of each character in word2 
    count2 = {} # same, but word2

    for letter in word1:
        if letter in count1:
            count1[letter] += 1
        else:
            count1[letter] = 1
    
    for letter in word2:
        if letter in count2:
            count2[letter] += 1
        else:
            count2[letter] = 1
    
    return count1 == count2


def belowAverage(numbers):
    below = []
    average = 0
    for number in numbers:
        average += number
    average /= len(numbers)
    for number in numbers:
        if number < average:
            below.append(number)
    return below

def sumOfTens(numbers):
    total = 0
    for innerList in numbers:
        for n in innerList:
            if n % 10 == 0:
                total += n
    return total 

def fileReadingProb(filename):
    text = open(filename,"r")
    names = []
    for line in text:
        line = line.split(",")
        fname = line[0]
        lname = line[1]
        height = int(line[2])
        weight = int(line[3])
        if height > 60:
            names.append(fname+" "+lname)

    return names

def sumFile(filename):
    data = open(filename, "r")
    total = 0
    for line in data:
        line = line.split(",")
        for num in line:
            total += int(num)
    return total

import random
def createThreeFlips():
    result = []
    sides  = ["H","T"]
    for i in range(3):
        result.append(random.choice(sides))
    return result

def threeCoinMonte():
    TRIALS = 100000
    wins = 0
    for _ in range(TRIALS):
        flips = createThreeFlips()
        if flips[0] == flips[1] and flips[1] == flips[2]:
            wins += 1
    print(wins/TRIALS)

HHH
HHT
HTH
HTT
THH
THT
TTH
TTT


threeCoinMonte()