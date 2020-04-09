"""
11/11/19, 64, 40 
11/12/19, 49, 21 
11/13/19, 33, 22 
"""
def tempReader():
    data = open("temperatures.csv","r")

    hottestDay = ''
    hottestTemp = -10000000000  

    coldestDay = ''
    coldestTemp = 10000000000  

    highTempSum = 0
    numLines = 0
    for line in data:
        line = line.split(",")
        day  = line[0]
        high = int(line[1])
        low  = int(line[2])

        if high > hottestTemp:
            hottestTemp = high
            hottestDay = day
        
        if low < coldestTemp:
            coldestTemp = low
            coldestDay = day
        
        highTempSum += high
        numLines += 1

    print(hottestDay)
    print(coldestDay)
    print(highTempSum/numLines)


def numSummer():
    data = open("numbers.csv", "r")
    total = 0
    for line in data:

        line = line.split(",")
        for num in line:
            num = int(num)
            if(num % 2 == 0):
                total += num
    return total

def unOrUn(word):
    if "un" == word[:2]:
        return word[2:]
    else:
        return "un" + word



import random
def genGame():
    seq = ""
    while seq[-3:] != "HHT" and seq[-3:] != "THH":
        seq = seq + random.choice(["H","T"])    
    return seq


def simulateCoinGame():
    TRIALS =  100
    wins = 0
    for game in range(TRIALS):
        seq = genGame()
        if seq[-3:] == "HHT":
            wins+=1
        print(seq)
    print(wins/TRIALS)

def monopoly():
    doubles = 0
    dubdoubles = 0
    tripdoubles = 0
    for _ in range(100000):
        roll1 = random.randint(1,6)
        roll2 = random.randint(1,6)
        if roll1 == roll2:
            doubles += 1
            roll1 = random.randint(1,6)
            roll2 = random.randint(1,6)
            if roll1 == roll2:
                dubdoubles+=1
                roll1 = random.randint(1,6)
                roll2 = random.randint(1,6)
                if roll1 == roll2:
                    tripdoubles += 1
    print((100000-doubles)/100000)
    print(doubles/100000)
    print(dubdoubles/100000)
    print(tripdoubles/100000)

# hasWildcat("kitty") -> false 
# # hasWildcat("tomcat") -> true 
# # hasWildcat("c4tn1P") -> true
# 
# electric

def hasWildcat(word): # A-- would not buy again
    for i in range(len(word)-2):
        char = word[i]
        if char == 'c' and word[i+2] == 't':
            return True
    return False


# source: http://codingbat.com/prob/p110222 
# isEverywhere([1, 2, 1, 3], 1) -> true 
# isEverywhere([1, 2, 1, 3], 2) -> false 
# isEverywhere([1, 2, 1, 3, 4], 1) -> false 
def isEverywhere(nums, val):
    for i in range(len(nums) -1):
        if nums[i] != val and nums[i+1] != val:
            return False
     return True