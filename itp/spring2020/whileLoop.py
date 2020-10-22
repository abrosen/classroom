import random

done =  False

while not done:

    secretNumber = random.randint(1,100)
    print("I'm thinking of a number from 1 to 100.")
    guess = int(input("What do you think it is?\t"))
    while guess > 100 or guess < 1:
            guess = int(input("Whoops.  Try a number from 1 to 100:\t"))

    while guess != secretNumber:
        if guess > secretNumber:
            
            guess = int(input("My number is smaller. Guess again!\t"))
        else:
            guess = int(input("My number is bigger. Guess again!\t"))

        
        while guess > 100 or guess < 1:
            guess = int(input("Whoops.  Try a number from 1 to 100:\t"))

    print("Wow, you got it!")
    ans = input("Play again?\t")
    ans = ans.lower()
    if ans == "no" or ans == "n":
        done  = True
