
import PyPDF2, os

pdfFiles = os.listdir("saved")
pdfFiles = sorted(pdfFiles)
pdfWriter = PyPDF2.PdfFileWriter()

for target in pdfFiles:
    target = open("saved/"+target, "rb")
    pdf = PyPDF2.PdfFileReader(target)
    
    for pageNum in range(pdf.numPages):
        page = pdf.getPage(pageNum)
        pdfWriter.addPage(page)

outTarget = open("saved/all.pdf","wb")
pdfWriter.write(outTarget)
outTarget.close()
    
print(pdfFiles)
