package eveningReview;

public class Reptile extends Animal{
	
	public Reptile() {
		this.name = "Ralph";
		// TODO Auto-generated constructor stub
	}

	public Reptile(String name) {
		super(name);
	}

	public void eat(String thing) {
		System.out.println(this.name + " crunched "  + thing);
	}
	
	public static void main(String[] args) {

		Reptile r =  new Reptile();
		r.eat(" an unwary traveller");
	}

}
