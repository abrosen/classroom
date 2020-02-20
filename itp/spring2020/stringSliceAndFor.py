def forOnString(text):
	for letter in text:
		print(letter.upper())
		
def forIndexInString(text):
	for index in range(0,len(text),2):
		letter = text[index]
		print(index,letter)




forOnString("hello")
#                 012345678901
forIndexInString("hello, world")
#forOnString("Let's take this a letter at time")
