print("Enter a number, I will tell you if it is prime")
number = int(input())

# a number is prime if it is divisible only by itself and 1
# we only have to check numbers starting from two that are less than the number

check = 2
isPrime = True
while check < number and isPrime == True:
    print(check)
    if number % check == 0:
        isPrime = False
    check = check + 1 

if isPrime:
    print("Prime")
else:
    print("Not Prime")
    
