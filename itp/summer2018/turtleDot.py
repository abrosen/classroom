import turtle 

"""
This program creates a
sorta stitch like pattern
"""

seurat = turtle.Turtle()
seurat.shape("turtle")

dot_distance = 50
width = 5
height = 7

seurat.penup()

for y in range(height):
    for i in range(width):
        seurat.stamp()
        seurat.forward(dot_distance)

    offset = -45
    if y %2 == 0:
        offset = 45
    seurat.backward(dot_distance * width)
    seurat.right(90+offset)
    seurat.forward(dot_distance)
    seurat.left(90+ offset)
print(seurat.pos())
    
turtle.done()
