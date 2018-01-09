package oop;

public class Rectangle {
	public static final int NUM_SIDES = 4;
	
	private double height;
	private double length;

	public Rectangle() {
		this(1,1);
	}
	
	public Rectangle(double height, double length) {

		this.height = height;
		this.length = length;
	}
	
	public void setHeight(double newHeight) {
		this.height = newHeight;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public double area() {
		return this.height * this.length;
	}
	
	public double perimeter() {
		return 2*this.height +2 * this.length;
	} 
	public double diagonal() {
		return Math.sqrt(  height*height + length*length);
	}
	
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle(5,4);

		
		System.out.println(r.area());
		System.out.println(r.perimeter());
		System.out.println(r.diagonal());
	}
}
