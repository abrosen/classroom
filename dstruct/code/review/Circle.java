package review;

import java.util.ArrayList;
import java.util.List;

public class Circle {

	private double radius;
	public static final double PI  = 3.14159;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return PI*this.radius*this.radius;
	}
	
	
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	public static void main(String[] args) {
		
		List<Circle> list = new ArrayList<Circle>();
		List<String> l2 = new ArrayList<String>();
		List<List<Integer>> l3 = new ArrayList<List<Integer>>();

		
		
		for(int i = 0; i<1000; i++) {
			Circle c =  new Circle(i);
			list.add(c);
		}
		//list.add(1);
		
		for(int i = 0; i < list.size();i++) {
			Circle c = list.get(i);
			
			System.out.println( c.getArea());
		}
		
		
		
	}
}
