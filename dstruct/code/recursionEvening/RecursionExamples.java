package recursionEvening;

public class RecursionExamples {

	public static long factorial(int n) {
		long product  = 1;
		while(n > 0) {
			product = product * n;
			n--;
		}
		return product;
		
	}
	
	public static long fact(int n) {
		// base case
		if(n == 0) {
			return 1;
		} else {
			return n * fact(n-1);
		}
		
	}
	
	public static int length(String s) {
		if(s.equals("")) {
			return 0;
		}
		return 1 + length(s.substring(1));
	}
	public static void print(String s) {
		if(s.equals("")) {
			System.out.println();
		}else {
			print(s.substring(1));
			System.out.print(s.charAt(0));

		}
	}
	
	
	
	
	public static long fib(int n) {
		if(n == 1 || n == 2) {
			return 1;
		} else {
			return fib(n - 1) + fib( n - 2);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(43));
	}

}
