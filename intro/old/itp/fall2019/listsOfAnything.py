

def square(n):
	return n**2
	
#listOfNumbers = [4,5,6,7,2,3]
#for num in listOfNumbers:
#	print(num)
	

#lines = open("pg100.txt","r").readlines()
#print(lines)


#listOfFunctions = [abs,square,lambda x : 2*x, lambda x : 3*x]

#for f in listOfFunctions:
#	print(-12, f, f(-12))


listOfLists = [[1,2], [3,4], [5,6], [7,8]]
for row in listOfLists:
	print(row)


for row in listOfLists:
	for item in row:
		print(item)
		
print(listOfLists[0])
print(listOfLists[0][1])


