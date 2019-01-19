import random

l = []
for _ in range(15):
    l.append(10**random.randrange(0,10))

rendered = []
for num in l:
    text = str(num).center(50, "-")
    print(text)
    rendered.append(text)
print(rendered)

for item in rendered:
    print(item.strip("-"))