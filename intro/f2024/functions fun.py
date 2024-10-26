def f(x):
    return 2+x



#answer =  f(10)
#print(answer)

"""
>
<
>=
<=
==
"""

def numVowels(text):
    total = 0
    vowels = "aeiou"
    for letter in text:
        if letter in vowels:
            total +=1

        #if letter == "a" or letter == "e" or letter == "i" or letter == "o" or letter == "u":
        #    total+=1
    return total



#print(numVowels("apple"))  
"""
numEvenDigits(4) -> 1
numEvenDigits(10) -> 1
numEvenDigits(44626) -> 5
numEvenDigits(44625) -> 4
"""
def numEvenDigits(number):
    total = 0
    numberString = str(number)
    for digit in numberString:
        digit = int(digit)
        if digit % 2 == 0:
            total += 1
    return total

#print(numEvenDigits(1000))

def numEvenDigits2(number):
    total = 0
    while number > 0:
        digit = number % 10
        if digit % 2 == 0:
            total += 1
        number = number // 10

    
    return total
#print(numEvenDigits2(123456))

def riddler():
    for x in range(1001,10000,2):
        thou = x // 1000
        hund = x // 100 % 10
        tens = (x // 10)  % 10
        ones = x % 10

        if ones != tens and ones != hund and ones != thou and tens != hund and tens!= thou and hund != thou:
            if thou == 3 * tens:
                if thou + hund +tens + ones == 27:
                    print(x)


riddler()

"""
    total += text.count("a")
    total += text.count("e")
    total += text.count("i")
    total += text.count("o")
    total += text.count("u")
    return total
"""


