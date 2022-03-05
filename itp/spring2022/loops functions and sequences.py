import turtle
#text = "hello there, general kenobi!"
#num = 13

#lowTemps = [2,4,-8,-7,-2,-7,-2,3,4,-2]

#for char in text:
#    print(char)

#total = 0
#for temp in lowTemps:
#    total = total + temp
#print(total)
#print(len(lowTemps))
#print(total/len(lowTemps))
#print(len(text))


def drawSquare(theTurtle,size):
    for _ in range(4):
        theTurtle.forward(size)
        theTurtle.right(90)


bob = turtle.Turtle()
bob.speed(10)
bob.pensize(7)

# 0 1 2 3 4 5 6 7 8 9
for i in range(10):
    bob.color(0+i*.1,0,1-i*.1)
    drawSquare(bob,50)
    
    bob.forward(60)
colors = ["red","green","blue","pink"]

#for _ in range(20):
#    for theColor in colors:
#        bob.color(theColor)
#        bob.forward(200)
#        bob.right(87)

#def sayHi():
#    print("Hi!")

#def shoutIt(text):
#    SHOUTY_TEXT = text.upper()
#    print(SHOUTY_TEXT)

#def add(a,b):
#    print(a,b,a+b)

#sayHi()
#shoutIt("hello how are you doing today?")
#add(4,7)







