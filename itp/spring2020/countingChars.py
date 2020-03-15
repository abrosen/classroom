import string
text = open("dracula.txt", 'r')


d= {}
for line in text:
	line = line.strip()
	line = line.lower()
	for char in line:
		if char in string.ascii_lowercase:
			if char not in d:
				d[char] = 1
			else:
				d[char] = d[char] + 1
			
for k in d:
	print(k,d[k])
