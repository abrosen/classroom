import re

data = open("ssn.txt",'r')

ssnRegex = re.compile("\d{3}-?\d{2}-?\d{4}")
outFile = open("ssnClean.txt",'w')


for line in data:
    line = ssnRegex.sub("REDACTED",line)
    outFile.write(line)