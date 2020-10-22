import random

def monteHall(switch):
    doors = ["goat", "spotted lantern fly","spotted lantern fly"]
    random.shuffle(doors)
    choice = doors[0]
    if choice == "goat":  # goat at index 0
        if switch:
            return False
        else:
            return True
    elif choice == "spotted lantern fly" and doors[1] == "goat":
        if switch:
            return True
        else:
            return False
    else:
        # reveal doors[1]
        if switch:
            return True
        else:
            return False


TRIALS = 10000000
wins = 0 
for _ in range(TRIALS):
    result = monteHall(True)
    if result:
        wins += 1

print(wins/TRIALS * 100, "%")