import requests

baseURL = "http://www.gpb.org/files/pdfs/irasshai/"
for lesson in range(1,74):
	targetURL = baseURL + "1L" + str(lesson) +".pdf"
	response = requests.get(targetURL)
	if lesson < 10:
		targetFile = open("lessons/0"+str(lesson)+".pdf","wb")
	else:
		targetFile = open("lessons/"+str(lesson)+".pdf","wb")
	for piece in response.iter_content(100000):
		targetFile.write(piece)
	targetFile.close()
	
	print(targetURL)
