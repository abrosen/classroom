#word = "why hello there"
#for letter in word:
#    print(letter)


# range(x) = [0,x)
# range(start, stop) = [start,stop)
# range(start, stop, step) = [start,stop) by step
#for i in range(100,0,-1):
#    print(i)

sign = 1
#for _ in range(10):
#    print(sign)
#    sign = sign * -1


limit = 50000000
total = 0
sign = 1

for i in range(1 , limit + 1, 2):
    i =  1 / (sign * i)
    #print(total, "+" , i,"=" ,total+i)
    #print(4*total)
    total = total + i
    sign = sign * -1
print(4*total)
