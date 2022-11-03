import random

def roll():
    return random.randint(1,6)

def autoPig():
    total = 0
    done = False
    while total < 20 and not done:
        result =  roll()
        #print("Roll:", result)
        if result == 1:
            total = 0
            done = True
        else:
            total += result  
    #print("Turn Total:", total)
    return total

def holdAt20(trials):
    outcomes = {}
    for _ in range(trials):
        turnTotal = autoPig()
        if turnTotal in outcomes:
            outcomes[turnTotal] +=1
        else:
            outcomes[turnTotal] = 1
    for turnTotal in sorted(outcomes):
        print(turnTotal,  outcomes[turnTotal]/trials)


holdAt20(10000)