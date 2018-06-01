import java.util.Scanner;

public class IsThisABigString {


    public static void main(String[] args) {
        Scanner kb  = new Scanner(System.in);
        System.out.println("Please enter some text");

        String input =  kb.nextLine();
        System.out.println("You entered: "  + input);

        if(input.length() > 15){
            System.out.println("That is a really big string!");
        } else if(input.length() > 10) {
            System.out.println("That is a big string!");
        } else if(input.length() > 7){
            System.out.println("That's kinda a big string!");
        } else {
            System.out.println("That is not a big string!");
        }

        System.out.println("Done");

    }
}
