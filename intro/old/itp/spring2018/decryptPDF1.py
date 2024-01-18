import PyPDF2

reader = PyPDF2.PdfFileReader(open("encrypted.pdf","rb"))
if reader.decrypt("rosebud"):
    print("We cracked the code")
    page = reader.getPage(0)
    print(page.extractText())
    print(reader.isEncrypted)

else:
    print("Your hacker-foo is weak")



