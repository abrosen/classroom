import random 
"""
def dealHand():
    deck = (list(range(1,11)) + [10,10,10]) * 4
    random.shuffle(deck)
    return deck[0:2]

TRIALS  = 100000
wins = 0
for _ in range(TRIALS):
    hand =  dealHand()
    if 1 in hand and 10 in hand:
        wins += 1
print(wins/TRIALS)
"""



def roll():
    die1 = ["eye","eye","eye","paw","paw","paw"]
    die2 = ["eye","eye","eye","paw","paw","paw"]
    die3 = ["eye","eye","eye","paw","paw","paw"]
    r1 = random.choice(die1)
    r2 = random.choice(die2)
    r3 = random.choice(die3)
    results = [r1,r2,r3]
    if "paw" not in results:
        return True
    if r1 == "paw":
        r1 = random.choice(die1)
    if r2 == "paw":
        r2 = random.choice(die2)
    if r3 == "paw":
        r3 = random.choice(die3)
    results = [r1,r2,r3]
    if "paw" not in results:
        return True
    if r1 == "paw":
        r1 = random.choice(die1)
    if r2 == "paw":
        r2 = random.choice(die2)
    if r3 == "paw":
        r3 = random.choice(die3)
    results = [r1,r2,r3]
    if "paw" not in results:
        return True
    return False

TRIALS = 100000 
wins = 0
for _ in range(TRIALS):
    if roll():
        wins += 1

print(wins/TRIALS)