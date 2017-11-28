package inheritance;

public final class C extends A{
	
	public static final double PI = 3.14159;
	
	//overriding
	@Override
	public void foo() {
		System.out.println("C");
	}

	
	//overloading
	public int add(int a, int b) {
		return a +b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}
	
	public double add(double a, double b) {
		return a +b;
	}
	
	public static void main(String[] args) {
		
		A c = new C();
		c.foo();
		((A) c).foo();
	}
}
