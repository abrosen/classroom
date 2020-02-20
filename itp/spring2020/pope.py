# 0123456789
# MM/DD/YYYY
date = input("Please enter a valid date: ")
month = int(date[0:2])
day = int(date[3:5])
year = int(date[6:])
print(month,day,year)

if month == 4 or month == 6 or  month == 9 or month == 11:  # a month with 30 days 
	if 1 <= day  <= 30: # day within 1 to 30
		print("valid date")
	else:
		print(str(day)  + " is not valid for " + str(month))
elif month == 1 or month == 3 or month == 5 or month == 7 or month == 8 or month == 10 or month == 12  : # a month with 31 days
	if 1 <= day  <= 31 : # day within 1 to 31
		print("valid date")
	else:
		print(str(day)  + " is not valid for " + str(month))
elif month == 2: # i]t's the Febuary of DOOOOOOM
	if day < 1 or day > 29:
		print(str(day)  + " is not valid for " + str(month))
	elif day == 29: # leap year check
		if year % 4 == 0:
			if year % 100 == 0:
				if year % 400 == 0:
					print("valid date")
				else:
					print("29 is invalid on non leap years")
			else:
				print("valid date")
		else:
			print("29 is invalid on non leap years")
	else:
		print("valid date")
else: # not a valid month
	print(str(month) + " is not a valid month")












hello

olleh

def printReverse(text):
	output = ""
#	for letter in text:
#		output =  letter + output
	for index in range(len(text) - 1, -1, -1):
		letter =  text[index]
		output = output + letter
		
		
		
		
		
		
		
