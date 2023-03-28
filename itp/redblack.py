import random

def game():
    cards = ["R","R","B","B","B","B","B"]
    random.shuffle(cards)
    selection = random.sample(cards,3)
    if "R" not in selection:
        return True
    else:
        return False

TRIALS = 100000
wins =  0

for _ in range(TRIALS):
    if game():
        wins+=1
print(wins/TRIALS)