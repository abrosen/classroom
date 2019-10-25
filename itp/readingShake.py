data = open("shakespeare.txt", 'r')
text = data.readlines()
count = {}
"""
count["luck"] = 0
count["happy"] = 0
count["few"]  = 0
"""
for line in text:
	for char in line:
		if char not in count:
			count[char] = 1
		else:
			count[char] = count[char] +1
	#words = line.split(" ")
	#print(words)
	"""
	for word in words:
		word = word.lower()
		word = word.strip(",")
		if word in count:
			count[word] = count[word] + 1
	"""
print(count["e"])
print(count["E"])
print(count[" "])



