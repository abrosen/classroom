chars = "aeioupkhlmnw"
consonants = "pkhlmnw"
vowels = "aeiou"



def pronouce(word):
    index = 0
    output = "" 
    while index < len(word):
        char =  word[index]
        if char in consonants:
            output = output + char
        elif char in vowels:
            nextChar = word[index + 1]
            if char == "a":
                if nextChar == "i":
                    output= output+ "eye-"
                    index = index + 1
                output = output + "ah-"
            elif char == "e":
                output = output + "eh-"
            elif char == "i":
                output = output + "ee-"
            elif char == "oh":
                output = output + "oh-"
            elif char == "u":
                output = output + "oo-"
        index = index +1
    return output[:-1]
print(pronouce("humuhumu"))