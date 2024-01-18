import PyPDF2

file1 = open('meetingminutes.pdf','rb')
file2 = open('meetingminutes2.pdf','rb')
reader1 = PyPDF2.PdfFileReader(file1)
reader2 = PyPDF2.PdfFileReader(file2)
writer = PyPDF2.PdfFileWriter()

for pageNum in range(reader1.numPages):
    page = reader1.getPage(pageNum)
    page.rotateClockwise(90)
    writer.addPage(page)

writer.addBlankPage()

for pageNum in range(reader2.numPages):
    page = reader2.getPage(pageNum)
    writer.addPage(page)

output = open('out.pdf', 'wb')
writer.write(output)
output.close()
file1.close()
file2.close()