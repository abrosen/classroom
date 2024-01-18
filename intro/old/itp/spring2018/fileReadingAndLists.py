

if __name__ == "__main__":
    
    """
    Technique 1: open file and read line by line
    data = open("numbers.csv","r")
    print(data)
    for line in data:
        print(line.strip())
    """
    
    """
    Technique 2: open with readlines and store in list
    lines = open("numbers.csv", "r").readlines()
    for line in lines:
        print(line.strip())
    """
    
    # Today's big lessons are 
    # 1) file reading 
    # 2) spliting a string into a list with .split()
    
    
    lines = open("numbers.csv", 'r').readlines()
    lines = lines[1:]
    
    
    #compute average of exam 1
    total = 0
    numStudents = 0
    for line in lines:
        line = line.strip()
        print(line)
        line = line.split(",")
        print(line)
        grade = int(line[1])
        total = total + grade
        numStudents = numStudents + 1
    print(total/numStudents)
    
    data = open("data.csv","r")
    total = 0
    for line in data:
        line = line.split(",")
        x = int(line[0])
        y = int(line[1])
        z = int(line[2])
        total = total + x + y + z
    print(total)
    
    
    
    
    
