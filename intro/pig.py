import random

def roll():
	return random.randint(1,6)


def holdAt20Turn():
	turnTotal = 0
	pig = False
	while turnTotal < 20 and not pig:
		side = roll()
		#print("Roll:",side)
		if side == 1:
			turnTotal = 0
			pig = True 
		else:
			turnTotal += side
	#print("Turn Total:", turnTotal)
	return turnTotal
	
def holdAtXTurn(target = 20):
	turnTotal = 0
	pig = False
	while turnTotal < target and not pig:
		side = roll()
		#print("Roll:",side)
		if side == 1:
			turnTotal = 0
			pig = True 
		else:
			turnTotal += side
	#print("Turn Total:", turnTotal)
	return turnTotal
	

# part 4
def holdAtXTurn(target = 20, score = 0):
	turnTotal = 0
	pig = False
	while turnTotal < target and not pig and score +turnTotal < 100:
		side = roll()
		#print("Roll:",side)
		if side == 1:
			turnTotal = 0
			pig = True 
		else:
			turnTotal += side
	#print("Turn Total:", turnTotal)
	return turnTotal
	

	

def holdAt20Outcomes(trials):
	results = {}
	results[0] = 0
	# initialize possible scores
	for score in range(20,26):
		results[score] = 0 
	
	# simulate the turn "trials" times
	for _ in range(trials):
		outcome =  holdAt20Turn()
		results[outcome] += 1
	
	# print probabilities
	print("Score","\t","Estimated Prob.")

	for score in results:
		print(score,"\t",results[score]/trials)

def holdAtXOutcomes(trials, target = 20 ):
	results = {}
	results[0] = 0
	# initialize possible scores
	for score in range(target,target+6):
		results[score] = 0 
	
	# simulate the turn "trials" times
	for _ in range(trials):
		outcome =  holdAtXTurn(target)
		results[outcome] += 1
	
	# print probabilities
	print("Score","\t","Estimated Prob.")

	for score in results:
		print(score,"\t",results[score]/trials)
	
trials = 100000
#trials = int(input("How many Hold-at-20 turn simulations?\n"))
holdAtXOutcomes(trials,100)
