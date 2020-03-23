roman =  input("Enter a Roman Numeral:\n")

value = {"I" :1, "V":5, "X":10, "L":50,"C":100,"D":500,"M":1000}

def validate(roman):
    count = {"I" :0, "V":0, "X":0, "L":0,"C":0,"D":0,"M":0}
    for letter in roman:
        if letter not in count:
            return False


    for letter in roman:
        count[letter] += 1
    if count["I"] > 3 or count["X"] > 3 or count["C"] > 3 or count["M"] > 3:
        return False
    if count["V"] > 1 or count["L"] > 1 or count["D"] > 1:
        return False

    for i in range(len(roman) - 1):
        current = roman[i]
        nextNum = roman[i+1]
        if value[current] < value[nextNum]:
            if not (5*value[current] == value[nextNum] or 10*value[current] == value[nextNum]):
                return False
    return True


def convert(roman):
    arabic = 0
    for i in range(len(roman) - 1):
        current = roman[i]
        nextNum = roman[i+1]
        if value[current] >=  value[nextNum]:
            arabic += value[current]
        else:
            arabic -= value[current]
    return arabic + value[roman[-1]]


print(validate(roman.upper()))
print(convert(roman.upper()))

