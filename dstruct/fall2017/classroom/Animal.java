package classroom;

public class Animal {
	
	protected String name;
	protected double size;
	
	public Animal() {
		name =  "Unnamed";
	}
	
	public Animal(String name) {
		this.name = name;
	}
	
	
	public void eat(String thing) {
		System.out.println(name + " ate " + thing + " generically.");
	}
	
	public void move() {
		System.out.println(name + " moved kinda normally.");
	}
	
	public static void main(String[] args) {
		Animal a = new Animal();
	}
}
