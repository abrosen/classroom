package bigOExamples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Examples {

	public static void createArrayListTest() {
		List<Integer> list = new LinkedList<Integer>();
		long start = System.currentTimeMillis();

		for(int i = 0; i < 1000000; i++) {
			list.add(0,i);
		}

		long end  = System.currentTimeMillis();
		System.out.println(end -start);
	}


	public static int howBig(List<?> list ) {
		return list.size();
	}

	public static <T> boolean areUnique(List<T> l) {
		Set<T> s = new HashSet<T>(); 
		
		
		for(int i=0; i < l.size(); i++) {
			if(s.contains(l.get(i) )) {
				return false;
			}
			
			s.add(l.get(i));
		}
		return true;
	}

	
	
	

	public static int search(List<Integer> list, int num) {
		for(int i = 0;  i < list.size(); i++) {

			for(int j = 0; j <= 1000; j++) {
				System.out.print("");
			}

			if(list.get(i).equals(num)) {
				return i;
			}
		}

		return -1;
	}



	public static <T extends Comparable<T>> void sort(List<T> list) {
		for(int count = 0 ; count  < list.size() ; count++ ) {

			for(int i = 0; i < list.size() -(1  +count) ; i++) {
				T left  =  list.get(i);
				T right = list.get(i+1);
				if(left.compareTo(right)  > 0 ) {
					list.set(i, right);
					list.set(i+1, left);
				}

			}

		}

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<Integer>();
		Random rand = new Random();

		for(int i = 0; i <1000000; i++) {
			list.add(i);
		}


		long start =  System.currentTimeMillis();
		areUnique(list);
		long end =  System.currentTimeMillis();
		System.out.println(end-start);
		//System.out.println(list);
		/*
		String x = "Hello";
		String y = "Happy";

		System.out.println(x.compareTo(y));
		 */

	}

}
