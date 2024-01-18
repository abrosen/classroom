mySecretNumber = 5
guess = input("Guess my secret number:   ")
if int(guess) == mySecretNumber:
    print("Wow!  Good guess!")
elif int(guess) > mySecretNumber:
    print("You guessed too high!")
elif int(guess) < mySecretNumber - 100:
    print("Wow.  That's WAY too low.")
elif int(guess) < mySecretNumber:
    print("You guessed too low!")
