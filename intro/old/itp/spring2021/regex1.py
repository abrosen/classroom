import re

file = open("words.txt")

catCount = 0
for line in file:
    line = line.lower()
    if re.search(r"\d",line):
        catCount += 1
print(catCount)
