import random

"""
Our first exercise is to simulate a single turn of Pig where a player rolls until a 1 (“pig”) is rolled, or the turn total is greater than or equal to 20. 
We will call this strategy Hold-at-20. The user doesn't need to make any choices, the computer will roll automagically, following the hold-at-20 strategy.

For each roll, print a line with “Roll:” and the random die roll value (1-6).

After a “pig” roll of 1, or a “hold,” print a line with “Turn total:”
followed by the turn total. In the case of a “pig,” this turn total is 0

Roll: 4
Roll: 5
Roll: 6
Roll: 5
Turn total: 20
...
Roll: 3
Roll: 1
Turn total: 0

"""

def rolld6():
    return random.randint(1,6)


def holdAt20Turn():
    turnTotal = 0
    while turnTotal < 20:
        points = rolld6()
        #print("Roll:",points)
        if points == 1:
            turnTotal = 0
            break
        else:
            turnTotal += points
    #print("Turn total:",turnTotal)
    return turnTotal


"""
Simulate a given number of hold-at-20 turns, and report the estimated probabilities of the possible scoring outcomes.

How many Hold-at-20 turn simulations?
1000000
Score Estimated Probability
0 0.624076
20 0.099659
21 0.095310
22 0.074086
23 0.054599
24 0.035313
25 0.016957
"""


def holdAt20Sim(trials):
    results  = {} 
    for _ in range(trials):
        turnTotal = holdAt20Turn()
        if turnTotal in results:
            results[turnTotal] += 1
        else: 
            results[turnTotal]  = 1 
    for score in results:
        results[score] = results[score]/trials
    return results


results =  holdAt20Sim(1000)
print("Score\tEstimated Probability")
for score in sorted(results):
    print(score,results[score],sep="\t")


"""
Hold-at-X Outcomes
As the previous exercise, but allow the user to specify the hold value. What
is the probability of reaching 100 in a single turn if you allow the cpu to
hold at 100?
"""
