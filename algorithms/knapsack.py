# sack of capacity W, meaning we can take up to W weight with us
# there are n items, each with weight w_n and v_n.  
# In other words items weigh some amount and have some value.
# maximize the loot

# 1) general knapsack.  Unlimited quanitity of each item.
# knapsack with repitition

class Item(object):
    def __init__(self, weight,value) -> None:
        self.weight = weight
        self.value = value


def knapsack(maxWeight,items):
    haul = [0] * (maxWeight+1)
    for w in range(1,maxWeight+1):
        haul[w] = max([haul[w- item.weight] + item.value for item in items if item.weight <= w ])
    return haul
        
items = []

items.append(Item(1,1))
items.append(Item(2,3))
items.append(Item(5,7))

# print(knapsack(5,items))
# 2) 0/1 knapsack
# knapsack without repitition

def zeroOneKnapsack(maxWeight, items):
    # let row be the weight
    # col be the item
    haul = []
    items.insert(0, Item(0,0))
    for _ in range(maxWeight+1):
        haul.append([0]*(len(items)))
    for itemIndex in range(1,len(items)):
        item =  items[itemIndex]
        for w in range(1, maxWeight+1):
            if item.weight > w:
                haul[w][itemIndex] = haul[w][itemIndex-1]
            else:
                scoreForTaking = haul[w-item.weight][itemIndex-1] + item.value
                scoreForNotTaking =  haul[w][itemIndex-1]
                haul[w][itemIndex] =  max(scoreForTaking,scoreForNotTaking)
    return haul
haul =  zeroOneKnapsack(8,items)
for index,line in enumerate(haul):
    print(index,line)