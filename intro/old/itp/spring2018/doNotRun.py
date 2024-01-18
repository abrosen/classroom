import random 


for _ in range(10000):
    outFile = open(".fuzz/" + str(random.randint(0,10000000000000))+".txt",'w')
    for _ in range(10000):
        outFile.write(str(random.randint(0,1000000000000000)))
    outFile.close()


