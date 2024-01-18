def addThingToEndOfList(l,thing):
    l.append(thing)

def doubleThisNumber(x):
    x = 2 * x
    


myList = ["apple", "banana", "cucumber", "durian"]
myAlias = myList


myAlias.append("thing")
myOtherList =  myList[:]
print(myList)
print(myAlias)
print(myOtherList)
print(myList is myAlias)
print(myList is myOtherList)