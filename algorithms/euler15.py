def pathsRec(row,col):
    if row == 0 or col == 0:
        return 1
    return pathsRec(row-1,col) + pathsRec(row, col-1)

print(pathsRec(20,20))


def paths(n):
    grid = []
    for _ in range(n+1):
        grid.append([0]*(n+1))
    grid[0][0] = 1
    for c in range(0,n+1):
        grid[0][c] = 1
    for r in range(0,n+1):
        grid[r][0] = 1
    for r in range(1,n+1):
        for c in range(1,n+1):
            grid[r][c] = grid[r-1][c] + grid[r][c-1]
    for row in grid:
        print(row)
    return grid[-1][-1]

print(paths(20))