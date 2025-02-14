def numVowels(text):
    count = 0
    text = text.lower()
    for char in text:
        if char == "a" or char == "e" or char == "i" or char ==  "o" or char == "u":
            count = count + 1
    return count


def numVowels2(text):
    count = 0
    text = text.lower()
    vowels  = "aeiou"
    for char in text:
        if char in vowels:
            count = count + 1
    return count


def numEvenDigits(number):
    count = 0
    for digit in str(number):
        digit = int(digit)
        if digit % 2 == 0:
            count += 1
    return count


def numEvenDigits2(number):
    count = 0
    while number > 0:
        digit = number % 10
        if digit % 2 == 0:
            count += 1
        number = number // 10
    return count

def riddler():
    for n in range(1001, 10000, 2):
        ones = n % 10
        tens = (n // 10) % 10
        huns = (n // 100) % 10
        thou = n // 1000

        if ones != tens and ones != huns and ones != thou and tens != huns and tens !=  thou and huns != thou:
            if thou  == 3 * tens:
                if ones + tens + huns + thou == 27:
                    print(n)
    

riddler()
