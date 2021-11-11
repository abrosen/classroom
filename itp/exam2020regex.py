"""
Write a script or function that, given a filename, reads the contents of the file and creates a new file with all the TU email addresses removed or censored.
A TU email is an email like mine: tug85861@temple.edu

TU emails start with the two letter t and u, are followed by another letter, then five digits, then finally @temple.edu

For this input file, a correct program would yield this output.
Grading:

    5 points for reading the file
    10 points for correctly identifying TU emails (and only TU emails)
    5 points for successfully writing a new file
    10 points for removing or redacting the TU emails for the new file.
"""


import re

data = open("q1.txt",'r')
text =  data.read()

pattern = r"tu[a-z]\d{5}@temple\.edu"

redactedText = re.sub(pattern, "REDACTED", text)

output = open("outputq1.txt","w")
output.write(redactedText)
output.close()