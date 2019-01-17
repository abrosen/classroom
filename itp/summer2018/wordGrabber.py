import docx

def wordGrabber(filename):
    doc = docx.Document(filename)
    text = []
    for paragraph in doc.paragraphs:
        text.append(paragraph.text)
    return '\n'.join(text)


print(wordGrabber("demo.docx"))