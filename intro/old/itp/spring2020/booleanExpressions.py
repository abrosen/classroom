print(3 > 7)
print(6 == 6)
print(6 != 6)
weather = "sunny"
temperature = 91 
haveBoots = False
goingToTheBeach = True
if weather == "raining":
    print("Bring an umbrella")

print(weather == "raining" and temperature < 60)
if weather == "raining" and temperature < 60:
    print("Bring a raincoat")
if (weather == "raining" and temperature > 90 and not haveBoots) or goingToTheBeach:
    print("Looks like sandals for today")
