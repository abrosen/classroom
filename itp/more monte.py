##
##  + + _ _ - - 
## [-4,4]
import random

def roll1df():
    faces = ["+","+","_","_","-","-"]
    result =  random.choice(faces)
    return result

def sim4df():
    total = 0
    for _ in range(4):
        result = roll1df() 
        if result == "+":
            total += 1
        elif result == "-":
            total -= 1
    return total


"""

TRIALS = 100000
threeOrBetter = 0
zeroOrBetter = 0
for _ in range(TRIALS):
    roll = sim4df()
    if roll >= 3:
        threeOrBetter+=1
    if roll >= 0:
        zeroOrBetter+=1
print(threeOrBetter/TRIALS)
print(zeroOrBetter/TRIALS)
"""



def flip():
    sides =  ["H","T"]
    return random.choice(sides)

def playPenney(seq1,seq2):
    coinFlips = ""
    while True:
        coinFlips += flip()
        if coinFlips[-3:] == seq1:
            return 1
        elif coinFlips[-3:] == seq2:
            return 2
print()

TRIALS = 100000
player1Wins = 0
for _ in range(TRIALS):
    if playPenney("HHH","THH") == 1:
        player1Wins += 1
print(player1Wins/TRIALS)