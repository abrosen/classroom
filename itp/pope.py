date = input("Please enter a date\n")
# mm/dd/yyyy
# 0123456789
month =  int(date[0:2])
day   =  int(date[3:5])
year  =  int(date[6:])

if month == 9 or month == 4 or month == 6 or month == 11:
    print("30 day month")
    if day < 1 or day > 30:
        print("Invalid day")
    else:
        print("Valid date")
if month == 1 or month == 3 or month == 5 or month == 7  or month == 8  or month == 10  or month == 12:
    print("31 day month")
    if day < 1 or day > 31:
        print("Invalid day")
    else:
        print("Valid date")
if month == 2:
    print("FEBUARY OF DOOM")
    if day >= 1 and day < 29:
        print("Valid")
    elif day == 29:
        print("TODO: check for leap year")
        if year % 4 == 0:
            print("possible leap year")
            if year % 400 == 0:
                print("leap year, valid date")
            elif year % 100 ==0:
                print("can't be a leap year, invalid date")
            else:
                print("leap year, valid date") 

        else:
            print("not a leap year.  invalid year")
    else:
        print("invalid day")
if month <= 0 or month > 12:
    print "Bad Month"

