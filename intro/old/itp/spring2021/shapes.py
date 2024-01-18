import math

class Triangle:
    
    def __init__(self, side1, side2, side3):
        self.side1 = side1
        self.side2 = side2
        self.side3 = side3

    def __str__(self):
        return "triangle with sides [" + str(self.side1) +", "+ str(self.side2) + ", " +str(self.side3) + "]"
    
    def get_perimeter(self):
        return self.side1 + self.side2 + self.side3

    def get_area(self):
        semiperim = 0.5 * self.get_perimeter()
        return math.sqrt( semiperim * (semiperim-self.side1)*(semiperim-self.side2)*(semiperim-self.side3))

if __name__ == "__main__":

    my_triangle = Triangle(3,4,5)
    print(my_triangle)
    
    other =  Triangle(3,3,3)
    print(my_triangle.get_area())
    print(other.get_area())