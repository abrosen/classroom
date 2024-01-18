import re

batRegex = re.compile(r'Bat(wo)+man')

text = "I am darkness, I am the night, I am <dramatic pause> Batwowoman!"
match = batRegex.search(text)
if match:
    print(match.group())
else:
    print("404 not found")

    
