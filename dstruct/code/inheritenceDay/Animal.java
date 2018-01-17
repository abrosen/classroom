package inheritenceDay;

public class Animal  {
	protected String name;
	protected String color;
	protected int size;
	
	public Animal() {
		this("Andrew");
	}
	
	public Animal(String name) {
		this.name = name;
		this.color = "red";
		this.size = 5;
	}
	
	public void eat() {
		System.out.println(this.name + " wants to eat, but can't find anything.");
	}
	
	public void eat(String thing) {
		System.out.println(this.name +  " eats the " + thing+ ".");
		
	}
	
	public void move() {
		System.out.println(this.name + " moves generically.");
	}
	
	
	public static void main(String[] args) {
		Animal a = new Animal();
		a.move();
		a.eat();
		a.eat("something tasty");
	}
}
