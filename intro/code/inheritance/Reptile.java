package inheritance;

public class Reptile extends Animal {
	
	
	public Reptile() {
		this.name = "Ralph";
		this.mass = 1.0;
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
		Animal  a = new Animal(); 
		Reptile r = new Reptile();
		
		r.move();
		r.eat("Bug");
		r.warm();
	}
}
