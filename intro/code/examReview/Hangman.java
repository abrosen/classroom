package examReview;

import java.util.Scanner;

public class Hangman {

	private String secret;
	
	private String disguised;
	private int numGuesses;
	private int numWrong;
	
	public Hangman() {
		this.secret   = "banana";
		this.disguised= "??????";
		this.numGuesses =0;
		this.numWrong =0;
				
	}
	
	
	public void makeGuess(char c) {
		if(secret.indexOf(c)  == -1) {
			numWrong++;
		} else {
			char[] newDisguised = disguised.toCharArray();
			for(int i = 0; i < secret.length(); i++) {
				if(secret.charAt(i) == c) {
					newDisguised[i]  = c;
				}
			}
			disguised  = new String(newDisguised);
			
		}
		
		
		numGuesses++;
	}
	
	public String getDisguised() {
		return this.disguised;
	}
	
	public int getNumGuesses() {
		return this.numGuesses;
	}
	
	public int getNumWrong() {
		return this.numWrong;
	}
	
	public boolean isFound() {
		return secret.equals(disguised);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hangman game= new Hangman();
		Scanner keyboard = new Scanner(System.in);
		while(!game.isFound()) {
			System.out.println("The word is " + game.getDisguised());
			System.out.println("Enter a guess: ");
			String s =  keyboard.nextLine();
			if(s.length() != 1) {
				System.out.println("One letter, you numbskull");
			} else {
				char guess =s.charAt(0);
				game.makeGuess(guess);
			}
		}
		System.out.println(game.getDisguised());
		
	}

}
