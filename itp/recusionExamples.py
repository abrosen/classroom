import random
"""
7! = 7*(6*5*4*3*2*1) = 7 * 6! = 7 *720 = 4900 + 140
6! = 6*5*4*3*2*1 = 6 * 5!  = 6 * 120  = 720
5! = 120

n! = n * (n-1)!  = n * (n-1) * (n-2)!

1. Recursive case
n! = n*(n-1)!
2. Base case(s)
1! = 1 , 0! = 1
3. Recursive cases move toward the base case

"""


def factorial(n):
    if n == 0:
        return 1
    else:
        return n * factorial(n-1)


# 1 1 2 3 5 8 13 21 34 55 
# f_n = f_(n-1) + f_(n-2) if n >2
#     = 1                    otherwise

def fib(n):
    fib_lookup = {}
    return fib_recursive(n,fib_lookup)


def fib_recursive(n,fib_lookup):
    if n <= 2:
        return 1
    else:
        if n - 1 not in fib_lookup:
            fib_lookup[n-1] = fib_recursive(n-1,fib_lookup)
        if n - 2 not in fib_lookup:
            fib_lookup[n-2] = fib_recursive(n-2,fib_lookup)
        return fib_lookup[n-1] +fib_lookup[n-2]

print(fib(60))



# board is the board
# col is the current col we are trying to put a queen on
def solve(board, col):
    if col >= 8:
        return True
    for row in range(0,8):
        if isValid(board,row,col):
            board[row][col] = 1
            if solve(board, col + 1)  == True:
                return True
            board[row][col] = 0
    return False 

def isValid(board,row,col):
    return isRowValid(board,row,col) and isUpLeftValid(board,row,col) and isDownLeftValid(board,row,col)

#####1###

def isRowValid(board,row,col):
    for i in range(0, col):
        if board[row][i]  == 1:
            return False 

    return True

# row - i  >= 0    , i must stay below (row + 1)
# col + i  < 8,  i must stay below  8 -(col + 1) 

# for(int i =0; row - i >= 0 && col + i < 8;i++)

def isUpLeftValid(board,row,col):
    i = 0
    while row - i >=0 and col-i >=0:
        if board[row-i][col-i]  == 1:
            return False 
        i = i+1
    return True

def isDownLeftValid(board,row,col):
    i = 0
    while row + i < 8 and col-i >=0:
        if board[row+i][col-i]  == 1:
            return False 
        i = i+1
    return True



def solveSudoku(board,row,col):
    if col >= 9:
        row = row+1
        col = 0
    if row >= 9:
        return True

    if board[row][col]:
        return solveSudoku(board,row,col +1)
    
    for num in range(1,10):
        if isValidSudoku(board,row,col,num):
            board[row][col] = num
            if solveSudoku(board, row, col+1):
                return True
            board[row][col] = 0
    return False



board = [[0]*8,[0]*8,[0]*8,[0]*8,[0]*8,[0]*8,[0]*8,[0]*8]
solve(board,0)
for row in board:
    print(row)



"""
queens = random.sample(range(0,64),8)
print(queens)
for queen in queens:
    board[queen//8][queen%8] = 1

for row in board:
    print(row)

print(64*63*62*61*60*59*58*57)





0  1  2  3  4  5  6  7     <- 0 
8  9 10 11 12 13 14 15     <- 1
16                         <- 2

"""

#print(factorial(500))