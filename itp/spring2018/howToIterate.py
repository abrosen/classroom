#              11            
#    012345678901
s = "hello, world"

for letter  in s:
    print(letter)

i = 0 
while i < len(s):
    print(s[i])
    i = i + 1
    
for i in range(0,len(s)):
    letter = s[i]
    print(i , letter)
    
print("______________")
for index, letter in enumerate(s):
    print(index,letter)
    
