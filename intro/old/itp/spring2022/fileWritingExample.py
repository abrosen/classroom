
# do not run
for i in range(1,1001):
    file = open("outputs/" +  str(i)+ ".txt", "w")
    for _ in range(1000):
       file.write("ALL WORK AND NO PLAY MAKES JACK A DULL BOY.\n")
    file.close()