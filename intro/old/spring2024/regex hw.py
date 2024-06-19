import re
data = open("words.txt",'r')
pattern = "\w*cat\w*|\w*dog\w*"
text =  data.read()
answer = re.findall(pattern, text)
print(answer)
print(len(answer))
