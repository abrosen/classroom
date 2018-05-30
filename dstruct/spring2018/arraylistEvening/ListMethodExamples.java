package arraylistEvening;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListMethodExamples {

	// sums an arraylist of ints
	public static int sum(List<Integer>  list) {
		int sum = 0;
		for(int i = 0;  i < list.size() ; i++) {
			sum +=  list.get(i);
			
		}
		return sum;
	}
	
	// convert to string
	public static <T> String toString(List<T> l ) {
		String output = "[";
		for(T item : l) {
			output += item.toString() +"\n";
		}
		
		
		return output +"]";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		for(int i =0; i <10000; i+=5) {
			list.add(i);
		}
		System.out.println(sum(list));
		System.out.println(toString(list));
	}

}
