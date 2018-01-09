package eveningReview;

public class Lizard extends Reptile {

	
	public Lizard() {
		this.name = "Lizzy";
		// TODO Auto-generated constructor stub
	}

	public Lizard(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	
	public void move() {
		System.out.println(this.name  + " scurried.");
	}
	
	public void eat(String thing) {
		System.out.println(this.name  + " pounced on " + thing);
	}
	
	
	public static void main(String[] args) {
		//Lizard l  =  new Lizard();
		//l.eat("a yummy insect");
		//l.move();
		
		//Animal a =  new Lizard("Laurence");

		
		
		Animal[] zoo =  new Animal[4];
		zoo[0] = new Lizard();
		zoo[1] = new Reptile();
		zoo[2] = new Elephant();
		zoo[3] = new Animal();
		
		for(Animal a  : zoo) {
			a.move();
			a.eat("something");
		}
		
		
	}
	
	
	
	
	
}
