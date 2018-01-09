package HashTableEvening;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	
	// {1,2,3,4,5,... 1000000, 1000000}
	public static boolean dupes(int[] arr) {
		for(int i =0 ; i< arr.length -1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					return true;
				}
			}
			
		}
		return false;
	}
	
	public static boolean duplicates(int[] arr) {
		Set<Integer> checklist = new HashSet<Integer>();
		for(int val : arr) {
			if(checklist.contains(val)) {
				return false;
			} else {
				checklist.add(val);
			}
			
		}
		
		
		return false;
	}
	
	
	public static void main(String[] args) {
		
		Set<String> fruits = new HashSet<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Durian");
		fruits.add("Blueberry");
		System.out.println(fruits);
		
		fruits.remove("Durian");
		
		for(String fruit: fruits) {
			System.out.println("I like: " + fruit);
		}
		System.out.println(fruits.contains("Durian"));

		Set<String> berries =  new HashSet<String>();
		System.out.println(berries.add("Blueberry"));
		System.out.println(berries.add("Blueberry"));
		
		berries.add("Blackberry");
		berries.add("Raspberry");
		berries.add("Crunchberry");
		
		fruits.removeAll(berries);
		System.out.println(fruits);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
