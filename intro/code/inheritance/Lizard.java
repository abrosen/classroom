package inheritance;

public class Lizard extends Reptile {

	public Lizard() {
		super.name = "Lizzy";
		
	}
	
	public void move() {
		System.out.println(this.name + " scurried.");
	}
	public void eat(String thing) {
		System.out.println(this.name + " pounced and devoured " + thing + ".");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lizard l = new Lizard();
		System.out.println(l.name);
		l.move();
		l.eat("a tasty bug");
		l.warm();
		
		Snek s =  new Snek();
		s.move();
		s.eat("mouse");
		s.boop();
		
		System.out.println(s);
		
		Animal a;
		a = new Lizard();
		
		
		System.out.println(a);
		a.move();
		a.eat("delicious food");
		((Reptile) a).warm();
		
		
		Animal[] zoo = new Animal[4];
		zoo[0] = new Animal("Oliver the Orangutan", 1.5);
		zoo[1] = new Reptile();
		zoo[2] = new Lizard();
		zoo[3] = new Snek();
		
		for(Animal animal : zoo) {
			animal.move();
			animal.eat("some grub");
//			/((Reptile) animal).warm();
		}
		
		
	}

}
