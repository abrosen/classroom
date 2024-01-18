text =open("instructions.txt",'w')
for i in range(100):
    text.write("f 300\n")
    text.write("r 142\n")
text.close()