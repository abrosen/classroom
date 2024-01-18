import random
# Elite array = [15,14,13,12,10,8]
# 18 -> +4
# 17 -> +3
# 16 -> +3
# 15 -> +2
# 14 -> +2
# 13 -> +1
# 12 -> +1
# 11 -> +0
# 10 -> +0
# 09 -> -1
# 08 -> -1




ELITE_ARRAY = [15,14,13,12,10,8]
target = sum(ELITE_ARRAY)



# return a list of 6 stats
def genStats():
    stats = []
    for _ in range(6):
        stats.append(roll4d6dropLow())
    return stats

def convertStatToMod(stat):
    return stat//2 - 5 


def roll4d6dropLow():
    rolls = []
    for _ in range(4):
        rolls.append(random.randint(1,6))
    rolls = sorted(rolls)
    rolls = rolls[1:]
    return sum(rolls)



def compareRollToElite(trials = 10000):
    count = 0
    for _ in range(trials):
        stats = genStats()
        total = sum(stats)
        if total > target:
            count += 1
    return count/trials

def compareRollToEliteMod(trials = 10000):
    targetMod = 0
    count =0
    for stat in ELITE_ARRAY:
        targetMod += convertStatToMod(stat)
    for _ in range(trials):
        stats = genStats()
        statMod = 0
        for stat in stats:
            statMod += convertStatToMod(stat)
        if statMod >targetMod:
            count+=1
    return count/trials

def printDistribution(trials = 10000):
    results = {}
    for _ in range(trials):
        roll = roll4d6dropLow()
        if roll in results:
            results[roll] += 1
        else:
            results[roll] = 1
    for roll in sorted(results.keys()):
        print(roll, results[roll]/trials,sep="\t")

print(compareRollToEliteMod())