package inheritenceDay;

public class Lizard extends Reptile {

	public Lizard() {
		this("Lizzy");
	}

	public Lizard(String name) {
		super(name);
	}

	public void move() {
		System.out.println(this.name + " scurried away!");
	}
	
	public static void main(String[] args) {
		/*
		Animal[] zoo = new Animal[5];
		zoo[0] = new Animal();
		zoo[1] = new Animal("Ed the Elephant");
		zoo[2] = new Reptile();
		zoo[3] = new Lizard();
		zoo[4] = new Lizard("Leo");
		
		for(int i = 0 ; i < zoo.length; i++) {
			zoo[i].eat("food");
			zoo[i].move();
		}*/
		
	
	}

}
