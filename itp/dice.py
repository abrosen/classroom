import random


def rollDice(numDice=1,sides=6):
	total = 0 
	for _ in range(numDice):
		total = total + random.randint(1,sides)
	return total

def roll4d6DropLowest():
	rolls = []
	for _ in range(4):
		rolls.append(random.randint(1,6))
	return sum(rolls) - min(rolls)

def main():
	stats = {}
	for _ in range(10000):
		roll =  roll4d6DropLowest()
		if roll not in stats:
			stats[roll] = 1
		else:
			stats[roll] = stats[roll] + 1
			
	percentages = {}
	for roll in stats.keys():
		percentages[roll] = stats[roll]/10000
	for per in sorted(percentages.keys()):
		print(per,percentages[per],sep="\t")

main()
