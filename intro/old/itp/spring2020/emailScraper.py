import re

text = open("templeDir.html",'r')
phoneRegex = re.compile(r"\d\d\d-\d{3}-\d{4}")
emailRegex = re.compile(r"mailto:([1-9A-z.]+@temple\.edu)")


phoneNums = []
emails = []
for line in text:
    line = line.strip()
    results  = phoneRegex.findall(line)
    if len(results):
        phoneNums = phoneNums + results
    results  = emailRegex.findall(line)
    if len(results):
        print(results)
        emails = emails + results 
print(phoneNums)
print(emails)