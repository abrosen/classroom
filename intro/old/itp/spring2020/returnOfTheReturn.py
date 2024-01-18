def double(x):
    return 2*x


def giveMe5():
    return 5

def returnStopsAFunction():
    print("this is the first line of the function")
    print("this is the second line of the function")
    return "I returned the third line"
    print("This is the fourth line")
    return "I returned the fifth line"


def isEven(num):
    """Returns true if num is an even num"""
    return num % 2 == 0

# [5, -2, 7] -> 10
# [10, 1, 3] -> 14
# [1, 1, 3, 1,1,1,1] -> 9
def addAllNums(listOfNums):
    """ gives the sum of a list """
    total = 0
    for num in listOfNums:
        total = total + num
    return total


def isListEven(listOfNums):
    """ Returns true if the sum of the list is even"""
    return isEven(addAllNums(listOfNums))



