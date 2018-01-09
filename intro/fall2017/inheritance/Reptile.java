package inheritance;

public class Reptile extends Animal {
	
	
	public Reptile() {;
		this.name = "Ralph";
		this.mass = 1.0;
		//System.out.println(this);
	}
	
	public Reptile(String name, double mass) {
		this.name = name;
		this.mass = mass;
	}
	
	
	//overide
	/*
	public void move() {
		System.out.println(this.name  + " moved scalelily." );
	}*/
	
	public void eat(String target) {
		System.out.println(this.name + " crunched on " + target + ".");
	}
	
	public void warm() {
		System.out.println(this.name + " warmed itself in the sun.");
	}
	
	public static void main(String[] args) {
		Animal  a = new Animal("Andrew",9001); 
		System.out.println("Done creating a");
		Reptile r = new Reptile("a", 1);
		
		r.move();
		r.eat("Bug");
		r.warm();
		
		Character c;
		String s = "a";
		Integer x = 4;
		
		Animal.printAnimal(r);
	}
}
