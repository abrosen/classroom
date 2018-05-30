package inheritenceDay;

public class Circle implements Shape{

	private double radius;
	
	public Circle(double  radius ) {
		this.radius = radius;
	}

	public double getPerimeter() {

		return 2*PI*radius;
	}

	public double getArea() {
		return PI*radius*radius;
	}

}
