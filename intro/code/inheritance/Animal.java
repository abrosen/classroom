package inheritance;

public class Animal  {
	protected String name;
	protected double mass;
	
	public Animal() {
		this("Andrew", 1.0);
	}
	
	
	public Animal(String name, double mass) {
		this.name = name;
		this.mass = mass;
		System.out.println(this.toString());
	}
	
	public static void printAnimal(Animal a) {
		System.out.println(a.name + "\t" + a.mass);
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
	
		
	public boolean equals(Object other) {
		//Animal a =  (Animal) other;
		//return a.name.equals(this.name) && a.mass == this.mass;
		if(other instanceof Animal) {
			Animal a =  (Animal) other;
			return a.name.equals(this.name) && a.mass == this.mass;
		} else {
			return false;
		}
		
		
	}
	/*
	public boolean equals(Animal a) {
		if(a.name.equals(this.name) && a.mass == this.mass ) {
			return true;
		}
		else {
			return false;
		}
	}*/
	
	
	
	
	public String toString() {
		return "This is " + this.name;
	}
	
	
	
	
	
}
