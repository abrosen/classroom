import math

def extendedEuclid(a,b):
    if b > a:
        y, x, d = extendedEuclid(b,a)
        return x,y,d
    if b == 0:
        return 1,0,a
    x,y,d = extendedEuclid(b, a % b)
    return  y, x - (a//b)*y, d

a,b= 50,15
x,y,d=extendedEuclid(a,b)
print(a,"*",x,"+",b,"*",y,"=",d)

    
def genKeys(p,q):
    N = p*q
    phi = (p-1)*(q-1)  # to get totients
    e,d = genE(phi)
    if d < 0:
        d = d% phi
    return N,phi,e,d


def genE(phi):
    for e in range(2,phi):
        x,y,d = extendedEuclid(e,phi)
        if d == 1:
            return e,x
    return -1

N,phi,e,d =genKeys(313,101)
print(N,phi,e,d)
M = 17
C = (M**e) %N
D= (C**d) %N
print(C)
print(D)
