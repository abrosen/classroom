def f(x):
    return 2*x


def fTOc(f):
    return (f - 32) * 5/9
    
myFunction = f
    
#print(myFunction(32432))

def isOdd(x):
    return x % 2 == 1


def removeEvens(l):
    return list(filter(isOdd,l))
"""
ans = removeEvens([1,2,3,4,5,6,7,8,9,10,10,10,10])
print(ans)
"""
l = [0,32,40,50,60,70,80,90,100]
l =  list(map(fTOc, l))




print(l)









