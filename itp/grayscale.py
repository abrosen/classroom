import image

pika =  image.Image("pikachu.jpg")
win = image.ImageWin(pika.getWidth(), pika.getHeight(), "greyscale shock")

pika.draw(win)
for x in range(pika.getWidth()):
	for y in range(pika.getHeight()):
		orig = pika.getPixel(x,y)
		r = orig.getRed()
		g = orig.getGreen()
		b = orig.getBlue()
		
		grey = (r+g+b)//3
		pika.setPixel(x,y,image.Pixel(g,g,g))
	pika.draw(win)
