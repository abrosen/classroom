import random

def holdAt20(limit=20):
    turnTotal = 0
    while turnTotal < limit:
        roll = random.randint(1,6)
        #print("Roll:", roll)
        if roll == 1:
            turnTotal = 0
            #print("Turn Total:", turnTotal)
            return turnTotal
        else:
            turnTotal += roll
    #print("Turn Total:", turnTotal)
    return turnTotal

def holdAt20Outcomes(trials):
    outcomes = {0:0}
    for val in range(20,26):
        outcomes[val] = 0
    for _ in range(trials):
        score = holdAt20()
        outcomes[score] +=1
    for score in outcomes:
        print(score, outcomes[score]/trials)

def holdAtXOutcomes(trials, limit):
    outcomes = {0:0}
    for val in range(limit,limit+6):
        outcomes[val] = 0
    for _ in range(trials):
        score = holdAt20(limit)
        outcomes[score] +=1
    for score in outcomes:
        print(score, outcomes[score]/trials)


def holdAt20orGoal(limit ,score):
    turnTotal = 0
    while turnTotal < limit and turnTotal + score < 100 :
        roll =  random.randint(1,6)
        #print("Roll:", roll)
        if roll  == 1:
            turnTotal = 0
            return 0, score
        else:
            turnTotal += roll
    return turnTotal, score+turnTotal

def holdAt20orGoalGame():
    score = 0
    turns = 0
    while score < 100:
        turnTotal, newScore = holdAt20orGoal(18,score)
        turns += 1
        #print("Turn Total:", turnTotal)
        #print("Score:", newScore)
        score = newScore
    return turns

def averagePigTurns():
    totalTurns = 0
    TRIALS = 100000
    for _ in range(TRIALS):
        turns = holdAt20orGoalGame()
        totalTurns += turns
    print(totalTurns / TRIALS)

averagePigTurns()
#holdAt20orGoalGame()
#turnScore, newScore = holdAt20orGoal(99)
#print(turnScore, newScore)
#holdAtXOutcomes(100000, 100)
#holdAt20Outcomes(100000)
#x=holdAt20()
#print(x)
