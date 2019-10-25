import re

# /usr/share/dict/american-english future reference
dictionary  = open("/usr/share/dict/american-english",'r')

batRegex =  re.compile(r"(NA )*Bat(wo)+man")
jokerRegex = re.compile(r"(Ha){3,5}?",re.I)
ssnRegex =  re.compile(r"(\d{3})-(\d{2})-(\d{4})")
doubleVowel = re.compile(r"[aeiou]{2}")

target = "hahahaha"

"""
Sure, guy who definately works for the IRS,
you can have my SSN
Mine is 123-45-6789

oh my wife's too?
it's 222-22-2222
"""

"""
count = 0
for word in dictionary:
    word = word.strip()
    match = doubleVowel.search(word)
    if match is not None:
        print(word,match.group())
        count = count +1

print(count)
"""
result =  jokerRegex.search(target)
#result = ssnRegex.sub("[REDACTED]" ,target)
print(result.group())

#sunnyicecreamtreat
