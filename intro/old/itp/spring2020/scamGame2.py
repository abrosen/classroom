"""
Coin Flipping (Bernoulli style): The odds of flipping a coin (fairly) and getting heads or tails is 1:1 or
50%. The even money bet is that you will get 5 heads and 5 tails in 10 flips. What are the real odds?


2pts to generate a coin flip
8pts to generate a sequence of 10 coin flips
5pts to simulate 100000 games of 10 coin flips
5pts to print out the odds 
"""

import random

def coinFlip():
    if random.randint(1,2) == 1:
        return "H"
    else:
        return "T"

def generate10flips():
    results = []
    for _ in range(10):
        flip = coinFlip()
        results.append(flip)
    return results

def isWinner(flips):
    heads = 0
    for coin in flips:
        if coin == "H":
            heads+=1
    return heads == 5
    """
    flips = sorted(flips)
    return flips[:5] == ["H","H","H","H","H"]
    """

TRIALS = 100000
table = {}
for _ in range(TRIALS):
    game = generate10flips()
    result = str(sorted(game))
    if result in table:
        table[result] += 1
    else:
        table[result] = 1


for result in sorted(table.keys()):
    print(result, table[result]/TRIALS)
    