def isLeapYear(year):
    # 4 O
    # 100 X
    # 400 O
    if year % 400 == 0:
        return True
    elif year % 100 == 0:
        return False
    elif year % 4 == 0:
        return True
    else:
        return False
"""
    if year % 4 == 0:
        if year % 100 == 0 :
            if year % 400 == 0:
                return True
            else:
                return False
        else:
            return True
    else:
        return False
"""
date = "02/29/2400"#input("Enter a date")

# 0123456789
# MM/DD/YYYY

month = int(date[:2])
day   = int(date[3:5])
year  = int(date[6:])
print(month, day, year)

if month == 9 or month == 4 or month == 6 or month == 11: #  30 day month - September, April, June, and November
    if 1 <= day <= 30 :  # <  > >= <=
        print("Valid Day")
    else:
        print(day, "is not valid day for month", month)

elif month == 1 or month == 3 or month == 5 or month == 7 or month == 8 or month == 10 or month == 12: # 31 day months
    if 1 <= day <= 31 :  # <  > >= <=
        print("Valid Day")
    else:
        print(day, "is not valid day for month", month)
elif month == 2: # Feb
    if 1 <= day <= 28:  # <  > >= <=
        print("Valid Day")
    elif day == 29 and isLeapYear(year):
        print("Valid day for",year)
    else:
        print(day, "is not valid day for month", month, "year",year)
else:
    print(month, "is an invalid month")

"""
#    0123456
s = "My name"
s2 = s[0:2] # holds the value "My"
s3 = s[3:6] # holds the value "nam"
s4 = s[3:] # holds the value "name"
s5 = s[3] # Not a slice, holds just "n"
space = s[2:3] # holds the value " "
"""
