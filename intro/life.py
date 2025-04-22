
def tick(grid):
	nextGrid = []
	n = len(grid) # number of rows, same as num cols bc grid is square
	for _ in range(n):
		row =  ["_"] * n
		nextGrid.append(row)
	for i in range(n):  # i is which row we are on
		for j in range(n): # j is which col we are on
			nextGrid[i][j] = nextCell(grid,i,j)
	return nextGrid

def nextCell(grid,i,j):
	count = 0
	n = len(grid)
	
	
	# do the counting
	if i - 1 >= 0 and j - 1 >= 0 and grid[i-1][j-1] == "X":
		count+=1
	if i - 1 >= 0 and grid[i-1][j] == "X":
		count+=1
	if i - 1 >= 0 and j+1 <= n-1 and grid[i-1][j+1] == "X":
		count+=1
	if j - 1 >= 0 and grid[i][j-1] == "X":
		count+=1
	if j + 1 <= n-1 and grid[i][j+1] == "X":
		count+=1
	if i + 1 <= n-1 and j - 1 >= 0 and grid[i+1][j-1] == "X":
		count+=1
	if i + 1 <= n-1 and grid[i+1][j] == "X":
		count+=1
	if i + 1 <= n-1 and j + 1 <= n-1 and grid[i+1][j+1] == "X":
		count+=1
	
	
	if grid[i][j] == "X":
		if count == 3 or count == 2:
			return "X"
		else:
			return "_"
	else: # else grid[i][j] is dead
		if count == 3:
			return "X"
		else:
			return "_"
	
def printGrid(grid):
	for row in grid:
		print(row)	


def main():
	n = 13	
	grid = []
	for _ in range(n):
		row = ["_"]*n
		grid.append(row)

	grid[1][0] = "X"
	grid[1][1] = "X"
	grid[1][2] = "X"
	

	grid[5][5] = "X" # create glider
	grid[6][6] = "X"
	grid[7][4] = "X"
	grid[7][5] = "X"
	grid[7][6] = "X"
	printGrid(grid)
	while True:
		input()
		nextGrid = tick(grid)
		grid = nextGrid
		printGrid(grid)

main()
