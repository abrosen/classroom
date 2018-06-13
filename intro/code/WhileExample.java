import java.util.Scanner;

public class WhileExample {

    public static void sequence(int n) {
        while (n != 1) {
            System.out.println(n);
            if (n % 2 == 0) { // n is even
                n = n / 2;
            } else { // n is odd
                n = n * 3 + 1;
            }
        }
    }


    public static void countdown(int n) {
        while (n > 0) {
            System.out.println(n);
            n--;
        }
        System.out.println("Blastoff!");
    }


    public static void main(String[] args) {
        sequence(567);
        /*String input = "";
        Scanner scanner = new Scanner(System.in);
        while(input.length() < 10) {
            System.out.println("Please enter a word that is 10 characters or longer:");
            input = scanner.nextLine();
        }
        System.out.println(input + " is "  + input.length()  + " characters long");
        */
        System.out.println(2.0/3.0);
    }
}
