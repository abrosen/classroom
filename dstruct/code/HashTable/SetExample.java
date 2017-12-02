package HashTable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {

	
	public static boolean checkDupes(int[] arr) {
		for(int i = 0 ; i< arr.length-1;i++) {
			for(int j = i+1; j< arr.length; j++) {
				if(arr[i] == arr[j]) {
					return false;
				}
			}
		}
		return true;
		
	}
	
	
	public static boolean checkDupiclates(int[] arr) {
		Set<Integer>  checklist=  new HashSet<Integer>();
		for(int i = 0 ; i< arr.length;i++) {
			int item = arr[i];
			if(checklist.contains(item)) {
				return false;
			} else {
				checklist.add(item);
			}
			
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		Set<String> setA =  new HashSet<String>();
		Set<String> setB =  new HashSet<String>();
		setA.add("Apple");
		setA.add("Banana");
		setA.add("Durian");
		setA.add("Blackberry");
		
		
		
		System.out.println(setB.add("Blackberry"));
		setB.add("Blueberry");
		setB.add("Raspberry");
		System.out.println(setB.add("Blackberry"));
		
		System.out.println(setA);
		System.out.println(setB);

		setA.removeAll(setB);
		System.out.println(setA);
		
		int[] arr = {1,12,4,6,15,2,5,8,7,1};
		System.out.println(checkDupes(arr));
		for(String s : setA) {
			System.out.println(s);
		}
	}

}
