package inheritance;

public class Circle implements Shape {
	
	public final static double PI = 3.1415;
	
	private double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return PI * radius *radius;
	}

	public double getPerimeter() {
		return 2*PI*radius;
	}
	
	
	public static void main(String[] args) { 
		Shape s =  new Circle(5); 
		System.out.println(s.getArea());
		
	}

}


