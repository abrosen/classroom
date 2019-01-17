import java.util.Scanner;

public class WhistleWhileYouWork {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Please enter the best color.");
        String input = scanner.nextLine();

        while((input.toLowerCase()).equals("red")  == false){
            System.out.println("That's wrong.");
            System.out.println("Please enter the best color:");
            input=scanner.nextLine();

        }
        System.out.println("Yes, red is the best color!");

    }
}
