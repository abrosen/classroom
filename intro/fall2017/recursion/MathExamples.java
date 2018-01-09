package recursion;

import java.util.Arrays;
import java.util.Random;

public class MathExamples {

	public static int binarySearch(int[] arr, int target) {
		return binarySearch(arr, target, 0, arr.length -1);
	}
	
	
	
	private static int binarySearch(int[] arr, int target, int first, int last ) {
		if(last < first) {
			return -1;
		}
		
		int middle =  (first + last) / 2;
		int middleItem = arr[middle];
		if(middleItem == target) {
			return middle;
		} else if( target < middleItem) {
			return binarySearch(arr, target, first, middle -1);
		} else {

			return binarySearch(arr, target, middle + 1, last);
		}
		
		
		
	}
	
	public static long factorial(int n) {
		if(n == 1 || n == 0) {
			return 1;
		} else if( n < 0) {
			return -1* factorial(-n);
		}
		
		return n * factorial(n - 1);
		
	}
	
	public static int sum(int n) {
		if(n <= 0) { 
			return 0;
		} if(n == 1) {
			return 1;
		}
		return n + sum(n-1);
	}
	
	public static long fib(int n) {
		if(n <= 0 ) {
			return Long.MIN_VALUE;
		} if (n ==1 || n == 2) {
			return 1;
		}
		
		return fib(n-1) + fib(n -2 );
	}
	
	public static long[] fibIter(int n) {
		long[] fibs =  new long[n];
		fibs[0] = fibs[1] = 1;
		for(int i = 2; i < fibs.length; i++) {
			fibs[i] = fibs[i-1] +fibs[i-2];
		}
		
		
		return fibs;
	}
	
	
	
	
	public static void main(String[] args) {
		int[] arr = new int[100];
		Random gen = new Random();
		for(int i =0; i < arr.length; i++) {
			arr[i] = gen.nextInt(1000);
		}
		arr[0] = 130;
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println(binarySearch(arr, 130));
	}
	
}
