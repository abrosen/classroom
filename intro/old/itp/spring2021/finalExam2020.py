"""
Write a script or function that, given a filename, reads the contents of the file and creates a new file with all the TU email addresses removed or censored.

A TU email is an email like mine: tug85861@temple.edu


TU emails start with the two letters t and u, are followed by another letter, then five digits, then finally @temple.edu


For this input file, a correct program would yield this output.


Grading:

    5 points for reading the file
    10 points for correctly identifying TU emails (and only TU emails)
    5 points for successfully writing a new file
    10 points for removing or redacting the TU emails for the new file.
"""
import re
def tumail_remover(filename):
    the_file = open(filename,'r')
    text =  the_file.read()

    tuRegex = r"tu[a-z]\d{5}@temple\.edu"
    replaced = re.sub(tuRegex, "[REDACTED]", text)

    output = open('output1.txt','w')
    output.write(replaced)
    output.close()

tumail_remover("input1.txt")