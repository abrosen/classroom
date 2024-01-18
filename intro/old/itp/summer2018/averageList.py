
def average(nums):
    total = 0
    numItems = len(nums) 
    for number in nums:
        total = total + number
    return total/numItems
    
def averageOneLiner(nums):
    return sum(nums)/len(nums)

numbers =  list(range(1,6))
print(average(numbers))
