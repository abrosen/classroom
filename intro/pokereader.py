data = open("Pokemon.csv")
lines = data.readlines()
lines = lines[1:]
highestHP = 0
highestName =""
for line in lines:
	line = line.strip()
	#print(line)
	parts = line.split(",")
	name = parts[1]
	name = name.strip('"')
	HP = int(parts[6])
	if HP > highestHP:
		highestHP = HP
		highestName = name
print(highestName,highestHP)
	
