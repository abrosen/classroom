import image

win = image.ImageWin(640, 480, "Image Processing")

myPic =  image.EmptyImage(100,100)
for x in range(myPic.getWidth()):
	for y in range(myPic.getHeight()):
		myPic.setPixel(x,y, image.Pixel(200,255,0))



myPic.draw(win)
win.exit_on_click()
