package operators;

import java.util.Scanner;

public class Types {
    public static void main(String[] args) {

        int x = 2;

        // Here are the operations we can do on integers!
        System.out.println("ints");
        System.out.println( 1 + x);
        System.out.println( 1 - x);
        System.out.println( 1 * x);
        System.out.println( 1 / x);
        System.out.println( 1 % x);
        x = 3;
        System.out.println(x);

        double d = 1.5;
        System.out.println("Doubles:");
        System.out.println(1 + d);
        System.out.println(1 - d);
        System.out.println(1.0 * d);
        System.out.println(1.0 / d);
        System.out.println(1.0 % d);

        char c = 'a' + 250;
        System.out.println(c);


        String word = "A word.";
        System.out.println(word.length());


        // Scanner
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter something and I will echo what you say:");
        String input  = keyboard.nextLine();
        System.out.println("You said: " + input);
        input  = keyboard.nextLine();
        System.out.println("You said: " + input);
        input  = keyboard.nextLine();
        System.out.println("You said: " + input);

        System.out.println("Enter a number:");
        int someNum = keyboard.nextInt();
        System.out.println("Your number is: " + someNum);



        // boolean b = true;
    }
}
