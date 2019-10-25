file = open("dictionary.txt",'r')

ing = 0
ion = 0
for line in file:
    line = line.strip()
    if line[-3:] =="ING":
        ing+=1
        #print(line)
    if line[-3:] =="ION":
        ion+=1
print(ing,ion)
