
# counting
# categorizing 
# Key-Value association.

data =  open("dracula.txt", 'r')

d = {}

d['count'] = 0
d['dracula'] = 0
#d['count dracula'] = 0
d['the'] = 0

for line in data:
	words  = line.split()
	for word in words:
		word = word.strip(",.;!?")
		if 'count' ==  word.lower() or 'count\'s' ==  word.lower(): #count count's 
			d['count'] = d['count'] + 1
			print(word)
		if 'dracula' == word.lower() or 'dracula\'s' == word.lower() \: # dracula dracula's dracula.
			d['dracula'] = d['dracula'] + 1	
		# if 'the' in word.lower(): #the they these 
		if 'the' == word.lower():
			d['the'] = d['the'] +1

print(d)
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
