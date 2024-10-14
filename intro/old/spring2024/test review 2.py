import random


def fileReadingProb(filename):
    theFile = open(filename,"r")
    lines = theFile.readlines()
    highestDay = ""
    highestTemp= -999999
    lowestDay = ""
    lowestTemp = 9999999

    totalTemp = 0
    numTempsRead = 0 
    for line in lines:
        parts = line.split(",")
        date = parts[0]
        high = int(parts[1])
        low = int(parts[2])
        if high > highestTemp:
            highestTemp = high
            highestDay = date
        if low < lowestTemp:
            lowestTemp = low
            lowestDay = date
        totalTemp += high
        numTempsRead += 1
    avgTemp = totalTemp/numTempsRead
    return highestDay,lowestDay,avgTemp

# unOrUn(”untied”) -> ”tied”
# unOrUn(”unable”) -> ”able”
# unOrUn(”necessary”) -> ”unnecessary”
def unOrUn(word):
    if word[:2] == "un":
        return word[2:]
    else:
        return "un"+word

# [1,2,3,4,5] -> 4
# [15,31,21,17,28] -> 16
# [-1,-100,12,2,100] -> 200
def maxMinDiff(numbers):
    biggest = numbers[0]
    smallest = numbers[0]
    for num in numbers:
        if num > biggest:
            biggest = num
        if num < smallest:
            smallest = num
    return biggest-smallest

def maxMinDiff(numbers):
    return max(numbers) - min(numbers)

def swapEnds(numbers):
    temp = numbers[0]
    numbers[0] = numbers[-1]
    numbers[-1] = temp

# [1,2,3,4,5,6] -> [1,2,3]
# [15,31,21,17,28] -> [15,31]
# [”a”,”b”,”c”,”d”,”e”,”f”,”g”,”h”] -> [”a”,”b”,”c”,”d”]
def firstHalf(theList):
    middle = len(theList)//2
    return theList[:middle]
    
# hasWildcat(”kitty”) -> false
# hasWildcat(”tomcat”) -> true
# hasWildcat(”c4tn1P”) -> true
def hasWildcat(word):
    for index in range(len(word)-2):
        letter = word[index]
        twoAfter= word[index+2]
        if letter == "c" and twoAfter == "t":
            return True
    
    return False
    

# http://codingbat.com/prob/p197890
# sumStringDigits(”aa1bc2d3”) -> 6
# sumStringDigits(”aa11b33”) -> 8
# sumStringDigits(”Chocolate”) -> 0
def sumStringDigits(word):
    total = 0
    for char in word:
        if char.isdigit():
            total += int(char)
    return total

def mostCommonLetter(text):
    count = {}
    for letter in text:
        if letter not in count:
            count[letter] = 1
        else:
            count[letter] += 1
    mostLetter = ""
    highestCount = 0
    for letter in count:
        if count[letter] > highestCount:
            highestCount = count[letter]
            mostLetter = letter
    return mostLetter
def flip():
    sides = ["H","T"]
    return random.choice(sides)
    #return random.randint(0,1)

def flipgame(seq1, seq2):
    flips = flip()+flip()+flip()
    while flips[-3:] != seq1 and flips[-3:] != seq2:
        flips += flip()
    if flips[-3:] == seq1:
        return True
    else:
        return False

TRIALS = 100000
wins = 0
for _ in range(TRIALS):
    if flipgame("HHT","THH") == True:
        wins+=1
print(wins/TRIALS)

def cheatFlip():
    result = random.randint(1,100)
    if result <= 55:
        return "H"
    else:
        return "T"

def flip():
    sides = ["H"]*55+["T"]*45
    return random.choice(sides)

def roll():
    return random.randint(1,6)

def monoTurn():
    d1 = roll()
    d2 = roll()
    if d1 == d2:
        d1 = roll()
        d2 = roll()
        if d1 == d2:
            d1 = roll()
            d2 = roll()
            if d1 == d2:
                return 3
            else:
                return 2
        else:
            return 1
    else:
        return 0

def monoTurn2():
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
    d1 = roll()
    d2 = roll()
    if d1 != d2:
        return 3
"""
TRIALS = 100000
results = [0,0,0,0]
for _ in range(TRIALS):
    numDoubles = monoTurn()
    results[numDoubles]+=1
for index in range(len(results)):
    print(index,results[index]/TRIALS)
"""

    
