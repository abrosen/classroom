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
	
	public static double gcd(int m, int n) {
		if(m % n == 0 ) {
			return n;
		} else {
			return gcd(n, m % n );
		}

	}
	
	public static <E extends Comparable<E>> int binarySearch(E[] array, E target ) {
		return  binarySearch(array, target, 0, array.length -1 );
	}
	
	private static <E extends Comparable<E>> int binarySearch(E[] array, E target, int first, int last) {
		if( last < first ) {
			return -1;
		}
		int middle = (first +last) / 2;
		E middleItem = array[middle];
		if(target.compareTo(middleItem) == 0) {
			return middle;
		} else if(target.compareTo(middleItem)  < 0) {
			return binarySearch(array, target, first,  middle -1);
		} else {
			return binarySearch(array, target, middle + 1 ,  last);
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print("alice");
		Integer[] arr = {5,6,7,12,15,95,107};
		
//		//System.out.println(binarySearch(arr, "5"));
		
	}

}
