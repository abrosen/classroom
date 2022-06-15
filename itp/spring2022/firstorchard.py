import random

def roll():
    sides =["red","blue","green","yellow","raven","basket"]
    return random.choice(sides)


def game():
    fruits = ['red','blue','green','yellow'] *4 
    ravenLeft = 5
    done = False
    while not done:
        result = roll()
        if result in fruits:
            fruits.remove(result)
        elif result == "basket":
            counts = [fruits.count('red'),fruits.count('blue'),fruits.count('green'),fruits.count('yellow')]
            mostLeft = max(counts)
            if counts.index(mostLeft) == 0:
                fruits.remove("red")
            if counts.index(mostLeft) == 1:
                fruits.remove("blue")
            if counts.index(mostLeft) == 2:
                fruits.remove("green")
            if counts.index(mostLeft) == 3:
                fruits.remove("yellow")
        elif result == "raven":
            ravenLeft -= 1
        if len(fruits) == 0 or ravenLeft == 0:
            done = True
    return len(fruits) == 0

trials = 100000
wins = 0
for _  in range(trials):
    result = game()
    if result == True:
        wins += 1


print(wins/trials, (trials - wins)/ trials)
         
        
