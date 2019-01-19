
l = ["this","is","a","list","of","words","日本語"]
#print(str(l))
together = " ".join(l)
print(together)

apart = together.split(" ")
print(apart)

spam = '''Dear Alice,
How have you been? I am fine.
There is a container in the fridge
that is labeled "Milk Experiment".

Please do not drink it.
Sincerely,
Bob'''

print(spam.split("\n"))
