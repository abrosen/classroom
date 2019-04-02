import re

# 1. Write a regex to match temple emails
# eg tug85861@temple.edu (my email address)


# 3. match a us formated date
# mm/dd/yyyy
# mm-dd-yyyy
# 03-02-2019
# 03/02/2019
# 3/2/2019
# 3/2/19
# ( | )
target = """ 
andrew.rosen@temple.edu
aa@temple.edu
ana@temple.edu
anna@temple.edu
a-n@temple.edu
andrew.Is.Not_The-1.3.3.7.est@temple.edu
tug85861@temple.edu and 
tuf95861@temple.edu
tux85871@temple.edu
ttf85871@temple.edu  <-- should not match
-tug85261@temple.edu  <-- should not match
nigerian.scammer@419.com <-- should not match
"""
regexString = r"[a-z0-9][a-z0-9_\-.]*[a-z0-9]" # put regex here
suffix = r"@temple\.edu\b"
emailRegex = re.compile(r"\b"+regexString+suffix, re.I)
matches =  emailRegex.findall(target)
print(matches)

