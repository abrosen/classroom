s = 'dfkjahsjadksjfhdkasfkjdsajhsdafcreio'
l = [1,2,5,6,2,1,6,8,3,1,90,1231,543,121,2]





def bubbleSort(l):
    for _ in range(len(l) -1):
        for index in range(len(l)-1):
            left = l[index]
            right = l[index + 1 ]
            if(left > right ):
                temp = left
                l[index] = l[index+1]
                l[index+1] = temp
l =  ["a","q",'b','x','c','l',"hello","happy","ha"]        
bubbleSort(l)
print(l)