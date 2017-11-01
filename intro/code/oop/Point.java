package oop;

public class Point {
	private double x;
	private double y;
	
	public Point() {
		this(0,0);
	}
	
	public Point(double x) {
		this(x,0);
	}
	
	public Point(double x, double y) {

		this.setX(x);
		this.y = y;
	}
	
	
	public double getX() {
		return this.x;
		
	}
	
	
	public double getY() {
		return this.y;
	}
	
	private void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public void translate(double dx, double dy) {
		this.x += dx;
		this.y += dy;
	}
	
	
	public double distance(Point other) {
		double deltaX =  other.x - this.x;
		double deltaY =  other.y - this.y;
		return Math.sqrt(  Math.pow(deltaX, 2)+ Math.pow(deltaY, 2));
		
	}
	
	
	public double distanceFromOrigin() {
		Point origin = new Point();
		return distance(origin);
	}
	
	
 	public String toString() {
		return "("+ this.x +", "+  this.y + ")";
	}
	
	public void foo() {
		setX(500);
	}
	
	
	
	/* INSERT SUPER AWESOME CODE HERE
	 * 
	 */
}
