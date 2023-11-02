def numVowels(text):
    count = 0
    # do magic
    for letter in text:
        #if letter == "a" or letter == "e" or letter == "i":
        #if letter in ["a","e","i","o",'u']:
        if letter in "aeiou":
            count = count + 1  # count += 1
    return count


def numEvenDigits(num):
    count = 0
    if num == 0:
        return 1
    if num < 0:
        num = num * -1
    # Insert code here
    while num > 0:
        digit = num % 10
        if digit % 2 == 0:
            count += 1
        num = num // 10
    return count

answer =  numEvenDigits(-1234567890)
print(answer)
# go over writing isFloat

def isFloat(string):
    for char in string:
        if char not in "0123456789.":
            return False
    if string.count(".") >= 2:
        return False
    return True

def is3DArmstrong(num):
    hund = num // 100
    tens = (num // 10) % 10
    ones = num % 10
    return num == (hund**3 + tens**3 +ones**3)

def riddler():
    for num in range(1001,10000,2):
        thou = num // 1000
        hund = (num // 100) % 10
        tens = (num // 10) % 10
        ones = num % 10
        if thou != hund and thou != tens and thou != ones and hund != tens and hund != ones and tens != ones:
            if thou == 3 * tens:
                if thou + hund + tens + ones == 27:
                    print(num)
riddler()









