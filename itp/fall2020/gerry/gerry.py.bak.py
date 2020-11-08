def getDistrictInfo(filename):
    districtInfo = {}   
    data = open(filename,'r')
    for line in data:
        line = line.strip()
        line = line.strip(',')
        line =  line.split(',')
        state = line[0]
        line = line[1:]
        stateInfo = []
        while line != []:
            dataForDistrict = (line[0],int(line[1]),int(line[2]))
            stateInfo.append(dataForDistrict)
            #print(state,dataForDistrict)
            line = line[3:]
        districtInfo[state] =  stateInfo
    return districtInfo




def getVoters(filename):
    voters = {}
    data = open(filename,'r')
    for line in data:
        line = line.strip()
        line = line.split(',')
        voters[line[0]] = int(line[1])
    return voters


def calcGerry(state,districtDict,voterDict):
    districts = districtDict[state]
    voters = voterDict[state]
    demWastedTotal = 0
    gopWastedTotal = 0
    totalVotes = 0
    for district in districts:
        name = district[0]
        dem  = district[1]
        gop  = district[2]
        demWasted = 0
        gopWasted = 0
        if dem > gop:
            gopWasted = gop
            demWasted = (dem - 1) - gop
        else:
            demWasted = dem
            gopWasted = gop - (dem + 1)
        totalVotes += dem + gop
        demWastedTotal += demWasted
        gopWastedTotal += gopWasted
        print("District", name, dem, gop, demWasted, gopWasted)
    print(state,totalVotes,demWastedTotal,gopWastedTotal)
    if demWastedTotal/gopWastedTotal >= 1.07 :
        print("GOP benefits from gerrymander")
    elif gopWastedTotal/demWastedTotal >= 1.07:
        print("Dems benefit from gerrymander")

d = getDistrictInfo("districts.txt")
v = getVoters("elgible_voters.txt")



calcGerry("Pennsylvania", d,v)

