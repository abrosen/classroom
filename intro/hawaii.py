cons = ["p","h","w"," ","'"] # add the rest
vowels = { "a": "ah", "e":"eh" } # add the rest
doubleVowels = {"ai" : "eye"} #add the rest

def validate(word):
	return True
	
def pronounce(word):
	output = ""
	index = 0
	while index < len(word):
		# check if this and index+1 make a double vowel
		# by checking if in double vowels
		#     grab the value and add it to output
		#     add a hyphen
		#     move up index by two
		# otherwise check vowels
		# ....
		# otherwise check conse
		if word[index] in cons: # be an elif at bottom of chain
			output += word[index]
			index +=1
	# output will end with hypen, remove it
	# eye- hah-wai
	return output
	
	
def main():
	print("Enter a hawaiian word") 
