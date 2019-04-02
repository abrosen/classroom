counts = {}
data  = open("gadsby.txt", 'r')

for line in data:
    line = line.strip().lower()
    for letter in line:
        if letter not in counts:
            counts[letter] = 1
        else:
            counts[letter] = counts[letter]+1

del counts[' ']

mostCommonLetter = ""
highestCount = 0
for letter in counts:
    if counts[letter] > highestCount:
        highestCount = counts[letter]
        mostCommonLetter = letter
print(mostCommonLetter,highestCount)
