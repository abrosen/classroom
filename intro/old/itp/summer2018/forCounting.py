for x in range(100,0,-3):
    print(str(x) +  "\t"+  str(x**2))


LIMIT = 100
for x in range(0,LIMIT,6):
    print(x)

print("changing steps")
print("--------------")
step = 1
for x in range(0,100,step):
    print(x, step)
    step = step + 1
