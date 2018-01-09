package review;

public class Box<E> {

	private E item;
	
	
	public void setItem(E item) {
		this.item = item;
	}
	
	public static void main(String[] args) {
		Box<Integer> b  = new Box<Integer>();
		b.setItem(5);
		Box<String> s = new Box<String>();
		Box o = new Box();
		
		
		
		System.out.println(-0.0/0);
	}
	
	
	
}
