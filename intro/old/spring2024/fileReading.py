"""C:/Users/profa/Desktop/fileReading.py"""
"""/~/Desktop/fileReading.py"""
theFile = open("dracula.txt",encoding="utf8")

countTheCount = 0
for line in theFile:
    line = line.strip()
    line = line.lower()
    if "dracula" in line:
        countTheCount += line.count("dracula")

print(countTheCount)
""" first way to read
text = theFile.read()
print(text)
"""

#second
"""
lines = theFile.readlines()
for line in lines[:100]:
    print(line.strip())
"""

