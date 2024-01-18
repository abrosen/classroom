def add(x,y):
    print("adding",x,y)
    return x+y


def numVowels(word):
    count = 0
    word = word.lower()
    vowels = "aeiou"
    for letter in word:
        if letter in vowels:
            count = count + 1
    return count


def numEvenDigits(x):
    count = 0
    while x > 0:
        lastDigitOfX = x % 10
        if lastDigitOfX % 2 == 0:
            count = count + 1
        everythingButLastDigit = x // 10
        x = everythingButLastDigit
        
    """
    number = str(x)
    evens = "02468"
    for digit in number:
        if digit in evens:
            count += 1

    """
    return count

def isArmstrong(x):
    ones = x % 10 
    tens = x //10  % 10
    hund = x // 100
    return ones ** 3 + tens ** 3 + hund **3 == x

"""
• All four digits are different
• The digit in the thousands place is three times the digit in the tens place
• The number is odd
• The sum of the digits is 27
"""
def riddler():
    for number in range(1001,10000,2):
        ones = number % 10 
        tens = number //10  % 10
        hund = number // 100 % 10
        thou = number //1000
        if ones != tens and ones != hund and ones != thou and tens != hund and tens != thou and hund != thou:
            if thou == 3 * tens:
                if ones + tens + hund +thou == 27:
                    print(number)

riddler()        
    
#print(add(5,6))
#print(add(3,4)) 
#print(add(add(5,6) , add(3,4)))

test2 = "Aether"
print(numVowels("hello"))
print(numVowels(test2))
print(test2)
print(isArmstrong(371))
