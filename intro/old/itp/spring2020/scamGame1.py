"""
Nine Card Hustle: add 2 more red cards (7 red, 2 Black), shuffle and place in a 3 x 3 array. The even
money bet is that you can find three cards in a straight line that are red. (up, down and diagonals count).
What are the real odds?

RRR
BRR
RBR
"""
import random


def createDeck():
    cards = "RRRRRRRBB"
    cards = list(cards)
    random.shuffle(cards)
    row1 =  cards[:3]
    row2 =  cards[3:6]
    row3 =  cards[6:]
    
    


    return [row1,row2,row3]

def printGrid(deck):
    for row in deck:
        print(row)


deck = createDeck()

TRIALS  = 100000
count = 0
for _ in range(TRIALS):
    deck = createDeck()
    choice = [deck[0][0], deck[1][1], deck[2][2]]
    if "B" not in choice:
        count+=1

print(count/TRIALS)