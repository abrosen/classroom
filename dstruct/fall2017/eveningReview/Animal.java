package eveningReview;

public class Animal {

	protected String name;
	
	public Animal() {
		this.name = "Andrew";
	}

	public Animal(String name) {
		this.name = name;
	}
	
	
	public void move() {
		System.out.println(name + " moved generically.");
	}

	public void eat(String thing) {
		System.out.println(name + " ate " + thing +" normally.");
	}
	
	
	public static void main(String[] args) {
		Animal a  = new Animal("Andy");
		a.eat("Everlasting Gobstopper");
	}
	
	
}
