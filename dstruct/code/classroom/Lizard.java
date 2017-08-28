package classroom;

public class Lizard extends Reptile {

	
	public Lizard() {
		this.name =  "Lizzy";
	}
	
	public void move() {
		System.out.println(this.name + " scurried.");
	}

	
	public void eat(String thing) { 
		System.out.println(this.name + " ambushed and ate " + thing);
	}
	public static void main(String[] args) {

		Lizard l  =  new Lizard();
		l.move();
		l.eat(" a smaller lizard ");

		
		Animal a =  new Lizard();
		a.move();
		
		Animal[] zoo = new Animal[10];
		
		
		zoo[0] =  new Animal("Earl the Elephant");
		zoo[1] =  new Reptile();
		zoo[2] =  new Lizard();
		
		zoo[0].eat(" leaves and stuff");
		zoo[1].move();
		zoo[2].move();
		
	}

}
