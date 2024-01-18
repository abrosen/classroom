#https://www.gpb.org/irasshai/japanese1/lesson2
#http://www.gpb.org/files/pdfs/irasshai/1L2.pdf

import requests




baseURL = "http://www.gpb.org/files/pdfs/irasshai/"
for i in range(1,74):
    targetURL = baseURL + "1L" + str(i) + ".pdf"
    res = requests.get(targetURL)
    res.raise_for_status()
    if i < 10:
        targetFile = open("saved/00"+ str(i)+".pdf", "wb")
    else:
        targetFile = open("saved/0"+ str(i)+".pdf", "wb")

    for chunk in res.iter_content(100000):
        targetFile.write(chunk)
    targetFile.close()
    print(targetURL)
    
for i in range(1,63):
    targetURL = baseURL + "2L" + str(i) + ".pdf"
    res = requests.get(targetURL)
    res.raise_for_status()
    if i + 73 < 100:
        targetFile = open("saved/0"+ str(i+73)+".pdf", "wb")
    else:
        targetFile = open("saved/"+ str(i+73)+".pdf", "wb")
    for chunk in res.iter_content(100000):
        targetFile.write(chunk)
    targetFile.close()
    print(targetURL)

"""
res = requests.get('https://automatetheboringstuff.com/files/rj.txt')
res.raise_for_status()
target = open("saved/rj.txt","wb")
for chunk in res.iter_content(100000):
    target.write(chunk)

target.close()
"""
