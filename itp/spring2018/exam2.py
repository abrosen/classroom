import re
"""
" asdasdasddasda '' ' ' sad ' ' '' ' ' ''  sdasdasdas  "
'asd;fjdasjfd;asjf a jfkadjldjff " " dfsjsdlfj" " sdfkjslf' 
"  he  said \"hello\""

"""


#Write a script that reads a text file 
#and creates a new text file that is the same as the file
#that was read, except all the telephone numbers in the 
#original text file have been replaces with the string “PRIVATE.”
#You can assume telephone numbers will look like “(111) 222-3333”
def phoneReplacer(filename):
    data = open(filename,'r')
    output = open("output.txt",'w')
    phoneRegex = re.compile(r"\(\d{3}\) \d{3}-\d{4}")
    
    for line in data:
        line = phoneRegex.sub("PRIVATE", line)
        output.write(line)
        
    output.close()

def hasWildcat(word):
    wcRegex = re.compile(r"c.t")
    if wcRegex.search(word):
        return True
    return False

 
def hasWildcatNR(word):
    for index in range(len(word)-2):
        letter = word[index]
        if letter == "c" and word[index+2] == "t":
            return True
                
    return False


def numbersdotcsv():
    data =  open("numbers.csv",'r')
    total = 0
    for line in data:
        numbers = line.split(",")
        for number in numbers:
            number = int(number)
            if number % 2 == 0:
                total = total + number
    
    
    return total

def unOrUn(word):
    if word[0:2] == "un":
        return word[2:]
    else:
        return "un" + word


# [1,2,3,4,5] -> 4
# [15,31,21,17,28] -> 16
# [-1,-100,12,2,100] -> 200
def maxMinDiff(numbers):
    biggest = numbers[0]
    smallest = numbers[0]
    for num in numbers:
        if num > biggest:
            biggest = num 
        if num < smallest:
            smallest = num
    return biggest - smallest
    #return max(numbers) - min(numbers)
     
#   5,2,3,4,1      1
def swapEnds(numbers):
    temp =  numbers[0]
    numbers[0] = numbers[-1]
    numbers[-1] = temp
    
# source: http://codingbat.com/prob/p110222
# isEverywhere([1, 2, 1, 3], 1) -> true
# isEverywhere([1, 2, 1, 3], 2) -> false
# isEverywhere([1, 2, 1, 3, 4], 1) -> false
def isEverywhere(nums, val):
    for index in range(len(nums) -1):
        left = nums[index]
        right = nums[index+1]
        if left != val and right != val:
            return False
    return True
    

# http://codingbat.com/prob/p197890
# sumStringDigits("aa1bc2d3") -> 6
# sumStringDigits("aa11b33") -> 8
# sumStringDigits("Chocolate") -> 0
def sumStringDigits(word):
    total = 0
    for letter in word:
        if letter.isdigit():
            number = int(letter)
            total = total + number
    return total
    
#Given an integer, return the sum of the digits 0-9 of that integer.
# sumDigits(1234) -> 10
# sumDigits(1000) -> 1
# sumDigits(-581) -> 14
def sumDigits(num):
    total = 0
    if num < 0:
        num = num * -1
    while num != 0:
        lastDigit =  num % 10
        num = num // 10
        total = total +lastDigit

    return total 

#Given a list of positive numbers, return a new list of length ”count” containing the first even
#numbers from the original array. The original list will contain at least ”count” even numbers.
#http://codingbat.com/prob/p134174
#copyEvens([3, 2, 4, 5, 8], 2) -> [2, 4]
#copyEvens([3, 2, 4, 5, 8], 3) -> [2, 4, 8]
#copyEvens([6, 1, 2, 4, 5, 8], 3) -> [6, 2, 4]
def copyEvens(nums, count):
    numFound = 0
    output = []
    for num in nums:
        if num % 2 == 0:
            output.append(num)
            numFound = numFound+1
            if numFound == count:
                break
    return output


print(sumDigits(-581))    
