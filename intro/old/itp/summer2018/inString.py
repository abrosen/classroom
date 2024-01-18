def countNumVowels(s):
    s = s.lower()
    print(s)
    count = 0
    vowels = "aeiou"
    for letter in s:
        if letter in vowels:
            print("Found:", letter)
            count+=1
    return count


count = countNumVowels("Words are Cool. AEIOU")
print(count)
