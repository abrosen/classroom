def findFirstVowel(word):
    vowels = "aeiou"
    for index, letter in enumerate(word):
        if letter in vowels:
            return index
    return -1

def convertToPigLatin(word):
    firstVowelIndex = findFirstVowel(word)

    if firstVowelIndex == -1: # no vowel
        return word
    elif firstVowelIndex == 0: #starts with vowel word[something:somethingElse]
        return word[1:] + word[0] + "way"
    else: #doesn't start with vowel
        return word[firstVowelIndex:] +  word[:firstVowelIndex] + "ay"



def main():
    userInput = input("Enter word to convert to Pig Latin (input done to exit):\n")
    while userInput != "done":
        userInput = userInput.lower()
        pigLatin = convertToPigLatin(userInput)
        print(pigLatin)
        userInput = input()
        

main()    
