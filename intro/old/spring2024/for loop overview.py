# Lecture notes for CIS 1051 2/1
import math
#numTimes = int(input("How many times to say hello?"))
#for _ in range(numTimes):
#for _ in "apple":
#    print("hello")
#    print("world")

# range(endpoint) -> all ints from [0,endpoint)
"""
total = 0
for num in range(10):
    total += num
    print(total, "<---", total-num, "+", num)
print(total)
"""
"""
for num in range(100,50,-10):
    print(num)
"""
"""
word = "I love tacos."
for letter in word:
    print(letter)
"""

# (1)(1/1) + (-1)(1/3) +(1)(1/5) + (-1)(1/7)
# 1. adding arbitrary number of numbers (done!)
# 2. alterating between addition and subtraction (done)
# 3. adding fractions instead of number
#    1 + 3 + 5 + 7 --> 1/1 + 1/3 +1/5 +1/7
# 4. incrementing by 2
#    1 +2 +3 +4 +5 --> 1 +3 + 5+ 7

total = 0
numTerms = 100000000
sign = 1
for denom in range(1,numTerms*2,2):
    total = total + sign*(1/denom)
    #print(sign,"*1/",denom)
    sign = sign * -1
print(total*4)
print(math.pi)

print("done")
    
