package exam;

import java.util.List;
import java.util.Scanner;

public class ExamReview1 {

	public void problem4() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("PLZ ENTER A DBL");
		
		try {
			double d = Double.parseDouble(scanner.nextLine());
			System.out.println(2*d);
		} catch(Exception e) {
			System.err.println("Do you know what a double is?");
		}
		
	}
	
	public int minPlusMax(List<Integer> list){
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		
		
		//O(n)
							//arr.length
							//str.length()
		for(int i = 0 ; i < list.size(); i++ ) {
			int val = list.get(i);
			if(val < min) {
				min = val;
			}
			if(val < max) {
				max = val;
			}
			
		}
		
	
		return min + max;
	}
	
	
	//  lol apple application app bees carrot
	public void removePrefixStrings(List<String> list, String prefix){
		for(int i = 0; i< list.size(); i++) {
			String word =  list.get(i);
			if(word.startsWith(prefix)){
				list.remove(i);
				i--;
			}
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
