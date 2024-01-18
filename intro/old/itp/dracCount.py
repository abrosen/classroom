data = open("dracula.txt","r", encoding="utf8")
count = {}
lines = data.readlines()
#print(lines)
for line in lines:
    words = line.split()
    for word in words:
        word = word.lower()
        if word[-1] in ".,?!-":
            word = word[:-1]
        if word not in count:
            count[word] = 1
            #print("new word!")
            #print(count)
            #print("-------------")
        else:
            count[word]+= 1
for word in sorted(count, key=count.get, reverse=True)[:20]:
    print(word, count[word])