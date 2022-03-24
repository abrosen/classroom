import random

def game1():
    deck = ["R","R","B","B","B","B","B"]
    random.shuffle(deck)
    #draws = deck[0:3] # method 1
    """
    indexes = []  # method 2
    while len(indexes) < 3:
        choice = random.randint(0,6)
        if choice not in indexes:
            indexes.append(choice)
    #print(indexes)
    draws = []
    for i in indexes:
        draws.append(deck[i])
    """
    
    draws =  random.sample(deck,3)# method 3
    
    
    if "R" in draws: 
        #print("lose",draws,deck)
        return False
    else:
        #print("win",draws,deck)
        return True

def game2():
    deck = ["R"] * 2  + ["B"] * 7
    random.shuffle(deck)
    row0 = deck[0:3]
    row1 = deck[3:6]
    row2 = deck[6:9]
    grid = [row0,row1,row2]
    choice = random.randint(0,7)
    draws = []
    if choice == 0:
        draws = [grid[0][0],grid[0][1],grid[0][2]]
    if choice == 1:
        draws = [grid[1][0],grid[1][1],grid[1][2]]
    if choice == 2:
        draws = [grid[2][0],grid[2][1],grid[2][2]]
    if choice == 3:
        draws = [grid[0][0],grid[1][0],grid[2][0]]
    if choice == 4:
        draws = [grid[0][1],grid[1][1],grid[2][1]]
    if choice == 5:
        draws = [grid[0][2],grid[1][2],grid[2][2]] 

    if choice == 6:
        draws = [grid[0][0],grid[1][1],grid[2][2]] 
    if choice == 7:
        draws = [grid[2][0],grid[1][1],grid[0][2]]    
    """
    if choice <=2:
        draws = [grid[choice][0],grid[choice][1],grid[choice][2]]
    if 3 <= choice <=5:
        draws = [grid[0][choice],grid[1][choice],grid[2][choice]]
    """
    
    if "R" in draws: 
        #print("lose",draws,deck)
        return False
    else:
        #print("win",draws,deck)
        return True


trials = 1000000
wins = 0
for _ in range(trials):
    result = game2()
    if result == True:
        wins+= 1


print(wins,wins/trials)
