import math

# [5,105) by 5's
##x =5
##x += 6 # => x = x +6
##print(x)

"""
total = 0

for number in range(1,6):
    total = total + number

print(total)
"""


numTerms = 100000000
sign = 1
lowerTerm = 1
# 0 1 2 3 4
total = 0 
for i in range(numTerms):
    denominator = 1 + 2*i
    term = sign/denominator
    total+=term
    #print(i, str(sign)+"/"+str(denominator), sign*  1/ denominator)
    sign = sign * -1
print(total*4, math.pi)
