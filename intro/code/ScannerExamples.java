import java.util.Scanner;

public class ScannerExamples {

	public static void printLine() {
		System.out.println("***********");
	}
	
	
	public static void printName(String name, int n) {
		// 1 2 3 4 5
		// 0 1 2 3 4
		for(int i = 0; i < n; i++) {
			System.out.println(name);
		}
	}
	
	public static void main(String[] args) {
		int x = 5;
		String s = "hello!";  // totally lied there, s does NOT actually store "hello!"
		
		Scanner keyboard = new Scanner(System.in);
		
		// only use nextLine(), we'll learn how to convert strings to anything else later		
		System.out.println("Please enter your name:");
		String name = keyboard.nextLine();
		System.out.println("Your name is: " + name);
		
		System.out.println("Enter a number:");
		System.nanoTime();
		x  = keyboard.nextInt();   // "56\n"
		System.out.println("Your number is: " + x);
		printName(name, x);
		
	}

}
