import re
from typing import List

words: List[str] = open("words.txt").readlines()
double_vowel = re.compile(r"AA|EE|II|OO|UU", re.IGNORECASE)

for word in words:
    if double_vowel.match(word):
        print(word.strip())

print(len(words))
