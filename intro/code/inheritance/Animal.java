package inheritance;

public class Animal  {
	protected String name;
	protected double mass;
	
	public Animal() {
		super();
		this.name = "Andrew";
		this.mass = 1.0;
	}
	
	
	public Animal(String name, double mass) {
		this.name = name;
		this.mass = mass;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getMass() {
		return this.mass;
	}
	
	
	public void move() {
		System.out.println(this.name + " moved generically.");
	}
	
	public void eat(String thing) {
		System.out.println(this.name + " munched normally on " + thing +".");
	}
	
	public String toString() {
		return "This is " + this.name;
	}
	
	
	
	
	
}
