text = open("dracula.txt", 'r')
allTheLinesInAList = text.readlines()


text = open("shakespeare.txt", 'r')
megaString =  text.read()


text = open("grades.txt",'r')
total = 0
lines = 0
for line in text:
    grade = int(line)
    total = total + grade
    lines += 1

print(total/lines)