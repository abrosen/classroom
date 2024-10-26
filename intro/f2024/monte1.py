import random

def flip():
    sides = "HT"
    return random.choice(sides)


def flipGame():
    seq = ""
    numFlips = 10
    for i in range(numFlips):
        seq += flip()
    seq = sorted(seq)
    seq = "".join(seq)
    return seq
outcomes = {}

TRIALS = 10000
for _ in range(TRIALS):
    result = flipGame()
    if result in outcomes:
        outcomes[result] += 1
    else:
        outcomes[result] = 1
    
for seq in sorted(outcomes):
    print(seq, outcomes[seq]/TRIALS)


