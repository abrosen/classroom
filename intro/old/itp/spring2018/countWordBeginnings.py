counts = {}
data =  open("words.txt", 'r')

for line in data:
    line = line.strip()
    line = line.lower()
    letter = line[0:2]
    if letter in counts:
        counts[letter] = counts[letter] + 1
    else:
        counts[letter] = 1
mostCommonLetter = ""
highestCount = 0
for letter in counts:
    if counts[letter] > highestCount:
        highestCount = counts[letter]
        mostCommonLetter = letter
print(mostCommonLetter,highestCount)
        
        
        
        
        
        
        
