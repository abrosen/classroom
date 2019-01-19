package arrays;

import java.util.Scanner;

public class WeatherAverage {


    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter how many days you want to record the temperature for:");
        final int NUM_DAYS=  scanner.nextInt();
        int sumOfTemps =  0;
        int minTemp =  Integer.MAX_VALUE;
        int maxTemp = Integer.MIN_VALUE;

        int[] temps = new int[NUM_DAYS];


        for (int i = 0; i < temps.length ; i++) {

            System.out.println("Enter day " + i);

            temps[i] = scanner.nextInt();
            sumOfTemps += temps[i] ;

            if(temps[i] < minTemp ) {
                minTemp = temps[i];
            }
            if(temps[i] > maxTemp){
                maxTemp = temps[i];
            }

        }

        int average =sumOfTemps/NUM_DAYS;
        System.out.println("Average temp: " + average);
        System.out.println("Highest: " + maxTemp);
        System.out.println("Lowest: " + minTemp);


        int numGreaterThanAverage = 0;
        for (int i = 0; i < temps.length; i++) {
            int temp = temps[i];
            if(temp >= average) {
                numGreaterThanAverage++;
            }
        }
        System.out.println(numGreaterThanAverage +" days greater than average.");
    }
}
