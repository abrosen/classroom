data = open("pokemon.csv",'r')

#  0    1    2      3   4      5        6         7           8      9     10 
# num,num2,Pokémon,HP,Attack,Defense,Sp. Attack,Sp. Defense,Speed,Total,Average

lines =  data.readlines()  # lines is a list of strings

totalHP = 0
count = 0 

maxHP = 0
maxHPPokemon = "-"


minHP = 10000000000000000000
minHPPokemon = "-"


hpVals =[]
names  =[]


for line in lines[1:]:  #each string in the list of strings
    line = line.strip()
    fields = line.split(",")
    name = fields[2]
    hp = int(fields[3])
    #totalHP += hp
    
    if hp > maxHP:
        maxHP = hp
        maxHPPokemon = name 
    if hp < minHP:
        minHP = hp
        minHPPokemon = name

    hpVals.append(hp)
    names.append(name)

    count += 1
#print(totalHP/count)
print(maxHPPokemon, maxHP)
print(minHPPokemon, minHP)

maxHP = max(hpVals)
indexOfMaxHP = hpVals.index(maxHP) 
maxHPPokemon = names[indexOfMaxHP] 

print(maxHPPokemon    , maxHP  )