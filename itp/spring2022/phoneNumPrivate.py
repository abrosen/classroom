import re

def redactPhone(filenameIn,filenameOut):
    data = open(filenameIn,"r")
    text = data.read()
    print(text)


    # do the redacting
    phoneRegex = r"(\(\d{3}\)) \d{3}-\d{4}|(\d{3})-\d{3}-\d{4}"
    #print(re.findall(phoneRegex,text))
    output = re.sub(phoneRegex,r"\1*****",text)

    fileWriter = open(filenameOut, "w")
    fileWriter.write(output)
    fileWriter.close()
    

redactPhone("phone.txt", "out.txt")
