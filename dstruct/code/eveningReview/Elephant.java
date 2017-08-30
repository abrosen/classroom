package eveningReview;

public class Elephant extends Animal{


	public Elephant() {
		this.name =  "Earl";
	}
	
	public Elephant(String name) {
		this.name =  name;
	}
	
	public void eat(String thing) {
		System.out.println(name + " ate " + thing + " with its trunk");
	}
	
	
	public static void main(String[] args) {
		Elephant e =  new Elephant();
		e.move();
		e.eat("plants");
	}
}
