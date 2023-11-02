import re
import random
def getSupers(filename):
    text =  open(filename,"r")
    pattern =  r"[a-z]+boy|[a-z]+girl|[a-z]+man|[a-z]+woman"
    results = []
    for line in text:
        results += re.findall(pattern, line, re.I)
    return results

"""
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any
remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
"""

def euler5():
    n = 2520
    done =  False
    while not done:
        n += 20
        done = True
        for divisor in range(3,20):
            if n % divisor != 0:
                done = False
    return n
"""
Given a list of numbers, return a new list of all numbers from that list
that are less than the average.
"""
def belowAverage(numbers):

    output = []
    #average = sum(numbers)/len(numbers)
    total = 0
    numItems = 0
    for n in numbers:
        total += n
        numItems += 1
    average = total / numItems



    for n in numbers:
        if n < average:
            output.append(n)
    return output

# an incomplete function to help you get started
def create_shuffled_deck():
    deck = ["2","3","4","5","6","7","8","9","10","J","Q","K","A"]*4
    # finish this up by shuffling the deck
    random.shuffle(deck)
    return deck

def create_piles(deck):
    pile1 =[deck[0]]
    pile2 =[deck[1]]
    pile3 =deck[2:]

    pile2Start = random.randint(1,50)
    pile3Start = random.randint(pile2Start+1,51)
    #pile1 = deck[0:pile2Start]
    #pile2 = deck[pile2Start:pile3Start]
    #pile3 = deck[pile3Start:]
    return pile1,pile2,pile3

def play_game():
    deck = create_shuffled_deck()
    pile1,pile2,pile3 = create_piles(deck)
    royals =  "KQJ"
    if pile1[0] not in royals and pile2[0] not in royals and pile3[0] not in royals:
        return True
    else:
        return False

def simulate():
    TRIALS = 100000
    wins = 0
    for _ in range(TRIALS):
        if play_game():
            wins += 1
    print(wins/TRIALS)

def isPalindrome(text):
    # radar
    # racecar
    # tacocat
    # wolf <-> flow
    # a man, a plan, a canal, panama
    reverse = ""
    forward = ""
    import string
    for letter in text:
        if letter in string.ascii_lowercase: 
            forward = forward + letter
            reverse = letter + reverse 
    return reverse == forward

# wolf  flow
# wolff flow
# abc bca
# aabbcc cabcab
# aaabcc cabbab
def isPermutation(word1,word2):
    count1 = {} # keys are each character in word1
                # value is the counts of each character in word2
    count2 = {} # same, but word2

    if len(word1) != len(word2):
        return False

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
    return count1 == count2



    """
    for letter in word1:
        count1 = 0
        count2 = 0

        for l1 in word1:
            if l1 == letter:
                count1+=1
        for l2 in word2:
            if l2 == letter:
                count2+=1
        if count1 != count2:
            return False
    
    
    return True
    """



  
#sumOfTens: Given a list that contains many lists of integers, return the sum of all the
#integers in the lists that are multiples of 10.
#[[1,2,3,4,5,6,7,8,9,10]] -> 10
#[[10,20], [5], [20,15,1,1,1]] -> 50
#[[10,20,51], [10,20,30]] -> 90
def sumOfTens(numbers):
    total =0
    for listOfNums in numbers:
        for n in listOfNumbers:
            if n % 10 == 0:
                total += n
    return total

def yieldTest():
    for i in range(10):
        yield i





