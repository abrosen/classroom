import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Please enter three numbers");
        System.out.println("Enter your first number");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter your second number");

        int y = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter your third number");
        int z = Integer.parseInt(scanner.nextLine());
        System.out.println(x + y + z);

        System.out.println("Enter a line");
        String input  = scanner.nextLine();
        System.out.println(input);
    }
}
