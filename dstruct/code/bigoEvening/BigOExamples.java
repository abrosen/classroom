package bigoEvening;

import java.util.ArrayList;
import java.util.Random;

public class BigOExamples {

	public static void arrayListCreation() {
		ArrayList<Integer> test = new ArrayList<Integer>();
		long start = System.currentTimeMillis();
		for(int i = 0; i <100000; i++) {
			test.add(0,i);
		}
		
		long end= System.currentTimeMillis();
		System.out.println(end - start);
		
	}
	
	
	public static <T extends Comparable<T>> void bubbleSort(ArrayList<T> list) {
		
		for(int count = 0; count < list.size(); count++) {  // n 
			
			for(int i = 0; i < list.size() - (1 + count);  i++) { // n - 1
				T left  = list.get(i);
				T right = list.get(i+1);
				if(left.compareTo(right) > 0) {
					list.set(i, right);
					list.set(i+1, left);
				}
			}
		}
		
	}
	
	
	public static <T> int search(ArrayList<T> list, T item) {
		for(int i = 0; i< list.size(); i++) {
			
			
			for(int j = 0; j<1000; j++ ) {
				System.out.print("");
			}
			
			if(item.equals(list.get(i))) {
				return i;
			}
		}
		
		return -1;
	}
	
	
	
	
	public static void testConstant() {
		ArrayList<Integer> test = new ArrayList<Integer>();
		for(int i = 0; i< 10;i++) {
			test.add(0);
		}
		
		long start = System.currentTimeMillis();
		test.size();
		long end= System.currentTimeMillis();
		System.out.println(end - start);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//testConstant();
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random random = new Random();
		for(int i = 0; i<10000; i++) {
			list.add(random.nextInt());
		}
		
		long start = System.currentTimeMillis();
		bubbleSort(list);
		long end= System.currentTimeMillis();
		System.out.println(end - start);
	
		
		
		
		
		
		
	}

}
