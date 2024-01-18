import re

data = open("ssn.txt","r")
text = data.read()

redacted = re.sub("\d{3}-\d{2}-\d{4}","REDACTED",text)

output = open("ssn_output.txt","w")
output.write(redacted)
output.close()

# 5 points for reading the data
# 5 points for writing the data to a new file
# 5 points for finding all the social security numbers
# 5 points for replacing all social security numbers with 'REDACTED'