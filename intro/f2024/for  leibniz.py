total = 0
sign = 1
# 1+2+3+4+5..+10
# 1+3+5+7...
# 1/1+1/3+1/5+1/7




for denom in range(1,100000000,2):
    total = total + sign/denom
    #print("denom is", denom)
    #print("fraction is",sign,"/",denom)
    #print("total is",total)
    sign = sign * -1
print(total*4)

#for num in range(10):
#    print("num is now",num)
#    total = total + num
#    print("total is now", total)
#    print("__________")
#word = "hello world. hello class.  how are you today?"
#for letter in word:
#    print(letter)
#print(total)
