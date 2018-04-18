package objects;


// class
public class Circle implements Shape {

    private double radius;
    private int x;
    private int y;
    public static final double PI = 3.14159;
    private static int numCircles = 0;


    public Circle(){
        this(0);
    }

    public Circle(double radius) {
        this.radius = radius;
        numCircles++;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter(){
        return this.radius*2;
    }

    public double getCircumfrence(){
        return  2* PI * radius;
    }


    public double getPerimeter(){
        return getCircumfrence();
    }

    public double getArea(){
        return PI*radius*radius;
    }


    public static int getNumCircles(){
        return Circle.numCircles;
    }

    public String toString() {
        return "This is a circle of radius " + this.radius;
    }
}
