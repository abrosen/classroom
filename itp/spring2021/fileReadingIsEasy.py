text = open("macbeth.txt",'r',encoding='utf8')
#bigString =  text.read() # dump text into big string

#for line in text:  # iterate over file line by line
#    line = line.strip()
#    print(line)

#allTheLines = text.readlines()
#print(allTheLines)

numMacbethLines = 0
for line in text:
    line = line.strip()
    #line = line.split(" ")
    #print(line)
    #for word in line:
    if line == "MACBETH.":
        numMacbethLines += 1

print(numMacbethLines)