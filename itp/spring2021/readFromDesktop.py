import os
print(os.path.expanduser("~"))

text = open("C:\\Users\\andrew\\Desktop\\shake.txt",'r',encoding="utf8")

print(text.read()[:1000])