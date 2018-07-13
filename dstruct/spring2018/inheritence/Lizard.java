package inheritance;

public class Lizard extends Reptile {

	public Lizard() {
		this.name = "Lizzy";
		
	}

	public Lizard(String name) {
		super(name);
	}
	
	public void eat(String thing) {
		System.out.println(this.name +  " pounces on " + thing + ".");
	}

	public void move() {
		System.out.println(this.name + " scurried away.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Lizard();
		Animal[] zoo = new Animal[5];
		zoo[0] = new Animal();
		zoo[1] = new Animal("Fred the Frog");
		zoo[2] = new Reptile();
		zoo[3] = new Lizard();
		zoo[4] = new Snek();
		
		
		/*for(int i = 0 ; i < zoo.length; i++) {
			zoo[i].eat("not a human");
		}*/
		
		for(Animal animal : zoo) {
			animal.eat("grub");
		}
		
		
		
	}

}
