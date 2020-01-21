import re
text = "Hello, my cell is (770) 555-1234"

phoneNumRegex = re.compile(r'(\(\d\d\d\)) (\d\d\d-\d\d\d\d)')
match  =  phoneNumRegex.search(text)


print(match)
print(match.group(0))
print(match.group(1))
print(match.group(2))
print(match.group())



