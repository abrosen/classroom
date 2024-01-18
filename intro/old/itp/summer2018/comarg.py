import sys

print(sys.argv)
if len(sys.argv) == 1:
    print("Please enter an argument")
elif sys.argv[1] == "-x":
    print("extracting data")
elif sys.argv[1] == "-r":
    print("removing data")
else:
    print("Invalid argument. Valid args: -x or -r")
