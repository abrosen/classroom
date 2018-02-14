package recursionEvening;

public class RecursionExamples {


	public static long factorial(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		else if( n < 0) {
			return - 1 * factorial( -1 * n);
		}
		else {
			return n * factorial(n - 1 );

		}
	}

	public static void printChars(String str) {
		if (str == null || str.equals("")) { return; }
		else {
			printChars(str.substring(1));
			System.out.println(str.charAt(0));
			
		}
	}
	
	public static double pow(double base, int exp) {
		if(exp==0) {
			return 1;
		}
		else if(exp < 0) {
			return 1.0 / pow(base,-1*exp);
		}
		else {
			return base * pow(base,exp - 1);
		}
		
		
	}

	public static long fib(int n) {
		if( n  <= 2) {
			return 1;
		} else {
			return fib(n-1) + fib(n-2);
		}
		
	}
	
	
	

	static int counter  = 0;
	public static void notRecursion() {
		counter++;
		//System.out.println("This is not recursion!"  + counter);
		System.out.println(counter);
		try {
			notRecursion();
		} catch(Exception  e) {
			System.out.println(counter);
		}
	}


	public static int gcd(int big, int small) {
		if(small > big) { 
			return gcd(small, big);
		} else if(big % small == 0) {
			return small;
		} else {
			return gcd(small, big % small);
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//notRecursion();
		
		System.out.println(fib(50));
		//System.out.println(factorial());


	}

}
