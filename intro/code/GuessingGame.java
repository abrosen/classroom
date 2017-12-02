import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	
	public static void print5() {
		/*for(int i = 1;  i <=5; i++ ) {
			System.out.println(i);
		}*/
		
		int i = 1;
		while(i <= 5) {
			System.out.println(i);
			i++;
		}
		
		
	}
	
	

	public static void main(String[] args) {
		print5();
		Random random  = new Random();
		int secret =  random.nextInt(10)  + 1;
		Scanner kb = new Scanner(System.in);
		int score = Integer.MAX_VALUE;
		
		boolean done  = false;
		while(!done) {
			
			System.out.println("I'm thinking of a number from 1 to 10");
			System.out.println("Can you guess it?");
			int myGuess = kb.nextInt();
			
			if(myGuess == secret) {
				done = true;
				System.out.println("Hooray!");
			} else {
				score -= 1000000;
			}
			
		}
		System.out.println("My number was "  + secret );
		System.out.println("Your score was " + score);
	}

}
