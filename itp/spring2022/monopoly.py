import random

def rolld6():
    sides = [1,2,3,4,5,6]
    return random.choice(sides)
    
def turn():
    
    
    die1 = rolld6()
    die2 = rolld6()
    if die1 != die2:
        return 0
    elif die1 == die2:
        die1 = rolld6()
        die2 = rolld6()
        if die1 != die2:
            return 1
        else:
            die1 = rolld6()
            die2 = rolld6()
            if die1 != die2:
                return 2
            else:
                return 3

    """
    numDubs = 0
    
    while numDubs < 3:
        die1 = rolld6()
        die2 = rolld6()
        if die1 != die2:
            return numDubs
        else:
            numDubs +=1
    """

trials = 100000
noDubs = 0
oneDubs = 0
twoDubs = 0
threeDubs = 0
for _ in range(trials):
    result = turn()
    if result == 0:
        noDubs += 1 
    elif result == 1:
        oneDubs += 1
    elif result == 2:
        twoDubs += 1
    elif result == 3:
        threeDubs += 1
print(noDubs/trials)
print(oneDubs/trials)
print(twoDubs/trials)
print(threeDubs/trials)
        
