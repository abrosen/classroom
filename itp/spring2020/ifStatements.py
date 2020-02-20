score = int(input("Please enter your exam score: "))

if score == 100:
    print(str(score) + " is a ...  do you really need to ask?")
elif score >= 90:
    print(str(score) + " is an A.")
elif score >= 80:
    print(str(score) + " is a B.")
elif score >= 70:
    print(str(score) + " is a C.")
else:
    print(str(score) + " is not a passing grade.")

print("Thank you.")
