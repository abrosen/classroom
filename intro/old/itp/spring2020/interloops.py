def numVowel(text):
    count = 0
    text = text.lower()
    vowels ="aeiou"
    for letter in text:
        if letter in vowels:
            count = count + 1

    return count

def numEvens(num):

    if num == 0:
        return 1

    count = 0
    
    #num = str(num)
    #for digit in num:
    #    digit = int(digit)
    
    
    while num > 0:
        digit = num % 10
        if digit % 2 == 0:
            count += 1
        num = num // 10



    
    return count 

def isArmstrong(num):
    total = 0
    orig = num 
    while num > 0:
        digit = num % 10
        total = total + (digit ** 3)
        num = num // 10

    if total == orig:
        return True
    else:
        return False


def riddler():
    for num in range(1001,10000,2):
        thou = num // 1000
        #    1234
        hund = (num // 100) % 10  # (num % 1000) // 100
        tens = (num // 10) % 10
        ones = num % 10
        if thou + hund + tens + ones == 27:
            if thou  == 3 * tens :
                if thou != hund and thou != tens and thou != ones and  hund != tens and hund != ones  and tens != ones:
                    return num

print(numVowel("hello world"))
print(numEvens(0))
print(isArmstrong(370))
print(riddler())