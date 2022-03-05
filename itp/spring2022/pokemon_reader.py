data = open("pokemon.csv","r")
lines = data.readlines()
biggest_HP = 0
biggest_HP_Mon = ""

beefiest = 0
beefiest_mon = ""
for pokemon in lines[1:]:
    pokemon = pokemon.split(",")
    name = pokemon[2]
    hp = int(pokemon[3])
    attack = int(pokemon[4])
    defense = int(pokemon[5])
    if hp > biggest_HP:
        biggest_HP = hp
        biggest_HP_Mon = name
    
    if attack + defense > beefiest:
        beefiest = attack +defense
        beefiest_mon = name
print(biggest_HP_Mon, biggest_HP)
print(beefiest_mon,beefiest)
print("done")