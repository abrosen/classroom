def getVoters(filename):
    voters = {}
    text = open(filename, 'r')
    for line in text:
        line = line.strip()
        line = line.split(',')
        #print(line[0],line[1])
        voters[line[0]] = int(line[1])

    return voters

def getDistricts(filename):
    districtDict = {} 
    text = open(filename,'r')
    for line in text:
        line = line.strip()
        line = line.strip(',')
        line = line.split(",")
        state = line[0]
        #print(line)
        line = line[1:]
        districts = []
        
        while line != []:
            district = line[0]
            dem = int(line[1])
            gop = int(line[2])
            info = (district, dem, gop)
            #print(state,info)
            districts.append(info)
            line = line[3:]
        districtDict[state]  = districts
    return districtDict

def detectGerry(state, voters, districtDict):
    numVoters = voters[state]
    districts = districtDict[state]
    demTotalWasted = 0
    gopTotalWasted = 0
    for district in districts:
        name = district[0]
        dem  = district[1]
        gop  = district[2]
        #print(name,dem,gop)
        demWasted = 0
        gopWasted = 0
        if dem > gop:
            demWasted = dem- ((dem +gop)//2 +1)
            gopWasted = gop
        else:
            demWasted = dem
            gopWasted = gop - ((dem +gop)//2 +1) 
        print(state,name,dem,gop,demWasted,gopWasted)
        demTotalWasted += demWasted
        gopTotalWasted += gopWasted
    print("Total Wasted Dem Votes:", demTotalWasted)
    print("Total Wasted GOP Votes:", gopTotalWasted)
    if len(districts) >= 3:
        if demTotalWasted / gopTotalWasted >= 1.07:
            print("District is gerrymandered in favor of GOP")
        elif gopTotalWasted / demTotalWasted >= 1.07:
            print("District is gerrymandered in favor of Dem")


voters = getVoters("elgible_voters.txt")
districtDict = getDistricts("districts.txt")
detectGerry("California", voters, districtDict)