import re

target = "Mark Hamill is the best Joker. His HaHaHaHaHa is amazing."

regex = re.compile("(Ha){2,5}?")
match = regex.search(target)
if match:
    print(match.group())
else:
    print("The Joker got away.")
