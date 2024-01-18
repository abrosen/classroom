package chap5;

import java.util.Scanner;

public class AskForSum {

	public static final int SENTINAL = 0;
	//public static final double PI = 3.14159;
	
	
	public static void foo() {
		int x = 5;
		System.out.println(SENTINAL);
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//System.out.println(SENTINAL);
		
		Scanner kb = new Scanner(System.in);
		int sum  = 0;
		
		System.out.println("Please enter numbers, enter " + SENTINAL + " to stop");
		int input = kb.nextInt();	
		
		while(input != SENTINAL) {
			sum += input;
			System.out.println("Please enter numbers, enter " + SENTINAL + " to stop");
			
			input = kb.nextInt();
		}
		
		System.out.println(sum);
	}

}
