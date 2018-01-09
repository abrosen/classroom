package eveningReview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class BigO {
	
	
	
	public static Random random = new Random();
	
	
	/*
	public static void bubbleSort(List<Integer> list) {
		for(int i = 0; i < list.size();i++) {	
			for(int j = 0; j < list.size() - (1 + i ) ; j ++) {
				
				if( list.get(j)  >list.get(j+1)) {
					int temp = list.get(j);
					list.set(j,   list.get(j+1));
					list.set(j+1, temp);
				}
				
			}
		}
		
	}*/
	
	
	
	public static long sum(List<Integer>  list) {
		long sum = 0;
		
		for(int val : list) {
			for(int i = 0; i < 2000; i++) {
				System.out.print("");
			}
			
			sum += val;
		}
		
		return sum;
	}
	
	
	// Our first method for testing is a method that creates a new list
	// specifically a new list of a specific size
	public static ArrayList<Integer> makeList(int size) {
		ArrayList<Integer>  list =  new ArrayList<Integer>(size);
		
		for(int i = 0; i < size; i++) {
			int val = random.nextInt();
			//if (val < 0) {
			//	val = val * -1; // force positive
			//}
			list.add(+val);  // Adds a random positive integer to our list
			//list.add(i)
		}

		return list;
	}
	
	
	// isEmpty
	// how long does this algorithm take?
	// Does it depend on the size of the list we are checking?
	
	public static boolean isEmpty(List<Integer> list) {
		
		for(int i = 0; i < 2000000; i++){
			System.out.print("");
		}
		
		return list.size() == 0;
		
	}
	
	
	// The first method we are going to look at is this method 
	// has() searchs the list for a target number, returns true if it has it, otherwise false
	// We could use the .contains method, but here I want to explicitly show the code
	
	public static boolean has(List<Integer> list, int target){
		for(int val : list) {
			
			for(int i = 0; i < 2000; i++){
				System.out.print("");
			}
			if (val == target){
				return true;
			}
		}
		
		
		return false;
	}
	
	
	// checks to see if all elements are unique
	// returns false if two elements have the same value
	// returns true otherwise
	
	public static boolean areUnique(List<Integer> list){
		for(int i = 0 ; i < list.size() ; i++){
			for(int j = i+1;  j < list.size() - 1; j++){
				
				
				
				System.out.print("");
				if(list.get(i).equals(list.get(j)) ){
					return false;
				}
			}
		}
		
		
		return true;
	}
	
	
	
	public static boolean areUnique2(List<Integer> list){
		Set<Integer> checklist = new HashSet<Integer>(); 
		
		for(int i = 0 ; i < list.size() ; i++){
			if(checklist.contains(i)){  // O(1) for a HashSet
				return false;
			}
			else{
				checklist.add(i);		// O(1)
			}
			
		}
		
		
		return true;
	}
	
	public static void main(String[] args) {
		long startTime, endTime;
		int maxSize = 20000000;

		
		
		
		/*
		System.out.println("--Empty Check--------");	
		for(int i = 10; i<= maxSize; i*=2){
			List<Integer> list= makeList(i);
			
			
			startTime = System.currentTimeMillis();
			isEmpty(list);
			endTime = System.currentTimeMillis();
			System.out.println("Size "+i+" \ttook " + (endTime -startTime)  +" milliseconds.");
		}*/

		
		
		/*
		
		for(int i = 10 ; i <= maxSize; i*=2 ) {
			startTime = System.currentTimeMillis();
			sum( makeList(i));
			
			endTime = System.currentTimeMillis();
			System.out.println("sum "+i+" \ttook " + (endTime -startTime)  +" milliseconds.");
		}*/
		
		/*
		System.out.println("--Searching----------");
		for(int i = 10; i<= maxSize; i*=2){
			List<Integer> list= makeList(i);
			
			startTime = System.currentTimeMillis();
			has(list, -13);
			endTime = System.currentTimeMillis();
			System.out.println("Size "+i+" \ttook " + (endTime -startTime) +" milliseconds.");
		}*/
		
		/*
		System.out.println("--Sorting------------");
		for(int i = 10; i<= maxSize; i*=2){
			List<Integer> list= makeList(i);
			
			
			startTime = System.currentTimeMillis();
			
			bubbleSort(list);
			
			endTime = System.currentTimeMillis();
			System.out.println("Size "+i+" \ttook " + (endTime -startTime) +" milliseconds.");
		}*/
		
		
		
		
		
		System.out.println("--Uniqueness---------");
		for(int i = 10; i<= maxSize; i*=2){
			List<Integer> list= makeList(i);
			
			
			startTime = System.currentTimeMillis();
			areUnique2(list);
			endTime = System.currentTimeMillis();
			System.out.println("Size "+i+" \ttook " + (endTime -startTime)+" milliseconds.");
		}
		
	}
}
