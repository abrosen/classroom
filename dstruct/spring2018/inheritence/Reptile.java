package inheritance;

public class Reptile extends Animal {
	
	public Reptile() {
		super("Ralph");
		this.size = 5;
	}
	
	public Reptile(String name) {
		super(name);
	}
	
	
	public void eat(String thing ) {
		System.out.println(this.name + " chomped " + thing + ".");
	}
	
	public static void main(String[] args) {
		Reptile r  = new Reptile("Eddie");
		r.move();
		r.eat("the bug");
		System.out.println(r.size);
		Animal a = new Animal();
		a.eat("the lettuce");
	}

}
