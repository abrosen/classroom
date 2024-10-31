def tempRead(filename):
    data =  open(filename, "r")


    hottest = -9999
    hotDay = ""
    coldest = 10000000000
    coldDay = ""
    total = 0
    count = 0
    


    for line in data:
        fields = line.split(",")
        high = int(fields[1])
        low = int(fields[1])
        if high > hottest:
            hottest = high
            hotDay = fields[0]
        if low < coldest:
            coldest = low
            coldDay = fields[0]
        total += high
        count += 1
    average = total/count
"""
fields = line.split(",")
for num in fields:
    num = int(num)
    if num % 2 == 0:
"""






# unOrUn(”untied”) -> ”tied”
# unOrUn(”unable”) -> ”able”
# unOrUn(”necessary”) -> ”unnecessary”
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
    smallest = numbers[0]
    for n in numbers:
        if n > biggest:
            biggest = n
        if n < smallest:
            smallest = n

    return biggest - smallest
    
    #return max(numbers) - min(numbers)


# [1,2,3,4,1] -> [5,2,3,4,1]
# [15,31,21,17,28] -> [28,31,21,17,15]
# [-1,-100,12,2,100] -> [100,-100,12,2,-1]
def swapEnds(numbers):
    temp = numbers[-1]
    numbers[-1] = numbers[0]
    numbers[0] = temp

# [1,2,3,4,5,6] -> [1,2,3]
# [15,31,21,17,28] -> [15,31]
# [”a”,”b”,”c”,”d",”e”,”f”,”g”,”h”] -> [”a”,”b”,”c”,”d”]
def firstHalf(theList):
    midpoint = len(theList)//2
    return theList[0:midpoint]

# hasWildcat(”kitty”) -> false
# hasWildcat(”tomcat”) -> true
# hasWildcat(”c4tn1P”) -> true
# hasWildcat(”taco”) -> false
def hasWildcat(word): # A-- would not buy again
    for index in range(0,len(word)):
        letter = word[index]
        if letter == "c" and word[index+2] == "t":
            return True
    return False

# http://codingbat.com/prob/p197890
# sumStringDigits(”aa1bc2d3”) -> 6
# sumStringDigits(”aa11b33”) -> 8
# sumStringDigits(”Chocolate”) -> 0
def sumStringDigits(word):
    total = 0
    for letter in word:
        if letter in "0123456789":
            total = total + int(letter)


    return total

# sumDigits(1234) -> 10
# sumDigits(1000) -> 1
# sumDigits(-581) -> 14
def sumDigits(num):
    total
    while num > 0:
        digit = num % 10
        total += digit
        num = num // 10
    return total
    #total = 0
    #num = str(num)
    #for digit in num:
    #    digit = int(digit)
    #    total += digit
    #return total


import random
"""
def roll():
    return random.randint(1,6)

def turn():
    d1 = roll()
    d2 = roll()

    if d1 != d2:
        return 0
    else:
        d1 = roll()
        d2 = roll()
        if d1 != d2:
            return 1
        else:
            d1 = roll()
            d2 = roll()
            if d1 != d2:
                return 2
            else:
                return 3
TRIALS =  100000
#dub0 = 0
#dub1 = 0  
#dub2 = 0
#dub3 = 0
results = [0,0,0,0]


for _ in range(TRIALS):
    numDubs = turn()
    results[numDubs] += 1 

for r in results:
    print(str(r/TRIALS * 100) + "%")

"""



def mostCommon(text):
    count = {}
    for letter in text:
        if letter in count:
            count[letter] += 1
        else:
            count[letter] = 1

    mostCommonLetter = ""
    maxCount =0

    for letter in count:
        print(letter, count[letter])
        if count[letter] > maxCount:
            mostCommonLetter = letter
            maxCount = count[letter]

    return mostCommonLetter


def flip():
    return random.choice("HT")

def penney(seq1,seq2):
    seq = ""
    while True:
        seq += flip()
        if seq[-3:] == seq1:
            return 1
        if seq[-3:] == seq2:
            return 2

TRIALS = 100000
wins = 0

for _ in range(TRIALS):
    if penney("HHT","THH") == 1:
        wins+=1
print(wins/TRIALS)









