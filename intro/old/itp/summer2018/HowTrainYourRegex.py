import re

def phoneNumberTest():
    regex = re.compile(r'(\(\d\d\d\))-(\d\d\d-\d\d\d\d)')
    mo = regex.search("""This is my fake phone number, 123-456-7890. Got it?""")
    print("Phone number:", mo.group())
    print("Area code", mo.group(1))
    print(mo.groups())

def greedyDemo(text):
    greedyHaRegex = re.compile(r'(Ha){3,5}?')
    mo1 = greedyHaRegex.search(text)
    print(mo1.groups())

def batman(text):
    regex = re.compile(r'batman|batphone|batmobile|batshark repellant')
    batwords = regex.findall(text)
    return batwords

def isJapaneseOrAmericanNumber(text):
    regex = re.compile(r'(\d{3}-\d{3}-\d{4})|(\d{3}-\d{4}-\d{4})')
    mo = regex.search(text)
    print(mo.groups())



greedyDemo("And HaHaHaHaHaHaHaHaHa")
#print(batman("batman left the batphone in the batmobile"))
#numberRegex= re.compile(r"\d\d\d-\d\d\d-\d\d\d\d|\d\d-\d\d\d\d-\d\d\d\d")
#foo =numberRegex.match("55-5555-5555")
#print(foo.group())