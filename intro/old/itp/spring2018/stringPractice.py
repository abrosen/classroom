

#total = 0 
#for i in range(0,100,2):
#    total =  total + i


# take in word, returns only the vowels
def onlyVowels(word):
    output = ""
    for letter in word.lower():
        if letter in "aeiou":
            output = output + letter
    return output

# good -> g--d    
def blankVowels(word):
    output = ""
    for letter in word:
        if letter in "aeiou":
            output = output + "_"
        else:
            output = output + letter
    return output

def blankVowels2(word):
    word = word.replace("a","_")
    word = word.replace("e","_")
    word = word.replace("i","_")
    word = word.replace("o","_")
    word = word.replace("u","_")
    return word

def blankVowels3(word):
    return word.replace("a","_").replace("e","_").replace("i","_").replace("o","_").replace("u","_")

def encryptCaesar(word):
    output = "" 
    for letter in word:
        if letter.isalpha():
            pos = ord(letter)
            cipherText = chr(  ((pos - ord('a') + 3) %26)  + ord("a") )
            output = output + cipherText
        else:
            output = output + letter
    return output

def decryptCaesar(word):
    output = "" 
    for letter in word:
        if letter.isalpha():
            pos = ord(letter)
            cipherText = chr(  ((pos - ord('a') - 3) %26)  + ord("a") )
            output = output + cipherText
        else:
            output = output + letter
    return output


# replace ae with æ
def replaceAE(word):
    output = ""
    """
    skip  =False
    
    for index, letter in enumerate(word):
        if skip == True:
            skip = False
        elif index < len(word) -1 and letter == "a" and word[index+1] == "e":
            output = output + "æ"
            skip = True
        else:
            output = output + letter
    """
    
    i = 0 
    while i < len(word):
        letter = word[i]
        if i < len(word) -1 and letter == "a" and word[i+1] == "e":
            output = output + "æ"
            i = i + 2 
        else:
            output = output + letter
            i = i +1
    return output




print(replaceAE("aepple"))


