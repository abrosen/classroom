import PyPDF2

file1 = open('meetingminutes.pdf','rb')
file2 = open('watermark.pdf','rb')

pdfReader = PyPDF2.PdfFileReader(file1)
watermarkReader = PyPDF2.PdfFileReader(file2)
writer = PyPDF2.PdfFileWriter()

regularPage = pdfReader.getPage(0)
watermarkPage = watermarkReader.getPage(0)
regularPage.mergePage(watermarkPage)

writer.addPage(regularPage)

output = open("out.pdf", 'wb')
writer.write(output)