package eveningReview;
import java.util.List;
import java.util.ArrayList;


public class ListExample {

	
	public static <E> int count(List<E> list) {
		int count  = 0 ;
		for(E item :list ) {
			count++;
		}
		return count;
		
	}
	

	public static  <E extends Comparable<E> >  E biggest(List<E> list) {
		E max = list.get(0);
		for(E x : list ) {
			if(x.compareTo(max) == 1 ) {
				max  =  x;
			}
		}
		return max;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> l = new ArrayList<Integer>();
	}

}
