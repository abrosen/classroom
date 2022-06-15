def uniqueWords(filename):
    text = open(filename,"r")
    lines = text.readlines()    
    s = set()
    for line in lines:
        words = line.split()
        for word in words:
             s.add(word)
    return len(s)

print(uniqueWords("input2.txt"))
