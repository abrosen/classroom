d = {}
d['threes'] = []
d['fives'] = []
d['sevens'] = []
for num in range(3,1000):
    if num % 3 == 0:
        d['threes'].append(num)
    if num % 5 == 0:
        d['fives'].append(num)
    if num % 7 == 0:
        d['sevens'].append(num)
print(d)
