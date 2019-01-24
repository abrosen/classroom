public class Circle {
    private double radius;
    public static final double PI = 3.14159;


    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCircumference(){
        return 2*PI*radius;
    }

    public double getArea() {
        return PI*radius*radius;
    }

    public String toString () {

        return "Circle of radius "+ radius + " and area " +  this.getArea() +".";
    }


}
