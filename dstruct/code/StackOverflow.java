
public class StackOverflow {

	public static void a(int a) {
		System.out.println(a);
		a++;
		a(a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a(0);
	}

}
