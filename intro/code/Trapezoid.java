public class Trapezoid {
    private double a, b, c, d; // this is valid
    // Insert constructor here

    public Trapezoid(double a, double b, double c, double d){
        this.a =a;
        this.b =b;
        this.c =c;
        this.d =d;
    }

    public double height() {
        return Math.sqrt((-a+b+c+d)*(a-b+c+d)*
                (a-b+c-d)*(a-b-c+d)) /2*Math.abs(b-a);
    }
    // insert area method here
    public  double area() {
        return ((a+b)/2)*height();
    }

    public static Trapezoid[] makeTrapezoids(int n) {
        Trapezoid[] zoids = new Trapezoid[n];
        for (int i = 0; i < n; i++) {
            zoids[i]  = new Trapezoid(i+1, i+1, 55,55);
        }
        return zoids;

    }

}