import re

def superNames(filename):
    superRegex = re.compile(r"([A-Za-z]*)(boy|girl|man|woman)")
    text = open(filename,'r').read()

    words = superRegex.findall(text)
    output = []
    for word in words:
        output.append("".join(word))
    return output

# \b0*1*2*3*4*5*6*7*8*9*\b


# ’Andrew Rosen’,12 -> ar12 
# ’Alan Turing’, 5 -> at5 
# ’Andrew Benjamin Rosen’, 3 -> abr3 
# ’Andrew Benjamin Rosen’, 104 -> abr104 
def makeUsername(name,n):
    #nameRegex = re.compile(r"(\w)\w+")
    #initials = nameRegex.findall(name)
    
    name = name.split()
    initials= []
    for part in name:
        initials.append(part[0])
    output = ""
    for letter in initials:
        output += letter.lower()
    return output + str(n)


print(makeUsername("Andrew Benjamin Rosen",832))
"""
(Alice|Bob|Carol) (eats|throws|pets) (apples|cats|baseballs)\.

compile with re.compile(regex,"I") to make case insensitive
"""

def expunge(filename):
    text = open(filename,'r')
    output = open("phoneResults.txt",'w')
    phoneRegex = re.compile("\(\d{3}\) \d{3}-\d{4}")
    for line in text:
        newLine = phoneRegex.sub("PRIVATE", line)
        print(newLine)
        output.write(newLine)


expunge("phoneNumberTest.txt")


"""
Create a regex that matches strings following the rules below
* The string is length 6
* The string only uses the characters 'a' and 'b'
* The string must end with aa


{4}aa
"""

 

 

