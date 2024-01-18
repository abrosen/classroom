import requests

"""
target = baseURL +"1_0.pdf"
response = requests.get(target)
print(response)

savedFile = open("saved/01.pdf","wb")
for chunk in response.iter_content(100000):
    savedFile.write(chunk)
"""
baseURL = "https://www.gpb.org/sites/default/files/2020-04/1l"

for fileNum in range(1,74): 
    target = baseURL  + str(fileNum) + ".pdf"
    if fileNum == 1:
        target = baseURL  + str(fileNum) + "_0.pdf"

    response = requests.get(target)

    savedFileName = ""
    if fileNum <= 9:
        savedFileName = "saved/0" + str(fileNum) + ".pdf"
    else:    
        savedFileName = "saved/" + str(fileNum) + ".pdf"
    
    
    savedFile =  open(savedFileName,'wb')
    for chunk in response.iter_content(10000):
        savedFile.write(chunk)
    savedFile.close()
    print("saved", savedFileName)