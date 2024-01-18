theFile = open("hamlet.txt", "r", encoding="utf8")


#letterCounts = {}
wordCounts = {}
alpha = "abcdefghijklmnopqrstuvwxyz"
# use index 0 for a, use index 1 for b... 
for line in theFile:
    line = line.lower()
    words = line.split()
    for word in words:
        # TODO sanitize word eg remove punctuation
        word = word.strip(",._]?!")
        if word not in wordCounts:
            wordCounts[word] = 1
        else:
            prevCount =  wordCounts[word]
            wordCounts[word] = prevCount +  1

#for word in wordCounts:
#    print(word, wordCounts[word])



for word in sorted(wordCounts, key=wordCounts.get, reverse=True)[:10]:
    print(word, wordCounts[word])

"""for line in theFile:
    for letter in line:
        letter = letter.lower()
        if letter in alpha:
            if letter not in letterCounts:
                letterCounts[letter] = 1
            else:
                letterCounts[letter] += 1

print(letterCounts)

"""
