package dataTypes;

import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {
		int x;
		x = 5;

		
		
		String variableNameForSomeWords = "Hello, have some words!";
		Scanner keyboard  = new Scanner(System.in);
		System.out.println("Echo Program");
		System.out.println("Please enter something!");
		
		String input = keyboard.nextLine();
		System.out.println("You entered: " + input);
		
		System.out.println("Please enter something else!");
		input = keyboard.nextLine();
		System.out.println("You now entered: " + input);
		
		
	}
}
