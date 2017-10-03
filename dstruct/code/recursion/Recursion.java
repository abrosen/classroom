package recursion;

public class Recursion {

	public static long fact(int n) {
		int product = 1;
		while(n > 1) {
			product = product * n;
			n--;
		}
			
			
		return product;
	}
	
	public static long factorial(int n) {
		if(n == 0 || n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(10));
	}

}
