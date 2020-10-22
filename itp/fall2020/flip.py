import random
def flip():
    sides = ["H","T"]
    return random.choice(sides)


def game(player1, player2):
    flips = ""
    while True:
        flips+=flip()
        if flips[-3:] == player1:
            return flips,"1" 
        if flips[-3:] == player2:
            return flips,"2"



def fiveAndTwo():
    deck = ["R"] * 5 + ["B"] * 2
    random.shuffle(deck)
    deck =  "".join(deck)
    return deck[:3] == "RRR"





def nineCardHustle():
    deck = ["R"] * 7 + ["B"] * 2
    random.shuffle(deck)
    grid = [deck[0:3],deck[3:6],deck[6:]]
    target =  ["R","R","R"]
    if grid[0] == target:
        return True
    return False

def tenFlips():
    seq = ""
    for _ in range(10):
        seq+= flip()
    if seq.count("H") == 5:
        return True
    else:
        return False

#print(fiveAndTwo())
#print(tenFlips())

wins = 0
TRIALS = 100000

for _ in range(TRIALS):
    if tenFlips() == True:
        wins += 1

print(wins/TRIALS, 1 - (wins/TRIALS))

"""
HHH
HHT
HTH
HTT
TTT
TTH
THT
THH



HTHTHTHTHH
"""

