package objects;

public class Rectangle {
    // Attributes
    double length, height;


    // Constructor
    public Rectangle(double initialLength, double initialHeight) {
        length = initialLength;
        height = initialHeight;
    }

    // Behaviors

    public double getPerimeter(){
        return 2*height +2*length;
    }

    public double getArea() {
        return length*height;
    }

    public String toString() {
        return "I am a rectangle with length " + length + " and height "  + height;
    }


}
