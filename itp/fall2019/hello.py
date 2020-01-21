# THIS PROGRAM WAS WRITTEN BY ANDREW ROSEN

print("hello")  # this prints hello
print("how are you?")
print("Professor\nRosen\nsaid\n\"hello.\"")
# \n is a new line
# \t is a tab
# \" is a quote
# \\ is a \  i j ... 



# get user input 
x = input("Enter another ")
...






if x < y:
	if x < z:
		smallest = x
		if y < z:
			middle = y
			biggest = z
		else:
			biggest = y
			middle = z
	else:
		x = middle	
		y = biggest 
		z = smallest

elif  x < z # if we are here, we know x is BIGGER than y 
	middle = x 
	smallest = y
	biggest = z  
	
else: # well, x HAS to be the biggest
	biggest =  x
	if y < z:
		smallest = y
		middle = z
	else:
		smallest = z
		middle = y
	


print(str(x)+ " "+ str(y) +  " " + str(z))



if z < y < x:
	print(str(z)+ " "+ str(y) +  " " + str(x))

