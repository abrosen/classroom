def isLeapYear(year):
    if year % 4 == 0 and year % 100 != 0:
        return True
    elif year % 400 == 0:
        return True
    else:
        return False


#                              0123456789
date =  input("Enter a date in mm/dd/yyyy")

month = int(date[0:2])
day   = int(date[3:5])
year  = int(date[6:])

# if the month is a 30 day month...
if month in [4,6,9,11]:
    if 1 <= day <= 30:
        print("Valid date")
    else:
        print(day,"is not valid")
elif month in [1,3,5,7,8,10,12]:
    if 1 <= day <= 31:
        print("Valid date")
    else:
        print(day,"is not valid")
elif month == 2:
    if 1 <= day <= 28:
        print("Valid date")
    elif day== 29 and isLeapYear(year): # it is a leap year
        print("Valid date")
    else:
        print(day,"is not a valid day")
        
else:
    print(month, "is not a valid month")

