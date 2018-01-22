package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class GenericExample {

	
	
	public static int biggestIntInList(ArrayList<Integer> list) {
		int max = list.get(0);
		
		for(int val : list) {
			if( val > max) {
				max = val;
			}
		}
		
		
		return max;
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer>  intList = new ArrayList<Integer>();
		ArrayList<String> list = new ArrayList<String>();
		
		Random rando = new Random(12345);
		for(int i = 0; i <10; i++) {
			intList.add(rando.nextInt(100));
		}
		
		System.out.println(intList);
		System.out.println(biggestIntInList(intList));
	}

}
