import re

text = """Hello Mr. Hackerman. 
My social security number is 123-45-6789.  Please take care of it.  
You can reach me at my phone number: 123-555-1231.
Thank you.
"""
print(text)



pattern = re.compile(r"(\d\d\d)-(\d\d\d)-(\d\d\d\d)")
#print(pattern.search(text))
#print(re.search(pattern,text))
match = pattern.search(text)
print(match.group())
print(match.group(0))
print(match.group(1))
print(match.group(2))
print(match.groups())