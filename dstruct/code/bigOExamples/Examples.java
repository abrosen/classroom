package bigOExamples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createArrayListTest();

	}

}
