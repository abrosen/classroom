import java.util.Scanner;

public class IfStatements {

    public static void main(String[] args) {
        boolean isRaining = false;
        boolean isGoingToRain = false;
        int  estimatedRainfall = 3;


        if(isRaining || isGoingToRain) {
            System.out.println("Bring a Raincoat!");
        } else {
            System.out.println("It'll be nice and dry");
        }

        if(isRaining && estimatedRainfall >= 3) {
            System.out.println("Bring some rainboots");
        }


        Scanner scanner =  new Scanner(System.in);

        System.out.println("Enter a score:");
        int grade =  Integer.parseInt(scanner.nextLine());
        if(grade >= 90 ){
            System.out.println("A");
        } else if(grade >= 80 ){
            System.out.println("B");
        } else if(grade >= 70 ){
            System.out.println("C");
        } else if(grade > 60 ){
            System.out.println("D");
        } else {
            System.out.println("F");
        }



    }


}
