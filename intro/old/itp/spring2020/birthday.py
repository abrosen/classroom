import random


def genBirthdayList(n):
    birthdays = []  
    for i in range(n):    
        birthday = random.randint(1,365)
        birthdays.append(birthday)
    return birthdays
"""
def hasMatch2(birthdays):
    #print(birthdays)
    sortedList =  sorted(birthdays)
    #print(sortedList)
    for i in range(len(sortedList)-1):
        if sortedList[i]  == sortedList[i+1]:
            return True
    return False

def hasMatch3(birthdays):
    #print(birthdays)
    sortedList =  sorted(birthdays)
    #print(sortedList)
    for i in range(len(sortedList)-2):
        if sortedList[i]  == sortedList[i+1] == sortedList[i+2]:
            return True
    return False
"""
def hasMatch(birthdays, n=2):
    bdayCount = {}
    for b in birthdays:
        if b in bdayCount:
            bdayCount[b] += 1
        else:
            bdayCount[b] = 1
    for bday in bdayCount:
        occurences =  bdayCount[bday]
        if occurences >= n:
            return True
    return False


TRIALS = 10000
matches = 0

for _ in range(TRIALS):
    bdays = genBirthdayList(300)
    if hasMatch(bdays,4):
        matches+=1

print(matches/TRIALS)