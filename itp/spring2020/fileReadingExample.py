data = open("shakespeare.txt","r")
#print(data)


countDracula = 0
countWords = 0
for line in data:
	words = line.split()
	countWords = countWords + len(words)
	print(words)
	"""
	if "dracula" in line.lower():
		print(line)
		countDracula = countDracula +1
	"""
print(countWords)
