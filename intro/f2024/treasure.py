#data = open("pg120.txt","r",encoding="utf8")
#text = data.read()
#print(text[1000:2000])
#lines = data.readlines()
#for line in lines[100:200]:
#    print(line,end="")
#for line in data:
#    print(line)

data = open("pg120.txt","r", encoding="utf8")
count = 0
for line in data:
    line = line.lower()
    count += line.count("sailor")
print(count)

