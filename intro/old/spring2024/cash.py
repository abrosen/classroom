"""
1
-2.5
81418798.74232

8.72
eight.72

+1234567890.

131-131.03
9......1
141-
+341-31
98.87.76

3.5-
4+5
+-11111
"""
def isFloat(text):
    validChars = "1234567890.-+"
    # check every char in text
    # if the char is invalid
    # return false
    for char in text:
        if char not in validChars:
            return False
    if text.count(".") > 1 or text.count("-") > 1 or text.count("+") > 1:
        return False
    if text.count("+") == 1 and text[0] != "+":
        return False
    if text.count("-") == 1 and text[0] != "-":
        return False
    return True


#place the following somewhere useful
# and add a prompt

text = input() 
while not isFloat(text):
    text = input()




