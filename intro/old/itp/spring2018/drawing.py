
"""
    /\
   /::\
  /::::\
 /::::::\
/::::::::\

5 lines


line  height  colons    formula
0       5       0     =  line*2
1       5       2     =  line*2
2       5       4     =  line*2
3       5       6     =  line*2
4       5       8     =  line*2


line  height  spaces    formula
0       5       4     =  height - (line + 1)
1       5       3     =  height - (line + 1)
2       5       2     =  height - (line + 1)
3       5       1     =  height - (line + 1)
4       5       0     =  height - (line + 1)




"""
def drawTriangle(height):
    for line in range(height):
        print(line,end='\t')
        for x in range(height - (line+1)):
            print(" ",end='')
        print("/",end='')
        for x in range(line*2):
            print(":",end='')
        #print(":"*(line*2),end='')
        
        print("\\")

    

drawTriangle(15)
