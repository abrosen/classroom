def numVowels(text):
    
    vowelCount = 0
    #listOfVowels = ["a","e","i","o","u"]
    vowels = "aeiou"
    for letter in text:
        if letter in vowels:
        #if letter in listOfVowels:
        #if letter == "a" or letter == "e" or letter == "i" or letter == "o" or letter == "u":
            vowelCount = vowelCount + 1 
    return vowelCount

# 847091
def numEvenDigits(number):
    digitCount = 0
    if number == 0:
        return 1
    if number < 0:
        number = number * -1 

    while number != 0:
        lastDigit =  number  % 10
        if number %2  == 0:
            digitCount += 1
        number =  number // 10

    """
    number = str(number)
    for digit in number:
        digit = int(digit)
        if digit % 2 == 0:
            digitCount += 1
    """
    return digitCount

# 345   514  914
def isArmstrongNumber(number):
    ones = number % 10
    tens = (number % 100) // 10
    huns = number // 100 

    return (ones**3 + tens**3 + huns**3) == number 

#5432
def riddler():
    for number in range(1001,10000,2):
        ones = number % 10
        tens = (number % 100) // 10
        huns = (number % 1000) // 100
        thos = number // 1000
        if len(set([ones,tens,huns,thos])) == 4:
            if thos == tens * 3:
                if ones + tens + huns + thos == 27:
                    print(number)

    

riddler()


