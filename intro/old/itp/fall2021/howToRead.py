data = open("dracula.txt", "r", encoding="UTF8")

#text = data.read()
#lines = data.readlines()

for line in data:
    print(line.strip())