

def hasDoubleLetters(word):
    index = 0
    while index < len(word) - 1:
        letter = word[index]
        nextLetter = word[index+1]
        if letter == nextLetter:
            return True
        index =  index + 1
    return False

def hasDoubleLettersFor(word):
    for i in range(len(word) - 1):
        if word[i] == word[i+i]:
            return True
    return False

def isPalindrome(word):
    reversedWord = ""
    """for letter in word:
        reversedWord = letter + reversedWord 
        print(reversedWord)
    
    
    """
    index  =  len(word) -1
    while index >= 0:
        reversedWord = reversedWord + word[index]
        index = index - 1
    if word == reversedWord:
        return True
    else: 
        return False
    
def isPalindromeOneLiner(word):
    return word == word[::-1]


def numWords(text):
    num = 1
    index =  0
    while index < len(text)-1:
        letter =  text[index]
        if letter.isalpha():
            nextLetter = text[index+1]
            if not nextLetter.isalpha():
                num = num + 1
        index = index + 1
    if not text[-1].isalpha():
        num = num - 1 
    
    return num


print(numWords("hello, world. this is a program that counts wordsz!!!!"))
