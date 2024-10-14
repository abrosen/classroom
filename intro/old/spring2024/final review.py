"""Shorter questions


Bigger Questions
In past it has been choose 5 out of 7 
Regex
File Reading
Nested Lists/Loops Problem
Turtle????
Monte Carlo
Mystery Question
Dictionary
"""


# ’Andrew Rosen’,12 -> ar12
# ’Alan Turing’, 5 -> at5
# ’Andrew Benjamin Rosen’, 3 -> abr3
# ’Andrew Benjamin Rosen’, 104 -> abr104
def makeUsername(name,n):
    username = ""
    initials = ""
    parts =  name.split(" ")
    for part in parts:
        firstLetter = part[0]
        initials += firstLetter
    initials = initials.lower()
    username = initials + str(n)
    return username

#Kamek,57
#Toad,12
#Peach,82
#Mario,97
#Luigi,80
#Bowser,5
#Yoshi,70
#Cappy,92
#Goomba,2
#Donkey Kong,45
# -> Mario,97
def whoWonWhy(filename):
    theFile =  open(filename,'r')
    lines = theFile.readlines()
    highestScore = 0
    winner = ""
    for line in lines:
        name, score = line.split(",")
        score = int(score)
        if score > highestScore:
            highestScore =  score
            winner =  name
    return winner, highestScore


#belowAverage: Given a list of numbers, return a new list of all numbers from that list
#that are less than the average.
# [1,2,3,4,5] -> [1,2]
# [1,10,100] -> [1,10]
# [-1,-2,-3,-4,-5,100] -> [-1,-2,-3,-4,-5]
def belowAverage(numbers):
    total = 0
    for num in numbers:
        total += num
    
    #average = sum(numbers)/len(numbers)
    average  = total/len(numbers)
    output = []
    for num in numbers:
        if num < average:
            output.append(num)
            #output = output + [num]

    return output



"""
a   b   a and b a or b  a xor b
t   t   t           t       f
t   f   f           t       t
f   t   f           t       t
f   f   f           f       f

"""
def XOR(a, b):
    """
    if a == True and b == True:
        return False
    if a == True and b == False:
        return True
    if a == False and b == True:
        return True
    if a == False and b == False:
        return False
    """
    return a != b

#sumOfThrees: Given a list that contains many lists of integers, 
#return the sum of all the
#integers in the lists that are multiples of 3. 
#Half credit is given if the answers works on a list of integers
#[[1,2,3,4,5,6,7,8,9,10]] -> 18
#[[10,20], [5], [20,15,1,1,1]] -> 15
#[[10,21,51], [10,20,30]] -> 51
def sumOfThrees(numbers):
    total = 0
    for list in numbers:
        for num in list:
            if num % 3 == 0:
                total += num
    return total

# [1,2,3,4,5] -> 120
# [10,20,5] -> 0
# [44, 12, 3112] -> 192
def allDigitsProduct(nums):
    product = 1
    #for number in nums:
        #number = str(number)
        #for digit in number:
        #    digit = int(digit)
        #    product  = product * digit
    #return product
    for number in nums:
        while number > 0:
            lastDigit = number % 10
            product *= lastDigit
            number = number // 10
    return product

# [1,2,3,4,5] -> False (doesn’t contain the pattern)
# [74,3,4,2,74,75,2] -> True (3,4,2 satisfies the pattern)
# [74,75,0,1,-1,100] -> True (0,1,-1 satisfies the pattern)
def has231(nums):
    for index in range(len(nums)-2):
        x = nums[index]
        if (nums[index + 1] == x + 1) and (nums[index + 2] == x - 1):
            return True
    return False


def mostCommonLetter(text):
    counts = {}
    for letter in text:
        if letter not in counts:
            counts[letter] = 1
        else:
            counts[letter] += 1
    mostCommon = ""
    highestCount = 0
    for letter in counts:
        c = counts[letter]
        if c > highestCount:
            highestCount = c
            mostCommon = letter
    return mostCommon


"""
abba
aabb


aaab
aabb
"""
def isPermutation(word1,word2):
    if len(word1) != len(word2):
        return False 
    
    count1 = {} # keys are each character in word1
    # value is the counts of each character in word1
    count2 = {} # same, but word2
    for letter in word1:
        if letter not in count1:
            count1[letter] = 1
        else:
            count1[letter] += 1

    for letter in word2:
        if letter not in count2:
            count2[letter] = 1
        else:
            count2[letter] += 1
    
    for letter in count1:
        if count1[letter] != count2[letter]:
            return False
    return True

import re
def regexProblem(filename, outputFilename):
    theFile = open(filename,"r")
    text = theFile.read()

    # "(xxx) xxx-xxxx"
    # "xxx xxx-xxxx" 
    #pattern = "(\(\d{3}\) \d{3}-\d{4})|(\d{3} \d{3}-\d{4})"
    
    # tug85861@temple.edu
    # tuX
    # profandrewrosen@gmail.com andrew.rosen@temple.edu
    pattern = "tu[a-z]\d{5}@temple\.edu" 
    outputText = re.sub(pattern, "REMOVED",  text)
    
    outputFile = open(outputFilename, "w")
    outputFile.write(outputText)
    outputFile.close()

import random

def d20():
    return random.randint(1,20)

def d6():
    return random.randint(1,6)

def attackRoll(target):
    roll = d20()+5
    return roll >= target

def damageRoll():
    return d6()+d6()+3

def fightGoblin():
    goblinAC=15
    goblinHP= 7
    if attackRoll(goblinAC) == True:
        if damageRoll() >= goblinHP:
            return True
    else:
        return False

TRIALS = 100000
wins = 0
for _ in range(TRIALS):
    if fightGoblin() == True:
        wins+=1
print(wins/TRIALS)