#output = open("output.txt", 'w')
#output.write("hello\n")
#output.write("world")
#output.close()
import random


output = open("somenums.csv",'w')
for row in range(20):
    for item in range(4):
        roll = random.randint(20,50)
        roll = str(roll) + ", "
        output.write(roll)
    roll = random.randint(20,50)
    roll = str(roll) + "\n"
    output.write(roll)

output.close()