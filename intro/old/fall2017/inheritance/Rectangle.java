package inheritance;

public class Rectangle implements Shape{
	
	public double h;
	public double l;
	
	/**
	 * @param h
	 * @param l
	 */
	public Rectangle(double h, double l) {
		this.h = h;
		this.l = l;
	}
	
	public double perimeter() {
		
		return 2*h+2*l;
	}
	
	public double area() {
		return h*l;
	}
	
	public static void printInfo(Shape s) {
	    System.out.println("The shape: " + s);
	    System.out.println("area : " + s.area());
	    System.out.println("perim: " + s.perimeter());
	}

	
	public static void main(String[] args) {
		Shape s =  new Rectangle(5,10);
		printInfo(s);
		Circle c = new Circle(10);
		printInfo(c);
		//Shape shape = new Shape();
	}

	

}
