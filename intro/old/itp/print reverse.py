def printReverse(text):
    reversedText = "" 
    for letter in text:
        reversedText = letter + reversedText 
    print(reversedText)
    
printReverse("hello")
