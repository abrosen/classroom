


def isLeapYear(year): #
    if not year % 4 == 0: 
        return False
    elif year % 100 == 0:
        if year % 400 == 0:
            return True
        else:
            return False
    else:  # divisible by 4, but not by 100
        return True
    


#def complexCalculation(x,y,z_prime,scary_greek_letter):
#    return -1

print("Enter a date:")
date = input()
# 01234567890
# MM/DD/YYYY
month = date[0:2]
month = int(month)
day = int(date[3:5])
year = int(date[6:])



if month == 2:
    if 1 <= day <= 28:
        print("valid date")
    elif day == 29: #DOOOOOOOOOOOOOOOOOOOOOOOOM
        if isLeapYear(year):
            print("valid date")
        else:
            print("invalid; not a leap year")
    else:
        print("invalid day")
elif month == 4 or month == 6 or month == 9 or month == 11:
    if 1 <= day <= 30:
        print("valid date")
    else:
        print("day invalid")
elif month == 1 or month == 3 or month == 5 or month == 7 or month == 8 or  month == 10 or month == 12:
    if 1 <= day <= 31:
        print("valid date")
    else:
        print("day invalid")
else:
    print("Invalid date; month invalid.")










