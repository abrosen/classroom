theFile = open("Pokemon.csv",'r')
rows =  theFile.readlines()

NUM_TO_TRACK = 5
buffest = []
for i in range(NUM_TO_TRACK):
    buffest.append(["",0])


# define buffest as highest combo of attack def and HP
for line in rows[1:]:
    parts = line.split(",")
    name = parts[1]
    hp = int(parts[6])
    attack =  int(parts[7])
    defense = int(parts[8])
    buff = hp + attack + defense
    type1 = parts[3].strip('"')
    type2 = parts[4].strip('"')
    if type1 == "Fire" or type2 == "Fire":
        for index in range(len(buffest)):
            current = buffest[index]
            if buff > current[1]:
                buffest.pop()
                buffest.insert(index,[name,buff])
                break
print(buffest)


##buffest = [["",1],["",2],["",3]]
### define buffest as highest combo of attack def and HP
##for line in rows[1:]:
##    parts = line.split(",")
##    name = parts[1]
##    hp = int(parts[6])
##    attack =  int(parts[7])
##    defense = int(parts[8])
##    buff = hp + attack + defense
##
##    stongest = buffest[0]
##    secStrongest= buffest[1]
##    thirdStrongest= buffest[2]
##
##    if buff > stongest[1]:
##        buffest[0] = [name,buff]
##    elif buff > secStrongest[1]:
##        buffest[1] = [name,buff]
##    elif buff > thirdStrongest[1]:
##        buffest[2] = [name,buff]
##print(buffest)

##numPokemon = 0
##totalHP = 0
##for line in rows[1:]:
##    parts = line.split(",")
##    hp = int(parts[6])
##    totalHP += hp
##    numPokemon += 1
##print(totalHP/numPokemon)


#highestHPName = ""
#highestHP = ("",-20)
#for line in rows[1:]:
#    #print(line)
#    
#    parts = line.split(",")
#    name = parts[1]
#    hp = int(parts[6])
#    if hp > highestHP[1]:
#        highestHP = (name, hp)
#print(highestHP)

