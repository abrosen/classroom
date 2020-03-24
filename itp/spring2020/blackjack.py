import random

CARD_TYPES = [2,3,4,5,6,7,8,9,10,10,10,10,11]


def genDeck():
    deck = CARD_TYPES*4
    random.shuffle(deck)
    return deck


def dealHands(deck):
    player = []
    dealer = []
    
    if len(deck)<=4:
        deck = deck + genDeck()

    for i in range(4):
        if i % 2 == 0:
            player.append(deck[i])
        else:
            dealer.append(deck[i])

    deck = deck[4:]
    

    while handValue(player) < 16 and handValue(player) != 0:
        player.append(deck[0])
        deck = deck[1:]
        if len(deck) == 0:
            deck = genDeck()

    while handValue(dealer) < 17 and handValue(dealer) != 0:
        dealer.append(deck[0])
        deck = deck[1:]
        if len(deck) == 0:
            deck = genDeck()
    

    return player, dealer, deck



def handValue(hand):
    total = sum(hand)
    if total <= 21:
        return total
    while 11 in hand:
        target = hand.index(11)
        hand[target] = 1
        total = sum(hand)
        if total <= 21:
            return total
    
    return 0

TRIALS = 100000
count = {}
wins  =0
deck = genDeck()
for _ in range(TRIALS):
    player, dealer, deck = dealHands(deck)
    score = handValue(player)
    if score in count:
        count[score]  += 1
    else:
        count[score] = 1
    if handValue(player) > handValue(dealer):
        wins+=1

for score in sorted(count.keys()):
    print(score,str(count[score]/TRIALS*100)+"%", sep="\t")

print(wins/TRIALS*100)

