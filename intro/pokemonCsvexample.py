data = open("Pokemon.csv","r")
data = data.readlines()
data = data[1:]
hpList= []
for _ in range(5):
	blank = ("", 0)
	hpList.append(blank) 
	
for line in data:
	parts = line.split(",")
	name= parts[1]
	HP =  int(parts[6])
	ATK = int(parts[7])
	DEF = int(parts[8])
	buffness = HP + ATK + DEF
	
	for index, mon in enumerate(hpList):
		otherbuff = mon[1]
		if buffness >= otherbuff:
			thisMon =  (name,buffness)
			hpList.insert(index,thisMon)
			hpList = hpList[:5]
			break
			

	#print(name,HP)
print(hpList)
"""
l = ["a","b","c",'d']
for index, letter in enumerate(l):
	print(index, letter)

"""
