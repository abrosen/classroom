import image

img = image.Image("pika.png")
win = image.ImageWin(img.getWidth(), img.getHeight())
img.draw(win)


for y in range(img.getHeight()):
    for x in range(img.getWidth()):
        p = img.getPixel(x,y)
        r =  255 - p.getRed()
        g =  255 - p.getGreen()
        b =  255 - p.getBlue()

        newPixel = image.Pixel(r, g, b)

        img.setPixel(x,y,newPixel)
    img.draw(win)    



win.exitonclick()

"""for i in range(5):
    for j in range(3):
        print(i,j)
    print()


listOfWords = ["hello", "world", "have", "a", "nice", "day"]
for word in listOfWords:
    for letter in word:
        print(letter)
"""