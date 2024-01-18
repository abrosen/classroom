import re



def part1():
    words = [] 
    data = open("words.txt", 'r')
    for line in data:
        line = line.strip()
        words.append(line)
    catdog(words)
    fourLetters(words)
    
def catdog(words):    
    catdogRegex =  re.compile(r'(cat)|(dog)')
    count = 0 
    for word in words:
        if catdogRegex.search(word):
            count = count + 1
    print("There are",count,"words that contain cat or dog")

def fourLetters(words):
    output = open("output3.txt",'w')
    fourLetterRegex = re.compile(r'^[A-Za-z]{4}$')
    count = 0 
    for word in words:
        if fourLetterRegex.search(word):
            count = count + 1
            output.write(word)
            output.write("\n")
    print("There are",count,"four letter words")
    output.close()


if __name__ == "__main__":
    part1()
