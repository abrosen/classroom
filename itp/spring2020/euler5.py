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


print(findEuler5())