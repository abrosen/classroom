def numVowels(text):
    text = str(text) 
    count = 0
    vowels = ['a','e','o','i','u']
    for letter in text:
        if letter in vowels:
            count += 1
    return count

# count evens
# returns number of even numbers in a list
# [2,4,5,6] -> 4
def numEvens(numbers):
    count = 0
    for number in numbers:
        if number % 2 == 0:
            count += 1
    return count

def combine(words):
    output =""
    for word in words:
        output = output + word
    return output


print(combine(["cat","rat","dog"]))
