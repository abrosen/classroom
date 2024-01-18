import random

def weightFlip():
    if random.random() < 0.55:
        return "H"
    else:
        return "T"

def readTemps(filename):
    data = open(filename,'r')
    #lines = data.readlines()
    highestTemp = -999999
    lowestTemp = 9999999
    highestDay = ""
    lowestDay = ""
    totalHigh = 0
    numDates = 0
    for line in data:
        fields = line.split(",")
        date = fields[0]
        high = int(fields[1])
        low = int(fields[2])
        if high > highestTemp:
            highestTemp = high
            highestDay = date
        if low < lowestTemp:
            lowestTemp = low
            lowestDay = date
        totalHigh += high
        numDates += 1
    return highestDay,lowestDay,totalHigh/numDates

def sumEvenNumsFromFile(filename):
    data = open(filename,"r")
    lines =  data.readlines()
    total = 0
    for line in lines:
        numbers = line.split(",")
        for num in numbers:
            num = int(num)
            if num % 2 == 0:
                total += num
    return total



# unOrUn("untied") -> ”tied”
# unOrUn(”unable”) -> ”able”
# unOrUn(”necessary”) -> ”unnecessary”
def unOrUn(word):
    if word[0:2] == "un":
        return word[2:]
    else:
        return "un" + word

#print(unOrUn("untied"))    

# [1,2,3,4,5] -> 4
# [15,31,21,17,28] -> 16
# [-1,-100,12,2,100] -> 200
def maxMinDiff(numbers):
    return max(numbers)-min(numbers)

# [1,2,3,4,5,6] -> [1,2,3]
# [15,31,21,17,28] -> [15,31]
# [”a”,”b”,”c”,”d”,”e”,”f”,”g”,”h”] -> [”a”,”b”,”c”,”d”]
def firstHalf(theList):
    size = len(theList)
    middleIndex = size // 2
    return theList[:middleIndex]


# hasWildcat(”kitty”) -> false
# hasWildcat(”tomcat”) -> true
# hasWildcat(”c4tn1P”) -> true
def hasWildcat(word): # A-- would not buy again
    for index in range(len(word) -2 ):
        letter = word[index]
        if letter == 'c' and word[index+2] == 't':
            return True
    return False
print(hasWildcat("taco"))

# http://codingbat.com/prob/p197890
# sumStringDigits(”aa1bc2d3”) -> 6
# sumStringDigits(”aa11b33”) -> 8
# sumStringDigits(”Chocolate”) -> 0
def sumStringDigits(word):
    total = 0
    for letter in word:
        if letter.isdigit() == True:
            num = int(letter)
            total += num
    return total
print(sumStringDigits("aa1bc2d3"))


# sumDigits(1234) -> 10
# sumDigits(1000) -> 1
# sumDigits(-581) -> 14
def sumDigits(num):
    if num < 0:
        num = num * -1
    total = 0
    while num > 0:
        lastDigit =  num % 10
        total += lastDigit
        num = num // 10
    return total

def roll():
    #faces = [1,2,3,4,5,6]
    return random.randint(1,6)


def monoTurn():
    die1 = roll()
    die2 = roll()
    if die1 == die2:
        die1 = roll()
        die2 = roll()
        if die1 == die2:
            die1 = roll()
            die2 = roll()
            if die1 == die2:
                return 3
            return 2
        return 1
    return 0

TRIALS = 100000
results = {}#{0:0,1:0,2:0,3:0}
results[0] = 0
results[1] = 0
results[2] = 0
results[3] = 0
for _ in range(TRIALS):
    numDoubles =  monoTurn()
    results[numDoubles] += 1
for numDoubles in results:
    print(numDoubles, results[numDoubles]/TRIALS)


# [1,2,3,4,5] -> [5,2,3,4,1]
# [15,31,21,17,28] -> [28,31,21,17,15]
# [-1,-100,12,2,100] -> [100,-100,12,2,-1]
def swapEnds(numbers):
    temp  = numbers[0]
    numbers[0] = numbers[-1]
    numbers[-1] = temp


def mostCommonLetter(text):
    d = {}
    for letter in text:
        if letter not in d:
            d[letter] = 1
        else:
            d[letter] = d[letter] +1    

    answer = ""
    highestCount = 0
    for letter in d:
        if d[letter]  > highestCount:
            highestCount = d[letter]
            answer= letter
    return answer