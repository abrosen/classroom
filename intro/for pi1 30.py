import math
#for X in Y:
#for X in range(num):

"""total = 0 
for _ in range(10):
    total = total + 1
print(total)
"""

#for i in range(1,100,2):
#    print(i)

# 0 + 1 + 2 + 3 + 4 + 5...
# 1 + 2 + 3 + 4 + 5
# 1 + 3 + 5 + 7
# 1/1 + 1/3 + 1/5 + 1/7
# + 1/1 - 1/3 + 1/5 - 1/7... -> pi/4
"""
total = 0
numer = 1
for i in range(1,10,2):
    denom = i
    print( numer ,"/", i)
    total = total + numer/denom
    numer = numer * -1
print(total)
"""

# [0,5)

total = 0
one = 1
for i in range(1,100000000,2):
    #print( one ,"/", i)
    total = total + one/i
    one = one * -1
print(total*4)
print(math.pi)



