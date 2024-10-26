import random

def genCards():
    cards = ['B']*5 + ['R']*2
    """cards = []
    for i in range(2):
        cards.append('R')
    for i in range(5):
        cards.append('B')"""
    random.shuffle(cards)
    return cards

def game():
    cards = genCards()
    draw = random.sample(cards)
    #print(draw)
    return 'R' not in draw
    #


def goatGame(switch):
    doors = ["Goat1","Goat2","Car"]
    random.shuffle(doors)
    
    if doors[0] == "Goat1":
        #print("Door", doors.find("Goat2"), "has goat")
        return switch
    if doors[0] == "Goat2":
        #print("Door", doors.find("Goat1"), "has goat")
        return switch
    if doors[0] == "Car":
        #print("Door", doors.find("Goat2"), "has goat")
        return not switch
wins = 0
TRIALS = 10000
for _ in range(TRIALS):
    if goatGame(False) == True:
        wins += 1

print(wins/TRIALS*100)
    





