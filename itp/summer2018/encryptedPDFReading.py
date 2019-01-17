import PyPDF2

pdfFile = open('encrypted.pdf', 'rb')
pdfReader = PyPDF2.PdfFileReader(pdfFile)
print(pdfReader.isEncrypted)

print(pdfReader.decrypt('rosebud'))
print(pdfReader.isEncrypted)
page = pdfReader.getPage(0)
print(page.extractText())