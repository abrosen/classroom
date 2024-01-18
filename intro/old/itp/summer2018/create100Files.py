for i in range(1,101):
    target = open(str(i)+".haha","w")
    for _ in range(1000):
        target.write("spam!")

    target.close()
