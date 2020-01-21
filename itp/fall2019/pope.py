
def isLeapYear(year):
	if year % 4 == 0:
		if year % 100 == 0 and not (year % 400 == 0):
			return False
		else:
			return True
	else:
		return False

done = False
while not done:
	date = input("Enter a date: ")
	month =  int(date[0:2])
	day =  int(date[3:5])
	year = int(date[6:])


	if month == 4 or month == 6 or month == 9 or month == 11:
		if  1 <= day  <= 30 :
			print("valid")
		else:
			print("date is invalid due to day")
	elif month == 1 or month == 3 or month == 5 or month == 7 or month == 8 or month ==10 or month == 12:
		if  1 <= day  <= 31:
			print("valid")
		else:
			print("date is invalid due to day")
	elif month == 2:
		if 1 <= day <= 28:
			print("valid")
		elif day == 29 and isLeapYear(year):
			print("Valid")
		else:
			print("Invalid day") 
	else:
		print("invalid: month not valid")
	
	again = input("again?")
	if again == "no" or again == 'n':
		done = True
