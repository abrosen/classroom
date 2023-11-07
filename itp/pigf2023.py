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


# 20 21 22 23 24 25
# 42 43 44 45 46 47


def holdAtXOutcomes(limit,trials):
    outcomes = {0:0}
    for score in range(limit, limit+6):
        outcomes[score] = 0
    for _ in range(trials):
        score = holdAt20(limit) 
        outcomes[score] += 1
    for score in outcomes:
        print(score, outcomes[score]/trials)

#holdAtXOutcomes(100,100000)


def holdAt20OrGoal(limit=20, score=0):
    turnTotal = 0
    while turnTotal < limit and turnTotal + score < 100:
        roll =  random.randrange(1,6)
        print("Roll:", roll)
        if roll == 1:
            turnTotal = 0
            break
        else:
            turnTotal += roll

    newScore =  score + turnTotal
    print("New Score:", newScore)
    return newScore

holdAt20OrGoal(20,70)