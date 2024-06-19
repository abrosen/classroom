def isLeapYear(year):
    """if year % 4 == 0:
        if year % 100 == 0 :
            if year % 400==0:
                return True
            else:
                return False
        else:
            return True
    else:
        return False
    """
   #if year % 4 == 0 and (year % 100 != 0 or year% 400==0 ):
    if year % 400 == 0:
        return True
    elif year % 100 == 0:
        return False
    elif year % 4 == 0:
        return True
    else:
        return False
# get the date
date = input("Please enter MM/DD/YYYY\n")

# 0123456789
#"XX/XX/XXXX"

month = int(date[0:2])
day = int(date[3:5])
year = int(date[6:])
print(month,day,year)
# test the date

# figure out if month is 30 days,31 days, Feb, or invalid

if month == 4 or month == 6 or month == 9 or month == 11:
    print("30 day month")
    if 1 <= day <= 30:
        print("valid date")
    else:
        print(day,"is invalid for", month)
elif month == 1 or month == 3 or month == 5 or month == 7 or month == 8 or month == 10 or month == 12:
    print("31 day month")
    if 1 <= day <= 31:
        print("valid date")
    else:
        print(day,"is invalid for", month)
elif month == 2:
    print("febuary")
    if 1 <= day <= 28:
        print("valid date")
    elif day == 29 and isLeapYear(year):
        print("valid date, leap year")
    else:
        print(day,"is invalid for", month,"/",year)
else:
    print(month,"is an invalid month")

    

