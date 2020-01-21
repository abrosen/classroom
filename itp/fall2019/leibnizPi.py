def piApprox(steps):
    pi = 0
    for x in range(steps):
        if x % 2 == 0 :
            pi = pi + (1/(1+2*x))
            
        else:
            pi = pi - (1/(1+2*x)) 

    print(pi*4)

print("function has been registered")
