numLenders = [38, 18, 51, 3, 21, 1, 10, 8, 42, 1, 18, 6, 28, 5, 16, 7, 54, 1, 18, 22, 36, 12, 8, 24, 8]
total = 0 

for value in numLenders:
    print("Current total is", total,"\t Reading ", value, "\t Updating total to", total + value)
    total += value

print(total/len(numLenders))