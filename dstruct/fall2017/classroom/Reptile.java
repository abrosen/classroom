package classroom;

public class Reptile extends Animal{

	public Reptile() {
		this.name = "Ralph";
	}
	
	public Reptile(String name) {
		super(name);
	}



	public void eat(String thing) {
		System.out.println(this.name + " ate " + thing + " with a crunch.");
	}
	

	public static void main(String[] args) {
		Animal  a = new Animal("Fred");
		a.eat("stick");
		
		Reptile r =  new Reptile();
		r.move();
	}
}

