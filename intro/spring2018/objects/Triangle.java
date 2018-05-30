package objects;

public class Triangle implements Shape{
    private double a;
    private double b;
    private double c;


    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public double getArea() {
        double s = 0.5 *( a + b + c);
        return Math.sqrt(s* (s-a) * (s-b) * (s-c));
    }
}
