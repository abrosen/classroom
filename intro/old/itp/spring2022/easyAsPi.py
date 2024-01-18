import math

print("target:\t", math.pi/4)
#print(math.e)


total = 0
iterations = 100000000
sign = 1
# 1 - 2 + 3 - 4 + 5...
#print("i","1+2i", "sign", "sign*value",sep='\t')
for i in range(iterations):
    value = 1/(1 + 2*i)
    #print(i,value, sign, sign*value,sep='\t')
    total = total + sign*value
    sign = -1 * sign
print("value:\t",total)
