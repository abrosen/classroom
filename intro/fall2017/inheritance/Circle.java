package inheritance;

public class Circle implements Shape{

	public double r;
	
	public Circle(double radius) {
		r =radius;
	}
	
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*r*Math.PI;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*r*r;
	}


	

	
	
}
