import random

num1 = 0
num2 = 0
num3 = 0

TRIALS = 3000000


for _ in range(TRIALS):
    num = random.randint(1,3)
    if num == 1:
        num1 += 1
    elif num == 2:
        num2 += 1
    elif num == 3:
        num3 += 1

print(num1,num2,num3)
