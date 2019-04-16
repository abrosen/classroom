import re
# tomcat 
# tomc4t
# tomctt
# tomc t
# tarmac
def hasWildcat(word):
    for index in len(word-2):
        letter = word[index]
        if letter == "c" and word[index+2]=="t":
                return True
    return False


def hasWildcatRegex(word):
    catRegex = re.compile(r"c\wt")
    if catRegex.search():
        return True
    return False
    

def fileReading():
    data = open("numbers.csv",'r')
    total =  0
    for line in data:
        numbers  = line.split(",")
        for number in numbers:
            number = int(number)
            if number % 2 ==0:
                total = total + number
                
    return total


def unOrUn(word):
    if word[0:2] == "un":
        return word[2:]
    else:
        return "un" + word
        
def minMaxDiff(nums):
    biggest = nums[0]
    smallest = nums[0]
    for number in nums:
        if number > biggest:
            biggest = number
        if number < smallest:
            smallest = number
    
    return max(nums) - min(nums)
