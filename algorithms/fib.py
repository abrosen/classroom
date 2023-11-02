def fib(n):
    if n == 0:
        return 0
    if n == 1:
        return 1
    return fib(n-1) + fib(n-2)

def fib2(n):
    table = [0]*(n+1)
    table[1] = 1
    for i in range(2,n+1):
        table[i] = table[i-1] +table[i-2]
    return table[-1]


print(fib2(200))