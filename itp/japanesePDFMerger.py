import os, PyPDF2

pdfFileNames = os.listdir("saved")
pdfFileNames = sorted(pdfFileNames)

pdfWriter = PyPDF2.PdfFileWriter()

for target in pdfFileNames:
    pdfFile =  open("saved/" +target, "rb")
    pdfReader =  PyPDF2.PdfFileReader(pdfFile)

    for pageNum in range(pdfReader.numPages):
        page = pdfReader.getPage(pageNum)
        pdfWriter.addPage(page)

outputFile = open("saved/megaFile.pdf","wb")
pdfWriter.write(outputFile)
outputFile.close()