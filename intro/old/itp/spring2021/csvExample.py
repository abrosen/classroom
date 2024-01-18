text =  open("somenums.csv", 'r')

lines =  text.readlines()
total =  0
numNumbers = 0
for line in lines:
    line = line.strip()
    line = line.split(',')
    for item in line:
        num = int(item)
        total = total + num
        numNumbers+=1

print(total/numNumbers) 