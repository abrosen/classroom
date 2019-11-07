import random

def value(hand): # assume hand is a list of numbers
	if 11 in hand and sum(hand) > 21:
		total =  sum(hand)
		for _ in range(hand.count(11)):
			total = total - 10
			if total < 21:
				return total
	if sum(hand) > 21:
		return 0
	else:
		return sum(hand)
		
def simulateNPlayers(players, games):
	results = {}
	for _ in range(games):
		hands = []
		for _ in range(players):
			hands.append([])
		deck = createDeck()
		random.shuffle(deck)
		for _ in range(2): 
			for player in hands:
				card = deck.pop()
				player.append(card)
		
		for index, player in enumerate(hands):
			while value(player) < (17 + index) and value(player) != 0:
				player.append(deck.pop())
		
		
		for winner in findWinner(hands):
			winner = winner + 17
			if winner not in results:
				results[winner] = 1
			else:
				results[winner] = results[winner] + 1
			
	return results
		
def findWinner(hands):
	scores =  list(map(value,hands))
	winningScore = 1
	winner = [-1]
	for index, score in enumerate(scores):
		if score == winningScore:
			winner.append(index)
		elif score > winningScore:
			winner = [index]
			winningScore = score
	return winner
	
def simulate2PlayerOpeningHands(trials):
	results = {}
	for _  in range(trials): 
		deck = createDeck()
		random.shuffle(deck)
		playerHand = []
		dealerHand = []
		for _ in range(2):
			playerHand.append(deck.pop())
			dealerHand.append(deck.pop())
		playerScore = value(playerHand)
		dealerScore = value(dealerHand)
		if playerScore not in results:
			results[playerScore] = 1
		else:
			results[playerScore] = results[playerScore] + 1
		
		if dealerScore not in results:
			results[dealerScore] = 1
		else:
			results[dealerScore] = results[dealerScore] + 1
			
	for score in results:
		results[score] = results[score]/trials 
	return results
		 	
		 	
def simulate2PlayerBothHold(trials):
	wins = 0
	for _  in range(trials): 
		deck = createDeck()
		random.shuffle(deck)
		playerHand = []
		dealerHand = []
		for _ in range(2):
			playerHand.append(deck.pop())
			dealerHand.append(deck.pop())
		playerScore = value(playerHand)
		dealerScore = value(dealerHand)
		if playerScore > dealerScore:
			wins = wins + 1
		
		
	return wins/trials


def createDeck():
	deck = []
	for value in range(2,11):
		deck = deck + [value]*4
	deck = deck+[10]*12 + [11]*4
	
	return deck


def printDictionaryInOrder(dictionary):
	for key in sorted(dictionary.keys()):
		print(key, dictionary[key])


"""
results = simulate2PlayerOpeningHands(100000)
printDictionaryInOrder(results)
print(simulate2PlayerBothHold(100000))
"""
results = simulateNPlayers(4,10000)
printDictionaryInOrder(results)
