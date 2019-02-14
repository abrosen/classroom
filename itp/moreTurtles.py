import turtle

def drawSquare(todd):
    for x in range(4):
        todd.forward(100)
        todd.rt(90)
        
def drawSquareSpiral(bob):
    bob.speed(1)
    for x in range(50):
        bob.forward(100+ x*10)
        bob.rt(90)
        
def drawTriangleSpiral(bob):
    for x in range(50):
        bob.forward(100+ x*10)
        bob.rt(120)
    
        
def drawRow(bob,numStamps,distance):
    for x in range(numStamps):
        bob.stamp()
        bob.penup()
        bob.forward(distance)
        
def drawGrid(bob,numRows,stampsPerRow, stampDist, rowDist):
    bob.speed(1)
    bob.penup()
    for rows in range(numRows):
        drawRow(bob,stampsPerRow,stampDist)
        bob.right(90)
        bob.forward(rowDist)
        bob.right(90)
        bob.forward(stampDist*stampsPerRow)
        bob.right(180)
        
def drawJaggedGrid(bob,numRows,stampsPerRow, stampDist, rowDist):
    bob.speed(10)
    for row in range(numRows):
        bob.color(row*1/numRows,0,0)
        drawRow(bob,stampsPerRow,stampDist)
        bob.right(90)
        bob.forward(rowDist)
        bob.right(90)
        if row % 2 == 0:
            bob.forward(stampDist*stampsPerRow +10)
        else:
            bob.forward(stampDist*stampsPerRow -10)
        bob.right(180)
        
def twoSpiral(bob):
    bob.pencolor("blue")
    for i in range(50):
        bob.forward(100)
        bob.left(123)
    
    bob.pencolor("red")
    for i in range(50):
        bob.forward(200)
        bob.left(123)
                
                
def ninja(bob):
    bob.speed(10)
    for i in range(180):
        bob.forward(100)
        bob.rt(30)
        bob.forward(20)
        bob.lt(60)
        bob.forward(50)
        bob.rt(30)

        bob.penup()
        bob.goto(0,0)
        bob.pendown()
        
        bob.rt(2)

def main():
    bob = turtle.Turtle()
    bob.shape("turtle")
    
    #bob.goto(-500,500)
    #drawJaggedGrid(bob,20,10,40,40)
    ninja(bob)
    
    turtle.done()

main()
