package recursionEvening;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

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
	
	
	
	public static <E extends Comparable<E>> int search(List<E> list, E target) {
		return search(list, target, 0 , list.size()- 1);
	}
	
	private static <E extends Comparable<E>> int search(List<E> list, E target, int start, int end) {
		if(start >end) {
			return -1;
		}
		int middle = (start + end) / 2;
		E item = list.get(middle);
		int comparison =  target.compareTo(item);
		if(comparison == 0) {
			return middle;
		} else if(comparison < 0) {
			return search(list, target, start, middle -1);
		} else {
			return search(list,target, middle +1 , end);
		}
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//notRecursion();
		
		//System.out.println(fib(50));
		//System.out.println(factorial());


		List<Integer> l =  new ArrayList<Integer>();
		Random rand = new Random(12345);
		
		for(int  i  = 0; i<10000;i++) {
			int next = rand.nextInt();
			if(next<0) {
				next = next*-1;
			}
			l.add(next);
		}
		l.add(13);
		Collections.sort(l);

		System.out.println(search(l,13));
		for(int i = 0; i< 10;i++) {
			System.out.println(l.get(i));
		}
		
	}

}
