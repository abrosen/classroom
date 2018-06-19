text = open("complete.txt",'r',encoding="utf8")
print(text)
listOfLines = list(text)
count = 0
wordCount = {}
for line in listOfLines:
    line = line.lower()
    words = line.split()
    for word in words:
        word = word.strip(",")
        word = word.strip(".")
        if word in wordCount:
            seen = wordCount[word]
            wordCount[word] = seen +1
        else:
            wordCount[word] = 1




done = list(sorted(wordCount,key=wordCount.get))
print(done[-10::])
print(done[-20:-10:])