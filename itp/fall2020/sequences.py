l = [1,2,3,4,5]
s = "hello"

#l[0] = 100
#s[0] = "b"

l.append(6)
l.append(7)
l.insert(2,"skip a few")



l = l + [8]
print(l)


l.remove("skip a few")
print(l)

#del l[2]
#print(l)

alist = ['a', 'b', 'c', 'd', 'e', 'f']
del alist[1:5]
print(alist)


a = [1,2,3]
b = a[:] + a[::-1]


print(a == b)
print(a is b)

a.append(4)
b.sort()
print(a)
print(b)