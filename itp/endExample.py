print("Hello \\ \"Ty\"",end="")
print("World")



"""
####::####
###::::###
##::::::##
#::::::::#
::::::::::





line    height      :'s   formula
0       5           2     = 2 + 2*line
1       5           4     = 2 + 2*line     
2       5           6     = 
3       5           8     = 
4       5           10    = 


line    height      left #'s   formula
0       5           4           = 4 - line
1       5           3           
2       5           2
3       5           1
4       5           0




"""
for line in range(5):
    for x in range(4-line):
        print("#",end="")
    for x in range(2 + 2*line):
        print(":",end="")
    for x in range(4-line):
        print("!",end="")    
    print()
    
