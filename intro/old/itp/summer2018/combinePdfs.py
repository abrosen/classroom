import PyPDF2, os

fileList = []

for filename in os.listdir('.'):
    if filename.endswith('.pdf'):
        fileList.append(filename)

writer = PyPDF2.PdfFileWriter()
print(fileList)
fileList.sort()

for filename in fileList:
    data = open(filename,'rb')
    pdfReader = PyPDF2.PdfFileReader(data)
    if pdfReader.isEncrypted:
        continue
    for pageNum in range(pdfReader.numPages):
        page = pdfReader.getPage(pageNum)
        writer.addPage(page)
    #data.close()

output = open("../out.pdf","wb")
writer.write(output)
output.close()