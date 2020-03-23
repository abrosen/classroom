data = open("madlibs/1.txt",'r')

text = data.readlines()
output = ""
for line in text:
    line = line.split()
    newLine =  ""
    for word in line:
        if word[0] == '[':
            lib = input("Please enter a "+ word + "\t")
            if word[-1] == "]":
                word = lib
            else:
                word = lib + word[-1]

        newLine = newLine + word + " " 

    output = output + newLine + "\n"
print(output)
