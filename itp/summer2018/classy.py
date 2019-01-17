import math

class Person(object):
    def __init__(self, hairColor = "Black", eyeColor="Black"):
        self.hairColor = hairColor
        self.eyeColor= eyeColor


class Circle(object):
    def __init__(self,radius=10):
        self.radius = radius

    def perimeter(self):
        return self.radius*2*math.pi

    def __str__(self):
        return

p = Person(eyeColor=1, hairColor="white")