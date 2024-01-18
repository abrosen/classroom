def readTemperature(filename):
    data = open(filename,"r")
    hottestHot = -3249083
    hottestDay = ""
    coldestCold = 51078
    coldestDay =""
    allHighs = 0
    numDays
    for line in data:
        # [date, high, low]
        fields = line.split(",")
        high =  int(fields[1])
        low = int(fields[2])
        if high > hottestHot:
            hottestHot = high
            hottestDay = fields[0]
        if low < coldestCold:
            coldestCold = low
            coldestDay = fields[0]
        allHighs += high
        numDays +=1
    print(hottestDay,coldestDay, allHighs/numDays)

#readTemperature("temperature.csv")

# unOrUn("untied") -> "tied"
# unOrUn("unable") -> "able"
# unOrUn("necessary") -> "unnecessary"
def unOrUn(word):
    #if word[0] == "u" and word[1] == "n":
    if word[:2] == "un":
        return word[2:]
    else:
        return "un" + word


# [1,2,3,4,5] -> 4
# [15,31,21,17,28] -> 16
# [-1,-100,12,2,100] -> 200
def maxMinDiff(numbers):
    #return max(numbers) - min(numbers)
    biggest = numbers[0]
    smallest =numbers[0]
    for n in numbers:
        if n > biggest:
            biggest = n
        if n <smallest:
            smallest = n
    return biggest-smallest

# [1,2,3,4,5] -> [5,2,3,4,1]
# [15,31,21,17,28] -> [28,31,21,17,15]
# [-1,-100,12,2,100] -> [100,-100,12,2,-1]
def swapEnds(numbers):
    temp = numbers[-1]
    numbers[-1] = numbers[0]
    numbers[0] = temp

# [1,2,3,4,5,6] -> [1,2,3]
# [15,31,21,17,28] -> [15,31]
# ["a","b","c","d","e","f","g","h"] -> ["a","b","c","d"]
def firstHalf(theList):
    return theList[0:len(theList)//2]



# hasWildcat("kitty") -> false
# hasWildcat("tack")
# hasWildcat("tomcat") -> true
# hasWildcat("c4tn1P") -> true
def hasWildcat(word): # A-- would not buy again
    for i in range(0,len(word) -2 ):
        #print(i,i+2,word[i],word[i+2])
        if word[i] == "c" and word[i+2]=="t":
            return True
    return False

# source: http://codingbat.com/prob/p110222
# isEverywhere([1, 2, 1, 3], 1) -> true
# isEverywhere([1, 2, 1, 3], 2) -> false
# isEverywhere([1, 2, 1, 3, 4], 1) -> false
def isEverywhere(nums, val):
    for i in range(0, len(nums)-1):
        if val not in [nums[i], nums[i+1]]:
            return False
    return True

# http://codingbat.com/prob/p197890
# sumStringDigits("aa1bc2d3") -> 6
# sumStringDigits("aa11b33") -> 8
# sumStringDigits("Chocolate") -> 0
def sumStringDigits(word):
    total = 0
    for char in word:
        if char.isdigit():
            total = total + int(char)
    return total

# sumDigits(1234) -> 10
# sumDigits(1000) -> 1
# sumDigits(-581) -> 14
def sumDigits(num):
    total = 0

    while num > 0:
        lastDigit = num % 10
        total += lastDigit
        num = num // 10
    return total

#http://codingbat.com/prob/p134174
#copyEvens([3, 2, 4, 5, 8], 2) -> [2, 4]
#copyEvens([3, 2, 4, 5, 8], 3) -> [2, 4, 8]
#copyEvens([6, 1, 2, 4, 5, 8], 3) -> [6, 2, 4]
def copyEvens(nums, count):
    output = []
    for n in nums:
        if n % 2 == 0:
            output.append(n)
        #if len(output) == count:
        #    return output
    return output[:count]

def readNumbers(filename):
    data  =  open(filename,"r")
    lines = data.readlines()
    total = 0
    for line in lines:
        #"x,y,z,a,b"
        parts = line.split(",")
        #["x","y",z,a,b]
        for val in parts:
            if int(val) % 2==0:
                total+= int(val)
    return total






    
