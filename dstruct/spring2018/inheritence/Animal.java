package inheritance;

public class Animal {
	// data
	protected String name;
	protected String color;
	protected int size;
	
	// behavior
	
	public Animal() {
		this("Andrew");
	}
	
	public Animal(String name) {
		this.name = name;
		this.color = "red";
		this.size = 3;
	}
	
	public void eat(String thing) {
		System.out.println(this.name + " generically noms " + thing + ".");
	}
	
	public void sleep() {
		System.out.println(this.name + " goes zzzzzzzzzzzzzzz.");
	}
	
	public void move() {
		System.out.println(this.name + " moved generically.");
	}
	
	
	public static void main(String[] args) {
		Animal a =  new Animal();
		a.move();
		a.sleep();
		System.out.println(a.size);
	}
}











