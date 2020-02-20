import math
originalGrade = input("Enter grade:")
originalGrade = int(originalGrade)
curvedGrade =  math.sqrt(originalGrade) * 10
print("New Grade: " + str(curvedGrade))
