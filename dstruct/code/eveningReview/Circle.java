package eveningReview;

import java.util.ArrayList;
import java.util.List;

public class Circle extends Object {
	private double radius;
	public static final double PI = 3.14159;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	
	public double getArea() {
		return PI* this.radius*this.radius;
	}
	
	
	public String toString() {
		return "Circle [radius=" + this.radius + "]";
	}


	public static void main(String[] args) {
		List<Circle> list = new ArrayList<Circle>();

		
		for(int i =  1;  i <= 1000; i++) {
			Circle c = new Circle(i);
			list.add(c);
		}
		
		for(int i = 0; i < list.size(); i++) {
			Circle c = list.get(i);
			System.out.println(c.getArea());
		}
		
		
	}
	
	
}
