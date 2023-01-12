import random

def roll():
    return random.randint(1,6)

def autoPig(holdValue = 20): # part 1 and 3
    total = 0
    done = False
    while total < holdValue and not done:
        result =  roll()
        #print("Roll:", result)
        if result == 1:
            total = 0
            done = True
        else:
            total += result  
    #print("Turn Total:", total)
    return total

def holdAtX(trials, holdValue):  # part 2 and 3
    outcomes = {}
    for _ in range(trials):
        turnTotal = autoPig(holdValue)
        if turnTotal in outcomes:
            outcomes[turnTotal] +=1
        else:
            outcomes[turnTotal] = 1
    for turnTotal in sorted(outcomes):
        print(turnTotal,  outcomes[turnTotal]/trials)


def holdAtTargetOrGoal(score, holdValue = 20): # part 4
    total = 0
    done = False
    while total < holdValue and not done and total + score <100:
        result =  roll()
        #print("Roll:", result)
        if result == 1:
            total = 0
            done = True
        else:
            total += result  
    #print("Turn Total:", total)
    return total

holdAtX(100000,100)