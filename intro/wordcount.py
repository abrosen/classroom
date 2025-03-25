def wordCount(text):
	count =  {}
	for line in text:
		words = line.split(" ")
		for word in words:
			word = word.lower()
			word = word.strip()
			word = word.strip(".,:'\"")
			if len(word) > 0:
				if word not in count:
					count[word] = 1
				else:
					count[word] += 1
	return count
	



def getHamlet(filepath):
	data =  open(filepath,"r",encoding="utf8")
	text = data.readlines()
	return text
	
text = getHamlet("hamlet.txt")
count = wordCount(text)
words = sorted(count, key= count.get, reverse = True)
top10 = words[:10]
for word  in top10:
	print(word, count[word])
