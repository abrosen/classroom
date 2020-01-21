import re

text = open("ssn.txt",'r')
output = open("ssnRemoved.txt", 'w')
ssnRegex = re.compile(r"\d{3}-\d{2}-\d{4}")

for line in text:
	newline =  ssnRegex.sub("REDACTED",line)
	output.write(newline)
output.close()
