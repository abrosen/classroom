data = open("tempData.csv",'r')

sumOfTemps = 0
numOfTemps = 0
for line in data:
	if "Time" in line:
		continue
	line = line.split(",")
	time = int(line[0])
	temp = float(line[1])
	sumOfTemps =  sumOfTemps + temp
	numOfTemps += 1
print(sumOfTemps/numOfTemps)
