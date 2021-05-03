class Player:

    def __init__(self, color):
        self.color = color
        self.pieces = []
        self.pieces.append(Piece(color,3))
        self.pieces.append(Piece(color,3))
        self.pieces.append(Piece(color,2))
        self.pieces.append(Piece(color,2))
        self.pieces.append(Piece(color,1))
        self.pieces.append(Piece(color,1))
        
    def __str__(self) -> str:
        output = str(self.color) + " Player has "
        for index,piece in enumerate(self.pieces):
            output = output + str(index)+": " +str(piece) + ", "
        return output[:-2] +"]"
        #output = str(self.color) + " Player has ["
        #for piece in self.pieces:
        #    output = output + str(piece) + ", "
        #return output[:-2] +"]"

class Piece:
    def __init__(self,color,size):
        self.color= color # blue or orange
        self.size = size # size is int, either 1 2 or 3
        self.eaten = None


    def can_gobble(self, other):
        if self.size > other.size:
            return True
        else:
            return False

    def gobble(self, other):
        self.eaten =  other
    


    def __str__(self):
        return str(self.color).lower()[0]+str(self.size)
        #return str(self.color) + " " + str(self.size) 

class Board:

    def __init__(self):
        self.grid = [[None,None,None],[None,None,None],[None,None,None]]

    # player places a piece
    def place(self, piece, row, col):
        piece.gobble(self.grid[row][col])   
        self.grid[row][col] = piece
        


    # player moves  a piece
    def move(self, piece, oldRow, oldCol, row, col):
        self.grid[oldRow][oldCol] = piece.eaten
        self.place(piece, row, col)


    # check for winner
    def is_winner(self):
        return self.winner_in_rows() or self.winner_in_cols() or self.winner_in_diagonal()

    def winner_in_rows(self):
        for row in self.grid:
            if None not in row and row[0].color == row[1].color == row[2].color:
                return True
        return False
# col      0   1   2
# row 0 #               
# row 1 #       
# row 2 #  
    def winner_in_cols(self):
        for colNum in range(3):
            if self.grid[0][colNum] != None and self.grid[1][colNum] != None and self.grid[2][colNum] != None:
                if self.grid[0][colNum].color == self.grid[1][colNum] == self.grid[2][colNum]:
                    return True
        return False
    
    def winner_in_diagonal(self):
        if self.grid[0][0] != None and self.grid[1][1] != None and self.grid[2][2] != None:
           if self.grid[0][0].color == self.grid[1][1].color == self.grid[2][2].color:
               return True
        if self.grid[0][2] != None and self.grid[1][1] != None and self.grid[2][0] != None:
           if self.grid[0][2].color == self.grid[1][1].color == self.grid[2][0].color:
               return True

        return False

    # check if proposed move is valid 
    def is_valid_place(self, piece, row,col):
        if row < 0  or row > 2 :
            return False
        if col <0  or col > 2:
            return False

        if self.grid[row][col] == None:
            return True
        else:
            return piece.can_gobble(self.grid[row][col])
    
    # print board status
    def printBoard(self):
        for row in self.grid:
            output = "" 
            for piece in row:
                output += str(piece) + "\t"
            print(output)

    def getInput(self, player):
        choice = ""
        if len(player.pieces) == 0:
            choice == "move"
        while "m" not in choice and "p" not in choice:
            choice = input("Please whether you want to place or move")
        
        # place 
        if "p" in choice:
            index = -54892789
            while not 0 <= index < len(player.pieces):
                print(player)
                index = int(input("Please enter the number of the piece you want to play"))
            
            piece = player.pieces[index]
            player.pieces.remove(piece)
            row = 70
            col = 100
            while not self.is_valid_place(piece,row,col):
                row = int(input("Enter a row: "))
                col = int(input("Enter a col: "))
            self.place(piece,row,col)
        else:
            pass

o = Player("Orange")
b = Player("Blue")

board = Board()
board.getInput(o)
board.printBoard()
board.getInput(b)
board.printBoard()
board.getInput(o)
board.printBoard()