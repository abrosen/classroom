import re
text = open("dracula.txt", 'r')
text = text.read()

replaced = re.sub("\W?[Cc]ount\W"," Count (ah, ah, ah) ",text)

output = open("countSesame.txt",'w')
output.write(replaced)
output.close()
