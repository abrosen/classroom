import re

text = "The Batplane delivers a fearsome kick to the Joker!"

batRegex = re.compile(r"Bat((wo)?man|mobile|shark repellent|plane)")
match = batRegex.search(text)

print(match.group())
