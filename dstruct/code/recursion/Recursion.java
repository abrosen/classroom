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
		if(n == 0 ) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
		
	}
	
	
	public static int length(String s) {
		if(s.equals("") ) {
			return 0 ;
		} else {
			return 1 + length(s.substring(1));
		}
		
	}
	
	public static void print(String s) {
		if(s.equals("") ) {
			System.out.println();
		} else {
			print(s.substring(1));
			System.out.print(s.charAt(0));  
		}
		
	}
	
	public static long fib(int n) {
		long[] memo = new long[n+1];
		return fib(n, memo);
	}
	
	
	
	private static long fib(int n, long[] memo) {
		if(n == 1 ||  n == 2) {
			return 1;
		} else {
			if(memo[n] != 0) {
				return memo[n];
			}
			memo[n] =  fib(n-1,memo) + fib(n-2, memo);
			return memo[n];
		}
	}
	
	
	public static double pow(int base, int exp) {
		if(exp == 0) {
			return 1;
		}else if(exp < 0) {
			return 1.0/ pow(base,-1*exp);
		}
		else {
			return base * pow(base, exp - 1);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print("alice");
		System.out.println(pow(2,-8));
		
	}

}
