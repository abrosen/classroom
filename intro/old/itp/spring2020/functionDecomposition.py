import turtle

 ##
##

def drawSquare(bob,side):
    for _ in range(4):
        bob.fd(side)
        bob.rt(90)


def drawZeeTetrimo(bob,side):
    drawSquare(bob,side)
    bob.forward(side)
    drawSquare(bob,side)
    bob.lt(90)
    bob.fd(side)
    bob.rt(90)
    drawSquare(bob,side)
    bob.forward(side)
    drawSquare(bob,side)

#[10,20,30,40,50]

def apply(func, lst):
    for index in range(len(lst)):
        val = lst[index]
        val = func(val)
        lst[index] = val

def double(x):
    return 2*x

def square(x):
    return x*x


def giveMe123():
    return 1,2,3

x,y,z = giveMe123()
print(x)
print(y)
print(z)



#myList = [10,20,30,40,50]
#print(double)
#apply(double,myList)
#print(myList)


#bob =  turtle.Turtle()
#drawZeeTetrimo(bob,100)



#turtle.done()