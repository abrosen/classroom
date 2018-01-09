import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {
		/*int x;
		double d;

		for(int i = 0; i < 256; i++) {
			System.out.println(i + "\t" + (char) i); 
		
		}*/
		//          0123456789012
		
		// "something is a word"
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("You said " +  keyboard.nextLine());
		
		
		/*
		System.out.println("Enter some integer:");
		String input = keyboard.nextLine();
		int num =  Integer.parseInt(input);
		
		
		System.out.println("You said: "+ num );
		
		System.out.println("Enter something else:");
		String input2  = keyboard.nextLine();
		*/
		
		
		String s = "Hello!";
		for(int i = 0; i < s.length(); i++ ) {
			System.out.println(s.charAt(i));
		}
		System.out.println(s.toUpperCase());
	}

}
