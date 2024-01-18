#.
#..
#...
#....
#.....
for x in range(1,6): # 1 2 3 4 5
    for y in range(x): # 0 1
        print(".", end='')
    print()


for x in range(1,6): # 1 2 3 4 5
    print("*"*x)


s = "hello, world!"
for globnox in s:
    print(globnox)

book = open("complete.txt",'r',encoding="utf8")
print(book)
totalChars = 0
for line in book:
    #print(len(line))
    numCharsInLine = len(line)
    totalChars += numCharsInLine
    #print(len(line))
print(totalChars)
