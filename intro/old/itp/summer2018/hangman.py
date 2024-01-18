secretWord = "banana"
userView   = "?" * len(secretWord)
numberOfGuesses = 7


def getGuess():
    pass

def updateUserView(guess):
    # turn userView into a list
    # iterate over the indices of secretWord
    #   if the letter at some index is the guess
    #       change the ? at index in userView to guess
    # turn userView back from list into a string
    pass

def combine(words):
    output =""
    for word in words:
        output = output + word
    return output

def playGame():
    global numberOfGuesses
    while numberOfGuesses != 0 and ("?" in userView):
        guess =  getGuess()

        if guess in secretWord:
            updateUserView(guess)
        else:
            print("HAHAHA UR WRONG.")
            numberOfGuesses -= 1



playGame()
