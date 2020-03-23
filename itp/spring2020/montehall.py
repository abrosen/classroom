import random
"""
d = {1:0,2:0,3:0,4:0,5:0,6:0}


for _ in range(6000):
    roll = random.randint(1,6)
    d[roll] = d[roll]+1
print(d)
"""

results = {"car": 0, "goat":0}
switch = False
trials = 1000000
for _ in range(trials):
    doors= ["goat","goat","goat"]
    carIndex = random.randint(0,2)
    doors[carIndex] = "car"
    firstChoice = doors[0] 
    if switch:
        if(doors[1] == 'goat'):  # Monte reveals index 1 to be a goat, we take index 2
            secondChoice = doors[2]
            results[secondChoice] = results[secondChoice] + 1
        else: # Monte reveals index 2 to be a goat, we take index 1
            secondChoice = doors[1]
            results[secondChoice] = results[secondChoice] + 1
    else:
        results[firstChoice] = results[firstChoice] + 1

for key in results:
    print(key, results[key],   results[key]/trials, sep="\t")