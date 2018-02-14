package chap5;

import java.util.Scanner;

public class Shout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a word and I will shout it at you (exit to quit).  ");
		String input = kb.nextLine();
		
		while(!input.equalsIgnoreCase("exit")) {
			System.out.println(input.toUpperCase());
			input = kb.nextLine();

		}
		
		
	}

}
