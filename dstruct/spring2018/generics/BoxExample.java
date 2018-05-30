package generics;

public class BoxExample {

	public static void main(String[] args) {
		Box<Integer> b =  new Box<Integer>();
		b.setData(5);
		
		int x = b.getData();
		System.out.println(x);
		

	}

}
