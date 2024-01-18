package params;

public class MathExample {

	
	public static int add(int a, int b) {
		return a+b;
	}
	
	
	
	public static void main(String[] args) {
		//System.out.println(Math.abs(-7));
		
		double squareRoot = Math.sqrt(121.0);
		System.out.println(squareRoot);           // 11.0

		int absoluteValue = Math.abs(-50);
		System.out.println(absoluteValue);        // 50

		System.out.println(Math.min(3, 7) + 2);   // 5


		int sum = add(3,6);
		
		System.out.println(sum  - 8);
	}

}
