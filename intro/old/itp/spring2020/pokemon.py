data =  open("pokemon.csv", "r")


totalLines = 0
totalAttack = 0
for line in data:
    line = line.split(',')
    attack =  int(line[6])
    totalAttack += attack
    totalLines += 1

print(totalAttack,totalLines)
print(totalAttack/totalLines)