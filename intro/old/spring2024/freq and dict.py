theFile = open("dracula.txt", "r", encoding= "utf8")

# associative array,
# map or hash map,
# dictionary

counts = {}

for line in theFile:
    line = line.lower()
    words = line.split()
    for word in words:
        if word not in counts:
            counts[word] = 1
        else: # I definitely have seen it
            counts[word] += 1
for word in sorted(counts, key=counts.get, reverse=True)[:10]:
    print(word, counts[word])


"""
seenWords = []

for line in theFile:
    line = line.lower()
    words = line.split()
    for word in words:
        if word not in seenWords:
            seenWords.append(word)
theFile = open("dracula.txt", "r", encoding= "utf8")

counts =  [0] * len(seenWords)

for line in theFile:
    line = line.lower()
    words = line.split()
    for word in words:
        index = seenWords.index(word)
        counts[index]+=1
for w,c in zip(seenWords,counts):
    print(w,c)
"""
"""
# assume index 0 is a, index 1 is b, index 2 is c...
counts = [0]*26
validLetters =[]

for i in range(0,26):
    validLetters.append(chr(ord('a') + i))

for line in theFile:
    line = line.lower()
    for letter in line:
        if letter in validLetters:
            index = ord(letter) - ord('a')
            #print(letter,index)
            try:
                counts[index]+=1
            except:
                print(letter)

for i in range(0,26):
    print(validLetters[i] ,counts[i])
"""
