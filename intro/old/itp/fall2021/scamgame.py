import random
TRIALS = 10000

def pickThreeRedFromSeven():
    deck = ["R"]*5 + ["B"]*2
    random.shuffle(deck)
    picks = random.sample(deck,3)
    return "B" not in picks

def threeInARow():
    deck = ["R"]*7+ ["B"]*2
    random.shuffle(deck)
    grid = [ deck[:3], deck[3:6], deck[6:]]
    #print(deck)
    #for row in grid:
    #    print(row)
    draw = [grid[0][0], grid[1][1], grid[2][2]]
    #print("\n" +str(draw))
    return "B" not in draw

def flip():
    sides = ["H", "T"]
    return random.choice(sides)

def fiveAndFive():
    myFlips = []
    for _ in range(10):
        myFlips.append(flip())
    return myFlips.count("H") == 5

def fiveAndFiveStats():
    results = {}
    for _  in range(TRIALS):
        myFlips = []
        for _ in range(10):
            myFlips.append(flip())
        numHeads = myFlips.count("H")
        if numHeads in results:
            results[numHeads] += 1
        else:
            results[numHeads]  = 1
    for k in sorted(results):
        print(k, results[k])


def rolld6():
    return random.randint(1,6)

def rolld4():
    return random.randint(1,4)


def slayGoblin():
    targetAC = 15
    targetHP =  7
    attackRoll = random.randint(1,20) + 5
    damageRoll = rolld6() + rolld6() + 3
    return attackRoll >= targetAC and damageRoll >= targetHP



# 2d6+3
# 7


#fiveAndFiveStats()

wins = 0
for _ in range(TRIALS):
    if slayGoblin() == True:
        wins += 1 
print(wins, TRIALS, wins/TRIALS)
