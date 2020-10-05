
# apple -> 0
# 01234567
# xyzabcde -> 3

def findFirstVowel(word):
    index = len(word) - 1
    for char in word:
        if char in "aeiou":
            return word.index(char)
    
    """
    for index, letter in enumerate(word):
        if letter in "aeiou":
            return index
    """ 


    return index

def convertToPigLatin(word):
    indexVowel =  findFirstVowel(word)
    # if word starts with a vowel
    if indexVowel == 0:
        return  word[1:] + word[0] + "way"
    elif indexVowel == len(word) -1:
        return word
    else: # first vowel exists somewhere in the middle
        return word[indexVowel:]+ word[:indexVowel]+ "ay"
    
def main():
    done = False
    while not done:
        word = input()
        word = word.lower()
        
        
        if word == "done":
            done = True
        else:
            pig = convertToPigLatin(word)
            print(pig)


main()