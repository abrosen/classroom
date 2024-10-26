def isLeapYear(year):
    if year % 400 == 0:
        return True
    elif year % 4 == 0 and year % 100 != 0:
        return True
    else:
        return False
    """if year % 4 == 0 :
        if not year % 100 ==0:
            return True
        else:
            if not year % 400 == 0:
                return False
            else:
                return True
    else:
        return False
    """
#date = input("please enter date in MM/DD/YYYY format")
#       MM/DD/YYYY
#       0123456789
date = "02/29/2000"
month = int(date[0:2])
day   = int(date[3:5])
year  = int(date[6:])


#if it's a 30 day month
if month == 9 or month == 4 or  month == 6 or month == 11:
    print("valid 30 day month")
    if 1 <= day <= 30:
        print("valid date")
    else:
        print("invalid date")
elif month in [1,3,5,7,8,10,12]:
    print("valid 31 day month")
    if 1 <= day <= 31:
        print("valid date")
    else:
        print("invalid date")
elif month == 2:
    print("valid Feb")
    if 1 <= day <= 28:
        print("valid date")
    elif day == 29 and isLeapYear(year):
        print("valid leap year")
    else:
        print("invalid date")  
#else bad month
else:
    print("Invalid month")
