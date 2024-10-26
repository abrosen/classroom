data = open("pg120.txt", 'r', encoding="utf8")
text = data.readlines()

count = {}
for line in text:
    words = line.split()
    for w in words:
        w = w.strip()
        w = w.strip("(")
        if w not in count:
            count[w] = 1
        else:
            count[w] += 1


print(sorted(count, key=count.get)[-10:])

"""
text = data.read()
count = {}
for c in text:
    if c not in count:
        count[c] = 1
    else:
        count[c] += 1
mostCommon = ""
highestSeen = 0
for k in count:
    if count[k] > highestSeen:
        mostCommon = k
        highestSeen = count[k]
print(mostCommon,highestSeen)
"""

"""
count = [0]*26
for c in text:
    c = c.lower()
    index =  ord(c) -ord("a")
    if 0 <= index <= 25:
        count[index] += 1
print(count)
#for i in range(ord("a"),ord("z")+1):
#    print(chr(i),"\t",count[i])
"""
