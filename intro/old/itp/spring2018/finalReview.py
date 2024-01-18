import re

def mean(l):
    total = 0 
    count = 0 
    for number in l:
        total += number
        count += 1
    return total / count
 
def meaner(l):
    return sum(l)/len(l)

def word_Count(filename):
    numLines = 0  
    numChars = 0
    numWords = 0
    data =  open(filename,"r")
    for line in data:
        wordRegex=  re.compile(r"\w+")
        words  = wordRegex.findall(line)
        numLines += 1
        numChars += len(line)
        numWords += len(words)
    print(numLines, numWords,numChars, filename)
    

def euler1():
    total = 0
    for num in range(1000):
        if num % 3 == 0  or num % 5 == 0:
            total = total + num
            
    return total 

def euler2():
    # generate a list of fibbonacci numbers
    fibs = [1,2,3,5,8]
    while fibs[-1]  + fibs[-2] < 4000000:
        fibs.append(fibs[-1] + fibs[-2])
    print(fibs)
    total = 0
    for num in fibs:
        if num %2 == 0:
            total += num
    return total 
    
def euler25():
    # generate a list of fibbonacci numbers
    fibs = [1,1,2,3,5,8]
    while len(str(fibs[-1]  + fibs[-2])) <= 1000:
        fibs.append(fibs[-1] + fibs[-2])
    for index, num in enumerate(fibs):
        if len(str(num)) == 1000:
            return index + 1

def euler14():
    d = [0,0,0]
    d[1] = 1
    d[2] = 2
    for num in range(3,1000000):
        counter = 0
        startingNum = num
        while num != 1:
            if num % 2 == 0:
                num = num // 2
            else:
                num = num * 3 + 1
            counter += 1
        d.append(counter + 1)
        print(startingNum)
    print(max(d))


def euler14Better():
    d = {}
    d[1] = 1
    d[2] = 2
    for num in range(3,1000000):
        counter = 0
        startingNum = num
        while num != 1:
            if num in d:
                d[startingNum] = counter + d[num]
                break
            if num % 2 == 0:
                num = num // 2
            else:
                num = num * 3 + 1
            counter += 1
        #print(startingNum)
    longest  = 1 
    for k in d:
        if d[k] > d[longest]:
            longest = k
    return longest, d[longest]

#Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.

#rotate_left3([1, 2, 3]) → [2, 3, 1]
#rotate_left3([5, 11, 9]) → [11, 9, 5]
#rotate_left3([7, 0, 0]) → [0, 0, 7]

def rotateLeft(l):
    first =  l[0]
    for i in range(1,len(l)):
        l[i-1] = l[i]
    l[-1] = first
    return l


def xyz_there(s):
    regex =  re.compile(r'[^.]xyz|^xyz')
    if regex.search(s):
        return True
    else:
        return False

def xyz_there_no_regex(s):
    if s[0:3] == "xyz":
        return True
    for i in range(1, len(s)-2):
        letter = s[i]
        if letter== 'x' and s[i-1] != "." and s[i+1] == "y" and s[i+2] == "z":
            return True
    return False


# hidden -> h_dd_n
def hideVowels(s):
    newString = ""
    for letter in s:
        if letter in "aeiou":
            newString += "_"
        else:
            newString += letter
    return newString
        
def hideVowels2(s):
    for i in range(len(s)):
        if s[i] in "aeiou":
            s = s[:i] + "_" + s[i+1:]    
    return s

    
print(hideVowels2("axyz.abc"))

#word_Count("suess.txt")
