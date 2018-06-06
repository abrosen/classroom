package weekoneexamples;

import java.util.Scanner;

public class CMToInchesConverter {

    public static void main(String[] args) {
        System.out.println("This program will convert Centimeters to Inches.");
        System.out.println("Please enter the number of centimeters:");
        Scanner scanner = new Scanner(System.in);

        double centimeters =  scanner.nextDouble();
        double inches =  0.393701 * centimeters;

        System.out.println(centimeters + " cm is equal to " + inches + " inches.");


    }
}
