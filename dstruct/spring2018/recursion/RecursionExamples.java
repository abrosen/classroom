public class RecursionExamples {



	public static void printChars(String str) {
		if (str == null || str.equals(""))
			return;
		else {
			
			printChars(str.substring(1));
			System.out.println(str.charAt(0));
			
		}
	}


	public static long factorial(int n) {
		if(n == 0 || n == 1) {
			return 1;
		} 
		if(n < 0) {
			return -1 * factorial(-1* n);
		}
		else {
			return n * factorial(n-1);
		}
	}


	public static double pow(double base, int exp) {
		if(exp ==0 ) {
			return 1;
		} else if(exp < 0) {
			return 1.0/pow(base, -1*exp); 
		}else {
			return base * pow(base, exp-1);
		}
		
	}

	
	public static int gcd(int big, int small) {
		if(small > big) {
			return gcd(small,big);
		} else if(big % small == 0) {
			return small;
		} else {
			return gcd(small, big % small);
		}
		
	}
	
	public static long fib(int n ) {
		return fibr(n, new long[n+1]);
	}
	
	private static long fibr(int n, long[] fibs) {
		if(n <= 2) {
			return 1;
		}
		long nMinus1;
		long nMinus2;
		if(fibs[n-1] != 0) {
			nMinus1 = fibs[n-1];
		} else {
			nMinus1 = fibr(n-1, fibs);
			fibs[n-1] = nMinus1;
		}
		
		if(fibs[n-2] != 0) {
			nMinus2 = fibs[n-2];
		} else {
			nMinus2 = fibr(n-2, fibs);
			fibs[n-2] = nMinus2;
		}
		
		return nMinus1+ nMinus2;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(Long.MAX_VALUE);
		System.out.println(fib(50));
	}

}
