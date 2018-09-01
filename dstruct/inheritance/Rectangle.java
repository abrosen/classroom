package inheritance;

public class Rectangle implements Shape {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return length*2 +width*2;
    }

    @Override
    public double getArea() {
        return length*width;
    }
}
