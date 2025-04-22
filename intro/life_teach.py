


def tick(grid):
	nextGrid = []
	n = len(grid)
	for _ in range(n):
		row = ["_"] * n
		nextGrid.append(row)
	for i in range(len(grid)):
		for j in range(len(grid[i])):
			nextGrid[i][j] = getNextCell(grid,i,j)			
	
	return nextGrid
	
def getNextCell(grid,i,j):
	count = 0
	if i > 0 and j > 0 and grid[i-1][j-1] == "X":
		count+=1
	if i > 0 and grid[i-1][j] == "X":
		count+=1
	if i > 0 and j < len(grid) - 1 and grid[i-1][j+1] == "X":
		count+=1
	if j > 0 and grid[i][j-1] == "X":
		count+=1
	if  j < len(grid) -1 and grid[i][j+1] == "X":
		count+=1
	if i < len(grid) -1 and j > 0 and grid[i+1][j-1] == "X":
		count+=1
	if i < len(grid) -1 and grid[i+1][j] == "X":
		count+=1
	if i < len(grid) -1 and j < len(grid) -1 and grid[i+1][j+1] == "X":
		count+=1
	if grid[i][j] == "X":
		if count ==2 or count == 3:
			return "X"
		else:
			return "_"
	else:
		if count == 3:
			return "X"
		else:
			return "_" 
		
		
def printGrid(grid):
	for row in grid:
		print(row)



def main():
	n = 10
	grid = []




	for _ in range(n):
		row = ["_"] * n
		grid.append(row)
	grid[0][0] = "X"
	grid[1][0] = "X"
	grid[0][1] = "X"
	grid[1][1] = "X"


	"""
	  345
	4  X 
	5   X
	6 XXX

	"""
	grid[4][4] = "X"
	grid[5][5] = "X"
	grid[6][3] = "X"
	grid[6][4] = "X"
	grid[6][5] = "X"
	
	printGrid(grid)
	while(True):
		input()
		nextGrid = tick(grid)
		grid = nextGrid
		printGrid(grid)
	
	
main()
