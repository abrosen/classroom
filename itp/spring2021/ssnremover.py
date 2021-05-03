import re

theFile = open("ssnTarget.txt",'r')
text = theFile.read()

ssnRegex = r"\d{3}-\d{2}-\d{4}"
replaced = re.sub(ssnRegex, "[REDACTED]", text)

output = open("ssnRedacted.txt" ,'w')
output.write(replaced)
output.close()