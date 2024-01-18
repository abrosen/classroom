

for filenum in range(10000):
    target = open("folder/target" +str(filenum)+".txt",'w')
    for i in range(10000):
        target.write("hello there\n")
    target.close()