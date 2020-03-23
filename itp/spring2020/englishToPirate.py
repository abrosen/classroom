engPirDict = {'sir': 'matey', 'hotel': 'fleabag inn', 'student': 'swabbie', 'boy': 'matey', 'madam': 'proud beauty','restaurant':'galley',"your":"yer","excuse": "arr","students":"swabbies","are":"be","professor":"foul blaggart","lawyer":"foul blaggart","the":"th'","restroom":"head","my":"me","hello":"avast"," is ":" be ", " man ":" matey ","Count":"Cap'n","vampire":"bloodsucking fiend"}
englishWords = list(engPirDict.keys())

for englishWord in englishWords:
    pirateWord = engPirDict[englishWord]
    engPirDict[englishWord.capitalize()] = pirateWord.capitalize()



def translate(text):
    for englishWord in engPirDict:
        text = text.replace(englishWord, engPirDict[englishWord])
    return text



data = open("dracula.txt", 'r')
text = data.read()
text = translate(text)

target = open("Captain Dracula.txt","w")
target.write(text)
target.close()
print("File be translated to pirate.")