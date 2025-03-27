import random

def setup():
	deck = ['R'] *2 + ['B'] * 7
	random.shuffle(deck)
	grid = [  deck[:3], deck[3:6], deck[6:]]

	
	return grid

def game():
	grid = setup()
	selection = grid[0]
	return not 'R' in selection
	
TRIALS = 100000
wins = 0
for _ in range(TRIALS):
	if game() == True:
		wins += 1
print(wins/TRIALS)

