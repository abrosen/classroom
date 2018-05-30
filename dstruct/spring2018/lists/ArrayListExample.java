package lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();


		
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		
		//list.set(1, "FOO");

		System.out.println(list.get(1));
		for(int i = 0 ; i <100000; i++) {
			list.add(i);
		}
		//System.out.println(list);
		for(int i = 0; i < list.size(); i++) {
			System.out.println( (int) list.get(i) * 2);
		}
		
	}

}
