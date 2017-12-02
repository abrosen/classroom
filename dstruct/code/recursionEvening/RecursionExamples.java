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
	
	private static double pow(double base, int degree) {
		if(degree== 0 ) {
			return 1;
		} else if(degree < 0) {
			return 1/ pow(base, -degree);
		}
		else {
			return base * pow(base, degree - 1);
		}
	}
	
	public static int gcd(int bigger, int smaller) {
		if(bigger % smaller == 0) {
			return smaller;
		} else if(bigger < smaller ) {
			return gcd(smaller, bigger);
		} else {
			return gcd(smaller, bigger % smaller);
		}
		
	}
	
	
	public static <E extends Comparable<E>> int search(E[] array , E target) {
	
		return search(array, target, 0, array.length -1);
	}
	
	
	
	private static <E extends Comparable<E>> int search(E[] array, E target, int first, int last) {
		if(last < first) {
			return -1;
		}
		int middle = (first + last)  / 2 ; 
		E middleItem = array[middle];
		
		if( target.compareTo(middleItem) == 0 ) {
			return middle;
		} else if( target.compareTo(middleItem) < 0 ) {
			return search(array, target, first, middle - 1);
		} else {
			return search(array, target, middle+ 1, last);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {1,2,3,4,12,35,97, 109};
		System.out.println(search(arr,6));
	}

}
