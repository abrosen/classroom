package bigoEvening;

import java.util.ArrayList;

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
	
	public static <T> int search(ArrayList<T> list, T item) {
		for(int i = 0; i<list.size(); i++) {
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
		for(int i = 0; i< 50000000; i++) {
			list.add(i);
		}
		
		long start = System.currentTimeMillis();
		search(list, -13);
		long end= System.currentTimeMillis();
		System.out.println(end - start);
		
	}

}
