# checks if x is prime or not
def isPrime(x):
    for factor in range(2,x):
        if x % factor == 0:
            return False
    return True


# print all primes from 1 to whatever the user input
def main():
    # give instructions
    print("Enter a number")
    print("This program will print all prime numbers up to and including that number")
    # get user input
    number =  int(input())
    

    # 1 is NOT prime
    # for each of the numbers from
    # two up to and including the number,
    # check if the number is prime,
    # if it is, print it out
    for x in range(2,number + 1):
        if isPrime(x) == True:
            print(x)


main()
