import random

def setup():
	deck = ['R'] *2 + ['B'] * 5
	random.shuffle(deck)
	return deck

def game():
	deck = setup()
	selection = random.sample(deck,3)
	#print(selection)
	return not 'R' in selection
	
TRIALS = 100000
wins = 0
for _ in range(TRIALS):
	if game() == True:
		wins += 1
print(wins/TRIALS, 2/7)
