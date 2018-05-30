package recursion;

import java.util.*;

public class Search {


	public static <E> int linearSearch(List<E> list, E target) {
		for(int i =0; i < list.size(); i++) {
			E item = list.get(i);
			if(item.equals(target)) {
				return i;
			}
		}
		return -1;
	}

	
	public static <E extends Comparable<E>> int binarySearch(List<E> list, E target) {
		return binarySearch(list,target,0,list.size()-1);
	}
	
	private static <E extends Comparable<E>> int binarySearch(List<E> list, E target, int start, int end) {
		if(end<start) {
			return -1;
		} 
		
		int middle = (start+end)/2;
		E item =  list.get(middle);
		int comparison =  target.compareTo(item);
		if(comparison == 0) {
			return middle;
		} else if(comparison < 0) { // go to left
			return binarySearch(list, target,start, middle -1);
		} else {
			return binarySearch(list, target ,  middle +1  , end);
		}

	}


	public static void main(String[] args) {
		List<Integer> l =  new ArrayList<Integer>();
		Random rand = new Random(12345);
		
		for(int  i  = 0; i<10000000;i++) {
			int next = rand.nextInt();
			if(next<0) {
				next = next*-1;
			}
			l.add(next);
		}
		l.add(10000);
		Collections.sort(l);

		System.out.println(binarySearch(l,10000));
		for(int i = 0; i< 10;i++) {
			System.out.println(l.get(i));
		}
		
	}

}
