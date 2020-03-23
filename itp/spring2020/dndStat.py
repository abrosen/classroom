import random
# Elite array = [15,14,13,12,10,8]

# return a list of 6 stats
def genStats():
    stats = []
    for _ in range(6):
        stats.append(roll4d6dropLow())
    return stats

def roll4d6dropLow():
    rolls = []
    for _ in range(4):
        rolls.append(random.randint(1,6))
    rolls = sorted(rolls)
    rolls = rolls[1:]
    return sum(rolls)

print(genStats())