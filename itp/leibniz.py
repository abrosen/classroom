import math

limit = 100000000
sign = 1
total = 0
for denominator in range(1,limit,2):
    #print(str(sign)+"/"+str(denominator))
    total = total +  sign/denominator
    sign = sign * -1

print("\nThe total is:") 
print(total*4)
print(math.pi)
"""
sign = 1
for _ in range(6):
    sign = sign * -1
    print(sign)
"""
