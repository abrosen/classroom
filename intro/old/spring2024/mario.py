height =  int(input("Please enter the height: "))
# ensure the height is valid
# this is done by reasking if the height is not valid
# valid is between 1 and 8 inclusive
while not 1 <= height <= 8 :
    height =  int(input("Please enter the height: "))
print(height)
# do the mario stairs

#       #
#      ##
#     ###
#    ####
#   #####
for row in range(height):
    print("#"*(row+1))





    
