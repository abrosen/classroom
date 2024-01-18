text =  open("Pokemon.csv",'r')

best = ""
bestStats = -1

for line in text:
	line = line.strip()
	line = line.split(",")
	if line[0] == "#" or line[-1] == "True":
		continue	
	if line[2] != "Dragon" and line[3] != "Dragon":
		continue
	name =  line[1]
	hp   =  int(line[5])
	atk  =  int(line[6])
	dfn  =  int(line[7])
	spa  =  int(line[8])
	sdf  =  int(line[9])
	spd  =  int(line[10])
	total = hp + atk +dfn+ spa+ sdf+ spd
	avg   = total / 6
	if avg  > bestStats:
		best = name
		bestStats = avg
print(best,bestStats)
