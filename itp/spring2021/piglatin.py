def findFirstVowel(word):
    vowels = 'aeiou'
    for index, letter in enumerate(word):
        if letter in vowels: 
            return index
    return -1

def convertToPigLatin(word):
    vowelIndex = findFirstVowel(word)
    if vowelIndex == -1:
        return word
    elif vowelIndex == 0: # if the word starts with a vowel
        return word[1:] +word[0]+ "way" #restOfTheWord + vowel + "way" 
    else: # the word doesn't start with a vowel
        return word[vowelIndex:] + word[0:vowelIndex] + "ay"
    
def main():
    finished = False
    while not finished:
        word = input("Enter a word: ")
        if word == "done":
            finished = True
        else:
            pig = convertToPigLatin(word)
            print(pig)





main()