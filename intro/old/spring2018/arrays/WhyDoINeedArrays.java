package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class WhyDoINeedArrays {

	public static void main(String[] args) {
		
		
		System.out.println("Enter grades of students, I will give you the min, max, and average score.");
		System.out.println("First, tell me how many students you are entering");
		
		
		
		Scanner kb = new Scanner(System.in);
		int numStudents = Integer.parseInt(kb.nextLine());
		
		int[] scores;
		scores  =  new int[numStudents];
		
		
		for(int i = 0; i<numStudents; i++) {
			String input =  kb.nextLine();
			int thisScore  =  Integer.parseInt(input);
			scores[i] = thisScore;
		}
		
		Arrays.sort(scores);
		System.out.println(scores[1]);
		System.out.println(scores[scores.length -2]);
		
	}

}
