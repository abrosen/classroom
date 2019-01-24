package weekoneexamples;

import java.util.Random;
import java.util.Scanner;

public class GuessingGameOne {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;
        System.out.println("Let's play a guessing game!");
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("What do you think it is?");

        Scanner scanner =  new Scanner(System.in);
        int guess = scanner.nextInt();
        System.out.println("You guessed "  + guess);
        System.out.println("My secret number was " + secretNumber);

        /*
        int difference;
        if(secretNumber > guess) {
            difference = secretNumber -  guess;
        } else {
            difference = guess - secretNumber;
        }
        */

        //System.out.println(difference);

        int difference =  secretNumber -  guess;
        //if(difference  < 0){
        //    difference = difference * -1;
        //}


        System.out.println("You were off by " + Math.abs(difference));

    }
}
