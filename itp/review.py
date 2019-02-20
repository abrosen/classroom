#Write an if statement that checks if either x or y is even, and the other one is odd.

#if (x % 2 == 0 and y % 2 != 0) or (x % 2 != 0 and y % 2 == 0): 
#    pass

for i in range(10):
    if (i%3 == 1):
        print(i,end="")


#x % y  where x < y -> x

i = 2   # i  is  0
while i > 0:
    print("!")
    i -= 1

for i in range(2):
    print("!")

# !
# !


"""
10 8 6 4 2 
8 6 4 2
6 4 2
4 2
2
"""

for start in range(10, 0, -2):
    for num in range(start,0,-2):
        print(num,end=" ")
    print()

# i = 0  values 0   1       2
# j = 0  values 0   0 1     0 1 2
# output 0
#        12
#        234
#    
for i in range(3):
    for j in range(i+1):
        print(i + j, end="")
    print()
    
# x 8
# y 11
# z -4
x = 7
y = 8
z = -5
x = x + 1
y = x + y + z
z+=1


def foo():
    print("foo")

def bar():
    foo()
    print("bar")
    baz()

def baz():
    print("baz")
    foo()
    #bar()

foo()   # foo foo bar baz foo baz foo
bar()
baz()



#             4  6
def confundus(y, x, z):
    x+=1
    y = y - x + z
    print(z , x, y)


x = 6
y = 8
z = 4    #4 6 8
confundus(z,x,y);



# "hello" -> "h, e, l, l, o"
# "one two!" -> "o, n, e, , t, w, o, !"
# "a"-> "a"
def eachChar(word):
    output = ""
    for i in range(len(word) -1):
        output = output  + word[i] +", "
    output = output + word[len(word) -1]
    return output

print(eachChar("hello"))



# n = 3 will return the integer 18 because 3 + 6 + 9 = 18
# n = 5 will return the integer 45 because 3 + 6 + 9 + 12 + 15 = 45
# n = -1 will return 0
def sumOfThrees(n):
    if n <= 0:
        return 0
    else:
        total = 0
        for num in range(3, n*3 + 1, 3): # 3 6 9
            total += (num)
        return total    
        
