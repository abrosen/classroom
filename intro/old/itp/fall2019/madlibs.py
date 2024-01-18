import re

grammerRegex =  re.compile(r"\[([A-Za-z \(\)]+)\]")

text = open("madlibs/1.txt",'r')

output=open("output.txt","w")
for line in text:
	entries = []
	for blank in grammerRegex.findall(line):
		print("Please enter a", blank)
		entries.append(input())
	newline = line
	for word in entries:
		newline = grammerRegex.sub(word, newline,1)
	output.write(newline)
	
print(output)
output.close()
