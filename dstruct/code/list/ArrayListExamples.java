package list;

import java.util.ArrayList;

public class ArrayListExamples {

	public static int sum(ArrayList<Integer> list) {
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i);
			
		}

		return sum;
	}
	
	public static <T> boolean contains(ArrayList<T> list, T item) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).equals(item) ) {
				return true;
			}
		}
		
		return false;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
