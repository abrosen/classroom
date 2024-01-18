package inheritance;

public class Snek extends Reptile {
	
	public Snek() {
		this.name = "Sam";
	}
	
	public void move() {
		System.out.println(this.name + " slithered");
	}
	
	public void boop() {
		System.out.println(this.name + "'s snoot was booped");
	}

}
