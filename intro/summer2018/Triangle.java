public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int perimeter() {
        return a+b+c;
    }

    public double area() {
        double s = perimeter()/2.0;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}
