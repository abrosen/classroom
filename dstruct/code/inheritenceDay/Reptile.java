package inheritenceDay;

public class Reptile extends Animal {

	public Reptile() {
		this("Ralph");	
	}
	
	public Reptile(String name) {
		super(name);
		this.color = "green";
	}

	public void eat(String thing) {
		System.out.println(this.name + " chomps on " + thing + ".");
	}
	
	
	public static void main(String[] args) {
		Reptile r =  new Reptile();
		r.eat();
		r.eat("a juicy grub");

	}

}
