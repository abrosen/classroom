def extendedEuclid(a, b):
    if b > a:
        y,x,d = extendedEuclid(b,a%b)
        return   x,y,d
    if b==0:
        return 1,0,a
    x,y,d = extendedEuclid(b, a%b)
    print (a,b,x,y,d)
    return y, x - (a//b)*y,d
print(extendedEuclid(48,7))
print("------")
def genKeys(p,q):
    N = p*q
    phi = (p-1)*(q-1)
    e,d = genED(phi)
    return e,d,N

def genED(phi):
    for e in range(2,phi):
        x,y,d = extendedEuclid(e,phi)
        if d == 1:
            return e,x
    return -1
        
def encrypt(m,e,N):
    return m**e % N

def decrypt(ciphertext, d, N):
    return ciphertext**d %N

p=13
q=5
e,d,N= genKeys(p,q) 
print(e,d,N)
m=14
print(decrypt(encrypt(m,e,N), d, N))
