package arraylistEvening;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> list =  new ArrayList<String>();
		
		for(int i = 0; i< 100000; i++) {
			list.add(0, i + "");
		}
		
		System.out.println(list);

	}

}
