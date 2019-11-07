import image


pika = image.Image("pikachu.jpg")

win = image.ImageWin(pika.getWidth(), pika.getHeight(), "shock")


pika.draw(win)


for x in range(pika.getWidth()):
	for y in range(pika.getHeight()):
		orig = pika.getPixel(x,y)
		pika.setPixel(x,y,image.Pixel(255- orig.getRed(),255- orig.getGreen(),255- orig.getBlue()))
	pika.draw(win)




win.exit_on_click()
