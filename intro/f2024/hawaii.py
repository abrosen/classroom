consonants = ["p", "k", "h", "l", "m", "n", "w"]  #  add '?
vowels = {"a": "ah", "i":"ee"} #...
doubleVowels = {"ai":"eye", "ao":"ow"} #...


def validate(word):
    # for each char in the word
    # check if the character is in consonants or vowel
    #                          or ' maybe depending on how you code
    # if the character is not in consonants or vowels
    # then it is an invalid character so return correctly
    return True  # assume true

# humuhumunukunukuapua'a
# keiki
# kaykee

def pronouce(word):
    sound = ""
    index = 0
    while index < len(word):
        if word[??:??] in doubleVowels:
            # add the pronoucing to sound
            # add a dash
            # increase index by 2
            pass
        elif word[index] in singleVowel:
            pass
        elif word[index] in consonants:
            pass
        else:
            # panik
        

    return sound










