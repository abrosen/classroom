import re

data = open("email_test.txt","r")
output = open("email_output.txt", "w")
pattern ="tu[a-z]\d{5}@temple\.edu"
for line in data:
    line = re.sub(pattern, "[REDACTED]", line)
    output.write(line)

data.close()
output.close()

