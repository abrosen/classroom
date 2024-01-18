import re

target = """My phone number is 325-555-7062. My office number 123-555-2131.
The White House's number is 202-456-1111.
"""

regex = re.compile("\d{3}-\d{3}-\d{4}")
results = regex.findall(target)
for result in results:
    print(result)



xmasRegex = re.compile(r'[^aeiou]')
print(xmasRegex.findall('1 drummers, 11 pipers, 10 lords, 9 ladies, 8 maids, 7 swans, 6 geese, 5 rings, 4 birds, 3 hens, 2 doves, 1 partridge, 00000\tpieces of coal'))


atRegex = re.compile(r'.at', re.I, re.DOTALL)
results = atRegex.findall('The cat in the hat SAT on the flat mat.')
for result in results:
    print(result)

"""
nameRegex = re.compile(r'First Name: (.*?) Last Name: (.*?)')
mo = nameRegex.search('First Name: Andrew Last Name: wait what am I putting here.  Oh crud they might find out I don\t know any of this stuff Last Name: Rosen')
print(mo.groups())
"""