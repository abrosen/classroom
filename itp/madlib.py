import re
import os 
import random 
madLibFiles = os.listdir("madlibs")
chosenGame = random.choice(madLibFiles)
path = os.path.join("madlibs",chosenGame)

libFile = open(path,'r')
outFile = open("out.txt", 'w') 
madRegex = re.compile(r"(NOUN|ADJECTIVE|VERB \(PAST TENSE\)|VERB|ADVERB|PLURAL NOUN)")
output = ""

for line in libFile:
    line = line.strip()
    match = madRegex.search(line)
    while match:
        print("Please enter a " + match.group())
        word = input()
        line = madRegex.sub(word,line,1)
        match = madRegex.search(line)
    output = output + line + "\n"
    outFile.write(line+"\n")

print(output)
outFile.close()
