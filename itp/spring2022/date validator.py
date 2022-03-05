def isLeapYear(year):
    #return year % 4 == 0 and (year % 100 !=0 or (year % 100 == 0 and year % 400 ==0))
    if year % 4 == 0:
        if year % 100 == 0:
            if year % 400 == 0:
                return True
            else:
                return False
        else:
            return True
    else:
        return False



date = input("Please enter MM/DD/YYYY:\n")
# 0123456789
# MM/DD/YYYY
# string[index:end]

month = int(date[0:2])
day = int(date[3:5])
year = int(date[6:])

print(month,day,year)
# 31 days
if month == 1 or month == 3 or month == 5 or month == 7 or month ==8 or month == 10 or month == 12:
    print("31 days")
    if 1 <= day <= 31:
        print("valid day")
    else:
        print("invalid day")
    
#30 days
elif month ==4 or month ==6 or month == 9 or month == 11 :
    print("30 days")
    if 1 <= day <= 30:
        print("valid day")
    else:
        print("invalid day")
elif month == 2:
    if 1 <= day <= 28:
        print("valid day")
    elif day == 29:
        if isLeapYear(year):
            print("valid day")
        else:
            print("not a leap year")
    else:
        print("invalid day")
else:
    print("Invalid month")

