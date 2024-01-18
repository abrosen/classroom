package oop;

import java.util.ArrayList;
import java.util.List;

public class Circle {
	public static final double PI= 3.14159;
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}


	public double perimeter() {
		return 2*PI*radius;
	}
	
	public double area() {
		return PI*radius*radius;
	}






	public static void main(String[] args) {
		
		List<Circle> list = new ArrayList<Circle>();
		for(int i = 1; i <= 1000001; i++) {
			Circle c = new Circle(i);
			list.add(c);
			
		}
		
		System.out.println(list.get(500).getRadius());
		
		
	}
	
	

}
