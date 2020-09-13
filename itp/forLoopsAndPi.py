piO4 = 0

TRIALS = 10000000

sign = 1

for i in range(TRIALS):
    denominator =  1 + 2*i
    piO4 +=  sign * 1 /denominator
    sign = sign * -1


print(piO4*4)