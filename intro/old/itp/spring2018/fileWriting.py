import random


if __name__ == "__main__":
    
    data = open("data.csv","w")
    for _ in  range(100000):
        data.write(str(random.randint(0,1000)) +","+str(random.randint(0,1000)) +","+str(random.randint(0,1000))+"\n")
    data.close()
