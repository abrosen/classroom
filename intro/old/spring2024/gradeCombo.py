import csv
runeHash = {} 
runeEmails = {}

with open('runestone.csv') as runestone:
    rune = csv.reader(runestone)
    rune = list(rune)
    for row in rune[2:]:
        name = row[1].capitalize().strip() +", " + row[0].capitalize().strip()
        runeEmails[row[3]] = name
        runeHash[name] = row[4:] 


with open("output.csv", 'w',newline='') as output:
    writer = csv.writer(output)
    with open('canvas.csv') as canvasFile:
        canvas =  csv.reader(canvasFile)
        for row in canvas:
            name  =  row[0].strip()
            email =  row[3]+"@temple.edu"
            if name in runeHash.keys():
                writer.writerow(row + runeHash[name])
            elif email in runeEmails.keys():
                name =  runeEmails[email]
                writer.writerow(row + runeHash[name])
            elif " ".join(name.split(" ")[:2]) in runeHash.keys(): # remove middle name or initial
                writer.writerow(row + runeHash[" ".join(name.split(" ")[:2])])
            else:
                writer.writerow(row)

    
    


"""
count = 0 
for entry in canvasNames:
    name =  entry[0]
    email = entry[1]
    if name not in runeHash.keys():
        formatted = " ".join(name.split(" ")[:2])
        if formatted not in runeHash.keys():
            if email not in runeHash.values():
                print(name,"\t----\t",formatted)
                count +=1

print(count)
"""
