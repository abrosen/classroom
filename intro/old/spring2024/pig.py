import random


def roll():
    return random.randint(1,6)


def autoTurn(score = 0, target = 20,debug = False):
    turnTotal = 0
    rolledOne = False
    while turnTotal < target and not rolledOne and score + turnTotal < 100:
        value = roll()
        if debug:
            print("Roll:",value)
        if value == 1:
            turnTotal = 0
            rolledOne = True
        else:
            turnTotal += value
    if debug:
        print("Turn Total:", turnTotal)
        print("New Score:", turnTotal + score )
    return turnTotal
#autoTurn(34, debug = True)
def holdAtXSims(trials, target = 20):
    data = {0:0}
    for r in range(target,target+6):
        data[r] = 0
    for _ in range(trials):
        result = autoTurn(target)
        data[result] += 1
    print("Score", "Estimated Probability",sep="\t")
    for outcome in data:
        print(outcome,data[outcome]/trials,sep="\t")
#holdAtXSims(10000)
#holdAtXSims(10000,100)


def holdAt20orGoalTurn(score):
    target = 20
    turnTotal = 0
    rolledOne = False
    while not rolledOne and turnTotal < target and turnTotal + score < 100:
        value = roll()
        print("Roll:",value)
        if value == 1:
            rolledOne = True
            turnTotal = 0
        else:
            turnTotal += value
    print("Turn Total:",turnTotal)
    print("Score:",score+turnTotal)
    return turnTotal

print(holdAt20orGoalTurn(83))



